package androidx.work.impl.utils.taskexecutor;

import Bj.A;
import Bj.H;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    public static A b(TaskExecutor taskExecutor) {
        return H.n(taskExecutor.getSerialTaskExecutor());
    }
}
