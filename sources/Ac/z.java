package ac;

import N5.k1;
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
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaShopProvidersCollectionFragment f7126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7127b = new ArrayList();
    public final LayoutInflater c;

    public z(FragmentActivity fragmentActivity, MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment) {
        this.f7126a = mayaShopProvidersCollectionFragment;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("buOV"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buOS"));
        this.c = (LayoutInflater) systemService;
    }

    public final void e(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buOj"));
        ArrayList arrayList = this.f7127b;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C0672A(arrayList, list));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("buOd"));
        arrayList.clear();
        arrayList.addAll(list);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f7127b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopV3ProvidersCollectionItem) this.f7127b.get(i)).getViewTypeProvidersCollectionItem().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOi"));
        ArrayList arrayList = this.f7127b;
        int i4 = y.f7125a[((ShopV3ProvidersCollectionItem) arrayList.get(i)).getViewTypeProvidersCollectionItem().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        dc.m mVar = (dc.m) viewHolder;
        Object obj = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj, numX49.tnTj78("buOE"));
        ShopProvider shopProvider = (ShopProvider) obj;
        mVar.c = shopProvider;
        R4.i iVar = mVar.f16339b;
        iVar.getClass();
        String iconUrl = shopProvider.getIconUrl();
        dc.m mVar2 = (dc.m) iVar.f5470b;
        ImageView imageView = mVar2.f;
        ImageView imageView2 = mVar2.e;
        if (iconUrl == null || shopProvider.getIconUrl().length() <= 0) {
            imageView.setVisibility(0);
            imageView2.setVisibility(4);
        } else {
            String iconUrl2 = shopProvider.getIconUrl();
            int dimensionPixelSize = imageView2.getContext().getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_large);
            com.paymaya.common.utility.C.b0(iconUrl2, imageView2, dimensionPixelSize, dimensionPixelSize, new L(mVar2, 5));
            imageView.setVisibility(4);
            imageView2.setVisibility(0);
        }
        String displayName = shopProvider.getDisplayName();
        kotlin.jvm.internal.j.g(displayName, numX49.tnTj78("buOF"));
        mVar2.f16340d.setText(displayName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOH"));
        int value = ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_PROVIDER.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i != ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_LOADING.getValue()) {
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buOt")));
            }
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_shop_providers_collection_item_loading, viewGroup, false);
            kotlin.jvm.internal.j.f(viewInflate, numX49.tnTj78("buOQ"));
            return new Z6.e(viewInflate);
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_providers_collection_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
        int i4 = R.id.provider_icon_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.provider_icon_image_view);
        if (imageView != null) {
            i4 = R.id.provider_icon_placeholder_image_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.provider_icon_placeholder_image_view);
            if (imageView2 != null) {
                i4 = R.id.provider_name_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.provider_name_text_view);
                if (textView != null) {
                    return new dc.m(new k1(constraintLayout, constraintLayout, imageView, imageView2, textView), this.f7126a);
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("buOO").concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
