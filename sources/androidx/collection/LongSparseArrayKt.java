package androidx.collection;

import We.s;
import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1127m;
import cj.J;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes.dex */
public final class LongSparseArrayKt {
    private static final Object DELETED = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07491<T> implements Iterator<T>, InterfaceC2210a {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C07491(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }
    }

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        if (i != 0 && j <= longSparseArray.keys[i - 1]) {
            longSparseArray.put(j, e);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i4 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    Object obj = objArr[i6];
                    if (obj != DELETED) {
                        if (i6 != i4) {
                            jArr[i4] = jArr[i6];
                            objArr[i4] = obj;
                            objArr[i6] = null;
                        }
                        i4++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i4;
            }
        }
        int i10 = longSparseArray.size;
        if (i10 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i10 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i10] = j;
        longSparseArray.values[i10] = e;
        longSparseArray.size = i10 + 1;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        j.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e) >= 0;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        j.g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != DELETED) {
                if (i6 != i4) {
                    jArr[i4] = jArr[i6];
                    objArr[i4] = obj;
                    objArr[i6] = null;
                }
                i4++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i4;
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j) {
        j.g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[iBinarySearch];
    }

    public static final <T extends E, E> T commonGetInternal(LongSparseArray<E> longSparseArray, long j, T t5) {
        j.g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? t5 : (T) longSparseArray.values[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j) {
        j.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e) {
        j.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        int i10 = longSparseArray.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (longSparseArray.values[i11] == e) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i) {
        int i4;
        j.g(longSparseArray, "<this>");
        if (i < 0 || i >= (i4 = longSparseArray.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        return longSparseArray.keys[i];
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        if (i < longSparseArray.size && longSparseArray.values[i] == DELETED) {
            longSparseArray.keys[i] = j;
            longSparseArray.values[i] = e;
            return;
        }
        if (longSparseArray.garbage) {
            int i4 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i4 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i6 = 0;
                for (int i10 = 0; i10 < i4; i10++) {
                    Object obj = objArr[i10];
                    if (obj != DELETED) {
                        if (i10 != i6) {
                            jArr[i6] = jArr[i10];
                            objArr[i6] = obj;
                            objArr[i10] = null;
                        }
                        i6++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i6;
                i = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i6, j);
            }
        }
        int i11 = longSparseArray.size;
        if (i11 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        int i12 = longSparseArray.size;
        if (i12 - i != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i13 = i + 1;
            C1127m.g(jArr2, jArr2, i13, i, i12);
            Object[] objArr2 = longSparseArray.values;
            C1127m.h(objArr2, i13, objArr2, i, longSparseArray.size);
        }
        longSparseArray.keys[i] = j;
        longSparseArray.values[i] = e;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> other) {
        j.g(longSparseArray, "<this>");
        j.g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        E e7 = longSparseArray.get(j);
        if (e7 == null) {
            longSparseArray.put(j, e);
        }
        return e7;
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j) {
        j.g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[iBinarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i) {
        j.g(longSparseArray, "<this>");
        if (longSparseArray.values[i] != DELETED) {
            longSparseArray.values[i] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e7 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e7;
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i, E e) {
        int i4;
        j.g(longSparseArray, "<this>");
        if (i < 0 || i >= (i4 = longSparseArray.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        longSparseArray.values[i] = e;
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        j.g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return longSparseArray.size;
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        j.g(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(longSparseArray.size * 28);
        sb2.append('{');
        int i = longSparseArray.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            sb2.append(longSparseArray.keyAt(i4));
            sb2.append('=');
            E eValueAt = longSparseArray.valueAt(i4);
            if (eValueAt != sb2) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return a.k(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i) {
        int i4;
        j.g(longSparseArray, "<this>");
        if (i < 0 || i >= (i4 = longSparseArray.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        return (E) longSparseArray.values[i];
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.containsKey(j);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Function2<? super Long, ? super T, Unit> action) {
        j.g(longSparseArray, "<this>");
        j.g(action, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t5) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.get(j, t5);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, Function0<? extends T> defaultValue) {
        j.g(longSparseArray, "<this>");
        j.g(defaultValue, "defaultValue");
        T t5 = longSparseArray.get(j);
        return t5 == null ? (T) defaultValue.invoke() : t5;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        j.g(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    public static final <T> J keyIterator(final LongSparseArray<T> longSparseArray) {
        j.g(longSparseArray, "<this>");
        return new J() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // cj.J
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> other) {
        j.g(longSparseArray, "<this>");
        j.g(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(other.size() + longSparseArray.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j, Object obj) {
        j.g(longSparseArray, "<this>");
        return longSparseArray.remove(j, obj);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t5) {
        j.g(longSparseArray, "<this>");
        longSparseArray.put(j, t5);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        j.g(longSparseArray, "<this>");
        return new C07491(longSparseArray);
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? e : (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j, E e, E e7) {
        j.g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0 || !j.b(longSparseArray.values[iIndexOfKey], e)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e7;
        return true;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j, E e) {
        j.g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0 || !j.b(e, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }
}
