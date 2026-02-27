package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfsb {
    private final zzfrx zza;

    public final /* synthetic */ zzfrz zza() {
        zzhih zzhihVarZzbu = this.zza.zzbu();
        kotlin.jvm.internal.j.f(zzhihVarZzbu, "build(...)");
        return (zzfrz) zzhihVarZzbu;
    }

    public final /* synthetic */ zzhll zzb() {
        Map mapZzb = this.zza.zzb();
        kotlin.jvm.internal.j.f(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzhll(mapZzb);
    }

    public final void zzc(zzhll zzhllVar, String key, zzfrv value) {
        kotlin.jvm.internal.j.g(zzhllVar, "<this>");
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzhll zzhllVar, String key) {
        kotlin.jvm.internal.j.g(zzhllVar, "<this>");
        kotlin.jvm.internal.j.g(key, "key");
        this.zza.zza(key);
    }
}
