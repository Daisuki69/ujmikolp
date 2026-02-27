package xe;

import N5.k1;
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
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import java.util.HashMap;
import we.InterfaceC2424m;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.d f20960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.c f20961b;
    public ShopProvider c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20962d;
    public final TextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k1 k1Var, FragmentActivity mContext, ue.d dVar) {
        super((CardView) k1Var.e);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20960a = dVar;
        CardView containerCardViewPmaShopViewV3Provider = (CardView) k1Var.c;
        kotlin.jvm.internal.j.f(containerCardViewPmaShopViewV3Provider, "containerCardViewPmaShopViewV3Provider");
        this.f20962d = (ImageView) k1Var.f4138b;
        this.e = (TextView) k1Var.f4139d;
        this.f20961b = new qc.c(this, 10);
        containerCardViewPmaShopViewV3Provider.setOnClickListener(new qf.d(this, 20));
    }

    public static final void D(h hVar) {
        ue.d dVar = hVar.f20960a;
        if (dVar != null) {
            ShopProvider shopProvider = hVar.c;
            ShopV3PageFragment shopV3PageFragment = dVar.f20291b;
            InterfaceC2424m interfaceC2424m = shopV3PageFragment.f14806e0;
            if (interfaceC2424m != null) {
                kotlin.jvm.internal.j.d(shopProvider);
                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2424m;
                mayaShopActivity.e.getClass();
                B5.i.a0(mayaShopActivity, shopProvider);
            }
            C1220i c1220i = shopV3PageFragment.f10245B;
            FragmentActivity activity = shopV3PageFragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PROVIDER);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = shopV3PageFragment.f14809h0;
            HashMap map = c1219hD.j;
            map.put("section", str);
            map.put("provider", shopProvider != null ? shopProvider.getName() : null);
            c1220i.c(activity, c1219hD);
        }
    }
}
