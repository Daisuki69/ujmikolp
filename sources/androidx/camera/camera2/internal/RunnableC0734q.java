package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0734q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode f7477b;

    public /* synthetic */ RunnableC0734q(Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode, int i) {
        this.f7476a = i;
        this.f7477b = scheduleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7476a) {
            case 0:
                this.f7477b.execute();
                break;
            default:
                this.f7477b.executeInternal();
                break;
        }
    }
}
