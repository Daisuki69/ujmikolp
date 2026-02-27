package M8;

import N5.C0454g0;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.navigation.Navigation;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;

/* JADX INFO: renamed from: M8.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0350e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3291b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0350e1(Object obj, boolean z4, int i) {
        this.f3290a = i;
        this.c = obj;
        this.f3291b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3290a) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(this.f3291b);
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) this.c;
                Xh.i.G(mayaKycIdReviewFragment, boolValueOf);
                ConstraintLayout constraintLayout = ((C0454g0) mayaKycIdReviewFragment.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).popBackStack();
                break;
            case 1:
                ((Camera2CameraControl) this.c).lambda$setActive$6(this.f3291b);
                break;
            case 2:
                ((AudioStream.AudioStreamCallback) this.c).onSilenceStateChanged(this.f3291b);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.c).lambda$skipSilenceEnabledChanged$7(this.f3291b);
                break;
        }
    }
}
