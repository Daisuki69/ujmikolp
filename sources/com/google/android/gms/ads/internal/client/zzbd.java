package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbcg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {
    private static final zzbd zza = new zzbd();
    private final zzbca zzb;
    private final zzbcb zzc;
    private final zzbcg zzd;
    private final zzbbr zze;

    public zzbd() {
        zzbca zzbcaVar = new zzbca();
        zzbcb zzbcbVar = new zzbcb();
        zzbcg zzbcgVar = new zzbcg();
        zzbbr zzbbrVar = new zzbbr();
        this.zzb = zzbcaVar;
        this.zzc = zzbcbVar;
        this.zzd = zzbcgVar;
        this.zze = zzbbrVar;
    }

    public static zzbcb zza() {
        return zza.zzc;
    }

    public static zzbca zzb() {
        return zza.zzb;
    }

    public static zzbcg zzc() {
        return zza.zzd;
    }

    public static zzbbr zzd() {
        return zza.zze;
    }
}
