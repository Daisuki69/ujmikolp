package ph;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ph.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2115q2 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh.c f19606b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19607d;
    public Throwable e;
    public final AtomicInteger f;

    public C2115q2(C2111p2 c2111p2, int i, int i4) {
        this.f = c2111p2;
        this.c = i;
        this.f19606b = new rh.c(i4);
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19605a) {
            case 0:
                this.f19607d = true;
                ((C2111p2) this.f).a();
                break;
            default:
                this.f19607d = true;
                ((C2111p2) this.f).a();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19605a) {
            case 0:
                this.e = th2;
                this.f19607d = true;
                ((C2111p2) this.f).a();
                break;
            default:
                this.e = th2;
                this.f19607d = true;
                ((C2111p2) this.f).a();
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19605a) {
            case 0:
                this.f19606b.offer(obj);
                ((C2111p2) this.f).a();
                break;
            default:
                this.f19606b.offer(obj);
                ((C2111p2) this.f).a();
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19605a) {
            case 0:
                ((C2111p2) this.f).c.a(this.c, interfaceC1486b);
                break;
            default:
                ((C2111p2) this.f).c.a(this.c, interfaceC1486b);
                break;
        }
    }

    public C2115q2(C2111p2 c2111p2, int i, int i4, byte b8) {
        this.f = c2111p2;
        this.c = i;
        this.f19606b = new rh.c(i4);
    }
}
