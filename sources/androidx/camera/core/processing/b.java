package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7578b;

    public /* synthetic */ b(Object obj, int i) {
        this.f7577a = i;
        this.f7578b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7577a) {
            case 0:
                ((SurfaceRequest) this.f7578b).willNotProvideSurface();
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f7578b).lambda$release$5();
                break;
            case 2:
                DefaultSurfaceProcessor.lambda$snapshot$7((CallbackToFutureAdapter.Completer) this.f7578b);
                break;
            case 3:
                ((SurfaceOutput) this.f7578b).close();
                break;
            default:
                ((SurfaceProcessorNode) this.f7578b).lambda$release$2();
                break;
        }
    }
}
