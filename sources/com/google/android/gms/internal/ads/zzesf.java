package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesf implements zzeun {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzesf(String str, boolean z4, boolean z5, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = z8;
        this.zze = z9;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z4 = this.zzb;
        bundle.putInt("test_mode", z4 ? 1 : 0);
        boolean z5 = this.zzc;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z4 || z5) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjY)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z4 = this.zzb;
        bundle.putInt("test_mode", z4 ? 1 : 0);
        boolean z5 = this.zzc;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z4 || z5) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
