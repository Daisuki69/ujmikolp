package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbhu extends zzbgz {
    final /* synthetic */ zzbhw zza;

    public /* synthetic */ zzbhu(zzbhw zzbhwVar, byte[] bArr) {
        Objects.requireNonNull(zzbhwVar);
        this.zza = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbhw zzbhwVar = this.zza;
        if (zzbhwVar.zzd() == null) {
            return;
        }
        zzbhwVar.zzd().zzc(zzbhwVar.zze(zzbgqVar), str);
    }
}
