package com.google.android.gms.internal.mlkit_common;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(s.j("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
