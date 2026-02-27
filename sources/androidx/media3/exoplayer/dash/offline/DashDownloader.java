package androidx.media3.exoplayer.dash.offline;

import O1.y0;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.a;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new a(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addSegmentsForAdaptationSet(androidx.media3.datasource.DataSource r23, androidx.media3.exoplayer.dash.manifest.AdaptationSet r24, long r25, long r27, boolean r29, java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> r30) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r7 = r24
            r8 = r29
            r9 = r30
            r0 = 0
            r10 = r0
        La:
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> r0 = r7.representations
            int r0 = r0.size()
            if (r10 >= r0) goto Laf
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> r0 = r7.representations
            java.lang.Object r0 = r0.get(r10)
            r2 = r0
            androidx.media3.exoplayer.dash.manifest.Representation r2 = (androidx.media3.exoplayer.dash.manifest.Representation) r2
            int r0 = r7.type     // Catch: java.io.IOException -> La2
            r11 = r23
            androidx.media3.exoplayer.dash.DashSegmentIndex r0 = r1.getSegmentIndex(r11, r0, r2, r8)     // Catch: java.io.IOException -> L9e
            if (r0 == 0) goto L92
            r12 = r27
            long r14 = r0.getSegmentCount(r12)
            r3 = -1
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 == 0) goto L8a
            androidx.media3.exoplayer.dash.BaseUrlExclusionList r3 = r1.baseUrlExclusionList
            O1.S r4 = r2.baseUrls
            androidx.media3.exoplayer.dash.manifest.BaseUrl r3 = r3.selectBaseUrl(r4)
            java.lang.Object r3 = androidx.media3.common.util.Util.castNonNull(r3)
            androidx.media3.exoplayer.dash.manifest.BaseUrl r3 = (androidx.media3.exoplayer.dash.manifest.BaseUrl) r3
            java.lang.String r3 = r3.url
            androidx.media3.exoplayer.dash.manifest.RangedUri r6 = r2.getInitializationUri()
            if (r6 == 0) goto L50
            r4 = r25
            androidx.media3.exoplayer.offline.SegmentDownloader$Segment r6 = r1.createSegment(r2, r3, r4, r6)
            r9.add(r6)
        L50:
            androidx.media3.exoplayer.dash.manifest.RangedUri r6 = r2.getIndexUri()
            if (r6 == 0) goto L61
            r1 = r22
            r4 = r25
            androidx.media3.exoplayer.offline.SegmentDownloader$Segment r6 = r1.createSegment(r2, r3, r4, r6)
            r9.add(r6)
        L61:
            long r4 = r0.getFirstSegmentNum()
            long r14 = r14 + r4
            r16 = 1
            long r14 = r14 - r16
        L6a:
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 > 0) goto La8
            long r18 = r0.getTimeUs(r4)
            long r18 = r18 + r25
            androidx.media3.exoplayer.dash.manifest.RangedUri r6 = r0.getSegmentUrl(r4)
            r20 = r18
            r18 = r4
            r4 = r20
            r1 = r22
            androidx.media3.exoplayer.offline.SegmentDownloader$Segment r4 = r1.createSegment(r2, r3, r4, r6)
            r9.add(r4)
            long r4 = r18 + r16
            goto L6a
        L8a:
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        L92:
            r12 = r27
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException     // Catch: java.io.IOException -> L9c
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> L9c
            throw r0     // Catch: java.io.IOException -> L9c
        L9c:
            r0 = move-exception
            goto La6
        L9e:
            r0 = move-exception
        L9f:
            r12 = r27
            goto La6
        La2:
            r0 = move-exception
            r11 = r23
            goto L9f
        La6:
            if (r8 == 0) goto Lae
        La8:
            int r10 = r10 + 1
            r1 = r22
            goto La
        Lae:
            throw r0
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.offline.DashDownloader.addSegmentsForAdaptationSet(androidx.media3.datasource.DataSource, androidx.media3.exoplayer.dash.manifest.AdaptationSet, long, long, boolean, java.util.ArrayList):void");
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j, DashUtil.buildDataSpec(representation, str, rangedUri, 0, y0.f4618g));
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i, final Representation representation, boolean z4) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i, representation);
            }
        }, z4);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z4) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i4 = 0; i4 < list.size(); i4++) {
                addSegmentsForAdaptationSet(dataSource, list.get(i4), jMsToUs, periodDurationUs, z4, arrayList);
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j) {
        super(mediaItem, parser, factory, executor, j);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
