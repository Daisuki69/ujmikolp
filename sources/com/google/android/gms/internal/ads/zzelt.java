package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelt {
    private final zzely zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzea zzc;

    public zzelt(zzely zzelyVar, String str) {
        this.zza = zzelyVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zzc = null;
        zzelz zzelzVar = new zzelz(i);
        zzels zzelsVar = new zzels(this);
        this.zza.zza(zzmVar, this.zzb, zzelzVar, zzelsVar);
    }

    @Nullable
    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    @Nullable
    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    public final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzc = zzeaVar;
    }
}
