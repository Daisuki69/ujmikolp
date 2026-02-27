package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzciq implements zzeyz {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzciq(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzeza zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, String.class);
        zzhqf.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcir(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
