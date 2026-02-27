package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzar extends zzao {
    public zzar() {
        super(4);
    }

    public final zzar zza(Object obj) {
        obj.getClass();
        int i = this.zzb;
        int i4 = i + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i4) {
            int i6 = length + (length >> 1) + 1;
            if (i6 < i4) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i6 = iHighestOneBit + iHighestOneBit;
            }
            if (i6 < 0) {
                i6 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i6);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr2[i10] = obj;
        return this;
    }

    public final zzau zzb() {
        this.zzc = true;
        return zzau.zzg(this.zza, this.zzb);
    }
}
