package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes3.dex */
final class zzgnd extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgnd(int[] iArr, int i, int i4) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgne.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnd)) {
            return super.equals(obj);
        }
        zzgnd zzgndVar = (zzgnd) obj;
        int i = this.zzc;
        int i4 = this.zzb;
        int i6 = zzgndVar.zzc;
        int i10 = zzgndVar.zzb;
        int i11 = i - i4;
        if (i6 - i10 != i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i4 + i12] != zzgndVar.zza[i10 + i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i4 = this.zzc;
        int i6 = this.zzb;
        zzghc.zzm(i, i4 - i6, "index");
        return Integer.valueOf(this.zza[i6 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = this.zzb; i4 < this.zzc; i4++) {
            i = (i * 31) + this.zza[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i = this.zzb;
        int iZzi = zzgne.zzi(iArr, iIntValue, i, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i4 = this.zzc - 1;
            while (true) {
                if (i4 < i) {
                    i4 = -1;
                    break;
                }
                if (iArr[i4] == iIntValue) {
                    break;
                }
                i4--;
            }
            if (i4 >= 0) {
                return i4 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i4 = this.zzc;
        int i6 = this.zzb;
        Integer num = (Integer) obj;
        zzghc.zzm(i, i4 - i6, "index");
        int[] iArr = this.zza;
        int i10 = i6 + i;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        int i6 = this.zzc;
        int i10 = this.zzb;
        zzghc.zzo(i, i4, i6 - i10);
        return i == i4 ? Collections.EMPTY_LIST : new zzgnd(this.zza, i + i10, i10 + i4);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.zzc;
        int i4 = this.zzb;
        StringBuilder sb2 = new StringBuilder((i - i4) * 5);
        sb2.append('[');
        int[] iArr = this.zza;
        sb2.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i4]);
        }
    }
}
