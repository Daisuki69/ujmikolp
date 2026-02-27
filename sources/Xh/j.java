package Xh;

import bi.C1026d;
import gi.C1525c;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import ki.C1781b;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1026d f6648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1781b f6649b;
    public final C1781b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zi.c f6650d;
    public final C1525c e;
    public final ReentrantLock f;

    public j(C1026d c1026d, C1781b c1781b, C1781b c1781b2, zi.c cVar, C1525c c1525c, ReentrantLock reentrantLock) {
        this.f6648a = c1026d;
        this.f6649b = c1781b;
        this.c = c1781b2;
        this.f6650d = cVar;
        this.e = c1525c;
        this.f = reentrantLock;
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        zi.c cVar = this.f6650d;
        ReentrantLock reentrantLock = this.f;
        try {
            this.f6649b.f();
            this.c.f();
            this.f6648a.a(bi.i.j);
            cVar.b();
            this.e.f16847a.add(new WeakReference(cVar));
            Ri.a.k("Android SDK initialized!");
        } catch (Exception e) {
            Ri.a.h("Error initializing Android SDK", e);
        } finally {
            reentrantLock.unlock();
        }
    }
}
