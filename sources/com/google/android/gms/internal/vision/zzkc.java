package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkc<K, V> {
    public static <K, V> void zza(zzii zziiVar, zzkf<K, V> zzkfVar, K k8, V v7) throws IOException {
        zziu.zza(zziiVar, zzkfVar.zza, 1, k8);
        zziu.zza(zziiVar, zzkfVar.zzc, 2, v7);
    }

    public static <K, V> int zza(zzkf<K, V> zzkfVar, K k8, V v7) {
        return zziu.zza(zzkfVar.zza, 1, k8) + zziu.zza(zzkfVar.zzc, 2, v7);
    }
}
