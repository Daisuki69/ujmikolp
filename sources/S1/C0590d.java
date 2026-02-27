package S1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: S1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0590d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0590d f5608d = new C0590d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f5609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5610b;
    public C0590d c;

    public C0590d(Runnable runnable, Executor executor) {
        this.f5609a = runnable;
        this.f5610b = executor;
    }

    public C0590d() {
        this.f5609a = null;
        this.f5610b = null;
    }
}
