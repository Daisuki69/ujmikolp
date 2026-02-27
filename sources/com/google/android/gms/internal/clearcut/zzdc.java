package com.google.android.gms.internal.clearcut;

import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzdc extends zzav<Long> implements zzcn<Long>, RandomAccess {
    private static final zzdc zzlw;
    private int size;
    private long[] zzlx;

    static {
        zzdc zzdcVar = new zzdc();
        zzlw = zzdcVar;
        zzdcVar.zzv();
    }

    public zzdc() {
        this(new long[10], 0);
    }

    public static zzdc zzbx() {
        return zzlw;
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    private final String zzh(int i) {
        return AbstractC1173g.p(35, i, this.size, "Index:", ", Size:");
    }

    private final void zzk(int i, long j) {
        int i4;
        zzw();
        if (i < 0 || i > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        long[] jArr = this.zzlx;
        if (i4 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i4 - i);
        } else {
            long[] jArr2 = new long[a.a(i4, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzlx, i, jArr2, i + 1, this.size - i);
            this.zzlx = jArr2;
        }
        this.zzlx[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzk(i, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzdc)) {
            return super.addAll(collection);
        }
        zzdc zzdcVar = (zzdc) collection;
        int i = zzdcVar.size;
        if (i == 0) {
            return false;
        }
        int i4 = this.size;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        long[] jArr = this.zzlx;
        if (i6 > jArr.length) {
            this.zzlx = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(zzdcVar.zzlx, 0, this.zzlx, this.size, zzdcVar.size);
        this.size = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return super.equals(obj);
        }
        zzdc zzdcVar = (zzdc) obj;
        if (this.size != zzdcVar.size) {
            return false;
        }
        long[] jArr = zzdcVar.zzlx;
        for (int i = 0; i < this.size; i++) {
            if (this.zzlx[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        zzg(i);
        return this.zzlx[i];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzl = 1;
        for (int i = 0; i < this.size; i++) {
            iZzl = (iZzl * 31) + zzci.zzl(this.zzlx[i]);
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        int i4 = this.size;
        if (i < i4 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i4 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzw();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzlx;
        System.arraycopy(jArr, i4, jArr, i, this.size - i4);
        this.size -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Long> zzi(int i) {
        if (i >= this.size) {
            return new zzdc(Arrays.copyOf(this.zzlx, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzm(long j) {
        zzk(this.size, j);
    }

    private zzdc(long[] jArr, int i) {
        this.zzlx = jArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzlx[i]))) {
                long[] jArr = this.zzlx;
                System.arraycopy(jArr, i + 1, jArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
