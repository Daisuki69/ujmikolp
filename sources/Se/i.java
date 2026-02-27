package se;

import Kh.C0307l;
import Kh.C0310o;
import Kh.T;
import Kh.z;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import cj.C1132s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.messaging.p;
import com.paymaya.common.utility.C;
import com.paymaya.data.database.repository.A;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProductLoadingItem;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oi.C1983a;
import re.InterfaceC2203c;
import ue.r;
import we.InterfaceC2432u;
import we.ViewOnClickListenerC2430s;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends AbstractC2509a implements InterfaceC2203c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1285t0 f20065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1285t0 c1285t0, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("bF33"));
        this.f20065d = c1285t0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 1;
        super.j();
        ShopProvider shopProviderB1 = ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).B1();
        String backgroundUrl = shopProviderB1.getBackgroundUrl();
        String strTnTj78 = numX49.tnTj78("bF3y");
        if (backgroundUrl == null || C2576A.H(backgroundUrl)) {
            LottieAnimationView lottieAnimationView = ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14836e0;
            if (lottieAnimationView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bF3R"));
                throw null;
            }
            lottieAnimationView.setVisibility(8);
            ImageView imageView = ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14835d0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            imageView.setVisibility(8);
        } else {
            ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) ((ve.f) this.c.get());
            shopV3ProviderProductsListFragment.getClass();
            shopV3ProviderProductsListFragment.requireContext();
            ImageView imageView2 = shopV3ProviderProductsListFragment.f14835d0;
            if (imageView2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            C.f0(backgroundUrl, imageView2, new p8.a(shopV3ProviderProductsListFragment, 24));
        }
        C1285t0 c1285t0 = this.f20065d;
        String name = shopProviderB1.getName();
        c1285t0.getClass();
        kotlin.jvm.internal.j.g(name, numX49.tnTj78("bF3v"));
        M5.b bVar = new M5.b(name);
        A a8 = c1285t0.c;
        e(new C0310o(new C0307l(new z(a8.f11293a.d(numX49.tnTj78("bF37"), bVar), new p(a8, i), 0).e(zh.b.a()), 1), new C1983a(this, 15), Eh.d.c, Eh.d.f1365b).f());
        if (!((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14839h0) {
            k();
            return;
        }
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment2 = (ShopV3ProviderProductsListFragment) ((ve.f) this.c.get());
        InterfaceC2432u interfaceC2432u = shopV3ProviderProductsListFragment2.f14842k0;
        if (interfaceC2432u == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bF3T"));
            throw null;
        }
        Bundle bundle = ((ShopV3Activity) interfaceC2432u).t1().getBundle(ShopV3ProviderProductsListFragment.f14827o0);
        if (bundle != null) {
            shopV3ProviderProductsListFragment2.f14839h0 = bundle.getBoolean(ShopV3ProviderProductsListFragment.f14828p0, false);
            shopV3ProviderProductsListFragment2.f14840i0 = bundle.getInt(ShopV3ProviderProductsListFragment.f14829q0, 1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(ShopV3ProviderProductsListFragment.f14831s0);
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                ((i) shopV3ProviderProductsListFragment2.A1()).k();
            } else {
                r rVar = shopV3ProviderProductsListFragment2.f14841j0;
                if (rVar == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bF3Y"));
                    throw null;
                }
                rVar.g(parcelableArrayList);
                String str = ShopV3ProviderProductsListFragment.f14830r0;
                if (bundle.containsKey(str)) {
                    RecyclerView recyclerView = shopV3ProviderProductsListFragment2.f14837f0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bF3A"));
                        throw null;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.onRestoreInstanceState(bundle.getParcelable(str));
                    }
                }
            }
        }
        ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).w1();
    }

    public final void k() {
        int i = 2;
        int i4 = 5;
        int i6 = 0;
        if (((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).m0) {
            return;
        }
        ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).m0 = true;
        ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).E1(C1132s.g(new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null)));
        ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).w1();
        new T(i4, new Lh.d(new Lh.d(new Lh.h(this.f20065d.c(1, ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).B1().getName(), true), zh.b.a(), 0), new h(this, 0), i), new qc.c(this, 9), i6), new g(this, 1)).e();
    }

    public final void l(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bF3p"));
        if (!list.isEmpty()) {
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).E1(list);
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).w1();
        } else {
            ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) ((ve.f) this.c.get());
            shopV3ProviderProductsListFragment.getClass();
            shopV3ProviderProductsListFragment.y1(200, numX49.tnTj78("bF30"), new ViewOnClickListenerC2430s(shopV3ProviderProductsListFragment, 0));
        }
    }

    public final void m(PayMayaError payMayaError) {
        int i = 0;
        int i4 = 1;
        r rVar = ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14841j0;
        if (rVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bF3z"));
            throw null;
        }
        ArrayList arrayList = rVar.f20306b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ProductV3) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).w1();
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14839h0 = true;
            return;
        }
        C1285t0 c1285t0 = this.f20065d;
        String name = ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).B1().getName();
        c1285t0.getClass();
        kotlin.jvm.internal.j.g(name, numX49.tnTj78("bF3g"));
        List listA = A.a(c1285t0.c.f11293a.f2811a.query(String.format(numX49.tnTj78("bF3q"), Arrays.copyOf(new Object[]{numX49.tnTj78("bF3f"), numX49.tnTj78("bF31"), name, numX49.tnTj78("bF3n"), numX49.tnTj78("bF3x"), numX49.tnTj78("bF3s"), numX49.tnTj78("bF35"), numX49.tnTj78("bF3J"), numX49.tnTj78("bF3I")}, 9))));
        if (!listA.isEmpty()) {
            l(listA);
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).f14839h0 = true;
            return;
        }
        if (payMayaError.isSessionTimeout()) {
            ((ShopV3ProviderProductsListFragment) ((ve.f) this.c.get())).E1(C1112C.f9377a);
            ve.f fVar = (ve.f) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) fVar;
            shopV3ProviderProductsListFragment.getClass();
            shopV3ProviderProductsListFragment.y1(200, strMSpiel, new ViewOnClickListenerC2430s(shopV3ProviderProductsListFragment, i));
            return;
        }
        if (payMayaError.isNetworkError()) {
            ve.f fVar2 = (ve.f) this.c.get();
            String strMSpiel2 = payMayaError.mSpiel();
            ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment2 = (ShopV3ProviderProductsListFragment) fVar2;
            shopV3ProviderProductsListFragment2.getClass();
            shopV3ProviderProductsListFragment2.y1(100, strMSpiel2, new ViewOnClickListenerC2430s(shopV3ProviderProductsListFragment2, i4));
            return;
        }
        ve.f fVar3 = (ve.f) this.c.get();
        String strMSpiel3 = payMayaError.mSpiel();
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment3 = (ShopV3ProviderProductsListFragment) fVar3;
        shopV3ProviderProductsListFragment3.getClass();
        shopV3ProviderProductsListFragment3.y1(200, strMSpiel3, new ViewOnClickListenerC2430s(shopV3ProviderProductsListFragment3, i));
    }
}
