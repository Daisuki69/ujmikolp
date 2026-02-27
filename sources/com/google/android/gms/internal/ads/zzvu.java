package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzvu extends zzud {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvu(zzvx zzvxVar, zzbe zzbeVar) {
        super(zzbeVar);
        Objects.requireNonNull(zzvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        this.zzb.zzb(i, zzbdVar, j);
        zzbdVar.zzk = true;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z4) {
        this.zzb.zzd(i, zzbcVar, z4);
        zzbcVar.zzf = true;
        return zzbcVar;
    }
}
