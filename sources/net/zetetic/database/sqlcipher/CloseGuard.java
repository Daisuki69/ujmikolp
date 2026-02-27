package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseGuard {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CloseGuard f18644b = new CloseGuard();
    public static volatile Reporter c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f18645a;

    public static final class DefaultReporter implements Reporter {
    }

    public interface Reporter {
    }

    public final void a() {
        if (this != f18644b) {
            this.f18645a = new Throwable("Explicit termination method 'close' not called");
        }
    }
}
