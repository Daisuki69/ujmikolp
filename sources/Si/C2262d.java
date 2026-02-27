package si;

import Oi.n;
import bi.h;
import bi.i;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.AllSegmentsChange;
import io.split.android.client.dtos.SegmentsChange;
import io.split.android.client.network.l;
import io.split.android.client.service.http.HttpFetcherException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ki.InterfaceC1782c;
import p2.C2005a;
import pg.C2038a;

/* JADX INFO: renamed from: si.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2262d implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8.c f20123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Li.b f20124b;
    public final Li.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f20125d;
    public final C2005a e;
    public final Qi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ff.f f20126g;
    public final int h;
    public final i i;
    public final i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f20127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20128l;
    public final Long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f20129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20130o;

    public C2262d(U8.c cVar, Li.b bVar, Li.b bVar2, boolean z4, h hVar, Qi.c cVar2, C2260b c2260b, Long l6, Long l8) {
        C2005a c2005a = new C2005a();
        Ff.f fVar = new Ff.f(60);
        Objects.requireNonNull(cVar);
        this.f20123a = cVar;
        Objects.requireNonNull(bVar);
        this.f20124b = bVar;
        Objects.requireNonNull(bVar2);
        this.c = bVar2;
        this.f20128l = z4;
        this.f20125d = hVar;
        this.e = c2005a;
        Objects.requireNonNull(cVar2);
        this.f = cVar2;
        c2260b.getClass();
        this.h = 2;
        this.i = i.f9157d;
        this.j = i.c;
        this.f20127k = n.f4872g;
        this.m = l6;
        this.f20129n = l8;
        this.f20126g = fVar;
        this.f20130o = 10;
    }

    public static boolean c(long j, Long l6) {
        if (l6 == null) {
            l6 = -1L;
        }
        return l6.longValue() < j;
    }

    public static boolean e(Long l6, SegmentsChange segmentsChange) {
        if (l6 == null) {
            l6 = -1L;
        }
        if (l6.longValue() == -1 || segmentsChange == null || segmentsChange.getChangeNumber() == null) {
            return true;
        }
        return segmentsChange.getChangeNumber() != null && l6.longValue() <= segmentsChange.getChangeNumber().longValue();
    }

    public static C2038a f(SegmentsChange segmentsChange, Li.b bVar) {
        ArrayList arrayList = new ArrayList();
        List<String> arrayList2 = new ArrayList<>();
        if (segmentsChange != null) {
            arrayList = new ArrayList(bVar.getAll());
            arrayList2 = segmentsChange.getNames();
            bVar.j(segmentsChange);
        }
        return new C2038a(15, arrayList, arrayList2, false);
    }

    public final void a(int i) throws InterruptedException {
        Ff.f fVar = this.f20126g;
        fVar.b();
        while (true) {
            boolean z4 = this.f20128l;
            U8.c cVar = this.f20123a;
            if (i <= 0) {
                g((AllSegmentsChange) cVar.k(b(true), z4 ? l.f17603b : null));
                return;
            }
            AllSegmentsChange allSegmentsChange = (AllSegmentsChange) cVar.k(b(false), z4 ? l.f17603b : null);
            boolean zE = e(this.m, allSegmentsChange.getSegmentsChange());
            boolean zE2 = e(this.f20129n, allSegmentsChange.getLargeSegmentsChange());
            if (zE && zE2) {
                g(allSegmentsChange);
                return;
            } else {
                Ri.a.d(numX49.tnTj78("bFAP"));
                Thread.sleep(TimeUnit.SECONDS.toMillis(fVar.a()));
                i--;
            }
        }
    }

    public final HashMap b(boolean z4) {
        HashMap map = new HashMap();
        if (z4) {
            Long l6 = this.m;
            long jLongValue = (l6 != null ? l6 : -1L).longValue();
            Long l8 = this.f20129n;
            map.put(numX49.tnTj78("bFAb"), Long.valueOf(Math.max(jLongValue, (l8 != null ? l8 : -1L).longValue())));
        }
        return map;
    }

    public final boolean d() {
        Li.b bVar = this.c;
        Li.b bVar2 = this.f20124b;
        Long l6 = this.f20129n;
        Long l8 = this.m;
        if (l8 != null && l6 != null) {
            return c(bVar2.a(), l8) && c(bVar.a(), l6);
        }
        if (l6 != null) {
            return c(bVar.a(), l6);
        }
        if (l8 != null) {
            return c(bVar2.a(), l8);
        }
        return false;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() throws Throwable {
        String strTnTj78 = numX49.tnTj78("bFA2");
        int i = this.h;
        n nVar = this.f20127k;
        Qi.c cVar = this.f;
        String strTnTj782 = numX49.tnTj78("bFAL");
        String strTnTj783 = numX49.tnTj78("bFAr");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 0;
        try {
            try {
                if (d()) {
                    Ri.a.p("Target CN is outdated. Skipping membership fetch");
                    Ff.f fVarK = Ff.f.k(i);
                    cVar.c(nVar, 0L);
                    return fVarK;
                }
                a(this.f20130o);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j6 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                try {
                    cVar.p(nVar, jCurrentTimeMillis2);
                    cVar.c(nVar, j6);
                    Ri.a.d(numX49.tnTj78("bFAZ"));
                    return Ff.f.k(i);
                } catch (HttpFetcherException e) {
                    e = e;
                    j = j6;
                    Ri.a.g(strTnTj78 + (strTnTj782 + e.getLocalizedMessage()));
                    cVar.u(nVar, e.f17609a);
                    if (AbstractC1331a.f(AbstractC1331a.e(e.f17609a))) {
                        Ff.f fVar = new Ff.f(i, 2, Collections.singletonMap("DO_NOT_RETRY", Boolean.TRUE));
                        cVar.c(nVar, j);
                        return fVar;
                    }
                    Ff.f fVarD = Ff.f.d(i);
                    cVar.c(nVar, j);
                    return fVarD;
                } catch (Exception e7) {
                    e = e7;
                    j = j6;
                    Ri.a.g(strTnTj78 + (strTnTj783 + e.getLocalizedMessage()));
                    Ff.f fVarD2 = Ff.f.d(i);
                    cVar.c(nVar, j);
                    return fVarD2;
                } catch (Throwable th2) {
                    th = th2;
                    j = j6;
                    cVar.c(nVar, j);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (HttpFetcherException e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void g(AllSegmentsChange allSegmentsChange) {
        C2038a c2038aF = f(allSegmentsChange.getSegmentsChange(), this.f20124b);
        C2038a c2038aF2 = f(allSegmentsChange.getLargeSegmentsChange(), this.c);
        h hVar = this.f20125d;
        if (hVar == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c2038aF.f19100b;
        this.e.getClass();
        Collections.sort(arrayList);
        List list = (List) c2038aF.c;
        Collections.sort(list);
        boolean zEquals = arrayList.equals(list);
        ArrayList arrayList2 = (ArrayList) c2038aF2.f19100b;
        Collections.sort(arrayList2);
        List list2 = (List) c2038aF2.c;
        Collections.sort(list2);
        boolean zEquals2 = arrayList2.equals(list2);
        if (!zEquals) {
            Ri.a.p(numX49.tnTj78("bFAk") + list);
        }
        if (!zEquals2) {
            Ri.a.p(numX49.tnTj78("bFAB") + list2);
        }
        if (!zEquals) {
            hVar.a(this.i);
        } else if (zEquals2) {
            hVar.a(this.j);
        } else {
            hVar.a(i.f9159k);
        }
    }
}
