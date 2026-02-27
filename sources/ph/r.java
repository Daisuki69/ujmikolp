package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19612b;
    public final Callable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f19613d;
    public int e;
    public InterfaceC1486b f;

    public r(ch.r rVar, int i, Callable callable) {
        this.f19611a = rVar;
        this.f19612b = i;
        this.c = callable;
    }

    public final boolean a() {
        try {
            Object objCall = this.c.call();
            jh.e.b(objCall, "Empty buffer supplied");
            this.f19613d = (Collection) objCall;
            return true;
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f19613d = null;
            InterfaceC1486b interfaceC1486b = this.f;
            ch.r rVar = this.f19611a;
            if (interfaceC1486b == null) {
                EnumC1605c.c(th2, rVar);
                return false;
            }
            interfaceC1486b.dispose();
            rVar.onError(th2);
            return false;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        Collection collection = this.f19613d;
        if (collection != null) {
            this.f19613d = null;
            boolean zIsEmpty = collection.isEmpty();
            ch.r rVar = this.f19611a;
            if (!zIsEmpty) {
                rVar.onNext(collection);
            }
            rVar.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19613d = null;
        this.f19611a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        Collection collection = this.f19613d;
        if (collection != null) {
            collection.add(obj);
            int i = this.e + 1;
            this.e = i;
            if (i >= this.f19612b) {
                this.f19611a.onNext(collection);
                this.e = 0;
                a();
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f19611a.onSubscribe(this);
        }
    }
}
