package Wh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import hh.o;
import vh.C2355f;
import vh.C2356g;
import vh.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6441b;
    public Qh.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f6442d;

    public c(b bVar) {
        this.f6440a = bVar;
    }

    public final void d() {
        Qh.a aVar;
        Object[] objArr;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.c;
                    if (aVar == null) {
                        this.f6441b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Object[] objArr2 = aVar.f5380b; objArr2 != null; objArr2 = objArr2[4]) {
                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                    if (h.a(this.f6440a, objArr)) {
                        break;
                    }
                }
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f6442d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6442d) {
                    return;
                }
                this.f6442d = true;
                if (!this.f6441b) {
                    this.f6441b = true;
                    this.f6440a.onComplete();
                    return;
                }
                Qh.a aVar = this.c;
                if (aVar == null) {
                    aVar = new Qh.a(1);
                    this.c = aVar;
                }
                aVar.a(h.f20506a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f6442d) {
            s.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z4 = true;
                if (!this.f6442d) {
                    this.f6442d = true;
                    if (this.f6441b) {
                        Qh.a aVar = this.c;
                        if (aVar == null) {
                            aVar = new Qh.a(1);
                            this.c = aVar;
                        }
                        aVar.f5380b[0] = new C2356g(th2);
                        return;
                    }
                    this.f6441b = true;
                    z4 = false;
                }
                if (z4) {
                    s.r(th2);
                } else {
                    this.f6440a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f6442d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6442d) {
                    return;
                }
                if (!this.f6441b) {
                    this.f6441b = true;
                    this.f6440a.onNext(obj);
                    d();
                } else {
                    Qh.a aVar = this.c;
                    if (aVar == null) {
                        aVar = new Qh.a(1);
                        this.c = aVar;
                    }
                    aVar.a(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        boolean z4 = true;
        if (!this.f6442d) {
            synchronized (this) {
                try {
                    if (!this.f6442d) {
                        if (this.f6441b) {
                            Qh.a aVar = this.c;
                            if (aVar == null) {
                                aVar = new Qh.a(1);
                                this.c = aVar;
                            }
                            aVar.a(new C2355f(interfaceC1486b));
                            return;
                        }
                        this.f6441b = true;
                        z4 = false;
                    }
                } finally {
                }
            }
        }
        if (z4) {
            interfaceC1486b.dispose();
        } else {
            this.f6440a.onSubscribe(interfaceC1486b);
            d();
        }
    }

    @Override // ch.l
    public final void subscribeActual(r rVar) {
        this.f6440a.subscribe(rVar);
    }

    @Override // hh.o
    public final boolean test(Object obj) {
        return h.a(this.f6440a, obj);
    }
}
