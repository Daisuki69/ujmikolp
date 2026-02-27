package androidx.media3.exoplayer.scheduler;

import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f8073b;

    public /* synthetic */ a(RequirementsWatcher.NetworkCallback networkCallback, int i) {
        this.f8072a = i;
        this.f8073b = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8072a) {
            case 0:
                this.f8073b.lambda$postCheckRequirements$0();
                break;
            default:
                this.f8073b.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
