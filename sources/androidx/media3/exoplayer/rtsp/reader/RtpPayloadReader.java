package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface RtpPayloadReader {

    public interface Factory {
        RtpPayloadReader createPayloadReader(RtpPayloadFormat rtpPayloadFormat);
    }

    void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z4) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, int i);

    void onReceivingFirstPacket(long j, int i);

    void seek(long j, long j6);
}
