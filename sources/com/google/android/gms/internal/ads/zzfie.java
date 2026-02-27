package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfie implements Runnable {

    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpz zzj;
    private final List zzk;
    private final zzcgj zzl;
    private final zzbvd zzn;

    @VisibleForTesting
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    @GuardedBy("protoLock")
    private final zzfii zzg = zzfil.zzb();
    private String zzh = "";

    @GuardedBy("initLock")
    private boolean zzm = false;

    public zzfie(Context context, VersionInfoParcel versionInfoParcel, zzdpz zzdpzVar, zzeau zzeauVar, zzbvd zzbvdVar, zzcgj zzcgjVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpzVar;
        this.zzn = zzbvdVar;
        this.zzl = zzcgjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjD)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzk();
        } else {
            this.zzk = zzgjz.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbeb.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbeb.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfii zzfiiVar = this.zzg;
                            bArrZzaN = ((zzfil) zzfiiVar.zzbu()).zzaN();
                            zzfiiVar.zzc();
                        }
                        new zzeat(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(new zzear((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjx), 60000, new HashMap(), bArrZzaN, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzdwz) && ((zzdwz) e).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfhu zzfhuVar) {
        zzbzh.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfhuVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfhu zzfhuVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjy)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmH)).booleanValue()) {
                            long j = iIntValue;
                            zzbzh.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j6 = iIntValue;
                            zzbzh.zzd.scheduleAtFixedRate(this, j6, j6, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfhuVar != null) {
            synchronized (zzc) {
                try {
                    zzfii zzfiiVar = this.zzg;
                    if (zzfiiVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjz)).intValue()) {
                        return;
                    }
                    zzfif zzfifVarZza = zzfih.zza();
                    zzfifVarZza.zzv(zzfhuVar.zzm());
                    zzfifVarZza.zza(zzfhuVar.zzb());
                    zzfifVarZza.zzb(zzfhuVar.zza());
                    zzfifVarZza.zzw(3);
                    zzfifVarZza.zzd(this.zzf.afmaVersion);
                    zzfifVarZza.zze(this.zzh);
                    zzfifVarZza.zzf(Build.VERSION.RELEASE);
                    zzfifVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfifVarZza.zzx(zzfhuVar.zzo());
                    zzfifVarZza.zzi(zzfhuVar.zzc());
                    zzfifVarZza.zzj(this.zzi);
                    zzfifVarZza.zzy(zzfhuVar.zzn());
                    zzfifVarZza.zzk(zzfhuVar.zzd());
                    zzfifVarZza.zzl(zzfhuVar.zze());
                    zzfifVarZza.zzm(zzfhuVar.zzf());
                    zzfifVarZza.zzn(this.zzj.zzd(zzfhuVar.zzf()));
                    zzfifVarZza.zzo(zzfhuVar.zzg());
                    zzfifVarZza.zzs(zzfhuVar.zzh());
                    zzfifVarZza.zzr(zzfhuVar.zzk());
                    zzfifVarZza.zzp(zzfhuVar.zzi());
                    zzfifVarZza.zzq(zzfhuVar.zzj());
                    zzfifVarZza.zzc(zzfhuVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjD)).booleanValue()) {
                        zzfifVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue()) {
                        zzcgj zzcgjVar = this.zzl;
                        zzhlz zzhlzVarZzc = zzcgjVar.zzc();
                        String strZzb = zzcgjVar.zzb();
                        if (zzhlzVarZzc != null) {
                            zzfifVarZza.zzt(zzhlzVarZzc);
                        }
                        if (strZzb != null) {
                            zzfifVarZza.zzu(strZzb);
                        }
                    }
                    zzfij zzfijVarZza = zzfik.zza();
                    zzfijVarZza.zza(zzfifVarZza);
                    zzfiiVar.zzb(zzfijVarZza);
                } finally {
                }
            }
        }
    }
}
