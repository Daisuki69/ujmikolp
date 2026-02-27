package com.google.android.gms.internal.mlkit_vision_barcode;

import We.s;
import androidx.media3.datasource.cache.c;

/* JADX INFO: loaded from: classes3.dex */
final class zzby {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(c.h(i, str, " cannot be negative but was: "));
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(s.j("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
