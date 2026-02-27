package c2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f9273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f9274b;
    public static final /* synthetic */ l[] c;

    static {
        l lVar = new l("INSTANCE", 0);
        f9273a = lVar;
        c = new l[]{lVar};
        f9274b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f9274b.post(runnable);
    }
}
