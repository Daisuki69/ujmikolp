package cj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class t extends C1132s {
    public static int l(Iterable iterable, int i) {
        kotlin.jvm.internal.j.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList m(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            x.p((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
