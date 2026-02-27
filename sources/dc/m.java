package dc;

import N5.k1;
import Xb.y;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cc.x;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaShopProvidersCollectionFragment f16338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4.i f16339b;
    public ShopProvider c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16340d;
    public final ImageView e;
    public final ImageView f;

    public m(k1 k1Var, MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment) {
        super((ConstraintLayout) k1Var.e);
        this.f16338a = mayaShopProvidersCollectionFragment;
        ConstraintLayout containerLayout = (ConstraintLayout) k1Var.f;
        kotlin.jvm.internal.j.f(containerLayout, "containerLayout");
        this.f16340d = (TextView) k1Var.f4139d;
        this.e = (ImageView) k1Var.f4138b;
        this.f = (ImageView) k1Var.c;
        this.f16339b = new R4.i(this, 11);
        containerLayout.setOnClickListener(new Y6.o(this, 22));
    }

    public static final void D(m mVar) {
        MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment = mVar.f16338a;
        if (mayaShopProvidersCollectionFragment != null) {
            ShopProvider shopProvider = mVar.c;
            if (mayaShopProvidersCollectionFragment.t1().e().isShopEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(2));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String name = shopProvider != null ? shopProvider.getName() : null;
                if (name != null) {
                    c1219hE.j.put("provider_code", name);
                }
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                String displayName = shopProvider != null ? shopProvider.getDisplayName() : null;
                if (displayName != null) {
                    c1219hE.j.put("provider", displayName);
                }
                c1219hE.j.put("section", "Brand List");
                mayaShopProvidersCollectionFragment.o1().b(c1219hE);
            } else {
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.BRAND);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("brand", shopProvider != null ? shopProvider.getDisplayName() : null);
                c1219hH.i();
                mayaShopProvidersCollectionFragment.A1(c1219hH);
            }
            y yVar = (y) mayaShopProvidersCollectionFragment.Q1();
            if (shopProvider != null) {
                MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment2 = (MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get());
                mayaShopProvidersCollectionFragment2.getClass();
                x xVar = mayaShopProvidersCollectionFragment2.t0;
                if (xVar != null) {
                    ((MayaShopV2Activity) xVar).e2(shopProvider);
                }
            }
        }
    }
}
