package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19386b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19387d;

    public /* synthetic */ Y(Object obj, int i) {
        this.f19385a = i;
        this.f19386b = obj;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19385a) {
            case 0:
                this.f19387d.dispose();
                break;
            case 1:
                this.f19387d.dispose();
                break;
            default:
                this.f19387d.dispose();
                this.f19387d = EnumC1604b.f17147a;
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19385a) {
            case 0:
                Long lValueOf = Long.valueOf(this.c);
                ch.r rVar = (ch.r) this.f19386b;
                rVar.onNext(lValueOf);
                rVar.onComplete();
                break;
            case 1:
                ((ch.r) this.f19386b).onComplete();
                break;
            default:
                this.f19387d = EnumC1604b.f17147a;
                ((ch.x) this.f19386b).onSuccess(Long.valueOf(this.c));
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19385a) {
            case 0:
                ((ch.r) this.f19386b).onError(th2);
                break;
            case 1:
                ((ch.r) this.f19386b).onError(th2);
                break;
            default:
                this.f19387d = EnumC1604b.f17147a;
                ((ch.x) this.f19386b).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19385a) {
            case 0:
                this.c++;
                break;
            case 1:
                long j = this.c;
                if (j == 0) {
                    ((ch.r) this.f19386b).onNext(obj);
                } else {
                    this.c = j - 1;
                }
                break;
            default:
                this.c++;
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19385a) {
            case 0:
                if (EnumC1604b.f(this.f19387d, interfaceC1486b)) {
                    this.f19387d = interfaceC1486b;
                    ((ch.r) this.f19386b).onSubscribe(this);
                }
                break;
            case 1:
                if (EnumC1604b.f(this.f19387d, interfaceC1486b)) {
                    this.f19387d = interfaceC1486b;
                    ((ch.r) this.f19386b).onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19387d, interfaceC1486b)) {
                    this.f19387d = interfaceC1486b;
                    ((ch.x) this.f19386b).onSubscribe(this);
                }
                break;
        }
    }

    public Y(ch.r rVar, long j) {
        this.f19385a = 1;
        this.f19386b = rVar;
        this.c = j;
    }
}
