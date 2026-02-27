package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzese implements zzeup {
    private final zzgpd zza;
    private final zzdvs zzb;

    public zzese(zzgpd zzgpdVar, zzdvs zzdvsVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 23;
    }

    public final /* synthetic */ zzesf zzc() {
        zzdvs zzdvsVar = this.zzb;
        return new zzesf(zzdvsVar.zzg(), zzdvsVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzdvsVar.zzq(), zzdvsVar.zzm());
    }
}
