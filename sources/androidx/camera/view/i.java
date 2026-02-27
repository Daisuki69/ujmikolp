package androidx.camera.view;

import android.graphics.SurfaceTexture;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.camera.view.TextureViewImplementation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7729b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f7728a = i;
        this.c = obj;
        this.f7729b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7728a) {
            case 0:
                ((PreviewView.AnonymousClass1) this.c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f7729b);
                break;
            case 1:
                ((TextureViewImplementation) this.c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f7729b);
                break;
            case 2:
                TextureViewImplementation.AnonymousClass1.lambda$onSurfaceTextureUpdated$0((PreviewView.OnFrameUpdateListener) this.c, (SurfaceTexture) this.f7729b);
                break;
            default:
                ((CameraController) this.c).lambda$setCameraSelector$3((CameraSelector) this.f7729b);
                break;
        }
    }
}
