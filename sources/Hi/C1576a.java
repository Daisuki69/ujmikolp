package hi;

import Ff.f;
import Ki.c;
import Ki.d;
import X2.e;
import bi.C1026d;
import bi.i;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ki.InterfaceC1782c;
import pi.C2151a;
import pi.InterfaceC2153c;

/* JADX INFO: renamed from: hi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1576a implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17044a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17045b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17046d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17047g;

    public C1576a(Ii.b bVar, c cVar, Ki.b bVar2, d dVar, InterfaceC2153c interfaceC2153c, long j) {
        Objects.requireNonNull(bVar);
        this.c = bVar;
        Objects.requireNonNull(cVar);
        this.f17046d = cVar;
        Objects.requireNonNull(bVar2);
        this.e = bVar2;
        Objects.requireNonNull(dVar);
        this.f = dVar;
        Objects.requireNonNull(interfaceC2153c);
        this.f17047g = interfaceC2153c;
        this.f17045b = j;
    }

    @Override // ki.InterfaceC1782c
    public final f execute() {
        switch (this.f17044a) {
            case 0:
                long j = this.f17045b;
                try {
                    ((Ii.d) ((Ii.b) this.c)).b(j);
                    ((Ii.d) ((c) this.f17046d)).b(j);
                    ((Ii.d) ((Ki.b) this.e)).b(j);
                    ((Ii.d) ((d) this.f)).b(j);
                    e eVar = (e) ((InterfaceC2153c) this.f17047g);
                    ((ImpressionsObserverCacheDao) eVar.f6481b).deleteOldest(TimeUnit.SECONDS.toMillis(j) - eVar.f6480a);
                    return f.k(11);
                } catch (Throwable unused) {
                    return f.d(11);
                }
            default:
                try {
                    C2151a c2151a = (C2151a) this.e;
                    Split split = (Split) this.f17046d;
                    long j6 = this.f17045b;
                    c2151a.getClass();
                    if (((io.split.android.client.storage.splits.c) this.c).h(c2151a.a(j6, Collections.singletonList(split)), null)) {
                        ((C1026d) this.f).a(i.f);
                    }
                    ((Qi.c) this.f17047g).z(Pi.f.f5191a);
                    Ri.a.p("Updated feature flag");
                    return f.k(1);
                } catch (Exception unused2) {
                    Ri.a.g(numX49.tnTj78("bSCP"));
                    return f.d(1);
                }
        }
    }

    public C1576a(io.split.android.client.storage.splits.c cVar, C2151a c2151a, C1026d c1026d, Qi.c cVar2, Split split, long j) {
        Objects.requireNonNull(cVar);
        this.c = cVar;
        Objects.requireNonNull(c2151a);
        this.e = c2151a;
        Objects.requireNonNull(c1026d);
        this.f = c1026d;
        Objects.requireNonNull(cVar2);
        this.f17047g = cVar2;
        this.f17046d = split;
        this.f17045b = j;
    }
}
