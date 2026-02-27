package E8;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.i f1301b;
    public Camera c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(List targetResolutions, Function1 function1) {
        kotlin.jvm.internal.j.g(targetResolutions, "targetResolutions");
        this.f1300a = targetResolutions;
        this.f1301b = (kotlin.jvm.internal.i) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.hardware.Camera$Size] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final Camera.Size a() {
        ?? r42;
        Camera.Parameters parameters;
        List<Camera.Size> supportedPreviewSizes;
        Object next;
        Camera.Parameters parameters2;
        List<Camera.Size> supportedPreviewSizes2;
        Object next2;
        Object next3 = null;
        try {
            Camera cameraOpen = Camera.open();
            this.c = cameraOpen;
            Camera.Parameters parameters3 = cameraOpen != null ? cameraOpen.getParameters() : null;
            if (parameters3 != null && parameters3.getSupportedFocusModes().contains("continuous-picture")) {
                parameters3.setFocusMode("continuous-picture");
            }
            Camera camera = this.c;
            List list = this.f1300a;
            if (camera == null || (parameters2 = camera.getParameters()) == null || (supportedPreviewSizes2 = parameters2.getSupportedPreviewSizes()) == null) {
                r42 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : supportedPreviewSizes2) {
                    Camera.Size size = (Camera.Size) obj;
                    if (list.contains(new Pair(Integer.valueOf(size.width), Integer.valueOf(size.height)))) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        int i = ((Camera.Size) next2).width;
                        do {
                            Object next4 = it.next();
                            int i4 = ((Camera.Size) next4).width;
                            if (i < i4) {
                                next2 = next4;
                                i = i4;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                r42 = (Camera.Size) next2;
            }
            Camera camera2 = this.c;
            if (camera2 != null && (parameters = camera2.getParameters()) != null && (supportedPreviewSizes = parameters.getSupportedPreviewSizes()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : supportedPreviewSizes) {
                    Camera.Size size2 = (Camera.Size) obj2;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (size2.width == ((Number) ((Pair) next).f18160a).intValue()) {
                            break;
                        }
                    }
                    if (next != null) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (it3.hasNext()) {
                        int i6 = ((Camera.Size) next3).width;
                        do {
                            Object next5 = it3.next();
                            int i10 = ((Camera.Size) next5).width;
                            if (i6 < i10) {
                                next3 = next5;
                                i6 = i10;
                            }
                        } while (it3.hasNext());
                    }
                }
                next3 = (Camera.Size) next3;
            }
            if (r42 == 0) {
                r42 = next3;
            }
            if (r42 != 0) {
                if (parameters3 != null) {
                    parameters3.setPictureSize(((Camera.Size) r42).width, ((Camera.Size) r42).height);
                }
                if (parameters3 != null) {
                    parameters3.setPreviewSize(((Camera.Size) r42).width, ((Camera.Size) r42).height);
                }
            }
            Camera camera3 = this.c;
            if (camera3 != null) {
                camera3.setParameters(parameters3);
            }
            return r42;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(holder, "holder");
        this.f1301b.invoke(new A5.j(5));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        kotlin.jvm.internal.j.g(holder, "holder");
        this.f1301b.invoke(new Ag.l(2, this, holder));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        kotlin.jvm.internal.j.g(holder, "holder");
        this.f1301b.invoke(new Ag.k(this, 10));
    }
}
