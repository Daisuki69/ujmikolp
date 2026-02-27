package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import cj.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 extends k implements Function0<Unit> {
    final /* synthetic */ String $name;
    final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1(WorkRequest workRequest, WorkManagerImpl workManagerImpl, String str) {
        super(0);
        this.$workRequest = workRequest;
        this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
        this.$name = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m140invoke();
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m140invoke() {
        EnqueueRunnable.enqueue(new WorkContinuationImpl(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, r.c(this.$workRequest)));
    }
}
