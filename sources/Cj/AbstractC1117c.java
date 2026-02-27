package cj;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1117c<E> extends AbstractC1115a implements List<E> {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: renamed from: cj.c$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i, int i4, int i6) {
            if (i < 0 || i4 > i6) {
                StringBuilder sbU = We.s.u("startIndex: ", i, ", endIndex: ", i4, ", size: ");
                sbU.append(i6);
                throw new IndexOutOfBoundsException(sbU.toString());
            }
            if (i > i4) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i, i4, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i, int i4) {
            if (i < 0 || i >= i4) {
                throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.c(i, i4, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i4) {
            if (i < 0 || i > i4) {
                throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.c(i, i4, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i4, int i6) {
            if (i < 0 || i4 > i6) {
                StringBuilder sbU = We.s.u("fromIndex: ", i, ", toIndex: ", i4, ", size: ");
                sbU.append(i6);
                throw new IndexOutOfBoundsException(sbU.toString());
            }
            if (i > i4) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i, i4, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i, int i4) {
            int i6 = i + (i >> 1);
            if (i6 - i4 < 0) {
                i6 = i4;
            }
            if (i6 - AbstractC1117c.maxArraySize <= 0) {
                return i6;
            }
            if (i4 > AbstractC1117c.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return AbstractC1117c.maxArraySize;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Companion.getClass();
        kotlin.jvm.internal.j.g(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.j.b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Companion.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.j.b(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new Rj.f(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.j.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C1118d(this, 0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i4) {
        return new C1119e(this, i, i4);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C1118d(this, i);
    }
}
