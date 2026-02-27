package androidx.camera.core;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements CallbackToFutureAdapter.Resolver, ImageAnalysis.Analyzer, ResolutionFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7560a;

    public /* synthetic */ j(Object obj) {
        this.f7560a = obj;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((ImageAnalysis.Analyzer) this.f7560a).analyze(imageProxy);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CameraX) this.f7560a).lambda$shutdownInternal$4(completer);
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    public List filter(List list, int i) {
        return ImageAnalysis.lambda$onMergeConfig$0((Size) this.f7560a, list, i);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ Size getDefaultTargetResolution() {
        return l.a(this);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ int getTargetCoordinateSystem() {
        return l.b(this);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ void updateTransform(Matrix matrix) {
        l.c(this, matrix);
    }
}
