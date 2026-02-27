package com.paymaya.ui.qr.view.fragment.impl;

import B5.i;
import G5.C0256f;
import G5.t;
import N5.E;
import Y6.o;
import Zd.f;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import ce.e;
import com.dynatrace.android.agent.Global;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import dOYHB6.tiZVw8.numX49;
import de.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyFormFragment extends BaseFragment implements e, t {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public E f14695S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ConstraintLayout f14696T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SwitchCompat f14697U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextInputLayout f14698V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextInputEditText f14699W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f14700X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f14701Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SwitchCompat f14702Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextInputLayout f14703a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextInputEditText f14704b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Group f14705c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f14706d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0256f f14707e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final InterfaceC1033d f14708f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final InterfaceC1033d f14709g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public f f14710h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public s f14711i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f14712j0;

    public RequestMoneyFormFragment() {
        final int i = 0;
        this.f14708f0 = C1034e.b(new Function0(this) { // from class: de.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyFormFragment f16380b;

            {
                this.f16380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ColorStateList.valueOf(C.C(this.f16380b.getContext()));
                    default:
                        return this.f16380b.requireContext().getColorStateList(R.color.pma_text_color_red_error);
                }
            }
        });
        final int i4 = 1;
        this.f14709g0 = C1034e.b(new Function0(this) { // from class: de.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyFormFragment f16380b;

            {
                this.f16380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ColorStateList.valueOf(C.C(this.f16380b.getContext()));
                    default:
                        return this.f16380b.requireContext().getColorStateList(R.color.pma_text_color_red_error);
                }
            }
        });
    }

    public static final void t1(RequestMoneyFormFragment requestMoneyFormFragment) {
        String string;
        C0256f c0256f = requestMoneyFormFragment.f14707e0;
        if (c0256f != null) {
            c0256f.a();
        }
        f fVar = (f) requestMoneyFormFragment.s1();
        SwitchCompat switchCompat = ((RequestMoneyFormFragment) ((e) fVar.c.get())).f14697U;
        if (switchCompat == null) {
            j.n("mSwitchAmount");
            throw null;
        }
        boolean zIsChecked = switchCompat.isChecked();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (zIsChecked) {
            TextInputEditText textInputEditText = ((RequestMoneyFormFragment) ((e) fVar.c.get())).f14699W;
            if (textInputEditText == null) {
                j.n("mEditTextAmount");
                throw null;
            }
            String string2 = C2576A.b0(z.t(z.t(z.t(String.valueOf(textInputEditText.getText()), "PHP", ""), Global.BLANK, ""), ",", "")).toString();
            if (string2 != null) {
                d10 = Double.parseDouble(string2);
            }
        }
        SwitchCompat switchCompat2 = ((RequestMoneyFormFragment) ((e) fVar.c.get())).f14702Z;
        if (switchCompat2 == null) {
            j.n("mSwitchMessage");
            throw null;
        }
        if (switchCompat2.isChecked()) {
            TextInputEditText textInputEditText2 = ((RequestMoneyFormFragment) ((e) fVar.c.get())).f14704b0;
            if (textInputEditText2 == null) {
                j.n("mEditTextMessage");
                throw null;
            }
            string = C2576A.b0(String.valueOf(textInputEditText2.getText())).toString();
        } else {
            string = null;
        }
        TransferAppLink transferAppLinkBuild = TransferAppLink.sBuilder().mAmount(C.u(Double.valueOf(d10))).mCurrency("PHP").mAccountType("PAYMAYA").mRecipient(fVar.f6929d.r()).mMessage(string).build();
        e eVar = (e) fVar.c.get();
        j.d(transferAppLinkBuild);
        RequestMoneyFormFragment requestMoneyFormFragment2 = (RequestMoneyFormFragment) eVar;
        requestMoneyFormFragment2.getClass();
        Bundle arguments = requestMoneyFormFragment2.getArguments();
        if (arguments != null) {
            arguments.getBoolean("has_generated_new_qr", false);
        }
        FragmentActivity fragmentActivityRequireActivity = requestMoneyFormFragment2.requireActivity();
        TextInputEditText textInputEditText3 = requestMoneyFormFragment2.f14699W;
        if (textInputEditText3 == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        TextInputEditText textInputEditText4 = requestMoneyFormFragment2.f14704b0;
        if (textInputEditText4 == null) {
            j.n("mEditTextMessage");
            throw null;
        }
        View[] viewArr = {textInputEditText3, textInputEditText4};
        for (int i = 0; i < 2; i++) {
            C.Q(fragmentActivityRequireActivity, viewArr[i]);
        }
        s sVar = requestMoneyFormFragment2.f14711i0;
        if (sVar != null) {
            RequestMoneyV3Activity requestMoneyV3Activity = (RequestMoneyV3Activity) sVar;
            requestMoneyV3Activity.getSupportFragmentManager().popBackStack();
            RequestMoneyV3NewFragment requestMoneyV3NewFragment = new RequestMoneyV3NewFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("transfer_app_link", transferAppLinkBuild);
            requestMoneyV3NewFragment.setArguments(bundle);
            AbstractC1236z.h(requestMoneyV3Activity, R.id.pma_activity_request_money_v3_fragment_container, requestMoneyV3NewFragment);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CUSTOMIZE;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        if (j.b(str, "AccountLimits")) {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.ACCOUNT_LIMITS);
            o1(c1219hH);
            s sVar = this.f14711i0;
            if (sVar != null) {
                RequestMoneyV3Activity requestMoneyV3Activity = (RequestMoneyV3Activity) sVar;
                requestMoneyV3Activity.e.getClass();
                i.b(requestMoneyV3Activity);
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment.RequestMoneyFormFragmentListener");
        this.f14711i0 = (s) activity;
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14710h0 = new f((com.paymaya.data.preference.a) aVar.e.get());
        ((AbstractC2509a) s1()).h(this);
        this.f10249R = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_request_money_form, viewGroup, false);
        int i = R.id.amount_edit_text_pma_fragment_request_money_form;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(viewInflate, R.id.amount_edit_text_pma_fragment_request_money_form);
        if (textInputEditText != null) {
            i = R.id.amount_group_pma_fragment_request_money_form;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.amount_group_pma_fragment_request_money_form);
            if (group != null) {
                i = R.id.amount_layout_text_pma_fragment_request_money_form;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_layout_text_pma_fragment_request_money_form);
                if (textInputLayout != null) {
                    i = R.id.container_pma_fragment_request_money_form;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_pma_fragment_request_money_form);
                    if (constraintLayout != null) {
                        i = R.id.generate_button_pma_fragment_request_money_form;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.generate_button_pma_fragment_request_money_form);
                        if (button != null) {
                            i = R.id.include_message_switch_pma_fragment_request_money_form;
                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.include_message_switch_pma_fragment_request_money_form);
                            if (switchCompat != null) {
                                i = R.id.include_message_text_pma_fragment_request_money_form;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.include_message_text_pma_fragment_request_money_form)) != null) {
                                    i = R.id.message_edit_text_pma_fragment_request_money_form;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(viewInflate, R.id.message_edit_text_pma_fragment_request_money_form);
                                    if (textInputEditText2 != null) {
                                        i = R.id.message_group_pma_fragment_request_money_form;
                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.message_group_pma_fragment_request_money_form);
                                        if (group2 != null) {
                                            i = R.id.message_layout_text_pma_fragment_request_money_form;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.message_layout_text_pma_fragment_request_money_form);
                                            if (textInputLayout2 != null) {
                                                i = R.id.refer_to_account_limits_text_pma_fragment_request_money_form;
                                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.refer_to_account_limits_text_pma_fragment_request_money_form);
                                                if (htmlTextView != null) {
                                                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                    i = R.id.specify_amount_switch_pma_fragment_request_money_form;
                                                    SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.specify_amount_switch_pma_fragment_request_money_form);
                                                    if (switchCompat2 != null) {
                                                        i = R.id.specify_amount_text_pma_fragment_request_money_form;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.specify_amount_text_pma_fragment_request_money_form)) != null) {
                                                            this.f14695S = new E(nestedScrollView, textInputEditText, group, textInputLayout, constraintLayout, button, switchCompat, textInputEditText2, group2, textInputLayout2, htmlTextView, switchCompat2);
                                                            j.f(nestedScrollView, "getRoot(...)");
                                                            return nestedScrollView;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) s1()).i();
        super.onDestroy();
        this.f14695S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s sVar = this.f14711i0;
        if (sVar != null) {
            ((RequestMoneyV3Activity) sVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        E e = this.f14695S;
        j.d(e);
        this.f14696T = (ConstraintLayout) e.f;
        E e7 = this.f14695S;
        j.d(e7);
        this.f14697U = (SwitchCompat) e7.m;
        E e10 = this.f14695S;
        j.d(e10);
        this.f14698V = (TextInputLayout) e10.e;
        E e11 = this.f14695S;
        j.d(e11);
        this.f14699W = (TextInputEditText) e11.c;
        E e12 = this.f14695S;
        j.d(e12);
        this.f14700X = (HtmlTextView) e12.f3589k;
        E e13 = this.f14695S;
        j.d(e13);
        this.f14701Y = (Group) e13.f3590l;
        E e14 = this.f14695S;
        j.d(e14);
        this.f14702Z = (SwitchCompat) e14.f3588g;
        E e15 = this.f14695S;
        j.d(e15);
        this.f14703a0 = (TextInputLayout) e15.j;
        E e16 = this.f14695S;
        j.d(e16);
        this.f14704b0 = (TextInputEditText) e16.h;
        E e17 = this.f14695S;
        j.d(e17);
        this.f14705c0 = (Group) e17.i;
        E e18 = this.f14695S;
        j.d(e18);
        this.f14706d0 = (Button) e18.f3586b;
        SwitchCompat switchCompat = this.f14697U;
        if (switchCompat == null) {
            j.n("mSwitchAmount");
            throw null;
        }
        final int i = 0;
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: de.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyFormFragment f16378b;

            {
                this.f16378b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i) {
                    case 0:
                        RequestMoneyFormFragment requestMoneyFormFragment = this.f16378b;
                        Group group = requestMoneyFormFragment.f14701Y;
                        if (group == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bd1b"));
                            throw null;
                        }
                        group.setVisibility(z4 ? 0 : 8);
                        ((Zd.f) requestMoneyFormFragment.s1()).k();
                        requestMoneyFormFragment.u1();
                        return;
                    default:
                        RequestMoneyFormFragment requestMoneyFormFragment2 = this.f16378b;
                        Group group2 = requestMoneyFormFragment2.f14705c0;
                        if (group2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bd1P"));
                            throw null;
                        }
                        group2.setVisibility(z4 ? 0 : 8);
                        ((Zd.f) requestMoneyFormFragment2.s1()).k();
                        requestMoneyFormFragment2.u1();
                        return;
                }
            }
        });
        SwitchCompat switchCompat2 = this.f14702Z;
        if (switchCompat2 == null) {
            j.n("mSwitchMessage");
            throw null;
        }
        final int i4 = 1;
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: de.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyFormFragment f16378b;

            {
                this.f16378b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i4) {
                    case 0:
                        RequestMoneyFormFragment requestMoneyFormFragment = this.f16378b;
                        Group group = requestMoneyFormFragment.f14701Y;
                        if (group == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bd1b"));
                            throw null;
                        }
                        group.setVisibility(z4 ? 0 : 8);
                        ((Zd.f) requestMoneyFormFragment.s1()).k();
                        requestMoneyFormFragment.u1();
                        return;
                    default:
                        RequestMoneyFormFragment requestMoneyFormFragment2 = this.f16378b;
                        Group group2 = requestMoneyFormFragment2.f14705c0;
                        if (group2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bd1P"));
                            throw null;
                        }
                        group2.setVisibility(z4 ? 0 : 8);
                        ((Zd.f) requestMoneyFormFragment2.s1()).k();
                        requestMoneyFormFragment2.u1();
                        return;
                }
            }
        });
        ((f) s1()).j();
        HtmlTextView htmlTextView = this.f14700X;
        if (htmlTextView == null) {
            j.n("mHtmlTextAccountLimits");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        Button button = this.f14706d0;
        if (button != null) {
            button.setOnClickListener(new o(this, 25));
        } else {
            j.n("mButtonGenerate");
            throw null;
        }
    }

    public final void r1() {
        Button button = this.f14706d0;
        if (button == null) {
            j.n("mButtonGenerate");
            throw null;
        }
        button.setEnabled(true);
        Button button2 = this.f14706d0;
        if (button2 != null) {
            button2.setBackgroundResource(R.drawable.pma_selectable_background_solid_round_rect_blue);
        } else {
            j.n("mButtonGenerate");
            throw null;
        }
    }

    public final Yd.a s1() {
        f fVar = this.f14710h0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mRequestMoneyFormFragmentPresenter");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            r5 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.f14696T
            java.lang.String r2 = "mViewContainer"
            r3 = 0
            if (r1 == 0) goto L51
            r0.clone(r1)
            androidx.appcompat.widget.SwitchCompat r1 = r5.f14697U
            if (r1 == 0) goto L4b
            boolean r1 = r1.isChecked()
            if (r1 != 0) goto L2c
            androidx.appcompat.widget.SwitchCompat r1 = r5.f14702Z
            if (r1 == 0) goto L26
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L24
            goto L2c
        L24:
            r1 = 0
            goto L2e
        L26:
            java.lang.String r0 = "mSwitchMessage"
            kotlin.jvm.internal.j.n(r0)
            throw r3
        L2c:
            r1 = 1065353216(0x3f800000, float:1.0)
        L2e:
            android.widget.Button r4 = r5.f14706d0
            if (r4 == 0) goto L45
            int r4 = r4.getId()
            r0.setVerticalBias(r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.f14696T
            if (r1 == 0) goto L41
            r0.applyTo(r1)
            return
        L41:
            kotlin.jvm.internal.j.n(r2)
            throw r3
        L45:
            java.lang.String r0 = "mButtonGenerate"
            kotlin.jvm.internal.j.n(r0)
            throw r3
        L4b:
            java.lang.String r0 = "mSwitchAmount"
            kotlin.jvm.internal.j.n(r0)
            throw r3
        L51:
            kotlin.jvm.internal.j.n(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment.u1():void");
    }
}
