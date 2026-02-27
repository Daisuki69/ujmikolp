package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyd extends zzdbq implements com.google.android.gms.ads.internal.overlay.zzq {
    public zzcyd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdA() {
        zzs(zzcxw.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdB() {
        zzs(zzcxx.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdC() {
        zzs(zzcxy.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
        zzs(zzcxz.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
        zzs(zzcya.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdX() {
        zzs(zzcxv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdY(final int i) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcyc
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzq) obj).zzdY(i);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
        zzs(zzcxs.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
        zzs(zzcxt.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
        zzs(zzcxu.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzh() {
        zzs(zzcyb.zza);
    }
}
