package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcci extends com.google.android.gms.ads.internal.util.zzb {
    final zzcbd zza;
    final zzccq zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcci(zzcbd zzcbdVar, zzccq zzccqVar, String str, String[] strArr) {
        this.zza = zzcbdVar;
        this.zzb = zzccqVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccg(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final S1.y zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcj)).booleanValue() && (this.zzb instanceof zzccz)) ? zzbzh.zzf.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
