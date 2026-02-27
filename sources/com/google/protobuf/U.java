package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends AbstractC1188b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f10067d = new U(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10068b;
    public int c;

    public U(Object[] objArr, int i, boolean z4) {
        super(z4);
        this.f10068b = objArr;
        this.c = i;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.c;
        Object[] objArr = this.f10068b;
        if (i == objArr.length) {
            this.f10068b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f10068b;
        int i4 = this.c;
        this.c = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            StringBuilder sbT = We.s.t(i, "Index:", ", Size:");
            sbT.append(this.c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f10068b[i];
    }

    @Override // com.google.protobuf.InterfaceC1206u
    public final InterfaceC1206u mutableCopyWithCapacity(int i) {
        if (i >= this.c) {
            return new U(Arrays.copyOf(this.f10068b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f10068b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f10068b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i >= 0 && i <= (i4 = this.c)) {
            Object[] objArr = this.f10068b;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i4 - i);
            } else {
                Object[] objArr2 = new Object[androidx.camera.core.impl.a.a(i4, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f10068b, i, objArr2, i + 1, this.c - i);
                this.f10068b = objArr2;
            }
            this.f10068b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = We.s.t(i, "Index:", ", Size:");
        sbT.append(this.c);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
