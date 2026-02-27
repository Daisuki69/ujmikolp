package D;

import D8.C0205m;
import D8.C0206n;
import D8.C0212u;
import K8.InterfaceC0278c;
import K8.InterfaceC0279d;
import K8.InterfaceC0282g;
import K8.InterfaceC0295u;
import M8.C0344d;
import M8.C0348e;
import M8.C0374k1;
import M8.C0392p;
import M8.Q2;
import N5.C0454g0;
import N5.C0482u0;
import N5.C0484v0;
import N5.C0490y0;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitSecondaryIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.referral.view.activity.impl.MayaReferralV2Activity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: D.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0190x extends kotlin.jvm.internal.i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0190x(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f957a = i6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FrameLayout frameLayout;
        String strTnTj78 = numX49.tnTj78("PeVe");
        String strTnTj782 = numX49.tnTj78("PeV8");
        int i = 3;
        int i4 = 6;
        int i6 = 12;
        int i10 = 15;
        int i11 = 2;
        String strTnTj783 = numX49.tnTj78("PeVC");
        String strTnTj784 = numX49.tnTj78("PeV4");
        int i12 = 0;
        switch (this.f957a) {
            case 0:
                c0.k kVar = (c0.k) this.receiver;
                b0.k(kVar.f9210a, 0, b0.o(kVar.f9211b.f9439a, strTnTj78));
                return Unit.f18162a;
            case 1:
                c0.k kVar2 = (c0.k) this.receiver;
                b0.k(kVar2.f9210a, 0, b0.o(kVar2.f9211b.f9439a, strTnTj782));
                return Unit.f18162a;
            case 2:
                c0.k kVar3 = (c0.k) this.receiver;
                return Integer.valueOf(b0.c(kVar3.f9210a, kVar3.f9211b, strTnTj78));
            case 3:
                c0.k kVar4 = (c0.k) this.receiver;
                return Integer.valueOf(b0.c(kVar4.f9210a, kVar4.f9211b, strTnTj782));
            case 4:
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) this.receiver);
                KeyEventDispatcher.Component componentRequireActivity = mayaKycAdditionalDocumentsFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, strTnTj784);
                H8.b bVar = (H8.b) componentRequireActivity;
                MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
                mayaKycActivity.f12446n = new C0344d(i11, bVar);
                mayaKycActivity.f12447o = new C0348e(i11, bVar);
                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment.G1()).f3920a;
                kotlin.jvm.internal.j.f(constraintLayout, strTnTj783);
                Navigation.findNavController(constraintLayout).navigate(new C0392p(mayaKycActivity.s().toString(), 40200));
                return Unit.f18162a;
            case 5:
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.receiver);
                KeyEventDispatcher.Component componentRequireActivity2 = mayaKycAmlcCertificateFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity2, strTnTj784);
                H8.b bVar2 = (H8.b) componentRequireActivity2;
                MayaKycActivity mayaKycActivity2 = (MayaKycActivity) bVar2;
                mayaKycActivity2.f12446n = new C0344d(i, bVar2);
                mayaKycActivity2.f12447o = new C0348e(i, bVar2);
                mayaKycAmlcCertificateFragment.O1(40200, bVar2);
                return Unit.f18162a;
            case 6:
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.receiver)).B3();
                return Unit.f18162a;
            case 7:
                C0212u c0212u = (C0212u) ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.receiver)).I2();
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).w2().f4041b.setVisibility(0);
                c0212u.e(new Lh.d(new Lh.d(new Lh.h(c0212u.i.g(), zh.b.a(), 0), new C0205m(c0212u, i12), i11), new C0206n(c0212u, i12), i12).e());
                return Unit.f18162a;
            case 8:
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.receiver);
                KeyEventDispatcher.Component componentRequireActivity3 = mayaKycIdReviewFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity3, strTnTj784);
                H8.b bVar3 = (H8.b) componentRequireActivity3;
                MayaKycActivity mayaKycActivity3 = (MayaKycActivity) bVar3;
                mayaKycActivity3.f12446n = new C0344d(i4, bVar3);
                mayaKycActivity3.f12447o = new C0348e(i4, bVar3);
                ConstraintLayout constraintLayout2 = ((C0454g0) mayaKycIdReviewFragment.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout2, strTnTj783);
                Navigation.findNavController(constraintLayout2).navigate(new C0374k1(2131231472, R.string.maya_label_connection_issue_split, mayaKycActivity3.s().toString(), 40200));
                return Unit.f18162a;
            case 9:
                ((MayaKycLivenessCaptureFragment) ((K8.w) this.receiver)).Q1();
                return Unit.f18162a;
            case 10:
                ((MayaKycLivenessCaptureFragment) ((K8.w) this.receiver)).Q1();
                return Unit.f18162a;
            case 11:
                return ((E8.r) ((MayaKycMinorTakeAPhotoFragment) ((K8.y) this.receiver)).f12571a0.getValue()).a();
            case 12:
                return ((E8.r) ((MayaKycSimpleCaptureFragment) ((K8.C) this.receiver)).f12588Y.getValue()).a();
            case 13:
                MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = (MayaKycSsneSwornStatementFragment) ((K8.G) this.receiver);
                KeyEventDispatcher.Component componentRequireActivity4 = mayaKycSsneSwornStatementFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity4, strTnTj784);
                H8.b bVar4 = (H8.b) componentRequireActivity4;
                MayaKycActivity mayaKycActivity4 = (MayaKycActivity) bVar4;
                mayaKycActivity4.f12446n = new C0344d(i6, bVar4);
                mayaKycActivity4.f12447o = new C0348e(i6, bVar4);
                mayaKycSsneSwornStatementFragment.O1(40200, bVar4);
                return Unit.f18162a;
            case 14:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) ((K8.O) this.receiver);
                KeyEventDispatcher.Component componentRequireActivity5 = mayaKycUploadPhilsysIdFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity5, strTnTj784);
                H8.b bVar5 = (H8.b) componentRequireActivity5;
                MayaKycActivity mayaKycActivity5 = (MayaKycActivity) bVar5;
                mayaKycActivity5.f12446n = new C0344d(i10, bVar5);
                mayaKycActivity5.f12447o = new C0348e(i10, bVar5);
                ConstraintLayout constraintLayout3 = ((C0490y0) mayaKycUploadPhilsysIdFragment.G1()).f4297a;
                kotlin.jvm.internal.j.f(constraintLayout3, strTnTj783);
                Navigation.findNavController(constraintLayout3).navigate(new Q2(2131231472, mayaKycActivity5.s().toString(), R.string.maya_label_that_didnt_load_right, R.string.maya_label_connection_issue_split, R.string.maya_label_got_it, 40200));
                return Unit.f18162a;
            case 15:
                Z.k kVar5 = ((G.d) this.receiver).e;
                if (kVar5 != null && (frameLayout = kVar5.h) != null) {
                    frameLayout.setVisibility(0);
                }
                return Unit.f18162a;
            case 16:
                Z.k kVar6 = ((G.d) this.receiver).e;
                if (kVar6 != null) {
                    kVar6.f6832d.setVisibility(0);
                    ImageView imageView = kVar6.f6835l;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    FrameLayout frameLayout2 = kVar6.h;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                }
                return Unit.f18162a;
            case 17:
                Drawable drawable = ResourcesCompat.getDrawable(((G.d) this.receiver).getResources(), R.drawable.ct_audio, null);
                kotlin.jvm.internal.j.d(drawable);
                return drawable;
            case 18:
                return ((MayaDashboardFragment) this.receiver).requireContext();
            case 19:
                return ((MayaDashboardFragment) this.receiver).requireContext();
            case 20:
                return ((MayaDashboardFragment) this.receiver).requireContext();
            case 21:
                return ((MayaDashboardFragment) this.receiver).requireContext();
            case 22:
                ((C0482u0) ((MayaKycSubmitIdFragment) this.receiver).G1()).f4221b.setEnabled(true);
                return Unit.f18162a;
            case 23:
                ((C0482u0) ((MayaKycSubmitIdFragment) this.receiver).G1()).f4221b.setEnabled(true);
                return Unit.f18162a;
            case 24:
                ((C0482u0) ((MayaKycSubmitIdFragment) this.receiver).G1()).f4221b.setEnabled(true);
                return Unit.f18162a;
            case 25:
                ((C0484v0) ((MayaKycSubmitSecondaryIdFragment) this.receiver).G1()).f4234b.setEnabled(true);
                return Unit.f18162a;
            case 26:
                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = (MayaAccountRecoveryEmailFragment) this.receiver;
                MayaInputLayout mayaInputLayout = mayaAccountRecoveryEmailFragment.f13911X;
                String strTnTj785 = numX49.tnTj78("PeVK");
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                mayaInputLayout.h();
                MayaInputLayout mayaInputLayout2 = mayaAccountRecoveryEmailFragment.f13911X;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                mayaInputLayout2.f();
                Button button = mayaAccountRecoveryEmailFragment.f13912Y;
                if (button != null) {
                    button.setEnabled(true);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(numX49.tnTj78("PeVw"));
                throw null;
            case 27:
                MayaAccountRecoveryEmailFragment.G1((MayaAccountRecoveryEmailFragment) this.receiver);
                return Unit.f18162a;
            case 28:
                MayaAccountRecoveryEmailFragment.G1((MayaAccountRecoveryEmailFragment) this.receiver);
                return Unit.f18162a;
            default:
                MayaReferralV2Activity mayaReferralV2Activity = (MayaReferralV2Activity) ((Sa.a) ((Ra.a) this.receiver).c.get());
                mayaReferralV2Activity.n1().k0(mayaReferralV2Activity, numX49.tnTj78("PeVo"));
                return Unit.f18162a;
        }
    }
}
