package ph;

import ch.AbstractC1103b;
import ch.AbstractC1109h;
import ch.InterfaceC1104c;
import ch.InterfaceC1105d;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends AtomicReference implements ch.r, InterfaceC1104c, InterfaceC1486b, ch.i, ch.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19349b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19350d;

    public /* synthetic */ U(ch.r rVar, Object obj, int i) {
        this.f19348a = i;
        this.f19349b = rVar;
        this.f19350d = obj;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19348a) {
            case 0:
                EnumC1604b.a(this);
                break;
            case 1:
                EnumC1604b.a(this);
                break;
            default:
                EnumC1604b.a(this);
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19348a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    EnumC1604b.c(this, null);
                    InterfaceC1105d interfaceC1105d = (InterfaceC1105d) this.f19350d;
                    this.f19350d = null;
                    ((AbstractC1103b) interfaceC1105d).b(this);
                } else {
                    this.f19349b.onComplete();
                }
                break;
            case 1:
                if (!this.c) {
                    this.c = true;
                    EnumC1604b.c(this, null);
                    ch.j jVar = (ch.j) this.f19350d;
                    this.f19350d = null;
                    ((AbstractC1109h) jVar).b(this);
                } else {
                    this.f19349b.onComplete();
                }
                break;
            default:
                this.c = true;
                EnumC1604b.c(this, null);
                ch.y yVar = (ch.y) this.f19350d;
                this.f19350d = null;
                ((ch.w) yVar).c(this);
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19348a) {
            case 0:
                this.f19349b.onError(th2);
                break;
            case 1:
                this.f19349b.onError(th2);
                break;
            default:
                this.f19349b.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19348a) {
            case 0:
                this.f19349b.onNext(obj);
                break;
            case 1:
                this.f19349b.onNext(obj);
                break;
            default:
                this.f19349b.onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19348a) {
            case 0:
                if (EnumC1604b.e(this, interfaceC1486b) && !this.c) {
                    this.f19349b.onSubscribe(this);
                    break;
                }
                break;
            case 1:
                if (EnumC1604b.e(this, interfaceC1486b) && !this.c) {
                    this.f19349b.onSubscribe(this);
                    break;
                }
                break;
            default:
                if (EnumC1604b.e(this, interfaceC1486b) && !this.c) {
                    this.f19349b.onSubscribe(this);
                    break;
                }
                break;
        }
    }

    @Override // ch.i, ch.x
    public void onSuccess(Object obj) {
        switch (this.f19348a) {
            case 1:
                ch.r rVar = this.f19349b;
                rVar.onNext(obj);
                rVar.onComplete();
                break;
            default:
                ch.r rVar2 = this.f19349b;
                rVar2.onNext(obj);
                rVar2.onComplete();
                break;
        }
    }
}
