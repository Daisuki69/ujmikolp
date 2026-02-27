package androidx.work.impl;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public interface WorkLauncher {
    void startWork(StartStopToken startStopToken);

    void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras);

    void stopWork(StartStopToken startStopToken);

    void stopWork(StartStopToken startStopToken, int i);

    void stopWorkWithReason(StartStopToken startStopToken, int i);
}
