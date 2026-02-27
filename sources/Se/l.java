package se;

import Kh.T;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionLoadingItem;
import com.paymaya.domain.store.O0;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import ph.C2070f1;
import re.InterfaceC2204d;
import ue.u;
import we.InterfaceC2400E;
import we.ViewOnClickListenerC2399D;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends AbstractC2509a implements InterfaceC2204d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0 f20070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(O0 o02, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("bF3PP"));
        this.f20070d = o02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strL;
        Intent intent;
        RecyclerView.LayoutManager layoutManager;
        super.j();
        if (((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).f14857c0) {
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = (ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get());
            InterfaceC2400E interfaceC2400E = shopV3ProvidersCollectionFragment.f14859e0;
            Bundle bundleT1 = interfaceC2400E != null ? ((ShopV3Activity) interfaceC2400E).t1() : null;
            if (bundleT1 != null) {
                String strTnTj78 = numX49.tnTj78("bF3Pb");
                if (bundleT1.containsKey(strTnTj78)) {
                    u uVar = shopV3ProvidersCollectionFragment.f14858d0;
                    if (uVar == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bF3P2"));
                        throw null;
                    }
                    List parcelableArrayList = bundleT1.getParcelableArrayList(strTnTj78);
                    if (parcelableArrayList == null) {
                        parcelableArrayList = C1112C.f9377a;
                    }
                    uVar.e(parcelableArrayList);
                }
            }
            if (bundleT1 != null) {
                String strTnTj782 = numX49.tnTj78("bF3PL");
                if (bundleT1.containsKey(strTnTj782) && (layoutManager = shopV3ProvidersCollectionFragment.A1().getLayoutManager()) != null) {
                    layoutManager.onRestoreInstanceState(bundleT1.getParcelable(strTnTj782));
                }
            }
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).w1();
            return;
        }
        FragmentActivity activity = ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).getActivity();
        String dataString = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString();
        if (4 == C.w(dataString) && (strL = C.L(dataString, numX49.tnTj78("bF3Pr"))) != null && !C2576A.H(strL)) {
            ShopProvider shopProviderD = this.f20070d.d(strL);
            if (shopProviderD != null) {
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment2 = (ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get());
                shopV3ProvidersCollectionFragment2.getClass();
                InterfaceC2400E interfaceC2400E2 = shopV3ProvidersCollectionFragment2.f14859e0;
                if (interfaceC2400E2 != null) {
                    ShopV3Activity shopV3Activity = (ShopV3Activity) interfaceC2400E2;
                    String str = ShopV3ProviderProductsListFragment.f14827o0;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(numX49.tnTj78("bF3PZ"), shopProviderD);
                    ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = new ShopV3ProviderProductsListFragment();
                    shopV3ProviderProductsListFragment.setArguments(bundle);
                    AbstractC1236z.h(shopV3Activity, R.id.pma_activity_shop_v3_fragment_container, shopV3ProviderProductsListFragment);
                    shopV3Activity.m1(shopProviderD.getDisplayName());
                }
            } else {
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment3 = (ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get());
                InterfaceC2400E interfaceC2400E3 = shopV3ProvidersCollectionFragment3.f14859e0;
                if (interfaceC2400E3 != null) {
                    ((ShopV3Activity) interfaceC2400E3).o(shopV3ProvidersCollectionFragment3.getString(R.string.pma_toast_error_title_shop_error), shopV3ProvidersCollectionFragment3.getString(R.string.pma_error_message_shop_invalid_brand_provider));
                }
            }
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment4 = (ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get());
            C1219h c1219h = shopV3ProvidersCollectionFragment4.f10248Q;
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(numX49.tnTj78("bF3Pk"), numX49.tnTj78("bF3PB"));
            shopV3ProvidersCollectionFragment4.requireActivity().getIntent().setData(null);
        }
        l();
        k();
    }

    public final void k() {
        if (((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).f14860f0) {
            return;
        }
        ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).f14860f0 = true;
        l();
        new T(5, new Lh.d(new Lh.d(new Lh.h(this.f20070d.a(), zh.b.a(), 0), new C2070f1(this, 12), 2), new p8.a(this, 16), 0), new k(this, 1)).e();
    }

    public final void l() {
        ve.h hVar = (ve.h) this.c.get();
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new ShopV3ProvidersCollectionLoadingItem(null, 1, null));
        }
        ((ShopV3ProvidersCollectionFragment) hVar).E1(arrayList);
        ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).w1();
    }

    public final void m(PayMayaError payMayaError) {
        O0 o02 = this.f20070d;
        List listB = o02.c.b(new mg.c(6));
        ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).E1(listB);
        if (!listB.isEmpty()) {
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).w1();
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).f14857c0 = true;
            return;
        }
        if (payMayaError.isSessionTimeout()) {
            ve.h hVar = (ve.h) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = (ShopV3ProvidersCollectionFragment) hVar;
            shopV3ProvidersCollectionFragment.getClass();
            shopV3ProvidersCollectionFragment.y1(200, strMSpiel, new ViewOnClickListenerC2399D(shopV3ProvidersCollectionFragment, 0));
            return;
        }
        if (payMayaError.isNetworkError()) {
            ve.h hVar2 = (ve.h) this.c.get();
            String strMSpiel2 = payMayaError.mSpiel();
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment2 = (ShopV3ProvidersCollectionFragment) hVar2;
            shopV3ProvidersCollectionFragment2.getClass();
            shopV3ProvidersCollectionFragment2.y1(100, strMSpiel2, new ViewOnClickListenerC2399D(shopV3ProvidersCollectionFragment2, 1));
            return;
        }
        ve.h hVar3 = (ve.h) this.c.get();
        String strMSpiel3 = payMayaError.mSpiel();
        ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment3 = (ShopV3ProvidersCollectionFragment) hVar3;
        shopV3ProvidersCollectionFragment3.getClass();
        shopV3ProvidersCollectionFragment3.y1(200, strMSpiel3, new ViewOnClickListenerC2399D(shopV3ProvidersCollectionFragment3, 0));
    }

    public final void n(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bF3Pu"));
        if (!list.isEmpty()) {
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).E1(list);
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).w1();
            ((ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get())).f14857c0 = true;
        } else {
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = (ShopV3ProvidersCollectionFragment) ((ve.h) this.c.get());
            shopV3ProvidersCollectionFragment.getClass();
            shopV3ProvidersCollectionFragment.y1(200, numX49.tnTj78("bF3PV"), new ViewOnClickListenerC2399D(shopV3ProvidersCollectionFragment, 0));
        }
    }
}
