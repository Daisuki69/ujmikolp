package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdui extends zzbwg {
    final /* synthetic */ zzduk zza;

    public zzdui(zzduk zzdukVar) {
        Objects.requireNonNull(zzdukVar);
        this.zza = zzdukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() throws RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzk(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i) throws RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), zzeVar.zza);
    }
}
