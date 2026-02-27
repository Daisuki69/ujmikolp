package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import cj.C1132s;
import cj.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class CancelWorkRunnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Unit> {
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
            new PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m145invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m145invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            j.f(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new a(workDatabase, this.$workManagerImpl));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08321 extends k implements Function0<Unit> {
        final /* synthetic */ UUID $id;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08321(WorkManagerImpl workManagerImpl, UUID uuid) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$id = uuid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkManagerImpl workManagerImpl, UUID uuid) {
            String string = uuid.toString();
            j.f(string, "id.toString()");
            CancelWorkRunnable.cancel(workManagerImpl, string);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m146invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m146invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            j.f(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new a(this.$workManagerImpl, this.$id));
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forName$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08331 extends k implements Function0<Unit> {
        final /* synthetic */ String $name;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08331(String str, WorkManagerImpl workManagerImpl) {
            super(0);
            this.$name = str;
            this.$workManagerImpl = workManagerImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m147invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m147invoke() {
            CancelWorkRunnable.forNameInline(this.$name, this.$workManagerImpl);
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forTag$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08341 extends k implements Function0<Unit> {
        final /* synthetic */ String $tag;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08341(WorkManagerImpl workManagerImpl, String str) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$tag = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m148invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m148invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            j.f(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new b(workDatabase, this.$tag, this.$workManagerImpl, 0));
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        j.f(workDatabase, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabase, str);
        Processor processor = workManagerImpl.getProcessor();
        j.f(processor, "workManagerImpl.processor");
        processor.stopAndCancelWork(str, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public static final Operation forAll(WorkManagerImpl workManagerImpl) {
        j.g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new AnonymousClass1(workManagerImpl));
    }

    public static final Operation forId(UUID id, WorkManagerImpl workManagerImpl) {
        j.g(id, "id");
        j.g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new C08321(workManagerImpl, id));
    }

    public static final Operation forName(String name, WorkManagerImpl workManagerImpl) {
        j.g(name, "name");
        j.g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "CancelWorkByName_".concat(name);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new C08331(name, workManagerImpl));
    }

    public static final void forNameInline(String name, WorkManagerImpl workManagerImpl) {
        j.g(name, "name");
        j.g(workManagerImpl, "workManagerImpl");
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        j.f(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.runInTransaction(new b(workDatabase, name, workManagerImpl, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
    }

    public static final Operation forTag(String tag, WorkManagerImpl workManagerImpl) {
        j.g(tag, "tag");
        j.g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "CancelWorkByTag_".concat(tag);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new C08341(workManagerImpl, tag));
    }

    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        ArrayList arrayListH = C1132s.h(str);
        while (!arrayListH.isEmpty()) {
            String str2 = (String) x.t(arrayListH);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            arrayListH.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
