package ac;

import N5.C0435a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderListItem;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f7119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaShopPageFragment f7120b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f7121d;

    public w(FragmentActivity fragmentActivity, MayaShopPageFragment mayaShopPageFragment) {
        this.f7119a = fragmentActivity;
        this.f7120b = mayaShopPageFragment;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("buOm"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buOD"));
        this.f7121d = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOh"));
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            ShopProviderListItem shopProviderListItem = (ShopProviderListItem) arrayList.get(i);
            if (u.f7118a[shopProviderListItem.getViewType().ordinal()] == 1) {
                cc.w wVar = (cc.w) viewHolder;
                ShopProvider shopProvider = (ShopProvider) shopProviderListItem;
                wVar.c = i;
                wVar.f9359d = shopProvider;
                T3.l lVar = wVar.f9358b;
                lVar.getClass();
                String iconUrl = shopProvider.getIconUrl();
                cc.w wVar2 = (cc.w) lVar.f5786b;
                if (iconUrl != null && iconUrl.length() > 0) {
                    com.paymaya.common.utility.C.f0(iconUrl, wVar2.e, new Q6.n(wVar2, 29));
                }
                String displayName = shopProvider.getDisplayName();
                if (displayName != null) {
                    wVar2.f.setText(displayName);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOM"));
        if (i != ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER.getValue()) {
            if (i == ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                return new v(this.f7121d.inflate(R.layout.pma_view_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buO6")));
        }
        View viewE = AbstractC1414e.e(viewGroup, R.layout.maya_view_shop_provider, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewE;
        int i4 = R.id.shop_provider_divider_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewE, R.id.shop_provider_divider_view);
        if (viewFindChildViewById != null) {
            i4 = R.id.shop_provider_icon_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.shop_provider_icon_image_view);
            if (imageView != null) {
                i4 = R.id.shop_provider_placeholder_icon_image_view;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewE, R.id.shop_provider_placeholder_icon_image_view);
                if (imageView2 != null) {
                    i4 = R.id.shop_provider_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.shop_provider_text_view);
                    if (textView != null) {
                        return new cc.w(new C0435a(constraintLayout, (View) constraintLayout, viewFindChildViewById, (View) imageView, (View) imageView2, textView, 23), this.f7119a, this);
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("buON").concat(viewE.getResources().getResourceName(i4)));
    }
}
