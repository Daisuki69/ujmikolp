package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcof extends zzbaa {
    private final zzcoe zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzeyj zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaW)).booleanValue();
    private final zzdsm zze;

    public zzcof(zzcoe zzcoeVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzeyj zzeyjVar, zzdsm zzdsmVar) {
        this.zza = zzcoeVar;
        this.zzb = zzbxVar;
        this.zzc = zzeyjVar;
        this.zze = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzf(IObjectWrapper iObjectWrapper, zzbai zzbaiVar) {
        try {
            this.zzc.zzp(zzbaiVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbaiVar, this.zzd);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhg)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzh(boolean z4) {
        this.zzd = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    @Nullable
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzk() {
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar == null || zzcoeVar.zzo() == null) {
            return 0L;
        }
        return zzcoeVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzl(long j) {
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar == null || zzcoeVar.zzo() == null) {
            return;
        }
        zzcoeVar.zzo().zzb(j);
    }
}
