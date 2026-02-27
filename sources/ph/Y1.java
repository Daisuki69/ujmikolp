package ph;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Y1 implements ch.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1 f19389b;

    public Y1(AtomicReference atomicReference, S1 s12) {
        this.f19388a = atomicReference;
        this.f19389b = s12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.p
    public final void subscribe(ch.r rVar) {
        X1 x12;
        loop0: while (true) {
            x12 = (X1) this.f19388a.get();
            if (x12 != null) {
                break;
            }
            X1 x13 = new X1(this.f19389b.call());
            AtomicReference atomicReference = this.f19388a;
            while (!atomicReference.compareAndSet(null, x13)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            x12 = x13;
            break loop0;
        }
        T1 t12 = new T1(x12, rVar);
        rVar.onSubscribe(t12);
        loop2: while (true) {
            AtomicReference atomicReference2 = x12.c;
            T1[] t1Arr = (T1[]) atomicReference2.get();
            if (t1Arr != X1.f) {
                int length = t1Arr.length;
                T1[] t1Arr2 = new T1[length + 1];
                System.arraycopy(t1Arr, 0, t1Arr2, 0, length);
                t1Arr2[length] = t12;
                while (!atomicReference2.compareAndSet(t1Arr, t1Arr2)) {
                    if (atomicReference2.get() != t1Arr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (t12.f19346d) {
            x12.a(t12);
        } else {
            x12.f19379a.a(t12);
        }
    }
}
