package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbof implements zzbzo {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzbnj zzb;

    public zzbof(zzboh zzbohVar, zzbzm zzbzmVar, zzbnj zzbnjVar) {
        this.zza = zzbzmVar;
        this.zzb = zzbnjVar;
        Objects.requireNonNull(zzbohVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbns("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
