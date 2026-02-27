package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejh implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvq zzb;
    private final zzcwk zzc;
    private final zzdeb zzd;
    private final zzddt zze;
    private final zzcnf zzf;

    public zzejh(zzcvq zzcvqVar, zzcwk zzcwkVar, zzdeb zzdebVar, zzddt zzddtVar, zzcnf zzcnfVar) {
        this.zzb = zzcvqVar;
        this.zzc = zzcwkVar;
        this.zzd = zzdebVar;
        this.zze = zzddtVar;
        this.zzf = zzcnfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdw();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
