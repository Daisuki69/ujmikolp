package D8;

import D.C0190x;
import D.CallableC0168a;
import M8.C0417v1;
import N5.C0461j0;
import android.view.SurfaceView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import kotlin.jvm.functions.Function0;
import w.C2360b;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nh.t f1016d;
    public final Dh.c e = new Dh.c(1);

    public I(Nh.t tVar) {
        this.f1016d = tVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (((MayaKycMinorTakeAPhotoFragment) ((K8.y) this.c.get())).requireContext().getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            l(ContextCompat.checkSelfPermission(((MayaKycMinorTakeAPhotoFragment) ((K8.y) this.c.get())).requireContext(), "android.permission.CAMERA") == 0);
        }
    }

    public final void k(Function0 action) {
        kotlin.jvm.internal.j.g(action, "action");
        this.e.a(new Hh.c(new Hh.c(new H(0, action), 1).f(this.f1016d), 2).c());
    }

    public final void l(boolean z4) {
        if (!z4) {
            MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment = (MayaKycMinorTakeAPhotoFragment) ((K8.y) this.c.get());
            com.paymaya.common.utility.C.r0(((C0461j0) mayaKycMinorTakeAPhotoFragment.G1()).c.c, new C0417v1(mayaKycMinorTakeAPhotoFragment, 3));
            ((C0461j0) mayaKycMinorTakeAPhotoFragment.G1()).c.f3580b.setVisibility(0);
            ((ConstraintLayout) ((C0461j0) mayaKycMinorTakeAPhotoFragment.G1()).f4126b.c).setVisibility(8);
            return;
        }
        MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment2 = (MayaKycMinorTakeAPhotoFragment) ((K8.y) this.c.get());
        ((C0461j0) mayaKycMinorTakeAPhotoFragment2.G1()).c.f3580b.setVisibility(8);
        ((ConstraintLayout) ((C0461j0) mayaKycMinorTakeAPhotoFragment2.G1()).f4126b.c).setVisibility(0);
        ((SurfaceView) ((C0461j0) mayaKycMinorTakeAPhotoFragment2.G1()).f4126b.f4087b).getHolder().addCallback((E8.r) mayaKycMinorTakeAPhotoFragment2.f12571a0.getValue());
        Lh.d dVar = new Lh.d(new Lh.h(new Kh.J(new CallableC0168a(new C0190x(0, this.c.get(), K8.y.class, "prepareCamera", "prepareCamera()Landroid/hardware/Camera$Size;", 0, 11), 3), 3).h(this.f1016d), zh.b.a(), 0), new C2360b(new Ag.f(1, this.c.get(), K8.y.class, "setSurfaceViewRatio", "setSurfaceViewRatio(Landroid/hardware/Camera$Size;)V", 0, 3), 15), 2);
        Jh.a aVar = new Jh.a();
        try {
            dVar.f(new Jh.b(aVar, 0));
            this.e.a(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
        }
    }
}
