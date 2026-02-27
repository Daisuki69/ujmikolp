package androidx.collection;

import We.s;
import androidx.annotation.IntRange;
import androidx.camera.core.impl.a;
import cj.AbstractC1117c;
import cj.C1127m;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final boolean add(long j) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = j;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i, long[] elements) {
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
        long[] jArr = this.content;
        int i6 = this._size;
        if (i != i6) {
            C1127m.g(jArr, jArr, elements.length + i, i, i6);
        }
        C1127m.g(elements, jArr, i, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        long[] jArr = this.content;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j) {
        remove(j);
    }

    public final void plusAssign(LongList elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j) {
        int iIndexOf = indexOf(j);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        for (long j : elements) {
            remove(j);
        }
        return i != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int i) {
        int i4;
        if (i < 0 || i >= (i4 = this._size)) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        long[] jArr = this.content;
        long j = jArr[i];
        if (i != i4 - 1) {
            C1127m.g(jArr, jArr, i, i + 1, i4);
        }
        this._size--;
        return j;
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
                long[] jArr = this.content;
                C1127m.g(jArr, jArr, i, i4, i6);
            }
            this._size -= i4 - i;
        }
    }

    public final boolean retainAll(long[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        int i4 = i - 1;
        while (true) {
            int i6 = 0;
            int i10 = -1;
            if (-1 >= i4) {
                break;
            }
            long j = jArr[i4];
            int length = elements.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == j) {
                    i10 = i6;
                    break;
                }
                i6++;
            }
            if (i10 < 0) {
                removeAt(i4);
            }
            i4--;
        }
        return i != this._size;
    }

    public final long set(@IntRange(from = 0) int i, long j) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "set index ", " must be between 0 .. "), this._size, 1));
        }
        long[] jArr = this.content;
        long j6 = jArr[i];
        jArr[i] = j;
        return j6;
    }

    public final void sort() {
        long[] jArr = this.content;
        int i = this._size;
        j.g(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
    }

    public final void sortDescending() {
        long[] jArr = this.content;
        int i = this._size;
        j.g(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = jArr.length;
        aVar.getClass();
        AbstractC1117c.a.d(0, i, length);
        int i4 = i / 2;
        if (i4 == 0) {
            return;
        }
        int i6 = i - 1;
        for (int i10 = 0; i10 < i4; i10++) {
            long j = jArr[i10];
            jArr[i10] = jArr[i6];
            jArr[i6] = j;
            i6--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(long[] elements) {
        j.g(elements, "elements");
        for (long j : elements) {
            remove(j);
        }
    }

    public final void plusAssign(long[] elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableLongList(int i) {
        super(i, null);
    }

    public final void plusAssign(long j) {
        add(j);
    }

    public final void add(@IntRange(from = 0) int i, long j) {
        int i4;
        if (i >= 0 && i <= (i4 = this._size)) {
            ensureCapacity(i4 + 1);
            long[] jArr = this.content;
            int i6 = this._size;
            if (i != i6) {
                C1127m.g(jArr, jArr, i + 1, i, i6);
            }
            jArr[i] = j;
            this._size++;
            return;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final void minusAssign(LongList elements) {
        j.g(elements, "elements");
        long[] jArr = elements.content;
        int i = elements._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(jArr[i4]);
        }
    }

    public final boolean removeAll(LongList elements) {
        j.g(elements, "elements");
        int i = this._size;
        int i4 = elements._size - 1;
        if (i4 >= 0) {
            int i6 = 0;
            while (true) {
                remove(elements.get(i6));
                if (i6 == i4) {
                    break;
                }
                i6++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(LongList elements) {
        j.g(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!elements.contains(jArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i, LongList elements) {
        j.g(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                C1127m.g(jArr, jArr, elements._size + i, i, i4);
            }
            C1127m.g(elements.content, jArr, i, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final boolean addAll(LongList elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }
}
