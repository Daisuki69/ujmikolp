package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class zzae extends zzaf {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzae(int i) {
    }

    public final zzae zza(Object obj) {
        int i;
        obj.getClass();
        int length = this.zza.length;
        int i4 = this.zzb;
        int i6 = i4 + 1;
        if (i6 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i6 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i6) {
                int iHighestOneBit = Integer.highestOneBit(i4);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
