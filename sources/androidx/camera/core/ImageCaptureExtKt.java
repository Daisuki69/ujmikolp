package androidx.camera.core;

import Bj.C0151l;
import Bj.H;
import Bj.InterfaceC0147j;
import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureExtKt {
    @VisibleForTesting
    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        kotlin.jvm.internal.j.g(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static final Object takePicture(ImageCapture imageCapture, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function12, InterfaceC1526a<? super ImageProxy> interfaceC1526a) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = interfaceC1526a.getContext().get(kotlin.coroutines.d.f18169N);
        Bj.A a8 = element instanceof Bj.A ? (Bj.A) element : null;
        if (a8 != null) {
            executorDirectExecutor = H.f(a8);
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.j.f(executorDirectExecutor, "directExecutor()");
        }
        final C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f18195a = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i) {
                Function1<Integer, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(Integer.valueOf(i));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                kotlin.jvm.internal.j.g(imageProxy, "imageProxy");
                Object obj = yVar.f18195a;
                if (obj == null) {
                    kotlin.jvm.internal.j.n("delegatingCallback");
                    throw null;
                }
                ((DelegatingImageCapturedCallback) obj).dispose();
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(imageProxy);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                kotlin.jvm.internal.j.g(exception, "exception");
                Object obj = yVar.f18195a;
                if (obj == null) {
                    kotlin.jvm.internal.j.n("delegatingCallback");
                    throw null;
                }
                ((DelegatingImageCapturedCallback) obj).dispose();
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(AbstractC1039j.a(exception));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                kotlin.jvm.internal.j.g(bitmap, "bitmap");
                Function1<Bitmap, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }
        });
        c0151l.t(new ImageCaptureExtKt$takePicture$2$2(yVar));
        Object obj = yVar.f18195a;
        if (obj == null) {
            kotlin.jvm.internal.j.n("delegatingCallback");
            throw null;
        }
        imageCapture.lambda$takePicture$1(executorDirectExecutor, (DelegatingImageCapturedCallback) obj);
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, Function0 function0, Function1 function1, Function1 function12, InterfaceC1526a interfaceC1526a, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        return takePicture(imageCapture, function0, function1, function12, interfaceC1526a);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Function0 function0, Function1 function1, Function1 function12, InterfaceC1526a interfaceC1526a, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        return takePicture(imageCapture, outputFileOptions, function0, function1, function12, interfaceC1526a);
    }

    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function12, InterfaceC1526a<? super ImageCapture.OutputFileResults> interfaceC1526a) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = interfaceC1526a.getContext().get(kotlin.coroutines.d.f18169N);
        Bj.A a8 = element instanceof Bj.A ? (Bj.A) element : null;
        if (a8 != null) {
            executorDirectExecutor = H.f(a8);
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.j.f(executorDirectExecutor, "directExecutor()");
        }
        final C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f18195a = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i) {
                Function1<Integer, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(Integer.valueOf(i));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                kotlin.jvm.internal.j.g(exception, "exception");
                Object obj = yVar.f18195a;
                if (obj == null) {
                    kotlin.jvm.internal.j.n("delegatingCallback");
                    throw null;
                }
                ((DelegatingImageSavedCallback) obj).dispose();
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(AbstractC1039j.a(exception));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                kotlin.jvm.internal.j.g(outputFileResults, "outputFileResults");
                Object obj = yVar.f18195a;
                if (obj == null) {
                    kotlin.jvm.internal.j.n("delegatingCallback");
                    throw null;
                }
                ((DelegatingImageSavedCallback) obj).dispose();
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(outputFileResults);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                kotlin.jvm.internal.j.g(bitmap, "bitmap");
                Function1<Bitmap, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }
        });
        c0151l.t(new ImageCaptureExtKt$takePicture$4$2(yVar));
        Object obj = yVar.f18195a;
        if (obj != null) {
            imageCapture.lambda$takePicture$2(outputFileOptions, executorDirectExecutor, (DelegatingImageSavedCallback) obj);
            Object objQ = c0151l.q();
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            return objQ;
        }
        kotlin.jvm.internal.j.n("delegatingCallback");
        throw null;
    }
}
