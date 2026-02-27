package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class X1 extends AtomicReference implements ch.r, InterfaceC1486b {
    public static final T1[] e = new T1[0];
    public static final T1[] f = new T1[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1 f19379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19380b;
    public final AtomicReference c = new AtomicReference(e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19381d = new AtomicBoolean();

    public X1(W1 w12) {
        this.f19379a = w12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(T1 t12) {
        T1[] t1Arr;
        while (true) {
            AtomicReference atomicReference = this.c;
            T1[] t1Arr2 = (T1[]) atomicReference.get();
            int length = t1Arr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (t1Arr2[i].equals(t12)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                t1Arr = e;
            } else {
                T1[] t1Arr3 = new T1[length - 1];
                System.arraycopy(t1Arr2, 0, t1Arr3, 0, i);
                System.arraycopy(t1Arr2, i + 1, t1Arr3, i, (length - i) - 1);
                t1Arr = t1Arr3;
            }
            while (!atomicReference.compareAndSet(t1Arr2, t1Arr)) {
                if (atomicReference.get() != t1Arr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.set(f);
        EnumC1604b.a(this);
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19380b) {
            return;
        }
        this.f19380b = true;
        W1 w12 = this.f19379a;
        w12.complete();
        for (T1 t12 : (T1[]) this.c.getAndSet(f)) {
            w12.a(t12);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19380b) {
            S1.s.r(th2);
            return;
        }
        this.f19380b = true;
        W1 w12 = this.f19379a;
        w12.error(th2);
        for (T1 t12 : (T1[]) this.c.getAndSet(f)) {
            w12.a(t12);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19380b) {
            return;
        }
        W1 w12 = this.f19379a;
        w12.c(obj);
        for (T1 t12 : (T1[]) this.c.get()) {
            w12.a(t12);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this, interfaceC1486b)) {
            for (T1 t12 : (T1[]) this.c.get()) {
                this.f19379a.a(t12);
            }
        }
    }
}
