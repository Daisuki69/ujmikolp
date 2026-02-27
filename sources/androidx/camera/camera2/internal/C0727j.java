package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0727j implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7462b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0727j(int i, Object obj, Object obj2) {
        this.f7461a = i;
        this.f7462b = obj;
        this.c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7461a) {
            case 0:
                return ((Camera2CameraImpl) this.f7462b).lambda$isUseCaseAttached$12((String) this.c, completer);
            case 1:
                return ((Camera2CapturePipeline.Pipeline) this.f7462b).lambda$submitConfigsInternal$4((CaptureConfig.Builder) this.c, completer);
            default:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f7462b).lambda$preCapture$3((AtomicReference) this.c, completer);
        }
    }
}
