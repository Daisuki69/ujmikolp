package androidx.camera.core.internal;

import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Preview.SurfaceProvider {
    @Override // androidx.camera.core.Preview.SurfaceProvider
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        CameraUseCaseAdapter.lambda$createExtraPreview$1(surfaceRequest);
    }
}
