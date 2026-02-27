package i2;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1586b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.arch.core.executor.a f17088a = new androidx.arch.core.executor.a(2);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        C1585a c1585a = new C1585a(0, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        androidx.arch.core.executor.a aVar = f17088a;
        task.continueWithTask(aVar, c1585a);
        task2.continueWithTask(aVar, c1585a);
        return taskCompletionSource.getTask();
    }
}
