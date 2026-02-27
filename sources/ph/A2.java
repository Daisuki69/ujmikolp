package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class A2 extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19123b;
    public Object c;

    public A2(ch.r rVar, int i) {
        this.f19122a = i;
        switch (i) {
            case 1:
                this.c = new AtomicReference();
                this.f19123b = rVar;
                break;
            case 2:
                this.f19123b = rVar;
                break;
            default:
                this.f19123b = rVar;
                this.c = new AtomicReference();
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19122a) {
            case 0:
                EnumC1604b.a((AtomicReference) this.c);
                EnumC1604b.a(this);
                break;
            case 1:
                EnumC1604b.a((AtomicReference) this.c);
                EnumC1604b.a(this);
                break;
            default:
                ((InterfaceC1486b) this.c).dispose();
                EnumC1604b.a(this);
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19122a) {
            case 0:
                this.f19123b.onComplete();
                break;
            case 1:
                dispose();
                this.f19123b.onComplete();
                break;
            default:
                EnumC1604b.a(this);
                this.f19123b.onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19122a) {
            case 0:
                this.f19123b.onError(th2);
                break;
            case 1:
                dispose();
                this.f19123b.onError(th2);
                break;
            default:
                EnumC1604b.a(this);
                this.f19123b.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19122a) {
            case 0:
                this.f19123b.onNext(obj);
                break;
            case 1:
                this.f19123b.onNext(obj);
                break;
            default:
                this.f19123b.onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19122a) {
            case 0:
                EnumC1604b.e((AtomicReference) this.c, interfaceC1486b);
                break;
            case 1:
                if (EnumC1604b.e((AtomicReference) this.c, interfaceC1486b)) {
                    this.f19123b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f((InterfaceC1486b) this.c, interfaceC1486b)) {
                    this.c = interfaceC1486b;
                    this.f19123b.onSubscribe(this);
                }
                break;
        }
    }
}
