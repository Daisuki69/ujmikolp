package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelm implements com.google.android.gms.ads.internal.client.zza, zzddz {
    private com.google.android.gms.ads.internal.client.zzbh zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zza = zzbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdV() {
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdz() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
