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
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final boolean add(int i) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i4 = this._size;
        iArr[i4] = i;
        this._size = i4 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i, int[] elements) {
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
        int[] iArr = this.content;
        int i6 = this._size;
        if (i != i6) {
            C1127m.e(elements.length + i, i, i6, iArr, iArr);
        }
        C1127m.i(i, 0, 12, elements, iArr);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.content;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(IntList elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        for (int i4 : elements) {
            remove(i4);
        }
        return i != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int i) {
        int i4;
        if (i < 0 || i >= (i4 = this._size)) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        int[] iArr = this.content;
        int i6 = iArr[i];
        if (i != i4 - 1) {
            C1127m.e(i, i + 1, i4, iArr, iArr);
        }
        this._size--;
        return i6;
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
                int[] iArr = this.content;
                C1127m.e(i, i4, i6, iArr, iArr);
            }
            this._size -= i4 - i;
        }
    }

    public final boolean retainAll(int[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        int i4 = i - 1;
        while (true) {
            int i6 = 0;
            int i10 = -1;
            if (-1 >= i4) {
                break;
            }
            int i11 = iArr[i4];
            int length = elements.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == i11) {
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

    public final int set(@IntRange(from = 0) int i, int i4) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "set index ", " must be between 0 .. "), this._size, 1));
        }
        int[] iArr = this.content;
        int i6 = iArr[i];
        iArr[i] = i4;
        return i6;
    }

    public final void sort() {
        int[] iArr = this.content;
        int i = this._size;
        j.g(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
    }

    public final void sortDescending() {
        int[] iArr = this.content;
        int i = this._size;
        j.g(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = iArr.length;
        aVar.getClass();
        AbstractC1117c.a.d(0, i, length);
        int i4 = i / 2;
        if (i4 == 0) {
            return;
        }
        int i6 = i - 1;
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[i6];
            iArr[i6] = i11;
            i6--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(int[] elements) {
        j.g(elements, "elements");
        for (int i : elements) {
            remove(i);
        }
    }

    public final void plusAssign(int[] elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void plusAssign(int i) {
        add(i);
    }

    public final void add(@IntRange(from = 0) int i, int i4) {
        int i6;
        if (i >= 0 && i <= (i6 = this._size)) {
            ensureCapacity(i6 + 1);
            int[] iArr = this.content;
            int i10 = this._size;
            if (i != i10) {
                C1127m.e(i + 1, i, i10, iArr, iArr);
            }
            iArr[i] = i4;
            this._size++;
            return;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final void minusAssign(IntList elements) {
        j.g(elements, "elements");
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(iArr[i4]);
        }
    }

    public final boolean removeAll(IntList elements) {
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

    public final boolean retainAll(IntList elements) {
        j.g(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!elements.contains(iArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i, IntList elements) {
        j.g(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                C1127m.e(elements._size + i, i, i4, iArr, iArr);
            }
            C1127m.e(i, 0, elements._size, elements.content, iArr);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final boolean addAll(IntList elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }
}
