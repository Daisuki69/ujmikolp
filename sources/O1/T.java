package O1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f4556a = C.a();

    public final U a() {
        Collection collectionEntrySet = this.f4556a.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return I.f4548g;
        }
        C0531z<Map.Entry> c0531z = (C0531z) collectionEntrySet;
        W w6 = new W(((C) c0531z.f4621b).size());
        int size = 0;
        for (Map.Entry entry : c0531z) {
            Object key = entry.getKey();
            S sK = S.k((Collection) entry.getValue());
            if (!sK.isEmpty()) {
                w6.b(key, sK);
                size = sK.size() + size;
            }
        }
        return new U(w6.a(), size);
    }

    public final void b(String str, Object... objArr) {
        c(Arrays.asList(objArr), str);
    }

    public final void c(Iterable iterable, Object obj) {
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder("null key in entry: null=");
            Iterator it = iterable.iterator();
            StringBuilder sb3 = new StringBuilder("[");
            boolean z4 = true;
            while (it.hasNext()) {
                if (!z4) {
                    sb3.append(", ");
                }
                sb3.append(it.next());
                z4 = false;
            }
            sb3.append(']');
            sb2.append(sb3.toString());
            throw new NullPointerException(sb2.toString());
        }
        C c = this.f4556a;
        Collection collection = (Collection) c.get(obj);
        if (collection != null) {
            for (Object obj2 : iterable) {
                AbstractC0529x.c(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                Object next = it2.next();
                AbstractC0529x.c(obj, next);
                arrayList.add(next);
            }
            c.put(obj, arrayList);
        }
    }
}
