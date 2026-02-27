package M8;

import K8.InterfaceC0287l;
import K8.InterfaceC0291p;
import K8.InterfaceC0293s;
import N5.C0488x0;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.dataprivacy.view.activity.impl.MayaDataPrivacyActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDeclarationsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEditAddressFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFaceAuthenticationTipsFragment;
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
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeIdPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeVideoSelfieFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditContactReferenceLearnMoreBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditInterestRateBottomSheetFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaVerifiedSellerBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNameGuideBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaLicensesBottomSheetDialogFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3191b;

    public /* synthetic */ L(Object obj, int i) {
        this.f3190a = i;
        this.f3191b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3190a) {
            case 0:
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    D1.c(mayaKycCompletePersonalInformationFragment, new G(mayaKycCompletePersonalInformationFragment, 10));
                    return;
                } finally {
                }
            case 1:
                MayaKycDeclarationsFragment mayaKycDeclarationsFragment = (MayaKycDeclarationsFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity = ((MayaKycDeclarationsFragment) ((InterfaceC0287l) mayaKycDeclarationsFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                    return;
                } finally {
                }
            case 2:
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = (MayaKycDocumentIdGuideFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity2 = mayaKycDocumentIdGuideFragment.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(true);
                    return;
                } finally {
                }
            case 3:
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaKycDosriFragment.Q1(mayaKycDosriFragment.N1().getText().toString(), "");
                    mayaKycDosriFragment.K1();
                    return;
                } finally {
                }
            case 4:
                MayaKycEditAddressFragment mayaKycEditAddressFragment = (MayaKycEditAddressFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity3 = ((MayaKycEditAddressFragment) ((InterfaceC0291p) mayaKycEditAddressFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity3)).i2(true);
                    return;
                } finally {
                }
            case 5:
                MayaKycFaceAuthenticationTipsFragment mayaKycFaceAuthenticationTipsFragment = (MayaKycFaceAuthenticationTipsFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    ((MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) mayaKycFaceAuthenticationTipsFragment.K1().c.get())).L1();
                    return;
                } finally {
                }
            case 6:
                MayaKycPurposeOfAccountFragment mayaKycPurposeOfAccountFragment = (MayaKycPurposeOfAccountFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity4 = ((MayaKycPurposeOfAccountFragment) ((K8.A) mayaKycPurposeOfAccountFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity4, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity4)).i2(true);
                    return;
                } finally {
                }
            case 7:
                MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaKycSimpleCaptureFragment.L1().k();
                    return;
                } finally {
                }
            case 8:
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaKycSimpleCaptureV2Fragment.N1().l();
                    return;
                } finally {
                }
            case 9:
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) this.f3191b;
                List list = MayaKycSimpleCaptureV3Fragment.f12596h0;
                Callback.onClick_enter(view);
                try {
                    mayaKycSimpleCaptureV3Fragment.V1().k();
                    return;
                } finally {
                }
            case 10:
                MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = (MayaKycSsneSwornStatementFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    ((MayaKycSsneSwornStatementFragment) ((K8.G) mayaKycSsneSwornStatementFragment.K1().c.get())).N1();
                    String string = mayaKycSsneSwornStatementFragment.getString(R.string.maya_kyc_ssne_page_name_label);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    mayaKycSsneSwornStatementFragment.Q1("Back", string);
                    return;
                } finally {
                }
            case 11:
                MayaKycSsneUploadDocumentsFragment mayaKycSsneUploadDocumentsFragment = (MayaKycSsneUploadDocumentsFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity5 = ((MayaKycSsneUploadDocumentsFragment) ((K8.H) mayaKycSsneUploadDocumentsFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity5, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity5)).i2(true);
                    String string2 = mayaKycSsneUploadDocumentsFragment.getString(R.string.pma_label_back);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    String string3 = mayaKycSsneUploadDocumentsFragment.getString(R.string.maya_kyc_work_details_screen_label);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    mayaKycSsneUploadDocumentsFragment.M1(string2, string3);
                    return;
                } finally {
                }
            case 12:
                MayaKycSubmissionPendingFragment mayaKycSubmissionPendingFragment = (MayaKycSubmissionPendingFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity6 = ((MayaKycSubmissionPendingFragment) ((K8.I) mayaKycSubmissionPendingFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity6, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity6)).i2(true);
                    return;
                } finally {
                }
            case 13:
                MayaKycSubmissionSuccessFragment mayaKycSubmissionSuccessFragment = (MayaKycSubmissionSuccessFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity7 = ((MayaKycSubmissionSuccessFragment) ((K8.J) mayaKycSubmissionSuccessFragment.K1().c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity7, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity7)).i2(true);
                    return;
                } finally {
                }
            case 14:
                MayaKycSubmitIdFragment mayaKycSubmitIdFragment = (MayaKycSubmitIdFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity8 = mayaKycSubmitIdFragment.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity8, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity8)).i2(true);
                    return;
                } finally {
                }
            case 15:
                MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaKycSubmitSecondaryIdFragment.K1().o();
                    return;
                } finally {
                }
            case 16:
                MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment = (MayaKycTakeIdPhotoFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity9 = mayaKycTakeIdPhotoFragment.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity9, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity9)).i2(true);
                    return;
                } finally {
                }
            case 17:
                MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment = (MayaKycTakeVideoSelfieFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    ConstraintLayout constraintLayout = ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4261a;
                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                    E1.c.m(Navigation.findNavController(constraintLayout), new J2(T2.j(mayaKycTakeVideoSelfieFragment)));
                    return;
                } finally {
                }
            case 18:
                MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    KeyEventDispatcher.Component componentRequireActivity10 = ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) mayaKycVerifyWithPhilsysFragment.K1()).c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity10, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity10);
                    mayaKycActivity.g2();
                    mayaKycActivity.finish();
                    return;
                } finally {
                }
            case 19:
                MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    B8.h hVarN1 = mayaKycWorkDetailsFragment.N1();
                    String strA = ((i3) mayaKycWorkDetailsFragment.f12658Z.getValue()).a();
                    kotlin.jvm.internal.j.f(strA, "getNavigationSource(...)");
                    ((D8.Z) hVarN1).E(strA);
                    return;
                } finally {
                }
            case 20:
                NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) this.f3191b;
                int i = NewMayaCreditActivity.f13081x;
                Callback.onClick_enter(view);
                try {
                    newMayaCreditActivity.onBackPressed();
                    return;
                } finally {
                }
            case 21:
                MayaVerifiedSellerBottomSheetDialogFragment mayaVerifiedSellerBottomSheetDialogFragment = (MayaVerifiedSellerBottomSheetDialogFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaVerifiedSellerBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 22:
                MayaDataPrivacyActivity mayaDataPrivacyActivity = (MayaDataPrivacyActivity) this.f3191b;
                int i4 = MayaDataPrivacyActivity.f12260s;
                Callback.onClick_enter(view);
                try {
                    mayaDataPrivacyActivity.onBackPressed();
                    return;
                } finally {
                }
            case 23:
                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) this.f3191b;
                int i6 = KycMayaDropDown.f12663a0;
                Callback.onClick_enter(view);
                try {
                    if (kycMayaDropDown.isEnabled()) {
                        Function0 function0 = kycMayaDropDown.f12673W;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        if (kycMayaDropDown.f12681q && kycMayaDropDown.f12679o) {
                            kycMayaDropDown.b();
                        }
                        if (kycMayaDropDown.f12682r && kycMayaDropDown.f12680p) {
                            kycMayaDropDown.c();
                        }
                    }
                    return;
                } finally {
                }
            case 24:
                NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = (NewMayaAgreementSettingsBottomSheetFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    Function1 function1 = newMayaAgreementSettingsBottomSheetFragment.f13141Y;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(newMayaAgreementSettingsBottomSheetFragment.f13139W));
                    }
                    newMayaAgreementSettingsBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 25:
                NewMayaCreditBillingEndDateBottomSheetFragment newMayaCreditBillingEndDateBottomSheetFragment = (NewMayaCreditBillingEndDateBottomSheetFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditBillingEndDateBottomSheetFragment.s1(newMayaCreditBillingEndDateBottomSheetFragment);
                    return;
                } finally {
                }
            case 26:
                NewMayaCreditContactReferenceLearnMoreBottomSheetFragment newMayaCreditContactReferenceLearnMoreBottomSheetFragment = (NewMayaCreditContactReferenceLearnMoreBottomSheetFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iN1 = newMayaCreditContactReferenceLearnMoreBottomSheetFragment.n1();
                    FragmentActivity activity = newMayaCreditContactReferenceLearnMoreBottomSheetFragment.getActivity();
                    C1219h c1219hD = C1219h.d(newMayaCreditContactReferenceLearnMoreBottomSheetFragment.p1());
                    c1219hD.r(EnumC1216e.ASSIGN_CONTACT_REFERENCE);
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.RETURN);
                    c1219hD.i();
                    c1220iN1.c(activity, c1219hD);
                    newMayaCreditContactReferenceLearnMoreBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 27:
                NewMayaCreditInterestRateBottomSheetFragment newMayaCreditInterestRateBottomSheetFragment = (NewMayaCreditInterestRateBottomSheetFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    String str = newMayaCreditInterestRateBottomSheetFragment.f13289U;
                    if (str != null) {
                        C1220i c1220iN12 = newMayaCreditInterestRateBottomSheetFragment.n1();
                        FragmentActivity activity2 = newMayaCreditInterestRateBottomSheetFragment.getActivity();
                        C1219h c1219hE = C1219h.e(str);
                        c1219hE.i();
                        c1220iN12.c(activity2, c1219hE);
                    }
                    newMayaCreditInterestRateBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 28:
                MayaDisplayNameGuideBottomSheetDialogFragment mayaDisplayNameGuideBottomSheetDialogFragment = (MayaDisplayNameGuideBottomSheetDialogFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaDisplayNameGuideBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            default:
                MayaLicensesBottomSheetDialogFragment mayaLicensesBottomSheetDialogFragment = (MayaLicensesBottomSheetDialogFragment) this.f3191b;
                Callback.onClick_enter(view);
                try {
                    mayaLicensesBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
        }
    }
}
