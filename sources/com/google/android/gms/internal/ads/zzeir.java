package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzeir extends zzbvr {
    final /* synthetic */ zzcyd zza;
    final /* synthetic */ zzcvq zzb;
    final /* synthetic */ zzcwz zzc;
    final /* synthetic */ zzdei zzd;

    public zzeir(zzeis zzeisVar, zzcyd zzcydVar, zzcvq zzcvqVar, zzcwz zzcwzVar, zzdei zzdeiVar) {
        this.zza = zzcydVar;
        this.zzb = zzcvqVar;
        this.zzc = zzcwzVar;
        this.zzd = zzdeiVar;
        Objects.requireNonNull(zzeisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdY(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzk(IObjectWrapper iObjectWrapper, zzbvt zzbvtVar) {
        this.zzd.zzb(zzbvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzm(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }
}
