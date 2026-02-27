package Wh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {
    public static final a[] c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a[] f6437d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6438a = new AtomicReference(f6437d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f6439b;

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f6438a;
            a[] aVarArr2 = (a[]) atomicReference.get();
            if (aVarArr2 == c || aVarArr2 == (aVarArr = f6437d)) {
                return;
            }
            int length = aVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        AtomicReference atomicReference = this.f6438a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f6435a.onComplete();
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        jh.e.b(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f6438a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            s.r(th2);
            return;
        }
        this.f6439b = th2;
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (aVar.get()) {
                s.r(th2);
            } else {
                aVar.f6435a.onError(th2);
            }
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        jh.e.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a aVar : (a[]) this.f6438a.get()) {
            if (!aVar.get()) {
                aVar.f6435a.onNext(obj);
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (this.f6438a.get() == c) {
            interfaceC1486b.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.l
    public final void subscribeActual(r rVar) {
        a aVar = new a(rVar, this);
        rVar.onSubscribe(aVar);
        while (true) {
            AtomicReference atomicReference = this.f6438a;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == c) {
                Throwable th2 = this.f6439b;
                if (th2 != null) {
                    rVar.onError(th2);
                    return;
                } else {
                    rVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get()) {
                d(aVar);
                return;
            }
            return;
        }
    }
}
