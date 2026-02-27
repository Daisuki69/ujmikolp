package xe;

import N5.F1;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import java.util.HashMap;
import we.InterfaceC2422k;

/* JADX INFO: renamed from: xe.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2474e extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.m f20949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.c f20950b;
    public ProductV3 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20951d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f20952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2474e(F1 f12, Context mContext, ue.m mVar) {
        super(f12.f3621b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20949a = mVar;
        CardView cardView = f12.c;
        kotlin.jvm.internal.j.f(cardView, "containerCardViewPmaShop…wV3MostPopularProductCard");
        this.f20951d = f12.f;
        this.e = f12.f3622d;
        this.f = f12.f3623g;
        this.f20952g = f12.e;
        this.f20950b = new qc.c(this, 7);
        cardView.setOnClickListener(new qf.d(this, 17));
    }

    public static final void D(C2474e c2474e) {
        ue.m mVar = c2474e.f20949a;
        if (mVar != null) {
            ProductV3 productV3 = c2474e.c;
            ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) mVar;
            InterfaceC2422k interfaceC2422k = shopV3HomePageFragment.f14800i0;
            if (interfaceC2422k != null) {
                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2422k;
                if (productV3 != null) {
                    B5.i iVar = mayaShopActivity.e;
                    String id = productV3.getId();
                    iVar.getClass();
                    B5.i.Z(mayaShopActivity, id);
                }
            }
            C1220i c1220i = shopV3HomePageFragment.f10245B;
            FragmentActivity activity = shopV3HomePageFragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.POPULAR);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = shopV3HomePageFragment.f14801j0;
            HashMap map = c1219hD.j;
            map.put("section", str);
            map.put("product", productV3 != null ? productV3.getName() : null);
            c1220i.c(activity, c1219hD);
        }
    }
}
