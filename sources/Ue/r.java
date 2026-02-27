package ue;

import N5.G1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopV3ListItem;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oi.C1983a;
import xe.C2475f;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopV3ProviderProductsListFragment f20305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20306b = new ArrayList();
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20307d;

    public r(FragmentActivity fragmentActivity, ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment) {
        this.f20305a = shopV3ProviderProductsListFragment;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("bFla"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlX"));
        this.c = (LayoutInflater) systemService;
    }

    public final boolean e() {
        Object next;
        if (this.f20307d) {
            return true;
        }
        ArrayList arrayList = this.f20306b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ShopV3ListItem) next).getViewTypeShopProductItem() == ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PROVIDER_PRODUCT_LOADING) {
                break;
            }
        }
        return next != null;
    }

    public final void f(boolean z4) {
        if (z4 && !e()) {
            this.f20307d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !e()) {
                return;
            }
            this.f20307d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    public final void g(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlG"));
        ArrayList arrayList = this.f20306b;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new s(arrayList, list));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("bFl3"));
        arrayList.clear();
        arrayList.addAll(list);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20306b.size() + (this.f20307d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.f20307d && i == getItemCount() + (-1)) ? ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_LOADING_MORE.getValue() : ((ShopV3ListItem) this.f20306b.get(i)).getViewTypeShopProductItem().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFly"));
        ArrayList arrayList = this.f20306b;
        if (i < arrayList.size()) {
            if (p.f20304a[((ShopV3ListItem) arrayList.get(i)).getViewTypeShopProductItem().ordinal()] != 1) {
                return;
            }
            C2475f c2475f = (C2475f) viewHolder;
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, numX49.tnTj78("bFlv"));
            ProductV3 productV3 = (ProductV3) obj;
            c2475f.i = productV3;
            C1983a c1983a = c2475f.f20956g;
            c1983a.getClass();
            String iconUrl = productV3.getIconUrl();
            C2475f c2475f2 = (C2475f) c1983a.f18892b;
            c2475f2.itemView.getContext();
            C.e0(iconUrl, c2475f2.f20953a, 2131232014);
            String name = productV3.getName();
            TextView textView = c2475f2.f20954b;
            textView.setText(name);
            String description = productV3.getDescription();
            TextView textView2 = c2475f2.c;
            textView2.setText(description);
            boolean zIsDisabled = productV3.isDisabled();
            TextView textView3 = c2475f2.f20955d;
            TextView textView4 = c2475f2.f;
            if (zIsDisabled) {
                textView4.setVisibility(8);
                c2475f2.e.setVisibility(8);
                textView.setTextColor(ColorUtils.setAlphaComponent(ContextCompat.getColor(textView.getContext(), R.color.pma_text_color_dark_grey), 100));
                textView2.setTextColor(ColorUtils.setAlphaComponent(ContextCompat.getColor(textView2.getContext(), R.color.pma_text_color_light_grey), 100));
                textView3.setVisibility(0);
                return;
            }
            boolean zIsPromo = productV3.isPromo();
            String strTnTj78 = numX49.tnTj78("bFl7");
            if (zIsPromo) {
                String strJ = androidx.camera.core.impl.a.j(productV3.getAmountOriginal().mCurrency(), strTnTj78, C.v(productV3.getAmountOriginal().mValue()));
                TextView textView5 = c2475f2.e;
                textView5.setText(strJ);
                C.v0(textView5);
                textView5.setVisibility(0);
            } else {
                c2475f2.e.setVisibility(8);
            }
            textView4.setVisibility(0);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.pma_text_color_dark_grey));
            textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), R.color.pma_text_color_light_grey));
            textView3.setVisibility(8);
            Amount amountDiscounted = productV3.getAmountDiscounted();
            if (amountDiscounted == null || !productV3.isPromo()) {
                c2475f2.f.setText(androidx.camera.core.impl.a.j(productV3.getAmountOriginal().mCurrency(), strTnTj78, C.v(productV3.getAmountOriginal().mValue())));
            } else {
                c2475f2.f.setText(androidx.camera.core.impl.a.j(amountDiscounted.mCurrency(), strTnTj78, C.v(amountDiscounted.mValue())));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlA"));
        int value = ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PRODUCT.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i == ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_LOADING_MORE.getValue()) {
                return new ad.c(layoutInflater.inflate(R.layout.pma_view_loading, viewGroup, false));
            }
            if (i == ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PROVIDER_PRODUCT_LOADING.getValue()) {
                return new q(layoutInflater.inflate(R.layout.pma_view_shop_v3_provider_product_item_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlT")));
        }
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_product_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.product_bottom_details_barrier_pma_view_shop_v3_product_item;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.product_bottom_details_barrier_pma_view_shop_v3_product_item)) != null) {
            i4 = R.id.product_description_text_view_pma_view_shop_v3_product_item;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_description_text_view_pma_view_shop_v3_product_item);
            if (textView != null) {
                i4 = R.id.product_icon_image_view_pma_view_shop_v3_product_item;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_image_view_pma_view_shop_v3_product_item);
                if (imageView != null) {
                    i4 = R.id.product_name_text_view_pma_view_shop_v3_product_item;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_view_pma_view_shop_v3_product_item);
                    if (textView2 != null) {
                        i4 = R.id.product_not_available_text_view_pma_view_shop_v3_product_item;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_not_available_text_view_pma_view_shop_v3_product_item);
                        if (textView3 != null) {
                            i4 = R.id.product_previous_price_text_view_pma_view_shop_v3_product_item;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_previous_price_text_view_pma_view_shop_v3_product_item);
                            if (textView4 != null) {
                                i4 = R.id.product_price_text_view_pma_view_shop_v3_product_item;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_price_text_view_pma_view_shop_v3_product_item);
                                if (textView5 != null) {
                                    return new C2475f(new G1(constraintLayout, constraintLayout, textView, imageView, textView2, textView3, textView4, textView5, 0), this.f20305a);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bFlY").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
