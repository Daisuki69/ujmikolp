package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdni extends zzbhp {

    @Nullable
    private final String zza;
    private final zzdip zzb;
    private final zzdiu zzc;
    private final zzdsm zzd;

    public zzdni(@Nullable String str, zzdip zzdipVar, zzdiu zzdiuVar, zzdsm zzdsmVar) {
        this.zza = str;
        this.zzb = zzdipVar;
        this.zzc = zzdiuVar;
        this.zzd = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzA() throws RemoteException {
        zzdiu zzdiuVar = this.zzc;
        return (zzdiuVar.zzE().isEmpty() || zzdiuVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzB(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        this.zzb.zzA(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        this.zzb.zzB(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbft zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhg)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzJ(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznO)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final long zzK() {
        zzdip zzdipVar = this.zzb;
        if (zzdipVar == null || zzdipVar.zzo() == null) {
            return 0L;
        }
        return zzdipVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzL(long j) {
        zzdip zzdipVar = this.zzb;
        if (zzdipVar == null || zzdipVar.zzo() == null) {
            return;
        }
        zzdipVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfw zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfp zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzx(zzbhn zzbhnVar) throws RemoteException {
        this.zzb.zzy(zzbhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
