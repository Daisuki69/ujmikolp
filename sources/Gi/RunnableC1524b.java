package gi;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: gi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1524b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1525c f16846b;

    public /* synthetic */ RunnableC1524b(C1525c c1525c, int i) {
        this.f16845a = i;
        this.f16846b = c1525c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16845a) {
            case 0:
                ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f16846b);
                break;
            default:
                ProcessLifecycleOwner.get().getLifecycle().removeObserver(this.f16846b);
                break;
        }
    }
}
