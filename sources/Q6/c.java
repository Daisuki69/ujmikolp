package Q6;

import L9.C0323a;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f5266b;

    public /* synthetic */ c(C0323a c0323a, int i) {
        this.f5265a = i;
        this.f5266b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        C0323a c0323a = this.f5266b;
        switch (this.f5265a) {
            case 0:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                c0323a.e(it);
                break;
            default:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                c0323a.e(it2);
                break;
        }
    }
}
