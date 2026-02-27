package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC1173g;

/* JADX INFO: loaded from: classes3.dex */
final class zzor extends IllegalArgumentException {
    public zzor(int i, int i4) {
        super(AbstractC1173g.p(String.valueOf(i).length() + (byte) 32 + String.valueOf(i4).length(), i, i4, "Unpaired surrogate at index ", " of "));
    }
}
