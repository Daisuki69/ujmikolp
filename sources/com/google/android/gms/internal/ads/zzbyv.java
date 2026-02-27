package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyv {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbyz zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;

    @Nullable
    private zzbcn zzh;

    @Nullable
    private zzdsm zzi;

    @Nullable
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzbyu zzm;
    private final Object zzn;

    @GuardedBy("grantedPermissionLock")
    private S1.y zzo;
    private final AtomicBoolean zzp;

    public zzbyv() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbyz(com.google.android.gms.ads.internal.client.zzbb.zzc(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzbyu(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final /* synthetic */ zzbcn zzA() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzB() {
        return this.zzp;
    }

    @Nullable
    public final zzbcn zza() {
        zzbcn zzbcnVar;
        synchronized (this.zza) {
            zzbcnVar = this.zzh;
        }
        return zzbcnVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    @TargetApi(23)
    public final void zze(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzdsm zzdsmVar) {
        zzbcn zzbcnVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbtt.zzb(this.zze, this.zzf);
                    this.zzi = zzdsmVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzck)).booleanValue()) {
                        zzbcnVar = new zzbcn();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbcnVar = null;
                    }
                    this.zzh = zzbcnVar;
                    if (zzbcnVar != null) {
                        zzbzk.zza(new zzbyr(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjg)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbys(this));
                            } catch (RuntimeException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    @Nullable
    public final Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlI)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zzg(Throwable th2, String str) {
        zzbtt.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzh(Throwable th2, String str) {
        zzbtt.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzber.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th2, String str) {
        zzbtt.zzd(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    @Nullable
    public final Context zzp() {
        return this.zze;
    }

    public final S1.y zzq() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdn)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        S1.y yVar = this.zzo;
                        if (yVar != null) {
                            return yVar;
                        }
                        S1.y yVarZzc = zzbzh.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyt
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzw();
                            }
                        });
                        this.zzo = yVarZzc;
                        return yVarZzc;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return zzgot.zza(new ArrayList());
    }

    public final zzbyz zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjg)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdsm zzv() {
        return this.zzi;
    }

    public final /* synthetic */ ArrayList zzw() {
        Context contextZza = zzbvf.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzx() {
        return this.zza;
    }

    public final /* synthetic */ Context zzy() {
        return this.zze;
    }

    public final /* synthetic */ VersionInfoParcel zzz() {
        return this.zzf;
    }
}
