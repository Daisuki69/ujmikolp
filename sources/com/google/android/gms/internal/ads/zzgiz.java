package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgiz {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(We.s.q(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static int zzb(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }
}
