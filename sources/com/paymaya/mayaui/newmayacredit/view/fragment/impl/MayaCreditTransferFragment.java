package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import G5.C0256f;
import G5.InterfaceC0254d;
import L9.l;
import M2.b;
import M8.C0332a;
import N5.C0447e;
import O5.a;
import P9.d;
import Q9.InterfaceC0578h;
import Q9.ViewOnClickListenerC0577g;
import S5.c;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.store.C;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.Y;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditTransferFragment extends MayaBaseLoadingFragment implements d, InterfaceC0254d, e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0447e f13120o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Button f13121p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f13122q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f13123r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public MayaInputLayout f13124s0;
    public C0256f t0;
    public l u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public InterfaceC0578h f13125v0;
    public final boolean w0 = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final EnumC1216e f13126x0 = EnumC1216e.TRANSFER_CREDIT;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_maya_credit_transfer_enhance, viewGroup, false);
        int i = R.id.constraintLayout;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraintLayout)) != null) {
            i = R.id.continue_transfer_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_transfer_button);
            if (button != null) {
                i = R.id.image_view_account_icon;
                if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_account_icon)) != null) {
                    i = R.id.scroll_view;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view)) != null) {
                        i = R.id.text_view_account;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account)) != null) {
                            i = R.id.text_view_available_credit;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_available_credit);
                            if (textView != null) {
                                i = R.id.text_view_from;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_from)) != null) {
                                    i = R.id.text_view_promissory_note_number;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_promissory_note_number);
                                    if (textView2 != null) {
                                        i = R.id.transfer_amount_maya_input_layout;
                                        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.transfer_amount_maya_input_layout);
                                        if (mayaInputLayout != null) {
                                            i = R.id.transfer_to_wallet_header_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transfer_to_wallet_header_text_view)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                this.f13120o0 = new C0447e(constraintLayout, button, textView, textView2, (View) mayaInputLayout, 17);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final l P1() {
        l lVar = this.u0;
        if (lVar != null) {
            return lVar;
        }
        j.n("mMayaCreditTransferFragmentPresenter");
        throw null;
    }

    public final void Q1(String str, Map map) {
        InterfaceC0578h interfaceC0578h = this.f13125v0;
        if (interfaceC0578h != null) {
            ((NewMayaCreditActivity) interfaceC0578h).Y1(str, map);
        }
    }

    public final void R1() {
        MayaInputLayout mayaInputLayout = this.f13124s0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        mayaInputLayout.getHelperErrorSpielTextView().setVisibility(0);
        MayaInputLayout mayaInputLayout2 = this.f13124s0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getHelperErrorSpielTextView().setText(getString(R.string.maya_label_transfer_to_wallet_maximum_limit));
        } else {
            j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
    }

    public final void S1() {
        InterfaceC0578h interfaceC0578h = this.f13125v0;
        if (interfaceC0578h != null) {
            ViewOnClickListenerC0577g viewOnClickListenerC0577g = new ViewOnClickListenerC0577g(this, 1);
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0578h;
            if (newMayaCreditActivity.isFinishing()) {
                E.a("NewMayaCreditActivity", "showGeolocationScanErrorDialog: Cannot show dialog, activity is finishing.");
            } else {
                E.a("NewMayaCreditActivity", "showGeolocationScanErrorDialog");
                b.Z(0, newMayaCreditActivity.getString(R.string.maya_label_location_scan_error_title), newMayaCreditActivity.getString(R.string.maya_label_location_scan_error_description), newMayaCreditActivity.getString(R.string.maya_label_try_again), newMayaCreditActivity.getString(R.string.maya_label_close), false, null, viewOnClickListenerC0577g, false, 353).show(newMayaCreditActivity.getSupportFragmentManager(), "error_dialog");
            }
        }
    }

    @Override // G5.InterfaceC0254d
    public final void T() {
        P1().m = false;
        P1().n();
    }

    public final void T1() {
        MayaInputLayout mayaInputLayout = this.f13124s0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        mayaInputLayout.p();
        Button button = this.f13121p0;
        if (button != null) {
            button.setEnabled(false);
        } else {
            j.n("mButtonContinue");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.f13126x0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C cN = aVar.n();
        C1264i0 c1264i0A = aVar.A();
        Y yV = aVar.v();
        K deviceStore = (K) aVar.f4671K.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        j.g(deviceStore, "deviceStore");
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.u0 = new l(cN, c1264i0A, yV, deviceStore, preference, flagConfigurationService, sessionPublishSubject);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment.MayaCreditTransferFragmentListener");
        this.f13125v0 = (InterfaceC0578h) componentRequireActivity;
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0578h interfaceC0578h = this.f13125v0;
        if (interfaceC0578h != null) {
            ((NewMayaCreditActivity) interfaceC0578h).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13120o0;
        j.d(c0447e);
        this.f13121p0 = (Button) c0447e.c;
        C0447e c0447e2 = this.f13120o0;
        j.d(c0447e2);
        this.f13122q0 = (TextView) c0447e2.f;
        C0447e c0447e3 = this.f13120o0;
        j.d(c0447e3);
        this.f13123r0 = (TextView) c0447e3.f4080d;
        C0447e c0447e4 = this.f13120o0;
        j.d(c0447e4);
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0447e4.e;
        this.f13124s0 = mayaInputLayout;
        mayaInputLayout.getInputEditText().addTextChangedListener(new L6.l(this, 2));
        P1().j();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.TRANSFER);
        c1219hD.n(21);
        c1219hD.j();
        c1220iO1.c(activity, c1219hD);
        Button button = this.f13121p0;
        if (button != null) {
            Ke.b.b(button, new C0332a(this, 24));
        } else {
            j.n("mButtonContinue");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.w0;
    }

    @Override // G5.InterfaceC0254d
    public final void u() {
        P1().m = true;
        P1().n();
    }
}
