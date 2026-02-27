package G6;

import D8.C0214w;
import G5.InterfaceC0254d;
import L6.G;
import L9.C0323a;
import L9.C0331i;
import L9.I;
import P5.V;
import P5.Y;
import Q9.B;
import Q9.InterfaceC0578h;
import We.InterfaceC0604h;
import android.app.Dialog;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cg.InterfaceC1101b;
import cj.C1112C;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.k0;
import com.paymaya.data.api.KycTencentApi;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditInitialEligibility;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantDetails;
import com.paymaya.domain.model.Restriction;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.model.TencentCompleteRequest;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUpdateNameFlutterScreen;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import o1.AbstractC1955a;
import org.json.JSONException;
import v.AbstractC2329d;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Ch.c, InterfaceC0604h, InterfaceC0254d, InterfaceC1101b, HuiYanOsAuthCallBack, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1820b;

    public /* synthetic */ v() {
        this.f1819a = 24;
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        Bb.n nVar = (Bb.n) ((MayaSendMoneyFragment) this.f1820b).P1();
        MayaInputLayout mayaInputLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13784J0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.g();
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
        MayaInputLayout mayaInputLayout2 = mayaSendMoneyFragment.f13784J0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout2.setHelperErrorText(mayaSendMoneyFragment.getString(R.string.maya_format_error_insufficient_funds, C.u(Double.valueOf(mayaSendMoneyFragment.f13804f1))));
        MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
        MayaInputLayout mayaInputLayout3 = mayaSendMoneyFragment2.f13784J0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.p();
        MayaInputLayout mayaInputLayout4 = mayaSendMoneyFragment2.f13784J0;
        if (mayaInputLayout4 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout4.r();
        nVar.z();
    }

    @Override // Ch.c
    public void accept(Object obj) throws JSONException {
        QRPHMerchantDetails merchant;
        String currency;
        int i = 11;
        int i4 = 0;
        switch (this.f1819a) {
            case 0:
                Bb.f fVar = (Bb.f) this.f1820b;
                PayMayaError payMayaErrorF = fVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                y5.s sVar = (K6.o) fVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CONFIRMATION);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (!payMayaErrorF.isSessionTimeout()) {
                    MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment = (MayaWesternUnionConfirmationFragment) ((K6.o) fVar.c.get());
                    mayaWesternUnionConfirmationFragment.getClass();
                    G g8 = mayaWesternUnionConfirmationFragment.f11774b0;
                    if (g8 != null) {
                        ((MayaCashInActivity) g8).a(payMayaErrorF, mayaWesternUnionConfirmationFragment.getString(R.string.pma_toast_error_title_western_union_error));
                    }
                }
                break;
            case 1:
                List restrictions = (List) obj;
                kotlin.jvm.internal.j.g(restrictions, "restrictions");
                ((MayaUpdateNameFlutterScreen) this.f1820b).g1().p0(restrictions.isEmpty() ? "" : ((Restriction) restrictions.get(0)).getReason());
                break;
            case 2:
            case 3:
            case 6:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            default:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((Bb.f) this.f1820b).e(it);
                break;
            case 4:
                MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
                Ja.b bVar = (Ja.b) this.f1820b;
                if (bVar.f2498d.e().isQREventsV2Enabled()) {
                    String type = merchantPaymentV2 != null ? merchantPaymentV2.getType() : null;
                    if (type == null) {
                        type = "";
                    }
                    String name = (merchantPaymentV2 == null || (merchant = merchantPaymentV2.getMerchant()) == null) ? null : merchant.getName();
                    bVar.w("Dynamic", type, name != null ? name : "");
                } else {
                    y5.s sVar2 = (Ma.a) bVar.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(14);
                    c1219hH2.t(EnumC1217f.CREATE);
                    c1219hH2.i();
                    ((MayaBaseFragment) sVar2).A1(c1219hH2);
                }
                if (merchantPaymentV2 != null) {
                    Ma.a aVar = (Ma.a) bVar.c.get();
                    String merchantPaymentId = merchantPaymentV2.getId();
                    MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) aVar;
                    mayaMLKitQRScannerFragment.getClass();
                    kotlin.jvm.internal.j.g(merchantPaymentId, "merchantPaymentId");
                    Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                    if (eVar != null) {
                        ((MayaQRActivity) eVar).f13572p = merchantPaymentId;
                    }
                    Ma.a aVar2 = (Ma.a) bVar.c.get();
                    String paymentId = merchantPaymentV2.getPaymentDetails().getPaymentId();
                    MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) aVar2;
                    mayaMLKitQRScannerFragment2.getClass();
                    kotlin.jvm.internal.j.g(paymentId, "paymentId");
                    Na.e eVar2 = mayaMLKitQRScannerFragment2.f13591j0;
                    if (eVar2 != null) {
                        ((MayaQRActivity) eVar2).Z1(paymentId);
                    }
                }
                break;
            case 5:
                A7.j jVar = (A7.j) this.f1820b;
                PayMayaError payMayaErrorF2 = jVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                jVar.d0(payMayaErrorF2);
                break;
            case 7:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                C0323a c0323a = (C0323a) this.f1820b;
                PayMayaError payMayaErrorF3 = c0323a.f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                c0323a.z(payMayaErrorF3);
                c0323a.s(payMayaErrorF3, it2);
                break;
            case 8:
                CreditInitialEligibility p02 = (CreditInitialEligibility) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                A7.j jVar2 = (A7.j) this.f1820b;
                jVar2.getClass();
                CreditTerm term = p02.getTerm();
                if (term != null) {
                    M9.b bVar2 = (M9.b) jVar2.c.get();
                    String riskLevel = p02.getRiskLevel();
                    Boolean boolIsCreditScoringDataValid = p02.isCreditScoringDataValid();
                    MayaCreditInterstitialActivity mayaCreditInterstitialActivity = (MayaCreditInterstitialActivity) bVar2;
                    mayaCreditInterstitialActivity.getClass();
                    E.a("MayaCreditInterstitialActivity", "showMayaCreditActivation");
                    mayaCreditInterstitialActivity.n1();
                    Intent intent = new Intent(mayaCreditInterstitialActivity, (Class<?>) NewMayaCreditActivity.class);
                    intent.putExtra("credit", term);
                    intent.putExtra("risk_level", riskLevel);
                    intent.putExtra("is_credit_scoring_data_valid", boolIsCreditScoringDataValid);
                    mayaCreditInterstitialActivity.startActivity(intent);
                    mayaCreditInterstitialActivity.finish();
                }
                ((MayaCreditInterstitialActivity) ((M9.b) jVar2.c.get())).W1();
                break;
            case 9:
                kotlin.jvm.internal.j.g((CreditTransaction) obj, "it");
                ((MayaCreditTransactionListFragment) ((P9.c) ((C0331i) this.f1820b).c.get())).Q1(false);
                break;
            case 10:
                Ze.a it3 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                if (!it3.f6934b) {
                    P9.d dVar = (P9.d) ((L9.l) this.f1820b).c.get();
                    String strA = C.a(6, AbstractC1213b.z(3));
                    kotlin.jvm.internal.j.f(strA, "denied(...)");
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    ((MayaCreditTransferFragment) dVar).Q1(strA, M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", "Deny")));
                    L9.l lVar = (L9.l) this.f1820b;
                    if (!lVar.f2901o) {
                        lVar.l();
                    } else {
                        MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) ((P9.d) lVar.c.get());
                        InterfaceC0578h interfaceC0578h = mayaCreditTransferFragment.f13125v0;
                        if (interfaceC0578h != null) {
                            String strA2 = C.a(11, AbstractC1213b.z(3));
                            kotlin.jvm.internal.j.f(strA2, "error(...)");
                            String strB = C.b(AbstractC1213b.z(3), EnumC1217f.DEV_SETTINGS, 16);
                            kotlin.jvm.internal.j.f(strB, "devSettingsOpened(...)");
                            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0578h;
                            E.a("NewMayaCreditActivity", "showTurnOnLocationPermission");
                            newMayaCreditActivity.Y1(strA2, M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", "Deny"), new Pair("error_message", newMayaCreditActivity.getString(R.string.maya_label_turn_on_location_permissions))));
                            MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, newMayaCreditActivity.getString(R.string.maya_label_turn_on_location_permissions), newMayaCreditActivity.getString(R.string.maya_label_turn_on_location_permissions_description), newMayaCreditActivity.getString(R.string.maya_label_go_to_settings), newMayaCreditActivity.getString(R.string.maya_label_close), false, null, null, false, 480);
                            mayaErrorDialogFragmentZ.f11852e0 = new N9.g(mayaErrorDialogFragmentZ, newMayaCreditActivity, strB, i4);
                            mayaErrorDialogFragmentZ.f11850c0 = mayaCreditTransferFragment;
                            mayaErrorDialogFragmentZ.show(newMayaCreditActivity.getSupportFragmentManager(), "error_dialog");
                        }
                    }
                } else {
                    P9.d dVar2 = (P9.d) ((L9.l) this.f1820b).c.get();
                    String strA3 = C.a(1, AbstractC1213b.z(3));
                    kotlin.jvm.internal.j.f(strA3, "allowed(...)");
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    ((MayaCreditTransferFragment) dVar2).Q1(strA3, M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", RtspHeaders.ALLOW)));
                    ((L9.l) this.f1820b).k();
                }
                break;
            case 11:
                kotlin.jvm.internal.j.g((ContactReferencePatchResponse) obj, "it");
                ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) ((L9.q) this.f1820b).c.get())).requireActivity().onBackPressed();
                break;
            case 12:
                OTP p03 = (OTP) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                L9.s sVar3 = (L9.s) this.f1820b;
                sVar3.getClass();
                ((MayaBaseFragment) ((P9.j) sVar3.c.get())).w1();
                P9.j jVar3 = (P9.j) sVar3.c.get();
                String strMOtpId = p03.mOtpId();
                kotlin.jvm.internal.j.f(strMOtpId, "mOtpId(...)");
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) jVar3;
                newMayaCreditEnhancedActivationFragment.getClass();
                B b8 = newMayaCreditEnhancedActivationFragment.f13196B0;
                if (b8 != null) {
                    ((NewMayaCreditActivity) b8).g2(strMOtpId);
                }
                break;
            case 13:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                k kVar = (k) this.f1820b;
                PayMayaError payMayaErrorF4 = kVar.f(it4, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                kVar.y(payMayaErrorF4);
                kVar.s(payMayaErrorF4, it4);
                break;
            case 14:
                CreditEligibility it5 = (CreditEligibility) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                CreditTerm term2 = it5.getTerm();
                I i6 = (I) this.f1820b;
                CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) i6.i;
                if (creditReviewUiModel != null) {
                    creditReviewUiModel.f13055a = We.s.i((term2 == null || (currency = term2.getCurrency()) == null) ? null : z.t(currency, "PHP", "₱"), new DecimalFormat("#,###", new DecimalFormatSymbols(Locale.ENGLISH)).format(term2 != null ? Double.valueOf(term2.getLoanAmount()) : null));
                }
                CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) i6.i;
                if (creditReviewUiModel2 != null) {
                    creditReviewUiModel2.m = term2;
                }
                break;
            case 15:
                Lb.a aVar3 = (Lb.a) this.f1820b;
                PayMayaError payMayaErrorF5 = aVar3.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                y5.s sVar4 = (Rb.a) aVar3.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                c1219hH3.i();
                ((MayaBaseFragment) sVar4).A1(c1219hH3);
                ((MayaBaseFragment) ((Rb.a) aVar3.c.get())).w1();
                if (!payMayaErrorF5.isSessionTimeout()) {
                    int iMErrorCode = payMayaErrorF5.mErrorCode();
                    if (iMErrorCode == -20) {
                        new Hh.a(new Hh.f(((S0) aVar3.h).b(), zh.b.a(), 0), new A7.r(i, aVar3, payMayaErrorF5), 1).c();
                    } else if (iMErrorCode != -12) {
                        MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = (MayaAccountRecoveryEmailFragment) ((Rb.a) aVar3.c.get());
                        Sb.e eVar3 = mayaAccountRecoveryEmailFragment.f13914a0;
                        if (eVar3 != null) {
                            ((MayaSettingsActivity) eVar3).b2(payMayaErrorF5, mayaAccountRecoveryEmailFragment.getString(R.string.maya_label_thats_not_it));
                        }
                    } else {
                        MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment2 = (MayaAccountRecoveryEmailFragment) ((Rb.a) aVar3.c.get());
                        Sb.e eVar4 = mayaAccountRecoveryEmailFragment2.f13914a0;
                        if (eVar4 != null) {
                            MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231347, mayaAccountRecoveryEmailFragment2.getString(R.string.maya_label_thats_not_it), payMayaErrorF5.mSpiel(), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                            mayaErrorDialogFragmentZ2.f11850c0 = mayaAccountRecoveryEmailFragment2;
                            mayaErrorDialogFragmentZ2.show(((MayaSettingsActivity) eVar4).getSupportFragmentManager(), "error_dialog");
                        }
                    }
                }
                break;
            case 16:
                OTP otp = (OTP) obj;
                kotlin.jvm.internal.j.g(otp, "otp");
                C0214w c0214w = (C0214w) this.f1820b;
                ((MayaBaseFragment) ((Rb.d) c0214w.c.get())).w1();
                Rb.d dVar3 = (Rb.d) c0214w.c.get();
                String strMOtpId2 = otp.mOtpId();
                kotlin.jvm.internal.j.f(strMOtpId2, "mOtpId(...)");
                String strR = ((com.paymaya.data.preference.a) c0214w.e).r();
                MayaChangeMinFragment mayaChangeMinFragment = (MayaChangeMinFragment) dVar3;
                mayaChangeMinFragment.getClass();
                Sb.l lVar2 = mayaChangeMinFragment.f13943a0;
                if (lVar2 != null) {
                    MayaChangeMinOTPFragment mayaChangeMinOTPFragment = new MayaChangeMinOTPFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("otp_id", strMOtpId2, "mobile_number", strR);
                    bundleE.putBoolean("is_new_mobile", false);
                    mayaChangeMinOTPFragment.setArguments(bundleE);
                    AbstractC1236z.h((MayaSettingsActivity) lVar2, R.id.frame_layout_container, mayaChangeMinOTPFragment);
                }
                break;
            case 17:
                kotlin.jvm.internal.j.g((Success) obj, "it");
                Lb.e eVar5 = (Lb.e) this.f1820b;
                ((MayaBaseFragment) ((Rb.f) eVar5.c.get())).A1(AbstractC2329d.h(14));
                ((MayaBaseFragment) ((Rb.f) eVar5.c.get())).w1();
                if (eVar5.e.D()) {
                    eVar5.e.i0(eVar5.f2949g);
                }
                MayaChangePasswordFragment mayaChangePasswordFragment = (MayaChangePasswordFragment) ((Rb.f) eVar5.c.get());
                Sb.o oVar = mayaChangePasswordFragment.f13953b0;
                if (oVar != null) {
                    String string = mayaChangePasswordFragment.getString(R.string.maya_change_password_success_dialog_title);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String string2 = mayaChangePasswordFragment.getString(R.string.maya_change_password_success_dialog_message);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    oVar.i0(string, string2);
                    oVar.z0();
                }
                break;
            case 18:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                A7.j jVar4 = (A7.j) this.f1820b;
                PayMayaError payMayaErrorF6 = jVar4.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                jVar4.b0(payMayaErrorF6);
                break;
            case 19:
                C0323a c0323a2 = (C0323a) this.f1820b;
                PayMayaError payMayaErrorF7 = c0323a2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                c0323a2.y(payMayaErrorF7);
                break;
            case 20:
                io.reactivex.rxjava3.disposables.b it6 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                ((C0214w) this.f1820b).e(it6);
                break;
            case 23:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, "<destruct>");
                Boolean bool = (Boolean) pair.f18160a;
                bool.getClass();
                Address address = (Address) pair.f18161b;
                Ag.j jVar5 = (Ag.j) this.f1820b;
                if (jVar5 != null) {
                    jVar5.invoke(bool, address);
                }
                break;
            case 27:
                Throwable e = (Throwable) obj;
                kotlin.jvm.internal.j.g(e, "e");
                Pc.d dVar4 = (Pc.d) this.f1820b;
                PayMayaError payMayaErrorF8 = dVar4.f(e, false);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "paymayaErrorHandling(...)");
                payMayaErrorF8.toString();
                yk.a.a();
                ((ShareSaveDialogFragment) ((Tc.c) dVar4.c.get())).r1(C1112C.f9377a);
                Dialog dialog = ((ShareSaveDialogFragment) ((Tc.c) dVar4.c.get())).getDialog();
                if (dialog != null) {
                    dialog.show();
                }
                break;
            case 28:
                io.reactivex.rxjava3.disposables.b it7 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it7, "it");
                ((Q6.i) this.f1820b).e(it7);
                break;
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f1819a) {
            case 6:
                C2.e eVar = (C2.e) ((com.google.firebase.messaging.r) this.f1820b).c;
                AbstractC1955a.d(eVar);
                return eVar;
            case 25:
                ((v) this.f1820b).getClass();
                return new Uh.d();
            default:
                ((Y) this.f1820b).getClass();
                return new V(0);
        }
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaMLKitQRScannerFragment) this.f1820b).L1();
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        Group group = ((MayaMissionsDetailsFragment) this.f1820b).f12973a0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mConstraintGroupPartnerLogo");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onFail(int i, String str, String str2) {
        D8.G gL1 = ((MayaKycLivenessCaptureFragment) this.f1820b).L1();
        if (gL1.g()) {
            gL1.h = i;
            if (k0.f11220a.containsKey(Integer.valueOf(i))) {
                ((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).f12564c0 = true;
            } else if (((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                ((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).O1();
            }
        }
        MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) this.f1820b;
        if (str == null) {
            str = "";
        }
        String version = HuiYanOsApi.getVersion();
        kotlin.jvm.internal.j.f(version, "getVersion(...)");
        mayaKycLivenessCaptureFragment.J1(str, version, false);
    }

    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onSuccess(HuiYanOsAuthResult huiYanOsAuthResult) {
        int i = 13;
        String version = HuiYanOsApi.getVersion();
        kotlin.jvm.internal.j.f(version, "getVersion(...)");
        MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) this.f1820b;
        mayaKycLivenessCaptureFragment.J1("", version, true);
        if (huiYanOsAuthResult != null) {
            String token = huiYanOsAuthResult.token;
            kotlin.jvm.internal.j.f(token, "token");
            D8.G gL1 = mayaKycLivenessCaptureFragment.L1();
            TencentCompleteRequest tencentCompleteRequest = new TencentCompleteRequest(token);
            com.paymaya.domain.store.M m = gL1.e;
            m.getClass();
            gL1.e(new Hh.f(((KycTencentApi) m.f11371b).journeyComplete(tencentCompleteRequest).f(Th.e.c), zh.b.a(), 0).a(new A7.c(gL1, i)).b(new A5.l(gL1, i)).c());
        }
    }

    @Override // G5.InterfaceC0254d
    public void u() {
        Bb.n nVar = (Bb.n) ((MayaSendMoneyFragment) this.f1820b).P1();
        Double dE = zj.x.e(nVar.n());
        if ((dE != null ? dE.doubleValue() : 0.0d) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            MayaInputLayout mayaInputLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13784J0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout.g();
            ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).Y1();
            MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
            MayaInputLayout mayaInputLayout2 = mayaSendMoneyFragment.f13784J0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout2.p();
            MayaInputLayout mayaInputLayout3 = mayaSendMoneyFragment.f13784J0;
            if (mayaInputLayout3 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout3.r();
        } else {
            MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
            MayaInputLayout mayaInputLayout4 = mayaSendMoneyFragment2.f13784J0;
            if (mayaInputLayout4 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout4.f();
            MayaInputLayout mayaInputLayout5 = mayaSendMoneyFragment2.f13784J0;
            if (mayaInputLayout5 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout5.h();
            MayaInputLayout mayaInputLayout6 = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13784J0;
            if (mayaInputLayout6 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
            }
            mayaInputLayout6.q();
        }
        nVar.z();
    }

    public /* synthetic */ v(Object obj, int i) {
        this.f1819a = i;
        this.f1820b = obj;
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        Group group = ((MayaMissionsDetailsFragment) this.f1820b).f12973a0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mConstraintGroupPartnerLogo");
            throw null;
        }
    }
}
