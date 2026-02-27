package androidx.collection;

import We.s;
import androidx.annotation.IntRange;
import androidx.camera.core.impl.a;
import cj.C1110A;
import cj.C1127m;
import cj.C1129o;
import cj.C1132s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.d;
import kotlin.sequences.Sequence;
import rj.InterfaceC2210a;
import rj.InterfaceC2212c;

/* JADX INFO: loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public static final class MutableObjectListIterator<T> implements ListIterator<T>, InterfaceC2210a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i) {
            j.g(list, "list");
            this.list = list;
            this.prevIndex = i - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            list.add(i, t5);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            this.list.set(this.prevIndex, t5);
        }
    }

    public static final class ObjectListMutableList<T> implements List<T>, InterfaceC2212c {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            j.g(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            return this.objectList.add(t5);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            j.g(elements, "elements");
            return this.objectList.addAll(i, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.get(i);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i, T t5) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.set(i, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i4) {
            ObjectListKt.checkSubIndex(this, i, i4);
            return new SubList(this, i, i4);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return D.h(this);
        }

        @Override // java.util.List
        public void add(int i, T t5) {
            this.objectList.add(i, t5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            j.g(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            j.g(array, "array");
            return (T[]) D.i(this, array);
        }
    }

    public static final class SubList<T> implements List<T>, InterfaceC2212c {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i, int i4) {
            j.g(list, "list");
            this.list = list;
            this.start = i;
            this.end = i4;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, t5);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            j.g(elements, "elements");
            this.list.addAll(i + this.start, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i4 = this.start;
            if (i4 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i4) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.end;
            for (int i4 = this.start; i4 < i; i4++) {
                if (j.b(this.list.get(i4), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.end;
            for (int i4 = this.start; i4 < i; i4++) {
                if (j.b(this.list.get(i4), obj)) {
                    return i4 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i4 = this.start;
            if (i4 > i) {
                return -1;
            }
            while (!j.b(this.list.get(i), obj)) {
                if (i == i4) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public T removeAt(int i) {
            ObjectListKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            j.g(elements, "elements");
            int i = this.end;
            int i4 = i - 1;
            int i6 = this.start;
            if (i6 <= i4) {
                while (true) {
                    if (!elements.contains(this.list.get(i4))) {
                        this.list.remove(i4);
                        this.end--;
                    }
                    if (i4 == i6) {
                        break;
                    }
                    i4--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int i, T t5) {
            ObjectListKt.checkIndex(this, i);
            return this.list.set(i + this.start, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i4) {
            ObjectListKt.checkSubIndex(this, i, i4);
            return new SubList(this, i, i4);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return D.h(this);
        }

        @Override // java.util.List
        public void add(int i, T t5) {
            this.list.add(i + this.start, t5);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.end;
            for (int i4 = this.start; i4 < i; i4++) {
                if (j.b(this.list.get(i4), obj)) {
                    this.list.remove(i4);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            j.g(array, "array");
            return (T[]) D.i(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            j.g(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mutableObjectList._size;
        }
        mutableObjectList.trim(i);
    }

    public final boolean add(E e) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i = this._size;
        objArr[i] = e;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i, E[] elements) {
        int i4;
        j.g(elements, "elements");
        if (i < 0 || i > (i4 = this._size)) {
            StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
            sbT.append(this._size);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i4 + elements.length);
        Object[] objArr = this.content;
        int i6 = this._size;
        if (i != i6) {
            C1127m.h(objArr, elements.length + i, objArr, i, i6);
        }
        C1127m.j(elements, objArr, i, 0, 0, 12);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        C1127m.m(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        Object[] objArr = this.content;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e) {
        remove(e);
    }

    public final void plusAssign(ObjectList<E> elements) {
        j.g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        C1127m.h(elements.content, this._size, this.content, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e) {
        int iIndexOf = indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(E[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        for (E e : elements) {
            remove(e);
        }
        return i != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i) {
        int i4;
        if (i < 0 || i >= (i4 = this._size)) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        Object[] objArr = this.content;
        E e = (E) objArr[i];
        if (i != i4 - 1) {
            C1127m.h(objArr, i, objArr, i + 1, i4);
        }
        int i6 = this._size - 1;
        this._size = i6;
        objArr[i6] = null;
        return e;
    }

    public final void removeIf(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        int i = this._size;
        Object[] objArr = this.content;
        int i4 = 0;
        kotlin.ranges.IntRange intRangeF = d.f(0, i);
        int i6 = intRangeF.f18201a;
        int i10 = intRangeF.f18202b;
        if (i6 <= i10) {
            while (true) {
                objArr[i6 - i4] = objArr[i6];
                if (((Boolean) predicate.invoke(objArr[i6])).booleanValue()) {
                    i4++;
                }
                if (i6 == i10) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        C1127m.m(objArr, null, i - i4, i);
        this._size -= i4;
    }

    public final void removeRange(@IntRange(from = 0) int i, @IntRange(from = 0) int i4) {
        int i6;
        if (i < 0 || i > (i6 = this._size) || i4 < 0 || i4 > i6) {
            StringBuilder sbU = s.u("Start (", i, ") and end (", i4, ") must be in 0..");
            sbU.append(this._size);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i4 + ')');
        }
        if (i4 != i) {
            if (i4 < i6) {
                Object[] objArr = this.content;
                C1127m.h(objArr, i, objArr, i4, i6);
            }
            int i10 = this._size;
            int i11 = i10 - (i4 - i);
            C1127m.m(this.content, null, i11, i10);
            this._size = i11;
        }
    }

    public final boolean retainAll(E[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (C1129o.t(elements, objArr[i4]) < 0) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final E set(@IntRange(from = 0) int i, E e) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "set index ", " must be between 0 .. "), this._size, 1));
        }
        Object[] objArr = this.content;
        E e7 = (E) objArr[i];
        objArr[i] = e;
        return e7;
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public /* synthetic */ MutableObjectList(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(List<? extends E> elements) {
        j.g(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            remove(elements.get(i));
        }
    }

    public MutableObjectList(int i) {
        super(i, null);
    }

    public final void add(@IntRange(from = 0) int i, E e) {
        int i4;
        if (i >= 0 && i <= (i4 = this._size)) {
            ensureCapacity(i4 + 1);
            Object[] objArr = this.content;
            int i6 = this._size;
            if (i != i6) {
                C1127m.h(objArr, i + 1, objArr, i, i6);
            }
            objArr[i] = e;
            this._size++;
            return;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final void minusAssign(E[] elements) {
        j.g(elements, "elements");
        for (E e : elements) {
            remove(e);
        }
    }

    public final boolean removeAll(ObjectList<E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        minusAssign((ObjectList) elements);
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        j.g(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(objArr[i4]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!elements.contains(objArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        minusAssign((ScatterSet) elements);
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        j.g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(elements.getSize() + this._size);
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        add(objArr[(i << 3) + i6]);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        j.g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i6]);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean removeAll(List<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        minusAssign((List) elements);
        return i != this._size;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!elements.contains(objArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        minusAssign((Iterable) elements);
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i, Collection<? extends E> elements) {
        j.g(elements, "elements");
        if (i >= 0 && i <= this._size) {
            int i4 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(elements.size() + this._size);
            Object[] objArr = this.content;
            if (i != this._size) {
                C1127m.h(objArr, elements.size() + i, objArr, i, this._size);
            }
            for (Object obj : elements) {
                int i6 = i4 + 1;
                if (i4 >= 0) {
                    objArr[i4 + i] = obj;
                    i4 = i6;
                } else {
                    C1132s.k();
                    throw null;
                }
            }
            this._size = elements.size() + this._size;
            return true;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(E[] elements) {
        j.g(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        C1127m.j(elements, this.content, this._size, 0, 0, 12);
        this._size += elements.length;
    }

    public final boolean removeAll(Sequence<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        minusAssign((Sequence) elements);
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(Sequence<? extends E> elements) {
        j.g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!C1110A.v(elements, objArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final void plusAssign(List<? extends E> elements) {
        j.g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i = this._size;
        ensureCapacity(elements.size() + i);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4 + i] = elements.get(i4);
        }
        this._size = elements.size() + this._size;
    }

    public final boolean retainAll(Sequence<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        int i4 = i - 1;
        while (true) {
            int i6 = -1;
            if (-1 >= i4) {
                return i != this._size;
            }
            Object obj = objArr[i4];
            Iterator it = elements.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i10 >= 0) {
                    if (j.b(obj, next)) {
                        i6 = i10;
                        break;
                    }
                    i10++;
                } else {
                    C1132s.k();
                    throw null;
                }
            }
            if (!(i6 >= 0)) {
                removeAt(i4);
            }
            i4--;
        }
    }

    public final void plusAssign(E e) {
        add(e);
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(Sequence<? extends E> elements) {
        j.g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@IntRange(from = 0) int i, ObjectList<E> elements) {
        j.g(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                C1127m.h(objArr, elements._size + i, objArr, i, i4);
            }
            C1127m.h(elements.content, i, objArr, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final boolean addAll(ObjectList<E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((ObjectList) elements);
        return i != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((ScatterSet) elements);
        return i != this._size;
    }

    public final boolean addAll(E[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((Object[]) elements);
        return i != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((List) elements);
        return i != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((Iterable) elements);
        return i != this._size;
    }

    public final boolean addAll(Sequence<? extends E> elements) {
        j.g(elements, "elements");
        int i = this._size;
        plusAssign((Sequence) elements);
        return i != this._size;
    }
}
