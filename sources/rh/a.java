package Rh;

import Ah.j;
import E1.c;
import Qh.e;
import Qh.f;
import Qh.g;
import io.reactivex.rxjava3.disposables.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements j, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5554b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Qh.a f5555d;
    public volatile boolean e;

    public a(j jVar) {
        this.f5553a = jVar;
    }

    @Override // Ah.j
    public final void a(b bVar) {
        if (Dh.a.e(this.f5554b, bVar)) {
            this.f5554b = bVar;
            this.f5553a.a(this);
        }
    }

    public final void b() {
        Object obj;
        while (true) {
            synchronized (this) {
                try {
                    Qh.a aVar = this.f5555d;
                    if (aVar == null) {
                        this.c = false;
                        return;
                    }
                    this.f5555d = null;
                    j jVar = this.f5553a;
                    for (Object[] objArr = aVar.f5380b; objArr != null; objArr = objArr[4]) {
                        for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                            if (obj == g.f5387a) {
                                jVar.onComplete();
                                return;
                            } else {
                                if (obj instanceof f) {
                                    jVar.onError(((f) obj).f5386a);
                                    return;
                                }
                                jVar.onNext(obj);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.e = true;
        this.f5554b.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.e = true;
                    this.c = true;
                    this.f5553a.onComplete();
                } else {
                    Qh.a aVar = this.f5555d;
                    if (aVar == null) {
                        aVar = new Qh.a(0);
                        this.f5555d = aVar;
                    }
                    aVar.a(g.f5387a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.e) {
            c.k(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z4 = true;
                if (!this.e) {
                    if (this.c) {
                        this.e = true;
                        Qh.a aVar = this.f5555d;
                        if (aVar == null) {
                            aVar = new Qh.a(0);
                            this.f5555d = aVar;
                        }
                        aVar.f5380b[0] = new f(th2);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z4 = false;
                }
                if (z4) {
                    c.k(th2);
                } else {
                    this.f5553a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.f5554b.dispose();
            onError(e.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.f5553a.onNext(obj);
                    b();
                } else {
                    Qh.a aVar = this.f5555d;
                    if (aVar == null) {
                        aVar = new Qh.a(0);
                        this.f5555d = aVar;
                    }
                    aVar.a(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
