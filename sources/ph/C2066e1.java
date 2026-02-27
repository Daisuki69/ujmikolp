package ph;

import D.CallableC0192z;
import java.util.List;

/* JADX INFO: renamed from: ph.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2066e1 implements hh.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19447b;

    public /* synthetic */ C2066e1(hh.n nVar, int i) {
        this.f19446a = i;
        this.f19447b = nVar;
    }

    @Override // hh.n
    public final Object apply(Object obj) {
        switch (this.f19446a) {
            case 0:
                Object objApply = this.f19447b.apply(obj);
                jh.e.b(objApply, "The itemDelay returned a null ObservableSource");
                return new N1((ch.p) objApply, 1L, 2).map(new CallableC0192z(obj, 4)).defaultIfEmpty(obj);
            default:
                return ch.l.zipIterable((List) obj, this.f19447b, false, ch.l.bufferSize());
        }
    }
}
