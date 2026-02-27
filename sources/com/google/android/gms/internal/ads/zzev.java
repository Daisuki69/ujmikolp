package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzev {
    public final int zzd;

    public static String zze(int i) {
        char c = (char) ((i >> 24) & 255);
        char c10 = (char) ((i >> 16) & 255);
        char c11 = (char) ((i >> 8) & 255);
        char c12 = (char) (i & 255);
        StringBuilder sb2 = new StringBuilder(We.s.b(String.valueOf(c).length(), String.valueOf(c10).length(), String.valueOf(c11).length(), String.valueOf(c12).length()));
        sb2.append(c);
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
