package androidx.camera.core;

import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.core.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0743a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7503b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0743a(int i, Object obj, Object obj2) {
        this.f7502a = i;
        this.f7503b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7502a) {
            case 0:
                ((AndroidImageReaderProxy) this.f7503b).lambda$setOnImageAvailableListener$0((ImageReaderProxy.OnImageAvailableListener) this.c);
                break;
            case 1:
                ((CameraX) this.f7503b).lambda$shutdownInternal$3((CallbackToFutureAdapter.Completer) this.c);
                break;
            case 2:
                ImageAnalysis.lambda$createPipeline$1((SafeCloseImageReaderProxy) this.f7503b, (SafeCloseImageReaderProxy) this.c);
                break;
            case 3:
                ((MetadataImageReader) this.f7503b).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) this.c);
                break;
            case 4:
                ((Preview.SurfaceProvider) this.f7503b).onSurfaceRequested((SurfaceRequest) this.c);
                break;
            default:
                ((Preview) this.f7503b).lambda$createPipeline$0((CameraInternal) this.c);
                break;
        }
    }
}
