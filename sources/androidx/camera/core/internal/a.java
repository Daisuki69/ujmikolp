package androidx.camera.core.internal;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.sidecar.SidecarCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7558b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f7557a = i;
        this.f7558b = obj;
        this.c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f7557a) {
            case 0:
                CameraUseCaseAdapter.lambda$createExtraPreview$0((Surface) this.f7558b, (SurfaceTexture) this.c, (SurfaceRequest.Result) obj);
                break;
            case 1:
                ((DualSurfaceProcessor) this.f7558b).lambda$onOutputSurface$2((SurfaceOutput) this.c, (SurfaceOutput.Event) obj);
                break;
            default:
                SidecarCompat.registerConfigurationChangeListener$lambda$0((SidecarCompat) this.f7558b, (Activity) this.c, (Configuration) obj);
                break;
        }
    }
}
