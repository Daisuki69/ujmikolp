package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkd extends zzgjt {
    Object[] zzd;
    private int zze;

    public zzgkd() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgjt, com.google.android.gms.internal.ads.zzgju
    public final /* bridge */ /* synthetic */ zzgju zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgkd zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzn = zzgke.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzn <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgjs.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzgkd zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    public final zzgkd zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgke zzi() {
        zzgke zzgkeVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzglq.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgma(obj);
        }
        if (this.zzd == null || zzgke.zzn(i) != this.zzd.length) {
            zzgkeVarZzv = zzgke.zzv(this.zzb, this.zza);
            this.zzb = zzgkeVarZzv.size();
        } else {
            int i4 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgke.zzw(i4, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            zzgkeVarZzv = new zzglq(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgkeVarZzv;
    }

    public zzgkd(int i, boolean z4) {
        super(i);
        this.zzd = new Object[zzgke.zzn(i)];
    }
}
