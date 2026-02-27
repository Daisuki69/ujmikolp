package com.google.android.gms.internal.clearcut;

import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzce extends zzav<Float> implements zzcn<Float>, RandomAccess {
    private static final zzce zzjm;
    private int size;
    private float[] zzjn;

    static {
        zzce zzceVar = new zzce();
        zzjm = zzceVar;
        zzceVar.zzv();
    }

    public zzce() {
        this(new float[10], 0);
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
        zzc(i, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzce)) {
            return super.addAll(collection);
        }
        zzce zzceVar = (zzce) collection;
        int i = zzceVar.size;
        if (i == 0) {
            return false;
        }
        int i4 = this.size;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        float[] fArr = this.zzjn;
        if (i6 > fArr.length) {
            this.zzjn = Arrays.copyOf(fArr, i6);
        }
        System.arraycopy(zzceVar.zzjn, 0, this.zzjn, this.size, zzceVar.size);
        this.size = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return super.equals(obj);
        }
        zzce zzceVar = (zzce) obj;
        if (this.size != zzceVar.size) {
            return false;
        }
        float[] fArr = zzceVar.zzjn;
        for (int i = 0; i < this.size; i++) {
            if (this.zzjn[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Float.valueOf(this.zzjn[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzjn[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        zzg(i);
        float[] fArr = this.zzjn;
        float f = fArr[i];
        int i4 = this.size;
        if (i < i4 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i4 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzw();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzjn;
        System.arraycopy(fArr, i4, fArr, i, this.size - i4);
        this.size -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzw();
        zzg(i);
        float[] fArr = this.zzjn;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(float f) {
        zzc(this.size, f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Float> zzi(int i) {
        if (i >= this.size) {
            return new zzce(Arrays.copyOf(this.zzjn, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzce(float[] fArr, int i) {
        this.zzjn = fArr;
        this.size = i;
    }

    private final void zzc(int i, float f) {
        int i4;
        zzw();
        if (i < 0 || i > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        float[] fArr = this.zzjn;
        if (i4 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i4 - i);
        } else {
            float[] fArr2 = new float[a.a(i4, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzjn, i, fArr2, i + 1, this.size - i);
            this.zzjn = fArr2;
        }
        this.zzjn[i] = f;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzjn[i]))) {
                float[] fArr = this.zzjn;
                System.arraycopy(fArr, i + 1, fArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
