package R1;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o1.AbstractC1955a;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5431b;
    public final int c;

    public b(int[] iArr, int i, int i4) {
        this.f5430a = iArr;
        this.f5431b = i;
        this.c = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return AbstractC1955a.t(((Integer) obj).intValue(), this.f5431b, this.c, this.f5430a) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f5430a[this.f5431b + i] != bVar.f5430a[bVar.f5431b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i.k(i, size());
        return Integer.valueOf(this.f5430a[this.f5431b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = this.f5431b; i4 < this.c; i4++) {
            i = (i * 31) + this.f5430a[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f5430a;
        int i = this.f5431b;
        int iT = AbstractC1955a.t(iIntValue, i, this.c, iArr);
        if (iT >= 0) {
            return iT - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i4 = this.c;
            while (true) {
                i4--;
                i = this.f5431b;
                if (i4 < i) {
                    i4 = -1;
                    break;
                }
                if (this.f5430a[i4] == iIntValue) {
                    break;
                }
            }
            if (i4 >= 0) {
                return i4 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        i.k(i, size());
        int i4 = this.f5431b + i;
        int[] iArr = this.f5430a;
        int i6 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.f5431b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        i.o(i, i4, size());
        if (i == i4) {
            return Collections.EMPTY_LIST;
        }
        int i6 = this.f5431b;
        return new b(this.f5430a, i + i6, i6 + i4);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f5430a;
        int i = this.f5431b;
        sb2.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i]);
        }
    }
}
