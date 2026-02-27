package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1188b implements InterfaceC1204s, RandomAccess, S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f10121d = new r(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10122b;
    public int c;

    public r(int[] iArr, int i, boolean z4) {
        super(z4);
        this.f10122b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i4 = this.c)) {
            StringBuilder sbT = We.s.t(i, "Index:", ", Size:");
            sbT.append(this.c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        int[] iArr = this.f10122b;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i4 - i);
        } else {
            int[] iArr2 = new int[androidx.camera.core.impl.a.a(i4, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f10122b, i, iArr2, i + 1, this.c - i);
            this.f10122b = iArr2;
        }
        this.f10122b[i] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1207v.f10124a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i = rVar.c;
        if (i == 0) {
            return false;
        }
        int i4 = this.c;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        int[] iArr = this.f10122b;
        if (i6 > iArr.length) {
            this.f10122b = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(rVar.f10122b, 0, this.f10122b, this.c, rVar.c);
        this.c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        a();
        int i4 = this.c;
        int[] iArr = this.f10122b;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[androidx.camera.core.impl.a.a(i4, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f10122b = iArr2;
        }
        int[] iArr3 = this.f10122b;
        int i6 = this.c;
        this.c = i6 + 1;
        iArr3[i6] = i;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            StringBuilder sbT = We.s.t(i, "Index:", ", Size:");
            sbT.append(this.c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.c != rVar.c) {
            return false;
        }
        int[] iArr = rVar.f10122b;
        for (int i = 0; i < this.c; i++) {
            if (this.f10122b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        c(i);
        return this.f10122b[i];
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            i = (i * 31) + this.f10122b[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f10122b[i4] == iIntValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC1206u
    public final InterfaceC1206u mutableCopyWithCapacity(int i) {
        if (i >= this.c) {
            return new r(Arrays.copyOf(this.f10122b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.f10122b;
        int i4 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10122b;
        System.arraycopy(iArr, i4, iArr, i, this.c - i4);
        this.c -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.f10122b;
        int i4 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
