package cj;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cj.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1110A extends z {
    public static Object A(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object B(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object C(int i, List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void D(Iterable iterable, StringBuilder sb2, CharSequence separator, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        kotlin.jvm.internal.j.g(separator, "separator");
        sb2.append(charSequence);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb2.append(separator);
            }
            zj.r.a(sb2, obj, function1);
        }
        sb2.append(charSequence2);
    }

    public static /* synthetic */ void E(ArrayList arrayList, StringBuilder sb2, String str, G7.F f, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str2 = str;
        if ((i & 64) != 0) {
            f = null;
        }
        D(arrayList, sb2, str2, "", "", "...", f);
    }

    public static String F(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        kotlin.jvm.internal.j.g(iterable, "<this>");
        kotlin.jvm.internal.j.g(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        D(iterable, sb2, str4, prefix, str5, "...", function1);
        return sb2.toString();
    }

    public static Object G(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C1132s.f(list));
    }

    public static Object H(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return We.s.e(1, list);
    }

    public static Comparable I(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable J(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList K(Iterable iterable, Object obj) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(t.l(iterable, 10));
        boolean z4 = false;
        for (Object obj2 : iterable) {
            boolean z5 = true;
            if (!z4 && kotlin.jvm.internal.j.b(obj2, obj)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList L(Iterable elements, Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        kotlin.jvm.internal.j.g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x.p(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList M(Object obj, Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList N(kotlin.ranges.b bVar, kotlin.ranges.b bVar2) {
        if (bVar instanceof Collection) {
            return L(bVar2, (Collection) bVar);
        }
        ArrayList arrayList = new ArrayList();
        x.p(bVar, arrayList);
        x.p(bVar2, arrayList);
        return arrayList;
    }

    public static List O(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return V(iterable);
        }
        List listX = X(iterable);
        Collections.reverse(listX);
        return listX;
    }

    public static Object P(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List Q(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listX = X(iterable);
            w.o(listX, comparator);
            return listX;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.j.g(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C1127m.c(array);
    }

    public static List R(Iterable iterable, int i) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(We.s.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C1112C.f9377a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return V(iterable);
            }
            if (i == 1) {
                return r.c(z(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == i) {
                break;
            }
        }
        return C1132s.i(arrayList);
    }

    public static final void S(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet T(ArrayList arrayList) {
        kotlin.jvm.internal.j.g(arrayList, "<this>");
        HashSet hashSet = new HashSet(L.b(t.l(arrayList, 12)));
        S(arrayList, hashSet);
        return hashSet;
    }

    public static int[] U(Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List V(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C1132s.i(X(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1112C.f9377a;
        }
        if (size != 1) {
            return W(collection);
        }
        return r.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList W(Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List X(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return W((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        S(iterable, arrayList);
        return arrayList;
    }

    public static Set Y(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        S(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set Z(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            S(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : P.b(linkedHashSet.iterator().next()) : C1114E.f9379a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return C1114E.f9379a;
        }
        if (size2 == 1) {
            return P.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(L.b(collection.size()));
        S(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static Rj.g a0(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        return new Rj.g(new W4.b(iterable, 11), 1);
    }

    public static C1128n u(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        return new C1128n(iterable, 1);
    }

    public static boolean v(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    C1132s.k();
                    throw null;
                }
                if (kotlin.jvm.internal.j.b(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List w(ArrayList arrayList) {
        return V(Y(arrayList));
    }

    public static List x(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return R(list2, size);
    }

    public static ArrayList y(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object z(Iterable iterable) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        if (iterable instanceof List) {
            return A((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
