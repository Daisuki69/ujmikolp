package com.google.android.gms.internal.mlkit_vision_common;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(s.f(i4, "at index "));
            }
        }
        return objArr;
    }
}
