package lh;

import ch.r;
import fh.InterfaceC1486b;
import java.util.concurrent.CountDownLatch;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: lh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1833d extends CountDownLatch implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f18300b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f18301d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1833d(int i, int i4) {
        super(i);
        this.e = i4;
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw AbstractC2353d.d(e);
            }
        }
        Throwable th2 = this.f18300b;
        if (th2 == null) {
            return this.f18299a;
        }
        throw AbstractC2353d.d(th2);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18301d = true;
        InterfaceC1486b interfaceC1486b = this.c;
        if (interfaceC1486b != null) {
            interfaceC1486b.dispose();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        countDown();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.e) {
            case 0:
                if (this.f18299a == null) {
                    this.f18300b = th2;
                }
                countDown();
                break;
            default:
                this.f18299a = null;
                this.f18300b = th2;
                countDown();
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.e) {
            case 0:
                if (this.f18299a == null) {
                    this.f18299a = obj;
                    this.c.dispose();
                    countDown();
                }
                break;
            default:
                this.f18299a = obj;
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        this.c = interfaceC1486b;
        if (this.f18301d) {
            interfaceC1486b.dispose();
        }
    }
}
