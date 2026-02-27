package com.google.android.gms.internal.clearcut;

import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzaz extends zzav<Boolean> implements zzcn<Boolean>, RandomAccess {
    private static final zzaz zzfg;
    private int size;
    private boolean[] zzfh;

    static {
        zzaz zzazVar = new zzaz();
        zzfg = zzazVar;
        zzazVar.zzv();
    }

    public zzaz() {
        this(new boolean[10], 0);
    }

    private final void zza(int i, boolean z4) {
        int i4;
        zzw();
        if (i < 0 || i > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        boolean[] zArr = this.zzfh;
        if (i4 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i4 - i);
        } else {
            boolean[] zArr2 = new boolean[a.a(i4, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzfh, i, zArr2, i + 1, this.size - i);
            this.zzfh = zArr2;
        }
        this.zzfh[i] = z4;
        this.size++;
        ((AbstractList) this).modCount++;
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
        zza(i, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzaz)) {
            return super.addAll(collection);
        }
        zzaz zzazVar = (zzaz) collection;
        int i = zzazVar.size;
        if (i == 0) {
            return false;
        }
        int i4 = this.size;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        boolean[] zArr = this.zzfh;
        if (i6 > zArr.length) {
            this.zzfh = Arrays.copyOf(zArr, i6);
        }
        System.arraycopy(zzazVar.zzfh, 0, this.zzfh, this.size, zzazVar.size);
        this.size = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z4) {
        zza(this.size, z4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaz)) {
            return super.equals(obj);
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.size != zzazVar.size) {
            return false;
        }
        boolean[] zArr = zzazVar.zzfh;
        for (int i = 0; i < this.size; i++) {
            if (this.zzfh[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Boolean.valueOf(this.zzfh[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.size; i++) {
            iZzc = (iZzc * 31) + zzci.zzc(this.zzfh[i]);
        }
        return iZzc;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        zzg(i);
        boolean[] zArr = this.zzfh;
        boolean z4 = zArr[i];
        int i4 = this.size;
        if (i < i4 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i4 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzw();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzfh;
        System.arraycopy(zArr, i4, zArr, i, this.size - i4);
        this.size -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzw();
        zzg(i);
        boolean[] zArr = this.zzfh;
        boolean z4 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Boolean> zzi(int i) {
        if (i >= this.size) {
            return new zzaz(Arrays.copyOf(this.zzfh, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzaz(boolean[] zArr, int i) {
        this.zzfh = zArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zzfh[i]))) {
                boolean[] zArr = this.zzfh;
                System.arraycopy(zArr, i + 1, zArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
