package cj;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import rj.InterfaceC2210a;
import rj.InterfaceC2211b;

/* JADX INFO: loaded from: classes4.dex */
public class x extends w {
    public static void p(Iterable elements, Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        kotlin.jvm.internal.j.g(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void q(Collection collection, Object[] elements) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        kotlin.jvm.internal.j.g(elements, "elements");
        collection.addAll(C1127m.c(elements));
    }

    public static final boolean r(Iterable iterable, Function1 function1, boolean z4) {
        Iterator it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z4) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    public static void s(List list, Function1 function1) {
        int iF;
        kotlin.jvm.internal.j.g(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC2210a) && !(list instanceof InterfaceC2211b)) {
                kotlin.jvm.internal.D.g(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                r(list, function1, true);
                return;
            } catch (ClassCastException e) {
                kotlin.jvm.internal.j.k(e, kotlin.jvm.internal.D.class.getName());
                throw e;
            }
        }
        int iF2 = C1132s.f(list);
        int i = 0;
        if (iF2 >= 0) {
            int i4 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i4 != i) {
                        list.set(i4, obj);
                    }
                    i4++;
                }
                if (i == iF2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i4;
        }
        if (i >= list.size() || i > (iF = C1132s.f(list))) {
            return;
        }
        while (true) {
            list.remove(iF);
            if (iF == i) {
                return;
            } else {
                iF--;
            }
        }
    }

    public static Object t(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C1132s.f(list));
    }
}
