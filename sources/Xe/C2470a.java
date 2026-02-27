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
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import java.util.HashMap;
import oi.C1983a;
import we.InterfaceC2422k;

/* JADX INFO: renamed from: xe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2470a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.m f20935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1983a f20936b;
    public ShopPurchaseHistory c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20937d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f20938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470a(F1 f12, Context mContext, ue.m mVar) {
        super(f12.f3621b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20935a = mVar;
        CardView containerCardViewPmaViewShopV3BuyAgainPurchaseCard = f12.c;
        kotlin.jvm.internal.j.f(containerCardViewPmaViewShopV3BuyAgainPurchaseCard, "containerCardViewPmaViewShopV3BuyAgainPurchaseCard");
        this.f20937d = f12.f;
        this.e = f12.f3622d;
        this.f = f12.f3623g;
        this.f20938g = f12.e;
        this.f20936b = new C1983a(this, 11);
        containerCardViewPmaViewShopV3BuyAgainPurchaseCard.setOnClickListener(new qf.d(this, 14));
    }

    public static final void D(C2470a c2470a) {
        ue.m mVar = c2470a.f20935a;
        if (mVar != null) {
            ShopPurchaseHistory shopPurchaseHistory = c2470a.c;
            ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) mVar;
            InterfaceC2422k interfaceC2422k = shopV3HomePageFragment.f14800i0;
            if (interfaceC2422k != null) {
                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2422k;
                if (shopPurchaseHistory != null) {
                    B5.i iVar = mayaShopActivity.e;
                    String strMProductId = shopPurchaseHistory.mProductId();
                    iVar.getClass();
                    B5.i.Z(mayaShopActivity, strMProductId);
                }
            }
            C1220i c1220i = shopV3HomePageFragment.f10245B;
            FragmentActivity activity = shopV3HomePageFragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hD.j;
            map.put("location", "buy again");
            map.put("product", shopPurchaseHistory != null ? shopPurchaseHistory.mProductName() : null);
            c1220i.c(activity, c1219hD);
        }
    }
}
