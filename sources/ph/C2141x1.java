package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2141x1 implements ch.r, InterfaceC1486b {
    public static final C2137w1[] e = new C2137w1[0];
    public static final C2137w1[] f = new C2137w1[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19684a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19686d = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19685b = new AtomicReference(e);
    public final AtomicBoolean c = new AtomicBoolean();

    public C2141x1(AtomicReference atomicReference) {
        this.f19684a = atomicReference;
    }

    public final boolean a() {
        return this.f19685b.get() == f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C2137w1 c2137w1) {
        C2137w1[] c2137w1Arr;
        while (true) {
            AtomicReference atomicReference = this.f19685b;
            C2137w1[] c2137w1Arr2 = (C2137w1[]) atomicReference.get();
            int length = c2137w1Arr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2137w1Arr2[i].equals(c2137w1)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2137w1Arr = e;
            } else {
                C2137w1[] c2137w1Arr3 = new C2137w1[length - 1];
                System.arraycopy(c2137w1Arr2, 0, c2137w1Arr3, 0, i);
                System.arraycopy(c2137w1Arr2, i + 1, c2137w1Arr3, i, (length - i) - 1);
                c2137w1Arr = c2137w1Arr3;
            }
            while (!atomicReference.compareAndSet(c2137w1Arr2, c2137w1Arr)) {
                if (atomicReference.get() != c2137w1Arr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f19685b;
        C2137w1[] c2137w1Arr = f;
        if (((C2137w1[]) atomicReference2.getAndSet(c2137w1Arr)) != c2137w1Arr) {
            do {
                atomicReference = this.f19684a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            EnumC1604b.a(this.f19686d);
        }
    }

    @Override // ch.r
    public final void onComplete() {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f19684a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        for (C2137w1 c2137w1 : (C2137w1[]) this.f19685b.getAndSet(f)) {
            c2137w1.f19676a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f19684a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        C2137w1[] c2137w1Arr = (C2137w1[]) this.f19685b.getAndSet(f);
        if (c2137w1Arr.length == 0) {
            S1.s.r(th2);
            return;
        }
        for (C2137w1 c2137w1 : c2137w1Arr) {
            c2137w1.f19676a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        for (C2137w1 c2137w1 : (C2137w1[]) this.f19685b.get()) {
            c2137w1.f19676a.onNext(obj);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f19686d, interfaceC1486b);
    }
}
