package V2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6040b;

    public b(Set set, c cVar) {
        this.f6039a = b(set);
        this.f6040b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6037a);
            sb2.append('/');
            sb2.append(aVar.f6038b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        c cVar = this.f6040b;
        synchronized (((HashSet) cVar.f6042b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f6042b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f6039a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.b());
    }
}
