package xe;

import N5.r1;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import we.InterfaceC2422k;

/* JADX INFO: renamed from: xe.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2472c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopV3HomePageFragment f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o6.f f20943b;
    public ShopHomeSectionCarousel c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue.l f20944d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f20945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2472c(r1 r1Var, Context mContext, ShopV3HomePageFragment shopV3HomePageFragment) {
        super((ConstraintLayout) r1Var.c);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20942a = shopV3HomePageFragment;
        this.e = (TextView) r1Var.f4198b;
        TextView textView = (TextView) r1Var.f4199d;
        this.f = textView;
        RecyclerView recyclerView = (RecyclerView) r1Var.e;
        this.f20945g = recyclerView;
        this.f20943b = new o6.f(this, 10);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, 0, false);
        ue.l lVar = new ue.l(mContext, shopV3HomePageFragment);
        this.f20944d = lVar;
        recyclerView.addItemDecoration(new Rc.d(mContext, R.dimen.pma_margin_normal, R.dimen.pma_margin_medium));
        recyclerView.setLayoutManager(linearLayoutManager);
        linearSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(lVar);
        textView.setOnClickListener(new qf.d(this, 16));
    }

    public static final void D(C2472c c2472c) {
        ShopV3HomePageFragment shopV3HomePageFragment = c2472c.f20942a;
        if (shopV3HomePageFragment != null) {
            ShopHomeSectionCarousel shopHomeSectionCarousel = c2472c.c;
            String name = shopHomeSectionCarousel != null ? shopHomeSectionCarousel.getName() : null;
            ShopHomeSectionCarousel shopHomeSectionCarousel2 = c2472c.c;
            if (shopHomeSectionCarousel2 != null) {
                shopHomeSectionCarousel2.getListType();
            }
            se.e eVar = (se.e) shopV3HomePageFragment.B1();
            if (kotlin.jvm.internal.j.b(name, "Buy Again")) {
                InterfaceC2422k interfaceC2422k = ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).f14800i0;
                if (interfaceC2422k != null) {
                    MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2422k;
                    mayaShopActivity.e.Y(mayaShopActivity, "DISBURSEMENT_SUCCESSFUL");
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.j.b(name, "Brands for you")) {
                ShopV3HomePageFragment shopV3HomePageFragment2 = (ShopV3HomePageFragment) ((ve.c) eVar.c.get());
                InterfaceC2422k interfaceC2422k2 = shopV3HomePageFragment2.f14800i0;
                if (interfaceC2422k2 != null) {
                    MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2422k2;
                    mayaShopActivity2.e.getClass();
                    B5.i.b0(mayaShopActivity2);
                }
                C1220i c1220i = shopV3HomePageFragment2.f10245B;
                FragmentActivity activity = shopV3HomePageFragment2.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.ALL_PROVIDERS);
                c1220i.c(activity, c1219hD);
            }
        }
    }
}
