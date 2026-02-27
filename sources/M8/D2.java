package M8;

import D8.C0214w;
import N5.C0488x0;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.Navigation;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebInterstitialFragment;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreIntroductionFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaLuckyGamesInterstitialFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeIdPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeVideoSelfieFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaVerifyRegistrationV2Fragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class D2 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f3153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D2(MayaBaseFragment mayaBaseFragment, int i) {
        super(true);
        this.f3152a = i;
        this.f3153b = mayaBaseFragment;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        String string;
        C1219h c1219hE = null;
        switch (this.f3152a) {
            case 0:
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycTakeIdPhotoFragment) this.f3153b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                return;
            case 1:
                MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment = (MayaKycTakeVideoSelfieFragment) this.f3153b;
                ConstraintLayout constraintLayout = ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4261a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                E1.c.m(Navigation.findNavController(constraintLayout), new J2(T2.j(mayaKycTakeVideoSelfieFragment)));
                return;
            case 2:
                KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) ((MayaKycVerifyWithPhilsysFragment) this.f3153b).K1()).c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity2);
                mayaKycActivity.g2();
                mayaKycActivity.finish();
                return;
            case 3:
                MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) this.f3153b;
                NavArgsLazy navArgsLazy = mayaKycWorkDetailsFragment.f12658Z;
                if (kotlin.jvm.internal.j.b(((i3) navArgsLazy.getValue()).a(), "confirm_submission")) {
                    return;
                }
                B8.h hVarN1 = mayaKycWorkDetailsFragment.N1();
                String strA = ((i3) navArgsLazy.getValue()).a();
                kotlin.jvm.internal.j.f(strA, "getNavigationSource(...)");
                ((D8.Z) hVarN1).E(strA);
                return;
            case 4:
                NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) this.f3153b;
                newMayaCreditAssignContactReferenceFragment.G1();
                MayaInputLayout mayaInputLayout = newMayaCreditAssignContactReferenceFragment.f13164W;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                    throw null;
                }
                String strG = AbstractC1414e.g(mayaInputLayout);
                MayaInputLayout mayaInputLayout2 = newMayaCreditAssignContactReferenceFragment.f13165X;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                    throw null;
                }
                String strG2 = AbstractC1414e.g(mayaInputLayout2);
                ForcedAutoCompleteTextView forcedAutoCompleteTextView = newMayaCreditAssignContactReferenceFragment.f13167Z;
                if (forcedAutoCompleteTextView == null) {
                    kotlin.jvm.internal.j.n("mAutoCompleteTextViewContactRelationship");
                    throw null;
                }
                String contactRelationship = forcedAutoCompleteTextView.getText().toString();
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = newMayaCreditAssignContactReferenceFragment.f13168a0;
                if (mayaAutoCompleteInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutMobileNumber");
                    throw null;
                }
                String mobileNumber = mayaAutoCompleteInputLayout.getInputAutoCompleteEditText().getText().toString();
                kotlin.jvm.internal.j.g(contactRelationship, "contactRelationship");
                kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
                J9.a aVar = new J9.a(strG, strG2, contactRelationship, mobileNumber);
                Q9.q qVar = newMayaCreditAssignContactReferenceFragment.f13172e0;
                if (qVar != null) {
                    com.paymaya.common.utility.E.a("NewMayaCreditActivity", "setCreditReviewContactReference");
                    ((CreditReviewUiModel) ((NewMayaCreditActivity) qVar).X1().f1802k).f13060l = aVar;
                }
                setEnabled(false);
                newMayaCreditAssignContactReferenceFragment.requireActivity().onBackPressed();
                return;
            case 5:
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment = (CTInAppNativeInterstitialFragment) this.f3153b;
                if (cTInAppNativeInterstitialFragment.f9531T) {
                    cTInAppNativeInterstitialFragment.G1();
                    setEnabled(false);
                    return;
                }
                return;
            case 6:
                C0214w c0214wH1 = ((MayaDataPrivacyDataPersonalizationFragment) this.f3153b).H1();
                if (kotlin.jvm.internal.j.b(((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214wH1.c.get())).f12289e0, "login")) {
                    c1219hE = C1219h.e(AbstractC1213b.l(6));
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put("page_name", "Data personalization");
                    Bundle arguments = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214wH1.c.get())).getArguments();
                    if (arguments == null || (string = arguments.getString("origin_screen")) == null) {
                        string = "";
                    }
                    c1219hE.j.put("destination_page", string);
                }
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214wH1.c.get());
                if (c1219hE != null) {
                    C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment.o1();
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put("button", "Back");
                    c1219hE.i();
                    c1220iO1.b(c1219hE);
                } else {
                    mayaDataPrivacyDataPersonalizationFragment.getClass();
                }
                setEnabled(false);
                ((MayaDataPrivacyDataPersonalizationFragment) this.f3153b).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                return;
            case 7:
                Bb.a aVarG1 = ((MayaDataPrivacyPolicyFragment) this.f3153b).G1();
                if (kotlin.jvm.internal.j.b(((MayaDataPrivacyPolicyFragment) ((R7.c) aVarG1.c.get())).f12299a0, "login")) {
                    c1219hE = C1219h.e(AbstractC1213b.l(3));
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put("page_name", ((MayaDataPrivacyPolicyFragment) ((R7.c) aVarG1.c.get())).f12300b0);
                }
                MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) ((R7.c) aVarG1.c.get());
                if (c1219hE != null) {
                    C1220i c1220iO12 = mayaDataPrivacyPolicyFragment.o1();
                    EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map = c1219hE.j;
                    map.put("button", "Back");
                    map.put("destination_page", C2576A.b0(Ke.d.a(mayaDataPrivacyPolicyFragment.f12299a0)).toString());
                    c1219hE.i();
                    c1220iO12.b(c1219hE);
                } else {
                    mayaDataPrivacyPolicyFragment.getClass();
                }
                setEnabled(false);
                ((MayaDataPrivacyPolicyFragment) this.f3153b).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                return;
            case 8:
                MayaWebInterstitialFragment mayaWebInterstitialFragment = (MayaWebInterstitialFragment) this.f3153b;
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.BACK);
                c1219hH.i();
                mayaWebInterstitialFragment.A1(c1219hH);
                mayaWebInterstitialFragment.requireActivity().finish();
                return;
            case 9:
                String strP = AbstractC1213b.p(2);
                kotlin.jvm.internal.j.f(strP, "tapped(...)");
                MayaAccountCreationFragment mayaAccountCreationFragment = (MayaAccountCreationFragment) this.f3153b;
                String strS = mayaAccountCreationFragment.s();
                String string2 = mayaAccountCreationFragment.G1().r().toString();
                if (string2.length() == 0) {
                    string2 = "Landing";
                }
                MayaAccountCreationFragment.J1(mayaAccountCreationFragment, strP, strS, "Back", string2);
                eb.d dVar = mayaAccountCreationFragment.f13679X;
                if (dVar != null) {
                    MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) dVar;
                    Intent intent = new Intent();
                    intent.putExtra("source_screen", "Account Creation");
                    mayaRegistrationV2Activity.setResult(-1, intent);
                    mayaRegistrationV2Activity.finish();
                    return;
                }
                return;
            case 10:
                String strP2 = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP2, "tapped(...)");
                MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) this.f3153b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment, "Back", strP2, mayaAccountProvisionFragment.s(), mayaAccountProvisionFragment.G1().r().toString(), null, null, 48);
                eb.l lVar = mayaAccountProvisionFragment.f13684X;
                if (lVar != null) {
                    ActivityKt.findNavController((MayaRegistrationV2Activity) lVar, R.id.nav_host_fragment).popBackStack();
                    return;
                }
                return;
            case 11:
                MayaVerifyRegistrationV2Fragment mayaVerifyRegistrationV2Fragment = (MayaVerifyRegistrationV2Fragment) this.f3153b;
                C1220i c1220iO13 = mayaVerifyRegistrationV2Fragment.o1();
                C1219h c1219hE2 = C1219h.e(AbstractC1213b.p(11));
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                String strS2 = mayaVerifyRegistrationV2Fragment.s();
                HashMap map2 = c1219hE2.j;
                map2.put("source_page", strS2);
                map2.put("destination_page", mayaVerifyRegistrationV2Fragment.W1().r().toString());
                map2.put("button", "Back");
                c1219hE2.i();
                c1220iO13.b(c1219hE2);
                eb.o oVar = mayaVerifyRegistrationV2Fragment.f13692k0;
                if (oVar != null) {
                    ActivityKt.findNavController((MayaRegistrationV2Activity) oVar, R.id.nav_host_fragment).popBackStack();
                    return;
                }
                return;
            case 12:
                MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment = (MayaCreatorStoreIntroductionFragment) this.f3153b;
                C1219h c1219h = mayaCreatorStoreIntroductionFragment.f12120V;
                if (c1219h == null) {
                    kotlin.jvm.internal.j.n("analyticsEvent");
                    throw null;
                }
                c1219h.n(17);
                c1219h.t(EnumC1217f.BACK);
                c1219h.i();
                mayaCreatorStoreIntroductionFragment.A1(c1219h);
                if (isEnabled()) {
                    setEnabled(false);
                    mayaCreatorStoreIntroductionFragment.requireActivity().onBackPressed();
                    return;
                }
                return;
            case 13:
                MayaLuckyGamesInterstitialFragment mayaLuckyGamesInterstitialFragment = (MayaLuckyGamesInterstitialFragment) this.f3153b;
                C1220i c1220iO14 = mayaLuckyGamesInterstitialFragment.o1();
                C1219h c1219h2 = new C1219h();
                c1219h2.p(EnumC1215d.LUCKY_GAMES);
                c1219h2.r(EnumC1216e.INTRO);
                c1219h2.n(17);
                c1219h2.t(EnumC1217f.BACK);
                c1219h2.i();
                c1220iO14.b(c1219h2);
                if (isEnabled()) {
                    setEnabled(false);
                    mayaLuckyGamesInterstitialFragment.requireActivity().onBackPressed();
                    return;
                }
                return;
            default:
                ((MayaUpdateProfileBaseFragment) this.f3153b).P1();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment) {
        super(false);
        this.f3152a = 5;
        this.f3153b = cTInAppNativeInterstitialFragment;
    }
}
