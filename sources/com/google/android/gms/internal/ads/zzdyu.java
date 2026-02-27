package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyu extends zzbum {
    private final zzbzm zza;
    private final zzbuv zzb;

    public zzdyu(zzbzm zzbzmVar, zzbuv zzbuvVar) {
        this.zza = zzbzmVar;
        this.zzb = zzbuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) {
        this.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuvVar));
    }
}
