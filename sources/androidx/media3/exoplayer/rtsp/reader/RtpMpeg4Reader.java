package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
final class RtpMpeg4Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final String TAG = "RtpMpeg4Reader";
    private int bufferFlags;
    private final RtpPayloadFormat payloadFormat;
    private int sampleLength;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    public RtpMpeg4Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static int getBufferFlagsFromVop(ParsableByteArray parsableByteArray) {
        byte[] data = parsableByteArray.getData();
        byte[] bArr = {0, 0, 1, -74};
        i.l(data, "array");
        int i = 0;
        loop0: while (true) {
            if (i >= data.length - 3) {
                i = -1;
                break;
            }
            for (int i4 = 0; i4 < 4; i4++) {
                if (data[i + i4] != bArr[i4]) {
                    break;
                }
            }
            break loop0;
            i++;
        }
        if (i != -1) {
            parsableByteArray.setPosition(i + 4);
            if ((parsableByteArray.peekUnsignedByte() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z4) {
        int nextSequenceNumber;
        Assertions.checkStateNotNull(this.trackOutput);
        int i4 = this.previousSequenceNumber;
        if (i4 != -1 && i != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i4))) {
            Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i)));
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        if (this.sampleLength == 0) {
            this.bufferFlags = getBufferFlagsFromVop(parsableByteArray);
        }
        this.sampleLength += iBytesLeft;
        if (z4) {
            if (this.firstReceivedTimestamp == C.TIME_UNSET) {
                this.firstReceivedTimestamp = j;
            }
            this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY), this.bufferFlags, this.sampleLength, 0, null);
            this.sampleLength = 0;
        }
        this.previousSequenceNumber = i;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput trackOutputTrack = extractorOutput.track(i, 2);
        this.trackOutput = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.payloadFormat.format);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j6) {
        this.firstReceivedTimestamp = j;
        this.startTimeOffsetUs = j6;
        this.sampleLength = 0;
    }
}
