package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzboe implements zzbzq {
    final /* synthetic */ zzbnj zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzbzm zzc;
    final /* synthetic */ zzboh zzd;

    public zzboe(zzboh zzbohVar, zzbnj zzbnjVar, Object obj, zzbzm zzbzmVar) {
        this.zza = zzbnjVar;
        this.zzb = obj;
        this.zzc = zzbzmVar;
        Objects.requireNonNull(zzbohVar);
        this.zzd = zzbohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzbzm zzbzmVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbnq) obj, obj2, zzbzmVar);
    }
}
