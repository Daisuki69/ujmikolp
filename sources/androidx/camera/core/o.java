package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ForwardingImageProxy.OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7572b;

    public /* synthetic */ o(Object obj, int i) {
        this.f7571a = i;
        this.f7572b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f7571a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy) this.f7572b).lambda$new$1(imageProxy);
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f7572b).lambda$new$0(imageProxy);
                break;
        }
    }
}
