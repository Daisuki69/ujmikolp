package Ag;

import Bj.o0;
import D8.I;
import D8.J;
import K8.C;
import K8.y;
import M8.C0419w;
import M8.M1;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycUpdateOtherIdsActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestDeniedFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestExpiredBottomSheetDialogFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalViewRequestFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q0.InterfaceC2159b;
import u5.AbstractC2302a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f295b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(L8.c cVar) {
        this.f294a = 26;
        this.f295b = (Fragment) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v109, types: [L8.c, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        String string;
        switch (this.f294a) {
            case 0:
                return ((Og.e) ((Og.f) this.f295b)).e();
            case 1:
                ((B5.c) this.f295b).a();
                return Unit.f18162a;
            case 2:
                return Double.valueOf(S5.c.c(((B5.l) this.f295b).f374b, A5.c.c));
            case 3:
                return Long.valueOf((long) S5.c.c(((B5.m) this.f295b).e, A5.c.f153d));
            case 4:
                ((o0) this.f295b).h0();
                return Unit.f18162a;
            case 5:
                return ((Eg.d) this.f295b).a();
            case 6:
                MayaCardsFragment mayaCardsFragment = (MayaCardsFragment) this.f295b;
                C1220i c1220i = mayaCardsFragment.f10245B;
                FragmentActivity activity = mayaCardsFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.MY_CARDS);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.GET_IT_HERE);
                c1220i.c(activity, c1219hD);
                return Unit.f18162a;
            case 7:
                int i = MayaDashboardActivity.f12133U;
                ((MayaDashboardActivity) this.f295b).Y1().l("paymaya://mycards");
                return Unit.f18162a;
            case 8:
                MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment = (MayaKycMinorTakeAPhotoFragment) ((y) ((I) this.f295b).c.get());
                E8.r rVar = (E8.r) mayaKycMinorTakeAPhotoFragment.f12571a0.getValue();
                C0419w c0419w = new C0419w(1, mayaKycMinorTakeAPhotoFragment.L1(), I.class, "onPictureTaken", "onPictureTaken([B)V", 0, 27);
                Camera camera = rVar.c;
                if (camera != null) {
                    camera.takePicture(null, null, new E8.q(c0419w));
                }
                return Unit.f18162a;
            case 9:
                MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((C) ((J) this.f295b).c.get());
                E8.r rVar2 = (E8.r) mayaKycSimpleCaptureFragment.f12588Y.getValue();
                M1 m12 = new M1(1, mayaKycSimpleCaptureFragment.L1(), J.class, "onPictureTaken", "onPictureTaken([B)V", 0, 0);
                Camera camera2 = rVar2.c;
                if (camera2 != null) {
                    camera2.takePicture(null, null, new E8.q(m12));
                }
                return Unit.f18162a;
            case 10:
                E8.r rVar3 = (E8.r) this.f295b;
                Camera camera3 = rVar3.c;
                if (camera3 != null) {
                    camera3.stopPreview();
                    camera3.release();
                    rVar3.c = null;
                }
                return Unit.f18162a;
            case 11:
                ((KycMayaDropDown) this.f295b).b();
                return Unit.f18162a;
            case 12:
                KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) this.f295b;
                kycMayaInputLayout.f12696l = false;
                kycMayaInputLayout.d();
                return Unit.f18162a;
            case 13:
                Bundle arguments = ((MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) this.f295b).getArguments();
                obj = arguments != null ? arguments.get("challengeId") : null;
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.String");
                return (String) obj;
            case 14:
                Bundle arguments2 = ((MayaPushApprovalRequestDeniedFragment) this.f295b).getArguments();
                obj = arguments2 != null ? arguments2.get("pushApprovalPendingRequest") : null;
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.PushApprovalPendingRequest");
                return (PushApprovalPendingRequest) obj;
            case 15:
                Bundle arguments3 = ((MayaPushApprovalRequestExpiredBottomSheetDialogFragment) this.f295b).getArguments();
                obj = arguments3 != null ? arguments3.get("challengeId") : null;
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.String");
                return (String) obj;
            case 16:
                Bundle arguments4 = ((MayaPushApprovalViewRequestFragment) this.f295b).getArguments();
                obj = arguments4 != null ? arguments4.get("pushApprovalPendingRequest") : null;
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.PushApprovalPendingRequest");
                return (PushApprovalPendingRequest) obj;
            case 17:
                G.d this$0 = (G.d) this.f295b;
                kotlin.jvm.internal.j.g(this$0, "this$0");
                InterfaceC2159b interfaceC2159b = this$0.f1686a;
                interfaceC2159b.b();
                return Float.valueOf(interfaceC2159b.e());
            case 18:
                Context contextRequireContext = ((MayaWalletFragment) this.f295b).requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                return contextRequireContext;
            case 19:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) this.f295b;
                TextView textView = mayaVoucherDetailsFragment.I0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewVoucherCode");
                    throw null;
                }
                String string2 = textView.getText().toString();
                Object systemService = mayaVoucherDetailsFragment.requireActivity().getSystemService("clipboard");
                kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                String string3 = mayaVoucherDetailsFragment.getString(R.string.maya_label_voucher_promo_code);
                if (string2 != null) {
                    int length = string2.length() - 1;
                    int i4 = 0;
                    boolean z4 = false;
                    while (i4 <= length) {
                        boolean z5 = kotlin.jvm.internal.j.i(string2.charAt(!z4 ? i4 : length), 32) <= 0;
                        if (z4) {
                            if (z5) {
                                length--;
                            } else {
                                string = string2.subSequence(i4, length + 1).toString();
                            }
                        } else if (z5) {
                            i4++;
                        } else {
                            z4 = true;
                        }
                    }
                    string = string2.subSequence(i4, length + 1).toString();
                } else {
                    string = null;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(string3, string));
                FragmentActivity activity2 = mayaVoucherDetailsFragment.getActivity();
                ConstraintLayout constraintLayout = mayaVoucherDetailsFragment.f14300p0;
                if (constraintLayout != null) {
                    b0.e(activity2, constraintLayout, null, R.string.maya_label_voucher_code_copied, R.drawable.maya_bg_snackbar_with_border_success, R.style.JekoBoldSmallText_Snackbar_Success, 0, mayaVoucherDetailsFragment.f10339S, 340);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mLayoutContainer");
                throw null;
            case 20:
                return (io.ktor.utils.io.n) this.f295b;
            case 21:
                return Float.valueOf(((InvestPreviewFragment) this.f295b).getResources().getDimension(R.dimen.pma_margin_small));
            case 22:
                MayaKycUpdateOtherIdsActivity mayaKycUpdateOtherIdsActivity = (MayaKycUpdateOtherIdsActivity) this.f295b;
                int i6 = MayaKycUpdateOtherIdsActivity.f12458p;
                Ae.a aVar = mayaKycUpdateOtherIdsActivity.m;
                if (aVar != null) {
                    ((MayaKycUpdateOtherIdsActivity) ((H8.c) aVar.c.get())).finish();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mMayaKycUpdateOtherIdsActivityPresenter");
                throw null;
            case 23:
                ((Ja.b) this.f295b).f = false;
                return Unit.f18162a;
            case 24:
                MayaKycBaseFragment mayaKycBaseFragment = (MayaKycBaseFragment) this.f295b;
                C1219h c1219hH = ((MayaKycActivity) mayaKycBaseFragment.Q()).H();
                if (mayaKycBaseFragment.D()) {
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put("path", "TOFU 1.0");
                }
                return c1219hH;
            case 25:
                L8.c cVar = (L8.c) this.f295b;
                C1219h c1219hH2 = ((MayaKycActivity) cVar.Q()).H();
                if (cVar.D()) {
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put("path", "TOFU 1.0");
                }
                return c1219hH2;
            case 26:
                ?? r1 = (Fragment) this.f295b;
                C1219h c1219hH3 = ((MayaKycActivity) r1.Q()).H();
                if (r1.D()) {
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH3.j.put("path", "TOFU 1.0");
                }
                return c1219hH3;
            case 27:
                G6.k kVar = (G6.k) this.f295b;
                String string4 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_terms_and_conditions);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                Pair pair = new Pair("termsAndConditions", string4);
                String string5 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_truth_and_transparency);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                Pair pair2 = new Pair("truthAndTransparency", string5);
                String string6 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_our_disclosure_statement);
                kotlin.jvm.internal.j.f(string6, "getString(...)");
                return M.h(pair, pair2, new Pair("disclosureStatement", string6));
            case 28:
                Ld.a aVar2 = (Ld.a) this.f295b;
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) ((Md.a) aVar2.c.get());
                deepLinkActivity.getClass();
                boolean z8 = AbstractC2302a.f20265a;
                AbstractC2302a.b(deepLinkActivity.getApplicationContext());
                aVar2.m();
                aVar2.k();
                return Unit.f18162a;
            default:
                L9.I i10 = (L9.I) this.f295b;
                Md.b bVar = (Md.b) i10.c.get();
                if (bVar != null) {
                    boolean z9 = AbstractC2302a.f20265a;
                    AbstractC2302a.b(((LauncherActivity) bVar).getApplicationContext());
                }
                i10.p();
                if (i10.f2875d.F() && !i10.f) {
                    i10.f = true;
                    ((K) i10.i).c(null, "base-app", "app-launch", null);
                }
                return Unit.f18162a;
        }
    }

    public /* synthetic */ k(Object obj, int i) {
        this.f294a = i;
        this.f295b = obj;
    }
}
