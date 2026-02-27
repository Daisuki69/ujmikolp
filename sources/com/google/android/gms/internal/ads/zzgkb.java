package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkb {
    Object[] zza;
    int zzb;
    zzgka zzc;

    public zzgkb() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i4 = i + i;
        if (i4 > length) {
            this.zza = Arrays.copyOf(objArr, zzgju.zze(length, i4));
        }
    }

    public final zzgkb zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzgiz.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i4 = i + i;
        objArr[i4] = obj;
        objArr[i4 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzgkb zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgkc zzc() {
        zzgka zzgkaVar = this.zzc;
        if (zzgkaVar != null) {
            throw zzgkaVar.zza();
        }
        zzglp zzglpVarZzj = zzglp.zzj(this.zzb, this.zza, this);
        zzgka zzgkaVar2 = this.zzc;
        if (zzgkaVar2 == null) {
            return zzglpVarZzj;
        }
        throw zzgkaVar2.zza();
    }

    public zzgkb(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
