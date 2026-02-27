package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class zzdq {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
        sb3.append("null value in entry: ");
        sb3.append(strValueOf2);
        sb3.append("=null");
        throw new NullPointerException(sb3.toString());
    }
}
