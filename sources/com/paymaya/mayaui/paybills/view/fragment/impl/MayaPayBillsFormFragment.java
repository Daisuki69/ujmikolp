package com.paymaya.mayaui.paybills.view.fragment.impl;

import A5.j;
import Ci.b;
import G5.C0256f;
import Lh.h;
import N5.C0462k;
import O5.a;
import S5.c;
import aa.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import ba.C;
import ba.x;
import ba.y;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import ga.e;
import ha.q;
import ha.s;
import ha.t;
import ha.v;
import ha.w;
import java.util.HashMap;
import java.util.Map;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsFormFragment extends MayaBaseLoadingFragment implements e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public b f13417A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C0256f f13418B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public w f13419C0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public FavoriteDetails f13426K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Map f13427L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public BillerDetails f13428M0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0462k f13432o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImageView f13433p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f13434q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaInputLayout f13435r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppCompatEditText f13436s0;
    public MayaInputLayout t0;
    public AppCompatEditText u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Button f13437v0;
    public Group w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f13438x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public C f13439z0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final InterfaceC1033d f13420D0 = C1034e.b(new s(this, 3));

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f13421E0 = "";

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final InterfaceC1033d f13422F0 = C1034e.b(new s(this, 4));

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final InterfaceC1033d f13423G0 = C1034e.b(new s(this, 5));

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final InterfaceC1033d f13424H0 = C1034e.b(new s(this, 6));
    public final InterfaceC1033d I0 = C1034e.b(new s(this, 7));

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final InterfaceC1033d f13425J0 = C1034e.b(new s(this, 8));
    public final InterfaceC1033d N0 = C1034e.b(new s(this, 9));

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final InterfaceC1033d f13429O0 = C1034e.b(new s(this, 10));

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final InterfaceC1033d f13430P0 = C1034e.b(new j(27));

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final InterfaceC1033d f13431Q0 = C1034e.b(new j(26));

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_pay_bills_form, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.constraint_group_reminders;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_reminders);
            if (group != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.guideline_end_pay_bills_form;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end_pay_bills_form)) != null) {
                    i = R.id.guideline_start_pay_bills_form;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start_pay_bills_form)) != null) {
                        i = R.id.image_view_biller_logo;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_biller_logo);
                        if (imageView != null) {
                            i = R.id.image_view_reminder_icon;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_reminder_icon)) != null) {
                                i = R.id.linear_layout_dynamic_fields_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_dynamic_fields_container);
                                if (linearLayout != null) {
                                    i = R.id.maya_input_layout_account_number;
                                    MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_account_number);
                                    if (mayaInputLayout != null) {
                                        i = R.id.maya_input_layout_amount;
                                        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_amount);
                                        if (mayaInputLayout2 != null) {
                                            i = R.id.nested_scroll_view_content;
                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_content)) != null) {
                                                i = R.id.text_view_biller_name;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_biller_name);
                                                if (textView != null) {
                                                    i = R.id.text_view_paying_for_label;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_paying_for_label);
                                                    if (textView2 != null) {
                                                        i = R.id.text_view_reminder_notes;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_notes);
                                                        if (textView3 != null) {
                                                            i = R.id.text_view_reminder_title;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_title);
                                                            if (textView4 != null) {
                                                                this.f13432o0 = new C0462k(constraintLayout, button, group, imageView, linearLayout, mayaInputLayout, mayaInputLayout2, textView, textView2, textView3, textView4);
                                                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1(UIComponent uIComponent) {
        b bVar = this.f13417A0;
        if (bVar != null) {
            bVar.g(uIComponent, null, new v(this, uIComponent, 1), new t(this, uIComponent, 2), new t(this, uIComponent, 3), new t(this, uIComponent, 4));
        }
    }

    public final BillerInput.Builder Q1() {
        Object value = this.f13430P0.getValue();
        kotlin.jvm.internal.j.f(value, "getValue(...)");
        return (BillerInput.Builder) value;
    }

    public final Map R1() {
        return (Map) this.f13431Q0.getValue();
    }

    public final d S1() {
        C c = this.f13439z0;
        if (c != null) {
            return c;
        }
        kotlin.jvm.internal.j.n("mPayBillsFormFragmentPresenter");
        throw null;
    }

    public final void T1(String str) {
        HashMap map;
        MayaInputLayout mayaInputLayout;
        b bVar = this.f13417A0;
        if (bVar == null || (map = (HashMap) bVar.f) == null || (mayaInputLayout = (MayaInputLayout) map.get(str)) == null) {
            return;
        }
        mayaInputLayout.f();
        mayaInputLayout.i();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.FORM;
    }

    public final void U1(String str, Map map, int i) {
        C1219h c1219hE = C1219h.e("BILLS_PAY_ERROR_SCREEN");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strValueOf = String.valueOf(i);
        HashMap map2 = c1219hE.j;
        map2.put(StateEvent.Name.ERROR_CODE, strValueOf);
        map2.put("error_reason", str);
        map2.put("page", "Biller Form");
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        o1().b(c1219hE);
    }

    public final void V1(String accountNumber) {
        kotlin.jvm.internal.j.g(accountNumber, "accountNumber");
        AppCompatEditText appCompatEditText = this.f13436s0;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAccountNumber");
            throw null;
        }
        appCompatEditText.setText(accountNumber);
        AppCompatEditText appCompatEditText2 = this.f13436s0;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n("mEditTextAccountNumber");
            throw null;
        }
        if (appCompatEditText2 != null) {
            appCompatEditText2.setSelection(appCompatEditText2.length());
        } else {
            kotlin.jvm.internal.j.n("mEditTextAccountNumber");
            throw null;
        }
    }

    public final void W1(String amountValue) {
        kotlin.jvm.internal.j.g(amountValue, "amountValue");
        AppCompatEditText appCompatEditText = this.u0;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.setText(getString(R.string.maya_currency_symbol_with_amount_value, amountValue));
        AppCompatEditText appCompatEditText2 = this.u0;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText2.setSelection(appCompatEditText2.length());
        C0256f c0256f = this.f13418B0;
        if (c0256f != null) {
            c0256f.a();
        }
    }

    public final void X1(String amountPlaceholder) {
        kotlin.jvm.internal.j.g(amountPlaceholder, "amountPlaceholder");
        MayaInputLayout mayaInputLayout = this.t0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.setLabel(amountPlaceholder);
        MayaInputLayout mayaInputLayout2 = this.t0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.o(amountPlaceholder, true);
        } else {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
    }

    public final void Y1(String fieldKey, String str) {
        HashMap map;
        MayaInputLayout mayaInputLayout;
        AppCompatEditText inputEditText;
        kotlin.jvm.internal.j.g(fieldKey, "fieldKey");
        b bVar = this.f13417A0;
        if (bVar == null || (map = (HashMap) bVar.f) == null || (mayaInputLayout = (MayaInputLayout) map.get(fieldKey)) == null || (inputEditText = mayaInputLayout.getInputEditText()) == null) {
            return;
        }
        inputEditText.setText(str);
    }

    public final void Z1() {
        AppCompatEditText appCompatEditText = this.u0;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.setText(appCompatEditText.getText());
        AppCompatEditText appCompatEditText2 = this.u0;
        if (appCompatEditText2 != null) {
            appCompatEditText2.clearFocus();
        } else {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i4 == -1 && i == 400) {
            AppCompatEditText appCompatEditText = this.f13436s0;
            if (appCompatEditText == null) {
                kotlin.jvm.internal.j.n("mEditTextAccountNumber");
                throw null;
            }
            appCompatEditText.setText(intent != null ? intent.getStringExtra("account_number") : null);
            AppCompatEditText appCompatEditText2 = this.u0;
            if (appCompatEditText2 != null) {
                appCompatEditText2.requestFocus();
            } else {
                kotlin.jvm.internal.j.n("mEditTextAmount");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f13419C0 = (w) getActivity();
        a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13439z0 = new C((com.paymaya.data.preference.a) aVar.e.get(), aVar.g(), aVar.h(), aVar.a(), aVar.q(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) S1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        HashMap map;
        b bVar = this.f13417A0;
        if (bVar != null && (map = (HashMap) bVar.f) != null) {
            map.clear();
        }
        ((C) S1()).i();
        super.onDestroy();
        this.f13432o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        AppCompatEditText appCompatEditText = this.u0;
        String string = null;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.removeTextChangedListener(this.f13418B0);
        super.onPause();
        d dVarS1 = S1();
        BillerDetails billerDetails = this.f13428M0;
        C c = (C) dVarS1;
        if (!c.f8560d.e().isBillsPayEventsV2Enabled() || billerDetails == null) {
            return;
        }
        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((e) c.c.get());
        mayaPayBillsFormFragment.getClass();
        C1219h c1219hE = C1219h.e(AbstractC1173g.b(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        w wVar = mayaPayBillsFormFragment.f13419C0;
        if (wVar != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) wVar;
            String str = mayaPayBillsActivity.f13344w;
            if (str == null) {
                Bundle extras = mayaPayBillsActivity.getIntent().getExtras();
                if (extras != null) {
                    string = extras.getString("analytics_source_page");
                }
            } else {
                string = str;
            }
        }
        if (string != null) {
            c1219hE.j.put("source_page", string);
        }
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String strMSlug = billerDetails.mSlug();
        if (strMSlug != null) {
            c1219hE.j.put("biller_slug", strMSlug);
        }
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        String strMName = billerDetails.mName();
        if (strMName != null) {
            c1219hE.j.put("biller_name", strMName);
        }
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategorySlug = billerDetails.mCategorySlug();
        if (strMCategorySlug != null) {
            c1219hE.j.put("category_slug", strMCategorySlug);
        }
        c1219hE.k(EnumC1212a.CATEGORY_NAME, billerDetails.mCategory());
        mayaPayBillsFormFragment.o1().b(c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        w wVar = this.f13419C0;
        if (wVar != null) {
            ((MayaPayBillsActivity) wVar).Q(this);
        }
        C c = (C) S1();
        new Lh.d(new Lh.d(new h(c.f8561g.a(), zh.b.a(), 0), new x(c, 1), 0), new y(c, 1), 1).e();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        AppCompatActivity appCompatActivity2;
        ActionBar supportActionBar2;
        super.onStop();
        AppCompatActivity appCompatActivity3 = (AppCompatActivity) getActivity();
        float elevation = 0.0f;
        if (((appCompatActivity3 != null ? appCompatActivity3.getSupportActionBar() : null) != null) && (appCompatActivity2 = (AppCompatActivity) getActivity()) != null && (supportActionBar2 = appCompatActivity2.getSupportActionBar()) != null) {
            elevation = supportActionBar2.getElevation();
        }
        AppCompatActivity appCompatActivity4 = (AppCompatActivity) getActivity();
        if ((appCompatActivity4 != null ? appCompatActivity4.getSupportActionBar() : null) == null || (appCompatActivity = (AppCompatActivity) getActivity()) == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setElevation(elevation);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f13432o0;
        kotlin.jvm.internal.j.d(c0462k);
        this.f13433p0 = (ImageView) c0462k.f4133g;
        this.f13434q0 = (TextView) c0462k.c;
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0462k.j;
        this.f13435r0 = mayaInputLayout;
        this.f13436s0 = mayaInputLayout.getInputEditText();
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) c0462k.f4134k;
        this.t0 = mayaInputLayout2;
        this.u0 = mayaInputLayout2.getInputEditText();
        this.f13437v0 = (Button) c0462k.f;
        LinearLayout linearLayout = (LinearLayout) c0462k.i;
        this.w0 = (Group) c0462k.h;
        this.f13438x0 = (TextView) c0462k.e;
        this.y0 = (TextView) c0462k.f4132d;
        b bVar = new b(linearLayout);
        bVar.f = new HashMap();
        Dh.c inputFieldsDisposable = ((C) S1()).i;
        kotlin.jvm.internal.j.g(inputFieldsDisposable, "inputFieldsDisposable");
        bVar.e = inputFieldsDisposable;
        this.f13417A0 = bVar;
        Button button = this.f13437v0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
        button.setOnClickListener(new q(this, 0));
        MayaInputLayout mayaInputLayout3 = this.t0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.setHelperInfoText(getString(R.string.maya_label_pay_bills_admin_fee_may_apply));
        MayaInputLayout mayaInputLayout4 = this.t0;
        if (mayaInputLayout4 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout4.q();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("biller_slug")) == null) {
            string = "";
        }
        this.f13421E0 = string;
        ((C) S1()).j();
    }
}
