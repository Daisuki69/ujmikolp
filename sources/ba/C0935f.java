package ba;

import L9.C0323a;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ba.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0935f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8581b;

    public /* synthetic */ C0935f(C0323a c0323a, int i) {
        this.f8580a = i;
        this.f8581b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        C0323a c0323a = this.f8581b;
        String strTnTj78 = numX49.tnTj78("bucrq");
        switch (this.f8580a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                c0323a.e(bVar);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar2, strTnTj78);
                c0323a.e(bVar2);
                break;
        }
    }
}
