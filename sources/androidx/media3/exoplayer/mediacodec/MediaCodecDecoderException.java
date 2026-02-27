package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(sb2.toString(), th2);
        this.codecInfo = mediaCodecInfo;
        int i = Util.SDK_INT;
        String diagnosticInfoV21 = i >= 21 ? getDiagnosticInfoV21(th2) : null;
        this.diagnosticInfo = diagnosticInfoV21;
        this.errorCode = i >= 23 ? getErrorCodeV23(th2) : Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfoV21);
    }

    @Nullable
    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }

    @RequiresApi(23)
    private static int getErrorCodeV23(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
