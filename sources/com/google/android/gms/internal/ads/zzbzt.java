package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class zzbzt {
    private final zzbzm zza;
    private final AtomicInteger zzb;

    public zzbzt() {
        zzbzm zzbzmVar = new zzbzm();
        this.zza = zzbzmVar;
        this.zzb = new AtomicInteger(0);
        zzgot.zzq(zzbzmVar, new zzbzr(this), zzbzh.zzg);
    }

    @Deprecated
    public final void zze(zzbzq zzbzqVar, zzbzo zzbzoVar) {
        zzgot.zzq(this.zza, new zzbzs(this, zzbzqVar, zzbzoVar), zzbzh.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzij)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
