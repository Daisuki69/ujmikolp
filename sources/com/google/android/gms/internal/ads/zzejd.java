package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public class zzejd extends zzbpc {
    private final zzcvq zza;
    private final zzddx zzb;
    private final zzcwk zzc;
    private final zzcwz zzd;
    private final zzcxe zze;
    private final zzdaw zzf;
    private final zzcyd zzg;
    private final zzdev zzh;
    private final zzdas zzi;
    private final zzcwf zzj;

    public zzejd(zzcvq zzcvqVar, zzddx zzddxVar, zzcwk zzcwkVar, zzcwz zzcwzVar, zzcxe zzcxeVar, zzdaw zzdawVar, zzcyd zzcydVar, zzdev zzdevVar, zzdas zzdasVar, zzcwf zzcwfVar) {
        this.zza = zzcvqVar;
        this.zzb = zzddxVar;
        this.zzc = zzcwkVar;
        this.zzd = zzcwzVar;
        this.zze = zzcxeVar;
        this.zzf = zzdawVar;
        this.zzg = zzcydVar;
        this.zzh = zzdevVar;
        this.zzi = zzdasVar;
        this.zzj = zzcwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdz();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() {
        this.zzg.zzdY(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzm(zzbgq zzbgqVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzbvt zzbvtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzbvx zzbvxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfee.zzc(8, zzeVar));
    }

    public void zzz() throws RemoteException {
    }
}
