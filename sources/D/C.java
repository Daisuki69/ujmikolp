package D;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p0.C2004c;
import w.C2361c;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements Qi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f815b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f816d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f817g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f819l;
    public Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f825s;

    public C(C0180m c0180m, CleverTapInstanceConfig cleverTapInstanceConfig, B b8, Ci.b bVar, H h, Ci.b bVar2, Q q9, C0171d c0171d, C0176i c0176i, C0176i c0176i2, C0178k c0178k, r rVar, A a8, N.k kVar, R.c cVar, N.e eVar, b0.f fVar, a0 a0Var, o0.c cVar2, We.y yVar, c0.j jVar, g0.g gVar, P5.N n7, C2004c c2004c, Cg.c cVar3, Y.f fVar2, O.k kVar2, C2361c c2361c, Z z4, l0.c cVar4) {
        this.f814a = cleverTapInstanceConfig;
        this.f815b = b8;
        this.c = h;
        this.f816d = q9;
        this.e = c0171d;
        this.f = c0176i;
        this.f817g = c0176i2;
        this.h = c0178k;
        this.i = rVar;
        this.j = a8;
        this.f818k = kVar;
        this.f819l = cVar;
        this.m = eVar;
        this.f820n = fVar;
        this.f821o = a0Var;
        this.f822p = gVar;
        this.f823q = cVar3;
        this.f824r = fVar2;
        this.f825s = cVar4;
    }

    @Override // Qi.c
    public void A(long j) {
        ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4835b)).set(j);
    }

    @Override // Qi.c
    public Oi.j B() {
        Oi.j jVar = new Oi.j();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f;
        jVar.a(((AtomicLong) concurrentHashMap.get(Oi.n.f4871d)).get());
        jVar.f(((AtomicLong) concurrentHashMap.get(Oi.n.f4869a)).get());
        jVar.e(((AtomicLong) concurrentHashMap.get(Oi.n.f4872g)).get());
        jVar.d(((AtomicLong) concurrentHashMap.get(Oi.n.h)).get());
        jVar.g(((AtomicLong) concurrentHashMap.get(Oi.n.e)).get());
        jVar.c(((AtomicLong) concurrentHashMap.get(Oi.n.f4870b)).get());
        jVar.b(((AtomicLong) concurrentHashMap.get(Oi.n.c)).get());
        jVar.h(((AtomicLong) concurrentHashMap.get(Oi.n.f)).get());
        return jVar;
    }

    @Override // Qi.c
    public List C() {
        ArrayList arrayList;
        synchronized (this.f819l) {
            arrayList = (ArrayList) this.m;
            this.m = new ArrayList();
        }
        return arrayList;
    }

    @Override // Qi.c
    public Oi.r D() {
        Oi.r rVar;
        synchronized (this.f824r) {
            try {
                AtomicLong atomicLong = (AtomicLong) ((ConcurrentHashMap) this.f820n).get(Pi.f.f5191a);
                long andSet = atomicLong != null ? atomicLong.getAndSet(0L) : 0L;
                AtomicLong atomicLong2 = (AtomicLong) ((ConcurrentHashMap) this.f820n).get(Pi.f.f5192b);
                long andSet2 = atomicLong2 != null ? atomicLong2.getAndSet(0L) : 0L;
                AtomicLong atomicLong3 = (AtomicLong) ((ConcurrentHashMap) this.f820n).get(Pi.f.c);
                rVar = new Oi.r(andSet, andSet2, atomicLong3 != null ? atomicLong3.getAndSet(0L) : 0L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    @Override // Qi.c
    public void E(String str) {
        synchronized (this.f821o) {
            if (((HashSet) this.f825s).size() < 10) {
                ((HashSet) this.f825s).add(str);
            }
        }
    }

    @Override // Qi.c
    public List F() {
        ArrayList arrayList;
        synchronized (this.f821o) {
            arrayList = new ArrayList((HashSet) this.f825s);
            ((HashSet) this.f825s).clear();
        }
        return arrayList;
    }

    @Override // Qi.c
    public long G() {
        return ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4835b)).get();
    }

    @Override // Qi.c
    public void H(int i) {
        ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4836d)).set(i);
    }

    @Override // Qi.c
    public Oi.l I() {
        Oi.l lVar = new Oi.l();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f814a;
        lVar.b(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENT)).getAndSet(0L));
        lVar.d(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS)).getAndSet(0L));
        lVar.c(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENT_WITH_CONFIG)).getAndSet(0L));
        lVar.g(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS_WITH_CONFIG)).getAndSet(0L));
        lVar.a(((AtomicLong) concurrentHashMap.get(Oi.k.TRACK)).getAndSet(0L));
        lVar.e(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS_BY_FLAG_SET)).getAndSet(0L));
        lVar.f(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS_BY_FLAG_SETS)).getAndSet(0L));
        lVar.h(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SET)).getAndSet(0L));
        lVar.i(((AtomicLong) concurrentHashMap.get(Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SETS)).getAndSet(0L));
        return lVar;
    }

    @Override // Qi.c
    public void J(long j) {
        ((AtomicLong) this.f817g).set(j);
    }

    @Override // Qi.c
    public Oi.m K() {
        Oi.m mVar;
        synchronized (this.f823q) {
            mVar = new Oi.m();
            mVar.b(d(Oi.k.TREATMENT));
            mVar.d(d(Oi.k.TREATMENTS));
            mVar.c(d(Oi.k.TREATMENT_WITH_CONFIG));
            mVar.g(d(Oi.k.TREATMENTS_WITH_CONFIG));
            mVar.e(d(Oi.k.TREATMENTS_BY_FLAG_SET));
            mVar.f(d(Oi.k.TREATMENTS_BY_FLAG_SETS));
            mVar.h(d(Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SET));
            mVar.i(d(Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SETS));
            mVar.a(d(Oi.k.TRACK));
        }
        return mVar;
    }

    @Override // Qi.c
    public void L(Oi.k kVar) {
        ((AtomicLong) ((ConcurrentHashMap) this.f814a).get(kVar)).incrementAndGet();
    }

    @Override // Qi.c
    public long M() {
        return ((AtomicLong) this.f817g).get();
    }

    @Override // Qi.c
    public Oi.f N() {
        Oi.f fVar;
        synchronized (this.f822p) {
            fVar = new Oi.f();
            fVar.g(f(Oi.n.e));
            fVar.a(f(Oi.n.f4871d));
            fVar.f(f(Oi.n.f4869a));
            fVar.e(f(Oi.n.f4872g));
            fVar.d(f(Oi.n.h));
            fVar.h(f(Oi.n.f));
            fVar.b(f(Oi.n.f4870b));
            fVar.c(f(Oi.n.c));
        }
        return fVar;
    }

    @Override // Qi.c
    public long P() {
        return ((AtomicLong) ((ConcurrentHashMap) this.f818k).get(Oi.o.f4873a)).getAndSet(0L);
    }

    public void a() {
        Oi.n nVar = Oi.n.f4871d;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.i;
        concurrentHashMap2.put(nVar, concurrentHashMap);
        concurrentHashMap2.put(Oi.n.f4869a, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.e, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.f4872g, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.h, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.c, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.f4870b, new ConcurrentHashMap());
        concurrentHashMap2.put(Oi.n.f, new ConcurrentHashMap());
    }

    @Override // Qi.c
    public void b() {
        ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4834a)).incrementAndGet();
    }

    @Override // Qi.c
    public void c(Oi.n nVar, long j) {
        Qi.a aVar = (Qi.a) ((ConcurrentHashMap) this.j).get(nVar);
        if (aVar != null) {
            aVar.a(j);
        }
    }

    public ArrayList d(Oi.k kVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f815b;
        long[] jArr = ((Qi.a) concurrentHashMap.get(kVar)).f5393a;
        ((Qi.a) concurrentHashMap.get(kVar)).f5393a = new long[23];
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @Override // Qi.c
    public void e(long j) {
        ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.c)).set(j);
    }

    public ArrayList f(Oi.n nVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.j;
        long[] jArr = ((Qi.a) concurrentHashMap.get(nVar)).f5393a;
        ((Qi.a) concurrentHashMap.get(nVar)).f5393a = new long[23];
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @Override // Qi.c
    public void g() {
        ((AtomicLong) ((ConcurrentHashMap) this.f818k).get(Oi.o.f4873a)).incrementAndGet();
    }

    @Override // Qi.c
    public long h() {
        return ((AtomicLong) ((ConcurrentHashMap) this.f818k).get(Oi.o.f4874b)).getAndSet(0L);
    }

    @Override // Qi.c
    public long i(Oi.g gVar) {
        return ((AtomicLong) ((ConcurrentHashMap) this.f816d).get(gVar)).get();
    }

    @Override // Qi.c
    public void j(Oi.k kVar, long j) {
        Qi.a aVar = (Qi.a) ((ConcurrentHashMap) this.f815b).get(kVar);
        if (aVar != null) {
            synchronized (((ConcurrentHashMap) this.f815b)) {
                aVar.a(j);
            }
        }
    }

    @Override // Qi.c
    public void k(int i) {
        ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.e)).set(i);
    }

    @Override // Qi.c
    public void l() {
        ((AtomicLong) ((ConcurrentHashMap) this.e).get(Oi.c.f4832a)).addAndGet(1L);
    }

    @Override // Qi.c
    public long m() {
        return ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.e)).get();
    }

    @Override // Qi.c
    public void n(Oi.g gVar) {
        ((AtomicLong) ((ConcurrentHashMap) this.f816d).get(gVar)).addAndGet(1L);
    }

    @Override // Qi.c
    public void o() {
        ((AtomicLong) ((ConcurrentHashMap) this.f818k).get(Oi.o.f4874b)).incrementAndGet();
    }

    @Override // Qi.c
    public void p(Oi.n nVar, long j) {
        ((ConcurrentHashMap) this.f).put(nVar, new AtomicLong(j));
    }

    @Override // Qi.c
    public long q() {
        return ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.c)).get();
    }

    @Override // Qi.c
    public long s() {
        return ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4836d)).get();
    }

    @Override // Qi.c
    public void t(Pi.c cVar) {
        synchronized (this.f819l) {
            try {
                if (((ArrayList) this.m).size() < 20) {
                    ((ArrayList) this.m).add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Qi.c
    public void u(Oi.n nVar, Integer num) {
        synchronized (this.h) {
            try {
                if (num == null) {
                    return;
                }
                Map map = (Map) ((ConcurrentHashMap) this.i).get(nVar);
                if (map == null) {
                    return;
                }
                if (!map.containsKey(Long.valueOf(num.intValue()))) {
                    map.put(Long.valueOf(num.intValue()), 0L);
                }
                map.put(Long.valueOf(num.intValue()), Long.valueOf(((Long) map.get(Long.valueOf(num.intValue()))).longValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Qi.c
    public Oi.e w() {
        Oi.e eVar = new Oi.e();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.i;
        eVar.a((Map) concurrentHashMap.get(Oi.n.f4871d));
        eVar.b((Map) concurrentHashMap.get(Oi.n.c));
        eVar.g((Map) concurrentHashMap.get(Oi.n.e));
        eVar.c((Map) concurrentHashMap.get(Oi.n.f4870b));
        eVar.f((Map) concurrentHashMap.get(Oi.n.f4869a));
        eVar.e((Map) concurrentHashMap.get(Oi.n.f4872g));
        eVar.d((Map) concurrentHashMap.get(Oi.n.h));
        eVar.h((Map) concurrentHashMap.get(Oi.n.f));
        a();
        return eVar;
    }

    @Override // Qi.c
    public long x(Oi.c cVar) {
        return ((AtomicLong) ((ConcurrentHashMap) this.e).get(cVar)).get();
    }

    @Override // Qi.c
    public long y() {
        return ((AtomicLong) ((ConcurrentHashMap) this.c).get(Oi.d.f4834a)).get();
    }

    @Override // Qi.c
    public void z(Pi.f fVar) {
        ((AtomicLong) ((ConcurrentHashMap) this.f820n).get(fVar)).incrementAndGet();
    }

    public C() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f814a = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f815b = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.c = concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        this.f816d = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = new ConcurrentHashMap();
        this.e = concurrentHashMap5;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        this.f = concurrentHashMap6;
        this.f817g = new AtomicLong();
        this.h = new Object();
        this.i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap7 = new ConcurrentHashMap();
        this.j = concurrentHashMap7;
        ConcurrentHashMap concurrentHashMap8 = new ConcurrentHashMap();
        this.f818k = concurrentHashMap8;
        this.f819l = new Object();
        this.m = new ArrayList();
        ConcurrentHashMap concurrentHashMap9 = new ConcurrentHashMap();
        this.f820n = concurrentHashMap9;
        this.f821o = new Object();
        this.f822p = new Object();
        this.f823q = new Object();
        this.f824r = new Object();
        this.f825s = new HashSet();
        Oi.k kVar = Oi.k.TREATMENT;
        concurrentHashMap.put(kVar, new AtomicLong());
        Oi.k kVar2 = Oi.k.TREATMENTS;
        concurrentHashMap.put(kVar2, new AtomicLong());
        Oi.k kVar3 = Oi.k.TREATMENT_WITH_CONFIG;
        concurrentHashMap.put(kVar3, new AtomicLong());
        Oi.k kVar4 = Oi.k.TREATMENTS_WITH_CONFIG;
        concurrentHashMap.put(kVar4, new AtomicLong());
        Oi.k kVar5 = Oi.k.TRACK;
        concurrentHashMap.put(kVar5, new AtomicLong());
        Oi.k kVar6 = Oi.k.TREATMENTS_BY_FLAG_SET;
        concurrentHashMap.put(kVar6, new AtomicLong());
        Oi.k kVar7 = Oi.k.TREATMENTS_BY_FLAG_SETS;
        concurrentHashMap.put(kVar7, new AtomicLong());
        Oi.k kVar8 = Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SET;
        concurrentHashMap.put(kVar8, new AtomicLong());
        Oi.k kVar9 = Oi.k.TREATMENTS_WITH_CONFIG_BY_FLAG_SETS;
        concurrentHashMap.put(kVar9, new AtomicLong());
        concurrentHashMap2.put(kVar, new Qi.a());
        concurrentHashMap2.put(kVar2, new Qi.a());
        concurrentHashMap2.put(kVar3, new Qi.a());
        concurrentHashMap2.put(kVar4, new Qi.a());
        concurrentHashMap2.put(kVar5, new Qi.a());
        concurrentHashMap2.put(kVar6, new Qi.a());
        concurrentHashMap2.put(kVar7, new Qi.a());
        concurrentHashMap2.put(kVar8, new Qi.a());
        concurrentHashMap2.put(kVar9, new Qi.a());
        concurrentHashMap3.put(Oi.d.f4834a, new AtomicLong());
        concurrentHashMap3.put(Oi.d.f4835b, new AtomicLong());
        concurrentHashMap3.put(Oi.d.c, new AtomicLong());
        concurrentHashMap3.put(Oi.d.f4836d, new AtomicLong());
        concurrentHashMap3.put(Oi.d.e, new AtomicLong());
        concurrentHashMap4.put(Oi.g.f4845a, new AtomicLong());
        concurrentHashMap4.put(Oi.g.c, new AtomicLong());
        concurrentHashMap4.put(Oi.g.f4846b, new AtomicLong());
        concurrentHashMap5.put(Oi.c.f4833b, new AtomicLong());
        concurrentHashMap5.put(Oi.c.f4832a, new AtomicLong());
        Oi.n nVar = Oi.n.f4870b;
        concurrentHashMap6.put(nVar, new AtomicLong());
        Oi.n nVar2 = Oi.n.c;
        concurrentHashMap6.put(nVar2, new AtomicLong());
        Oi.n nVar3 = Oi.n.e;
        concurrentHashMap6.put(nVar3, new AtomicLong());
        Oi.n nVar4 = Oi.n.f4871d;
        concurrentHashMap6.put(nVar4, new AtomicLong());
        Oi.n nVar5 = Oi.n.f4872g;
        concurrentHashMap6.put(nVar5, new AtomicLong());
        Oi.n nVar6 = Oi.n.h;
        concurrentHashMap6.put(nVar6, new AtomicLong());
        Oi.n nVar7 = Oi.n.f4869a;
        concurrentHashMap6.put(nVar7, new AtomicLong());
        Oi.n nVar8 = Oi.n.f;
        concurrentHashMap6.put(nVar8, new AtomicLong());
        a();
        concurrentHashMap7.put(nVar4, new Qi.a());
        concurrentHashMap7.put(nVar, new Qi.a());
        concurrentHashMap7.put(nVar3, new Qi.a());
        concurrentHashMap7.put(nVar2, new Qi.a());
        concurrentHashMap7.put(nVar5, new Qi.a());
        concurrentHashMap7.put(nVar6, new Qi.a());
        concurrentHashMap7.put(nVar7, new Qi.a());
        concurrentHashMap7.put(nVar8, new Qi.a());
        concurrentHashMap8.put(Oi.o.f4873a, new AtomicLong());
        concurrentHashMap8.put(Oi.o.f4874b, new AtomicLong());
        concurrentHashMap9.put(Pi.f.f5191a, new AtomicLong());
        concurrentHashMap9.put(Pi.f.f5192b, new AtomicLong());
        concurrentHashMap9.put(Pi.f.c, new AtomicLong());
    }
}
