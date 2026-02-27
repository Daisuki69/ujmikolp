package zi;

import D.C0176i;
import Xh.g;
import Xh.p;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.work.Data;
import bi.C1026d;
import bi.i;
import gi.InterfaceC1523a;
import io.split.android.client.service.workmanager.EventsRecorderWorker;
import io.split.android.client.service.workmanager.ImpressionsRecorderWorker;
import io.split.android.client.service.workmanager.splits.SplitsSyncWorker;
import io.split.android.client.storage.db.GeneralInfoEntity;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.C1684a;
import ki.C1781b;
import ki.C1783d;
import ki.h;
import o6.C1967a;
import oi.C1990h;
import s.AbstractC2217b;
import ui.C2319f;
import xi.C2483b;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements ki.e, Bi.e, Ai.c, InterfaceC1523a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1781b f21456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1781b f21457b;
    public final Xh.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f21458d;
    public final C1990h e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f21459g;
    public String h;
    public final yi.f i;
    public final Qi.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Ai.d f21460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bi.g f21461l;
    public final AtomicBoolean m;

    public d(Xh.d dVar, C1781b c1781b, C1781b c1781b2, h hVar, f fVar, mg.c cVar, Qi.c cVar2, Ai.d dVar2, Bi.g gVar, C1990h c1990h, Ii.a aVar, C1026d c1026d, C1967a c1967a) {
        g gVar2 = new g();
        gVar2.j = new AtomicBoolean(true);
        gVar2.f6640a = c1781b;
        gVar2.f6641b = c1781b2;
        gVar2.c = dVar;
        gVar2.f6642d = hVar;
        yi.f fVar2 = new yi.f(c1781b2, new Ff.f(5, (byte) 0), -1);
        gVar2.f6643g = fVar2;
        gVar2.h = new yi.f(c1781b2, new Ff.f(5, (byte) 0), -1);
        if (c1967a != null) {
            gVar2.i = new C2483b(1, gVar2, c1967a);
        } else {
            gVar2.i = new Bi.c(gVar2, 6);
        }
        C0176i c0176i = hVar.f18141b;
        fVar2.d(new C2319f(hVar.f18142d, (io.split.android.client.storage.splits.c) c0176i.f914a, (Mi.c) c0176i.f923q, hVar.e, (Qi.c) c0176i.f919l, hVar.f18143g, 10), (ki.e) gVar2.i);
        gVar2.e = new C2483b(c1026d, i.f9156b);
        this.m = new AtomicBoolean(true);
        this.f21456a = c1781b;
        this.f21457b = c1781b2;
        Objects.requireNonNull(aVar);
        this.c = dVar;
        this.f21458d = hVar;
        this.f = gVar2;
        this.f21460k = dVar2;
        this.i = new yi.f(c1781b2, new Zj.b(1), 3);
        Objects.requireNonNull(cVar2);
        this.j = cVar2;
        this.f21461l = gVar;
        this.e = c1990h;
        Bi.c cVar3 = new Bi.c(this, 7);
        b bVar = new b(3, aVar, 10000, CacheDataSink.DEFAULT_FRAGMENT_SIZE, c1781b);
        this.f21459g = bVar;
        bVar.a(cVar3);
        fVar.f = new WeakReference(this);
        Data.Builder builder = new Data.Builder();
        Xh.d dVar3 = fVar.f21465d;
        dVar3.getClass();
        builder.putString("endpoint", "https://sdk.split.io/api");
        boolean z4 = dVar3.f6634d;
        builder.putBoolean("shouldRecordTelemetry", z4);
        p pVar = fVar.h;
        builder.putString("configuredFilterType", pVar != null ? pVar.f6669a.a() : null);
        builder.putStringArray("configuredFilterValues", pVar != null ? (String[]) pVar.f6670b.toArray(new String[0]) : new String[0]);
        builder.putString(GeneralInfoEntity.FLAGS_SPEC, "1.3");
        fVar.b("SPLITS_SYNC", SplitsSyncWorker.class, fVar.a(builder.build()));
        Data.Builder builder2 = new Data.Builder();
        builder2.putString("endpoint", "https://events.split.io/api");
        builder2.putInt("eventsPerPush", 2000);
        builder2.putBoolean("shouldRecordTelemetry", z4);
        fVar.b("EVENTS_RECORDER", EventsRecorderWorker.class, fVar.a(builder2.build()));
        Data.Builder builder3 = new Data.Builder();
        builder3.putString("endpoint", "https://events.split.io/api");
        builder3.putInt("impressionsPerPush", 2000);
        builder3.putBoolean("shouldRecordTelemetry", z4);
        fVar.b("IMPRESSIONS_RECORDER", ImpressionsRecorderWorker.class, fVar.a(builder3.build()));
    }

    @Override // Bi.e
    public final void a(Yh.a aVar) {
        this.f21461l.a(aVar);
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        int iC = AbstractC2217b.c(fVar.f1581b);
        if (iC != 0) {
            if (iC != 1) {
                return;
            }
            Ri.a.d("Loading my segments updated in background");
            this.f21461l.d();
            return;
        }
        g gVar = this.f;
        h hVar = (h) gVar.f6642d;
        List listAsList = Arrays.asList(new C1783d(new ki.i((Mi.c) hVar.f18141b.f923q), null), new C1783d(new Ci.a((io.split.android.client.storage.splits.c) hVar.f18141b.f914a, hVar.e, hVar.f), null));
        Yi.a aVar = (Yi.a) ((C1781b) gVar.f6640a).f18135a;
        if (aVar.isShutdown()) {
            return;
        }
        aVar.submit(new C.h(listAsList));
    }

    @Override // Ai.c
    public final void c(String str, Ai.b bVar) {
        this.f21460k.c(str, bVar);
    }

    @Override // Ai.c
    public final void d(String str) {
        this.f21460k.d(str);
    }

    public final synchronized void e() {
        this.f.c();
        this.f21461l.g();
        this.j.t(new Pi.a(Pi.e.POLLING, System.currentTimeMillis()));
        Ri.a.k("Periodic fetcher tasks scheduled");
    }

    @Override // Bi.e
    public final void f(Yh.a aVar, Bi.d dVar) {
        this.f21461l.f(aVar, dVar);
    }

    public final void g() {
        if (this.m.get()) {
            String str = this.h;
            if (str != null) {
                this.f21456a.k(str);
            }
            C1684a c1684aA = this.f21458d.a();
            this.c.getClass();
            this.h = this.f21456a.h(c1684aA, 0L, 1800L, this.f21459g);
        }
        this.e.b();
        Ri.a.k("Periodic recording tasks scheduled");
    }

    public final synchronized void h() {
        g gVar = this.f;
        ((C1781b) gVar.f6641b).k((String) gVar.f);
        this.f21461l.e();
    }

    public final void i() {
        this.f21456a.k(this.h);
        this.e.a();
        this.h = null;
    }

    public final void j() {
        this.f21461l.b();
    }

    public final void k() {
        g gVar = this.f;
        if (((AtomicBoolean) gVar.j).get()) {
            ((yi.f) gVar.f6643g).e();
        }
    }

    @Override // gi.InterfaceC1523a
    public final void pause() {
        i();
        h();
        this.f21456a.d();
        this.f21457b.d();
    }

    @Override // gi.InterfaceC1523a
    public final void resume() {
        this.f21456a.f();
        this.f21457b.f();
        this.c.getClass();
        g();
    }
}
