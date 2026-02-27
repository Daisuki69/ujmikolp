package se;

import G5.F;
import G5.ViewOnFocusChangeListenerC0253c;
import Kh.C0310o;
import N5.E1;
import We.A;
import We.G;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import cj.C1112C;
import cj.L;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1231u;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Details;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopCategory;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.X;
import com.paymaya.domain.store.Z0;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import dOYHB6.tiZVw8.numX49;
import fe.C1482a;
import i2.C1585a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o6.C1967a;
import ph.C2070f1;
import re.InterfaceC2202b;
import we.C2425n;
import we.InterfaceC2428q;
import we.ViewOnClickListenerC2426o;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends AbstractC2509a implements InterfaceC2202b {
    public static final o j = new o(numX49.tnTj78("bF3P"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f20058k = new o(numX49.tnTj78("bF3b"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f20059d;
    public final C1285t0 e;
    public final Z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X f20060g;
    public final C1247a h;
    public final C1281r0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.paymaya.data.preference.a aVar, C1285t0 c1285t0, Z0 z02, X x6, C1247a c1247a, C1281r0 c1281r0, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bF32"));
        this.f20059d = aVar;
        this.e = c1285t0;
        this.f = z02;
        this.f20060g = x6;
        this.h = c1247a;
        this.i = c1281r0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strTnTj78;
        Map linkedHashMap;
        Intent intent;
        int i = 2;
        int i4 = 0;
        super.j();
        ve.e eVar = (ve.e) this.c.get();
        String strMFirstName = this.f.a().mFirstName();
        kotlin.jvm.internal.j.f(strMFirstName, numX49.tnTj78("bF3L"));
        ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) eVar;
        shopV3PaymentFragment.getClass();
        E1 e12 = shopV3PaymentFragment.f14814c0;
        kotlin.jvm.internal.j.d(e12);
        e12.f3598k.setText(shopV3PaymentFragment.getString(R.string.pma_label_format_from_signature, strMFirstName));
        e(new C0310o(this.h.c().e(zh.b.a()), new p8.a(this, 14), Eh.d.c, Eh.d.f1365b).f());
        Bundle arguments = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).getArguments();
        String dataString = null;
        if ((arguments != null ? arguments.getString(numX49.tnTj78("bF3r")) : null) != null) {
            l();
            return;
        }
        FragmentActivity activity = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            dataString = intent.getDataString();
        }
        if (dataString == null || C2576A.H(dataString)) {
            InterfaceC2428q interfaceC2428q = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14815d0;
            if (interfaceC2428q != null) {
                ((ShopV3Activity) interfaceC2428q).finish();
                return;
            }
            return;
        }
        if (4 != C.w(dataString)) {
            InterfaceC2428q interfaceC2428q2 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14815d0;
            if (interfaceC2428q2 != null) {
                ((ShopV3Activity) interfaceC2428q2).finish();
                return;
            }
            return;
        }
        HashMap mapB = C.B(dataString, true);
        String strTnTj782 = numX49.tnTj78("bF3Z");
        String str = (String) mapB.get(strTnTj782);
        if (str == null || C2576A.H(str)) {
            InterfaceC2428q interfaceC2428q3 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14815d0;
            if (interfaceC2428q3 != null) {
                ((ShopV3Activity) interfaceC2428q3).finish();
                return;
            }
            return;
        }
        ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14818g0 = str;
        mapB.remove(strTnTj782);
        if (mapB.isEmpty()) {
            linkedHashMap = M.e();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = mapB.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                strTnTj78 = numX49.tnTj78("bF3k");
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (z.w((String) entry.getKey(), 2, strTnTj78, false)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(L.b(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(C2576A.M((String) entry2.getKey(), strTnTj78), entry2.getValue());
            }
        }
        ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
        shopV3PaymentFragment2.getClass();
        shopV3PaymentFragment2.f14825o0 = linkedHashMap;
        ((ShopV3PaymentFragment) ((ve.e) this.c.get())).z1();
        new Lh.d(new Lh.d(new Lh.h(this.e.a(str), zh.b.a(), 0), new qc.c(this, 8), i), new C2070f1(this, 10), i4).e();
    }

    public final String k(FundSource fundSource, AccountBalance accountBalance) {
        String strMName;
        return (fundSource == null || !fundSource.isTypeVirtual() || accountBalance == null) ? (fundSource == null || (strMName = fundSource.mName()) == null) ? numX49.tnTj78("bF3u") : strMName : androidx.camera.core.impl.a.j(fundSource.mName(), numX49.tnTj78("bF3B"), accountBalance.mAvailableBalance().getCurrencyFormattedValue());
    }

    public final void l() {
        Bundle arguments = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString(numX49.tnTj78("bF3V")) : null;
        if (string != null) {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).z1();
            new Lh.d(new Lh.d(new Lh.h(this.e.a(string), zh.b.a(), 0), new o6.f(this, 11), 2), new C1967a(this, 15), 0).e();
        }
    }

    public final String m() {
        String string;
        E1 e12 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
        kotlin.jvm.internal.j.d(e12);
        Editable text = e12.f3600n.getText();
        String string2 = (text == null || (string = text.toString()) == null) ? null : C2576A.b0(string).toString();
        if (!((ShopV3PaymentFragment) ((ve.e) this.c.get())).m0) {
            return string2;
        }
        ve.e eVar = (ve.e) this.c.get();
        String strMFirstName = this.f.a().mFirstName();
        kotlin.jvm.internal.j.f(strMFirstName, numX49.tnTj78("bF3S"));
        ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) eVar;
        shopV3PaymentFragment.getClass();
        String string3 = shopV3PaymentFragment.getString(R.string.pma_label_format_dash_from_signature, strMFirstName);
        kotlin.jvm.internal.j.f(string3, numX49.tnTj78("bF3j"));
        return (string2 == null || string2.length() == 0) ? string3 : androidx.camera.core.impl.a.j(string2, numX49.tnTj78("bF3d"), string3);
    }

    public final boolean n(ProductV3 productV3) {
        kotlin.jvm.internal.j.g(productV3, numX49.tnTj78("bF3i"));
        ProductProviderDetails productProviderDetails = productV3.getProductProviderDetails();
        List<ProductProviderField> listMProductProviderFields = productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null;
        return !(listMProductProviderFields == null || listMProductProviderFields.isEmpty());
    }

    public final boolean o(ProductV3 productV3) {
        kotlin.jvm.internal.j.g(productV3, numX49.tnTj78("bF3E"));
        Details details = productV3.getDetails();
        return numX49.tnTj78("bF3F").equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean p(ProductV3 productV3) {
        kotlin.jvm.internal.j.g(productV3, numX49.tnTj78("bF3H"));
        Details details = productV3.getDetails();
        return numX49.tnTj78("bF3O").equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean q(ProductV3 productV3) {
        kotlin.jvm.internal.j.g(productV3, numX49.tnTj78("bF3Q"));
        List<ShopCategory> shopCategories = productV3.getShopCategories();
        if (shopCategories != null) {
            List<ShopCategory> list = shopCategories;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (numX49.tnTj78("bF3t").equals(((ShopCategory) it.next()).mCode())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
    public final void r(ProductV3 productV3) {
        List<ProductProviderField> listMProductProviderFields;
        kotlin.jvm.internal.j.g(productV3, numX49.tnTj78("bF3U"));
        ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((ve.e) this.c.get());
        shopV3PaymentFragment.getClass();
        shopV3PaymentFragment.f14817f0 = productV3;
        String iconUrl = productV3.getIconUrl();
        if (iconUrl != null && !C2576A.H(iconUrl)) {
            ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            shopV3PaymentFragment2.getClass();
            shopV3PaymentFragment2.requireContext();
            E1 e12 = shopV3PaymentFragment2.f14814c0;
            kotlin.jvm.internal.j.d(e12);
            ImageView imageView = e12.f3605s;
            G gH = A.d().h(iconUrl);
            gH.h(2131232014);
            gH.i(new C1231u());
            gH.e(imageView, null);
        }
        ve.e eVar = (ve.e) this.c.get();
        String name = productV3.getName();
        ShopV3PaymentFragment shopV3PaymentFragment3 = (ShopV3PaymentFragment) eVar;
        shopV3PaymentFragment3.getClass();
        kotlin.jvm.internal.j.g(name, numX49.tnTj78("bF3e"));
        E1 e13 = shopV3PaymentFragment3.f14814c0;
        kotlin.jvm.internal.j.d(e13);
        e13.f3606t.setText(name);
        Amount amountDiscounted = productV3.getAmountDiscounted();
        boolean zIsPromo = productV3.isPromo();
        String strTnTj78 = numX49.tnTj78("bF38");
        if (!zIsPromo || amountDiscounted == null) {
            ve.e eVar2 = (ve.e) this.c.get();
            String currencyFormattedValue = productV3.getAmountOriginal().getCurrencyFormattedValue();
            kotlin.jvm.internal.j.f(currencyFormattedValue, strTnTj78);
            E1 e14 = ((ShopV3PaymentFragment) eVar2).f14814c0;
            kotlin.jvm.internal.j.d(e14);
            e14.f3602p.setText(currencyFormattedValue);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).E1().setVisibility(8);
        } else {
            ve.e eVar3 = (ve.e) this.c.get();
            String currencyFormattedValue2 = productV3.getAmountOriginal().getCurrencyFormattedValue();
            kotlin.jvm.internal.j.f(currencyFormattedValue2, strTnTj78);
            ShopV3PaymentFragment shopV3PaymentFragment4 = (ShopV3PaymentFragment) eVar3;
            shopV3PaymentFragment4.getClass();
            C.v0(shopV3PaymentFragment4.E1());
            shopV3PaymentFragment4.E1().setText(currencyFormattedValue2);
            ve.e eVar4 = (ve.e) this.c.get();
            String currencyFormattedValue3 = amountDiscounted.getCurrencyFormattedValue();
            kotlin.jvm.internal.j.f(currencyFormattedValue3, strTnTj78);
            E1 e15 = ((ShopV3PaymentFragment) eVar4).f14814c0;
            kotlin.jvm.internal.j.d(e15);
            e15.f3602p.setText(currencyFormattedValue3);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).E1().setVisibility(0);
        }
        String description = productV3.getDescription();
        if (description != null && !C2576A.H(description)) {
            ShopV3PaymentFragment shopV3PaymentFragment5 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            shopV3PaymentFragment5.getClass();
            E1 e16 = shopV3PaymentFragment5.f14814c0;
            kotlin.jvm.internal.j.d(e16);
            e16.f3599l.setText(description);
        }
        if (n(productV3)) {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).B1().setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).C1().setVisibility(0);
            E1 e17 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e17);
            e17.f3609w.setVisibility(8);
            E1 e18 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e18);
            e18.f3611y.setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).J1();
            ProductProviderDetails productProviderDetails = productV3.getProductProviderDetails();
            if (productProviderDetails == null || (listMProductProviderFields = productProviderDetails.mProductProviderFields()) == null) {
                listMProductProviderFields = C1112C.f9377a;
            }
            ShopV3PaymentFragment shopV3PaymentFragment6 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            shopV3PaymentFragment6.getClass();
            kotlin.jvm.internal.j.g(listMProductProviderFields, numX49.tnTj78("bF3C"));
            shopV3PaymentFragment6.C1().removeAllViews();
            HashMap map = new HashMap();
            LayoutInflater layoutInflater = shopV3PaymentFragment6.getLayoutInflater();
            kotlin.jvm.internal.j.f(layoutInflater, numX49.tnTj78("bF34"));
            for (ProductProviderField productProviderField : listMProductProviderFields) {
                String strMCode = productProviderField.mCode();
                String strMName = productProviderField.mName();
                View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_payment_dynamic_field, (ViewGroup) shopV3PaymentFragment6.C1(), false);
                kotlin.jvm.internal.j.e(viewInflate, numX49.tnTj78("bF3o"));
                TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
                shopV3PaymentFragment6.C1().addView(textInputLayout);
                textInputLayout.setHint(strMName);
                G5.l lVar = new G5.l(textInputLayout);
                C1585a c1585a = new C1585a(6, shopV3PaymentFragment6, strMCode, strMName);
                C2425n c2425n = new C2425n(shopV3PaymentFragment6);
                lVar.f1751b = c1585a;
                lVar.c = c2425n;
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.addTextChangedListener(lVar);
                    String strTnTj782 = (String) shopV3PaymentFragment6.f14825o0.get(productProviderField.mCode());
                    if (strTnTj782 == null) {
                        strTnTj782 = numX49.tnTj78("bF3K");
                    }
                    editText.setText(strTnTj782);
                    if (listMProductProviderFields.indexOf(productProviderField) >= listMProductProviderFields.size() - 1) {
                        editText.setImeOptions(6);
                    }
                }
                map.put(strMCode, textInputLayout);
            }
            HashMap map2 = shopV3PaymentFragment6.f14826p0;
            map2.clear();
            map2.putAll(map);
            for (ProductProviderField productProviderField2 : listMProductProviderFields) {
                ve.e eVar5 = (ve.e) this.c.get();
                String strMCode2 = productProviderField2.mCode();
                kotlin.jvm.internal.j.f(strMCode2, numX49.tnTj78("bF3w"));
                boolean zB = kotlin.jvm.internal.j.b(productProviderField2.mIsHidden(), Boolean.TRUE);
                ShopV3PaymentFragment shopV3PaymentFragment7 = (ShopV3PaymentFragment) eVar5;
                shopV3PaymentFragment7.getClass();
                TextInputLayout textInputLayout2 = (TextInputLayout) shopV3PaymentFragment7.f14826p0.get(strMCode2);
                if (textInputLayout2 != null) {
                    textInputLayout2.setVisibility(zB ? 8 : 0);
                }
            }
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).K1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).I1();
        } else if (p(productV3)) {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).B1().setVisibility(0);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).C1().setVisibility(8);
            E1 e19 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e19);
            e19.f3609w.setVisibility(8);
            E1 e110 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e110);
            e110.f3611y.setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).J1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).K1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).I1();
            ShopV3PaymentFragment shopV3PaymentFragment8 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            shopV3PaymentFragment8.B1().setHint(shopV3PaymentFragment8.getString(R.string.pma_hint_cignal_account_number));
        } else if (o(productV3)) {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).B1().setVisibility(0);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).C1().setVisibility(8);
            E1 e111 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e111);
            e111.f3609w.setVisibility(8);
            E1 e112 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e112);
            e112.f3611y.setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).J1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).K1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).I1();
            ShopV3PaymentFragment shopV3PaymentFragment9 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            shopV3PaymentFragment9.B1().setHint(shopV3PaymentFragment9.getString(R.string.pma_hint_beep_card_account_number));
        } else if (q(productV3)) {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).B1().setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).C1().setVisibility(8);
            E1 e113 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e113);
            e113.f3609w.setVisibility(8);
            E1 e114 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e114);
            e114.f3611y.setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).J1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).K1();
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).I1();
        } else {
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).B1().setVisibility(8);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).C1().setVisibility(8);
            E1 e115 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e115);
            e115.f3609w.setVisibility(0);
            E1 e116 = ((ShopV3PaymentFragment) ((ve.e) this.c.get())).f14814c0;
            kotlin.jvm.internal.j.d(e116);
            e116.f3611y.setVisibility(0);
            ((ShopV3PaymentFragment) ((ve.e) this.c.get())).J1();
            final ShopV3PaymentFragment shopV3PaymentFragment10 = (ShopV3PaymentFragment) ((ve.e) this.c.get());
            C1482a c1482a = shopV3PaymentFragment10.f14813b0;
            String strTnTj783 = numX49.tnTj78("bF3c");
            if (c1482a == null) {
                kotlin.jvm.internal.j.n(strTnTj783);
                throw null;
            }
            c1482a.c = 1;
            ForcedAutoCompleteTextView forcedAutoCompleteTextViewF1 = shopV3PaymentFragment10.F1();
            C1482a c1482a2 = shopV3PaymentFragment10.f14813b0;
            if (c1482a2 == null) {
                kotlin.jvm.internal.j.n(strTnTj783);
                throw null;
            }
            forcedAutoCompleteTextViewF1.setAdapter(c1482a2);
            forcedAutoCompleteTextViewF1.addTextChangedListener(new F(shopV3PaymentFragment10, 8));
            forcedAutoCompleteTextViewF1.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: we.p
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
                    ShopV3PaymentFragment shopV3PaymentFragment11 = shopV3PaymentFragment10;
                    Callback.onItemClick_enter(view, i);
                    try {
                        ShopV3PaymentFragment.N1(shopV3PaymentFragment11, view);
                    } finally {
                        Callback.onItemClick_exit();
                    }
                }
            });
            forcedAutoCompleteTextViewF1.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(forcedAutoCompleteTextViewF1, 10));
            E1 e117 = shopV3PaymentFragment10.f14814c0;
            kotlin.jvm.internal.j.d(e117);
            e117.f3611y.setOnClickListener(new ViewOnClickListenerC2426o(shopV3PaymentFragment10, 5));
            E1 e118 = shopV3PaymentFragment10.f14814c0;
            kotlin.jvm.internal.j.d(e118);
            e118.e.setOnClickListener(new ViewOnClickListenerC2426o(shopV3PaymentFragment10, 6));
        }
        ((ShopV3PaymentFragment) ((ve.e) this.c.get())).w1();
    }
}
