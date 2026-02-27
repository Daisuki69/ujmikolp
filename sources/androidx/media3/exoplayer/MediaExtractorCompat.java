package androidx.media3.exoplayer;

import O1.AbstractC0529x;
import O1.S;
import O1.t0;
import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final String TAG = "MediaExtractorCompat";
    private final Allocator allocator;

    @Nullable
    private DataSource currentDataSource;

    @Nullable
    private Extractor currentExtractor;

    @Nullable
    private ExtractorInput currentExtractorInput;
    private final DataSource.Factory dataSourceFactory;
    private final ExtractorsFactory extractorsFactory;
    private final FormatHolder formatHolder;
    private boolean hasBeenPrepared;
    private final DecoderInputBuffer noDataBuffer;
    private long offsetInCurrentFile;

    @Nullable
    private SeekPoint pendingSeek;
    private final PositionHolder positionHolder;
    private final DecoderInputBuffer sampleHolder;
    private final SparseArray<MediaExtractorSampleQueue> sampleQueues;

    @Nullable
    private SeekMap seekMap;
    private final Set<Integer> selectedTrackIndices;
    private final ArrayDeque<Integer> trackIndicesPerSampleInQueuedOrder;
    private final ArrayList<MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    public final class ExtractorOutputImpl implements ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            MediaExtractorCompat.this.seekMap = seekMap;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i, int i4) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = (MediaExtractorSampleQueue) MediaExtractorCompat.this.sampleQueues.get(i);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (MediaExtractorCompat.this.tracksEnded) {
                return new DiscardingTrackOutput();
            }
            MediaExtractorCompat mediaExtractorCompat = MediaExtractorCompat.this;
            MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i);
            MediaExtractorCompat.this.sampleQueues.put(i, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    public final class MediaExtractorSampleQueue extends SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public final int trackId;

        public MediaExtractorSampleQueue(Allocator allocator, int i) {
            super(allocator, null, null);
            this.trackId = i;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            if (getUpstreamFormat() == null) {
                MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i4, int i6, @Nullable TrackOutput.CryptoData cryptoData) {
            int i10 = i & (-536870913);
            if (this.compatibilityTrackIndex != -1) {
                MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.compatibilityTrackIndex));
            }
            Assertions.checkState(this.mainTrackIndex != -1);
            MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.mainTrackIndex));
            super.sampleMetadata(j, i10, i4, i6, cryptoData);
        }

        public void setCompatibilityTrackIndex(int i) {
            this.compatibilityTrackIndex = i;
        }

        public void setMainTrackIndex(int i) {
            this.mainTrackIndex = i;
        }

        public String toString() {
            int i = this.trackId;
            int i4 = this.mainTrackIndex;
            int i6 = this.compatibilityTrackIndex;
            StringBuilder sbU = We.s.u("trackId: ", i, ", mainTrackIndex: ", i4, ", compatibilityTrackIndex: ");
            sbU.append(i6);
            return sbU.toString();
        }
    }

    public static final class MediaExtractorTrack {

        @Nullable
        public final String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final MediaExtractorSampleQueue sampleQueue;

        public MediaFormat createDownstreamMediaFormat(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat((Format) Assertions.checkNotNull(formatHolder.format));
            formatHolder.clear();
            if (this.compatibilityTrackMimeType != null) {
                if (Util.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public String toString() {
            return "MediaExtractorSampleQueue: " + this.sampleQueue + ", isCompatibilityTrack: " + this.isCompatibilityTrack + ", compatibilityTrackMimeType: " + this.compatibilityTrackMimeType;
        }

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z4, @Nullable String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z4;
            this.compatibilityTrackMimeType = str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        this(new DefaultExtractorsFactory(), new DefaultDataSource.Factory(context));
    }

    private boolean advanceToSampleOrEndOfInput() {
        int i;
        try {
            maybeResolvePendingSeek();
            boolean z4 = false;
            while (true) {
                if (this.trackIndicesPerSampleInQueuedOrder.isEmpty()) {
                    if (z4) {
                        return false;
                    }
                    try {
                        i = ((Extractor) Assertions.checkNotNull(this.currentExtractor)).read((ExtractorInput) Assertions.checkNotNull(this.currentExtractorInput), this.positionHolder);
                    } catch (Exception | OutOfMemoryError e) {
                        Log.w(TAG, "Treating exception as the end of input.", e);
                    }
                    if (i == -1) {
                        z4 = true;
                    } else if (i == 1) {
                        this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(this.trackIndicesPerSampleInQueuedOrder.peekFirst())) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e7) {
            Log.w(TAG, "Treating exception as the end of input.", e7);
            return false;
        }
    }

    private static DataSpec buildDataSpec(Uri uri, long j) {
        return new DataSpec.Builder().setUri(uri).setPosition(j).setFlags(6).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$selectExtractor$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    private void maybeResolvePendingSeek() throws IOException {
        SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        SeekPoint seekPoint2 = (SeekPoint) Assertions.checkNotNull(seekPoint);
        ((Extractor) Assertions.checkNotNull(this.currentExtractor)).seek(seekPoint2.position, seekPoint2.timeUs);
        this.currentExtractorInput = reopenCurrentDataSource(seekPoint2.position);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(MediaExtractorSampleQueue mediaExtractorSampleQueue, Format format) {
        boolean z4 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        Object[] objArr = 0;
        this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, z4, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(DecoderInputBuffer decoderInputBuffer, boolean z4) {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(((Integer) Assertions.checkNotNull(this.trackIndicesPerSampleInQueuedOrder.peekFirst())).intValue());
        MediaExtractorSampleQueue mediaExtractorSampleQueue = mediaExtractorTrack.sampleQueue;
        int i = (z4 ? 4 : 0) | 1;
        int i4 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i, false);
        if (i4 == -5) {
            i4 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i, false);
        }
        this.formatHolder.clear();
        if (i4 != -4) {
            throw new IllegalStateException(Util.formatInvariant("Sample read result: %s\nTrack sample: %s\nTrackIndicesPerSampleInQueuedOrder: %s\nTracks added: %s\n", Integer.valueOf(i4), mediaExtractorTrack, this.trackIndicesPerSampleInQueuedOrder, this.tracks));
        }
    }

    private ExtractorInput reopenCurrentDataSource(long j) throws IOException {
        DataSource dataSource = (DataSource) Assertions.checkNotNull(this.currentDataSource);
        Uri uri = (Uri) Assertions.checkNotNull(dataSource.getUri());
        DataSourceUtil.closeQuietly(dataSource);
        long jOpen = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j));
        if (jOpen != -1) {
            jOpen += j;
        }
        return new DefaultExtractorInput(dataSource, j, jOpen);
    }

    private Extractor selectExtractor(ExtractorInput extractorInput) throws IOException {
        Extractor extractor;
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors();
        int length = extractorArrCreateExtractors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                extractor = null;
                break;
            }
            extractor = extractorArrCreateExtractors[i];
            try {
                if (extractor.sniff(extractorInput)) {
                    extractorInput.resetPeekPosition();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                extractorInput.resetPeekPosition();
                throw th2;
            }
            extractorInput.resetPeekPosition();
            i++;
        }
        if (extractor != null) {
            return extractor;
        }
        throw new UnrecognizedInputFormatException("None of the available extractors (" + new N1.h(", ").b(AbstractC0529x.z(S.l(extractorArrCreateExtractors), new u(2))) + ") could read the stream.", (Uri) Assertions.checkNotNull(((DataSource) Assertions.checkNotNull(this.currentDataSource)).getUri()), t0.e);
    }

    private void skipOneSample() {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.trackIndicesPerSampleInQueuedOrder.removeFirst().intValue());
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    @VisibleForTesting(otherwise = 5)
    public Allocator getAllocator() {
        return this.allocator;
    }

    public int getSampleFlags() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return (this.noDataBuffer.isEncrypted() ? 2 : 0) | (this.noDataBuffer.isKeyFrame() ? 1 : 0);
    }

    public long getSampleTime() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return this.noDataBuffer.timeUs;
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.trackIndicesPerSampleInQueuedOrder.peekFirst().intValue();
        }
        return -1;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public MediaFormat getTrackFormat(int i) {
        return this.tracks.get(i).createDownstreamMediaFormat(this.formatHolder, this.noDataBuffer);
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i);
        byteBuffer.limit(byteBuffer.capacity());
        DecoderInputBuffer decoderInputBuffer = this.sampleHolder;
        decoderInputBuffer.data = byteBuffer;
        peekNextSelectedTrackSample(decoderInputBuffer, false);
        byteBuffer.flip();
        byteBuffer.position(i);
        this.sampleHolder.data = null;
        return byteBuffer.remaining();
    }

    public void release() {
        for (int i = 0; i < this.sampleQueues.size(); i++) {
            this.sampleQueues.valueAt(i).release();
        }
        this.sampleQueues.clear();
        Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            extractor.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void seekTo(long r6, int r8) {
        /*
            r5 = this;
            androidx.media3.extractor.SeekMap r0 = r5.seekMap
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set<java.lang.Integer> r0 = r5.selectedTrackIndices
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L37
            androidx.media3.extractor.Extractor r0 = r5.currentExtractor
            boolean r2 = r0 instanceof androidx.media3.extractor.mp4.Mp4Extractor
            if (r2 == 0) goto L37
            androidx.media3.extractor.mp4.Mp4Extractor r0 = (androidx.media3.extractor.mp4.Mp4Extractor) r0
            java.util.ArrayList<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorTrack> r2 = r5.tracks
            java.util.Set<java.lang.Integer> r3 = r5.selectedTrackIndices
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.get(r3)
            androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorTrack r2 = (androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack) r2
            int r2 = r2.getIdOfBackingTrack()
            androidx.media3.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r6, r2)
            goto L3d
        L37:
            androidx.media3.extractor.SeekMap r0 = r5.seekMap
            androidx.media3.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r6)
        L3d:
            if (r8 == 0) goto L6a
            if (r8 == r1) goto L67
            r1 = 2
            if (r8 != r1) goto L61
            androidx.media3.extractor.SeekPoint r8 = r0.second
            long r1 = r8.timeUs
            long r1 = r6 - r1
            long r1 = java.lang.Math.abs(r1)
            androidx.media3.extractor.SeekPoint r8 = r0.first
            long r3 = r8.timeUs
            long r6 = r6 - r3
            long r6 = java.lang.Math.abs(r6)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5e
            androidx.media3.extractor.SeekPoint r6 = r0.second
            goto L6c
        L5e:
            androidx.media3.extractor.SeekPoint r6 = r0.first
            goto L6c
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L67:
            androidx.media3.extractor.SeekPoint r6 = r0.second
            goto L6c
        L6a:
            androidx.media3.extractor.SeekPoint r6 = r0.first
        L6c:
            java.util.ArrayDeque<java.lang.Integer> r7 = r5.trackIndicesPerSampleInQueuedOrder
            r7.clear()
            r7 = 0
        L72:
            android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue> r8 = r5.sampleQueues
            int r8 = r8.size()
            if (r7 >= r8) goto L88
            android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue> r8 = r5.sampleQueues
            java.lang.Object r8 = r8.valueAt(r7)
            androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue r8 = (androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue) r8
            r8.reset()
            int r7 = r7 + 1
            goto L72
        L88:
            r5.pendingSeek = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaExtractorCompat.seekTo(long, int):void");
    }

    public void selectTrack(int i) {
        this.selectedTrackIndices.add(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDataSource(Uri uri, long j) throws IOException {
        int i;
        Assertions.checkState(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = j;
        DataSpec dataSpecBuildDataSpec = buildDataSpec(uri, j);
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        this.currentDataSource = dataSourceCreateDataSource;
        ExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.currentDataSource, 0L, dataSourceCreateDataSource.open(dataSpecBuildDataSpec));
        Extractor extractorSelectExtractor = selectExtractor(defaultExtractorInput);
        Throwable th2 = null;
        extractorSelectExtractor.init(new ExtractorOutputImpl());
        boolean z4 = true;
        while (z4) {
            try {
                i = extractorSelectExtractor.read(defaultExtractorInput, this.positionHolder);
            } catch (Exception | OutOfMemoryError e) {
                th2 = e;
                i = -1;
            }
            boolean z5 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (th2 != null || (z5 && i == -1)) {
                release();
                throw ParserException.createForMalformedContainer(th2 != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", th2);
            }
            if (i == 1) {
                defaultExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
            }
            z4 = z5;
        }
        this.currentExtractorInput = defaultExtractorInput;
        this.currentExtractor = extractorSelectExtractor;
    }

    public void unselectTrack(int i) {
        this.selectedTrackIndices.remove(Integer.valueOf(i));
    }

    public MediaExtractorCompat(ExtractorsFactory extractorsFactory, DataSource.Factory factory) {
        this.extractorsFactory = extractorsFactory;
        this.dataSourceFactory = factory;
        this.positionHolder = new PositionHolder();
        this.allocator = new DefaultAllocator(true, 65536);
        this.tracks = new ArrayList<>();
        this.sampleQueues = new SparseArray<>();
        this.trackIndicesPerSampleInQueuedOrder = new ArrayDeque<>();
        this.formatHolder = new FormatHolder();
        this.sampleHolder = new DecoderInputBuffer(0);
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.selectedTrackIndices = new HashSet();
    }
}
