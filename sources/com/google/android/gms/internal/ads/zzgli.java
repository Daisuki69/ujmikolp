package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgli {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            zzb(objArr[i4], i4);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 9), "at index ", i));
    }
}
