package G6;

import D.S;
import D8.C0214w;
import L6.F;
import L6.H;
import L9.C0323a;
import L9.C0325c;
import Q9.InterfaceC0574d;
import Q9.InterfaceC0583m;
import We.InterfaceC0604h;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cg.InterfaceC1101b;
import cj.C1112C;
import com.airbnb.lottie.LottieAnimationView;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ChangeMin;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.ContactReference;
import com.paymaya.domain.model.CreditDisbursementCalculatedFees;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.MothersMaidenName;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalDetailsData;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.model.SettingsDisplayName;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsCompletedFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsPreviewBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDisplayNameFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import o1.AbstractC1955a;
import org.json.JSONArray;
import org.json.JSONObject;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Ch.c, t4.j, InterfaceC0604h, l0.f, G5.t, Ch.f, W6.e, InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1818b;

    public u(C0214w c0214w, int i) {
        this.f1817a = 0;
        this.f1818b = c0214w;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:52)|(1:(1:(1:(3:13|48|49)(2:14|15))(2:16|(2:39|53)(2:40|41)))(1:25))(4:27|28|(1:30)|47)|31|50|32|35|(2:37|47)|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (r12 != r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[Catch: Exception -> 0x003d, SerializationException -> 0x0040, IOException -> 0x0043, ResponseException -> 0x0046, TryCatch #3 {ResponseException -> 0x0046, IOException -> 0x0043, SerializationException -> 0x0040, Exception -> 0x003d, blocks: (B:16:0x0038, B:39:0x00db, B:40:0x00e3, B:41:0x00ea, B:25:0x0049, B:31:0x00bb, B:35:0x00cb, B:28:0x0054), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: Exception -> 0x003d, SerializationException -> 0x0040, IOException -> 0x0043, ResponseException -> 0x0046, TryCatch #3 {ResponseException -> 0x0046, IOException -> 0x0043, SerializationException -> 0x0040, Exception -> 0x003d, blocks: (B:16:0x0038, B:39:0x00db, B:40:0x00e3, B:41:0x00ea, B:25:0x0049, B:31:0x00bb, B:35:0x00cb, B:28:0x0054), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ij.AbstractC1609c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.u.a(ij.c):java.lang.Object");
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaVaultedCardsFragment mayaVaultedCardsFragment;
        F f;
        String firstName;
        String lastName;
        String relationship;
        String mobileNumber;
        MayaWebFragment mayaWebFragment;
        Y6.n nVar;
        String str = "";
        int i = 0;
        switch (this.f1817a) {
            case 0:
                C0214w c0214w = (C0214w) this.f1818b;
                PayMayaError payMayaErrorF = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((K6.n) c0214w.c.get())).w1();
                if (payMayaErrorF.isSessionTimeout() || (f = (mayaVaultedCardsFragment = (MayaVaultedCardsFragment) ((K6.n) c0214w.c.get())).t0) == null) {
                    return;
                }
                ((MayaCashInActivity) f).a(payMayaErrorF, mayaVaultedCardsFragment.getString(R.string.pma_toast_error_title_vaulted_card_deletion));
                return;
            case 1:
                String arguments = (String) obj;
                kotlin.jvm.internal.j.g(arguments, "arguments");
                G7.l lVar = (G7.l) this.f1818b;
                lVar.f1893p = true;
                pg.u uVar = lVar.h;
                if (uVar != null) {
                    uVar.a("getUsername", arguments, null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("flutterActivityEngineMethodChannel");
                    throw null;
                }
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            case 11:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Q6.t tVar = (Q6.t) this.f1818b;
                if (permission.f6934b || !AbstractC1955a.v(((MayaWebFragment) ((X6.h) tVar.c.get())).getActivity(), "android.permission.CAMERA") || (nVar = (mayaWebFragment = (MayaWebFragment) ((X6.h) tVar.c.get())).u0) == null) {
                    return;
                }
                Y6.m mVar = new Y6.m(mayaWebFragment, 1);
                MayaWebActivity mayaWebActivity = (MayaWebActivity) nVar;
                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, mayaWebActivity.getString(R.string.maya_label_more_permissions_needed), mayaWebActivity.getString(R.string.maya_label_file_upload_permission_from_settings_description), mayaWebActivity.getString(R.string.maya_label_proceed_to_settings), mayaWebActivity.getString(R.string.maya_label_cancel), true, null, null, false, 448);
                mayaErrorDialogFragmentZ.f11852e0 = new S.b(mVar, 11);
                mayaErrorDialogFragmentZ.show(mayaWebActivity.getSupportFragmentManager(), "error_dialog");
                return;
            case 5:
                MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
                Ja.b bVar = (Ja.b) this.f1818b;
                y5.s sVar = (Ma.a) bVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (merchantPaymentV2 != null) {
                    String status = merchantPaymentV2.getStatus();
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.j.f(locale, "getDefault(...)");
                    String upperCase = status.toUpperCase(locale);
                    kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                    int iHashCode = upperCase.hashCode();
                    if (iHashCode == 74702359 ? upperCase.equals("REFUNDED") : iHashCode == 733698236 ? upperCase.equals("FAILED_FULFILLMENT") : iHashCode == 2045206500 && upperCase.equals("FAILED_PAYMENT")) {
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get());
                        Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                        if (eVar != null) {
                            M2.b.Z(0, mayaMLKitQRScannerFragment.getString(R.string.maya_merchant_payment_error_title), mayaMLKitQRScannerFragment.getString(R.string.maya_merchant_payment_error_subtitle_refund), null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((MayaQRActivity) eVar).getSupportFragmentManager(), "error_dialog");
                            return;
                        }
                        return;
                    }
                    Na.e eVar2 = ((MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get())).f13591j0;
                    if (eVar2 != null) {
                        MayaV2MerchantPaymentReceiptFragment mayaV2MerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("merchant_payment_v2", merchantPaymentV2);
                        mayaV2MerchantPaymentReceiptFragment.setArguments(bundle);
                        AbstractC1236z.g((MayaQRActivity) eVar2, R.id.fragment_container, mayaV2MerchantPaymentReceiptFragment);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                A7.j jVar = (A7.j) this.f1818b;
                PayMayaError payMayaErrorF2 = jVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                jVar.d0(payMayaErrorF2);
                return;
            case 9:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((P9.b) ((C0325c) this.f1818b).c.get())).w1();
                PayMayaError payMayaErrorF3 = ((C0325c) this.f1818b).f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                C0325c c0325c = (C0325c) this.f1818b;
                c0325c.getClass();
                int iMErrorCode = payMayaErrorF3.mErrorCode();
                if (iMErrorCode == -385) {
                    MfaMeta metaAsMfaMeta = payMayaErrorF3.getMetaAsMfaMeta();
                    if (metaAsMfaMeta != null) {
                        MfaMeta.MfaParams params = metaAsMfaMeta.getParams();
                        if (params == null) {
                            params = new MfaMeta.MfaParams("", "");
                        }
                        params.setLifeStyleId(c0325c.f);
                        metaAsMfaMeta.setParams(params);
                        metaAsMfaMeta.setTransactionType("mecdisburse");
                        MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment = (MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get());
                        mayaCreditConfirmTransferFragment.getClass();
                        InterfaceC0574d interfaceC0574d = mayaCreditConfirmTransferFragment.f13110f0;
                        if (interfaceC0574d != null) {
                            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0574d;
                            newMayaCreditActivity.f13088t = new N9.f(new N9.f(mayaCreditConfirmTransferFragment, 8), i);
                            newMayaCreditActivity.n1();
                            ActivityResultLauncher activityResultLauncher = newMayaCreditActivity.f13089u;
                            Intent intent = new Intent(newMayaCreditActivity, (Class<?>) MayaMfaActivity.class);
                            intent.putExtra("mfa_meta", metaAsMfaMeta);
                            activityResultLauncher.launch(intent);
                        }
                    } else {
                        MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment2 = (MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get());
                        InterfaceC0574d interfaceC0574d2 = mayaCreditConfirmTransferFragment2.f13110f0;
                        if (interfaceC0574d2 != null) {
                            ((NewMayaCreditActivity) interfaceC0574d2).a(payMayaErrorF3, mayaCreditConfirmTransferFragment2.getString(R.string.maya_label_that_didnt_load_right));
                        }
                    }
                } else if (iMErrorCode == -386) {
                    MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment3 = (MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get());
                    InterfaceC0574d interfaceC0574d3 = mayaCreditConfirmTransferFragment3.f13110f0;
                    if (interfaceC0574d3 != null) {
                        String string = mayaCreditConfirmTransferFragment3.getString(R.string.maya_label_transfer_unsuccessful);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = mayaCreditConfirmTransferFragment3.getString(R.string.maya_label_transfer_unsuccessful_message);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        LinkedHashSet linkedHashSet = E.f10412a;
                        E.a("NewMayaCreditActivity", "showTransferUnsuccessful: " + string + Global.BLANK + string2);
                        M2.b.Z(0, string, string2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((NewMayaCreditActivity) interfaceC0574d3).getSupportFragmentManager(), "error_dialog");
                    }
                } else {
                    MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment4 = (MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get());
                    InterfaceC0574d interfaceC0574d4 = mayaCreditConfirmTransferFragment4.f13110f0;
                    if (interfaceC0574d4 != null) {
                        ((NewMayaCreditActivity) interfaceC0574d4).a(payMayaErrorF3, mayaCreditConfirmTransferFragment4.getString(R.string.maya_label_that_didnt_load_right));
                    }
                }
                ((C0325c) this.f1818b).l(payMayaErrorF3, it);
                return;
            case 10:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                A7.j jVar2 = (A7.j) this.f1818b;
                PayMayaError payMayaErrorF4 = jVar2.f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                jVar2.a0(payMayaErrorF4);
                jVar2.F(payMayaErrorF4, it2);
                return;
            case 12:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                PayMayaError payMayaErrorF5 = ((L9.o) this.f1818b).f(it3, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                L9.o oVar = (L9.o) this.f1818b;
                oVar.getClass();
                ((MayaBaseFragment) ((P9.g) oVar.c.get())).w1();
                if (!payMayaErrorF5.isSessionTimeout()) {
                    if (payMayaErrorF5.isNetworkError()) {
                        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = (NewMayaCreditActivationConfirmDetailFragment) ((P9.g) oVar.c.get());
                        InterfaceC0583m interfaceC0583m = newMayaCreditActivationConfirmDetailFragment.f13160i0;
                        if (interfaceC0583m != null) {
                            ((NewMayaCreditActivity) interfaceC0583m).o(newMayaCreditActivationConfirmDetailFragment.getString(R.string.maya_label_credit_activation_error_title), newMayaCreditActivationConfirmDetailFragment.getString(R.string.maya_label_credit_activation_error_message));
                        }
                    } else {
                        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment2 = (NewMayaCreditActivationConfirmDetailFragment) ((P9.g) oVar.c.get());
                        newMayaCreditActivationConfirmDetailFragment2.getClass();
                        InterfaceC0583m interfaceC0583m2 = newMayaCreditActivationConfirmDetailFragment2.f13160i0;
                        if (interfaceC0583m2 != null) {
                            ((NewMayaCreditActivity) interfaceC0583m2).o(newMayaCreditActivationConfirmDetailFragment2.getString(R.string.maya_label_credit_activation_error_title), payMayaErrorF5.mSpiel());
                        }
                    }
                }
                ((L9.o) this.f1818b).p(payMayaErrorF5, it3);
                return;
            case 13:
                PersonalDetailsData it4 = (PersonalDetailsData) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                L9.s sVar2 = (L9.s) this.f1818b;
                CreditReviewUiModel creditReviewUiModel = sVar2.h;
                String gender = it4.getGender();
                if (gender != null) {
                    String strM = sVar2.m(gender);
                    sVar2.f2918q = strM;
                    creditReviewUiModel.h = strM;
                }
                String maritalStatus = it4.getMaritalStatus();
                if (maritalStatus != null) {
                    String strN = sVar2.n(maritalStatus);
                    sVar2.f2919r = strN;
                    creditReviewUiModel.i = strN;
                }
                String alternativeMobileNumber = it4.getAlternativeMobileNumber();
                if (alternativeMobileNumber != null) {
                    String strQ = C.q(alternativeMobileNumber);
                    creditReviewUiModel.j = strQ;
                    sVar2.f2917p = strQ;
                }
                ContactReference contactReference = it4.getContactReference();
                if (contactReference == null || (firstName = contactReference.getFirstName()) == null) {
                    firstName = "";
                }
                ContactReference contactReference2 = it4.getContactReference();
                if (contactReference2 == null || (lastName = contactReference2.getLastName()) == null) {
                    lastName = "";
                }
                ContactReference contactReference3 = it4.getContactReference();
                if (contactReference3 == null || (relationship = contactReference3.getRelationship()) == null) {
                    relationship = "";
                }
                ContactReference contactReference4 = it4.getContactReference();
                if (contactReference4 != null && (mobileNumber = contactReference4.getMobileNumber()) != null) {
                    str = mobileNumber;
                }
                J9.a aVar = new J9.a(firstName, lastName, relationship, str);
                sVar2.i = aVar;
                creditReviewUiModel.f13060l = aVar;
                MothersMaidenName mothersMaidenName = it4.getMothersMaidenName();
                if (mothersMaidenName != null) {
                    creditReviewUiModel.f13065r = mothersMaidenName;
                    NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar2.c.get());
                    newMayaCreditEnhancedActivationFragment.getClass();
                    MayaInputLayout mayaInputLayout = newMayaCreditEnhancedActivationFragment.t0;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    }
                    mayaInputLayout.getInputEditText().setText(mothersMaidenName.getFirstName());
                    MayaInputLayout mayaInputLayout2 = newMayaCreditEnhancedActivationFragment.u0;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    }
                    mayaInputLayout2.getInputEditText().setText(mothersMaidenName.getMiddleName());
                    MayaInputLayout mayaInputLayout3 = newMayaCreditEnhancedActivationFragment.f13223v0;
                    if (mayaInputLayout3 == null) {
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    }
                    mayaInputLayout3.getInputEditText().setText(mothersMaidenName.getLastName());
                    AppCompatCheckBox appCompatCheckBox = newMayaCreditEnhancedActivationFragment.w0;
                    if (appCompatCheckBox == null) {
                        kotlin.jvm.internal.j.n("mMotherMiddleNameCheckBox");
                        throw null;
                    }
                    appCompatCheckBox.setChecked(mothersMaidenName.getHasNoMiddleName());
                }
                ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar2.c.get())).Q1(creditReviewUiModel);
                ((MayaBaseFragment) ((P9.j) ((L9.s) this.f1818b).c.get())).w1();
                return;
            case 14:
                Throwable it5 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                k kVar = (k) this.f1818b;
                PayMayaError payMayaErrorF6 = kVar.f(it5, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                kVar.y(payMayaErrorF6);
                kVar.s(payMayaErrorF6, it5);
                return;
            case 15:
                OTP otp = (OTP) obj;
                kotlin.jvm.internal.j.g(otp, "otp");
                Lb.b bVar2 = (Lb.b) this.f1818b;
                ((MayaBaseFragment) ((Rb.c) bVar2.c.get())).w1();
                Rb.c cVar = (Rb.c) bVar2.c.get();
                String strMOtpId = otp.mOtpId();
                String strK = bVar2.k();
                Sb.j jVar3 = ((MayaChangeMinFormFragment) cVar).f13936Z;
                if (jVar3 != null) {
                    MayaChangeMinOTPFragment mayaChangeMinOTPFragment = new MayaChangeMinOTPFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("otp_id", strMOtpId, "mobile_number", strK);
                    bundleE.putBoolean("is_new_mobile", true);
                    mayaChangeMinOTPFragment.setArguments(bundleE);
                    AbstractC1236z.h((MayaSettingsActivity) jVar3, R.id.frame_layout_container, mayaChangeMinOTPFragment);
                    return;
                }
                return;
            case 16:
                ChangeMin changeMin = (ChangeMin) obj;
                kotlin.jvm.internal.j.g(changeMin, "changeMin");
                Lb.d dVar = (Lb.d) this.f1818b;
                dVar.getClass();
                ((MayaBaseFragment) ((Rb.e) dVar.c.get())).w1();
                Rb.e eVar3 = (Rb.e) dVar.c.get();
                String strMId = changeMin.mId();
                Sb.m mVar2 = ((MayaChangeMinOTPFragment) eVar3).f13945k0;
                if (mVar2 != null) {
                    MayaChangeMinFormFragment mayaChangeMinFormFragment = new MayaChangeMinFormFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(TtmlNode.ATTR_ID, strMId);
                    mayaChangeMinFormFragment.setArguments(bundle2);
                    AbstractC1236z.h((MayaSettingsActivity) mVar2, R.id.frame_layout_container, mayaChangeMinFormFragment);
                    return;
                }
                return;
            case 17:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                A7.j jVar4 = (A7.j) this.f1818b;
                PayMayaError payMayaErrorF7 = jVar4.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                jVar4.b0(payMayaErrorF7);
                return;
            case 18:
                SettingsDisplayName displayName = (SettingsDisplayName) obj;
                kotlin.jvm.internal.j.g(displayName, "displayName");
                C0323a c0323a = (C0323a) this.f1818b;
                c0323a.getClass();
                BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((Rb.j) c0323a.c.get());
                baseMayaSettingsFragment.getClass();
                Sb.d dVar2 = baseMayaSettingsFragment.f13906v0;
                if (dVar2 != null) {
                    MayaDisplayNameFragment mayaDisplayNameFragment = new MayaDisplayNameFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("display_name", displayName);
                    mayaDisplayNameFragment.setArguments(bundle3);
                    AbstractC1236z.h((MayaSettingsActivity) dVar2, R.id.frame_layout_container, mayaDisplayNameFragment);
                    return;
                }
                return;
            case 19:
                Registration it6 = (Registration) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                C0214w c0214w2 = (C0214w) this.f1818b;
                c0214w2.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                for (Consent consent : ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w2.c.get())).f12290f0) {
                    String strMID = consent.mID();
                    if (strMID != null) {
                        int iHashCode2 = strMID.hashCode();
                        if (iHashCode2 != -2060462300) {
                            if (iHashCode2 != -1005395930) {
                                if (iHashCode2 == 119760966 && strMID.equals(Consent.ID_PROFILE_SHARING)) {
                                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                                    c1219h.j.put("consented_profile_sharing", String.valueOf(consent.isEnabled()));
                                }
                            } else if (strMID.equals(Consent.ID_PROFILING)) {
                                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                                c1219h.j.put("consented_profiling", String.valueOf(consent.isEnabled()));
                            }
                        } else if (strMID.equals(Consent.ID_ADVERTISING)) {
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("consented_advertising", String.valueOf(consent.isEnabled()));
                        }
                    }
                }
                ((MayaBaseFragment) ((R7.b) c0214w2.c.get())).z1(c1219h);
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w2.c.get());
                mayaDataPrivacyDataPersonalizationFragment.getClass();
                S7.f fVar = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                if (fVar != null) {
                    fVar.z(it6);
                    return;
                }
                return;
            case 20:
                M7.c cVar2 = (M7.c) this.f1818b;
                PayMayaError payMayaErrorF8 = cVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = (MayaDataPrivacyDialogFragment) ((P7.a) cVar2.c.get());
                Q7.a aVar2 = mayaDataPrivacyDialogFragment.f12266R;
                if (aVar2 != null) {
                    aVar2.a(payMayaErrorF8, mayaDataPrivacyDialogFragment.getString(R.string.maya_error_title_login));
                    return;
                }
                return;
            case 25:
                Pc.g gVar = (Pc.g) this.f1818b;
                PayMayaError payMayaErrorF9 = gVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "paymayaErrorHandling(...)");
                if (payMayaErrorF9.isSessionTimeout()) {
                    gVar.f5157g = true;
                    return;
                } else if (!payMayaErrorF9.isNetworkError()) {
                    ((WebFragment) ((Vc.c) gVar.c.get())).C1();
                    return;
                } else {
                    WebFragment webFragment = (WebFragment) ((Vc.c) gVar.c.get());
                    webFragment.y1(100, webFragment.getString(R.string.pma_dialog_error_server_default_message_web), new Wc.d(webFragment, i));
                    return;
                }
            case 26:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((Bb.f) this.f1818b).z(p02);
                return;
            case 27:
                io.reactivex.rxjava3.disposables.b it7 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it7, "it");
                ((Q6.o) this.f1818b).e(it7);
                return;
            case 28:
                Throwable e = (Throwable) obj;
                kotlin.jvm.internal.j.g(e, "e");
                Q6.p pVar = (Q6.p) this.f1818b;
                PayMayaError payMayaErrorF10 = pVar.f(e, false);
                kotlin.jvm.internal.j.f(payMayaErrorF10, "paymayaErrorHandling(...)");
                payMayaErrorF10.toString();
                yk.a.a();
                ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).v1(C1112C.f9377a);
                Dialog dialog = ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).getDialog();
                if (dialog != null) {
                    dialog.show();
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        CreditDisbursementCalculatedFees fees = (CreditDisbursementCalculatedFees) obj;
        kotlin.jvm.internal.j.g(fees, "fees");
        return new Pair((CustomerAccount) this.f1818b, fees);
    }

    public synchronized CleverTapDisplayUnit b(String str) {
        if (TextUtils.isEmpty(str)) {
            S.c("DisplayUnit : ", "Can't return Display Unit, id was null");
            return null;
        }
        return (CleverTapDisplayUnit) ((HashMap) this.f1818b).get(str);
    }

    public void c() {
        int i = MayaSettingsActivity.f13839r;
        MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) this.f1818b;
        MayaDisplayNameFragment mayaDisplayNameFragment = (MayaDisplayNameFragment) mayaSettingsActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaSettingsActivity, MayaDisplayNameFragment.class));
        if (mayaDisplayNameFragment != null) {
            mayaDisplayNameFragment.G1().e = true;
            SwitchCompat switchCompat = mayaDisplayNameFragment.f13978W;
            if (switchCompat != null) {
                switchCompat.setChecked(!switchCompat.isChecked());
            } else {
                kotlin.jvm.internal.j.n("mShowMyNameSwitch");
                throw null;
            }
        }
    }

    public synchronized void d() {
        ((HashMap) this.f1818b).clear();
        S.c("DisplayUnit : ", "Cleared Display Units Cache");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:72)|(1:(1:(1:(3:13|63|64)(2:14|15))(2:16|(2:53|73)(2:54|55)))(1:25))(7:27|28|29|(4:31|68|32|35)(2:36|(1:38)(4:39|66|40|43))|44|(1:46)|62)|47|70|48|49|(2:51|62)|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        if (r15 != r2) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: Exception -> 0x003e, SerializationException -> 0x0041, IOException -> 0x0044, ResponseException -> 0x0047, TryCatch #5 {ResponseException -> 0x0047, IOException -> 0x0044, SerializationException -> 0x0041, Exception -> 0x003e, blocks: (B:16:0x0039, B:53:0x011f, B:54:0x0127, B:55:0x012e, B:25:0x004a, B:47:0x0101, B:49:0x010f, B:28:0x0056, B:31:0x00ab, B:35:0x00b9, B:44:0x00e0, B:36:0x00c2, B:38:0x00c6, B:39:0x00cc, B:43:0x00d8), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: Exception -> 0x003e, SerializationException -> 0x0041, IOException -> 0x0044, ResponseException -> 0x0047, TryCatch #5 {ResponseException -> 0x0047, IOException -> 0x0044, SerializationException -> 0x0041, Exception -> 0x003e, blocks: (B:16:0x0039, B:53:0x011f, B:54:0x0127, B:55:0x012e, B:25:0x004a, B:47:0x0101, B:49:0x010f, B:28:0x0056, B:31:0x00ab, B:35:0x00b9, B:44:0x00e0, B:36:0x00c2, B:38:0x00c6, B:39:0x00cc, B:43:0x00d8), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.HashMap r13, byte[] r14, ij.AbstractC1609c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.u.e(java.util.HashMap, byte[], ij.c):java.lang.Object");
    }

    public synchronized ArrayList f(JSONArray jSONArray) {
        try {
            d();
            if (jSONArray == null || jSONArray.length() <= 0) {
                S.c("DisplayUnit : ", "Null json array response can't parse Display Units ");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    CleverTapDisplayUnit cleverTapDisplayUnitB = CleverTapDisplayUnit.b((JSONObject) jSONArray.get(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitB.f9461d)) {
                        ((HashMap) this.f1818b).put(cleverTapDisplayUnitB.f9462g, cleverTapDisplayUnitB);
                        arrayList.add(cleverTapDisplayUnitB);
                    } else {
                        S.c("DisplayUnit : ", "Failed to convert JsonArray item at index:" + i + " to Display Unit");
                    }
                } catch (Exception e) {
                    S.c("DisplayUnit : ", "Failed while parsing Display Unit:" + e.getLocalizedMessage());
                    return null;
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        ((v) this.f1818b).getClass();
        return new Uh.d();
    }

    @Override // t4.j
    public void i() {
    }

    @Override // G5.t
    public void m(String str, View view) {
        MayaWesternUnionFragment mayaWesternUnionFragment = (MayaWesternUnionFragment) this.f1818b;
        C1220i c1220iO1 = mayaWesternUnionFragment.o1();
        FragmentActivity activity = mayaWesternUnionFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.WESTERN_UNION);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.WHATS_MTCN);
        c1220iO1.c(activity, c1219hD);
        H h = mayaWesternUnionFragment.f11780Z;
        if (h != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) h;
            mayaCashInActivity.n1();
            B5.i.f(mayaCashInActivity, "https://www.westernunion.com/us/en/what-is-mtcn.html");
        }
    }

    @Override // W6.e
    public void onDismiss() {
        ((NewMayaCreditActivity) this.f1818b).g1();
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        Group group = ((MayaMissionsPreviewBottomSheetFragment) this.f1818b).f13046a0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mPartnerLogoConstraintGroup");
            throw null;
        }
    }

    @Override // t4.j
    public void onRefresh() {
        MayaMissionsCompletedFragment mayaMissionsCompletedFragment = (MayaMissionsCompletedFragment) this.f1818b;
        mayaMissionsCompletedFragment.P1().k();
        LottieAnimationView lottieAnimationView = mayaMissionsCompletedFragment.t0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        Group group = ((MayaMissionsPreviewBottomSheetFragment) this.f1818b).f13046a0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mPartnerLogoConstraintGroup");
            throw null;
        }
    }

    public /* synthetic */ u(Object obj, int i) {
        this.f1817a = i;
        this.f1818b = obj;
    }

    public u(wg.c httpClient) {
        this.f1817a = 23;
        kotlin.jvm.internal.j.g(httpClient, "httpClient");
        this.f1818b = httpClient;
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        ((L.b) this.f1818b).c = ((Boolean) obj).booleanValue();
    }

    public u() {
        this.f1817a = 4;
        this.f1818b = new HashMap();
    }
}
