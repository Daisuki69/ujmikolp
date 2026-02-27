package Xb;

import Kh.T;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionLoadingItem;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends AbstractC2509a implements Wb.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0 f6601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O0 o02, Uh.d sessionSubject) {
        super(sessionSubject);
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f6601d = o02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strL;
        Intent intent;
        RecyclerView.LayoutManager layoutManager;
        int i = 13;
        int i4 = 0;
        int i6 = 1;
        super.j();
        if (((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).f14102r0) {
            MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment = (MayaShopProvidersCollectionFragment) ((bc.j) this.c.get());
            cc.x xVar = mayaShopProvidersCollectionFragment.t0;
            Bundle bundleW1 = xVar != null ? ((MayaShopV2Activity) xVar).W1() : null;
            if (bundleW1 != null && bundleW1.containsKey("provider_collection_list_items")) {
                ac.z zVar = mayaShopProvidersCollectionFragment.f14103s0;
                if (zVar == null) {
                    kotlin.jvm.internal.j.n("mProvidersCollectionAdapter");
                    throw null;
                }
                List parcelableArrayList = bundleW1.getParcelableArrayList("provider_collection_list_items");
                if (parcelableArrayList == null) {
                    parcelableArrayList = C1112C.f9377a;
                }
                zVar.e(parcelableArrayList);
            }
            if (bundleW1 != null && bundleW1.containsKey("provider_collection_layout_manager") && (layoutManager = mayaShopProvidersCollectionFragment.P1().getLayoutManager()) != null) {
                layoutManager.onRestoreInstanceState(bundleW1.getParcelable("provider_collection_layout_manager"));
            }
            ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).L1();
            return;
        }
        FragmentActivity activity = ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).getActivity();
        String dataString = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString();
        if (4 == com.paymaya.common.utility.C.w(dataString) && (strL = com.paymaya.common.utility.C.L(dataString, "brand")) != null && !C2576A.H(strL)) {
            ShopProvider shopProviderD = this.f6601d.d(strL);
            if (shopProviderD != null) {
                MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment2 = (MayaShopProvidersCollectionFragment) ((bc.j) this.c.get());
                mayaShopProvidersCollectionFragment2.getClass();
                cc.x xVar2 = mayaShopProvidersCollectionFragment2.t0;
                if (xVar2 != null) {
                    ((MayaShopV2Activity) xVar2).e2(shopProviderD);
                }
            } else {
                MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment3 = (MayaShopProvidersCollectionFragment) ((bc.j) this.c.get());
                cc.x xVar3 = mayaShopProvidersCollectionFragment3.t0;
                if (xVar3 != null) {
                    String string = mayaShopProvidersCollectionFragment3.getString(R.string.maya_label_error_shop_error_title);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String string2 = mayaShopProvidersCollectionFragment3.getString(R.string.maya_label_error_shop_invalid_brand_provider);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    ((MayaShopV2Activity) xVar3).o(string, string2);
                }
            }
            MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment4 = (MayaShopProvidersCollectionFragment) ((bc.j) this.c.get());
            C1219h c1219hM1 = mayaShopProvidersCollectionFragment4.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            mayaShopProvidersCollectionFragment4.requireActivity().getIntent().setData(null);
        }
        l();
        if (((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).u0) {
            return;
        }
        ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).u0 = true;
        l();
        new T(5, new Lh.d(new Lh.d(new Lh.h(this.f6601d.a(), zh.b.a(), 0), new Q6.r(this, i), 2), new Qd.a(this, i), i4), new x(this, i6)).e();
    }

    public final void k(int i, String str) {
        if (((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).t1().e().isShopEventsV2Enabled()) {
            MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment = (MayaShopProvidersCollectionFragment) ((bc.j) this.c.get());
            mayaShopProvidersCollectionFragment.getClass();
            C1219h c1219hE = C1219h.e("SHOP_ERROR_SCREEN");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("section", "Brand List");
            map.put(StateEvent.Name.ERROR_CODE, String.valueOf(i));
            map.put("error_reason", str);
            mayaShopProvidersCollectionFragment.z1(c1219hE);
        }
    }

    public final void l() {
        bc.j jVar = (bc.j) this.c.get();
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new ShopV3ProvidersCollectionLoadingItem(null, 1, null));
        }
        ((MayaShopProvidersCollectionFragment) jVar).S1(arrayList);
        ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).L1();
    }

    public final void m(List providersList) {
        kotlin.jvm.internal.j.g(providersList, "providersList");
        if (providersList.isEmpty()) {
            ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).T1("There are no providers at the moment.");
            return;
        }
        ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).S1(providersList);
        ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).L1();
        ((MayaShopProvidersCollectionFragment) ((bc.j) this.c.get())).f14102r0 = true;
    }
}
