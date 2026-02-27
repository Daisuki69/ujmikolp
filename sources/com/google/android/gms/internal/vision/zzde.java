package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.ads.AbstractC1173g;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzde {
    public static void zza(boolean z4, @NullableDecl Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void zzb(boolean z4, @NullableDecl Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t5) {
        t5.getClass();
        return t5;
    }

    public static int zzb(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zza(i, i4, "index"));
        }
        return i;
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t5, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int zza(int i, int i4) {
        String strZza;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            strZza = zzdg.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(AbstractC1173g.q(26, i4, "negative size: "));
            }
            strZza = zzdg.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    private static String zza(int i, int i4, @NullableDecl String str) {
        if (i < 0) {
            return zzdg.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzdg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(AbstractC1173g.q(26, i4, "negative size: "));
    }

    public static void zza(int i, int i4, int i6) {
        String strZza;
        if (i < 0 || i4 < i || i4 > i6) {
            if (i < 0 || i > i6) {
                strZza = zza(i, i6, "start index");
            } else if (i4 >= 0 && i4 <= i6) {
                strZza = zzdg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i));
            } else {
                strZza = zza(i4, i6, "end index");
            }
            throw new IndexOutOfBoundsException(strZza);
        }
    }
}
