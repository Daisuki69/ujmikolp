package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsi implements zzcxg, com.google.android.gms.ads.internal.client.zza, zzcyy, zzcwm, zzcvs, zzdbj {
    private final Clock zza;
    private final zzbyp zzb;

    public zzcsi(Clock clock, zzbyp zzbypVar) {
        this.zza = clock;
        this.zzb = zzbypVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzj(zzbbn.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk(zzbbn.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl(zzbbn.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzm(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzn(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
