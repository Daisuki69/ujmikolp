package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdg<K, V> {
    public static <K, V> int zza(zzdh<K, V> zzdhVar, K k8, V v7) {
        return zzby.zza(zzdhVar.zzmb, 1, k8) + zzby.zza(zzdhVar.zzmd, 2, v7);
    }

    public static <K, V> void zza(zzbn zzbnVar, zzdh<K, V> zzdhVar, K k8, V v7) throws IOException {
        zzby.zza(zzbnVar, zzdhVar.zzmb, 1, k8);
        zzby.zza(zzbnVar, zzdhVar.zzmd, 2, v7);
    }
}
