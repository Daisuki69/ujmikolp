package Xb;

import Kh.C0310o;
import N5.E;
import ac.C0679c;
import ac.EnumC0678b;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import cj.C1112C;
import cj.L;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Details;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopCategory;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.X;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2509a implements Wb.b {
    public static final zj.o j = new zj.o("[^0-9+]\\s*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final zj.o f6583k = new zj.o("[^0-9+(),.*\\-\\s]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6584d;
    public final C1285t0 e;
    public final Z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X f6585g;
    public final C1247a h;
    public final C1281r0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.paymaya.data.preference.a mPreference, C1285t0 c1285t0, Z0 z02, X x6, C1247a c1247a, C1281r0 c1281r0, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f6584d = mPreference;
        this.e = c1285t0;
        this.f = z02;
        this.f6585g = x6;
        this.h = c1247a;
        this.i = c1281r0;
    }

    public static String r(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        int iF = C2576A.F(str, "(", 0, false, 6);
        if (iF != -1) {
            str = C2576A.P(0, iF, str).toString();
        }
        return C2576A.N(C2576A.M(str, "("), ")");
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Map linkedHashMap;
        Intent intent;
        int i = 2;
        int i4 = 0;
        super.j();
        bc.e eVar = (bc.e) this.c.get();
        String strMFirstName = this.f.a().mFirstName();
        kotlin.jvm.internal.j.f(strMFirstName, "mFirstName(...)");
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) eVar;
        mayaShopPaymentFragment.getClass();
        E e = mayaShopPaymentFragment.f14035r0;
        kotlin.jvm.internal.j.d(e);
        ((TextView) e.f).setText(mayaShopPaymentFragment.getString(R.string.maya_label_include_signature, strMFirstName));
        e(new C0310o(this.h.c().e(zh.b.a()), new l(this, 1), Eh.d.c, Eh.d.f1365b).f());
        if (this.f6584d.e().isMayaShopWithCheckoutFlowEnabled()) {
            MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment2.V1().setText(mayaShopPaymentFragment2.getString(R.string.maya_label_button_continue));
        } else {
            MayaShopPaymentFragment mayaShopPaymentFragment3 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment3.V1().setText(mayaShopPaymentFragment3.getString(R.string.maya_label_button_next));
        }
        Bundle arguments = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).getArguments();
        String dataString = null;
        if ((arguments != null ? arguments.getString("product_id") : null) != null) {
            l();
            return;
        }
        FragmentActivity activity = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            dataString = intent.getDataString();
        }
        if (dataString == null || C2576A.H(dataString)) {
            cc.m mVar = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14036s0;
            if (mVar != null) {
                ((MayaShopV2Activity) mVar).finish();
                return;
            }
            return;
        }
        if (4 != com.paymaya.common.utility.C.w(dataString)) {
            cc.m mVar2 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14036s0;
            if (mVar2 != null) {
                ((MayaShopV2Activity) mVar2).finish();
                return;
            }
            return;
        }
        HashMap mapB = com.paymaya.common.utility.C.B(dataString, true);
        String str = (String) mapB.get("product");
        if (str == null || C2576A.H(str)) {
            cc.m mVar3 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14036s0;
            if (mVar3 != null) {
                ((MayaShopV2Activity) mVar3).finish();
                return;
            }
            return;
        }
        ((MayaShopPaymentFragment) ((bc.e) this.c.get())).u0 = str;
        mapB.remove("product");
        if (mapB.isEmpty()) {
            linkedHashMap = M.e();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapB.entrySet()) {
                if (zj.z.w((String) entry.getKey(), 2, "pf_", false)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(L.b(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(C2576A.M((String) entry2.getKey(), "pf_"), entry2.getValue());
            }
        }
        MayaShopPaymentFragment mayaShopPaymentFragment4 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        mayaShopPaymentFragment4.getClass();
        mayaShopPaymentFragment4.f14029B0 = linkedHashMap;
        ((MayaShopPaymentFragment) ((bc.e) this.c.get())).O1();
        new Lh.d(new Lh.d(new Lh.h(this.e.a(str), zh.b.a(), 0), new n(this, i4), i), new Qd.a(this, 9), i4).e();
    }

    public final String k(FundSource fundSource, AccountBalance accountBalance) {
        String strMName;
        return (fundSource == null || !fundSource.isTypeVirtual() || accountBalance == null) ? (fundSource == null || (strMName = fundSource.mName()) == null) ? "" : strMName : androidx.camera.core.impl.a.j(fundSource.mName(), " - ", accountBalance.mAvailableBalance().getCurrencyFormattedValue());
    }

    public final void l() {
        Bundle arguments = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("product_id") : null;
        if (string != null) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).O1();
            new Lh.d(new Lh.d(new Lh.h(this.e.a(string), zh.b.a(), 0), new l(this, 0), 2), new m(this, 0), 0).e();
        }
    }

    public final String m() {
        String strJ;
        String string;
        String strZ1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Z1();
        String str = null;
        if (strZ1 != null ? r(strZ1).equals(this.f6584d.r()) : false) {
            return null;
        }
        E e = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14035r0;
        kotlin.jvm.internal.j.d(e);
        Editable text = ((MayaInputLayout) e.m).getInputEditText().getText();
        String string2 = (text == null || (string = text.toString()) == null) ? null : C2576A.b0(string).toString();
        if (string2 != null && string2.length() != 0) {
            str = string2;
        }
        if (!((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14028A0) {
            return str;
        }
        bc.e eVar = (bc.e) this.c.get();
        String strMFirstName = this.f.a().mFirstName();
        kotlin.jvm.internal.j.f(strMFirstName, "mFirstName(...)");
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) eVar;
        mayaShopPaymentFragment.getClass();
        String string3 = mayaShopPaymentFragment.getString(R.string.pma_label_format_dash_from_signature, strMFirstName);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        return (str == null || (strJ = androidx.camera.core.impl.a.j(string2, Global.BLANK, string3)) == null) ? string3 : strJ;
    }

    public final boolean n(ProductV3 product) {
        kotlin.jvm.internal.j.g(product, "product");
        ProductProviderDetails productProviderDetails = product.getProductProviderDetails();
        List<ProductProviderField> listMProductProviderFields = productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null;
        return !(listMProductProviderFields == null || listMProductProviderFields.isEmpty());
    }

    public final boolean o(ProductV3 product) {
        kotlin.jvm.internal.j.g(product, "product");
        Details details = product.getDetails();
        return "beep".equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean p(ProductV3 product) {
        kotlin.jvm.internal.j.g(product, "product");
        Details details = product.getDetails();
        return "Cignal".equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean q(ProductV3 product) {
        kotlin.jvm.internal.j.g(product, "product");
        List<ShopCategory> shopCategories = product.getShopCategories();
        if (shopCategories != null) {
            List<ShopCategory> list = shopCategories;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if ("treats".equals(((ShopCategory) it.next()).mCode())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s(String recipientText) {
        kotlin.jvm.internal.j.g(recipientText, "recipientText");
        String strR = r(recipientText);
        int iF = C2576A.F(recipientText, "(", 0, false, 6);
        if (iF != -1) {
            recipientText = C2576A.P(iF + 1, recipientText.length(), recipientText).toString();
        }
        String strN = C2576A.N(recipientText, " (");
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        mayaShopPaymentFragment.getClass();
        mayaShopPaymentFragment.w0 = strN;
        MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        mayaShopPaymentFragment2.getClass();
        mayaShopPaymentFragment2.f14038x0 = strR;
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
        mayaAutoCompleteInputLayoutX1.f11986t = true;
        mayaAutoCompleteInputLayoutX1.c();
        ProductV3 productV3 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).t0;
        if (productV3 != null) {
            x(productV3);
        }
        u(strR);
    }

    public final void t(Integer num, String str) {
        if (this.f6584d.e().isShopEventsV2Enabled()) {
            MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment.getClass();
            C1219h c1219hE = C1219h.e("SHOP_ERROR_SCREEN");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("section", "Product Details");
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV3 = mayaShopPaymentFragment.t0;
            String provider = productV3 != null ? productV3.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV32 = mayaShopPaymentFragment.t0;
            String name = productV32 != null ? productV32.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            ProductV3 productV33 = mayaShopPaymentFragment.t0;
            String productCode = productV33 != null ? productV33.getProductCode() : null;
            if (productCode != null) {
                c1219hE.j.put("product_code", productCode);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put(StateEvent.Name.ERROR_CODE, String.valueOf(num));
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            if (str != null) {
                c1219hE.j.put("error_reason", str);
            }
            mayaShopPaymentFragment.z1(c1219hE);
        }
    }

    public final void u(String str) {
        ProductV3 productV3 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).t0;
        if (productV3 == null || n(productV3) || p(productV3) || o(productV3) || q(productV3)) {
            return;
        }
        ProductV3 productV32 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).t0;
        boolean z4 = (productV32 != null ? y(productV32) : false) && !r(str).equals(this.f6584d.r());
        if (z4) {
            E e = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14035r0;
            kotlin.jvm.internal.j.d(e);
            ((MayaInputLayout) e.m).setVisibility(0);
        } else {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).b2();
        }
        if (!z4) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).a2();
            return;
        }
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        E e7 = mayaShopPaymentFragment.f14035r0;
        kotlin.jvm.internal.j.d(e7);
        ((Group) e7.f3590l).setVisibility(0);
        mayaShopPaymentFragment.f14028A0 = mayaShopPaymentFragment.U1().isChecked();
    }

    public final void v(PayMayaError payMayaError) {
        t(Integer.valueOf(payMayaError.mErrorCode()), payMayaError.mSpiel());
        ((MayaShopPaymentFragment) ((bc.e) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        mayaShopPaymentFragment.getClass();
        cc.m mVar = mayaShopPaymentFragment.f14036s0;
        if (mVar != null) {
            ((MayaShopV2Activity) mVar).a(payMayaError, mayaShopPaymentFragment.getString(R.string.pma_toast_error_title_shop_error));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v57 */
    public final void w(ProductV3 product) {
        List<ProductProviderField> productProviderFieldList;
        int i = 2;
        int i4 = 1;
        kotlin.jvm.internal.j.g(product, "product");
        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
        mayaShopPaymentFragment.getClass();
        mayaShopPaymentFragment.t0 = product;
        String iconUrl = product.getIconUrl();
        if (iconUrl != null && !C2576A.H(iconUrl)) {
            MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment2.getClass();
            int dimensionPixelSize = mayaShopPaymentFragment2.requireContext().getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_extra_large);
            com.paymaya.common.utility.C.c0(iconUrl, R.drawable.maya_ic_shop_placeholder_white, (AppCompatImageView) mayaShopPaymentFragment2.R1().f4152g, dimensionPixelSize, dimensionPixelSize, 0);
        }
        bc.e eVar = (bc.e) this.c.get();
        String productName = product.getName();
        MayaShopPaymentFragment mayaShopPaymentFragment3 = (MayaShopPaymentFragment) eVar;
        mayaShopPaymentFragment3.getClass();
        kotlin.jvm.internal.j.g(productName, "productName");
        ((TextView) mayaShopPaymentFragment3.R1().h).setText(productName);
        Amount amountDiscounted = product.getAmountDiscounted();
        if (!product.isPromo() || amountDiscounted == null) {
            bc.e eVar2 = (bc.e) this.c.get();
            String formattedValue = product.getAmountOriginal().getFormattedValue();
            kotlin.jvm.internal.j.f(formattedValue, "getFormattedValue(...)");
            MayaShopPaymentFragment mayaShopPaymentFragment4 = (MayaShopPaymentFragment) eVar2;
            ((TextView) mayaShopPaymentFragment4.R1().c).setText(mayaShopPaymentFragment4.getString(R.string.maya_currency_symbol_with_amount_value, formattedValue));
            ((TextView) ((MayaShopPaymentFragment) ((bc.e) this.c.get())).R1().i).setVisibility(8);
        } else {
            bc.e eVar3 = (bc.e) this.c.get();
            String formattedValue2 = product.getAmountOriginal().getFormattedValue();
            kotlin.jvm.internal.j.f(formattedValue2, "getFormattedValue(...)");
            MayaShopPaymentFragment mayaShopPaymentFragment5 = (MayaShopPaymentFragment) eVar3;
            mayaShopPaymentFragment5.getClass();
            com.paymaya.common.utility.C.v0((TextView) mayaShopPaymentFragment5.R1().i);
            ((TextView) mayaShopPaymentFragment5.R1().i).setText(mayaShopPaymentFragment5.getString(R.string.maya_currency_symbol_with_amount_value, formattedValue2));
            bc.e eVar4 = (bc.e) this.c.get();
            String formattedValue3 = amountDiscounted.getFormattedValue();
            kotlin.jvm.internal.j.f(formattedValue3, "getFormattedValue(...)");
            MayaShopPaymentFragment mayaShopPaymentFragment6 = (MayaShopPaymentFragment) eVar4;
            ((TextView) mayaShopPaymentFragment6.R1().c).setText(mayaShopPaymentFragment6.getString(R.string.maya_currency_symbol_with_amount_value, formattedValue3));
            ((TextView) ((MayaShopPaymentFragment) ((bc.e) this.c.get())).R1().i).setVisibility(0);
        }
        String description = product.getDescription();
        if (description != null && !C2576A.H(description)) {
            MayaShopPaymentFragment mayaShopPaymentFragment7 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment7.getClass();
            E e = mayaShopPaymentFragment7.f14035r0;
            kotlin.jvm.internal.j.d(e);
            ((TextView) e.f3588g).setText(description);
        }
        if (n(product)) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).S1().setVisibility(0);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().getPrimaryIconImageView().setVisibility(8);
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
            mayaAutoCompleteInputLayoutX1.f11986t = false;
            mayaAutoCompleteInputLayoutX1.c();
            ProductProviderDetails productProviderDetails = product.getProductProviderDetails();
            if (productProviderDetails == null || (productProviderFieldList = productProviderDetails.mProductProviderFields()) == null) {
                productProviderFieldList = C1112C.f9377a;
            }
            MayaShopPaymentFragment mayaShopPaymentFragment8 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment8.getClass();
            kotlin.jvm.internal.j.g(productProviderFieldList, "productProviderFieldList");
            mayaShopPaymentFragment8.S1().removeAllViews();
            HashMap map = new HashMap();
            for (ProductProviderField productProviderField : productProviderFieldList) {
                String strMCode = productProviderField.mCode();
                String strMName = productProviderField.mName();
                Context contextRequireContext = mayaShopPaymentFragment8.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                MayaInputLayout mayaInputLayout = new MayaInputLayout(contextRequireContext);
                mayaInputLayout.setLabel(strMName);
                Object[] objArr = new Object[i4];
                objArr[0] = strMName;
                mayaInputLayout.setHint(mayaShopPaymentFragment8.getString(R.string.maya_format_enter_a, objArr));
                mayaInputLayout.setSingleLine(i4);
                mayaShopPaymentFragment8.S1().addView(mayaInputLayout);
                ViewGroup.LayoutParams layoutParams = mayaInputLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = (int) ((Number) mayaShopPaymentFragment8.f14031D0.getValue()).floatValue();
                }
                int i6 = i4;
                G5.A a8 = new G5.A((Function0) null, new Ld.b(mayaShopPaymentFragment8, mayaInputLayout, strMName), new Y6.h(mayaInputLayout, 2), 9);
                a8.e = new cc.k(mayaShopPaymentFragment8, i);
                AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
                String str = (String) mayaShopPaymentFragment8.f14029B0.get(productProviderField.mCode());
                if (str == null) {
                    str = "";
                }
                inputEditText.setText(str);
                inputEditText.addTextChangedListener(a8);
                if (productProviderFieldList.indexOf(productProviderField) >= productProviderFieldList.size() - 1) {
                    inputEditText.setImeOptions(6);
                }
                map.put(strMCode, mayaInputLayout);
                i4 = i6 == true ? 1 : 0;
            }
            HashMap map2 = mayaShopPaymentFragment8.f14030C0;
            map2.clear();
            map2.putAll(map);
            for (ProductProviderField productProviderField2 : productProviderFieldList) {
                bc.e eVar5 = (bc.e) this.c.get();
                String strMCode2 = productProviderField2.mCode();
                kotlin.jvm.internal.j.f(strMCode2, "mCode(...)");
                boolean zB = kotlin.jvm.internal.j.b(productProviderField2.mIsHidden(), Boolean.TRUE);
                MayaShopPaymentFragment mayaShopPaymentFragment9 = (MayaShopPaymentFragment) eVar5;
                mayaShopPaymentFragment9.getClass();
                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) mayaShopPaymentFragment9.f14030C0.get(strMCode2);
                if (mayaInputLayout2 != null) {
                    mayaInputLayout2.setVisibility(zB ? 8 : 0);
                }
            }
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).b2();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).a2();
        } else if (p(product)) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().setVisibility(0);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).S1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().getPrimaryIconImageView().setVisibility(8);
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX12 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
            mayaAutoCompleteInputLayoutX12.f11986t = false;
            mayaAutoCompleteInputLayoutX12.c();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).b2();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).a2();
            MayaShopPaymentFragment mayaShopPaymentFragment10 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment10.Q1().setLabel(mayaShopPaymentFragment10.getString(R.string.maya_label_account_number));
            mayaShopPaymentFragment10.Q1().setHint(mayaShopPaymentFragment10.getString(R.string.maya_hint_enter_account_number));
        } else if (o(product)) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().setVisibility(0);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).S1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().getPrimaryIconImageView().setVisibility(8);
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX13 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
            mayaAutoCompleteInputLayoutX13.f11986t = false;
            mayaAutoCompleteInputLayoutX13.c();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).b2();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).a2();
            MayaShopPaymentFragment mayaShopPaymentFragment11 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment11.Q1().setLabel(mayaShopPaymentFragment11.getString(R.string.maya_label_account_number));
            mayaShopPaymentFragment11.Q1().setHint(mayaShopPaymentFragment11.getString(R.string.maya_hint_enter_account_number));
        } else if (q(product)) {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).S1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().getPrimaryIconImageView().setVisibility(8);
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX14 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
            mayaAutoCompleteInputLayoutX14.f11986t = false;
            mayaAutoCompleteInputLayoutX14.c();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).b2();
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).a2();
        } else {
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).S1().setVisibility(8);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().setVisibility(0);
            ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1().getPrimaryIconImageView().setVisibility(0);
            MayaShopPaymentFragment mayaShopPaymentFragment12 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            Drawable drawable = ContextCompat.getDrawable(mayaShopPaymentFragment12.requireContext(), R.drawable.maya_bg_selector_field_white);
            C0679c c0679c = mayaShopPaymentFragment12.f14034q0;
            if (c0679c == null) {
                kotlin.jvm.internal.j.n("mRecipientAdapter");
                throw null;
            }
            c0679c.c = EnumC0678b.f7092a;
            mayaShopPaymentFragment12.X1().post(new androidx.media3.common.util.g(16, mayaShopPaymentFragment12, drawable));
            mayaShopPaymentFragment12.X1().getPrimaryIconImageView().setOnClickListener(new cc.l(mayaShopPaymentFragment12, 1));
            mayaShopPaymentFragment12.X1().getSecondaryIconImageView().setOnClickListener(new cc.l(mayaShopPaymentFragment12, 2));
            if (this.f6584d.e().isMayaShopWithCheckoutFlowEnabled()) {
                MayaShopPaymentFragment mayaShopPaymentFragment13 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
                mayaShopPaymentFragment13.X1().setLabel(mayaShopPaymentFragment13.getString(R.string.maya_label_recipient));
                mayaShopPaymentFragment13.X1().setHint(mayaShopPaymentFragment13.getString(R.string.maya_hint_add_recipient));
            } else {
                MayaShopPaymentFragment mayaShopPaymentFragment14 = (MayaShopPaymentFragment) ((bc.e) this.c.get());
                mayaShopPaymentFragment14.X1().setLabel(mayaShopPaymentFragment14.getString(R.string.maya_label_contact));
                mayaShopPaymentFragment14.X1().setHint(mayaShopPaymentFragment14.getString(R.string.maya_hint_add_contact));
            }
        }
        String str2 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).w0;
        if (str2 == null || C2576A.H(str2)) {
            bc.e eVar6 = (bc.e) this.c.get();
            String strR = this.f6584d.r();
            kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
            MayaShopPaymentFragment mayaShopPaymentFragment15 = (MayaShopPaymentFragment) eVar6;
            mayaShopPaymentFragment15.getClass();
            String str3 = "You (" + strR + ")";
            mayaShopPaymentFragment15.W1().setText(str3);
            ((o) mayaShopPaymentFragment15.Y1()).s(str3);
        }
        String strZ1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Z1();
        if (strZ1 != null) {
            u(strZ1);
        }
        ((MayaShopPaymentFragment) ((bc.e) this.c.get())).L1();
        x(product);
    }

    public final void x(ProductV3 product) {
        boolean z4;
        kotlin.jvm.internal.j.g(product, "product");
        List listA = this.f6585g.a();
        kotlin.jvm.internal.j.f(listA, "getFundSources(...)");
        boolean z5 = false;
        boolean z8 = listA.isEmpty() || ((MayaShopPaymentFragment) ((bc.e) this.c.get())).y0 != null;
        if (n(product)) {
            HashMap mapP1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).P1();
            ProductProviderDetails productProviderDetails = product.getProductProviderDetails();
            List<ProductProviderField> listMProductProviderFields = productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null;
            kotlin.jvm.internal.j.d(listMProductProviderFields);
            Iterator<ProductProviderField> it = listMProductProviderFields.iterator();
            z4 = true;
            while (it.hasNext()) {
                CharSequence charSequence = (CharSequence) mapP1.get(it.next().mCode());
                if (charSequence == null || charSequence.length() == 0) {
                    z4 = false;
                }
            }
        } else {
            z4 = true;
        }
        boolean z9 = ((p(product) || o(product)) && C2576A.H(C2576A.b0(String.valueOf(((MayaShopPaymentFragment) ((bc.e) this.c.get())).Q1().getInputEditText().getText())).toString())) ? false : true;
        boolean zY = y(product);
        if (zY) {
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).X1();
            mayaAutoCompleteInputLayoutX1.f11984r = false;
            mayaAutoCompleteInputLayoutX1.c();
        } else {
            MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) this.c.get());
            mayaShopPaymentFragment.X1().setHelperErrorText(mayaShopPaymentFragment.getString(R.string.maya_invalid_contact_number));
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX12 = mayaShopPaymentFragment.X1();
            mayaAutoCompleteInputLayoutX12.f11984r = true;
            mayaAutoCompleteInputLayoutX12.c();
        }
        if (z8 && z4 && z9 && zY) {
            z5 = true;
        }
        ((MayaShopPaymentFragment) ((bc.e) this.c.get())).V1().setEnabled(z5);
    }

    public final boolean y(ProductV3 product) {
        String strR;
        kotlin.jvm.internal.j.g(product, "product");
        if (!p(product) && !o(product) && !n(product) && !zj.z.o(((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14038x0, this.f6584d.r(), false)) {
            String str = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).f14038x0;
            if (str == null || C2576A.H(str)) {
                String strZ1 = ((MayaShopPaymentFragment) ((bc.e) this.c.get())).Z1();
                if (strZ1 == null || !f6583k.a(strZ1)) {
                    String strR2 = com.paymaya.common.utility.C.r(strZ1 != null ? j.f("", strZ1) : null);
                    if (strR2 == null || C2576A.H(strR2)) {
                    }
                }
                return false;
            }
            if (f6583k.a(str) || (strR = com.paymaya.common.utility.C.r(j.f("", str))) == null || C2576A.H(strR)) {
                return false;
            }
        }
        return true;
    }
}
