package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements CameraBurstCaptureCallback.CaptureSequenceCallback, CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CaptureSession f7362a;

    public /* synthetic */ C(CaptureSession captureSession) {
        this.f7362a = captureSession;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f7362a.lambda$release$1(completer);
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
    public void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z4) {
        this.f7362a.lambda$issueBurstCaptureRequest$3(cameraCaptureSession, i, z4);
    }
}
