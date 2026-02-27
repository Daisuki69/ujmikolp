package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<Function0<Unit>> onReportCallbacks;
    private final Function0<Unit> reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, Function0<Unit> reportFullyDrawn) {
        kotlin.jvm.internal.j.g(executor, "executor");
        kotlin.jvm.internal.j.g(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new e(this, 2);
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.lock) {
            try {
                fullyDrawnReporter.reportPosted = false;
                if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                    fullyDrawnReporter.reportFullyDrawn.invoke();
                    fullyDrawnReporter.fullyDrawnReported();
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void addOnReportDrawnListener(Function0<Unit> callback) {
        boolean z4;
        kotlin.jvm.internal.j.g(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z4 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z4 = false;
            }
        }
        if (z4) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this.reportedFullyDrawn;
        }
        return z4;
    }

    public final void removeOnReportDrawnListener(Function0<Unit> callback) {
        kotlin.jvm.internal.j.g(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            Unit unit = Unit.f18162a;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i = this.reporterCount) > 0) {
                    this.reporterCount = i - 1;
                    postWhenReportersAreDone();
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
