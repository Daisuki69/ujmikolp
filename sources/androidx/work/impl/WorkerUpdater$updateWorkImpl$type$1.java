package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerUpdater$updateWorkImpl$type$1 extends k implements Function1<WorkSpec, String> {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    public WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(WorkSpec spec) {
        j.g(spec, "spec");
        return spec.isPeriodic() ? "Periodic" : "OneTime";
    }
}
