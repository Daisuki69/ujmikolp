package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoo implements zzeun {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzeoo(int i, boolean z4, boolean z5, int i4, int i6, int i10, int i11, int i12, float f, boolean z8, boolean z9) {
        this.zza = i;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = i4;
        this.zze = i6;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = i12;
        this.zzi = f;
        this.zzj = z8;
        this.zzk = z9;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlN)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
        if (this.zzk) {
            return;
        }
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        q.a(this, obj);
    }
}
