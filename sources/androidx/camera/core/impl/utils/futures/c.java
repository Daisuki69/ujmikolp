package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f7553b;

    public /* synthetic */ c(ScheduledFuture scheduledFuture, int i) {
        this.f7552a = i;
        this.f7553b = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7552a) {
            case 0:
                this.f7553b.cancel(true);
                break;
            default:
                this.f7553b.cancel(true);
                break;
        }
    }
}
