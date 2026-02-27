package ki;

import S1.v;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import ki.AbstractC1780a;
import w3.C2376a;

/* JADX INFO: renamed from: ki.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1780a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f18136b;
    public Object c;

    public AbstractC1780a(int i) {
        switch (i) {
            case 1:
                this.f18136b = new AtomicInteger(0);
                this.c = new AtomicBoolean(false);
                this.f18135a = new B1.a(7);
                break;
            default:
                this.f18135a = a();
                this.f18136b = new ConcurrentHashMap();
                break;
        }
    }

    public abstract Yi.b a();

    public Task b(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        Preconditions.checkState(((AtomicInteger) this.f18136b).get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        ((B1.a) this.f18135a).l(new Runnable() { // from class: p3.q
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                AbstractC1780a abstractC1780a = this.f19049a;
                abstractC1780a.getClass();
                CancellationToken cancellationToken2 = cancellationToken;
                boolean zIsCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                if (zIsCancellationRequested) {
                    cancellationTokenSource2.cancel();
                    return;
                }
                AtomicBoolean atomicBoolean = (AtomicBoolean) abstractC1780a.c;
                try {
                    try {
                        if (!atomicBoolean.get()) {
                            abstractC1780a.c();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(objCall);
                        }
                    } catch (RuntimeException e) {
                        throw new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e7) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e7);
                    }
                }
            }
        }, new Executor() { // from class: p3.p
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void c();

    public void d() {
        Yi.b bVar = (Yi.b) ((Yi.a) this.f18135a);
        ReentrantLock reentrantLock = bVar.f6792b;
        reentrantLock.lock();
        try {
            bVar.f6791a = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void e();

    public void f() {
        Yi.b bVar = (Yi.b) ((Yi.a) this.f18135a);
        ReentrantLock reentrantLock = bVar.f6792b;
        reentrantLock.lock();
        try {
            bVar.f6791a = false;
            bVar.c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract List g(C2376a c2376a);

    public String h(InterfaceC1782c interfaceC1782c, long j, long j6, e eVar) {
        Objects.requireNonNull(interfaceC1782c);
        if (j6 <= 0) {
            throw new IllegalArgumentException();
        }
        if (((Yi.a) this.f18135a).isShutdown()) {
            return null;
        }
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = ((Yi.a) this.f18135a).scheduleWithFixedDelay(new v(interfaceC1782c, eVar), j, j6, TimeUnit.SECONDS);
        String string = UUID.randomUUID().toString();
        ((ConcurrentHashMap) this.f18136b).put(string, scheduledFutureScheduleWithFixedDelay);
        return string;
    }

    public String i(InterfaceC1782c interfaceC1782c, long j, e eVar) {
        Objects.requireNonNull(interfaceC1782c);
        Yi.a aVar = (Yi.a) this.f18135a;
        if (aVar.isShutdown()) {
            return null;
        }
        ScheduledFuture<?> scheduledFutureSchedule = aVar.schedule(new v(interfaceC1782c, eVar), j, TimeUnit.SECONDS);
        String string = UUID.randomUUID().toString();
        ((ConcurrentHashMap) this.f18136b).put(string, scheduledFutureSchedule);
        return string;
    }

    public void j() {
        Yi.a aVar = (Yi.a) this.f18135a;
        if (aVar.isShutdown()) {
            return;
        }
        aVar.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (aVar.awaitTermination(15L, timeUnit)) {
                return;
            }
            aVar.shutdownNow();
            if (aVar.awaitTermination(15L, timeUnit)) {
                return;
            }
            Ri.a.g("Split task executor did not terminate");
        } catch (InterruptedException unused) {
            aVar.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public void k(String str) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18136b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) concurrentHashMap.get(str);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        concurrentHashMap.remove(str);
    }

    public void l(InterfaceC1782c interfaceC1782c, e eVar) {
        Objects.requireNonNull(interfaceC1782c);
        Yi.a aVar = (Yi.a) this.f18135a;
        if (aVar.isShutdown()) {
            return;
        }
        aVar.submit(new v(interfaceC1782c, eVar));
    }
}
