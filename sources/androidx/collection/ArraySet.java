package androidx.collection;

import Rj.f;
import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1110A;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import rj.InterfaceC2211b;

/* JADX INFO: loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, InterfaceC2211b {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int i) {
            return ArraySet.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i) {
            ArraySet.this.removeAt(i);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iIndexOf;
        int i4 = get_size$collection();
        if (e == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i6 = ~iIndexOf;
        if (i4 >= getHashes$collection().length) {
            int i10 = 8;
            if (i4 >= 8) {
                i10 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i10 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i10);
            if (i4 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (getHashes$collection().length != 0) {
                C1127m.i(0, hashes$collection.length, 6, hashes$collection, getHashes$collection());
                C1127m.j(array$collection, getArray$collection(), 0, 0, array$collection.length, 6);
            }
        }
        if (i6 < i4) {
            int i11 = i6 + 1;
            C1127m.e(i11, i6, i4, getHashes$collection(), getHashes$collection());
            C1127m.h(getArray$collection(), i11, getArray$collection(), i6, i4);
        }
        if (i4 != get_size$collection() || i6 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i6] = i;
        getArray$collection()[i6] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> array) {
        j.g(array, "array");
        int i = array.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                add(array.valueAt(i4));
            }
        } else if (i > 0) {
            C1127m.i(0, i, 6, array.getHashes$collection(), getHashes$collection());
            C1127m.j(array.getArray$collection(), getArray$collection(), 0, 0, i, 6);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        j.g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        int i4 = get_size$collection();
        if (getHashes$collection().length < i) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i);
            if (get_size$collection() > 0) {
                C1127m.i(0, get_size$collection(), 6, hashes$collection, getHashes$collection());
                C1127m.j(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6);
            }
        }
        if (get_size$collection() != i4) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = get_size$collection();
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(valueAt(i4))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i = get_size$collection();
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i4 += hashes$collection[i6];
        }
        return i4;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(ArraySet<? extends E> array) {
        j.g(array, "array");
        int i = array.get_size$collection();
        int i4 = get_size$collection();
        for (int i6 = 0; i6 < i; i6++) {
            remove(array.valueAt(i6));
        }
        return i4 != get_size$collection();
    }

    public final E removeAt(int i) {
        int i4;
        int i6 = get_size$collection();
        E e = (E) getArray$collection()[i];
        if (i6 <= 1) {
            clear();
            return e;
        }
        int i10 = i6 - 1;
        if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                C1127m.e(i, i11, i6, getHashes$collection(), getHashes$collection());
                C1127m.h(getArray$collection(), i, getArray$collection(), i11, i6);
            }
            getArray$collection()[i10] = null;
        } else {
            int i12 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i12);
            if (i > 0) {
                C1127m.i(0, i, 6, hashes$collection, getHashes$collection());
                i4 = i;
                C1127m.j(array$collection, getArray$collection(), 0, 0, i4, 6);
            } else {
                i4 = i;
            }
            if (i4 < i10) {
                int i13 = i4 + 1;
                C1127m.e(i4, i13, i6, hashes$collection, getHashes$collection());
                C1127m.h(array$collection, i4, getArray$collection(), i13, i6);
            }
        }
        if (i6 != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i10);
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        j.g(elements, "elements");
        boolean z4 = false;
        for (int i = get_size$collection() - 1; -1 < i; i--) {
            if (!C1110A.v(elements, getArray$collection()[i])) {
                removeAt(i);
                z4 = true;
            }
        }
        return z4;
    }

    public final void setArray$collection(Object[] objArr) {
        j.g(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        j.g(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C1127m.l(0, this._size, this.array);
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append('{');
        int i = get_size$collection();
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            E eValueAt = valueAt(i4);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        return a.k(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public final E valueAt(int i) {
        return (E) getArray$collection()[i];
    }

    public ArraySet(int i) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            ArraySetKt.allocArrays(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        j.g(array, "array");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        C1127m.h(this.array, 0, tArr, 0, this._size);
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        j.g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i);
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        j.g(elements, "elements");
        ensureCapacity(elements.size() + get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            f fVarF = D.f(eArr);
            while (fVarF.hasNext()) {
                add(fVarF.next());
            }
        }
    }
}
