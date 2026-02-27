package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkLauncherImpl implements WorkLauncher {
    private final Processor processor;
    private final TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(Processor processor, TaskExecutor workTaskExecutor) {
        j.g(processor, "processor");
        j.g(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        workLauncherImpl.processor.startWork(startStopToken, runtimeExtras);
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public final /* synthetic */ void startWork(StartStopToken startStopToken) {
        f.a(this, startStopToken);
    }

    @Override // androidx.work.impl.WorkLauncher
    public final /* synthetic */ void stopWork(StartStopToken startStopToken) {
        f.b(this, startStopToken);
    }

    @Override // androidx.work.impl.WorkLauncher
    public final /* synthetic */ void stopWorkWithReason(StartStopToken startStopToken, int i) {
        f.c(this, startStopToken, i);
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(StartStopToken workSpecId, WorkerParameters.RuntimeExtras runtimeExtras) {
        j.g(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new b(1, this, workSpecId, runtimeExtras));
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(StartStopToken workSpecId, int i) {
        j.g(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this.processor, workSpecId, false, i));
    }
}
