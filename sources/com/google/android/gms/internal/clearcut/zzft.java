package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends IOException {
    public zzft(int i, int i4) {
        StringBuilder sb2 = new StringBuilder(108);
        sb2.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb2.append(i);
        sb2.append(" limit ");
        sb2.append(i4);
        sb2.append(").");
        super(sb2.toString());
    }
}
