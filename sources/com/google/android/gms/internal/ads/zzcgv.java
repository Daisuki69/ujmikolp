package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcgv implements zzckv {
    private static zzcgv zza;

    private static synchronized zzcgv zzF(Context context, zzbox zzboxVar, int i, boolean z4, int i4, zzcid zzcidVar) {
        try {
            zzcgv zzcgvVar = zza;
            if (zzcgvVar != null) {
                return zzcgvVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbci.zza(context);
            if (((Boolean) zzbea.zze.zze()).booleanValue()) {
                zzbbt.zza(context);
            }
            zzfdy zzfdyVarZza = zzfdy.zza(context);
            VersionInfoParcel versionInfoParcelZzb = zzfdyVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i4);
            zzfdyVarZza.zzc(zzboxVar);
            zzcis zzcisVar = new zzcis(null);
            zzcgw zzcgwVar = new zzcgw();
            zzcgwVar.zza(versionInfoParcelZzb);
            zzcgwVar.zzb(context);
            zzcgwVar.zzc(jCurrentTimeMillis);
            zzcisVar.zza(new zzcgx(zzcgwVar, null));
            zzcisVar.zzb(new zzcjl(zzcidVar));
            zzcgv zzcgvVarZzc = zzcisVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzot)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfgc.zzc(), zzcgvVarZzc.zzB());
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzdwx) ((zzcih) zzcgvVarZzc).zzo.zzb()).zza();
            ((zzcgr) ((zzcih) zzcgvVarZzc).zzn.zzb()).zza();
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, versionInfoParcelZzb, zzcgvVarZzc.zzB());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoJ)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoK);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcgvVarZzc.zzC().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoI)).booleanValue()) {
                    zzcgvVarZzc.zzC().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcih) zzcgvVarZzc).zzan.zzb()).zza();
            zzbxs.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaN)).booleanValue()) {
                    new zzecb(context, versionInfoParcelZzb, new zzbbh(new zzbbm(context)), new zzebg(new zzebc(context), (zzgpd) ((zzcih) zzcgvVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            zza = zzcgvVarZzc;
            return zzcgvVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static zzcgv zza(Context context, zzbox zzboxVar, int i) {
        return zzF(context, zzboxVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcid());
    }

    public abstract zzdwp zzA();

    public abstract zzdsm zzB();

    public abstract zzdpu zzC();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzbyl zzD() {
        return zzE();
    }

    public abstract zzbyl zzE();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzcyt zzd();

    public abstract zzcjw zze();

    public abstract zzfki zzf();

    public abstract zzcpo zzg();

    public abstract zzeyz zzh();

    public abstract zzcnx zzi();

    public abstract zzexm zzj();

    public abstract zzdgg zzk();

    public abstract zzfap zzl();

    public abstract zzdhc zzm();

    public abstract zzdoq zzn();

    public abstract zzfcc zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzr();

    public abstract zzecy zzs();

    public abstract zzfeb zzt();

    public abstract zzdvs zzu();

    public abstract zzfie zzv();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzevr zzw(zzbuv zzbuvVar, int i) {
        return zzx(new zzewu(zzbuvVar, i));
    }

    public abstract zzevr zzx(zzewu zzewuVar);

    public abstract zzdud zzy();

    public abstract zzfds zzz();
}
