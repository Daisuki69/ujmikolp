package xh;

import ch.InterfaceC1104c;
import ch.i;
import ch.r;
import ch.x;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2481e implements r, i, x, InterfaceC1104c, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f21003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.i f21004b;
    public final vh.i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21005d;
    public final EnumC2480d e;
    public final AtomicReference f;

    public C2481e() {
        EnumC2480d enumC2480d = EnumC2480d.f21001a;
        this.f21004b = new vh.i();
        this.c = new vh.i();
        this.f21003a = new CountDownLatch(1);
        this.f = new AtomicReference();
        this.e = enumC2480d;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f);
    }

    @Override // ch.r
    public final void onComplete() {
        CountDownLatch countDownLatch = this.f21003a;
        if (!this.f21005d) {
            this.f21005d = true;
            if (this.f.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        CountDownLatch countDownLatch = this.f21003a;
        boolean z4 = this.f21005d;
        vh.i iVar = this.c;
        if (!z4) {
            this.f21005d = true;
            if (this.f.get() == null) {
                iVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th2 == null) {
                iVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                iVar.add(th2);
            }
            this.e.getClass();
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        boolean z4 = this.f21005d;
        vh.i iVar = this.c;
        if (!z4) {
            this.f21005d = true;
            if (this.f.get() == null) {
                iVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f21004b.add(obj);
        if (obj == null) {
            iVar.add(new NullPointerException("onNext received a null value"));
        }
        this.e.getClass();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        Thread.currentThread();
        vh.i iVar = this.c;
        if (interfaceC1486b == null) {
            iVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference atomicReference = this.f;
        while (!atomicReference.compareAndSet(null, interfaceC1486b)) {
            if (atomicReference.get() != null) {
                interfaceC1486b.dispose();
                if (atomicReference.get() != EnumC1604b.f17147a) {
                    iVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC1486b));
                    return;
                }
                return;
            }
        }
        this.e.getClass();
    }

    @Override // ch.i, ch.x
    public final void onSuccess(Object obj) {
        onNext(obj);
        onComplete();
    }
}
