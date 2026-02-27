package androidx.camera.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureExtKt$takePicture$2$2 extends kotlin.jvm.internal.k implements Function1<Throwable, Unit> {
    final /* synthetic */ kotlin.jvm.internal.y $delegatingCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCaptureExtKt$takePicture$2$2(kotlin.jvm.internal.y yVar) {
        super(1);
        this.$delegatingCallback = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f18162a;
    }

    public final void invoke(Throwable th2) {
        Object obj = this.$delegatingCallback.f18195a;
        if (obj != null) {
            ((DelegatingImageCapturedCallback) obj).dispose();
        } else {
            kotlin.jvm.internal.j.n("delegatingCallback");
            throw null;
        }
    }
}
