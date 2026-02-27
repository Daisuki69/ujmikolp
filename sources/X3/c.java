package x3;

import Z.n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ki.AbstractC1780a;
import n4.RunnableC1918b;
import w3.C2376a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Closeable, LifecycleObserver, AutoCloseable {
    public static final GmsLogger e = new GmsLogger("MobileVisionBase", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20896a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1780a f20897b;
    public final CancellationTokenSource c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f20898d;

    public c(AbstractC1780a abstractC1780a, Executor executor) {
        this.f20897b = abstractC1780a;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.f20898d = executor;
        ((AtomicInteger) abstractC1780a.f18136b).incrementAndGet();
        abstractC1780a.b(executor, f.f20902a, cancellationTokenSource.getToken()).addOnFailureListener(e.f20900a);
    }

    public final synchronized Task b(C2376a c2376a) {
        Preconditions.checkNotNull(c2376a, "InputImage can not be null");
        if (this.f20896a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (c2376a.c < 32 || c2376a.f20687d < 32) {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f20897b.b(this.f20898d, new n(9, this, c2376a, false), this.c.getToken());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, r3.InterfaceC2187a
    @KeepForSdk
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z4 = true;
        if (this.f20896a.getAndSet(true)) {
            return;
        }
        this.c.cancel();
        AbstractC1780a abstractC1780a = this.f20897b;
        Executor executor = this.f20898d;
        if (((AtomicInteger) abstractC1780a.f18136b).get() <= 0) {
            z4 = false;
        }
        Preconditions.checkState(z4);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((B1.a) abstractC1780a.f18135a).l(new RunnableC1918b(3, abstractC1780a, taskCompletionSource, false), executor);
        taskCompletionSource.getTask();
    }
}
