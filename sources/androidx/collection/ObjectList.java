package androidx.collection;

import We.s;
import androidx.annotation.IntRange;
import androidx.camera.core.impl.a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.ranges.d;
import qj.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    /* JADX INFO: renamed from: androidx.collection.ObjectList$toString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<E, CharSequence> {
        final /* synthetic */ ObjectList<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ObjectList<E> objectList) {
            super(1);
            this.this$0 = objectList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ ObjectList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i4, Object obj) {
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
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i, charSequence5, function12);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        j.g(elements, "elements");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        return (E) this.content[i];
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i, Function1<? super Integer, ? extends E> defaultValue) {
        j.g(defaultValue, "defaultValue");
        return (i < 0 || i >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(i)) : (E) this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList._size;
            int i4 = this._size;
            if (i == i4) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                kotlin.ranges.IntRange intRangeF = d.f(0, i4);
                int i6 = intRangeF.f18201a;
                int i10 = intRangeF.f18202b;
                if (i6 > i10) {
                    return true;
                }
                while (j.b(objArr[i6], objArr2[i6])) {
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

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r9, Function2<? super R, ? super E, ? extends R> operation) {
        j.g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            r9 = (R) operation.invoke(r9, objArr[i4]);
        }
        return r9;
    }

    public final <R> R foldIndexed(R r9, n operation) {
        j.g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            r9 = (R) operation.invoke(Integer.valueOf(i4), r9, objArr[i4]);
        }
        return r9;
    }

    public final <R> R foldRight(R r9, Function2<? super E, ? super R, ? extends R> operation) {
        j.g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r9;
            }
            r9 = (R) operation.invoke(objArr[i], r9);
        }
    }

    public final <R> R foldRightIndexed(R r9, n operation) {
        j.g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r9;
            }
            r9 = (R) operation.invoke(Integer.valueOf(i), objArr[i], r9);
        }
    }

    public final void forEach(Function1<? super E, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            block.invoke(objArr[i4]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            block.invoke(Integer.valueOf(i4), objArr[i4]);
        }
    }

    public final void forEachReversed(Function1<? super E, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int i) {
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException(a.l(s.t(i, "Index ", " must be in 0.."), this._size, 1));
        }
        return (E) this.content[i];
    }

    public final kotlin.ranges.IntRange getIndices() {
        return d.f(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[i4];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.content;
            int i4 = this._size;
            while (i < i4) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i6 = this._size;
        while (i < i6) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (((Boolean) predicate.invoke(objArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i])).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e) {
        if (e == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i4 = this._size - 1; -1 < i4; i4--) {
                if (e.equals(objArr2[i4])) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(objArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new AnonymousClass1(this), 25, null);
    }

    private ObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public final boolean any(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (((Boolean) predicate.invoke(objArr[i4])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            if (((Boolean) predicate.invoke(objArr[i6])).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            E e = (E) objArr[i4];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        j.g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        j.g(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        E e;
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            e = (E) objArr[i];
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final E first(Function1<? super E, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i4 = 0; i4 < i; i4++) {
            E e = (E) objArr[i4];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        j.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, null, 48, null);
    }

    public final E last(Function1<? super E, Boolean> predicate) {
        E e;
        j.g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                e = (E) objArr[i];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        j.g(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        j.g(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i4 = 0; i4 < i; i4++) {
            if (!contains(objArr[i4])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2, Function1<? super E, ? extends CharSequence> function1) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        StringBuilder sbT = a.t(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.content;
        int i4 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i4) {
                Object obj = objArr[i6];
                if (i6 == i) {
                    sbT.append(charSequence2);
                    break;
                }
                if (i6 != 0) {
                    sbT.append(separator);
                }
                if (function1 == null) {
                    sbT.append(obj);
                } else {
                    sbT.append((CharSequence) function1.invoke(obj));
                }
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
}
