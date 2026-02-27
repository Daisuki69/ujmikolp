package ue;

import N5.C0455g1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o6.C1967a;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f20311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShopV3ProvidersCollectionFragment f20312b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f20313d;

    public u(FragmentActivity fragmentActivity, ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment) {
        this.f20311a = fragmentActivity;
        this.f20312b = shopV3ProvidersCollectionFragment;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("bFlPQ"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlPt"));
        this.f20313d = (LayoutInflater) systemService;
    }

    public final void e(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlPU"));
        ArrayList arrayList = this.c;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new v(arrayList, list));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("bFlPe"));
        arrayList.clear();
        arrayList.addAll(list);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopV3ProvidersCollectionItem) this.c.get(i)).getViewTypeProvidersCollectionItem().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlP8"));
        ArrayList arrayList = this.c;
        int i4 = t.f20310a[((ShopV3ProvidersCollectionItem) arrayList.get(i)).getViewTypeProvidersCollectionItem().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        xe.i iVar = (xe.i) viewHolder;
        Object obj = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj, numX49.tnTj78("bFlPC"));
        ShopProvider shopProvider = (ShopProvider) obj;
        iVar.c = shopProvider;
        C1967a c1967a = iVar.f20964b;
        c1967a.getClass();
        String logoUrl = shopProvider.getLogoUrl();
        xe.i iVar2 = (xe.i) c1967a.f18783b;
        C.e0(logoUrl, iVar2.e, 2131232014);
        String displayName = shopProvider.getDisplayName();
        kotlin.jvm.internal.j.g(displayName, numX49.tnTj78("bFlP4"));
        iVar2.f20965d.setText(displayName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlPo"));
        int value = ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_PROVIDER.getValue();
        LayoutInflater layoutInflater = this.f20313d;
        if (i != value) {
            if (i == ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_LOADING.getValue()) {
                return new ad.c(layoutInflater.inflate(R.layout.pma_view_shop_v3_providers_collection_item_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlPw")));
        }
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_providers_collection_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.provider_icon_image_view_pma_view_shop_v3_providers_collection_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.provider_icon_image_view_pma_view_shop_v3_providers_collection_item);
        if (imageView != null) {
            i4 = R.id.provider_name_text_view_pma_view_shop_v3_providers_collection_item;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.provider_name_text_view_pma_view_shop_v3_providers_collection_item);
            if (textView != null) {
                return new xe.i(new C0455g1(constraintLayout, constraintLayout, imageView, textView, 1), this.f20311a, this.f20312b);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bFlPK").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
