package Xh;

import Ej.Z;
import bi.AbstractC1029g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.InterfaceC1782c;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6674a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6675b;
    public final Object c;

    public r(AbstractC1029g abstractC1029g, h hVar, boolean z4) {
        this.c = abstractC1029g;
        this.f6675b = z4;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() {
        switch (this.f6674a) {
            case 0:
                Z z4 = (Z) this.c;
                Ki.a aVar = (Ki.a) z4.c;
                AtomicBoolean atomicBoolean = aVar.c;
                boolean z5 = this.f6675b;
                atomicBoolean.set(z5);
                if (z5) {
                    Ri.a.p("Persisting in memory impressions");
                    ConcurrentLinkedQueue concurrentLinkedQueue = aVar.f2775b;
                    ArrayList arrayList = new ArrayList(concurrentLinkedQueue);
                    concurrentLinkedQueue.removeAll(arrayList);
                    ((Ii.d) aVar.f2774a).h(arrayList);
                }
                Ri.a.d("Persistence for impressions has been ".concat(z5 ? Constants.ENABLED : "disabled"));
                Ii.a aVar2 = (Ii.a) z4.f1431d;
                aVar2.c.set(z5);
                if (z5) {
                    Ri.a.p("Persisting in memory events");
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = aVar2.f2343b;
                    ArrayList arrayList2 = new ArrayList(concurrentLinkedQueue2);
                    concurrentLinkedQueue2.removeAll(arrayList2);
                    ((Ii.d) aVar2.f2342a).h(arrayList2);
                }
                Ri.a.d("Persistence for events has been ".concat(z5 ? Constants.ENABLED : "disabled"));
                return Ff.f.k(10);
            default:
                try {
                    boolean z8 = this.f6675b;
                    AbstractC1029g abstractC1029g = (AbstractC1029g) this.c;
                    if (z8) {
                        abstractC1029g.b();
                    } else {
                        abstractC1029g.a();
                    }
                    return Ff.f.k(10);
                } catch (Exception unused) {
                    return Ff.f.d(10);
                }
        }
    }

    public r(Z z4, boolean z5) {
        this.c = z4;
        this.f6675b = z5;
    }
}
