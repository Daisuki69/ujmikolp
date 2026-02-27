package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbml implements zzbjl {
    final /* synthetic */ zzbms zza;
    private final zzbjl zzb;

    public zzbml(zzbms zzbmsVar, zzbjl zzbjlVar) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
        this.zzb = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public final /* synthetic */ zzbjl zzb() {
        return this.zzb;
    }
}
