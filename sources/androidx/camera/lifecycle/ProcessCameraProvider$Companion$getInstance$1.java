package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.ContextUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCameraProvider$Companion$getInstance$1 extends k implements Function1<CameraX, ProcessCameraProvider> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$Companion$getInstance$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProcessCameraProvider invoke(CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
        j.f(cameraX, "cameraX");
        processCameraProvider.setCameraX(cameraX);
        ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
        Context applicationContext = ContextUtil.getApplicationContext(this.$context);
        j.f(applicationContext, "getApplicationContext(context)");
        processCameraProvider2.setContext(applicationContext);
        return ProcessCameraProvider.sAppInstance;
    }
}
