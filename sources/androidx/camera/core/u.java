package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements ForwardingImageProxy.OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f7616b;
    public final /* synthetic */ ImageProxy c;

    public /* synthetic */ u(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f7615a = i;
        this.f7616b = imageProxy;
        this.c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f7615a) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f7616b, this.c, imageProxy);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(this.f7616b, this.c, imageProxy);
                break;
        }
    }
}
