package com.paymaya.mayaui.shop.view.fragment.impl;

import Ah.p;
import D8.C0214w;
import Kh.T;
import Lh.h;
import M5.e;
import N5.C0453g;
import Q6.r;
import Xa.c;
import Y6.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.lifecycle.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import b7.f;
import bc.d;
import c7.C1079c;
import cc.InterfaceC1097j;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPaymentConfirmationFragment extends MayaBaseFragment implements d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Toolbar f14021U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0453g f14022V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0214w f14023W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public PaymentConfirmationSummary f14024X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Order f14025Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final f f14026Z = new f();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC1097j f14027a0;

    public static final void G1(MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment) {
        ProductV3 targetProduct;
        int i = 0;
        int i4 = 2;
        C0214w c0214w = mayaShopPaymentConfirmationFragment.f14023W;
        if (c0214w == null) {
            j.n("mShopPaymentConfirmationFragmentPresenter");
            throw null;
        }
        Order order = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).f14025Y;
        PaymentConfirmationSummary paymentConfirmationSummary = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).f14024X;
        String id = (paymentConfirmationSummary == null || (targetProduct = paymentConfirmationSummary.getTargetProduct()) == null) ? null : targetProduct.getId();
        ((MayaBaseFragment) ((d) c0214w.c.get())).E1();
        C1281r0 c1281r0 = (C1281r0) c0214w.f;
        p<Order> pVarExecutePurchaseOrder = c1281r0.f11477b.executePurchaseOrder(order != null ? order.mId() : null);
        a aVar = new a(26, c1281r0, id);
        pVarExecutePurchaseOrder.getClass();
        c0214w.e(new T(5, new Lh.d(new Lh.d(new h(new Lh.d(pVarExecutePurchaseOrder, aVar, i4), b.a(), 0), new r(c0214w, 10), i4), new Qd.a(c0214w, 8), i), new c(c0214w, 2)).e());
    }

    public final void H1(String str) {
        C0453g c0453g = this.f14022V;
        j.d(c0453g);
        ((TextView) c0453g.c).setText(getString(R.string.maya_currency_with_value, str));
        C0453g c0453g2 = this.f14022V;
        j.d(c0453g2);
        ((Button) c0453g2.f4095d).setText(getString(R.string.maya_shop_pay_button_label, str));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f14027a0 = (InterfaceC1097j) getActivity();
        O5.a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C0214w c0214w = new C0214w(aVar.G(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get());
        this.f14023W = c0214w;
        c0214w.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        j.g(menu, "menu");
        j.g(menuInflater, "menuInflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        Toolbar toolbar = this.f14021U;
        if (toolbar == null) {
            j.n("mToolbar");
            throw null;
        }
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.maya_menu_shop_purchase_history_icon);
        menuItemFindItem.setVisible(false);
        menuItemFindItem.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_shop_confirmation, viewGroup, false);
        int i = R.id.amount_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_view);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.confirm_payment_scroll_view;
            if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.confirm_payment_scroll_view)) != null) {
                i = R.id.confirm_payment_title_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.confirm_payment_title_text_view)) != null) {
                    i = R.id.pay_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.pay_button);
                    if (button != null) {
                        i = R.id.payment_details_review_info_recycler_view;
                        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.payment_details_review_info_recycler_view);
                        if (mayaReviewInfoRecyclerView != null) {
                            i = R.id.vertical_middle_guideline;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.vertical_middle_guideline)) != null) {
                                this.f14022V = new C0453g(17, constraintLayout, textView, button, mayaReviewInfoRecyclerView);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0214w c0214w = this.f14023W;
        if (c0214w == null) {
            j.n("mShopPaymentConfirmationFragmentPresenter");
            throw null;
        }
        c0214w.i();
        super.onDestroy();
        this.f14022V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1097j interfaceC1097j = this.f14027a0;
        if (interfaceC1097j != null) {
            ((MayaShopV2Activity) interfaceC1097j).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f14021U = (Toolbar) requireActivity().findViewById(R.id.toolbar);
        C0453g c0453g = this.f14022V;
        j.d(c0453g);
        ((MayaReviewInfoRecyclerView) c0453g.e).setAdapter(this.f14026Z);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14024X = (PaymentConfirmationSummary) arguments.getParcelable("payment_confirmation_summary");
            Order order = (Order) arguments.getParcelable("purchase_order");
            this.f14025Y = order;
            C0214w c0214w = this.f14023W;
            if (c0214w == null) {
                j.n("mShopPaymentConfirmationFragmentPresenter");
                throw null;
            }
            PaymentConfirmationSummary paymentConfirmationSummary = this.f14024X;
            c0214w.j();
            if (paymentConfirmationSummary != null && order != null) {
                ProductV3 targetProduct = paymentConfirmationSummary.getTargetProduct();
                boolean zIsPromo = targetProduct.isPromo();
                Amount amountOriginal = targetProduct.getAmountOriginal();
                Amount amountDiscounted = targetProduct.getAmountDiscounted();
                j.g(amountOriginal, "amountOriginal");
                if (!zIsPromo || amountDiscounted == null) {
                    d dVar = (d) c0214w.c.get();
                    String formattedValue = amountOriginal.getFormattedValue();
                    j.f(formattedValue, "getFormattedValue(...)");
                    ((MayaShopPaymentConfirmationFragment) dVar).H1(formattedValue);
                } else {
                    d dVar2 = (d) c0214w.c.get();
                    String formattedValue2 = amountDiscounted.getFormattedValue();
                    j.f(formattedValue2, "getFormattedValue(...)");
                    ((MayaShopPaymentConfirmationFragment) dVar2).H1(formattedValue2);
                }
                e eVar = new e();
                String string = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).getString(R.string.maya_label_account_number);
                j.f(string, "getString(...)");
                eVar.c = string;
                String string2 = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).getString(R.string.maya_shop_destination_label);
                j.f(string2, "getString(...)");
                eVar.f3087b = string2;
                c0214w.f1106g = eVar;
                ProductV3 targetProduct2 = paymentConfirmationSummary.getTargetProduct();
                ArrayList arrayList = new ArrayList();
                if (((e) c0214w.f1106g) == null) {
                    j.n("shopReviewInfoHelper");
                    throw null;
                }
                String string3 = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).getString(R.string.maya_shop_source_label);
                j.f(string3, "getString(...)");
                FundSource appliedFundSource = paymentConfirmationSummary.getAppliedFundSource();
                C1079c c1079cB = e.b(string3, appliedFundSource != null ? appliedFundSource.mName() : null, C.p(((com.paymaya.data.preference.a) c0214w.e).r()));
                if (c1079cB != null) {
                    arrayList.add(c1079cB);
                }
                e eVar2 = (e) c0214w.f1106g;
                if (eVar2 == null) {
                    j.n("shopReviewInfoHelper");
                    throw null;
                }
                C1079c c1079cE = eVar2.e(targetProduct2, paymentConfirmationSummary.getTargetRecipientName(), paymentConfirmationSummary);
                if (c1079cE != null) {
                    arrayList.add(c1079cE);
                }
                if (((e) c0214w.f1106g) == null) {
                    j.n("shopReviewInfoHelper");
                    throw null;
                }
                ProductProviderDetails productProviderDetails = targetProduct2.getProductProviderDetails();
                LinkedHashMap linkedHashMapA = e.a(productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null, paymentConfirmationSummary.getDynamicFieldsCodeAndInput());
                if (linkedHashMapA != null) {
                    for (Map.Entry entry : linkedHashMapA.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (((e) c0214w.f1106g) == null) {
                            j.n("shopReviewInfoHelper");
                            throw null;
                        }
                        C1079c c1079cB2 = e.b(str, str2, null);
                        if (c1079cB2 != null) {
                            arrayList.add(c1079cB2);
                        }
                    }
                }
                if (((e) c0214w.f1106g) == null) {
                    j.n("shopReviewInfoHelper");
                    throw null;
                }
                String string4 = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).getString(R.string.maya_shop_message_label);
                j.f(string4, "getString(...)");
                C1079c c1079cB3 = e.b(string4, paymentConfirmationSummary.getMessage(), null);
                if (c1079cB3 != null) {
                    arrayList.add(c1079cB3);
                }
                if (((e) c0214w.f1106g) == null) {
                    j.n("shopReviewInfoHelper");
                    throw null;
                }
                String string5 = ((MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get())).getString(R.string.maya_shop_product_name_label);
                j.f(string5, "getString(...)");
                C1079c c1079cB4 = e.b(string5, targetProduct2.getName(), null);
                if (c1079cB4 != null) {
                    arrayList.add(c1079cB4);
                }
                MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = (MayaShopPaymentConfirmationFragment) ((d) c0214w.c.get());
                mayaShopPaymentConfirmationFragment.getClass();
                mayaShopPaymentConfirmationFragment.f14026Z.e(arrayList);
            }
        }
        C0453g c0453g2 = this.f14022V;
        j.d(c0453g2);
        ((Button) c0453g2.f4095d).setOnClickListener(new o(this, 12));
    }
}
