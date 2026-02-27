package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpy extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzpy(int i, int i4, int i6, int i10, int i11, zzu zzuVar, boolean z4, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzuVar);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i6).length();
        int length4 = String.valueOf(i10).length();
        int length5 = String.valueOf(i11).length();
        int length6 = strValueOf.length();
        int i12 = length + 31 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2;
        String str = true != z4 ? "" : " (recoverable)";
        StringBuilder sb2 = new StringBuilder(str.length() + i12 + length6);
        androidx.media3.datasource.cache.c.y(sb2, "AudioTrack init failed ", i, " Config(", i4);
        androidx.media3.datasource.cache.c.y(sb2, ", ", i6, ", ", i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(") ");
        sb2.append(strValueOf);
        sb2.append(str);
        super(sb2.toString(), exc);
        this.zza = i;
        this.zzb = z4;
    }
}
