package com.google.android.gms.internal.common;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv {
    public static int zza(int i, int i4, String str) {
        String strZza;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            strZza = zzab.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(s.f(i4, "negative size: "));
            }
            strZza = zzab.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i4, String str) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zzd(i, i4, "index"));
        }
        return i;
    }

    public static void zzc(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzd(i, i6, "start index") : (i4 < 0 || i4 > i6) ? zzd(i4, i6, "end index") : zzab.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    private static String zzd(int i, int i4, String str) {
        if (i < 0) {
            return zzab.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzab.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(s.f(i4, "negative size: "));
    }
}
