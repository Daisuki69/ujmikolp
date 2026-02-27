package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class P1 extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f19303b;

    public /* synthetic */ P1(AtomicInteger atomicInteger, int i) {
        this.f19302a = i;
        this.f19303b = atomicInteger;
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19302a) {
            case 0:
                Q1 q1 = (Q1) this.f19303b;
                EnumC1604b.a(q1.f);
                AbstractC0617a.H(q1.f19315b, q1, q1.f19316d);
                break;
            case 1:
                Q1 q12 = (Q1) this.f19303b;
                EnumC1604b.a(q12.f);
                AbstractC0617a.H(q12.f19315b, q12, q12.f19316d);
                break;
            default:
                I2 i22 = (I2) this.f19303b;
                EnumC1604b.a(i22.f19225b);
                AbstractC0617a.H(i22.f19224a, i22, i22.f19226d);
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19302a) {
            case 0:
                Q1 q1 = (Q1) this.f19303b;
                EnumC1604b.a(q1.f);
                AbstractC0617a.I(q1.f19315b, th2, q1, q1.f19316d);
                break;
            case 1:
                Q1 q12 = (Q1) this.f19303b;
                EnumC1604b.a(q12.f);
                AbstractC0617a.I(q12.f19315b, th2, q12, q12.f19316d);
                break;
            default:
                I2 i22 = (I2) this.f19303b;
                EnumC1604b.a(i22.f19225b);
                AbstractC0617a.I(i22.f19224a, th2, i22, i22.f19226d);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19302a) {
            case 0:
                ((Q1) this.f19303b).b();
                break;
            case 1:
                ((Q1) this.f19303b).b();
                break;
            default:
                EnumC1604b.a(this);
                I2 i22 = (I2) this.f19303b;
                EnumC1604b.a(i22.f19225b);
                AbstractC0617a.H(i22.f19224a, i22, i22.f19226d);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19302a) {
            case 0:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            case 1:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            default:
                EnumC1604b.e(this, interfaceC1486b);
                break;
        }
    }
}
