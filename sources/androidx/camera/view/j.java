package androidx.camera.view;

import androidx.camera.view.RotationProvider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7731b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i, int i4) {
        this.f7730a = i4;
        this.c = obj;
        this.f7731b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7730a) {
            case 0:
                ((RotationProvider.ListenerWrapper) this.c).lambda$onRotationChanged$0(this.f7731b);
                break;
            default:
                ((CameraController) this.c).lambda$setEnabledUseCases$2(this.f7731b);
                break;
        }
    }
}
