package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgna {
    public static long zza(String str, long j) {
        if (j >= 0) {
            return j;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + length + 2 + 14);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
