package ba;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ba.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0929A implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8557b;

    public /* synthetic */ C0929A(C c, int i) {
        this.f8556a = i;
        this.f8557b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        C c = this.f8557b;
        String strTnTj78 = numX49.tnTj78("bucZu");
        switch (this.f8556a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                c.e(bVar);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar2, strTnTj78);
                c.e(bVar2);
                break;
        }
    }
}
