package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsw extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzst zzc;

    @Nullable
    public final String zzd;

    public zzsw(zzu zzuVar, @Nullable Throwable th2, boolean z4, int i) {
        String string = zzuVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzuVar.zzo;
        int iAbs = Math.abs(i);
        this(string2, th2, str, false, null, androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs), null);
    }

    public final /* synthetic */ zzsw zza(zzsw zzswVar) {
        return new zzsw(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzswVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzsw(zzu zzuVar, @Nullable Throwable th2, boolean z4, zzst zzstVar) {
        String str = zzstVar.zza;
        int length = str.length();
        String string = zzuVar.toString();
        this(androidx.camera.core.impl.a.p(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th2, zzuVar.zzo, false, zzstVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzsw(@Nullable String str, @Nullable Throwable th2, @Nullable String str2, boolean z4, @Nullable zzst zzstVar, @Nullable String str3, @Nullable zzsw zzswVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzstVar;
        this.zzd = str3;
    }
}
