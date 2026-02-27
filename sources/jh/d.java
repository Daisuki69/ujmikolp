package jh;

import g4.C1499a;
import hh.InterfaceC1569b;
import hh.n;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements InterfaceC1569b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f17814a;

    public /* synthetic */ d(n nVar) {
        this.f17814a = nVar;
    }

    @Override // hh.InterfaceC1569b
    public void accept(Object obj, Object obj2) {
        ((Map) obj).put(this.f17814a.apply(obj2), obj2);
    }

    @Override // hh.n
    public Object apply(Object obj) {
        Object objApply = this.f17814a.apply(obj);
        e.b(objApply, "The mapper returned a null Iterable");
        return new C1499a((Iterable) objApply, 3);
    }
}
