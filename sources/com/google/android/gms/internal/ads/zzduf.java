package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzduf extends com.google.android.gms.ads.internal.client.zzbj {
    final /* synthetic */ zzdtz zza;
    final /* synthetic */ zzdug zzb;

    public zzduf(zzdug zzdugVar, zzdtz zzdtzVar) {
        this.zza = zzdtzVar;
        Objects.requireNonNull(zzdugVar);
        this.zzb = zzdugVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() throws RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() throws RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() throws RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() throws RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
    }
}
