package b2;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import y2.C2499a;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements y2.d, y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8364a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f8365b = new ArrayDeque();
    public final Executor c;

    public i(Executor executor) {
        this.c = executor;
    }

    @Override // y2.c
    public final void a(C2499a c2499a) {
        c2499a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f8365b;
                if (arrayDeque != null) {
                    arrayDeque.add(c2499a);
                    return;
                }
                for (Map.Entry entry : b(c2499a)) {
                    ((Executor) entry.getValue()).execute(new androidx.media3.common.util.g(13, entry, c2499a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Set b(C2499a c2499a) {
        Map map;
        try {
            HashMap map2 = this.f8364a;
            c2499a.getClass();
            map = (Map) map2.get(U1.b.class);
        } catch (Throwable th2) {
            throw th2;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    public final synchronized void c(Executor executor, y2.b bVar) {
        try {
            executor.getClass();
            if (!this.f8364a.containsKey(U1.b.class)) {
                this.f8364a.put(U1.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f8364a.get(U1.b.class)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
