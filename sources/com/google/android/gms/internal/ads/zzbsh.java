package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsh extends zzbgz {
    final /* synthetic */ zzbsj zza;

    public /* synthetic */ zzbsh(zzbsj zzbsjVar, byte[] bArr) {
        Objects.requireNonNull(zzbsjVar);
        this.zza = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbsj zzbsjVar = this.zza;
        if (zzbsjVar.zze() == null) {
            return;
        }
        zzbsjVar.zze().onCustomClick(zzbsjVar.zzc(zzbgqVar), str);
    }
}
