package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzago implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzago(long j, long j6, long j7, long j9, long j10) {
        this.zza = j;
        this.zzb = j6;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.zza == zzagoVar.zza && this.zzb == zzagoVar.zzb && this.zzc == zzagoVar.zzc && this.zzd == zzagoVar.zzd && this.zze == zzagoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        long j6 = this.zzb;
        int i = ((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        long j7 = this.zzc;
        int i4 = (i * 31) + ((int) (j7 ^ (j7 >>> 32)));
        long j9 = this.zzd;
        int i6 = (i4 * 31) + ((int) (j9 ^ (j9 >>> 32)));
        long j10 = this.zze;
        return (i6 * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j6 = this.zzb;
        int length2 = String.valueOf(j6).length();
        long j7 = this.zzc;
        int length3 = String.valueOf(j7).length();
        long j9 = this.zzd;
        int length4 = String.valueOf(j9).length();
        long j10 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j10).length());
        androidx.media3.datasource.cache.c.z(sb2, "Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        sb2.append(j6);
        androidx.media3.datasource.cache.c.z(sb2, ", photoPresentationTimestampUs=", j7, ", videoStartPosition=");
        sb2.append(j9);
        return androidx.media3.datasource.cache.c.j(j10, ", videoSize=", sb2);
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final /* synthetic */ void zza(zzal zzalVar) {
        AbstractC1174h.a(this, zzalVar);
    }
}
