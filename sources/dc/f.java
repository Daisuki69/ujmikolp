package dc;

import N5.A1;
import N5.k1;
import android.content.Context;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc.InterfaceC1094g;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f16315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1220i f16316b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaShopHomePageFragment f16317d;
    public final Xb.g e;
    public ShopHomeSectionCarousel f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ac.k f16318g;
    public final TextView h;
    public final TextView i;
    public final CardView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RecyclerView f16319k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k1 k1Var, com.paymaya.data.preference.a mPreference, C1220i mAnalyticsUtils, Context mContext, MayaShopHomePageFragment mayaShopHomePageFragment) {
        super((ConstraintLayout) k1Var.e);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mAnalyticsUtils, "mAnalyticsUtils");
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f16315a = mPreference;
        this.f16316b = mAnalyticsUtils;
        this.c = mContext;
        this.f16317d = mayaShopHomePageFragment;
        this.h = (TextView) k1Var.f;
        TextView textView = (TextView) k1Var.f4139d;
        this.i = textView;
        this.j = ((A1) k1Var.c).f3548b;
        RecyclerView recyclerView = (RecyclerView) k1Var.f4138b;
        this.f16319k = recyclerView;
        this.e = new Xb.g(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, 0, false);
        ac.k kVar = new ac.k(mContext, mayaShopHomePageFragment);
        this.f16318g = kVar;
        recyclerView.addItemDecoration(new Rc.d(mContext, R.dimen.pma_margin_normal, R.dimen.pma_margin_medium));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(kVar);
        textView.setOnClickListener(new Y6.o(this, 17));
    }

    public static final void D(f fVar) {
        if (fVar.f16315a.e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(11));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", fVar.c.getString(R.string.maya_label_see_all));
            c1219hE.j.put("page", "Home");
            fVar.f16316b.b(c1219hE);
        }
        MayaShopHomePageFragment mayaShopHomePageFragment = fVar.f16317d;
        if (mayaShopHomePageFragment != null) {
            ShopHomeSectionCarousel shopHomeSectionCarousel = fVar.f;
            String name = shopHomeSectionCarousel != null ? shopHomeSectionCarousel.getName() : null;
            ShopHomeSectionCarousel shopHomeSectionCarousel2 = fVar.f;
            if (shopHomeSectionCarousel2 != null) {
                shopHomeSectionCarousel2.getListType();
            }
            Xb.f fVar2 = (Xb.f) mayaShopHomePageFragment.R1();
            if (kotlin.jvm.internal.j.b(name, "Buy Again")) {
                InterfaceC1094g interfaceC1094g = ((MayaShopHomePageFragment) ((bc.b) fVar2.c.get())).w0;
                if (interfaceC1094g != null) {
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g;
                    mayaShopV2Activity.n1().G(mayaShopV2Activity, "DISBURSEMENT_SUCCESSFUL");
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.j.b(name, "Brands for you")) {
                MayaShopHomePageFragment mayaShopHomePageFragment2 = (MayaShopHomePageFragment) ((bc.b) fVar2.c.get());
                InterfaceC1094g interfaceC1094g2 = mayaShopHomePageFragment2.w0;
                if (interfaceC1094g2 != null) {
                    ((MayaShopV2Activity) interfaceC1094g2).getIntent().putExtra("origin_screen", "brands_for_you");
                }
                InterfaceC1094g interfaceC1094g3 = mayaShopHomePageFragment2.w0;
                if (interfaceC1094g3 != null) {
                    MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) interfaceC1094g3;
                    mayaShopV2Activity2.n1();
                    B5.i.F(mayaShopV2Activity2);
                }
                C1220i c1220iO1 = mayaShopHomePageFragment2.o1();
                FragmentActivity activity = mayaShopHomePageFragment2.getActivity();
                C1219h c1219hD = C1219h.d(mayaShopHomePageFragment2.u1());
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.ALL_PROVIDERS);
                c1220iO1.c(activity, c1219hD);
            }
        }
    }
}
