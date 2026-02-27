package androidx.camera.lifecycle;

import S1.y;
import androidx.camera.core.CameraX;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1 extends k implements Function1<Void, y> {
    final /* synthetic */ CameraX $cameraX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1(CameraX cameraX) {
        super(1);
        this.$cameraX = cameraX;
    }

    @Override // kotlin.jvm.functions.Function1
    public final y invoke(Void r1) {
        return this.$cameraX.getInitializeFuture();
    }
}
