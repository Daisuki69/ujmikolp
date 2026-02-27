package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdex implements com.google.android.gms.ads.internal.overlay.zzq, com.google.android.gms.ads.internal.client.zza {
    private final zzdpu zza;
    private final zzfcm zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdex(zzdpu zzdpuVar, zzfcm zzfcmVar) {
        this.zza = zzdpuVar;
        this.zzb = zzfcmVar;
    }

    private final void zzl() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
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
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(int i) {
        zzl();
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
        this.zza.zzb(this.zzb.zzb);
    }
}
