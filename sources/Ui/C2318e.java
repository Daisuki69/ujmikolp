package ui;

import Oi.n;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.TargetingRulesChange;
import io.split.android.client.network.l;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oi.C1986d;
import pi.C2151a;

/* JADX INFO: renamed from: ui.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2318e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f20331k = TimeUnit.HOURS.toMillis(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f20332l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8.c f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.split.android.client.storage.splits.c f20334b;
    public final C2151a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1986d f20335d;
    public final Mi.d e;
    public final Qi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ff.f f20336g;
    public final C2316c h;
    public final ExecutorService i;
    public final C2321h j;

    public C2318e(U8.c cVar, io.split.android.client.storage.splits.c cVar2, C2151a c2151a, C1986d c1986d, Mi.d dVar, Ji.a aVar, Qi.c cVar3, String str, boolean z4, C2321h c2321h) {
        Ff.f fVar = new Ff.f(60);
        Objects.requireNonNull(cVar);
        this.f20333a = cVar;
        Objects.requireNonNull(cVar2);
        this.f20334b = cVar2;
        this.c = c2151a;
        this.f20335d = c1986d;
        Objects.requireNonNull(dVar);
        this.e = dVar;
        Objects.requireNonNull(cVar3);
        this.f = cVar3;
        this.f20336g = fVar;
        this.h = new C2316c(str, z4, aVar, f20331k);
        this.i = Executors.newSingleThreadExecutor();
        this.j = c2321h;
    }

    public static void c(String str) {
        Ri.a.g(numX49.tnTj78("bHPj") + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4 = new ui.C2317d(r10, java.lang.Long.valueOf(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(ui.C2317d r19, boolean r20, boolean r21, int r22, boolean r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.C2318e.a(ui.d, boolean, boolean, int, boolean, int):int");
    }

    public final TargetingRulesChange b(C2317d c2317d, boolean z4, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2316c c2316c = this.h;
        Object obj = c2316c.f20328g.get();
        EnumC2315b enumC2315b = EnumC2315b.f20323b;
        String str = obj == enumC2315b ? c2316c.f20326b : c2316c.f20325a;
        if (str != null && !str.trim().isEmpty()) {
            linkedHashMap.put(numX49.tnTj78("bHPi"), str);
        }
        long j = c2317d.f20329a;
        linkedHashMap.put(numX49.tnTj78("bHPE"), Long.valueOf(j));
        Object obj2 = c2316c.f20328g.get();
        Long l6 = c2317d.f20330b;
        if (obj2 != enumC2315b && l6 != null) {
            linkedHashMap.put(numX49.tnTj78("bHPF"), l6);
        }
        String strTnTj78 = numX49.tnTj78("bHPH");
        if (i == 3) {
            linkedHashMap.put(strTnTj78, l6);
        } else if (i == 2) {
            linkedHashMap.put(strTnTj78, Long.valueOf(j));
        }
        return (TargetingRulesChange) this.f20333a.k(linkedHashMap, z4 ? l.f17603b : null);
    }

    public final Ff.f d(C2317d c2317d, boolean z4, boolean z5, boolean z8, int i) throws Throwable {
        boolean z9;
        boolean z10;
        String strTnTj78 = numX49.tnTj78("bHPO");
        C2316c c2316c = this.h;
        try {
            c2316c.a();
            AtomicReference atomicReference = c2316c.f20328g;
            Object obj = atomicReference.get();
            EnumC2315b enumC2315b = EnumC2315b.c;
            if (obj == enumC2315b) {
                z9 = true;
                z10 = true;
            } else {
                z9 = z4;
                z10 = z8;
            }
            int iA = a(c2317d, z9, z5, 1, z10, i);
            if (iA != 1) {
                a(c2317d, z9, z5, iA, z10, i);
            }
            Ri.a.d(numX49.tnTj78("bHPQ"));
            if (atomicReference.get() == enumC2315b) {
                Ri.a.k(numX49.tnTj78("bHPt"));
                c2316c.e.set(0L);
                A7.f fVar = (A7.f) c2316c.f;
                fVar.getClass();
                ((GeneralInfoDao) fVar.f210b).update(new GeneralInfoEntity(strTnTj78, 0L));
            }
            return Ff.f.k(1);
        } catch (HttpFetcherException e) {
            c(numX49.tnTj78("bHPe") + e.getLocalizedMessage());
            n nVar = n.f4869a;
            Qi.c cVar = this.f;
            Integer num = e.f17609a;
            cVar.u(nVar, num);
            int iE = AbstractC1331a.e(num);
            if (iE == 1) {
                Ri.a.g(numX49.tnTj78("bHP8"));
            }
            if (AbstractC1331a.f(iE)) {
                return new Ff.f(1, 2, Collections.singletonMap(numX49.tnTj78("bHPC"), Boolean.TRUE));
            }
            if (iE == 5) {
                try {
                    if (c2316c.c) {
                        Ri.a.k("Background sync fetch; skipping proxy handling");
                        c2316c.b(EnumC2315b.f20322a);
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c2316c.e.set(jCurrentTimeMillis);
                        A7.f fVar2 = (A7.f) c2316c.f;
                        fVar2.getClass();
                        ((GeneralInfoDao) fVar2.f210b).update(new GeneralInfoEntity(strTnTj78, jCurrentTimeMillis));
                        c2316c.b(EnumC2315b.f20323b);
                    }
                } catch (Exception e7) {
                    c(numX49.tnTj78("bHP4") + e7.getLocalizedMessage());
                }
            }
            return Ff.f.d(1);
        } catch (Exception e10) {
            c(numX49.tnTj78("bHPU") + e10.getLocalizedMessage());
            return Ff.f.d(1);
        }
    }
}
