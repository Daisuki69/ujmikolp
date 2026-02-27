package ba;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8628b;

    public /* synthetic */ x(C c, int i) {
        this.f8627a = i;
        this.f8628b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strTnTj78 = numX49.tnTj78("bucLe");
        C c = this.f8628b;
        switch (this.f8627a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                c.e(bVar);
                break;
            case 1:
                c.f((Throwable) obj, true);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar2, strTnTj78);
                c.e(bVar2);
                break;
        }
    }
}
