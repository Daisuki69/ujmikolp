package X2;

import A7.r;
import D.CallableC0168a;
import D.CallableC0170c;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f6477d = new HashMap();
    public static final androidx.arch.core.executor.a e = new androidx.arch.core.executor.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f6479b;
    public Task c = null;

    public d(Executor executor, p pVar) {
        this.f6478a = executor;
        this.f6479b = pVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        T3.l lVar = new T3.l(4);
        Executor executor = e;
        task.addOnSuccessListener(executor, lVar);
        task.addOnFailureListener(executor, lVar);
        task.addOnCanceledListener(executor, lVar);
        if (!((CountDownLatch) lVar.f5786b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized d d(Executor executor, p pVar) {
        String str;
        HashMap map;
        try {
            str = pVar.f6522b;
            map = f6477d;
            if (!map.containsKey(str)) {
                map.put(str, new d(executor, pVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (d) map.get(str);
    }

    public final synchronized Task b() {
        try {
            Task task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                Executor executor = this.f6478a;
                p pVar = this.f6479b;
                Objects.requireNonNull(pVar);
                this.c = Tasks.call(executor, new CallableC0168a(pVar, 8));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.c;
    }

    public final f c() {
        synchronized (this) {
            try {
                Task task = this.c;
                if (task != null && task.isSuccessful()) {
                    return (f) this.c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (f) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e7) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e7);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task e(f fVar) {
        CallableC0170c callableC0170c = new CallableC0170c(10, this, fVar);
        Executor executor = this.f6478a;
        return Tasks.call(executor, callableC0170c).onSuccessTask(executor, new r(20, this, fVar));
    }
}
