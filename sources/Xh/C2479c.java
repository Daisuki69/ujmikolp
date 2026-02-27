package xh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import vh.C2356g;
import vh.h;

/* JADX INFO: renamed from: xh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2479c implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f20999b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Qh.a f21000d;
    public volatile boolean e;

    public C2479c(r rVar) {
        this.f20998a = rVar;
    }

    public final void a() {
        Object[] objArr;
        while (true) {
            synchronized (this) {
                try {
                    Qh.a aVar = this.f21000d;
                    if (aVar == null) {
                        this.c = false;
                        return;
                    }
                    this.f21000d = null;
                    r rVar = this.f20998a;
                    for (Object[] objArr2 = aVar.f5380b; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (h.a(rVar, objArr)) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f20999b.dispose();
    }

    @Override // ch.r
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
                    this.f20998a.onComplete();
                } else {
                    Qh.a aVar = this.f21000d;
                    if (aVar == null) {
                        aVar = new Qh.a(1);
                        this.f21000d = aVar;
                    }
                    aVar.a(h.f20506a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.e) {
            s.r(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z4 = true;
                if (!this.e) {
                    if (this.c) {
                        this.e = true;
                        Qh.a aVar = this.f21000d;
                        if (aVar == null) {
                            aVar = new Qh.a(1);
                            this.f21000d = aVar;
                        }
                        aVar.f5380b[0] = new C2356g(th2);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z4 = false;
                }
                if (z4) {
                    s.r(th2);
                } else {
                    this.f20998a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.f20999b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.f20998a.onNext(obj);
                    a();
                } else {
                    Qh.a aVar = this.f21000d;
                    if (aVar == null) {
                        aVar = new Qh.a(1);
                        this.f21000d = aVar;
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
        if (EnumC1604b.f(this.f20999b, interfaceC1486b)) {
            this.f20999b = interfaceC1486b;
            this.f20998a.onSubscribe(this);
        }
    }
}
