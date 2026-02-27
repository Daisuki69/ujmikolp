package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Collection;

/* JADX INFO: renamed from: ph.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2098m1 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f19551b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19552d;

    public /* synthetic */ C2098m1(Object obj, int i) {
        this.f19550a = i;
        this.f19552d = obj;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19550a) {
            case 0:
                this.f19551b.dispose();
                this.f19551b = EnumC1604b.f17147a;
                break;
            case 1:
                this.c = null;
                this.f19551b.dispose();
                break;
            case 2:
                this.f19551b.dispose();
                break;
            default:
                this.f19551b.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19550a) {
            case 0:
                this.f19551b = EnumC1604b.f17147a;
                Object obj = this.c;
                ch.i iVar = (ch.i) this.f19552d;
                if (obj == null) {
                    iVar.onComplete();
                } else {
                    this.c = null;
                    iVar.onSuccess(obj);
                }
                break;
            case 1:
                Object obj2 = this.c;
                ch.r rVar = (ch.r) this.f19552d;
                if (obj2 != null) {
                    this.c = null;
                    rVar.onNext(obj2);
                }
                rVar.onComplete();
                break;
            case 2:
                Collection collection = (Collection) this.c;
                this.c = null;
                ch.r rVar2 = (ch.r) this.f19552d;
                rVar2.onNext(collection);
                rVar2.onComplete();
                break;
            default:
                Collection collection2 = (Collection) this.c;
                this.c = null;
                ((ch.x) this.f19552d).onSuccess(collection2);
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19550a) {
            case 0:
                this.f19551b = EnumC1604b.f17147a;
                this.c = null;
                ((ch.i) this.f19552d).onError(th2);
                break;
            case 1:
                this.c = null;
                ((ch.r) this.f19552d).onError(th2);
                break;
            case 2:
                this.c = null;
                ((ch.r) this.f19552d).onError(th2);
                break;
            default:
                this.c = null;
                ((ch.x) this.f19552d).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19550a) {
            case 0:
                this.c = obj;
                break;
            case 1:
                this.c = obj;
                break;
            case 2:
                ((Collection) this.c).add(obj);
                break;
            default:
                ((Collection) this.c).add(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19550a) {
            case 0:
                if (EnumC1604b.f(this.f19551b, interfaceC1486b)) {
                    this.f19551b = interfaceC1486b;
                    ((ch.i) this.f19552d).onSubscribe(this);
                }
                break;
            case 1:
                if (EnumC1604b.f(this.f19551b, interfaceC1486b)) {
                    this.f19551b = interfaceC1486b;
                    ((ch.r) this.f19552d).onSubscribe(this);
                }
                break;
            case 2:
                if (EnumC1604b.f(this.f19551b, interfaceC1486b)) {
                    this.f19551b = interfaceC1486b;
                    ((ch.r) this.f19552d).onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19551b, interfaceC1486b)) {
                    this.f19551b = interfaceC1486b;
                    ((ch.x) this.f19552d).onSubscribe(this);
                }
                break;
        }
    }

    public /* synthetic */ C2098m1(Object obj, Collection collection, int i) {
        this.f19550a = i;
        this.f19552d = obj;
        this.c = collection;
    }
}
