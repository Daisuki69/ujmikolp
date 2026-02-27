package androidx.work.impl;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkerWrapper f8245b;

    public /* synthetic */ h(WorkerWrapper workerWrapper, int i) {
        this.f8244a = i;
        this.f8245b = workerWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8244a) {
            case 0:
                return WorkerWrapper.runWorker$lambda$1(this.f8245b);
            default:
                return WorkerWrapper.trySetRunning$lambda$11(this.f8245b);
        }
    }
}
