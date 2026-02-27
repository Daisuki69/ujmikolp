package Bj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: Bj.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0142g0 extends AbstractC0140f0 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f620a;

    public C0142g0(Executor executor) {
        this.f620a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f620a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f620a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationExceptionA = H.a("The task was rejected", e);
            InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
            if (interfaceC0156n0 != null) {
                interfaceC0156n0.b(cancellationExceptionA);
            }
            Ij.e eVar = U.f603a;
            Ij.d.f2362a.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0142g0) && ((C0142g0) obj).f620a == this.f620a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f620a);
    }

    @Override // Bj.M
    public final void m(long j, C0151l c0151l) {
        Executor executor = this.f620a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new S1.v(1, this, c0151l), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationExceptionA = H.a("The task was rejected", e);
                InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) c0151l.e.get(C0154m0.f630a);
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(cancellationExceptionA);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0151l.v(new C0143h(scheduledFutureSchedule, 0));
        } else {
            I.h.m(j, c0151l);
        }
    }

    @Override // Bj.M
    public final W r(long j, G0 g02, CoroutineContext coroutineContext) {
        Executor executor = this.f620a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(g02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationExceptionA = H.a("The task was rejected", e);
                InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(cancellationExceptionA);
                }
            }
        }
        return scheduledFutureSchedule != null ? new V(scheduledFutureSchedule) : I.h.r(j, g02, coroutineContext);
    }

    @Override // Bj.AbstractC0140f0
    public final Executor t() {
        return this.f620a;
    }

    @Override // Bj.A
    public final String toString() {
        return this.f620a.toString();
    }
}
