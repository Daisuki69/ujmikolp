package androidx.work.impl;

import androidx.work.WorkInfo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static void a(WorkLauncher workLauncher, StartStopToken workSpecId) {
        j.g(workSpecId, "workSpecId");
        workLauncher.startWork(workSpecId, null);
    }

    public static void b(WorkLauncher workLauncher, StartStopToken workSpecId) {
        j.g(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    public static void c(WorkLauncher workLauncher, StartStopToken workSpecId, int i) {
        j.g(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, i);
    }
}
