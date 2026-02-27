package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzceu implements com.google.android.gms.ads.internal.overlay.zzq {
    private final zzcek zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzq zzb;

    public zzceu(zzcek zzcekVar, @Nullable com.google.android.gms.ads.internal.overlay.zzq zzqVar) {
        this.zza = zzcekVar;
        this.zzb = zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzb;
        if (zzqVar != null) {
            zzqVar.zzdA();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzb;
        if (zzqVar != null) {
            zzqVar.zzdX();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(int i) {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzb;
        if (zzqVar != null) {
            zzqVar.zzdY(i);
        }
        this.zza.zzG();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzb;
        if (zzqVar != null) {
            zzqVar.zzh();
        }
        this.zza.zzI();
    }
}
