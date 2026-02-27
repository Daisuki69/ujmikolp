package o6;

import e2.C1421c;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f18803a;

    public /* synthetic */ l(n nVar) {
        this.f18803a = nVar;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List favorites = (List) obj;
        kotlin.jvm.internal.j.g(favorites, "favorites");
        this.f18803a.n(favorites);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        List bankList = (List) obj;
        kotlin.jvm.internal.j.g(bankList, "bankList");
        n nVar = this.f18803a;
        return new Lh.f(nVar.k(), new C1421c(24, nVar, bankList), 0);
    }
}
