package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzss extends zzhe {
    public final int zza;

    public zzss(Throwable th2, @Nullable zzst zzstVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zzstVar == null ? null : zzstVar.zza)), th2);
        if (th2 instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
