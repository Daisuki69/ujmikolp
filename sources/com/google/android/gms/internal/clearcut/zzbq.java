package com.google.android.gms.internal.clearcut;

import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzbq extends zzav<Double> implements zzcn<Double>, RandomAccess {
    private static final zzbq zzgj;
    private int size;
    private double[] zzgk;

    static {
        zzbq zzbqVar = new zzbq();
        zzgj = zzbqVar;
        zzbqVar.zzv();
    }

    public zzbq() {
        this(new double[10], 0);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    private final String zzh(int i) {
        return AbstractC1173g.p(35, i, this.size, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzbq)) {
            return super.addAll(collection);
        }
        zzbq zzbqVar = (zzbq) collection;
        int i = zzbqVar.size;
        if (i == 0) {
            return false;
        }
        int i4 = this.size;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        double[] dArr = this.zzgk;
        if (i6 > dArr.length) {
            this.zzgk = Arrays.copyOf(dArr, i6);
        }
        System.arraycopy(zzbqVar.zzgk, 0, this.zzgk, this.size, zzbqVar.size);
        this.size = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return super.equals(obj);
        }
        zzbq zzbqVar = (zzbq) obj;
        if (this.size != zzbqVar.size) {
            return false;
        }
        double[] dArr = zzbqVar.zzgk;
        for (int i = 0; i < this.size; i++) {
            if (this.zzgk[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzgk[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzl = 1;
        for (int i = 0; i < this.size; i++) {
            iZzl = (iZzl * 31) + zzci.zzl(Double.doubleToLongBits(this.zzgk[i]));
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        zzg(i);
        double[] dArr = this.zzgk;
        double d10 = dArr[i];
        int i4 = this.size;
        if (i < i4 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i4 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzw();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzgk;
        System.arraycopy(dArr, i4, dArr, i, this.size - i4);
        this.size -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzw();
        zzg(i);
        double[] dArr = this.zzgk;
        double d10 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(double d10) {
        zzc(this.size, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Double> zzi(int i) {
        if (i >= this.size) {
            return new zzbq(Arrays.copyOf(this.zzgk, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzbq(double[] dArr, int i) {
        this.zzgk = dArr;
        this.size = i;
    }

    private final void zzc(int i, double d10) {
        int i4;
        zzw();
        if (i < 0 || i > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        double[] dArr = this.zzgk;
        if (i4 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i4 - i);
        } else {
            double[] dArr2 = new double[a.a(i4, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzgk, i, dArr2, i + 1, this.size - i);
            this.zzgk = dArr2;
        }
        this.zzgk[i] = d10;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzgk[i]))) {
                double[] dArr = this.zzgk;
                System.arraycopy(dArr, i + 1, dArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
