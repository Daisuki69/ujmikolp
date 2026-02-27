package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsi extends zzbhc {
    final /* synthetic */ zzbsj zza;

    public /* synthetic */ zzbsi(zzbsj zzbsjVar, byte[] bArr) {
        Objects.requireNonNull(zzbsjVar);
        this.zza = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) {
        zzbsj zzbsjVar = this.zza;
        zzbsjVar.zzd().onCustomFormatAdLoaded(zzbsjVar.zzc(zzbgqVar));
    }
}
