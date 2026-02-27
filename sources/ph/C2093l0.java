package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import lh.C1840k;
import xh.C2479c;

/* JADX INFO: renamed from: ph.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2093l0 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19540b;

    public /* synthetic */ C2093l0(ch.r rVar, int i) {
        this.f19539a = i;
        this.f19540b = rVar;
    }

    private final void a() {
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19539a) {
            case 0:
                ((C2097m0) this.f19540b).f19548b.onComplete();
                break;
            case 1:
                AbstractC2099m2 abstractC2099m2 = (AbstractC2099m2) this.f19540b;
                abstractC2099m2.f19555d.dispose();
                abstractC2099m2.a();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19539a) {
            case 0:
                ((C2097m0) this.f19540b).f19548b.onError(th2);
                break;
            case 1:
                AbstractC2099m2 abstractC2099m2 = (AbstractC2099m2) this.f19540b;
                abstractC2099m2.f19555d.dispose();
                abstractC2099m2.f19553a.onError(th2);
                break;
            default:
                C1840k c1840k = (C1840k) this.f19540b;
                EnumC1604b.a((AtomicReference) c1840k.f18319d);
                ((C2479c) c1840k.f18318b).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19539a) {
            case 0:
                ((C2097m0) this.f19540b).f19548b.onNext(obj);
                break;
            case 1:
                ((AbstractC2099m2) this.f19540b).b();
                break;
            default:
                ((C1840k) this.f19540b).lazySet(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19539a) {
            case 0:
                C1487c c1487c = ((C2097m0) this.f19540b).c;
                c1487c.getClass();
                EnumC1604b.d(c1487c, interfaceC1486b);
                break;
            case 1:
                EnumC1604b.e(((AbstractC2099m2) this.f19540b).c, interfaceC1486b);
                break;
            default:
                EnumC1604b.e((AtomicReference) ((C1840k) this.f19540b).e, interfaceC1486b);
                break;
        }
    }
}
