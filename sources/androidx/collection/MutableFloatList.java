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
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final boolean add(float f) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = f;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i, float[] elements) {
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
        float[] fArr = this.content;
        int i6 = this._size;
        if (i != i6) {
            C1127m.f(fArr, elements.length + i, fArr, i, i6);
        }
        C1127m.f(elements, i, fArr, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        float[] fArr = this.content;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            j.f(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(FloatList elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f) {
        int iIndexOf = indexOf(f);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(@IntRange(from = 0) int i) {
        int i4;
        if (i < 0 || i >= (i4 = this._size)) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        float[] fArr = this.content;
        float f = fArr[i];
        if (i != i4 - 1) {
            C1127m.f(fArr, i, fArr, i + 1, i4);
        }
        this._size--;
        return f;
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
                float[] fArr = this.content;
                C1127m.f(fArr, i, fArr, i4, i6);
            }
            this._size -= i4 - i;
        }
    }

    public final boolean retainAll(float[] elements) {
        j.g(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        int i4 = i - 1;
        while (true) {
            int i6 = 0;
            int i10 = -1;
            if (-1 >= i4) {
                break;
            }
            float f = fArr[i4];
            int length = elements.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == f) {
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

    public final float set(@IntRange(from = 0) int i, float f) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "set index ", " must be between 0 .. "), this._size, 1));
        }
        float[] fArr = this.content;
        float f3 = fArr[i];
        fArr[i] = f;
        return f3;
    }

    public final void sort() {
        float[] fArr = this.content;
        int i = this._size;
        j.g(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
    }

    public final void sortDescending() {
        float[] fArr = this.content;
        int i = this._size;
        j.g(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = fArr.length;
        aVar.getClass();
        AbstractC1117c.a.d(0, i, length);
        int i4 = i / 2;
        if (i4 == 0) {
            return;
        }
        int i6 = i - 1;
        for (int i10 = 0; i10 < i4; i10++) {
            float f = fArr[i10];
            fArr[i10] = fArr[i6];
            fArr[i6] = f;
            i6--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            j.f(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public /* synthetic */ MutableFloatList(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(float[] elements) {
        j.g(elements, "elements");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void plusAssign(float[] elements) {
        j.g(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final void plusAssign(float f) {
        add(f);
    }

    public final void add(@IntRange(from = 0) int i, float f) {
        int i4;
        if (i >= 0 && i <= (i4 = this._size)) {
            ensureCapacity(i4 + 1);
            float[] fArr = this.content;
            int i6 = this._size;
            if (i != i6) {
                C1127m.f(fArr, i + 1, fArr, i, i6);
            }
            fArr[i] = f;
            this._size++;
            return;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final void minusAssign(FloatList elements) {
        j.g(elements, "elements");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(fArr[i4]);
        }
    }

    public final boolean removeAll(FloatList elements) {
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

    public final boolean retainAll(FloatList elements) {
        j.g(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        for (int i4 = i - 1; -1 < i4; i4--) {
            if (!elements.contains(fArr[i4])) {
                removeAt(i4);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i, FloatList elements) {
        j.g(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            float[] fArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                C1127m.f(fArr, elements._size + i, fArr, i, i4);
            }
            C1127m.f(elements.content, i, fArr, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbT = s.t(i, "Index ", " must be in 0..");
        sbT.append(this._size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final boolean addAll(FloatList elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        j.g(elements, "elements");
        return addAll(this._size, elements);
    }
}
