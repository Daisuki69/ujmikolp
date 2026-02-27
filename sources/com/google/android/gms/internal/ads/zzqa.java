package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqa extends Exception {
    public zzqa(long j, long j6) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 63 + String.valueOf(j).length());
        androidx.media3.datasource.cache.c.z(sb2, "Unexpected audio track timestamp discontinuity: expected ", j6, ", got ");
        sb2.append(j);
        super(sb2.toString());
    }
}
