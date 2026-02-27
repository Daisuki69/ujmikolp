package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdns {
    private final zzcvq zza;
    private final zzcwz zzb;
    private final zzcxm zzc;
    private final zzcyd zzd;
    private final zzdaw zze;
    private final zzfcj zzf;
    private final zzfcm zzg;
    private final zzcmi zzh;

    public zzdns(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        this.zza = zzcvqVar;
        this.zzb = zzcwzVar;
        this.zzc = zzcxmVar;
        this.zzd = zzcydVar;
        this.zze = zzdawVar;
        this.zzf = zzfcjVar;
        this.zzg = zzfcmVar;
        this.zzh = zzcmiVar;
    }

    public final void zza(zzdnx zzdnxVar) {
        final zzcwz zzcwzVar = this.zzb;
        zzdnl zzdnlVarZzk = zzdnxVar.zzk();
        Objects.requireNonNull(zzcwzVar);
        zzdnlVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final /* synthetic */ void zzl() {
                zzcwzVar.zzb();
            }
        });
        zzdnxVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
