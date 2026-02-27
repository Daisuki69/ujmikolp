package androidx.camera.core;

import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.camera.core.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0746d implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7506a;

    public /* synthetic */ RejectedExecutionHandlerC0746d(int i) {
        this.f7506a = i;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.f7506a) {
            case 0:
                Logger.e(CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
                break;
            default:
                AFb1aSDK.valueOf(runnable, threadPoolExecutor);
                break;
        }
    }
}
