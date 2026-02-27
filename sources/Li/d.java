package Li;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3008b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3007a = new ConcurrentHashMap();
    public final Object c = new Object();

    public d(f fVar) {
        this.f3008b = fVar;
    }

    @Override // Fi.a
    public final void clear() {
        synchronized (this.c) {
            try {
                Iterator it = this.f3007a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Li.c
    public final b d(String str) {
        b bVar;
        synchronized (this.c) {
            try {
                if (this.f3007a.get(str) == null) {
                    this.f3007a.put(str, new e(str, this.f3008b));
                }
                bVar = (b) this.f3007a.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // Li.c
    public final long l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3007a.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((b) it.next()).getAll());
        }
        return hashSet.size();
    }
}
