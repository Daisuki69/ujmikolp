package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeferrableSurface f7598b;

    public /* synthetic */ k(DeferrableSurface deferrableSurface, int i) {
        this.f7597a = i;
        this.f7598b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7597a) {
            case 0:
                this.f7598b.close();
                break;
            default:
                this.f7598b.decrementUseCount();
                break;
        }
    }
}
