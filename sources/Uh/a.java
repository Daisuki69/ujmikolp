package Uh;

import Ah.j;
import Ch.g;
import Qh.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.reactivex.rxjava3.disposables.b, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5971b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5972d;
    public Qh.a e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f5973g;
    public long h;

    public a(j jVar, b bVar) {
        this.f5970a = jVar;
        this.f5971b = bVar;
    }

    public final void a() {
        Qh.a aVar;
        Object obj;
        while (!this.f5973g) {
            synchronized (this) {
                try {
                    aVar = this.e;
                    if (aVar == null) {
                        this.f5972d = false;
                        return;
                    }
                    this.e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Object[] objArr = aVar.f5380b; objArr != null; objArr = objArr[4]) {
                for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                    if (test(obj)) {
                        break;
                    }
                }
            }
        }
    }

    public final void b(long j, Object obj) {
        if (this.f5973g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.f5973g) {
                        return;
                    }
                    if (this.h == j) {
                        return;
                    }
                    if (this.f5972d) {
                        Qh.a aVar = this.e;
                        if (aVar == null) {
                            aVar = new Qh.a(0);
                            this.e = aVar;
                        }
                        aVar.a(obj);
                        return;
                    }
                    this.c = true;
                    this.f = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        test(obj);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.f5973g) {
            return;
        }
        this.f5973g = true;
        this.f5971b.j(this);
    }

    @Override // Ch.g
    public final boolean test(Object obj) {
        if (this.f5973g) {
            return true;
        }
        j jVar = this.f5970a;
        if (obj == Qh.g.f5387a) {
            jVar.onComplete();
            return true;
        }
        if (obj instanceof f) {
            jVar.onError(((f) obj).f5386a);
            return true;
        }
        jVar.onNext(obj);
        return false;
    }
}
