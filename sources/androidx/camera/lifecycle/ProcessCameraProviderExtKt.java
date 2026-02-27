package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, InterfaceC1526a<? super ProcessCameraProvider> interfaceC1526a) {
        return ListenableFutureKt.await(companion.getInstance(context), interfaceC1526a);
    }
}
