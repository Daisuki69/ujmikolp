package o6;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18805b;

    public /* synthetic */ m(n nVar, int i) {
        this.f18804a = i;
        this.f18805b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18804a) {
            case 0:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f18805b.m(p02);
                break;
            default:
                n nVar = this.f18805b;
                nVar.o(nVar.f((Throwable) obj, true));
                break;
        }
    }
}
