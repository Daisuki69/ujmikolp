package M8;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import org.opencv.core.Mat;

/* JADX INFO: renamed from: M8.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0358g1 extends Rg.u {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f3305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0358g1(Fragment fragment, FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity, 2);
        this.c = i;
        this.f3305d = fragment;
    }

    @Override // Rg.u
    public final void o(int i) {
        switch (this.c) {
            case 0:
                if (i != 0) {
                    super.o(i);
                } else {
                    ((MayaKycIdReviewFragment) this.f3305d).f12546Z = new Mat();
                }
                break;
            default:
                if (i != 0) {
                    super.o(i);
                } else {
                    ((EKycPhotoCaptureFragment) this.f3305d).f14582k0 = new Mat();
                }
                break;
        }
    }
}
