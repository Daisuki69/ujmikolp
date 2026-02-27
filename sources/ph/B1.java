package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class B1 extends AtomicReference implements ch.r, InterfaceC1486b {
    public static final A1[] e = new A1[0];
    public static final A1[] f = new A1[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19127b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f19128d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19126a = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference();

    public B1(AtomicReference atomicReference) {
        this.f19127b = atomicReference;
        lazySet(e);
    }

    public final void a(A1 a12) {
        A1[] a1Arr;
        A1[] a1Arr2;
        do {
            a1Arr = (A1[]) get();
            int length = a1Arr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (a1Arr[i] == a12) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            a1Arr2 = e;
            if (length != 1) {
                a1Arr2 = new A1[length - 1];
                System.arraycopy(a1Arr, 0, a1Arr2, 0, i);
                System.arraycopy(a1Arr, i + 1, a1Arr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(a1Arr, a1Arr2));
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        AtomicReference atomicReference;
        getAndSet(f);
        do {
            atomicReference = this.f19127b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        EnumC1604b.a(this.c);
    }

    @Override // ch.r
    public final void onComplete() {
        this.c.lazySet(EnumC1604b.f17147a);
        for (A1 a12 : (A1[]) getAndSet(f)) {
            a12.f19121a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19128d = th2;
        this.c.lazySet(EnumC1604b.f17147a);
        for (A1 a12 : (A1[]) getAndSet(f)) {
            a12.f19121a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        for (A1 a12 : (A1[]) get()) {
            a12.f19121a.onNext(obj);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.c, interfaceC1486b);
    }
}
