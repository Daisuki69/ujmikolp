package androidx.work.impl;

import S1.y;
import We.s;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ListenableFutureKt;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import cj.C1110A;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerUpdater {

    /* JADX INFO: renamed from: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Unit> {
        final /* synthetic */ String $name;
        final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
        final /* synthetic */ WorkRequest $workRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl, String str, WorkRequest workRequest) {
            super(0);
            this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
            this.$name = str;
            this.$workRequest = workRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m139invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m139invoke() {
            WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 = new WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1(this.$workRequest, this.$this_enqueueUniquelyNamedPeriodic, this.$name);
            WorkSpecDao workSpecDao = this.$this_enqueueUniquelyNamedPeriodic.getWorkDatabase().workSpecDao();
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(this.$name);
            if (workSpecIdAndStatesForName.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) C1110A.B(workSpecIdAndStatesForName);
            if (idAndState == null) {
                workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1.invoke();
                return;
            }
            WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
            if (workSpec == null) {
                StringBuilder sb2 = new StringBuilder("WorkSpec with ");
                sb2.append(idAndState.id);
                sb2.append(", that matches a name \"");
                throw new IllegalStateException(s.p(sb2, this.$name, "\", wasn't found"));
            }
            if (!workSpec.isPeriodic()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (idAndState.state == WorkInfo.State.CANCELLED) {
                workSpecDao.delete(idAndState.id);
                workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1.invoke();
                return;
            }
            WorkSpec workSpecCopy$default = WorkSpec.copy$default(this.$workRequest.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
            Processor processor = this.$this_enqueueUniquelyNamedPeriodic.getProcessor();
            j.f(processor, "processor");
            WorkDatabase workDatabase = this.$this_enqueueUniquelyNamedPeriodic.getWorkDatabase();
            j.f(workDatabase, "workDatabase");
            Configuration configuration = this.$this_enqueueUniquelyNamedPeriodic.getConfiguration();
            j.f(configuration, "configuration");
            List<Scheduler> schedulers = this.$this_enqueueUniquelyNamedPeriodic.getSchedulers();
            j.f(schedulers, "schedulers");
            WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workSpecCopy$default, this.$workRequest.getTags());
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerUpdater$updateWorkImpl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements Function0<WorkManager.UpdateResult> {
        final /* synthetic */ WorkManagerImpl $this_updateWorkImpl;
        final /* synthetic */ WorkRequest $workRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
            super(0);
            this.$this_updateWorkImpl = workManagerImpl;
            this.$workRequest = workRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WorkManager.UpdateResult invoke() {
            Processor processor = this.$this_updateWorkImpl.getProcessor();
            j.f(processor, "processor");
            WorkDatabase workDatabase = this.$this_updateWorkImpl.getWorkDatabase();
            j.f(workDatabase, "workDatabase");
            Configuration configuration = this.$this_updateWorkImpl.getConfiguration();
            j.f(configuration, "configuration");
            List<Scheduler> schedulers = this.$this_updateWorkImpl.getSchedulers();
            j.f(schedulers, "schedulers");
            return WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, this.$workRequest.getWorkSpec(), this.$workRequest.getTags());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Operation enqueueUniquelyNamedPeriodic(WorkManagerImpl workManagerImpl, String name, WorkRequest workRequest) {
        j.g(workManagerImpl, "<this>");
        j.g(name, "name");
        j.g(workRequest, "workRequest");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "enqueueUniquePeriodic_".concat(name);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new AnonymousClass1(workManagerImpl, name, workRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkManager.UpdateResult updateWorkImpl(Processor processor, WorkDatabase workDatabase, Configuration configuration, List<? extends Scheduler> list, WorkSpec workSpec, Set<String> set) {
        String str = workSpec.id;
        WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new IllegalArgumentException(s.j("Worker with ", str, " doesn't exist"));
        }
        if (workSpec2.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = WorkerUpdater$updateWorkImpl$type$1.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Can't update ");
            sb2.append((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec2));
            sb2.append(" Worker to ");
            throw new UnsupportedOperationException(s.p(sb2, (String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec), " Worker. Update operation must preserve worker's type."));
        }
        boolean zIsEnqueued = processor.isEnqueued(str);
        if (!zIsEnqueued) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new g(workDatabase, workSpec2, workSpec, list, str, set, zIsEnqueued));
        if (!zIsEnqueued) {
            Schedulers.schedule(configuration, workDatabase, list);
        }
        return zIsEnqueued ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z4) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkSpec workSpecCopy$default = WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecCopy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            workSpecCopy$default.setNextScheduleTimeOverrideGeneration(workSpecCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, workSpecCopy$default));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z4) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    public static final y updateWorkImpl(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
        j.g(workManagerImpl, "<this>");
        j.g(workRequest, "workRequest");
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "updateWorkImpl", new AnonymousClass3(workManagerImpl, workRequest));
    }
}
