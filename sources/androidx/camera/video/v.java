package androidx.camera.video;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoOutput;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements VideoOutput {
    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
        return z.a(this, cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ Observable getMediaSpec() {
        return z.b(this);
    }

    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ Observable getStreamInfo() {
        return z.c(this);
    }

    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ Observable isSourceStreamRequired() {
        return z.d(this);
    }

    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ void onSourceStateChanged(VideoOutput.SourceState sourceState) {
        z.e(this, sourceState);
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.willNotProvideSurface();
    }

    @Override // androidx.camera.video.VideoOutput
    public final /* synthetic */ void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase) {
        z.f(this, surfaceRequest, timebase);
    }
}
