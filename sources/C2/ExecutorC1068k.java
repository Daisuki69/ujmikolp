package c2;

import S1.v;
import c1.n;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1068k implements Executor {
    public static final Logger f = Logger.getLogger(ExecutorC1068k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f9271b = new ArrayDeque();
    public int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9272d = 0;
    public final v e = new v(this);

    public ExecutorC1068k(Executor executor) {
        this.f9270a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f9271b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.f9272d;
                n nVar = new n(runnable, 1);
                this.f9271b.add(nVar);
                this.c = 2;
                try {
                    this.f9270a.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.f9271b) {
                        try {
                            if (this.f9272d == j && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f9271b) {
                        try {
                            int i4 = this.c;
                            boolean z4 = true;
                            if ((i4 != 1 && i4 != 2) || !this.f9271b.removeLastOccurrence(nVar)) {
                                z4 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z4) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f9271b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f9270a + "}";
    }
}
