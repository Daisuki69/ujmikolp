package com.google.android.gms.internal.mlkit_vision_face;

import androidx.media3.datasource.cache.c;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzau {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(c.h(i, str, " cannot be negative but was: "));
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }
}
