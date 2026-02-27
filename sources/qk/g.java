package qk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements ok.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f19818a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19819b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // ok.a
    public final synchronized ok.b a(String str) {
        f fVar;
        fVar = (f) this.f19819b.get(str);
        if (fVar == null) {
            fVar = new f(str, this.c, this.f19818a);
            this.f19819b.put(str, fVar);
        }
        return fVar;
    }
}
