package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes2.dex */
final class RtpAmrReader implements RtpPayloadReader {
    private static final int[] AMR_NB_FRAME_TYPE_INDEX_TO_FRAME_SIZE = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] AMR_WB_FRAME_TYPE_INDEX_TO_FRAME_SIZE = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final String TAG = "RtpAmrReader";
    private final boolean isWideBand;
    private final RtpPayloadFormat payloadFormat;
    private final int sampleRate;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;
    private long startTimeOffsetUs = 0;

    public RtpAmrReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
        this.isWideBand = MimeTypes.AUDIO_AMR_WB.equals(Assertions.checkNotNull(rtpPayloadFormat.format.sampleMimeType));
        this.sampleRate = rtpPayloadFormat.clockRate;
    }

    public static int getFrameSize(int i, boolean z4) {
        boolean z5 = (i >= 0 && i <= 8) || i == 15;
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(z4 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i);
        Assertions.checkArgument(z5, sb2.toString());
        return z4 ? AMR_WB_FRAME_TYPE_INDEX_TO_FRAME_SIZE[i] : AMR_NB_FRAME_TYPE_INDEX_TO_FRAME_SIZE[i];
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z4) {
        int nextSequenceNumber;
        Assertions.checkStateNotNull(this.trackOutput);
        int i4 = this.previousSequenceNumber;
        if (i4 != -1 && i != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i4))) {
            Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i)));
        }
        parsableByteArray.skipBytes(1);
        int frameSize = getFrameSize((parsableByteArray.peekUnsignedByte() >> 3) & 15, this.isWideBand);
        int iBytesLeft = parsableByteArray.bytesLeft();
        Assertions.checkArgument(iBytesLeft == frameSize, "compound payload not supported currently");
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp, this.sampleRate), 1, iBytesLeft, 0, null);
        this.previousSequenceNumber = i;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput trackOutputTrack = extractorOutput.track(i, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
        this.firstReceivedTimestamp = j;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j6) {
        this.firstReceivedTimestamp = j;
        this.startTimeOffsetUs = j6;
    }
}
