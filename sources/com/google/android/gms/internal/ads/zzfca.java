package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfca extends zzbvz {
    private final zzfbw zza;
    private final zzfbn zzb;
    private final String zzc;
    private final zzfcv zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzauu zzg;
    private final zzdsm zzh;

    @Nullable
    private zzdom zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaT)).booleanValue();

    public zzfca(@Nullable String str, zzfbw zzfbwVar, Context context, zzfbn zzfbnVar, zzfcv zzfcvVar, VersionInfoParcel versionInfoParcel, zzauu zzauuVar, zzdsm zzdsmVar) {
        this.zzc = str;
        this.zza = zzfbwVar;
        this.zzb = zzfbnVar;
        this.zzd = zzfcvVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzauuVar;
        this.zzh = zzdsmVar;
    }

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar, int i) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z4 = false;
                if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlX)).booleanValue()) {
                        z4 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlY)).intValue() || !z4) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            zzfbn zzfbnVar = this.zzb;
            zzfbnVar.zzh(zzbwhVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zze) && zzmVar.zzs == null) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfbnVar.zzdN(zzfee.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfbp zzfbpVar = new zzfbp(null);
            zzfbw zzfbwVar = this.zza;
            zzfbwVar.zzj(i);
            zzfbwVar.zza(zzmVar, this.zzc, zzfbpVar, new zzfbz(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        zzx(zzmVar, zzbwhVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        zzx(zzmVar, zzbwhVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfby(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        return zzdomVar != null ? zzdomVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzh(zzbwo zzbwoVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfcv zzfcvVar = this.zzd;
        zzfcvVar.zza = zzbwoVar.zza;
        zzfcvVar.zzb = zzbwoVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        return (zzdomVar == null || zzdomVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final synchronized String zzj() throws RemoteException {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzn() == null) {
            return null;
        }
        return zzdomVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z4) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfee.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdg)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z4, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final zzbvx zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        if (zzdomVar != null) {
            return zzdomVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        zzdom zzdomVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhg)).booleanValue() && (zzdomVar = this.zzi) != null) {
            return zzdomVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzp(boolean z4) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized long zzq() {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzo() == null) {
            return 0L;
        }
        return zzdomVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzr(long j) {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzo() == null) {
            return;
        }
        zzdomVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwiVar);
    }

    public final /* synthetic */ zzfcv zzu() {
        return this.zzd;
    }

    public final /* synthetic */ zzdom zzv() {
        return this.zzi;
    }

    public final /* synthetic */ void zzw(zzdom zzdomVar) {
        this.zzi = zzdomVar;
    }
}
