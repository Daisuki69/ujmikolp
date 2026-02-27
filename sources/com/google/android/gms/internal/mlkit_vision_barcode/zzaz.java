package com.google.android.gms.internal.mlkit_vision_barcode;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaz {
    public static int zza(int i, int i4, String str) {
        String strZzb;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            strZzb = zzba.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(s.f(i4, "negative size: "));
            }
            strZzb = zzba.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i4, String str) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zzg(i, i4, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzg(i, i6, "start index") : (i4 < 0 || i4 > i6) ? zzg(i4, i6, "end index") : zzba.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static void zzf(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzg(int i, int i4, String str) {
        if (i < 0) {
            return zzba.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzba.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(s.f(i4, "negative size: "));
    }
}
