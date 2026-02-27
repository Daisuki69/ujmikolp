package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjd implements zzfcc {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjd(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzfcd zza() {
        zzhqf.zzc(this.zzb, Context.class);
        return new zzcje(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* synthetic */ zzfcc zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ zzfcc zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
