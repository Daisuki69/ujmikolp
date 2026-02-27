package androidx.work;

import S1.y;
import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: androidx.work.Worker$getForegroundInfoAsync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<ForegroundInfo> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ForegroundInfo invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    /* JADX INFO: renamed from: androidx.work.Worker$startWork$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08291 extends k implements Function0<ListenableWorker.Result> {
        public C08291() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ListenableWorker.Result invoke() {
            return Worker.this.doWork();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        j.g(context, "context");
        j.g(workerParams, "workerParams");
    }

    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    public y getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        j.f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new AnonymousClass1());
    }

    @Override // androidx.work.ListenableWorker
    public final y startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        j.f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new C08291());
    }
}
