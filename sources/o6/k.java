package o6;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f18802a;

    public /* synthetic */ k(n nVar) {
        this.f18802a = nVar;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.j.g(it, "it");
        this.f18802a.n(it);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        return this.f18802a.p((List) obj);
    }
}
