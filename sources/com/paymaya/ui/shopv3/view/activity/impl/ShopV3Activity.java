package com.paymaya.ui.shopv3.view.activity.impl;

import B5.i;
import D.C0187u;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ReceiptFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import i8.C1593a;
import java.util.List;
import kotlin.jvm.internal.j;
import te.a;
import ve.l;
import we.InterfaceC2400E;
import we.InterfaceC2403H;
import we.InterfaceC2407L;
import we.InterfaceC2408M;
import we.InterfaceC2410O;
import we.InterfaceC2414c;
import we.InterfaceC2428q;
import we.InterfaceC2432u;
import we.InterfaceC2436y;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopV3Activity extends AbstractActivityC2512d implements a, InterfaceC2410O, InterfaceC2428q, InterfaceC2432u, InterfaceC2436y, InterfaceC2414c, InterfaceC2408M, InterfaceC2400E, InterfaceC2403H, InterfaceC2407L {
    public Bundle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1593a f14777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f14778l;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        j.g(fragment, numX49.tnTj78("bSVP"));
        int iComplexToDimensionPixelSize = 0;
        boolean z4 = (fragment instanceof ShopV3PurchaseHistoryReceiptFragment) || (fragment instanceof ShopV3ReceiptFragment);
        o1(true);
        p1(true);
        q1(R.color.light_light);
        getWindow().getDecorView().setSystemUiVisibility(8192);
        if (fragment instanceof ShopV3PaymentFragment) {
            m1(getString(R.string.pma_label_buy));
        } else if (fragment instanceof ShopV3SearchFragment) {
            m1(numX49.tnTj78("bSVb"));
        } else if (fragment instanceof ShopV3ProvidersCollectionFragment) {
            m1(getString(R.string.pma_label_shop_v3_all_brands));
        } else if (fragment instanceof ShopV3PurchaseHistoryFragment) {
            m1(getString(R.string.pma_label_toolbar_title_shop_purchase_history));
        }
        n1(!z4);
        if (!z4) {
            TypedValue typedValue = new TypedValue();
            if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
                iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.pma_activity_shop_v3_fragment_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iComplexToDimensionPixelSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        setResult(5);
        finish();
    }

    @Override // we.InterfaceC2414c
    public final void h(String str) {
        i iVar = this.f14778l;
        if (iVar != null) {
            iVar.l0(this, str);
        } else {
            j.n(numX49.tnTj78("bSV2"));
            throw null;
        }
    }

    @Override // we.InterfaceC2414c
    public final void i(Order order, PaymentConfirmationSummary paymentConfirmationSummary) {
        String strTnTj78 = numX49.tnTj78("bSVL");
        j.g(order, strTnTj78);
        j.g(paymentConfirmationSummary, numX49.tnTj78("bSVr"));
        Bundle bundle = new Bundle();
        bundle.putParcelable(strTnTj78, order);
        bundle.putParcelable(numX49.tnTj78("bSVZ"), paymentConfirmationSummary);
        ShopV3ReceiptFragment shopV3ReceiptFragment = new ShopV3ReceiptFragment();
        shopV3ReceiptFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.pma_activity_shop_v3_fragment_container, shopV3ReceiptFragment);
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.SHOP;
    }

    public final void o(String str, String str2) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bSVk"), str);
        bundle.putString(numX49.tnTj78("bSVB"), str2);
        errorDialogFragment.setArguments(bundle);
        errorDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bSVu"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        j.f(fragments, numX49.tnTj78("bSVV"));
        for (Fragment fragment : fragments) {
            if (fragment.isVisible() && (fragment instanceof l)) {
                f();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().H().f4756a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        this.f14777k = new C1593a(12);
        this.f14778l = (i) aVar.f4659D.get();
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_shop_v3);
        C1593a c1593a = this.f14777k;
        String strTnTj78 = numX49.tnTj78("bSVS");
        if (c1593a == null) {
            j.n(strTnTj78);
            throw null;
        }
        c1593a.h(this);
        if (bundle == null) {
            C1593a c1593a2 = this.f14777k;
            if (c1593a2 != null) {
                c1593a2.j();
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6276l = null;
        C1593a c1593a = this.f14777k;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bSVj"));
            throw null;
        }
        c1593a.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        i iVar = this.f14778l;
        if (iVar != null) {
            iVar.u0(this);
        } else {
            j.n(numX49.tnTj78("bSVd"));
            throw null;
        }
    }

    public final Bundle t1() {
        Bundle bundle = this.j;
        return bundle == null ? new Bundle() : bundle;
    }

    public final void u1(ProductV3 productV3) {
        String id = productV3 != null ? productV3.getId() : null;
        ShopV3PaymentFragment shopV3PaymentFragment = new ShopV3PaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bSVi"), id);
        shopV3PaymentFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.pma_activity_shop_v3_fragment_container, shopV3PaymentFragment);
    }

    @Override // we.InterfaceC2414c
    public final void y(String str) {
        if (this.f14778l != null) {
            i.k(this, str);
        } else {
            j.n(numX49.tnTj78("bSVE"));
            throw null;
        }
    }
}
