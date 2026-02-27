package t9;

import A7.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20188b;

    public /* synthetic */ b(j jVar, int i) {
        this.f20187a = i;
        this.f20188b = jVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20187a) {
            case 0:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                j jVar = this.f20188b;
                j.s(jVar, jVar.f(throwable, true), 2);
                break;
            default:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                j jVar2 = this.f20188b;
                j.s(jVar2, jVar2.f(throwable2, true), 2);
                break;
        }
    }
}
