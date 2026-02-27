package com.paymaya.mayaui.banktransfer.view.fragment.impl;

import Ah.p;
import G5.C0256f;
import G5.n;
import Kh.T;
import Lh.d;
import Lh.h;
import N5.C0466m;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.BankTransferV3Recipient;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import e2.C1421c;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import n6.InterfaceC1931b;
import o6.g;
import s6.InterfaceC2241b;
import t6.C2272c;
import t6.C2273d;
import t6.C2274e;
import t6.InterfaceC2275f;
import t6.ViewOnClickListenerC2271b;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zh.b;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferFormFragment extends MayaBaseLoadingFragment implements InterfaceC2241b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public g f11549A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public InterfaceC2275f f11550B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C0256f f11551C0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0466m f11552o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f11553p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MayaInputLayout f11554q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppCompatEditText f11555r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f11556s0;
    public MayaInputLayout t0;
    public AppCompatEditText u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public MayaInputLayout f11557v0;
    public AppCompatEditText w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MayaInputLayout f11558x0;
    public AppCompatEditText y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f11559z0;

    public static final void U1(MayaBankTransferFormFragment mayaBankTransferFormFragment) {
        int i = 0;
        if (mayaBankTransferFormFragment.t1().e().isAppEventV2BankTransferEnabled()) {
            InterfaceC2275f interfaceC2275f = mayaBankTransferFormFragment.f11550B0;
            String str = interfaceC2275f != null ? ((MayaBankTransferActivity) interfaceC2275f).f11535r : null;
            C1220i c1220iO1 = mayaBankTransferFormFragment.o1();
            C1219h c1219hE = C1219h.e("BANK_TRANSFER_SCREEN_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18));
            HashMap map = c1219hE.j;
            map.put("source_page", str);
            map.put("button", "Continue");
            map.put("destination_page", "Bank Transfer Confirmation Screen");
            c1220iO1.b(c1219hE);
        } else {
            C1220i c1220iO12 = mayaBankTransferFormFragment.o1();
            FragmentActivity activity = mayaBankTransferFormFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaBankTransferFormFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.CONTINUE);
            c1220iO12.c(activity, c1219hD);
        }
        C0256f c0256f = mayaBankTransferFormFragment.f11551C0;
        if (c0256f != null) {
            c0256f.a();
        }
        g gVar = (g) mayaBankTransferFormFragment.R1();
        String strP1 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).P1();
        if (strP1 == null) {
            strP1 = "0.00";
        }
        if (Double.parseDouble(strP1) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            MayaBankTransferFormFragment mayaBankTransferFormFragment2 = (MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get());
            String string = mayaBankTransferFormFragment2.getString(R.string.pma_toast_error_invalid_amount);
            InterfaceC2275f interfaceC2275f2 = mayaBankTransferFormFragment2.f11550B0;
            if (interfaceC2275f2 != null) {
                ((MayaBankTransferActivity) interfaceC2275f2).o(mayaBankTransferFormFragment2.getString(R.string.pma_toast_error_title_send_money_error), string);
                return;
            }
            return;
        }
        Bank bank = gVar.f18796k;
        if (bank != null) {
            ((MayaBaseFragment) ((InterfaceC2241b) gVar.c.get())).E1();
            AppCompatEditText appCompatEditText = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).y0;
            if (appCompatEditText == null) {
                j.n("mEditTextAccountName");
                throw null;
            }
            String string2 = C2576A.b0(appCompatEditText.getText().toString()).toString();
            AppCompatEditText appCompatEditText2 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).u0;
            if (appCompatEditText2 == null) {
                j.n("mEditTextAccountNumber");
                throw null;
            }
            BankTransferV3Recipient bankTransferV3Recipient = new BankTransferV3Recipient(C2576A.b0(appCompatEditText2.getText().toString()).toString(), string2, bank.mBankIC(), "INSTAPAY", bank.mBankName(), bank.mBankCode());
            Amount amountBuild = Amount.sBuilder().mValue(((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).P1()).mCurrency("PHP").build();
            AppCompatEditText appCompatEditText3 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).w0;
            if (appCompatEditText3 == null) {
                j.n("mEditTextPurpose");
                throw null;
            }
            String string3 = C2576A.b0(appCompatEditText3.getText().toString()).toString();
            Bundle arguments = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).getArguments();
            QRBankTransferRecipient qRBankTransferRecipient = arguments != null ? (QRBankTransferRecipient) arguments.getParcelable("bank_recipient") : null;
            BankTransferV3 bankTransferV3 = new BankTransferV3(null, null, amountBuild, null, bankTransferV3Recipient, string3, null, qRBankTransferRecipient != null ? qRBankTransferRecipient.mQRPHAdditionalData() : null, 75, null);
            p<BankTransferV3CreateResponse> pVarCreateBankTransferV3 = gVar.f18795g.f11400b.createBankTransferV3(bankTransferV3, i0.b(), gVar.f18794d.h(), "2.153.0", "android");
            gVar.e(new T(5, new d(new d(AbstractC1331a.l(pVarCreateBankTransferV3, pVarCreateBankTransferV3, b.a()), new C1421c(23, bankTransferV3, gVar), 2), new com.google.firebase.messaging.p(gVar, 26), i), new o6.d(gVar, 1)).e());
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_bank_transfer_form, viewGroup, false);
        int i = R.id.button_continue_bank_transfer;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue_bank_transfer);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.maya_input_layout_account_name;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_account_name);
            if (mayaInputLayout != null) {
                i = R.id.maya_input_layout_account_number;
                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_account_number);
                if (mayaInputLayout2 != null) {
                    i = R.id.maya_input_layout_amount;
                    MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_amount);
                    if (mayaInputLayout3 != null) {
                        i = R.id.maya_input_layout_purpose;
                        MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_purpose);
                        if (mayaInputLayout4 != null) {
                            i = R.id.scroll_view_bank_transfer_form;
                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_bank_transfer_form)) != null) {
                                i = R.id.text_view_account_details;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_details)) != null) {
                                    i = R.id.text_view_bank_name;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_name);
                                    if (textView != null) {
                                        i = R.id.text_view_transfer_fee;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fee);
                                        if (textView2 != null) {
                                            this.f11552o0 = new C0466m((ViewGroup) constraintLayout, (Object) button, (View) mayaInputLayout, (Object) mayaInputLayout2, (Object) mayaInputLayout3, (Object) mayaInputLayout4, (View) textView, (View) textView2, 3);
                                            j.f(constraintLayout, "getRoot(...)");
                                            return constraintLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final String P1() {
        AppCompatEditText appCompatEditText = this.f11555r0;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        String string = appCompatEditText.getText().toString();
        String string2 = getString(R.string.maya_php_currency);
        j.f(string2, "getString(...)");
        return C2576A.b0(z.t(z.t(string, string2, ""), ",", "")).toString();
    }

    public final String Q1(MayaInputLayout mayaInputLayout) {
        MayaInputLayout mayaInputLayout2 = this.f11554q0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
        if (j.b(mayaInputLayout, mayaInputLayout2)) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            return "amount";
        }
        MayaInputLayout mayaInputLayout3 = this.t0;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutAccountNumber");
            throw null;
        }
        if (j.b(mayaInputLayout, mayaInputLayout3)) {
            return "Account Number";
        }
        MayaInputLayout mayaInputLayout4 = this.f11558x0;
        if (mayaInputLayout4 == null) {
            j.n("mMayaInputLayoutAccountName");
            throw null;
        }
        if (j.b(mayaInputLayout, mayaInputLayout4)) {
            return "Account Name";
        }
        MayaInputLayout mayaInputLayout5 = this.f11557v0;
        if (mayaInputLayout5 != null) {
            return j.b(mayaInputLayout, mayaInputLayout5) ? "purpose" : "Unknown";
        }
        j.n("mMayaInputLayoutPurpose");
        throw null;
    }

    public final InterfaceC1931b R1() {
        g gVar = this.f11549A0;
        if (gVar != null) {
            return gVar;
        }
        j.n("mBankTransferFragmentPresenter");
        throw null;
    }

    public final void S1(PayMayaError payMayaError) {
        InterfaceC2275f interfaceC2275f = this.f11550B0;
        String str = interfaceC2275f != null ? ((MayaBankTransferActivity) interfaceC2275f).f11535r : null;
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("BANK_TRANSFER_SCREEN_".concat(AbstractC1173g.G(27)));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", str);
        map.put("error_reason", payMayaError.mSpiel());
        map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
        c1220iO1.b(c1219hE);
    }

    public final void T1(String str, String str2, boolean z4) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        InterfaceC2275f interfaceC2275f = this.f11550B0;
        Boolean boolValueOf4 = null;
        String str3 = interfaceC2275f != null ? ((MayaBankTransferActivity) interfaceC2275f).f11535r : null;
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("BANK_TRANSFER_SCREEN_".concat(AbstractC1173g.G(40)));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", str3);
        map.put("input_label", str);
        map.put("is_invalid", String.valueOf(z4));
        map.put("invalid_reason", str2);
        map.put("is_disabled", "false");
        MayaInputLayout mayaInputLayout = this.f11554q0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
        Editable text = mayaInputLayout.getInputEditText().getText();
        if (text != null) {
            boolValueOf = Boolean.valueOf(text.length() > 0);
        } else {
            boolValueOf = null;
        }
        map.put("is_amount_filled", String.valueOf(boolValueOf));
        MayaInputLayout mayaInputLayout2 = this.f11557v0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutPurpose");
            throw null;
        }
        Editable text2 = mayaInputLayout2.getInputEditText().getText();
        if (text2 != null) {
            boolValueOf2 = Boolean.valueOf(text2.length() > 0);
        } else {
            boolValueOf2 = null;
        }
        map.put("is_purpose_filled", String.valueOf(boolValueOf2));
        MayaInputLayout mayaInputLayout3 = this.t0;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutAccountNumber");
            throw null;
        }
        Editable text3 = mayaInputLayout3.getInputEditText().getText();
        if (text3 != null) {
            boolValueOf3 = Boolean.valueOf(text3.length() > 0);
        } else {
            boolValueOf3 = null;
        }
        map.put("is_account_number_filled", String.valueOf(boolValueOf3));
        MayaInputLayout mayaInputLayout4 = this.f11558x0;
        if (mayaInputLayout4 == null) {
            j.n("mMayaInputLayoutAccountName");
            throw null;
        }
        Editable text4 = mayaInputLayout4.getInputEditText().getText();
        if (text4 != null) {
            boolValueOf4 = Boolean.valueOf(text4.length() > 0);
        }
        map.put("is_account_name_filled", String.valueOf(boolValueOf4));
        c1220iO1.b(c1219hE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V1() {
        /*
            r5 = this;
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r0 = r5.f11557v0
            r1 = 0
            java.lang.String r2 = "mMayaInputLayoutPurpose"
            if (r0 == 0) goto L86
            boolean r0 = r0.f12073w
            if (r0 != 0) goto L77
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r0 = r5.f11558x0
            if (r0 == 0) goto L71
            boolean r3 = r0.f12073w
            if (r3 != 0) goto L77
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r3 = r5.t0
            java.lang.String r4 = "mMayaInputLayoutAccountNumber"
            if (r3 == 0) goto L6d
            boolean r3 = r3.f12073w
            if (r3 != 0) goto L77
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r3 = r5.f11554q0
            if (r3 == 0) goto L67
            boolean r3 = r3.f12073w
            if (r3 != 0) goto L77
            androidx.appcompat.widget.AppCompatEditText r0 = r0.getInputEditText()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L77
            int r0 = r0.length()
            if (r0 <= 0) goto L77
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r0 = r5.t0
            if (r0 == 0) goto L63
            androidx.appcompat.widget.AppCompatEditText r0 = r0.getInputEditText()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L77
            int r0 = r0.length()
            if (r0 <= 0) goto L77
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r0 = r5.f11557v0
            if (r0 == 0) goto L5f
            androidx.appcompat.widget.AppCompatEditText r0 = r0.getInputEditText()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L77
            int r0 = r0.length()
            if (r0 <= 0) goto L77
            r0 = 1
            goto L78
        L5f:
            kotlin.jvm.internal.j.n(r2)
            throw r1
        L63:
            kotlin.jvm.internal.j.n(r4)
            throw r1
        L67:
            java.lang.String r0 = "mMayaInputLayoutAmount"
            kotlin.jvm.internal.j.n(r0)
            throw r1
        L6d:
            kotlin.jvm.internal.j.n(r4)
            throw r1
        L71:
            java.lang.String r0 = "mMayaInputLayoutAccountName"
            kotlin.jvm.internal.j.n(r0)
            throw r1
        L77:
            r0 = 0
        L78:
            android.widget.Button r2 = r5.f11556s0
            if (r2 == 0) goto L80
            r2.setEnabled(r0)
            return
        L80:
            java.lang.String r0 = "mButtonContinue"
            kotlin.jvm.internal.j.n(r0)
            throw r1
        L86:
            kotlin.jvm.internal.j.n(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment.V1():void");
    }

    public final void W1() {
        TextView textView = this.f11559z0;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.maya_shades_of_grey_5));
        } else {
            j.n("mTextViewTransferFee");
            throw null;
        }
    }

    public final void X1(MayaInputLayout mayaInputLayout) {
        mayaInputLayout.setHelperErrorText(getString(R.string.pma_error_missing_field, mayaInputLayout.getLabel()));
        AbstractC0983W.A(mayaInputLayout, null, new C7.g(8, mayaInputLayout, mayaInputLayout, this), 1);
        MayaInputLayout mayaInputLayout2 = this.f11557v0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutPurpose");
            throw null;
        }
        boolean zEquals = mayaInputLayout.equals(mayaInputLayout2);
        MayaInputLayout mayaInputLayout3 = this.f11558x0;
        if (mayaInputLayout3 != null) {
            mayaInputLayout.getInputEditText().addTextChangedListener(new n(mayaInputLayout.equals(mayaInputLayout3) || zEquals ? "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$" : null, zEquals ? 35 : Integer.MAX_VALUE, new C2272c(mayaInputLayout, this, 0), new C2273d(mayaInputLayout, this, mayaInputLayout, 0), new C2273d(mayaInputLayout, this, mayaInputLayout, 1), new C2272c(mayaInputLayout, this, 1), new C2274e(this, 0)));
        } else {
            j.n("mMayaInputLayoutAccountName");
            throw null;
        }
    }

    public final void Y1(String str) {
        MayaInputLayout mayaInputLayout = this.f11554q0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.g();
        mayaInputLayout.setHelperErrorText(getString(R.string.maya_format_error_no_amount, str));
        mayaInputLayout.r();
        mayaInputLayout.p();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11550B0 = (InterfaceC2275f) getActivity();
        a aVar = W4.a.e().h().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1247a c1247aA = aVar.a();
        C1269l c1269lF = aVar.f();
        V0 v0T = aVar.T();
        Q q9 = aVar.q();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11549A0 = new g(preference, c1247aA, c1269lF, v0T, q9, sessionSubject);
        ((AbstractC2509a) R1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) R1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        AppCompatEditText appCompatEditText = this.f11555r0;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.removeTextChangedListener(this.f11551C0);
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 0;
        super.onResume();
        InterfaceC2275f interfaceC2275f = this.f11550B0;
        if (interfaceC2275f != null) {
            ((MayaBankTransferActivity) interfaceC2275f).Q(this);
        }
        g gVar = (g) R1();
        if (!gVar.i) {
            gVar.e(new d(new h(gVar.e.a(), b.a(), 0), new A0(gVar, 27), i).e());
        }
        ((g) R1()).m();
        if (!t1().e().isAppEventV2BankTransferEnabled()) {
            C1219h c1219hH = AbstractC2329d.h(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("attribution", n1().f10371a);
            A1(c1219hH);
            return;
        }
        InterfaceC2275f interfaceC2275f2 = this.f11550B0;
        String str = interfaceC2275f2 != null ? ((MayaBankTransferActivity) interfaceC2275f2).f11535r : null;
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        c1219h.p(EnumC1215d.BANK_TRANSFER_SCREEN);
        c1219h.n(2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("source_page", str);
        c1220iO1.b(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f11552o0;
        j.d(c0466m);
        this.f11553p0 = (TextView) c0466m.h;
        C0466m c0466m2 = this.f11552o0;
        j.d(c0466m2);
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0466m2.f;
        this.f11554q0 = mayaInputLayout;
        this.f11555r0 = mayaInputLayout.getInputEditText();
        C0466m c0466m3 = this.f11552o0;
        j.d(c0466m3);
        this.f11556s0 = (Button) c0466m3.c;
        C0466m c0466m4 = this.f11552o0;
        j.d(c0466m4);
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) c0466m4.f4152g;
        this.f11557v0 = mayaInputLayout2;
        this.w0 = mayaInputLayout2.getInputEditText();
        C0466m c0466m5 = this.f11552o0;
        j.d(c0466m5);
        MayaInputLayout mayaInputLayout3 = (MayaInputLayout) c0466m5.e;
        this.t0 = mayaInputLayout3;
        this.u0 = mayaInputLayout3.getInputEditText();
        C0466m c0466m6 = this.f11552o0;
        j.d(c0466m6);
        MayaInputLayout mayaInputLayout4 = (MayaInputLayout) c0466m6.f4151d;
        this.f11558x0 = mayaInputLayout4;
        this.y0 = mayaInputLayout4.getInputEditText();
        C0466m c0466m7 = this.f11552o0;
        j.d(c0466m7);
        this.f11559z0 = (TextView) c0466m7.i;
        MayaInputLayout mayaInputLayout5 = this.f11557v0;
        if (mayaInputLayout5 == null) {
            j.n("mMayaInputLayoutPurpose");
            throw null;
        }
        X1(mayaInputLayout5);
        MayaInputLayout mayaInputLayout6 = this.t0;
        if (mayaInputLayout6 == null) {
            j.n("mMayaInputLayoutAccountNumber");
            throw null;
        }
        X1(mayaInputLayout6);
        MayaInputLayout mayaInputLayout7 = this.f11558x0;
        if (mayaInputLayout7 == null) {
            j.n("mMayaInputLayoutAccountName");
            throw null;
        }
        X1(mayaInputLayout7);
        Button button = this.f11556s0;
        if (button == null) {
            j.n("mButtonContinue");
            throw null;
        }
        button.setOnClickListener(new ViewOnClickListenerC2271b(this, 0));
        button.setEnabled(false);
        ((g) R1()).j();
    }
}
