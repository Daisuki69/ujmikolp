package M8;

import G5.C0256f;
import K8.InterfaceC0287l;
import K8.InterfaceC0288m;
import K8.InterfaceC0291p;
import L9.C0323a;
import L9.C0325c;
import L9.C0327e;
import N5.C0436a0;
import N5.C0445d0;
import N5.C0467m0;
import N5.C0486w0;
import N5.C0488x0;
import a.AbstractC0617a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.common.view.activity.impl.MayaPostLoginActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAcceptedIdsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDeclarationsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDnfbpWhyNeededBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEditAddressFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycExampleUpgradeBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPurposeOfAccountFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmissionPendingFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmissionSuccessFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitSecondaryIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeIdPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeVideoSelfieFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycValidationRulesBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.ExpandableBenefitsRecyclerView;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditIneligibleActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.referral.view.activity.impl.MayaReferralV2Activity;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.json.JSONArray;

/* JADX INFO: renamed from: M8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0332a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3262b;

    public /* synthetic */ C0332a(Object obj, int i) {
        this.f3261a = i;
        this.f3262b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Sb.d dVar;
        int i = 14;
        i = 0;
        int i4 = 0;
        switch (this.f3261a) {
            case 0:
                FragmentActivity fragmentActivityRequireActivity = ((MayaKycAcceptedIdsFragment) this.f3262b).requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                Navigation.findNavController(fragmentActivityRequireActivity, R.id.maya_kyc_nav_host_fragment).popBackStack();
                return Unit.f18162a;
            case 1:
                MayaKycDeclarationsFragment mayaKycDeclarationsFragment = (MayaKycDeclarationsFragment) ((InterfaceC0287l) ((MayaKycDeclarationsFragment) this.f3262b).K1().c.get());
                mayaKycDeclarationsFragment.getClass();
                ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_declarations_fragment_to_maya_kyc_result_screens_flow);
                T2.Q(mayaKycDeclarationsFragment, ((C0436a0) mayaKycDeclarationsFragment.G1()).f4051b.c.getText().toString(), T2.l(mayaKycDeclarationsFragment, actionOnlyNavDirections).toString(), null, 12);
                ConstraintLayout constraintLayout = ((C0436a0) mayaKycDeclarationsFragment.G1()).f4050a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                return Unit.f18162a;
            case 2:
                Bb.f fVar = ((MayaKycDnfbpWhyNeededBottomSheetDialogFragment) this.f3262b).f12512U;
                if (fVar == null) {
                    kotlin.jvm.internal.j.n("mKycDnfbpWhyNeededBottomSheetDialogFragmentPresenter");
                    throw null;
                }
                MayaKycDnfbpWhyNeededBottomSheetDialogFragment mayaKycDnfbpWhyNeededBottomSheetDialogFragment = (MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) fVar.c.get());
                String string = ((N5.r) mayaKycDnfbpWhyNeededBottomSheetDialogFragment.s1()).f4191b.getText().toString();
                C1220i c1220iN1 = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.n1();
                FragmentActivity activity = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaKycDnfbpWhyNeededBottomSheetDialogFragment.p1());
                c1219hD.s((String) mayaKycDnfbpWhyNeededBottomSheetDialogFragment.t1().f18160a);
                c1219hD.n(18);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String str = (String) mayaKycDnfbpWhyNeededBottomSheetDialogFragment.t1().f18161b;
                HashMap map = c1219hD.j;
                map.put("page_name", str);
                map.put("button", string);
                map.put("path", "TOFU 1.0");
                com.paymaya.data.preference.a aVar = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.f12513V;
                if (aVar == null) {
                    kotlin.jvm.internal.j.n("mPreference");
                    throw null;
                }
                map.put("kyc_status", aVar.l());
                c1219hD.i();
                c1220iN1.c(activity, c1219hD);
                FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) fVar.c.get())).requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                Navigation.findNavController(fragmentActivityRequireActivity2, R.id.maya_kyc_nav_host_fragment).popBackStack();
                return Unit.f18162a;
            case 3:
                MayaKycEditAddressFragment mayaKycEditAddressFragment = (MayaKycEditAddressFragment) ((InterfaceC0291p) ((MayaKycEditAddressFragment) this.f3262b).K1().c.get());
                mayaKycEditAddressFragment.getClass();
                ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_edit_address_fragment_to_maya_kyc_purpose_of_account_flow);
                T2.Q(mayaKycEditAddressFragment, ((C0445d0) mayaKycEditAddressFragment.G1()).f4075b.c.getText().toString(), T2.l(mayaKycEditAddressFragment, actionOnlyNavDirections2).toString(), null, 12);
                ConstraintLayout constraintLayout2 = ((C0445d0) mayaKycEditAddressFragment.G1()).f4074a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                E1.c.m(ViewKt.findNavController(constraintLayout2), actionOnlyNavDirections2);
                return Unit.f18162a;
            case 4:
                FragmentActivity fragmentActivityRequireActivity3 = ((MayaKycErrorDialogFragment) this.f3262b).requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment.ErrorDialogActionListener");
                ((N0) fragmentActivityRequireActivity3).D0();
                return Unit.f18162a;
            case 5:
                FragmentActivity fragmentActivityRequireActivity4 = ((MayaKycExampleUpgradeBottomSheetDialogFragment) this.f3262b).requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity4, "requireActivity(...)");
                Navigation.findNavController(fragmentActivityRequireActivity4, R.id.maya_kyc_nav_host_fragment).popBackStack();
                return Unit.f18162a;
            case 6:
                KProperty[] kPropertyArr = MayaKycLivenessCaptureFragment.f12558d0;
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) this.f3262b;
                if (mayaKycLivenessCaptureFragment.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaKycLivenessCaptureFragment.requireActivity().getPackageName(), null);
                    kotlin.jvm.internal.j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaKycLivenessCaptureFragment.startActivity(intent);
                } else {
                    String[] strArr = {"android.permission.CAMERA"};
                    ActivityResultLauncher activityResultLauncher = mayaKycLivenessCaptureFragment.f12562a0;
                    if (activityResultLauncher == null) {
                        kotlin.jvm.internal.j.n("requestPermissionLauncher");
                        throw null;
                    }
                    activityResultLauncher.launch(strArr);
                }
                return Unit.f18162a;
            case 7:
                MayaKycPurposeOfAccountFragment mayaKycPurposeOfAccountFragment = (MayaKycPurposeOfAccountFragment) ((K8.A) ((MayaKycPurposeOfAccountFragment) this.f3262b).K1().c.get());
                mayaKycPurposeOfAccountFragment.getClass();
                ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_maya_kyc_purpose_of_account_fragment_to_maya_kyc_declarations_flow);
                T2.Q(mayaKycPurposeOfAccountFragment, ((C0467m0) mayaKycPurposeOfAccountFragment.G1()).f4154b.c.getText().toString(), T2.l(mayaKycPurposeOfAccountFragment, actionOnlyNavDirections3).toString(), null, 12);
                ConstraintLayout constraintLayout3 = ((C0467m0) mayaKycPurposeOfAccountFragment.G1()).f4153a;
                kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                E1.c.m(ViewKt.findNavController(constraintLayout3), actionOnlyNavDirections3);
                return Unit.f18162a;
            case 8:
                Bundle arguments = ((MayaKycSingleSelectionBottomSheetDialogFragment) this.f3262b).getArguments();
                if (arguments != null) {
                    return (KycSelectionModel) AbstractC0617a.D(arguments, "uiModel", KycSelectionModel.class);
                }
                return null;
            case 9:
                FragmentActivity fragmentActivityRequireActivity5 = ((MayaKycSubmissionPendingFragment) ((K8.I) ((MayaKycSubmissionPendingFragment) this.f3262b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity5, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity5)).i2(true);
                return Unit.f18162a;
            case 10:
                FragmentActivity fragmentActivityRequireActivity6 = ((MayaKycSubmissionSuccessFragment) ((K8.J) ((MayaKycSubmissionSuccessFragment) this.f3262b).K1().c.get())).requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity6, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity6)).i2(true);
                return Unit.f18162a;
            case 11:
                MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) this.f3262b;
                D8.P pK1 = mayaKycSubmitSecondaryIdFragment.K1();
                MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSubmitSecondaryIdFragment.f12639a0;
                if (mayaEKYCSelectedDocument != null) {
                    pK1.q(mayaEKYCSelectedDocument);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mSelectedDocument");
                throw null;
            case 12:
                D8.Q q9 = (D8.Q) ((MayaKycTakeIdPhotoFragment) this.f3262b).K1();
                Bundle arguments2 = ((MayaKycTakeIdPhotoFragment) ((K8.M) q9.c.get())).getArguments();
                MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = arguments2 != null ? (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments2, "selectedDocument", MayaEKYCSelectedDocument.class) : null;
                if (mayaEKYCSelectedDocument2 == null) {
                    ((L8.e) q9.c.get()).h1();
                } else if (!q9.f1020d.e().isCameraXEnabled()) {
                    MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment = (MayaKycTakeIdPhotoFragment) ((K8.M) q9.c.get());
                    mayaKycTakeIdPhotoFragment.getClass();
                    Bundle arguments3 = mayaKycTakeIdPhotoFragment.getArguments();
                    F2 f22 = new F2(mayaEKYCSelectedDocument2, arguments3 != null ? arguments3.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                    T2.Q(mayaKycTakeIdPhotoFragment, ((C0486w0) mayaKycTakeIdPhotoFragment.G1()).f4253b.getText().toString(), T2.l(mayaKycTakeIdPhotoFragment, f22).toString(), null, 12);
                    ConstraintLayout constraintLayout4 = ((C0486w0) mayaKycTakeIdPhotoFragment.G1()).f4252a;
                    kotlin.jvm.internal.j.f(constraintLayout4, "getRoot(...)");
                    Navigation.findNavController(constraintLayout4).navigate(f22);
                } else if (q9.f1020d.e().isShortenedFlowIdCaptureV3Enabled()) {
                    MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment2 = (MayaKycTakeIdPhotoFragment) ((K8.M) q9.c.get());
                    mayaKycTakeIdPhotoFragment2.getClass();
                    Bundle arguments4 = mayaKycTakeIdPhotoFragment2.getArguments();
                    H2 h22 = new H2(mayaEKYCSelectedDocument2, arguments4 != null ? arguments4.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                    T2.Q(mayaKycTakeIdPhotoFragment2, ((C0486w0) mayaKycTakeIdPhotoFragment2.G1()).f4253b.getText().toString(), T2.l(mayaKycTakeIdPhotoFragment2, h22).toString(), null, 12);
                    ConstraintLayout constraintLayout5 = ((C0486w0) mayaKycTakeIdPhotoFragment2.G1()).f4252a;
                    kotlin.jvm.internal.j.f(constraintLayout5, "getRoot(...)");
                    Navigation.findNavController(constraintLayout5).navigate(h22);
                } else {
                    MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment3 = (MayaKycTakeIdPhotoFragment) ((K8.M) q9.c.get());
                    mayaKycTakeIdPhotoFragment3.getClass();
                    Bundle arguments5 = mayaKycTakeIdPhotoFragment3.getArguments();
                    G2 g22 = new G2(mayaEKYCSelectedDocument2, arguments5 != null ? arguments5.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                    T2.Q(mayaKycTakeIdPhotoFragment3, ((C0486w0) mayaKycTakeIdPhotoFragment3.G1()).f4253b.getText().toString(), T2.l(mayaKycTakeIdPhotoFragment3, g22).toString(), null, 12);
                    ConstraintLayout constraintLayout6 = ((C0486w0) mayaKycTakeIdPhotoFragment3.G1()).f4252a;
                    kotlin.jvm.internal.j.f(constraintLayout6, "getRoot(...)");
                    Navigation.findNavController(constraintLayout6).navigate(g22);
                }
                return Unit.f18162a;
            case 13:
                D8.S s9 = (D8.S) ((MayaKycTakeVideoSelfieFragment) this.f3262b).K1();
                Bundle arguments6 = ((MayaKycTakeVideoSelfieFragment) ((K8.N) s9.c.get())).getArguments();
                if ((arguments6 != null ? (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments6, "selectedDocument", MayaEKYCSelectedDocument.class) : null) != null) {
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment = (MayaKycTakeVideoSelfieFragment) ((K8.N) s9.c.get());
                    Bundle arguments7 = mayaKycTakeVideoSelfieFragment.getArguments();
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument3 = arguments7 != null ? (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments7, "selectedDocument", MayaEKYCSelectedDocument.class) : null;
                    kotlin.jvm.internal.j.d(mayaEKYCSelectedDocument3);
                    L2 l22 = new L2(mayaEKYCSelectedDocument3);
                    T2.Q(mayaKycTakeVideoSelfieFragment, ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4262b.getText().toString(), T2.l(mayaKycTakeVideoSelfieFragment, l22).toString(), null, 12);
                    ConstraintLayout constraintLayout7 = ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4261a;
                    kotlin.jvm.internal.j.f(constraintLayout7, "getRoot(...)");
                    Navigation.findNavController(constraintLayout7).navigate(l22);
                } else {
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment2 = (MayaKycTakeVideoSelfieFragment) ((K8.N) s9.c.get());
                    FragmentActivity fragmentActivityRequireActivity7 = mayaKycTakeVideoSelfieFragment2.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity7, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    H8.b bVar = (H8.b) fragmentActivityRequireActivity7;
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
                    mayaKycActivity.f12446n = new C0344d(i, bVar);
                    mayaKycActivity.f12447o = new C0348e(i, bVar);
                    ConstraintLayout constraintLayout8 = ((C0488x0) mayaKycTakeVideoSelfieFragment2.G1()).f4261a;
                    kotlin.jvm.internal.j.f(constraintLayout8, "getRoot(...)");
                    Navigation.findNavController(constraintLayout8).navigate(new K2(mayaKycActivity.s().toString()));
                }
                return Unit.f18162a;
            case 14:
                Ae.a aVar2 = ((MayaKycValidationRulesBottomSheetDialogFragment) this.f3262b).f12647U;
                if (aVar2 == null) {
                    kotlin.jvm.internal.j.n("mPresenter");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity8 = ((MayaKycValidationRulesBottomSheetDialogFragment) ((K8.P) aVar2.c.get())).requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity8, "requireActivity(...)");
                Navigation.findNavController(fragmentActivityRequireActivity8, R.id.maya_kyc_nav_host_fragment).popBackStack();
                return Unit.f18162a;
            case 15:
                D8.Z z4 = (D8.Z) ((MayaKycWorkDetailsFragment) this.f3262b).N1();
                if (((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).K1()) {
                    int iOrdinal = z4.o().ordinal();
                    if (iOrdinal == 0) {
                        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) ((K8.T) z4.c.get());
                        mayaKycWorkDetailsFragment.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections4 = new ActionOnlyNavDirections(R.id.action_maya_kyc_work_details_fragment_to_maya_kyc_amlc_certification_flow);
                        String string2 = ((N5.C0) mayaKycWorkDetailsFragment.G1()).f.c.getText().toString();
                        T2.O(mayaKycWorkDetailsFragment, string2, T2.j(mayaKycWorkDetailsFragment), T2.l(mayaKycWorkDetailsFragment, actionOnlyNavDirections4).toString(), ((D8.Z) mayaKycWorkDetailsFragment.N1()).C(string2), 82);
                        ConstraintLayout constraintLayout9 = ((N5.C0) mayaKycWorkDetailsFragment.G1()).f3566a;
                        kotlin.jvm.internal.j.f(constraintLayout9, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout9), actionOnlyNavDirections4);
                    } else if (iOrdinal == 1) {
                        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment2 = (MayaKycWorkDetailsFragment) ((K8.T) z4.c.get());
                        mayaKycWorkDetailsFragment2.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections5 = new ActionOnlyNavDirections(R.id.action_maya_kyc_work_details_fragment_to_maya_kyc_ssne_requirements_flow);
                        String string3 = ((N5.C0) mayaKycWorkDetailsFragment2.G1()).f.c.getText().toString();
                        T2.O(mayaKycWorkDetailsFragment2, string3, T2.j(mayaKycWorkDetailsFragment2), T2.l(mayaKycWorkDetailsFragment2, actionOnlyNavDirections5).toString(), ((D8.Z) mayaKycWorkDetailsFragment2.N1()).C(string3), 82);
                        ConstraintLayout constraintLayout10 = ((N5.C0) mayaKycWorkDetailsFragment2.G1()).f3566a;
                        kotlin.jvm.internal.j.f(constraintLayout10, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout10), actionOnlyNavDirections5);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment3 = (MayaKycWorkDetailsFragment) ((K8.T) z4.c.get());
                        mayaKycWorkDetailsFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections6 = new ActionOnlyNavDirections(R.id.action_maya_kyc_work_details_fragment_to_maya_kyc_complete_personal_information_fragment);
                        String string4 = ((N5.C0) mayaKycWorkDetailsFragment3.G1()).f.c.getText().toString();
                        T2.O(mayaKycWorkDetailsFragment3, string4, T2.j(mayaKycWorkDetailsFragment3), T2.l(mayaKycWorkDetailsFragment3, actionOnlyNavDirections6).toString(), ((D8.Z) mayaKycWorkDetailsFragment3.N1()).C(string4), 82);
                        ConstraintLayout constraintLayout11 = ((N5.C0) mayaKycWorkDetailsFragment3.G1()).f3566a;
                        kotlin.jvm.internal.j.f(constraintLayout11, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout11), actionOnlyNavDirections6);
                    }
                } else {
                    z4.l();
                }
                return Unit.f18162a;
            case 16:
                N.k this$0 = (N.k) this.f3262b;
                kotlin.jvm.internal.j.g(this$0, "this$0");
                HashMap mapX = x3.d.x(this$0.f3477g.d());
                kotlin.jvm.internal.j.d(mapX);
                JSONArray jSONArrayB = this$0.i.b(cj.r.c(new R.d("App Launched", mapX, null, null, 20)));
                if (jSONArrayB.length() > 0) {
                    this$0.b(jSONArrayB);
                }
                return Unit.f18162a;
            case 17:
                MayaCreditIneligibleActivity mayaCreditIneligibleActivity = (MayaCreditIneligibleActivity) this.f3262b;
                int i6 = MayaCreditIneligibleActivity.f13068r;
                Ae.a aVar3 = mayaCreditIneligibleActivity.f13071p;
                if (aVar3 == null) {
                    kotlin.jvm.internal.j.n("mMayaCreditIneligibleActivityPresenter");
                    throw null;
                }
                if (mayaCreditIneligibleActivity.f13070o) {
                    MayaCreditIneligibleActivity mayaCreditIneligibleActivity2 = (MayaCreditIneligibleActivity) ((M9.a) aVar3.c.get());
                    mayaCreditIneligibleActivity2.getClass();
                    com.paymaya.common.utility.E.a("MayaCreditIneligibleActivity", "navigateToCreditDashboard");
                    mayaCreditIneligibleActivity2.n1();
                    B5.i.k(mayaCreditIneligibleActivity2, "paymaya://mayacredit");
                } else {
                    ((M9.a) aVar3.c.get()).finish();
                }
                return Unit.f18162a;
            case 18:
                Na.e eVar = ((MayaMLKitQRScannerFragment) this.f3262b).f13591j0;
                if (eVar != null) {
                    MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                    mayaQRActivity.n1().s(mayaQRActivity, false);
                }
                return Unit.f18162a;
            case 19:
                ArrayList arrayList = (ArrayList) this.f3262b;
                if (arrayList.isEmpty()) {
                    return C1112C.f9377a;
                }
                if (((CharSequence) C1110A.A(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i4 = 1;
                }
                return arrayList.subList(i4, ((CharSequence) C1110A.G(arrayList)).length() == 0 ? C1132s.f(arrayList) : C1132s.f(arrayList) + 1);
            case 20:
                return ExpandableBenefitsRecyclerView.b((ExpandableBenefitsRecyclerView) this.f3262b);
            case 21:
                O.d templateContext = (O.d) this.f3262b;
                kotlin.jvm.internal.j.g(templateContext, "$templateContext");
                templateContext.b();
                templateContext.a();
                return Unit.f18162a;
            case 22:
                A7.j jVar = (A7.j) this.f3262b;
                String stringExtra = ((MayaPostLoginActivity) ((S6.e) jVar.c.get())).getIntent().getStringExtra("entry_point");
                if (kotlin.jvm.internal.j.b(stringExtra, "registration_kyc")) {
                    MayaPostLoginActivity mayaPostLoginActivity = (MayaPostLoginActivity) ((S6.e) jVar.c.get());
                    B5.i iVarN1 = mayaPostLoginActivity.n1();
                    Intent intent2 = new Intent(mayaPostLoginActivity, (Class<?>) MayaDashboardActivity.class);
                    Intent intentO0 = iVarN1.o0(mayaPostLoginActivity);
                    intentO0.putExtra("INTENT_EXTRA_FROM_OTP_REGISTRATION", true);
                    B5.i.v0(mayaPostLoginActivity, intentO0);
                    TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(mayaPostLoginActivity);
                    taskStackBuilderCreate.addNextIntent(intent2);
                    taskStackBuilderCreate.addNextIntent(intentO0);
                    taskStackBuilderCreate.startActivities();
                    mayaPostLoginActivity.finishAffinity();
                } else if (kotlin.jvm.internal.j.b(stringExtra, "registration-ekyc")) {
                    MayaPostLoginActivity mayaPostLoginActivity2 = (MayaPostLoginActivity) ((S6.e) jVar.c.get());
                    B5.i iVarN12 = mayaPostLoginActivity2.n1();
                    Intent intent3 = new Intent(mayaPostLoginActivity2, (Class<?>) MayaDashboardActivity.class);
                    Intent intentO02 = iVarN12.o0(mayaPostLoginActivity2);
                    B5.i.v0(mayaPostLoginActivity2, intentO02);
                    TaskStackBuilder taskStackBuilderCreate2 = TaskStackBuilder.create(mayaPostLoginActivity2);
                    taskStackBuilderCreate2.addNextIntent(intent3);
                    taskStackBuilderCreate2.addNextIntent(intentO02);
                    taskStackBuilderCreate2.startActivities();
                    mayaPostLoginActivity2.finishAffinity();
                } else if (((MayaPostLoginActivity) ((S6.e) jVar.c.get())).getIntent().getBooleanExtra("is_session_timeout", false)) {
                    ((S6.e) jVar.c.get()).finish();
                } else {
                    MayaPostLoginActivity mayaPostLoginActivity3 = (MayaPostLoginActivity) ((S6.e) jVar.c.get());
                    mayaPostLoginActivity3.n1().q(mayaPostLoginActivity3);
                }
                return Unit.f18162a;
            case 23:
                MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment = (MayaCreditConfirmTransferFragment) this.f3262b;
                C1220i c1220iO1 = mayaCreditConfirmTransferFragment.o1();
                FragmentActivity activity2 = mayaCreditConfirmTransferFragment.getActivity();
                C1219h c1219hD2 = C1219h.d(mayaCreditConfirmTransferFragment.u1());
                c1219hD2.r(EnumC1216e.TRANSFER);
                c1219hD2.n(17);
                AbstractC1414e.n(c1219hD2, EnumC1217f.CONFIRM, c1220iO1, activity2, c1219hD2);
                ((C0325c) mayaCreditConfirmTransferFragment.G1()).k();
                return Unit.f18162a;
            case 24:
                MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) this.f3262b;
                C1220i c1220iO12 = mayaCreditTransferFragment.o1();
                FragmentActivity activity3 = mayaCreditTransferFragment.getActivity();
                C1219h c1219hD3 = C1219h.d(mayaCreditTransferFragment.u1());
                c1219hD3.r(EnumC1216e.TRANSFER_CREDIT);
                c1219hD3.n(17);
                c1219hD3.t(EnumC1217f.CONTINUE);
                c1219hD3.j();
                c1220iO12.c(activity3, c1219hD3);
                C0256f c0256f = mayaCreditTransferFragment.t0;
                if (c0256f != null) {
                    c0256f.a();
                }
                L9.l lVarP1 = mayaCreditTransferFragment.P1();
                if (lVarP1.f2898k && lVarP1.f2899l && lVarP1.m) {
                    boolean zB = S5.c.b(lVarP1.i, A5.b.f78T);
                    ((MayaBaseFragment) ((P9.d) lVarP1.c.get())).E1();
                    if (zB) {
                        lVarP1.k();
                    } else {
                        lVarP1.l();
                    }
                } else {
                    lVarP1.n();
                }
                return Unit.f18162a;
            case 25:
                C0327e c0327e = ((MayaCreditWebContentBottomSheetDialogFragment) this.f3262b).f13134Z;
                if (c0327e == null) {
                    kotlin.jvm.internal.j.n("mMayaCreditWebContentBottomSheetDialogFragmentPresenter");
                    throw null;
                }
                MayaCreditWebContentBottomSheetDialogFragment mayaCreditWebContentBottomSheetDialogFragment = (MayaCreditWebContentBottomSheetDialogFragment) ((P9.e) c0327e.c.get());
                Function1 function1 = mayaCreditWebContentBottomSheetDialogFragment.f13133Y;
                if (function1 != null) {
                    Button button = mayaCreditWebContentBottomSheetDialogFragment.f13130V;
                    if (button == null) {
                        kotlin.jvm.internal.j.n("mDoneButton");
                        throw null;
                    }
                    function1.invoke(button);
                }
                mayaCreditWebContentBottomSheetDialogFragment.dismiss();
                return Unit.f18162a;
            case 26:
                Rj.e eVar2 = (Rj.e) this.f3262b;
                return Integer.valueOf(Tj.m.c(eVar2, eVar2.f5565k));
            case 27:
                C0323a c0323aH1 = ((BaseMayaSettingsFragment) this.f3262b).H1();
                if (((com.paymaya.data.preference.a) c0323aH1.i).e().isInboxV4Enabled() && (dVar = ((BaseMayaSettingsFragment) ((Rb.j) c0323aH1.c.get())).f13906v0) != null) {
                    MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar;
                    FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
                    kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
                    FlutterEngine flutterEngine = flutterEngineCache.get("inboxActivity");
                    if (flutterEngine == null) {
                        flutterEngine = new FlutterEngine(mayaSettingsActivity);
                        flutterEngineCache.put("inboxActivity", flutterEngine);
                    }
                    mayaSettingsActivity.f13843q = new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_inbox_notification");
                    Map mapH = cj.M.h(new Pair("route", "manageNotifications"), new Pair("messageTimestamp", "0"));
                    pg.u uVar = mayaSettingsActivity.f13843q;
                    if (uVar == null) {
                        kotlin.jvm.internal.j.n("flutterActivityEngineMethodChannel");
                        throw null;
                    }
                    uVar.a("requestFullscreen", mapH, null);
                    mayaSettingsActivity.n1();
                    Intent intentBuild = FlutterActivity.withCachedEngine("inboxActivity").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(mayaSettingsActivity);
                    intentBuild.putExtra("engineId", "inboxActivity");
                    mayaSettingsActivity.startActivityForResult(intentBuild, 1200);
                    mayaSettingsActivity.overridePendingTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left);
                }
                return Unit.f18162a;
            case 28:
                MayaChangeMinFormFragment mayaChangeMinFormFragment = (MayaChangeMinFormFragment) this.f3262b;
                String string5 = mayaChangeMinFormFragment.getString(R.string.maya_format_missing_field_is_required, mayaChangeMinFormFragment.getString(R.string.maya_label_mobile_number));
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                mayaChangeMinFormFragment.J1(string5);
                mayaChangeMinFormFragment.I1(false);
                return Unit.f18162a;
            default:
                int i10 = MayaReferralV2Activity.f13660p;
                return (MayaReferralV2Activity) this.f3262b;
        }
    }
}
