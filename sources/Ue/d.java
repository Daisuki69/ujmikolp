package ue;

import N5.k1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderListItem;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f20290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShopV3PageFragment f20291b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f20292d;

    public d(FragmentActivity fragmentActivity, ShopV3PageFragment shopV3PageFragment) {
        this.f20290a = fragmentActivity;
        this.f20291b = shopV3PageFragment;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("bFl0"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlg"));
        this.f20292d = (LayoutInflater) systemService;
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
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlf"));
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            ShopProviderListItem shopProviderListItem = (ShopProviderListItem) arrayList.get(i);
            if (AbstractC2312b.f20289a[shopProviderListItem.getViewType().ordinal()] == 1) {
                xe.h hVar = (xe.h) viewHolder;
                ShopProvider shopProvider = (ShopProvider) shopProviderListItem;
                hVar.c = shopProvider;
                qc.c cVar = hVar.f20961b;
                cVar.getClass();
                String logoUrl = shopProvider.getLogoUrl();
                xe.h hVar2 = (xe.h) cVar.f19770b;
                C.e0(logoUrl, hVar2.f20962d, 2131232014);
                hVar2.e.setText(shopProvider.getDisplayName());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFl1"));
        if (i != ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER.getValue()) {
            if (i == ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                return new c(this.f20292d.inflate(R.layout.pma_view_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlx")));
        }
        View viewE = AbstractC1414e.e(viewGroup, R.layout.pma_view_shop_v3_provider, viewGroup, false);
        CardView cardView = (CardView) viewE;
        int i4 = R.id.divider_view_pma_shop_view_v3_provider;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewE, R.id.divider_view_pma_shop_view_v3_provider);
        if (viewFindChildViewById != null) {
            i4 = R.id.provider_icon_image_view_pma_shop_view_v3_provider;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.provider_icon_image_view_pma_shop_view_v3_provider);
            if (imageView != null) {
                i4 = R.id.provider_text_view_pma_shop_view_v3_provider;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.provider_text_view_pma_shop_view_v3_provider);
                if (textView != null) {
                    return new xe.h(new k1(cardView, cardView, viewFindChildViewById, imageView, textView), this.f20290a, this);
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bFln").concat(viewE.getResources().getResourceName(i4)));
    }
}
