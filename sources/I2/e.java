package i2;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1588d f17091d = new C1588d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorC1587c f17092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorC1587c f17093b;
    public final ExecutorC1587c c;

    public e(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        j.g(backgroundExecutorService, "backgroundExecutorService");
        j.g(blockingExecutorService, "blockingExecutorService");
        this.f17092a = new ExecutorC1587c(backgroundExecutorService);
        this.f17093b = new ExecutorC1587c(backgroundExecutorService);
        Tasks.forResult(null);
        this.c = new ExecutorC1587c(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new Ta.a(0, f17091d, C1588d.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 3).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new Ta.a(0, f17091d, C1588d.class, "isBlockingThread", "isBlockingThread()Z", 0, 4).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
