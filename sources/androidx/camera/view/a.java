package androidx.camera.view;

import androidx.arch.core.util.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7718b;

    public /* synthetic */ a(Object obj, int i) {
        this.f7717a = i;
        this.f7718b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f7717a) {
            case 0:
                return ((CameraController) this.f7718b).lambda$new$0((ProcessCameraProviderWrapper) obj);
            case 1:
                return ((CameraController) this.f7718b).enableTorch(((Boolean) obj).booleanValue());
            case 2:
                return ((CameraController) this.f7718b).setLinearZoom(((Float) obj).floatValue());
            case 3:
                return ((CameraController) this.f7718b).setZoomRatio(((Float) obj).floatValue());
            default:
                return ((PreviewStreamStateObserver) this.f7718b).lambda$startPreviewStreamStateFlow$1((Void) obj);
        }
    }
}
