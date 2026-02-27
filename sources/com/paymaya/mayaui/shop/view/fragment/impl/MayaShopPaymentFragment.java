package com.paymaya.mayaui.shop.view.fragment.impl;

import Ah.p;
import G5.A;
import G5.ViewOnFocusChangeListenerC0253c;
import Gh.f;
import Lh.d;
import N5.C0466m;
import N5.E;
import We.s;
import Xb.i;
import Xb.j;
import Xb.n;
import Xb.o;
import ac.C0679c;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.viewbinding.ViewBindings;
import bc.e;
import bg.AbstractC0983W;
import bj.C1034e;
import bj.InterfaceC1033d;
import cc.k;
import cc.l;
import cc.m;
import cj.C1112C;
import cj.M;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.OrderV2;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaSpinnerBottomSheetDialogFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import yk.a;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPaymentFragment extends MayaBaseLoadingFragment implements e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f14028A0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f14032o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public o f14033p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0679c f14034q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public E f14035r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public m f14036s0;
    public ProductV3 t0;
    public String u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public AccountBalance f14037v0;
    public String w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f14038x0;
    public FundSource y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Object f14039z0 = C1112C.f9377a;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public Object f14029B0 = M.e();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final HashMap f14030C0 = new HashMap();

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final InterfaceC1033d f14031D0 = C1034e.b(new k(this, 1));

    public static final void c2(MayaShopPaymentFragment mayaShopPaymentFragment) {
        boolean z4;
        String string;
        String strJ;
        String str;
        String strM;
        HashMap mapP1;
        Bundle extras;
        Amount amountOriginal;
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        if (mayaShopPaymentFragment.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(14));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", mayaShopPaymentFragment.getString(R.string.maya_label_button_continue));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str2 = mayaShopPaymentFragment.f14032o0;
            if (str2 != null) {
                c1219hE.j.put("source_page", str2);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = mayaShopPaymentFragment.t0;
            String productCode = productV3 != null ? productV3.getProductCode() : null;
            if (productCode != null) {
                c1219hE.j.put("product_code", productCode);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV32 = mayaShopPaymentFragment.t0;
            String name = productV32 != null ? productV32.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV33 = mayaShopPaymentFragment.t0;
            String provider = productV33 != null ? productV33.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV34 = mayaShopPaymentFragment.t0;
            String currencyFormattedValue = (productV34 == null || (amountOriginal = productV34.getAmountOriginal()) == null) ? null : amountOriginal.getCurrencyFormattedValue();
            if (currencyFormattedValue != null) {
                c1219hE.j.put("price", currencyFormattedValue);
            }
            mayaShopPaymentFragment.o1().b(c1219hE);
        }
        o oVar = (o) mayaShopPaymentFragment.Y1();
        ProductV3 productV35 = ((MayaShopPaymentFragment) ((e) oVar.c.get())).t0;
        if (productV35 != null) {
            if (!oVar.y(productV35)) {
                MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((e) oVar.c.get());
                mayaShopPaymentFragment2.X1().setHelperErrorText(mayaShopPaymentFragment2.getString(R.string.maya_invalid_contact_number));
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = mayaShopPaymentFragment2.X1();
                mayaAutoCompleteInputLayoutX1.f11984r = true;
                mayaAutoCompleteInputLayoutX1.c();
                return;
            }
            if (oVar.n(productV35)) {
                z4 = false;
                mapP1 = ((MayaShopPaymentFragment) ((e) oVar.c.get())).P1();
                strJ = null;
                string = null;
                str = null;
                strM = null;
            } else {
                if (oVar.p(productV35) || oVar.o(productV35)) {
                    z4 = false;
                    string = C2576A.b0(String.valueOf(((MayaShopPaymentFragment) ((e) oVar.c.get())).Q1().getInputEditText().getText())).toString();
                    strJ = null;
                } else {
                    if (oVar.q(productV35)) {
                        z4 = false;
                        strJ = null;
                    } else {
                        String str3 = ((MayaShopPaymentFragment) ((e) oVar.c.get())).f14038x0;
                        String strZ1 = ((MayaShopPaymentFragment) ((e) oVar.c.get())).Z1();
                        if (str3 != null && str3.length() != 0) {
                            String strL = c.l(((MayaShopPaymentFragment) ((e) oVar.c.get())).w0, " (", str3, ")");
                            String strR = C.r(o.j.f("", str3));
                            z4 = true;
                            str = str3;
                            strM = oVar.m();
                            mapP1 = null;
                            string = strR;
                            strJ = strL;
                        } else if (strZ1 == null || C2576A.H(strZ1)) {
                            z4 = false;
                            strJ = s.j("You (", oVar.f6584d.r(), ")");
                        } else {
                            z4 = true;
                            strJ = C.r(o.j.f("", strZ1));
                            str = strZ1;
                            strM = oVar.m();
                            mapP1 = null;
                            string = strJ;
                        }
                    }
                    string = null;
                }
                str = null;
                strM = null;
                mapP1 = null;
            }
            y5.s sVar = (e) oVar.c.get();
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.CONTINUE);
            EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("product", productV35.getProductCode());
            c1219hH.j.put("provider", productV35.getProvider());
            m mVar = ((MayaShopPaymentFragment) ((e) oVar.c.get())).f14036s0;
            String string2 = (mVar == null || (extras = ((MayaShopV2Activity) mVar).getIntent().getExtras()) == null) ? null : extras.getString("origin_screen");
            if (string2 != null) {
                EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("widget_name", string2);
            }
            ((MayaBaseFragment) sVar).A1(c1219hH);
            PaymentConfirmationSummary paymentConfirmationSummary = new PaymentConfirmationSummary(productV35, strJ, string, ((MayaShopPaymentFragment) ((e) oVar.c.get())).w0, str, strM, mapP1, ((MayaShopPaymentFragment) ((e) oVar.c.get())).y0, ((MayaShopPaymentFragment) ((e) oVar.c.get())).f14037v0, z4);
            String id = paymentConfirmationSummary.getTargetProduct().getId();
            String targetNumber = paymentConfirmationSummary.getTargetNumber();
            FundSource appliedFundSource = paymentConfirmationSummary.getAppliedFundSource();
            String strMId = appliedFundSource != null ? appliedFundSource.mId() : null;
            String message = paymentConfirmationSummary.getMessage();
            Map<String, String> dynamicFieldsCodeAndInput = paymentConfirmationSummary.getDynamicFieldsCodeAndInput();
            ((MayaShopPaymentFragment) ((e) oVar.c.get())).E1();
            if (!oVar.f6584d.e().isMayaShopWithCheckoutFlowEnabled()) {
                p pVarA = oVar.i.a(id, targetNumber, strMId, message, dynamicFieldsCodeAndInput);
                oVar.e(new d(new d(AbstractC1331a.l(pVarA, pVarA, b.a()), new i(oVar, paymentConfirmationSummary, i4), i), new Xb.k(oVar, i6), i6).e());
                return;
            }
            if (targetNumber == null) {
                targetNumber = oVar.f6584d.r();
            }
            C1281r0 c1281r0 = oVar.i;
            c1281r0.getClass();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("product_id", id);
            } catch (JSONException unused) {
                a.e();
            }
            if (!C.e(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                try {
                    jSONObject2.put("quantity", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                } catch (JSONException unused2) {
                    a.e();
                }
            }
            if (!C.e(targetNumber)) {
                try {
                    jSONObject2.put("recipient", targetNumber);
                } catch (JSONException unused3) {
                    a.e();
                }
            }
            if (!C.e(message)) {
                try {
                    jSONObject2.put("remarks", message);
                } catch (JSONException unused4) {
                    a.e();
                }
            }
            if (dynamicFieldsCodeAndInput != null && !dynamicFieldsCodeAndInput.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, String> entry : dynamicFieldsCodeAndInput.entrySet()) {
                    try {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    } catch (JSONException unused5) {
                        a.e();
                    }
                }
                try {
                    jSONObject2.put("additional_info", jSONObject3);
                } catch (JSONException unused6) {
                    a.e();
                }
            }
            jSONArray.put(jSONObject2);
            try {
                jSONObject.put("items", jSONArray);
            } catch (JSONException unused7) {
                a.e();
            }
            p<OrderV2> pVarCreateAndExecutePurchaseOrder = c1281r0.c.createAndExecutePurchaseOrder(RequestBody.create(C1281r0.f, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
            oVar.e(new d(new d(AbstractC1331a.l(pVarCreateAndExecutePurchaseOrder, pVarCreateAndExecutePurchaseOrder, b.a()), new i(oVar, paymentConfirmationSummary, i6), i), new j(oVar, i6), i6).e());
        }
    }

    public static final void d2(MayaShopPaymentFragment mayaShopPaymentFragment) {
        Amount amountOriginal;
        int i = 1;
        if (mayaShopPaymentFragment.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(14));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", "Contacts");
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str = mayaShopPaymentFragment.f14032o0;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = mayaShopPaymentFragment.t0;
            String currencyFormattedValue = null;
            String productCode = productV3 != null ? productV3.getProductCode() : null;
            if (productCode != null) {
                c1219hE.j.put("product_code", productCode);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV32 = mayaShopPaymentFragment.t0;
            String name = productV32 != null ? productV32.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV33 = mayaShopPaymentFragment.t0;
            String provider = productV33 != null ? productV33.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV34 = mayaShopPaymentFragment.t0;
            if (productV34 != null && (amountOriginal = productV34.getAmountOriginal()) != null) {
                currencyFormattedValue = amountOriginal.getCurrencyFormattedValue();
            }
            if (currencyFormattedValue != null) {
                c1219hE.j.put("price", currencyFormattedValue);
            }
            mayaShopPaymentFragment.o1().b(c1219hE);
        }
        o oVar = (o) mayaShopPaymentFragment.Y1();
        MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((e) oVar.c.get());
        mayaShopPaymentFragment2.getClass();
        try {
            AbstractC1955a.l(mayaShopPaymentFragment2).e(b.a()).g(new Gh.e(0, new f(new n(oVar, i), Eh.d.f1366d), new Xb.m(oVar, i)));
            C.R(mayaShopPaymentFragment.getActivity());
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_payment, viewGroup, false);
        int i = R.id.account_number_maya_input_layout;
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.account_number_maya_input_layout);
        if (mayaInputLayout != null) {
            i = R.id.contact_input_layout;
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.contact_input_layout);
            if (mayaAutoCompleteInputLayout != null) {
                i = R.id.content_scroll_view_pma_fragment_shop_v3_payment;
                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_scroll_view_pma_fragment_shop_v3_payment)) != null) {
                    i = R.id.detail_shop_item_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.detail_shop_item_view);
                    if (viewFindChildViewById != null) {
                        int i4 = R.id.dotted_line_separator_view;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.dotted_line_separator_view);
                        if (viewFindChildViewById2 != null) {
                            i4 = R.id.icon_background_view;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.icon_background_view);
                            if (viewFindChildViewById3 != null) {
                                i4 = R.id.icon_end_guideline;
                                if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.icon_end_guideline)) != null) {
                                    i4 = R.id.icon_white_circular_background_view;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.icon_white_circular_background_view);
                                    if (viewFindChildViewById4 != null) {
                                        i4 = R.id.product_current_price_text_view;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.product_current_price_text_view);
                                        if (textView != null) {
                                            i4 = R.id.product_icon_image_view;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.product_icon_image_view);
                                            if (appCompatImageView != null) {
                                                i4 = R.id.product_name_text_view;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.product_name_text_view);
                                                if (textView2 != null) {
                                                    i4 = R.id.product_previous_price_text_view;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.product_previous_price_text_view);
                                                    if (textView3 != null) {
                                                        C0466m c0466m = new C0466m((ConstraintLayout) viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView, appCompatImageView, textView2, textView3);
                                                        i = R.id.dynamic_fields_container_linear_layout;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_container_linear_layout);
                                                        if (linearLayout != null) {
                                                            i = R.id.fund_source_maya_input_layout;
                                                            MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_maya_input_layout);
                                                            if (mayaInputLayout2 != null) {
                                                                i = R.id.include_signature_checkbox;
                                                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.include_signature_checkbox);
                                                                if (appCompatCheckBox != null) {
                                                                    i = R.id.include_signature_content_text_view;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.include_signature_content_text_view);
                                                                    if (textView4 != null) {
                                                                        i = R.id.item_description_content_text_view;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.item_description_content_text_view);
                                                                        if (textView5 != null) {
                                                                            i = R.id.item_description_label_text_view_pma_shop_v3_fragment_payment;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.item_description_label_text_view_pma_shop_v3_fragment_payment)) != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                i = R.id.left_guideline_pma_fragment_shop_v3_payment;
                                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline_pma_fragment_shop_v3_payment)) != null) {
                                                                                    i = R.id.next_button;
                                                                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                                                                                    if (button != null) {
                                                                                        i = R.id.optional_message_maya_input_layout;
                                                                                        MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.optional_message_maya_input_layout);
                                                                                        if (mayaInputLayout3 != null) {
                                                                                            i = R.id.reminder_icon_image_view;
                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.reminder_icon_image_view)) != null) {
                                                                                                i = R.id.right_guideline_pma_fragment_shop_v3_payment;
                                                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline_pma_fragment_shop_v3_payment)) != null) {
                                                                                                    i = R.id.signature_group;
                                                                                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.signature_group);
                                                                                                    if (group != null) {
                                                                                                        this.f14035r0 = new E(constraintLayout, mayaInputLayout, mayaAutoCompleteInputLayout, c0466m, linearLayout, mayaInputLayout2, appCompatCheckBox, textView4, textView5, button, mayaInputLayout3, group);
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
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

    public final HashMap P1() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f14030C0.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(((MayaInputLayout) entry.getValue()).getInputEditText().getText()));
        }
        return map;
    }

    public final MayaInputLayout Q1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        MayaInputLayout accountNumberMayaInputLayout = (MayaInputLayout) e.h;
        kotlin.jvm.internal.j.f(accountNumberMayaInputLayout, "accountNumberMayaInputLayout");
        return accountNumberMayaInputLayout;
    }

    public final C0466m R1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        C0466m detailShopItemView = (C0466m) e.j;
        kotlin.jvm.internal.j.f(detailShopItemView, "detailShopItemView");
        return detailShopItemView;
    }

    public final LinearLayout S1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        LinearLayout dynamicFieldsContainerLinearLayout = (LinearLayout) e.c;
        kotlin.jvm.internal.j.f(dynamicFieldsContainerLinearLayout, "dynamicFieldsContainerLinearLayout");
        return dynamicFieldsContainerLinearLayout;
    }

    public final MayaInputLayout T1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        MayaInputLayout fundSourceMayaInputLayout = (MayaInputLayout) e.f3589k;
        kotlin.jvm.internal.j.f(fundSourceMayaInputLayout, "fundSourceMayaInputLayout");
        return fundSourceMayaInputLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PAYMENT;
    }

    public final AppCompatCheckBox U1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        AppCompatCheckBox includeSignatureCheckbox = (AppCompatCheckBox) e.e;
        kotlin.jvm.internal.j.f(includeSignatureCheckbox, "includeSignatureCheckbox");
        return includeSignatureCheckbox;
    }

    public final Button V1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        Button nextButton = (Button) e.f3586b;
        kotlin.jvm.internal.j.f(nextButton, "nextButton");
        return nextButton;
    }

    public final ForcedAutoCompleteTextView W1() {
        return X1().getInputAutoCompleteEditText();
    }

    public final MayaAutoCompleteInputLayout X1() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        MayaAutoCompleteInputLayout contactInputLayout = (MayaAutoCompleteInputLayout) e.i;
        kotlin.jvm.internal.j.f(contactInputLayout, "contactInputLayout");
        return contactInputLayout;
    }

    public final Wb.b Y1() {
        o oVar = this.f14033p0;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.j.n("mShopPaymentFragmentPresenter");
        throw null;
    }

    public final String Z1() {
        String string;
        Editable text = W1().getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        return C2576A.b0(string).toString();
    }

    public final void a2() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        ((Group) e.f3590l).setVisibility(8);
        this.f14028A0 = false;
    }

    public final void b2() {
        E e = this.f14035r0;
        kotlin.jvm.internal.j.d(e);
        ((MayaInputLayout) e.m).setVisibility(8);
    }

    public final void e2() {
        String string = T1().getInputEditText().getHint().toString();
        MayaSpinnerBottomSheetDialogFragment mayaSpinnerBottomSheetDialogFragment = new MayaSpinnerBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", string);
        mayaSpinnerBottomSheetDialogFragment.setArguments(bundle);
        Object list = this.f14039z0;
        kotlin.jvm.internal.j.g(list, "list");
        mayaSpinnerBottomSheetDialogFragment.f13350U.submitList(list);
        mayaSpinnerBottomSheetDialogFragment.f13349T = new Q6.n(this, 28);
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.j.f(childFragmentManager, "getChildFragmentManager(...)");
        C.t0(mayaSpinnerBottomSheetDialogFragment, childFragmentManager, "bottom_sheet_spinner");
        T1().d();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        if (getActivity() instanceof m) {
            KeyEventDispatcher.Component activity = getActivity();
            kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment.MayaShopPaymentFragmentListener");
            this.f14036s0 = (m) activity;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14032o0 = arguments.getString("source_page");
        }
        O5.a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14033p0 = new o((com.paymaya.data.preference.a) aVar.e.get(), aVar.I(), aVar.X(), aVar.t(), aVar.a(), aVar.G(), (Uh.d) aVar.f4748y.get());
        this.f14034q0 = new C0679c((Context) aVar.f4709d.get(), (com.paymaya.data.preference.a) aVar.e.get(), (com.paymaya.data.database.repository.k) aVar.f4732o0.get());
        ((AbstractC2509a) Y1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) Y1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14035r0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Amount amountOriginal;
        super.onPause();
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(13));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = this.f14032o0;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = this.t0;
            String productCode = productV3 != null ? productV3.getProductCode() : null;
            if (productCode != null) {
                c1219hE.j.put("product_code", productCode);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV32 = this.t0;
            String name = productV32 != null ? productV32.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV33 = this.t0;
            String provider = productV33 != null ? productV33.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV34 = this.t0;
            String currencyFormattedValue = (productV34 == null || (amountOriginal = productV34.getAmountOriginal()) == null) ? null : amountOriginal.getCurrencyFormattedValue();
            if (currencyFormattedValue != null) {
                c1219hE.j.put("price", currencyFormattedValue);
            }
            Wb.b bVarY1 = Y1();
            String strZ1 = Z1();
            boolean zEquals = strZ1 != null ? o.r(strZ1).equals(((o) bVarY1).f6584d.r()) : false;
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            String strValueOf = String.valueOf(!zEquals);
            if (strValueOf != null) {
                c1219hE.j.put("gifted", strValueOf);
            }
            EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV35 = this.t0;
            c1219hE.j.put("promo", String.valueOf(productV35 != null ? Boolean.valueOf(productV35.isPromo()) : null));
            o1().b(c1219hE);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f14036s0;
        if (mVar != null) {
            ((MayaShopV2Activity) mVar).Q(this);
        }
        ((o) Y1()).h.a().e();
        o oVar = (o) Y1();
        Bundle arguments = ((MayaShopPaymentFragment) ((e) oVar.c.get())).getArguments();
        if ((arguments != null ? arguments.getString("product_id") : null) != null) {
            MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((e) oVar.c.get());
            mayaShopPaymentFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = mayaShopPaymentFragment.t0;
            c1219h.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, productV3 != null ? productV3.getName() : null);
            ProductV3 productV32 = mayaShopPaymentFragment.t0;
            c1219h.j.put("code", productV32 != null ? productV32.getId() : null);
            c1219h.j.put("mode", "shop");
            c1219h.i();
            mayaShopPaymentFragment.A1(c1219h);
            return;
        }
        MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((e) oVar.c.get());
        mayaShopPaymentFragment2.getClass();
        C1219h c1219h2 = new C1219h();
        c1219h2.n(2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        ProductV3 productV33 = mayaShopPaymentFragment2.t0;
        c1219h2.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, productV33 != null ? productV33.getName() : null);
        c1219h2.j.put("code", mayaShopPaymentFragment2.u0);
        c1219h2.j.put("mode", DevicePublicKeyStringDef.DIRECT);
        c1219h2.i();
        for (Map.Entry entry : mayaShopPaymentFragment2.f14029B0.entrySet()) {
            c1219h2.h((String) entry.getKey(), (String) entry.getValue());
        }
        mayaShopPaymentFragment2.A1(c1219h2);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f14028A0 = U1().isChecked();
        A a8 = new A((Function0) null, new k(this, 0), new k(this, 3), 9);
        a8.e = new k(this, 4);
        Q1().getInputEditText().addTextChangedListener(a8);
        AppCompatEditText inputEditText = T1().getInputEditText();
        A a10 = new A();
        a10.e = new k(this, 5);
        inputEditText.addTextChangedListener(a10);
        T1().getFormContainerLayout().setOnClickListener(new l(this, 4));
        AppCompatEditText inputEditText2 = T1().getInputEditText();
        inputEditText2.setInputType(0);
        inputEditText2.setOnClickListener(new l(this, 5));
        inputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 4));
        U1().setOnClickListener(new l(this, 6));
        int i = 7;
        V1().setOnClickListener(new l(this, i));
        getParentFragmentManager().setFragmentResultListener("key_contact_request", this, new androidx.work.impl.e(this, i));
        ((o) Y1()).j();
    }
}
