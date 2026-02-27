package m1;

import We.s;
import Z0.e;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1844a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f18327a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f18328b;

    static {
        HashMap map = new HashMap();
        f18328b = map;
        map.put(e.f6874a, 0);
        map.put(e.f6875b, 1);
        map.put(e.c, 2);
        for (e eVar : map.keySet()) {
            f18327a.append(((Integer) f18328b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f18328b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i) {
        e eVar = (e) f18327a.get(i);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(s.f(i, "Unknown Priority for value "));
    }
}
