package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyt extends zzbum {
    final /* synthetic */ zzdyv zza;

    public zzdyt(zzdyv zzdyvVar) {
        Objects.requireNonNull(zzdyvVar);
        this.zza = zzdyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdyv zzdyvVar = this.zza;
        zzdyvVar.zza.zzc(new zzdzl(autoCloseInputStream, zzdyvVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) {
        this.zza.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuvVar));
    }
}
