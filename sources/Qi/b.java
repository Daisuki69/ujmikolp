package Qi;

import Oi.g;
import Oi.q;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.split.android.client.storage.splits.c f5395b;
    public final Li.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Li.c f5396d;
    public volatile q e = null;
    public final Object f = new Object();

    public b(c cVar, io.split.android.client.storage.splits.c cVar2, Li.c cVar3, Li.c cVar4) {
        Objects.requireNonNull(cVar);
        this.f5394a = cVar;
        Objects.requireNonNull(cVar2);
        this.f5395b = cVar2;
        Objects.requireNonNull(cVar3);
        this.c = cVar3;
        this.f5396d = cVar4;
    }

    public final q a() {
        c cVar = this.f5394a;
        q qVar = new q();
        try {
            cVar.E("av:" + Build.VERSION.SDK_INT);
        } catch (ClassCastException unused) {
            Ri.a.d("Telemetry storage is not a producer");
        }
        qVar.p(cVar.C());
        qVar.o(this.f5395b.getAll().size());
        qVar.q(cVar.F());
        qVar.l(cVar.K());
        qVar.m(this.c.l());
        Li.c cVar2 = this.f5396d;
        if (cVar2 != null) {
            qVar.i(cVar2.l());
        }
        qVar.n(cVar.M());
        qVar.j(cVar.B());
        qVar.g(cVar.i(g.f4846b));
        qVar.h(cVar.i(g.f4845a));
        qVar.f(cVar.i(g.c));
        qVar.k(cVar.I());
        qVar.e(cVar.N());
        qVar.d(cVar.w());
        qVar.r(cVar.h());
        qVar.a(cVar.P());
        qVar.c(cVar.x(Oi.c.f4832a));
        qVar.b(cVar.x(Oi.c.f4833b));
        qVar.s(cVar.D());
        return qVar;
    }

    public final q b() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = a();
                    }
                } finally {
                }
            }
        }
        return this.e;
    }
}
