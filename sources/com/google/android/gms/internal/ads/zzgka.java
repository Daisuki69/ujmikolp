package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgka {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgka(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        androidx.media3.datasource.cache.c.A(sb2, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(androidx.camera.core.impl.a.p(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
