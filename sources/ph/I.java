package ph;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC2048a implements ch.r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H[] f19212k = new H[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final H[] f19213l = new H[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19214b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19215d;
    public volatile long e;
    public final S1.x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S1.x f19216g;
    public int h;
    public Throwable i;
    public volatile boolean j;

    public I(ch.l lVar, int i) {
        super(lVar);
        this.c = i;
        this.f19214b = new AtomicBoolean();
        S1.x xVar = new S1.x(i);
        this.f = xVar;
        this.f19216g = xVar;
        this.f19215d = new AtomicReference(f19212k);
    }

    public final void d(H h) {
        if (h.getAndIncrement() != 0) {
            return;
        }
        long j = h.e;
        int i = h.f19204d;
        S1.x xVar = h.c;
        ch.r rVar = h.f19202a;
        int i4 = this.c;
        int iAddAndGet = 1;
        while (!h.f) {
            boolean z4 = this.j;
            boolean z5 = this.e == j;
            if (z4 && z5) {
                h.c = null;
                Throwable th2 = this.i;
                if (th2 != null) {
                    rVar.onError(th2);
                    return;
                } else {
                    rVar.onComplete();
                    return;
                }
            }
            if (z5) {
                h.e = j;
                h.f19204d = i;
                h.c = xVar;
                iAddAndGet = h.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i4) {
                    xVar = (S1.x) xVar.f5632b;
                    i = 0;
                }
                rVar.onNext(((Object[]) xVar.f5631a)[i]);
                i++;
                j++;
            }
        }
        h.c = null;
    }

    @Override // ch.r
    public final void onComplete() {
        this.j = true;
        for (H h : (H[]) this.f19215d.getAndSet(f19213l)) {
            d(h);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.i = th2;
        this.j = true;
        for (H h : (H[]) this.f19215d.getAndSet(f19213l)) {
            d(h);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        int i = this.h;
        if (i == this.c) {
            S1.x xVar = new S1.x(i);
            ((Object[]) xVar.f5631a)[0] = obj;
            this.h = 1;
            this.f19216g.f5632b = xVar;
            this.f19216g = xVar;
        } else {
            ((Object[]) this.f19216g.f5631a)[i] = obj;
            this.h = i + 1;
        }
        this.e++;
        for (H h : (H[]) this.f19215d.get()) {
            d(h);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        H h = new H(rVar, this);
        rVar.onSubscribe(h);
        loop0: while (true) {
            AtomicReference atomicReference = this.f19215d;
            H[] hArr = (H[]) atomicReference.get();
            if (hArr != f19213l) {
                int length = hArr.length;
                H[] hArr2 = new H[length + 1];
                System.arraycopy(hArr, 0, hArr2, 0, length);
                hArr2[length] = h;
                while (!atomicReference.compareAndSet(hArr, hArr2)) {
                    if (atomicReference.get() != hArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f19214b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            d(h);
        } else {
            this.f19404a.subscribe(this);
        }
    }
}
