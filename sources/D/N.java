package D;

import D8.C0200h;
import K8.InterfaceC0279d;
import K8.InterfaceC0280e;
import K8.InterfaceC0287l;
import K8.InterfaceC0291p;
import K8.InterfaceC0293s;
import M8.D1;
import N5.C0438b;
import N5.C0442c0;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAccountUnderReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcUploadDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragmentV2;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDeclarationsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEditAddressFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEverythingClearFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFaceAuthenticationTipsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFatcaFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMaintenanceFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPersonalInfoConfirmSubmissionFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPurposeOfAccountFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneUploadDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmissionPendingFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmissionSuccessFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitSecondaryIdFragment;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(Object obj, int i) {
        super(true);
        this.f856a = i;
        this.f857b = obj;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        switch (this.f856a) {
            case 0:
                InAppNotificationActivity inAppNotificationActivity = (InAppNotificationActivity) this.f857b;
                inAppNotificationActivity.finish();
                inAppNotificationActivity.h1(null, true);
                break;
            case 1:
                MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) this.f857b;
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.RETURN);
                c1219hH.i();
                mayaPushApprovalListFragment.A1(c1219hH);
                KeyEventDispatcher.Component componentRequireActivity = mayaPushApprovalListFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, numX49.tnTj78("PeK"));
                ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).finish();
                break;
            case 2:
                KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAccountUnderReviewFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity2, numX49.tnTj78("Peo"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity2)).finish();
                break;
            case 3:
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) this.f857b;
                File cacheDir = mayaKycAdditionalDocumentsFragment.requireContext().getCacheDir();
                kotlin.jvm.internal.j.f(cacheDir, numX49.tnTj78("PeC"));
                com.paymaya.mayaui.kyczoloz.utils.d.c(cacheDir);
                KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity3, numX49.tnTj78("Pe4"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity3)).i2(true);
                break;
            case 4:
                ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) ((MayaKycAmlcCertificateFragment) this.f857b).K1()).c.get())).N1();
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) this.f857b;
                String string = mayaKycAmlcCertificateFragment.getString(R.string.maya_kyc_amlc_page_name_label);
                kotlin.jvm.internal.j.f(string, numX49.tnTj78("Pee"));
                S1.s.m(mayaKycAmlcCertificateFragment, numX49.tnTj78("Pe8"), string, null, null, null, 28);
                break;
            case 5:
                MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) this.f857b;
                MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) mayaKycAmlcUploadDocumentsFragment.K1().c.get());
                KeyEventDispatcher.Component componentRequireActivity4 = mayaKycAmlcUploadDocumentsFragment2.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity4, numX49.tnTj78("PeO"));
                H8.b bVar = (H8.b) componentRequireActivity4;
                if (((M8.A) mayaKycAmlcUploadDocumentsFragment2.f12480Y.getValue()).a()) {
                    ((MayaKycActivity) bVar).finish();
                } else {
                    ((MayaKycActivity) bVar).i2(true);
                }
                String strTnTj78 = ((M8.A) mayaKycAmlcUploadDocumentsFragment.f12480Y.getValue()).a() ? numX49.tnTj78("PeQ") : numX49.tnTj78("Pet");
                String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.pma_label_back);
                kotlin.jvm.internal.j.f(string2, numX49.tnTj78("PeU"));
                mayaKycAmlcUploadDocumentsFragment.L1(string2, strTnTj78);
                break;
            case 6:
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) this.f857b;
                D1.c(mayaKycCompletePersonalInformationFragment, new M8.G(mayaKycCompletePersonalInformationFragment, 10));
                break;
            case 7:
                KeyEventDispatcher.Component componentRequireActivity5 = ((MayaKycCompleteYourMayaExperienceFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity5, numX49.tnTj78("PeH"));
                MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity5);
                mayaKycActivity.g2();
                mayaKycActivity.finish();
                break;
            case 8:
                KeyEventDispatcher.Component componentRequireActivity6 = ((MayaKycCompleteYourMayaExperienceFragmentV2) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity6, numX49.tnTj78("PeF"));
                MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity6);
                mayaKycActivity2.g2();
                mayaKycActivity2.finish();
                break;
            case 9:
                KeyEventDispatcher.Component componentRequireActivity7 = ((MayaKycDeclarationsFragment) ((InterfaceC0287l) ((MayaKycDeclarationsFragment) this.f857b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity7, numX49.tnTj78("PeE"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity7)).i2(true);
                break;
            case 10:
                KeyEventDispatcher.Component componentRequireActivity8 = ((MayaKycDocumentIdGuideFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity8, numX49.tnTj78("Pei"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity8)).i2(true);
                break;
            case 11:
                FrameLayout frameLayout = ((C0442c0) ((MayaKycDosriFragment) this.f857b).G1()).f4067a;
                kotlin.jvm.internal.j.f(frameLayout, numX49.tnTj78("Ped"));
                Navigation.findNavController(frameLayout).popBackStack();
                break;
            case 12:
                KeyEventDispatcher.Component componentRequireActivity9 = ((MayaKycEditAddressFragment) ((InterfaceC0291p) ((MayaKycEditAddressFragment) this.f857b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity9, numX49.tnTj78("Pej"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity9)).i2(true);
                break;
            case 13:
                KeyEventDispatcher.Component componentRequireActivity10 = ((MayaKycEverythingClearFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity10, numX49.tnTj78("PeS"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity10)).i2(true);
                break;
            case 14:
                ((MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) ((MayaKycFaceAuthenticationTipsFragment) this.f857b).K1().c.get())).L1();
                break;
            case 15:
                ConstraintLayout constraintLayout = ((C0438b) ((MayaKycFatcaFragment) this.f857b).G1()).f4055a;
                kotlin.jvm.internal.j.f(constraintLayout, numX49.tnTj78("PeV"));
                Navigation.findNavController(constraintLayout).popBackStack();
                break;
            case 16:
                KeyEventDispatcher.Component componentRequireActivity11 = ((MayaKycLivenessCaptureFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity11, numX49.tnTj78("Peu"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity11)).i2(true);
                break;
            case 17:
                KeyEventDispatcher.Component componentRequireActivity12 = ((MayaKycMaintenanceFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity12, numX49.tnTj78("PeB"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity12)).finish();
                break;
            case 18:
                KeyEventDispatcher.Component componentRequireActivity13 = ((MayaKycMinorTakeAPhotoFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity13, numX49.tnTj78("Pek"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity13)).i2(true);
                break;
            case 19:
                ((MayaKycPersonalInfoConfirmSubmissionFragment) this.f857b).K1(true);
                break;
            case 20:
                KeyEventDispatcher.Component componentRequireActivity14 = ((MayaKycPurposeOfAccountFragment) ((K8.A) ((MayaKycPurposeOfAccountFragment) this.f857b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity14, numX49.tnTj78("PeZ"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity14)).i2(true);
                break;
            case 21:
                ((MayaKycSimpleCaptureFragment) this.f857b).L1().k();
                break;
            case 22:
                ((MayaKycSimpleCaptureV2Fragment) this.f857b).N1().l();
                break;
            case 23:
                ((MayaKycSimpleCaptureV3Fragment) this.f857b).V1().k();
                break;
            case 24:
                ((MayaKycSsneSwornStatementFragment) ((K8.G) ((MayaKycSsneSwornStatementFragment) this.f857b).K1().c.get())).N1();
                break;
            case 25:
                MayaKycSsneUploadDocumentsFragment mayaKycSsneUploadDocumentsFragment = (MayaKycSsneUploadDocumentsFragment) this.f857b;
                KeyEventDispatcher.Component componentRequireActivity15 = ((MayaKycSsneUploadDocumentsFragment) ((K8.H) mayaKycSsneUploadDocumentsFragment.K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity15, numX49.tnTj78("PeL"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity15)).i2(true);
                String string3 = mayaKycSsneUploadDocumentsFragment.getString(R.string.pma_label_back);
                String strTnTj782 = numX49.tnTj78("Per");
                kotlin.jvm.internal.j.f(string3, strTnTj782);
                String string4 = mayaKycSsneUploadDocumentsFragment.getString(R.string.maya_kyc_work_details_screen_label);
                kotlin.jvm.internal.j.f(string4, strTnTj782);
                mayaKycSsneUploadDocumentsFragment.M1(string3, string4);
                break;
            case 26:
                KeyEventDispatcher.Component componentRequireActivity16 = ((MayaKycSubmissionPendingFragment) ((K8.I) ((MayaKycSubmissionPendingFragment) this.f857b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity16, numX49.tnTj78("Pe2"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity16)).i2(true);
                break;
            case 27:
                KeyEventDispatcher.Component componentRequireActivity17 = ((MayaKycSubmissionSuccessFragment) ((K8.J) ((MayaKycSubmissionSuccessFragment) this.f857b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity17, numX49.tnTj78("Peb"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity17)).i2(true);
                break;
            case 28:
                KeyEventDispatcher.Component componentRequireActivity18 = ((MayaKycSubmitIdFragment) this.f857b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity18, numX49.tnTj78("PeP"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity18)).i2(true);
                break;
            default:
                ((MayaKycSubmitSecondaryIdFragment) this.f857b).K1().o();
                break;
        }
    }
}
