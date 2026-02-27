package S1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f5626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t[] f5627b;

    static {
        t tVar = new t("INSTANCE", 0);
        f5626a = tVar;
        f5627b = new t[]{tVar};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f5627b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
