package androidx.collection;

import We.s;
import androidx.camera.core.impl.a;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import qj.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class LongList {
    public int _size;
    public long[] content;

    public /* synthetic */ LongList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i4 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i4 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i4 & 8) != 0) {
            i = -1;
        }
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(long j) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (jArr[i4] == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(LongList elements) {
        j.g(elements, "elements");
        IntRange intRangeF = d.f(0, elements._size);
        int i = intRangeF.f18201a;
        int i4 = intRangeF.f18202b;
        if (i > i4) {
            return true;
        }
        while (contains(elements.get(i))) {
            if (i == i4) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final long elementAt(@androidx.annotation.IntRange(from = 0) int i) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        return this.content[i];
    }

    public final long elementAtOrElse(@androidx.annotation.IntRange(from = 0) int i, Function1<? super Integer, Long> defaultValue) {
        j.g(defaultValue, "defaultValue");
        return (i < 0 || i >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i))).longValue() : this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i = longList._size;
            int i4 = this._size;
            if (i == i4) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                IntRange intRangeF = d.f(0, i4);
                int i6 = intRangeF.f18201a;
                int i10 = intRangeF.f18202b;
                if (i6 > i10) {
                    return true;
                }
                while (jArr[i6] == jArr2[i6]) {
                    if (i6 == i10) {
                        return true;
                    }
                    i6++;
                }
                return false;
            }
        }
        return false;
    }

    public final long first() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r9, Function2<? super R, ? super Long, ? extends R> operation) {
        j.g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            r9 = (R) operation.invoke(r9, Long.valueOf(jArr[i4]));
        }
        return r9;
    }

    public final <R> R foldIndexed(R r9, n operation) {
        j.g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            R r10 = r9;
            r9 = (R) operation.invoke(Integer.valueOf(i4), r10, Long.valueOf(jArr[i4]));
        }
        return r9;
    }

    public final <R> R foldRight(R r9, Function2<? super Long, ? super R, ? extends R> operation) {
        j.g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r9;
            }
            r9 = (R) operation.invoke(Long.valueOf(jArr[i]), r9);
        }
    }

    public final <R> R foldRightIndexed(R r9, n operation) {
        j.g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r9;
            }
            r9 = (R) operation.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), r9);
        }
    }

    public final void forEach(Function1<? super Long, Unit> block) {
        j.g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            block.invoke(Long.valueOf(jArr[i4]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Long, Unit> block) {
        j.g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            block.invoke(Integer.valueOf(i4), Long.valueOf(jArr[i4]));
        }
    }

    public final void forEachReversed(Function1<? super Long, Unit> block) {
        j.g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Long, Unit> block) {
        j.g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]));
            }
        }
    }

    public final long get(@androidx.annotation.IntRange(from = 0) int i) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        return this.content[i];
    }

    public final IntRange getIndices() {
        return d.f(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            long j = jArr[i6];
            i4 += ((int) (j ^ (j >>> 32))) * 31;
        }
        return i4;
    }

    public final int indexOf(long j) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (j == jArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(long j) {
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (jArr[i] != j);
        return i;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i) {
        this.content = i == 0 ? LongSetKt.getEmptyLongArray() : new long[i];
    }

    public final boolean any(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i4]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i6]))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    public final String joinToString(CharSequence separator) {
        j.g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final long first(Function1<? super Long, Boolean> predicate) {
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            long j = jArr[i4];
            if (((Boolean) predicate.invoke(Long.valueOf(j))).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                separator = ", ";
            }
            if ((i4 & 2) != 0) {
                prefix = "";
            }
            if ((i4 & 4) != 0) {
                postfix = "";
            }
            if ((i4 & 8) != 0) {
                i = -1;
            }
            if ((i4 & 16) != 0) {
                charSequence = "...";
            }
            j.g(separator, "separator");
            j.g(prefix, "prefix");
            j.g(postfix, "postfix");
            StringBuilder sbU = a.u(charSequence, "truncated", function1, "transform", prefix);
            long[] jArr = longList.content;
            int i6 = longList._size;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    long j = jArr[i10];
                    if (i10 == i) {
                        sbU.append(charSequence);
                        break;
                    }
                    if (i10 != 0) {
                        sbU.append(separator);
                    }
                    sbU.append((CharSequence) function1.invoke(Long.valueOf(j)));
                    i10++;
                } else {
                    sbU.append(postfix);
                    break;
                }
            }
            String string = sbU.toString();
            j.f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final long last(Function1<? super Long, Boolean> predicate) {
        long j;
        j.g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                j = jArr[i];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j))).booleanValue());
        return j;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        StringBuilder sbT = a.t(charSequence, "postfix", charSequence2, "truncated", prefix);
        long[] jArr = this.content;
        int i4 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i4) {
                long j = jArr[i6];
                if (i6 == i) {
                    sbT.append(charSequence2);
                    break;
                }
                if (i6 != 0) {
                    sbT.append(separator);
                }
                sbT.append(j);
                i6++;
            } else {
                sbT.append(charSequence);
                break;
            }
        }
        String string = sbT.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, Function1<? super Long, ? extends CharSequence> function1) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        StringBuilder sbU = a.u(charSequence, "truncated", function1, "transform", prefix);
        long[] jArr = this.content;
        int i4 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i4) {
                long j = jArr[i6];
                if (i6 == i) {
                    sbU.append(charSequence);
                    break;
                }
                if (i6 != 0) {
                    sbU.append(separator);
                }
                sbU.append((CharSequence) function1.invoke(Long.valueOf(j)));
                i6++;
            } else {
                sbU.append(postfix);
                break;
            }
        }
        String string = sbU.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, Function1<? super Long, ? extends CharSequence> function1) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        StringBuilder sbU = a.u(charSequence, "postfix", function1, "transform", prefix);
        long[] jArr = this.content;
        int i4 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i4) {
                long j = jArr[i6];
                if (i6 == i) {
                    sbU.append((CharSequence) "...");
                    break;
                }
                if (i6 != 0) {
                    sbU.append(separator);
                }
                sbU.append((CharSequence) function1.invoke(Long.valueOf(j)));
                i6++;
            } else {
                sbU.append(charSequence);
                break;
            }
        }
        String string = sbU.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, Function1<? super Long, ? extends CharSequence> function1) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        StringBuilder sbU = a.u(charSequence, "postfix", function1, "transform", prefix);
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                long j = jArr[i4];
                if (i4 == -1) {
                    sbU.append((CharSequence) "...");
                    break;
                }
                if (i4 != 0) {
                    sbU.append(separator);
                }
                sbU.append((CharSequence) function1.invoke(Long.valueOf(j)));
                i4++;
            } else {
                sbU.append(charSequence);
                break;
            }
        }
        String string = sbU.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence charSequence, Function1<? super Long, ? extends CharSequence> function1) {
        j.g(separator, "separator");
        StringBuilder sbU = a.u(charSequence, "prefix", function1, "transform", charSequence);
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                long j = jArr[i4];
                if (i4 == -1) {
                    sbU.append((CharSequence) "...");
                    break;
                }
                if (i4 != 0) {
                    sbU.append(separator);
                }
                sbU.append((CharSequence) function1.invoke(Long.valueOf(j)));
                i4++;
            } else {
                sbU.append((CharSequence) "");
                break;
            }
        }
        String string = sbU.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, Function1<? super Long, ? extends CharSequence> transform) {
        j.g(separator, "separator");
        j.g(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                long j = jArr[i4];
                if (i4 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i4 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Long.valueOf(j)));
                i4++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(Function1<? super Long, ? extends CharSequence> transform) {
        j.g(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.content;
        int i = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                long j = jArr[i4];
                if (i4 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i4 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) transform.invoke(Long.valueOf(j)));
                i4++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
