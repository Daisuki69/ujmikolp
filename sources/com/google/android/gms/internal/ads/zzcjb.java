package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjb implements zzfap {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcjb(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final zzfaq zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, String.class);
        zzhqf.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcjc(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
