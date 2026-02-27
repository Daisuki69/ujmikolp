package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfib implements Runnable {
    private final zzfie zzb;
    private String zzc;
    private String zze;
    private zzfct zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfig zzd = zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfib(zzfie zzfieVar) {
        this.zzb = zzfieVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfib zza(zzfhr zzfhrVar) {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfhrVar.zzc();
                list.add(zzfhrVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzbzh.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjA)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized zzfib zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized zzfib zzc(String str) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue() && zzfia.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfib zzd(Bundle bundle) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfib zze(zzfct zzfctVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzf = zzfctVar;
        }
        return this;
    }

    public final synchronized zzfib zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfib zzg(String str) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfhr> list = this.zza;
                for (zzfhr zzfhrVar : list) {
                    int i = this.zzi;
                    if (i != 2) {
                        zzfhrVar.zzp(i);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfhrVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfhrVar.zzl()) {
                        zzfhrVar.zzi(this.zze);
                    }
                    zzfct zzfctVar = this.zzf;
                    if (zzfctVar != null) {
                        zzfhrVar.zzg(zzfctVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfhrVar.zzh(zzeVar);
                        }
                    }
                    zzfhrVar.zzf(this.zzd);
                    this.zzb.zzb(zzfhrVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzfib zzi(int i) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
