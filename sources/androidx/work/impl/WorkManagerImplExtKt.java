package androidx.work.impl;

import Bj.A;
import Bj.C0154m0;
import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bj.AbstractC1039j;
import cj.C1129o;
import cj.C1132s;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import qj.q;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerImplExtKt {

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.impl.WorkManagerImplExtKt$close$1", f = "WorkManagerImplExt.kt", l = {121}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$this_close = workManagerImpl;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass1(this.$this_close, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                CoroutineContext.Element element = this.$this_close.getWorkManagerScope().getCoroutineContext().get(C0154m0.f630a);
                j.d(element);
                this.label = 1;
                if (H.k((InterfaceC0156n0) element, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$schedulers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08301 extends k implements q {
        final /* synthetic */ Scheduler[] $schedulers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08301(Scheduler[] schedulerArr) {
            super(6);
            this.$schedulers = schedulerArr;
        }

        @Override // qj.q
        public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
            j.g(context, "<anonymous parameter 0>");
            j.g(configuration, "<anonymous parameter 1>");
            j.g(taskExecutor, "<anonymous parameter 2>");
            j.g(workDatabase, "<anonymous parameter 3>");
            j.g(trackers, "<anonymous parameter 4>");
            j.g(processor, "<anonymous parameter 5>");
            return C1129o.z(this.$schedulers);
        }
    }

    public static final void close(WorkManagerImpl workManagerImpl) {
        j.g(workManagerImpl, "<this>");
        H.x(kotlin.coroutines.g.f18170a, new AnonymousClass1(workManagerImpl, null));
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        j.f(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return C1132s.g(schedulerCreateBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        j.f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, q qVar, int i, Object obj) {
        Trackers trackers2;
        if ((i & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            j.f(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            j.f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            j.f(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, (i & 32) != 0 ? new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase) : processor, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : qVar);
    }

    public static final E createWorkManagerScope(TaskExecutor taskExecutor) {
        j.g(taskExecutor, "taskExecutor");
        A taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        j.f(taskCoroutineDispatcher, "taskExecutor.taskCoroutineDispatcher");
        return H.c(taskCoroutineDispatcher);
    }

    public static final q schedulers(Scheduler... schedulers) {
        j.g(schedulers, "schedulers");
        return new C08301(schedulers);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        j.g(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        j.g(workDatabase, "workDatabase");
        j.g(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        j.g(workDatabase, "workDatabase");
        j.g(trackers, "trackers");
        j.g(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, q schedulersCreator) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        j.g(workTaskExecutor, "workTaskExecutor");
        j.g(workDatabase, "workDatabase");
        j.g(trackers, "trackers");
        j.g(processor, "processor");
        j.g(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
