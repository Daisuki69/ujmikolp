package Vh;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6122a;

    public /* synthetic */ b(int i) {
        this.f6122a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6122a) {
            case 0:
                return a.f6121a;
            case 1:
                return c.f6123a;
            case 2:
                return d.f6124a;
            case 3:
                return e.f6125a;
            default:
                return null;
        }
    }
}
