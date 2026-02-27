package i2;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import de.m;
import h2.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: i2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1587c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f17089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17090b = new Object();
    public Task c = Tasks.forResult(null);

    public ExecutorC1587c(ExecutorService executorService) {
        this.f17089a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f17090b) {
            taskContinueWithTask = this.c.continueWithTask(this.f17089a, new m(runnable, 19));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(j jVar) {
        Task taskContinueWithTask;
        synchronized (this.f17090b) {
            taskContinueWithTask = this.c.continueWithTask(this.f17089a, new m(jVar, 18));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17089a.execute(runnable);
    }
}
