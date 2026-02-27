package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import dOYHB6.lN8Dz0.yf3D09;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyx implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzelm zze;
    private final ViewGroup zzf;

    @Nullable
    private zzbdd zzg;
    private final zzcyt zzh;
    private final zzfie zzi;
    private final zzday zzj;
    private final zzfdb zzk;

    @Nullable
    private S1.y zzl;
    private boolean zzm;

    @Nullable
    private com.google.android.gms.ads.internal.client.zze zzn;

    @Nullable
    private zzelx zzo;

    public zzeyx(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcgv zzcgvVar, zzeli zzeliVar, zzelm zzelmVar, zzfdb zzfdbVar, zzday zzdayVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zze = zzelmVar;
        this.zzk = zzfdbVar;
        this.zzh = zzcgvVar.zzd();
        this.zzi = zzcgvVar.zzv();
        this.zzf = new yf3D09(context);
        this.zzj = zzdayVar;
        zzfdbVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziT)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzeVar);
                }
            });
        }
        zzelx zzelxVar = this.zzo;
        if (zzelxVar != null) {
            zzelxVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, @Nullable zzelw zzelwVar, zzelx zzelxVar) throws RemoteException {
        zzcpp zzcppVarZza;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzu().zzc(true);
            }
            Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfdb zzfdbVar = this.zzk;
            zzfdbVar.zzg(str);
            zzfdbVar.zza(zzmVar);
            zzfdbVar.zzv(bundleZza);
            Context context = this.zza;
            zzfdc zzfdcVarZzz = zzfdbVar.zzz();
            zzfhr zzfhrVarB = s.b(context, zzfia.zzg(zzfdcVarZzz), 3, zzmVar);
            zzfib zzfibVarZze = null;
            if (!((Boolean) zzbeo.zzd.zze()).booleanValue() || !zzfdbVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziT)).booleanValue()) {
                    zzcpo zzcpoVarZzg = this.zzc.zzg();
                    zzcva zzcvaVar = new zzcva();
                    zzcvaVar.zza(context);
                    zzcvaVar.zzb(zzfdcVarZzz);
                    zzcpoVarZzg.zzl(zzcvaVar.zze());
                    zzdbr zzdbrVar = new zzdbr();
                    zzeli zzeliVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdbrVar.zzm(zzeliVar, executor);
                    zzdbrVar.zze(zzeliVar, executor);
                    zzcpoVarZzg.zzm(zzdbrVar.zzn());
                    zzcpoVarZzg.zzk(new zzejp(this.zzg));
                    zzcpoVarZzg.zzd(new zzdgy(zzdje.zza, null));
                    zzcpoVarZzg.zzg(new zzcqk(this.zzh, this.zzj));
                    zzcpoVarZzg.zze(new zzcoh(this.zzf));
                    zzcppVarZza = zzcpoVarZzg.zzh();
                } else {
                    zzcpo zzcpoVarZzg2 = this.zzc.zzg();
                    zzcva zzcvaVar2 = new zzcva();
                    zzcvaVar2.zza(context);
                    zzcvaVar2.zzb(zzfdcVarZzz);
                    zzcpoVarZzg2.zzl(zzcvaVar2.zze());
                    zzdbr zzdbrVar2 = new zzdbr();
                    zzeli zzeliVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbrVar2.zzm(zzeliVar2, executor2);
                    zzdbrVar2.zzf(zzeliVar2, executor2);
                    zzdbrVar2.zzf(this.zze, executor2);
                    zzdbrVar2.zzg(zzeliVar2, executor2);
                    zzdbrVar2.zzh(zzeliVar2, executor2);
                    zzdbrVar2.zza(zzeliVar2, executor2);
                    zzdbrVar2.zzb(zzeliVar2, executor2);
                    zzdbrVar2.zzc(zzeliVar2, executor2);
                    zzdbrVar2.zze(zzeliVar2, executor2);
                    zzdbrVar2.zzk(zzeliVar2, executor2);
                    zzcpoVarZzg2.zzm(zzdbrVar2.zzn());
                    zzcpoVarZzg2.zzk(new zzejp(this.zzg));
                    zzcpoVarZzg2.zzd(new zzdgy(zzdje.zza, null));
                    zzcpoVarZzg2.zzg(new zzcqk(this.zzh, this.zzj));
                    zzcpoVarZzg2.zze(new zzcoh(this.zzf));
                    zzcppVarZza = zzcpoVarZzg2.zzh();
                }
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfibVarZze = zzcppVarZza.zze();
                    zzfibVarZze.zzi(3);
                    zzfibVarZze.zzc(zzmVar.zzp);
                    zzfibVarZze.zzd(zzmVar.zzm);
                }
                this.zzo = zzelxVar;
                zzcrw zzcrwVarZzc = zzcppVarZza.zzc();
                S1.y yVarZzc = zzcrwVarZzc.zzc(zzcrwVarZzc.zzb());
                this.zzl = yVarZzc;
                zzgot.zzq(yVarZzc, new zzeyt(this, zzfibVarZze, zzfhrVarB, zzcppVarZza), this.zzb);
                return true;
            }
            zzeli zzeliVar3 = this.zzd;
            if (zzeliVar3 != null) {
                zzeliVar3.zzdN(zzfee.zzd(7, null, null));
            }
        } else if (!this.zzk.zzA()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        S1.y yVar = this.zzl;
        return (yVar == null || yVar.isDone()) ? false : true;
    }

    public final void zzc() {
        synchronized (this) {
            try {
                S1.y yVar = this.zzl;
                if (yVar != null && yVar.isDone()) {
                    try {
                        zzcok zzcokVar = (zzcok) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzcokVar.zza();
                        ViewParent parent = zzcokVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzcokVar.zzn() != null ? zzcokVar.zzn().zze() : "";
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(strZze);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            String string = sb2.toString();
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                            ((ViewGroup) parent).removeView(zzcokVar.zza());
                        }
                        zzbbz zzbbzVar = zzbci.zziT;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                            zzczi zzcziVarZzq = zzcokVar.zzq();
                            zzcziVarZzq.zza(this.zzd);
                            zzcziVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzcokVar.zza());
                        zzelx zzelxVar = this.zzo;
                        if (zzelxVar != null) {
                            zzelxVar.zzb(zzcokVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzeli zzeliVar = this.zzd;
                            Objects.requireNonNull(zzeliVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyw
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeliVar.zzg();
                                }
                            });
                        }
                        if (zzcokVar.zzh() >= 0) {
                            this.zzm = false;
                            zzcyt zzcytVar = this.zzh;
                            zzcytVar.zzd(zzcokVar.zzh());
                            zzcytVar.zze(zzcokVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcokVar.zzg());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (ExecutionException e7) {
                        e = e7;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbdd zzbddVar) {
        this.zzg = zzbddVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final zzfdb zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
    }

    public final void zzi(zzcyo zzcyoVar) {
        this.zzh.zzq(zzcyoVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdN(zzeVar);
    }

    public final /* synthetic */ zzcyt zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzfie zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzday zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
