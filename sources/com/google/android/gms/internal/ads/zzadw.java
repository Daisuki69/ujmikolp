package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadw {
    public static final zzadw zza = new zzadw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadw(long j, long j6) {
        this.zzb = j;
        this.zzc = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zzb == zzadwVar.zzb && this.zzc == zzadwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        int length = String.valueOf(j).length();
        long j6 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j6).length() + 1);
        androidx.media3.datasource.cache.c.z(sb2, "[timeUs=", j, ", position=");
        return We.s.h(j6, "]", sb2);
    }
}
