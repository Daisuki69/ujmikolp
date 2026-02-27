package Uh;

import Ah.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {
    public static final c[] c = new c[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c[] f5980d = new c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5981a = new AtomicReference(f5980d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f5982b;

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (this.f5981a.get() == c) {
            bVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ah.h
    public final void h(j jVar) {
        c cVar = new c(jVar, this);
        jVar.a(cVar);
        while (true) {
            AtomicReference atomicReference = this.f5981a;
            c[] cVarArr = (c[]) atomicReference.get();
            if (cVarArr == c) {
                Throwable th2 = this.f5982b;
                if (th2 != null) {
                    jVar.onError(th2);
                    return;
                } else {
                    jVar.onComplete();
                    return;
                }
            }
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            if (cVar.get()) {
                j(cVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(c cVar) {
        c[] cVarArr;
        while (true) {
            AtomicReference atomicReference = this.f5981a;
            c[] cVarArr2 = (c[]) atomicReference.get();
            if (cVarArr2 == c || cVarArr2 == (cVarArr = f5980d)) {
                return;
            }
            int length = cVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cVarArr2[i] == cVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                cVarArr = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr, 0, i);
                System.arraycopy(cVarArr2, i + 1, cVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // Ah.j
    public final void onComplete() {
        AtomicReference atomicReference = this.f5981a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        c[] cVarArr = (c[]) atomicReference.getAndSet(obj2);
        for (c cVar : cVarArr) {
            if (!cVar.get()) {
                cVar.f5978a.onComplete();
            }
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (th2 == null) {
            throw Qh.e.b("onError called with a null Throwable.");
        }
        Qh.d dVar = Qh.e.f5385a;
        AtomicReference atomicReference = this.f5981a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            E1.c.k(th2);
            return;
        }
        this.f5982b = th2;
        c[] cVarArr = (c[]) atomicReference.getAndSet(obj2);
        for (c cVar : cVarArr) {
            if (cVar.get()) {
                E1.c.k(th2);
            } else {
                cVar.f5978a.onError(th2);
            }
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (obj == null) {
            throw Qh.e.b("onNext called with a null value.");
        }
        Qh.d dVar = Qh.e.f5385a;
        for (c cVar : (c[]) this.f5981a.get()) {
            if (!cVar.get()) {
                cVar.f5978a.onNext(obj);
            }
        }
    }
}
