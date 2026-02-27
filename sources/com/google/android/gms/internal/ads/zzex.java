package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzex implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzex(long j, long j6, long j7) {
        this.zza = j;
        this.zzb = j6;
        this.zzc = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzex)) {
            return false;
        }
        zzex zzexVar = (zzex) obj;
        return this.zza == zzexVar.zza && this.zzb == zzexVar.zzb && this.zzc == zzexVar.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        long j6 = this.zzb;
        int i = ((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        long j7 = this.zzc;
        return (i * 31) + ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j6 = this.zzb;
        int length2 = String.valueOf(j6).length();
        long j7 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j7).length());
        androidx.media3.datasource.cache.c.z(sb2, "Mp4Timestamp: creation time=", j, ", modification time=");
        sb2.append(j6);
        return androidx.media3.datasource.cache.c.j(j7, ", timescale=", sb2);
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final /* synthetic */ void zza(zzal zzalVar) {
        AbstractC1174h.a(this, zzalVar);
    }
}
