package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekl extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzelt zza;

    public zzekl(Context context, zzcgv zzcgvVar, zzfdb zzfdbVar, zzdje zzdjeVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzelv zzelvVar = new zzelv(zzdjeVar, zzcgvVar.zzB());
        zzelvVar.zza(zzbkVar);
        this.zza = new zzelt(new zzemf(zzcgvVar, context, zzelvVar, zzfdbVar), zzfdbVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zza.zzb(zzmVar, i);
    }
}
