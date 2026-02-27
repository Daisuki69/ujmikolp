package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzvc extends zzyh {
    private final zzbf zza;

    public zzvc(zzyf zzyfVar, zzbf zzbfVar) {
        super(zzyfVar);
        this.zza = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final boolean equals(@Nullable Object obj) {
        if (super.equals(obj) && (obj instanceof zzvc)) {
            return this.zza.equals(((zzvc) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyh, com.google.android.gms.internal.ads.zzyk
    public final zzbf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyh, com.google.android.gms.internal.ads.zzyk
    public final zzu zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzyh, com.google.android.gms.internal.ads.zzyf
    public final zzu zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
