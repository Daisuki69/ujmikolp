package ba;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f8591b;

    public /* synthetic */ l(Bb.f fVar, int i) {
        this.f8590a = i;
        this.f8591b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        Bb.f fVar = this.f8591b;
        String strTnTj78 = numX49.tnTj78("bucC");
        switch (this.f8590a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                fVar.e(bVar);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar2, strTnTj78);
                fVar.e(bVar2);
                break;
        }
    }
}
