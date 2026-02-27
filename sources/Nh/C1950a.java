package nh;

import S1.s;
import ch.i;
import ch.r;
import ch.x;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import lh.C1835f;

/* JADX INFO: renamed from: nh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1950a extends C1835f implements i, x {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1950a(r rVar, int i) {
        super(rVar);
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fh.b, java.lang.Object] */
    @Override // lh.C1835f, fh.InterfaceC1486b
    public final void dispose() {
        switch (this.c) {
            case 0:
                super.dispose();
                this.f18735d.dispose();
                break;
            default:
                super.dispose();
                ((InterfaceC1486b) this.f18735d).dispose();
                break;
        }
    }

    @Override // ch.i
    public void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f18304a.onComplete();
    }

    @Override // ch.i, ch.x
    public final void onError(Throwable th2) {
        switch (this.c) {
            case 0:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f18304a.onError(th2);
                } else {
                    s.r(th2);
                }
                break;
            default:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f18304a.onError(th2);
                } else {
                    s.r(th2);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fh.b, java.lang.Object] */
    @Override // ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.c) {
            case 0:
                if (EnumC1604b.f(this.f18735d, interfaceC1486b)) {
                    this.f18735d = interfaceC1486b;
                    this.f18304a.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f((InterfaceC1486b) this.f18735d, interfaceC1486b)) {
                    this.f18735d = interfaceC1486b;
                    this.f18304a.onSubscribe(this);
                }
                break;
        }
    }
}
