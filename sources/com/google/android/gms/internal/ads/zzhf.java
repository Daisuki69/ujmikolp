package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhf extends IllegalStateException {
    public zzhf(int i, int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i4).length() + 1);
        androidx.media3.datasource.cache.c.y(sb2, "Buffer too small (", i, " < ", i4);
        sb2.append(")");
        super(sb2.toString());
    }
}
