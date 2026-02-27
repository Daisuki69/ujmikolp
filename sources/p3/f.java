package p3;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import n4.RunnableC1918b;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19026b = new Object();
    public static f c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f19027a;

    public f(Looper looper) {
        this.f19027a = new zza(looper);
    }

    public static f a() {
        f fVar;
        synchronized (f19026b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new f(handlerThread.getLooper());
                }
                fVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f19041a.execute(new RunnableC1918b(2, callable, taskCompletionSource, false));
        return taskCompletionSource.getTask();
    }
}
