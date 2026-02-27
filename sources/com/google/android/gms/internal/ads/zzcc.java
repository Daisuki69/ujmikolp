package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcc {
    public static final zzcc zza = new zzcc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcc(int i, int i4, int i6) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i6;
        this.zze = zzeo.zzA(i6) ? zzeo.zzE(i6) * i4 : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        return this.zzb == zzccVar.zzb && this.zzc == zzccVar.zzc && this.zzd == zzccVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i4 = this.zzc;
        int length2 = String.valueOf(i4).length();
        int i6 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i6).length() + 1);
        androidx.media3.datasource.cache.c.y(sb2, "AudioFormat[sampleRate=", i, ", channelCount=", i4);
        return androidx.media3.datasource.cache.c.m(sb2, ", encoding=", i6, "]");
    }
}
