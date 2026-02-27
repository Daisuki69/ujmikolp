package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsl {
    final /* synthetic */ zzdsm zza;
    private final Map zzb;

    @VisibleForTesting
    public zzdsl(zzdsm zzdsmVar) {
        Objects.requireNonNull(zzdsmVar);
        this.zza = zzdsmVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdsl zza(zzfcm zzfcmVar) {
        zzc("gqi", zzfcmVar.zzb);
        return this;
    }

    public final zzdsl zzb(zzfcj zzfcjVar) {
        zzc("aai", zzfcjVar.zzw);
        zzc("request_id", zzfcjVar.zzan);
        zzc("ad_format", zzfcj.zza(zzfcjVar.zzb));
        return this;
    }

    public final zzdsl zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoL)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdsm zzdsmVar = this.zza;
        return zzdsmVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    public final /* synthetic */ zzdsl zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
