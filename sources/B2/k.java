package b2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements B2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f8368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f8369b;

    public final synchronized void a() {
        try {
            Iterator it = this.f8368a.iterator();
            while (it.hasNext()) {
                this.f8369b.add(((B2.b) it.next()).get());
            }
            this.f8368a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // B2.b
    public final Object get() {
        if (this.f8369b == null) {
            synchronized (this) {
                try {
                    if (this.f8369b == null) {
                        this.f8369b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f8369b);
    }
}
