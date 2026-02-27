package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ph.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2110p1 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19591b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable f19592d;
    public InterfaceC1486b e;

    public C2110p1(ch.r rVar, hh.n nVar, hh.n nVar2, Callable callable) {
        this.f19590a = rVar;
        this.f19591b = nVar;
        this.c = nVar2;
        this.f19592d = callable;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        ch.r rVar = this.f19590a;
        try {
            Object objCall = this.f19592d.call();
            jh.e.b(objCall, "The onComplete ObservableSource returned is null");
            rVar.onNext((ch.p) objCall);
            rVar.onComplete();
        } catch (Throwable th2) {
            of.p.F(th2);
            rVar.onError(th2);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        ch.r rVar = this.f19590a;
        try {
            Object objApply = this.c.apply(th2);
            jh.e.b(objApply, "The onError ObservableSource returned is null");
            rVar.onNext((ch.p) objApply);
            rVar.onComplete();
        } catch (Throwable th3) {
            of.p.F(th3);
            rVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        ch.r rVar = this.f19590a;
        try {
            Object objApply = this.f19591b.apply(obj);
            jh.e.b(objApply, "The onNext ObservableSource returned is null");
            rVar.onNext((ch.p) objApply);
        } catch (Throwable th2) {
            of.p.F(th2);
            rVar.onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19590a.onSubscribe(this);
        }
    }
}
