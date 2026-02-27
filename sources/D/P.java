package D;

import af.C0690e;
import bi.C1026d;
import gi.C1525c;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import ji.C1684a;
import ki.C1781b;
import pi.C2154d;

/* JADX INFO: loaded from: classes2.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f859b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f860d;

    public /* synthetic */ P(int i, Object obj, Object obj2, Object obj3) {
        this.f858a = i;
        this.c = obj;
        this.f860d = obj2;
        this.f859b = obj3;
    }

    private final void a() {
        synchronized (af.l.f) {
            af.l.a((af.l) this.c, (C0690e) this.f860d);
        }
        ((pg.t) this.f859b).success(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.P.run():void");
    }

    public /* synthetic */ P(int i, Object obj, Object obj2, Object obj3, boolean z4) {
        this.f858a = i;
        this.f860d = obj;
        this.f859b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ P(int i, String str, Object obj, Object obj2) {
        this.f858a = i;
        this.c = obj;
        this.f859b = str;
        this.f860d = obj2;
    }

    public P(ConcurrentHashMap concurrentHashMap, ImpressionsObserverCacheDao impressionsObserverCacheDao, C2154d c2154d) {
        this.f858a = 7;
        this.f860d = concurrentHashMap;
        this.f859b = impressionsObserverCacheDao;
        this.c = new WeakReference(c2154d);
    }

    public P(Xh.d dVar, ki.h hVar, SplitRoomDatabase splitRoomDatabase, Gi.d dVar2, C1026d c1026d, C1781b c1781b, C1781b c1781b2, C0176i c0176i, zi.c cVar, C1525c c1525c, ReentrantLock reentrantLock) {
        this.f858a = 3;
        C1684a c1684a = new C1684a(dVar, c0176i, new Gi.b(splitRoomDatabase, dVar2));
        Xh.j jVar = new Xh.j(c1026d, c1781b, c1781b2, cVar, c1525c, reentrantLock);
        this.f860d = c1684a;
        this.f859b = jVar;
        this.c = reentrantLock;
    }
}
