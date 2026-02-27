package com.paymaya.ui.shopv3.view.fragment.impl;

import E8.D;
import G5.ViewOnFocusChangeListenerC0253c;
import N5.E1;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.adapter.a;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.data.database.repository.k;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import fe.C1482a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import re.InterfaceC2202b;
import se.f;
import ve.e;
import we.C2425n;
import we.InterfaceC2428q;
import we.ViewOnClickListenerC2426o;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3PaymentFragment extends BaseLoadingFragment implements e {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f14812a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C1482a f14813b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public E1 f14814c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public InterfaceC2428q f14815d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a f14816e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ProductV3 f14817f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f14818g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AccountBalance f14819h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f14820i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f14821j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f14822k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public FundSource f14823l0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f14824n0;
    public boolean m0 = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Object f14825o0 = M.e();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashMap f14826p0 = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L1(com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment r19) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment.L1(com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment):void");
    }

    public static final void N1(ShopV3PaymentFragment shopV3PaymentFragment, View view) {
        j.g(view, "view");
        View viewFindViewById = view.findViewById(R.id.contact_name_text_view_pma_view_send_money_recipient_item);
        j.e(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        shopV3PaymentFragment.f14820i0 = ((TextView) viewFindViewById).getText().toString();
        View viewFindViewById2 = view.findViewById(R.id.mobile_number_text_view_pma_view_send_money_recipient_item);
        j.e(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        shopV3PaymentFragment.f14821j0 = C2576A.N(C2576A.M(((TextView) viewFindViewById2).getText().toString(), "("), ")");
    }

    public static final void O1(ShopV3PaymentFragment shopV3PaymentFragment) {
        InterfaceC2202b interfaceC2202bG1 = shopV3PaymentFragment.G1();
        C1482a c1482a = shopV3PaymentFragment.f14813b0;
        if (c1482a == null) {
            j.n("mRecipientAdapter");
            throw null;
        }
        int count = c1482a.getCount();
        boolean zHasFocus = shopV3PaymentFragment.F1().hasFocus();
        f fVar = (f) interfaceC2202bG1;
        if (count == 0) {
            ((ShopV3PaymentFragment) ((e) fVar.c.get())).F1().a();
        } else {
            ((ShopV3PaymentFragment) ((e) fVar.c.get())).F1().showDropDown();
        }
        if (zHasFocus) {
            return;
        }
        ((ShopV3PaymentFragment) ((e) fVar.c.get())).F1().requestFocus();
    }

    public final HashMap A1() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f14826p0.entrySet()) {
            String str = (String) entry.getKey();
            EditText editText = ((TextInputLayout) entry.getValue()).getEditText();
            map.put(str, String.valueOf(editText != null ? editText.getText() : null));
        }
        return map;
    }

    public final TextInputLayout B1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        TextInputLayout textInputLayout = e12.c;
        j.f(textInputLayout, "accountNumberTextInputLa…tPmaShopV3FragmentPayment");
        return textInputLayout;
    }

    public final LinearLayout C1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        LinearLayout linearLayout = e12.f;
        j.f(linearLayout, "dynamicFieldsContainerLi…tPmaFragmentShopV3Payment");
        return linearLayout;
    }

    public final TextInputEditText D1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        TextInputEditText fundSourceEditTextPmaShopV3FragmentPayment = e12.h;
        j.f(fundSourceEditTextPmaShopV3FragmentPayment, "fundSourceEditTextPmaShopV3FragmentPayment");
        return fundSourceEditTextPmaShopV3FragmentPayment;
    }

    public final TextView E1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        TextView textView = e12.f3607u;
        j.f(textView, "productPreviousPriceText…wPmaFragmentShopV3Payment");
        return textView;
    }

    public final ForcedAutoCompleteTextView F1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = e12.f3608v;
        j.f(forcedAutoCompleteTextView, "recipientAutoCompleteTex…wPmaShopV3FragmentPayment");
        return forcedAutoCompleteTextView;
    }

    public final InterfaceC2202b G1() {
        f fVar = this.f14812a0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mShopPaymentFragmentPresenter");
        throw null;
    }

    public final String H1() {
        String string;
        Editable text = F1().getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        return C2576A.b0(string).toString();
    }

    public final void I1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        Group signatureGroupPmaShopV3FragmentPayment = e12.f3612z;
        j.f(signatureGroupPmaShopV3FragmentPayment, "signatureGroupPmaShopV3FragmentPayment");
        signatureGroupPmaShopV3FragmentPayment.setVisibility(8);
        this.m0 = false;
    }

    public final void J1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        e12.e.setVisibility(8);
    }

    public final void K1() {
        E1 e12 = this.f14814c0;
        j.d(e12);
        TextInputLayout textInputLayout = e12.f3601o;
        j.f(textInputLayout, "optionalMessageTextInput…tPmaShopV3FragmentPayment");
        textInputLayout.setVisibility(8);
    }

    public final void M1(String fieldCode, String fieldLabel) {
        j.g(fieldCode, "fieldCode");
        j.g(fieldLabel, "fieldLabel");
        TextInputLayout textInputLayout = (TextInputLayout) this.f14826p0.get(fieldCode);
        if (textInputLayout == null) {
            return;
        }
        textInputLayout.setHintEnabled(false);
        textInputLayout.setError(getString(R.string.pma_error_missing_field, fieldLabel));
    }

    public final void P1() {
        InterfaceC2428q interfaceC2428q = this.f14815d0;
        if (interfaceC2428q != null) {
            ((ShopV3Activity) interfaceC2428q).o(getString(R.string.pma_toast_error_title_shop_error), getString(R.string.pma_toast_error_invalid_mobile_number));
        }
    }

    public final void Q1() {
        a aVar = this.f14816e0;
        if (aVar == null) {
            j.n("mFundSourceAdapter");
            throw null;
        }
        if (aVar.f10231a.size() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            a aVar2 = this.f14816e0;
            if (aVar2 == null) {
                j.n("mFundSourceAdapter");
                throw null;
            }
            AlertDialog alertDialogCreate = builder.setAdapter(aVar2, new D(this, 8)).create();
            j.f(alertDialogCreate, "create(...)");
            alertDialogCreate.show();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PAYMENT;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        if (getActivity() instanceof InterfaceC2428q) {
            KeyEventDispatcher.Component activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment.ShopV3PaymentFragmentListener");
            this.f14815d0 = (InterfaceC2428q) activity;
        }
        O5.a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14812a0 = new f((com.paymaya.data.preference.a) aVar.e.get(), aVar.I(), aVar.X(), aVar.t(), aVar.a(), aVar.G(), (d) aVar.f4748y.get());
        this.f14813b0 = new C1482a((Context) aVar.f4709d.get(), (com.paymaya.data.preference.a) aVar.e.get(), (k) aVar.f4732o0.get());
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14814c0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2428q interfaceC2428q = this.f14815d0;
        if (interfaceC2428q != null) {
            ((ShopV3Activity) interfaceC2428q).Q(this);
        }
        ((f) G1()).h.a().e();
        f fVar = (f) G1();
        Bundle arguments = ((ShopV3PaymentFragment) ((e) fVar.c.get())).getArguments();
        if ((arguments != null ? arguments.getString("product_id") : null) != null) {
            ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((e) fVar.c.get());
            shopV3PaymentFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = shopV3PaymentFragment.f14817f0;
            c1219h.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, productV3 != null ? productV3.getName() : null);
            ProductV3 productV32 = shopV3PaymentFragment.f14817f0;
            c1219h.j.put("code", productV32 != null ? productV32.getId() : null);
            c1219h.j.put("mode", "shop");
            shopV3PaymentFragment.o1(c1219h);
            return;
        }
        ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) ((e) fVar.c.get());
        shopV3PaymentFragment2.getClass();
        C1219h c1219h2 = new C1219h();
        c1219h2.n(2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        ProductV3 productV33 = shopV3PaymentFragment2.f14817f0;
        c1219h2.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, productV33 != null ? productV33.getName() : null);
        c1219h2.j.put("code", shopV3PaymentFragment2.f14818g0);
        c1219h2.j.put("mode", DevicePublicKeyStringDef.DIRECT);
        for (Map.Entry entry : shopV3PaymentFragment2.f14825o0.entrySet()) {
            c1219h2.h((String) entry.getKey(), (String) entry.getValue());
        }
        shopV3PaymentFragment2.o1(c1219h2);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f14816e0 = new a(getActivity(), new ArrayList(), new C2425n(this));
        D1().setOnClickListener(new ViewOnClickListenerC2426o(this, 1));
        D1().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 9));
        E1 e12 = this.f14814c0;
        j.d(e12);
        e12.f3610x.setOnClickListener(new ViewOnClickListenerC2426o(this, 2));
        E1 e13 = this.f14814c0;
        j.d(e13);
        e13.m.setOnClickListener(new ViewOnClickListenerC2426o(this, 3));
        ((f) G1()).j();
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_payment, container, false);
        int i = R.id.account_number_edit_text_pma_shop_v3_fragment_payment;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(viewInflate, R.id.account_number_edit_text_pma_shop_v3_fragment_payment);
        if (textInputEditText != null) {
            i = R.id.account_number_text_input_layout_edit_text_pma_shop_v3_fragment_payment;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.account_number_text_input_layout_edit_text_pma_shop_v3_fragment_payment);
            if (textInputLayout != null) {
                i = R.id.background_signature_view_pma_shop_v3_fragment_payment;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.background_signature_view_pma_shop_v3_fragment_payment);
                if (viewFindChildViewById != null) {
                    i = R.id.clear_contact_image_view_pma_shop_v3_fragment_payment;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.clear_contact_image_view_pma_shop_v3_fragment_payment);
                    if (imageView != null) {
                        i = R.id.content_scroll_view_pma_fragment_shop_v3_payment;
                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_scroll_view_pma_fragment_shop_v3_payment)) != null) {
                            i = R.id.dynamic_fields_container_linear_layout_pma_fragment_shop_v3_payment;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_container_linear_layout_pma_fragment_shop_v3_payment);
                            if (linearLayout != null) {
                                i = R.id.fund_source_dropdown_image_view_pma_shop_v3_fragment_payment;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_dropdown_image_view_pma_shop_v3_fragment_payment);
                                if (imageView2 != null) {
                                    i = R.id.fund_source_edit_text_pma_shop_v3_fragment_payment;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_edit_text_pma_shop_v3_fragment_payment);
                                    if (textInputEditText2 != null) {
                                        i = R.id.fund_source_text_input_layout_edit_text_pma_shop_v3_fragment_payment;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_text_input_layout_edit_text_pma_shop_v3_fragment_payment);
                                        if (textInputLayout2 != null) {
                                            i = R.id.header_space_pma_fragment_shop_v3_payment;
                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.header_space_pma_fragment_shop_v3_payment)) != null) {
                                                i = R.id.icon_white_background_view_pma_fragment_shop_v3_payment;
                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.icon_white_background_view_pma_fragment_shop_v3_payment);
                                                if (viewFindChildViewById2 != null) {
                                                    i = R.id.include_signature_content_text_view_pma_shop_v3_fragment_payment;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.include_signature_content_text_view_pma_shop_v3_fragment_payment);
                                                    if (textView != null) {
                                                        i = R.id.include_signature_label_text_view_pma_shop_v3_fragment_payment;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.include_signature_label_text_view_pma_shop_v3_fragment_payment)) != null) {
                                                            i = R.id.item_description_content_text_view_pma_shop_v3_fragment_payment;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.item_description_content_text_view_pma_shop_v3_fragment_payment);
                                                            if (textView2 != null) {
                                                                i = R.id.item_description_label_text_view_pma_shop_v3_fragment_payment;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.item_description_label_text_view_pma_shop_v3_fragment_payment)) != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                    i = R.id.left_guideline_pma_fragment_shop_v3_payment;
                                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline_pma_fragment_shop_v3_payment)) != null) {
                                                                        i = R.id.next_button_pma_fragment_shop_v3_payment;
                                                                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button_pma_fragment_shop_v3_payment);
                                                                        if (button != null) {
                                                                            i = R.id.optional_message_edit_text_pma_shop_v3_fragment_payment;
                                                                            TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(viewInflate, R.id.optional_message_edit_text_pma_shop_v3_fragment_payment);
                                                                            if (textInputEditText3 != null) {
                                                                                i = R.id.optional_message_text_input_layout_edit_text_pma_shop_v3_fragment_payment;
                                                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.optional_message_text_input_layout_edit_text_pma_shop_v3_fragment_payment);
                                                                                if (textInputLayout3 != null) {
                                                                                    i = R.id.product_current_price_text_view_pma_fragment_shop_v3_payment;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_current_price_text_view_pma_fragment_shop_v3_payment);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.product_icon_background_guide_square_space_pma_fragment_shop_v3_payment;
                                                                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_background_guide_square_space_pma_fragment_shop_v3_payment)) != null) {
                                                                                            i = R.id.product_icon_background_view_pma_fragment_shop_v3_payment;
                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.product_icon_background_view_pma_fragment_shop_v3_payment);
                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                i = R.id.product_icon_dotted_line_view_pma_fragment_shop_v3_payment;
                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.product_icon_dotted_line_view_pma_fragment_shop_v3_payment);
                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                    i = R.id.product_icon_image_view_pma_view_shop_v3_payment;
                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_image_view_pma_view_shop_v3_payment);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.product_icon_midground_top_margin_space_pma_fragment_shop_v3_payment;
                                                                                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_midground_top_margin_space_pma_fragment_shop_v3_payment)) != null) {
                                                                                                            i = R.id.product_name_text_view_pma_fragment_shop_v3_payment;
                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_view_pma_fragment_shop_v3_payment);
                                                                                                            if (textView4 != null) {
                                                                                                                i = R.id.product_preview_card_view_pma_fragment_shop_v3_payment;
                                                                                                                if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.product_preview_card_view_pma_fragment_shop_v3_payment)) != null) {
                                                                                                                    i = R.id.product_previous_price_text_view_pma_fragment_shop_v3_payment;
                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_previous_price_text_view_pma_fragment_shop_v3_payment);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i = R.id.recipient_auto_complete_text_view_pma_shop_v_3_fragment_payment;
                                                                                                                        ForcedAutoCompleteTextView forcedAutoCompleteTextView = (ForcedAutoCompleteTextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_auto_complete_text_view_pma_shop_v_3_fragment_payment);
                                                                                                                        if (forcedAutoCompleteTextView != null) {
                                                                                                                            i = R.id.recipient_text_input_layout_edit_text_pma_shop_v3_fragment_payment;
                                                                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.recipient_text_input_layout_edit_text_pma_shop_v3_fragment_payment);
                                                                                                                            if (textInputLayout4 != null) {
                                                                                                                                i = R.id.remove_signature_image_view_pma_shop_v3_fragment_payment;
                                                                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.remove_signature_image_view_pma_shop_v3_fragment_payment);
                                                                                                                                if (imageView4 != null) {
                                                                                                                                    i = R.id.right_guideline_pma_fragment_shop_v3_payment;
                                                                                                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline_pma_fragment_shop_v3_payment)) != null) {
                                                                                                                                        i = R.id.select_contact_image_view_pma_shop_v3_fragment_payment;
                                                                                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.select_contact_image_view_pma_shop_v3_fragment_payment);
                                                                                                                                        if (imageView5 != null) {
                                                                                                                                            i = R.id.signature_group_pma_shop_v3_fragment_payment;
                                                                                                                                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.signature_group_pma_shop_v3_fragment_payment);
                                                                                                                                            if (group != null) {
                                                                                                                                                this.f14814c0 = new E1(constraintLayout, textInputEditText, textInputLayout, viewFindChildViewById, imageView, linearLayout, imageView2, textInputEditText2, textInputLayout2, viewFindChildViewById2, textView, textView2, button, textInputEditText3, textInputLayout3, textView3, viewFindChildViewById3, viewFindChildViewById4, imageView3, textView4, textView5, forcedAutoCompleteTextView, textInputLayout4, imageView4, imageView5, group);
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

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error2, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
