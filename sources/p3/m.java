package p3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f19042b;

    static {
        m mVar = new m("INSTANCE", 0);
        f19041a = mVar;
        f19042b = new m[]{mVar};
    }

    public static m[] values() {
        return (m[]) f19042b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().f19027a.post(runnable);
    }
}
