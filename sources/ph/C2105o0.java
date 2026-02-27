package ph;

import ch.InterfaceC1104c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import vh.C2356g;
import vh.EnumC2352c;

/* JADX INFO: renamed from: ph.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2105o0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19576b;
    public InterfaceC1486b c;

    public /* synthetic */ C2105o0() {
        this.f19575a = 0;
    }

    private final void a(Object obj) {
    }

    private final void b(Object obj) {
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19575a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.c;
                EnumC2352c enumC2352c = EnumC2352c.f20499a;
                this.c = enumC2352c;
                this.f19576b = enumC2352c;
                interfaceC1486b.dispose();
                break;
            case 1:
                this.c.dispose();
                break;
            case 2:
                this.c.dispose();
                break;
            case 3:
                this.c.dispose();
                break;
            default:
                this.c.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19575a) {
            case 0:
                ch.r rVar = (ch.r) this.f19576b;
                EnumC2352c enumC2352c = EnumC2352c.f20499a;
                this.c = enumC2352c;
                this.f19576b = enumC2352c;
                rVar.onComplete();
                break;
            case 1:
                ((ch.r) this.f19576b).onComplete();
                break;
            case 2:
                ((ch.r) this.f19576b).onComplete();
                break;
            case 3:
                ch.k kVar = ch.k.f9368b;
                ch.r rVar2 = (ch.r) this.f19576b;
                rVar2.onNext(kVar);
                rVar2.onComplete();
                break;
            default:
                ((InterfaceC1104c) this.f19576b).onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19575a) {
            case 0:
                ch.r rVar = (ch.r) this.f19576b;
                EnumC2352c enumC2352c = EnumC2352c.f20499a;
                this.c = enumC2352c;
                this.f19576b = enumC2352c;
                rVar.onError(th2);
                break;
            case 1:
                ((ch.r) this.f19576b).onError(th2);
                break;
            case 2:
                ((ch.r) this.f19576b).onError(th2);
                break;
            case 3:
                jh.e.b(th2, "error is null");
                ch.k kVar = new ch.k(new C2356g(th2));
                ch.r rVar2 = (ch.r) this.f19576b;
                rVar2.onNext(kVar);
                rVar2.onComplete();
                break;
            default:
                ((InterfaceC1104c) this.f19576b).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19575a) {
            case 0:
                ((ch.r) this.f19576b).onNext(obj);
                break;
            case 1:
                ((ch.r) this.f19576b).onNext(obj);
                break;
            case 3:
                jh.e.b(obj, "value is null");
                ((ch.r) this.f19576b).onNext(new ch.k(obj));
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19575a) {
            case 0:
                if (EnumC1604b.f(this.c, interfaceC1486b)) {
                    this.c = interfaceC1486b;
                    ((ch.r) this.f19576b).onSubscribe(this);
                }
                break;
            case 1:
                if (EnumC1604b.f(this.c, interfaceC1486b)) {
                    this.c = interfaceC1486b;
                    ((ch.r) this.f19576b).onSubscribe(this);
                }
                break;
            case 2:
                this.c = interfaceC1486b;
                ((ch.r) this.f19576b).onSubscribe(this);
                break;
            case 3:
                if (EnumC1604b.f(this.c, interfaceC1486b)) {
                    this.c = interfaceC1486b;
                    ((ch.r) this.f19576b).onSubscribe(this);
                }
                break;
            default:
                this.c = interfaceC1486b;
                ((InterfaceC1104c) this.f19576b).onSubscribe(this);
                break;
        }
    }

    public /* synthetic */ C2105o0(Object obj, int i) {
        this.f19575a = i;
        this.f19576b = obj;
    }
}
