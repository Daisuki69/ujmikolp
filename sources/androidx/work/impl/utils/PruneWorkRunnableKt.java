package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class PruneWorkRunnableKt {

    /* JADX INFO: renamed from: androidx.work.impl.utils.PruneWorkRunnableKt$pruneWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Unit> {
        final /* synthetic */ WorkDatabase $this_pruneWork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkDatabase workDatabase) {
            super(0);
            this.$this_pruneWork = workDatabase;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m149invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m149invoke() {
            this.$this_pruneWork.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
        }
    }

    public static final Operation pruneWork(WorkDatabase workDatabase, Configuration configuration, TaskExecutor executor) {
        j.g(workDatabase, "<this>");
        j.g(configuration, "configuration");
        j.g(executor, "executor");
        Tracer tracer = configuration.getTracer();
        SerialExecutor serialTaskExecutor = executor.getSerialTaskExecutor();
        j.f(serialTaskExecutor, "executor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "PruneWork", serialTaskExecutor, new AnonymousClass1(workDatabase));
    }
}
