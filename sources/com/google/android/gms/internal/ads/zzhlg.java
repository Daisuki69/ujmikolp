package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhlg extends IllegalArgumentException {
    public zzhlg(int i, int i4) {
        super(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i4).length()), "Unpaired surrogate at index ", i, " of ", i4));
    }
}
