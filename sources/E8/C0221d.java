package E8;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.MeteringPointFactory;
import androidx.core.content.ContextCompat;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: E8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0221d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaKycBaseFragment f1280b;
    public Camera c;

    public C0221d(Context context, MayaKycBaseFragment mayaKycBaseFragment) {
        this.f1279a = context;
        this.f1280b = mayaKycBaseFragment;
    }

    public static Size b(C0221d c0221d) {
        c0221d.getClass();
        return new Size(1080, 1920);
    }

    public final void a(MeteringPointFactory meteringPointFactory, float f, float f3, Function0 function0, Function0 function02, boolean z4) {
        Camera camera = this.c;
        CameraControl cameraControl = camera != null ? camera.getCameraControl() : null;
        MeteringPoint meteringPointCreatePoint = meteringPointFactory.createPoint(f, f3);
        kotlin.jvm.internal.j.f(meteringPointCreatePoint, "createPoint(...)");
        FocusMeteringAction focusMeteringActionBuild = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1).disableAutoCancel().build();
        kotlin.jvm.internal.j.f(focusMeteringActionBuild, "build(...)");
        S1.y yVarStartFocusAndMetering = cameraControl != null ? cameraControl.startFocusAndMetering(focusMeteringActionBuild) : null;
        if (yVarStartFocusAndMetering != null) {
            yVarStartFocusAndMetering.addListener(new RunnableC0220c(0, yVarStartFocusAndMetering, function0, function02, z4), ContextCompat.getMainExecutor(this.f1279a));
        }
    }
}
