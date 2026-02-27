package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlt {
    public static final zzlt zza;
    public static final zzlt zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlt zzltVar = new zzlt(0L, 0L);
        zza = zzltVar;
        new zzlt(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlt(Long.MAX_VALUE, 0L);
        new zzlt(0L, Long.MAX_VALUE);
        zzb = zzltVar;
    }

    public zzlt(long j, long j6) {
        zzghc.zza(j >= 0);
        zzghc.zza(j6 >= 0);
        this.zzc = j;
        this.zzd = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlt.class == obj.getClass()) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zzc == zzltVar.zzc && this.zzd == zzltVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
