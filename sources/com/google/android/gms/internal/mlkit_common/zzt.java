package com.google.android.gms.internal.mlkit_common;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt {
    public static int zza(int i, int i4, String str) {
        String strZza;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            strZza = zzu.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(s.f(i4, "negative size: "));
            }
            strZza = zzu.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i4, String str) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zzf(i, i4, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzf(i, i6, "start index") : (i4 < 0 || i4 > i6) ? zzf(i4, i6, "end index") : zzu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    private static String zzf(int i, int i4, String str) {
        if (i < 0) {
            return zzu.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(s.f(i4, "negative size: "));
    }
}
