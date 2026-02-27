package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjd {
    zzbgx zza;
    zzbgu zzb;
    zzbhk zzc;
    zzbhh zzd;
    zzbmf zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdjd zza(zzbgx zzbgxVar) {
        this.zza = zzbgxVar;
        return this;
    }

    public final zzdjd zzb(zzbgu zzbguVar) {
        this.zzb = zzbguVar;
        return this;
    }

    public final zzdjd zzc(zzbhk zzbhkVar) {
        this.zzc = zzbhkVar;
        return this;
    }

    public final zzdjd zzd(zzbhh zzbhhVar) {
        this.zzd = zzbhhVar;
        return this;
    }

    public final zzdjd zze(zzbmf zzbmfVar) {
        this.zze = zzbmfVar;
        return this;
    }

    public final zzdjd zzf(String str, zzbhd zzbhdVar, @Nullable zzbha zzbhaVar) {
        this.zzf.put(str, zzbhdVar);
        if (zzbhaVar != null) {
            this.zzg.put(str, zzbhaVar);
        }
        return this;
    }

    public final zzdje zzg() {
        return new zzdje(this, null);
    }
}
