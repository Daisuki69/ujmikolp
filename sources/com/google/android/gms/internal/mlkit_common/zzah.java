package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i4 = i + i;
        if (i4 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i4));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        int i10 = i6 + i6;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.zzb = i6 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.zzb, this.zza, this);
        zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}
