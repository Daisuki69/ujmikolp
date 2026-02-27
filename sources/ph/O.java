package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19287b;
    public final AtomicInteger c;

    public /* synthetic */ O(ch.r rVar, AtomicInteger atomicInteger, int i) {
        this.f19286a = i;
        this.f19287b = rVar;
        this.c = atomicInteger;
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19286a) {
            case 0:
                P p10 = (P) this.c;
                p10.i = false;
                p10.a();
                break;
            default:
                Q q9 = (Q) this.c;
                q9.f19311g = false;
                q9.a();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19286a) {
            case 0:
                P p10 = (P) this.c;
                Qh.c cVar = p10.f19295d;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    S1.s.r(th2);
                } else {
                    if (!p10.f) {
                        p10.h.dispose();
                    }
                    p10.i = false;
                    p10.a();
                }
                break;
            default:
                ((Q) this.c).dispose();
                ((C2479c) this.f19287b).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19286a) {
            case 0:
                this.f19287b.onNext(obj);
                break;
            default:
                ((C2479c) this.f19287b).onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19286a) {
            case 0:
                EnumC1604b.c(this, interfaceC1486b);
                break;
            default:
                EnumC1604b.c(this, interfaceC1486b);
                break;
        }
    }
}
