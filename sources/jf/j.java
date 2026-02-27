package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17757b = 2;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j jVar, Object[] objArr, Ri.a aVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f17758d = jVar;
        this.c = aVar;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        long j;
        IOException e = null;
        tVarArr = null;
        t[] tVarArr = null;
        int i = 2;
        int i4 = 1;
        switch (this.f17757b) {
            case 0:
                k kVar = (k) this.f17758d;
                q qVar = (q) this.c;
                try {
                    qVar.g(this);
                    do {
                        break;
                    } while (qVar.m(false, this));
                    i = 6;
                } catch (IOException e7) {
                    e = e7;
                    i4 = 2;
                } catch (Throwable th2) {
                    kVar.f(3, 3, null);
                    ef.c.h(qVar);
                    throw th2;
                }
                kVar.f(i4, i, e);
                ef.c.h(qVar);
                return;
            case 1:
                t tVar = (t) this.c;
                j jVar = (j) this.f17758d;
                try {
                    ((k) jVar.f17758d).f17761b.b(tVar);
                    return;
                } catch (IOException e10) {
                    kf.f.f18131a.d(4, "Http2Connection.Listener failure for " + ((k) jVar.f17758d).f17762d, e10);
                    try {
                        tVar.d(e10, 2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            default:
                j jVar2 = (j) this.f17758d;
                Ri.a aVar = (Ri.a) this.c;
                synchronized (((k) jVar2.f17758d).f17772t) {
                    synchronized (((k) jVar2.f17758d)) {
                        try {
                            int iA = ((k) jVar2.f17758d).f17770r.a();
                            Ri.a aVar2 = ((k) jVar2.f17758d).f17770r;
                            if (aVar2 == null) {
                                throw null;
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & aVar.f5558b) != 0) {
                                    aVar2.b(i6, ((int[]) aVar.c)[i6]);
                                }
                            }
                            int iA2 = ((k) jVar2.f17758d).f17770r.a();
                            if (iA2 == -1 || iA2 == iA) {
                                j = 0;
                            } else {
                                j = iA2 - iA;
                                if (!((k) jVar2.f17758d).c.isEmpty()) {
                                    tVarArr = (t[]) ((k) jVar2.f17758d).c.values().toArray(new t[((k) jVar2.f17758d).c.size()]);
                                }
                            }
                        } finally {
                        }
                    }
                    try {
                        k kVar2 = (k) jVar2.f17758d;
                        kVar2.f17772t.k(kVar2.f17770r);
                    } catch (IOException e11) {
                        ((k) jVar2.f17758d).f(2, 2, e11);
                    }
                    break;
                }
                if (tVarArr != null) {
                    for (t tVar2 : tVarArr) {
                        synchronized (tVar2) {
                            try {
                                tVar2.f17797b += j;
                                if (j > 0) {
                                    tVar2.notifyAll();
                                }
                            } finally {
                            }
                        }
                    }
                }
                k.f17759w.execute(new l(jVar2, new Object[]{((k) jVar2.f17758d).f17762d}));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j jVar, Object[] objArr, t tVar) {
        super("OkHttp %s stream %d", objArr);
        this.f17758d = jVar;
        this.c = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, q qVar) {
        super("OkHttp %s", kVar.f17762d);
        this.f17758d = kVar;
        this.c = qVar;
    }
}
