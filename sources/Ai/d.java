package Ai;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f327a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f328b = new ConcurrentHashMap();

    @Override // Ai.a
    public final synchronized void a() {
        try {
            Iterator it = this.f328b.values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            this.f327a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Ai.c
    public final synchronized void c(String str, b bVar) {
        this.f328b.put(str, bVar);
        if (this.f327a.get()) {
            bVar.a();
        }
    }

    @Override // Ai.c
    public final void d(String str) {
        this.f328b.remove(str);
    }
}
