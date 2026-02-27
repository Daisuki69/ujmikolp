package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.j;
import qj.q;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends kotlin.jvm.internal.i implements q {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // qj.q
    public final List<Scheduler> invoke(Context p02, Configuration p1, TaskExecutor p22, WorkDatabase p32, Trackers p42, Processor p52) {
        j.g(p02, "p0");
        j.g(p1, "p1");
        j.g(p22, "p2");
        j.g(p32, "p3");
        j.g(p42, "p4");
        j.g(p52, "p5");
        return WorkManagerImplExtKt.createSchedulers(p02, p1, p22, p32, p42, p52);
    }
}
