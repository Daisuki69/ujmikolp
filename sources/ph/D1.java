package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class D1 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19162b;
    public final AtomicReference c;

    public /* synthetic */ D1(ch.r rVar, AtomicReference atomicReference, int i) {
        this.f19161a = i;
        this.f19162b = rVar;
        this.c = atomicReference;
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19161a) {
            case 0:
                ((Wh.b) this.f19162b).onComplete();
                break;
            default:
                this.f19162b.onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19161a) {
            case 0:
                ((Wh.b) this.f19162b).onError(th2);
                break;
            default:
                this.f19162b.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19161a) {
            case 0:
                ((Wh.b) this.f19162b).onNext(obj);
                break;
            default:
                this.f19162b.onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19161a) {
            case 0:
                EnumC1604b.e((A2) this.c, interfaceC1486b);
                break;
            default:
                EnumC1604b.c(this.c, interfaceC1486b);
                break;
        }
    }
}
