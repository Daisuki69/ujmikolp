package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7576b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f7575a = i;
        this.f7576b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7575a) {
            case 0:
                ((DefaultSurfaceProcessor) this.f7576b).lambda$snapshot$6((AutoValue_DefaultSurfaceProcessor_PendingSnapshot) this.c);
                break;
            case 1:
                ((SurfaceOutputImpl) this.f7576b).lambda$requestClose$1((AtomicReference) this.c);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f7576b).lambda$onInputSurface$2((SurfaceRequest) this.c);
                break;
            case 3:
                ((DefaultSurfaceProcessor) this.f7576b).lambda$onOutputSurface$4((SurfaceOutput) this.c);
                break;
            case 4:
                ((SurfaceProcessorWithExecutor) this.f7576b).lambda$onInputSurface$0((SurfaceRequest) this.c);
                break;
            default:
                ((SurfaceProcessorWithExecutor) this.f7576b).lambda$onOutputSurface$1((SurfaceOutput) this.c);
                break;
        }
    }
}
