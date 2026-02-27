package Dc;

import D8.C0214w;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0214w f1119b;

    public /* synthetic */ c(C0214w c0214w, int i) {
        this.f1118a = i;
        this.f1119b = c0214w;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        C0214w c0214w = this.f1119b;
        switch (this.f1118a) {
            case 0:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(it, "it");
                c0214w.e(it);
                break;
            default:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(it2, "it");
                c0214w.e(it2);
                break;
        }
    }
}
