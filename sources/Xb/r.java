package Xb;

import Kh.C0307l;
import Kh.C0310o;
import Kh.T;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import cj.C1112C;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.model.ShopV3ProductLoadingItem;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC2509a implements Wb.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1285t0 f6590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1285t0 c1285t0, Uh.d sessionSubject) {
        super(sessionSubject);
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f6590d = c1285t0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 2;
        int i4 = 5;
        int i6 = 1;
        int i10 = 0;
        super.j();
        ShopProviderSubcategory shopProviderSubcategory = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14063z0;
        if (shopProviderSubcategory == null) {
            ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).L1();
            Group group = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14060s0;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.j.n("mNoProductsView");
                throw null;
            }
        }
        C1285t0 c1285t0 = this.f6590d;
        String providerName = shopProviderSubcategory.getProviderName();
        if (providerName == null) {
            providerName = "";
        }
        String code = shopProviderSubcategory.getCode();
        if (code == null) {
            code = "";
        }
        c1285t0.getClass();
        M5.e eVar = new M5.e(providerName, code);
        com.paymaya.data.database.repository.A a8 = c1285t0.c;
        e(new C0310o(new C0307l(new Kh.z(a8.f11293a.d("product_v3", eVar), new com.google.firebase.messaging.p(a8, i6), 0).e(zh.b.a()), 1), new Qd.a(this, 11), Eh.d.c, Eh.d.f1365b).f());
        if (((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).u0) {
            return;
        }
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).u0 = true;
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).Q1(C1132s.g(new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null)));
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).L1();
        ShopProviderSubcategory shopProviderSubcategory2 = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14063z0;
        if (shopProviderSubcategory2 != null) {
            C1285t0 c1285t02 = this.f6590d;
            String providerName2 = shopProviderSubcategory2.getProviderName();
            if (providerName2 == null) {
                providerName2 = "";
            }
            String code2 = shopProviderSubcategory2.getCode();
            new T(i4, new Lh.d(new Lh.d(new Lh.h(c1285t02.b(providerName2, 1, code2 != null ? code2 : "", true), zh.b.a(), 0), new q(this, i10), i), new R4.i(this, 10), i10), new p(this, i10)).e();
            return;
        }
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).u0 = false;
        Group group2 = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14060s0;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mNoProductsView");
            throw null;
        }
    }

    public final void k(List updatedProducts) {
        kotlin.jvm.internal.j.g(updatedProducts, "updatedProducts");
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).Q1(updatedProducts);
        ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).L1();
        if (updatedProducts.isEmpty()) {
            SpringView springView = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14059r0;
            if (springView == null) {
                kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                throw null;
            }
            springView.setVisibility(8);
            Group group = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14060s0;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.j.n("mNoProductsView");
                throw null;
            }
        }
        SpringView springView2 = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14059r0;
        if (springView2 == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView2.setVisibility(0);
        Group group2 = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14060s0;
        if (group2 != null) {
            group2.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mNoProductsView");
            throw null;
        }
    }

    public final void l(PayMayaError payMayaError) {
        ac.s sVar = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).w0;
        if (sVar == null) {
            kotlin.jvm.internal.j.n("mProductsAdapter");
            throw null;
        }
        if (!sVar.e().isEmpty()) {
            ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).L1();
            return;
        }
        ShopProviderSubcategory shopProviderSubcategory = ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).f14063z0;
        if (shopProviderSubcategory == null) {
            ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).L1();
            return;
        }
        C1285t0 c1285t0 = this.f6590d;
        String providerName = shopProviderSubcategory.getProviderName();
        if (providerName == null) {
            providerName = "";
        }
        String code = shopProviderSubcategory.getCode();
        String str = code != null ? code : "";
        c1285t0.getClass();
        List listA = com.paymaya.data.database.repository.A.a(c1285t0.c.f11293a.f2811a.query(new M5.e(providerName, str).d()));
        if (!listA.isEmpty()) {
            k(listA);
            return;
        }
        if (payMayaError.isSessionTimeout()) {
            ((MayaShopProviderPageProductsListFragment) ((bc.g) this.c.get())).Q1(C1112C.f9377a);
            bc.g gVar = (bc.g) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            final MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment = (MayaShopProviderPageProductsListFragment) gVar;
            mayaShopProviderPageProductsListFragment.getClass();
            final int i = 0;
            MayaBaseLoadingFragment.N1(mayaShopProviderPageProductsListFragment, 200, strMSpiel, null, new View.OnClickListener() { // from class: cc.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment2 = mayaShopProviderPageProductsListFragment;
                            Callback.onClick_enter(view);
                            try {
                                ShopProvider shopProvider = mayaShopProviderPageProductsListFragment2.f14052C0;
                                if (shopProvider != null) {
                                    q qVar = mayaShopProviderPageProductsListFragment2.f14062x0;
                                    if (qVar == null) {
                                        kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                        throw null;
                                    }
                                    ((MayaShopV2Activity) qVar).a2(shopProvider);
                                }
                                return;
                            } finally {
                            }
                        default:
                            MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment3 = mayaShopProviderPageProductsListFragment;
                            Callback.onClick_enter(view);
                            try {
                                ShopProvider shopProvider2 = mayaShopProviderPageProductsListFragment3.f14052C0;
                                if (shopProvider2 != null) {
                                    q qVar2 = mayaShopProviderPageProductsListFragment3.f14062x0;
                                    if (qVar2 == null) {
                                        kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                        throw null;
                                    }
                                    ((MayaShopV2Activity) qVar2).a2(shopProvider2);
                                }
                                return;
                            } finally {
                            }
                    }
                }
            }, 28);
            return;
        }
        if (payMayaError.isNetworkError()) {
            bc.g gVar2 = (bc.g) this.c.get();
            String strMSpiel2 = payMayaError.mSpiel();
            final MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment2 = (MayaShopProviderPageProductsListFragment) gVar2;
            mayaShopProviderPageProductsListFragment2.getClass();
            final int i4 = 1;
            MayaBaseLoadingFragment.N1(mayaShopProviderPageProductsListFragment2, 100, strMSpiel2, null, new View.OnClickListener() { // from class: cc.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment22 = mayaShopProviderPageProductsListFragment2;
                            Callback.onClick_enter(view);
                            try {
                                ShopProvider shopProvider = mayaShopProviderPageProductsListFragment22.f14052C0;
                                if (shopProvider != null) {
                                    q qVar = mayaShopProviderPageProductsListFragment22.f14062x0;
                                    if (qVar == null) {
                                        kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                        throw null;
                                    }
                                    ((MayaShopV2Activity) qVar).a2(shopProvider);
                                }
                                return;
                            } finally {
                            }
                        default:
                            MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment3 = mayaShopProviderPageProductsListFragment2;
                            Callback.onClick_enter(view);
                            try {
                                ShopProvider shopProvider2 = mayaShopProviderPageProductsListFragment3.f14052C0;
                                if (shopProvider2 != null) {
                                    q qVar2 = mayaShopProviderPageProductsListFragment3.f14062x0;
                                    if (qVar2 == null) {
                                        kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                        throw null;
                                    }
                                    ((MayaShopV2Activity) qVar2).a2(shopProvider2);
                                }
                                return;
                            } finally {
                            }
                    }
                }
            }, 28);
            return;
        }
        bc.g gVar3 = (bc.g) this.c.get();
        String strMSpiel3 = payMayaError.mSpiel();
        final MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment3 = (MayaShopProviderPageProductsListFragment) gVar3;
        mayaShopProviderPageProductsListFragment3.getClass();
        final int i6 = 0;
        MayaBaseLoadingFragment.N1(mayaShopProviderPageProductsListFragment3, 200, strMSpiel3, null, new View.OnClickListener() { // from class: cc.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment22 = mayaShopProviderPageProductsListFragment3;
                        Callback.onClick_enter(view);
                        try {
                            ShopProvider shopProvider = mayaShopProviderPageProductsListFragment22.f14052C0;
                            if (shopProvider != null) {
                                q qVar = mayaShopProviderPageProductsListFragment22.f14062x0;
                                if (qVar == null) {
                                    kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                    throw null;
                                }
                                ((MayaShopV2Activity) qVar).a2(shopProvider);
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment32 = mayaShopProviderPageProductsListFragment3;
                        Callback.onClick_enter(view);
                        try {
                            ShopProvider shopProvider2 = mayaShopProviderPageProductsListFragment32.f14052C0;
                            if (shopProvider2 != null) {
                                q qVar2 = mayaShopProviderPageProductsListFragment32.f14062x0;
                                if (qVar2 == null) {
                                    kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                                    throw null;
                                }
                                ((MayaShopV2Activity) qVar2).a2(shopProvider2);
                            }
                            return;
                        } finally {
                        }
                }
            }
        }, 28);
    }
}
