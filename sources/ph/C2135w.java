package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2135w extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19672a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19673b;
    public final Object c;

    public C2135w(long j, O2 o22) {
        this.f19673b = j;
        this.c = o22;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19672a) {
            case 0:
                EnumC1604b.a(this);
                break;
            default:
                EnumC1604b.a(this);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ph.R2] */
    @Override // ch.r
    public final void onComplete() {
        switch (this.f19672a) {
            case 0:
                Object obj = get();
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (obj != enumC1604b) {
                    lazySet(enumC1604b);
                    ((C2131v) this.c).a(this, this.f19673b);
                }
                break;
            default:
                Object obj2 = get();
                EnumC1604b enumC1604b2 = EnumC1604b.f17147a;
                if (obj2 != enumC1604b2) {
                    lazySet(enumC1604b2);
                    this.c.b(this.f19673b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ph.O2] */
    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19672a) {
            case 0:
                Object obj = get();
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (obj == enumC1604b) {
                    S1.s.r(th2);
                } else {
                    lazySet(enumC1604b);
                    C2131v c2131v = (C2131v) this.c;
                    EnumC1604b.a(c2131v.f);
                    c2131v.e.c(this);
                    c2131v.onError(th2);
                }
                break;
            default:
                Object obj2 = get();
                EnumC1604b enumC1604b2 = EnumC1604b.f17147a;
                if (obj2 == enumC1604b2) {
                    S1.s.r(th2);
                } else {
                    lazySet(enumC1604b2);
                    this.c.a(this.f19673b, th2);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ph.R2] */
    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19672a) {
            case 0:
                InterfaceC1486b interfaceC1486b = (InterfaceC1486b) get();
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b != enumC1604b) {
                    lazySet(enumC1604b);
                    interfaceC1486b.dispose();
                    ((C2131v) this.c).a(this, this.f19673b);
                }
                break;
            default:
                InterfaceC1486b interfaceC1486b2 = (InterfaceC1486b) get();
                EnumC1604b enumC1604b2 = EnumC1604b.f17147a;
                if (interfaceC1486b2 != enumC1604b2) {
                    interfaceC1486b2.dispose();
                    lazySet(enumC1604b2);
                    this.c.b(this.f19673b);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19672a) {
            case 0:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            default:
                EnumC1604b.e(this, interfaceC1486b);
                break;
        }
    }

    public C2135w(C2131v c2131v, long j) {
        this.c = c2131v;
        this.f19673b = j;
    }
}
