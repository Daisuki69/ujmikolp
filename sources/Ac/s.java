package ac;

import N5.B1;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopV3ListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseLoadingFragment f7113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7114b = new ArrayList();
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7115d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(FragmentActivity fragmentActivity, p pVar) {
        this.f7113a = (MayaBaseLoadingFragment) pVar;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("buOf"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buO1"));
        this.c = (LayoutInflater) systemService;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.f7114b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ProductV3) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean f() {
        Object next;
        if (this.f7115d) {
            return true;
        }
        ArrayList arrayList = this.f7114b;
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

    public final void g(boolean z4) {
        if (z4 && !f()) {
            this.f7115d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !f()) {
                return;
            }
            this.f7115d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f7114b.size() + (this.f7115d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.f7115d && i == getItemCount() + (-1)) ? ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_LOADING_MORE.getValue() : ((ShopV3ListItem) this.f7114b.get(i)).getViewTypeShopProductItem().getValue();
    }

    public final void h(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buOn"));
        ArrayList arrayList = this.f7114b;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new t(arrayList, list));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("buOx"));
        arrayList.clear();
        arrayList.addAll(list);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOs"));
        ArrayList arrayList = this.f7114b;
        if (i >= arrayList.size() || q.f7112a[((ShopV3ListItem) arrayList.get(i)).getViewTypeShopProductItem().ordinal()] != 1) {
            return;
        }
        dc.k kVar = (dc.k) viewHolder;
        Object obj = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj, numX49.tnTj78("buO5"));
        ProductV3 productV3 = (ProductV3) obj;
        kVar.i = i;
        kVar.j = productV3;
        Qd.a aVar = kVar.f16333g;
        aVar.getClass();
        boolean zIsDisabled = productV3.isDisabled();
        String iconUrl = productV3.getIconUrl();
        boolean z4 = !(iconUrl == null || iconUrl.length() == 0);
        dc.k kVar2 = (dc.k) aVar.f5354b;
        if (zIsDisabled) {
            String iconUrl2 = productV3.getIconUrl();
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = kVar2.f16330a.getContext().getTheme();
            if (theme != null) {
                theme.resolveAttribute(R.attr.mayaDrawable_ShopPlaceholder, typedValue, true);
            }
            kVar2.D(iconUrl2, typedValue.resourceId, z4, z4);
            String name = productV3.getName();
            TextView textView = kVar2.f16331b;
            textView.setText(name);
            textView.setTextAppearance(textView.getContext(), R.style.JekoSemiBoldTextBody_Tertiary);
            String description = productV3.getDescription();
            TextView textView2 = kVar2.c;
            textView2.setText(description);
            textView2.setTextAppearance(textView2.getContext(), R.style.JekoSemiBoldSmallText_Quaternanry);
            kVar2.f16332d.setVisibility(0);
            kVar2.f.setVisibility(8);
            kVar2.e.setVisibility(8);
            return;
        }
        kVar2.D(productV3.getIconUrl(), R.drawable.maya_ic_shop_placeholder_green, z4, z4);
        String name2 = productV3.getName();
        TextView textView3 = kVar2.f16331b;
        textView3.setText(name2);
        textView3.setTextAppearance(textView3.getContext(), R.style.JekoSemiBoldTextBody_Primary);
        String description2 = productV3.getDescription();
        TextView textView4 = kVar2.c;
        textView4.setText(description2);
        textView4.setTextAppearance(textView4.getContext(), R.style.JekoSemiBoldSmallText_Tertiary);
        if (productV3.isPromo()) {
            Amount amountDiscounted = productV3.getAmountDiscounted();
            String strV = com.paymaya.common.utility.C.v(amountDiscounted != null ? amountDiscounted.mValue() : null);
            TextView textView5 = kVar2.f;
            textView5.setText(textView5.getContext().getString(R.string.maya_currency_with_value, strV));
        } else {
            Amount amountOriginal = productV3.getAmountOriginal();
            String strV2 = com.paymaya.common.utility.C.v(amountOriginal != null ? amountOriginal.mValue() : null);
            TextView textView6 = kVar2.f;
            textView6.setText(textView6.getContext().getString(R.string.maya_currency_with_value, strV2));
        }
        boolean zIsPromo = productV3.isPromo();
        TextView textView7 = kVar2.e;
        if (zIsPromo) {
            textView7.setText(textView7.getContext().getString(R.string.maya_currency_with_value, com.paymaya.common.utility.C.v(productV3.getAmountOriginal().mValue())));
            com.paymaya.common.utility.C.v0(textView7);
        }
        kVar2.f16332d.setVisibility(8);
        kVar2.f.setVisibility(0);
        if (productV3.isPromo()) {
            textView7.setVisibility(0);
        } else {
            kVar2.e.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [ac.p, com.paymaya.common.base.MayaBaseLoadingFragment] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOJ"));
        int value = ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PRODUCT.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i == ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_LOADING_MORE.getValue()) {
                View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, viewGroup, false);
                kotlin.jvm.internal.j.f(viewInflate, numX49.tnTj78("buOq"));
                return new Z6.e(viewInflate);
            }
            if (i == ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PROVIDER_PRODUCT_LOADING.getValue()) {
                return new r(layoutInflater.inflate(R.layout.maya_view_shop_provider_product_item_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buOz")));
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_product_item, viewGroup, false);
        int i4 = R.id.product_description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_description_text_view);
        if (textView != null) {
            i4 = R.id.product_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate2, R.id.product_image_view);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                i4 = R.id.product_name_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_name_text_view);
                if (textView2 != null) {
                    i4 = R.id.product_not_available_text_view;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_not_available_text_view);
                    if (textView3 != null) {
                        i4 = R.id.product_previous_price_text_view;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_previous_price_text_view);
                        if (textView4 != null) {
                            i4 = R.id.product_price_text_view;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_price_text_view);
                            if (textView5 != null) {
                                return new dc.k(new B1(constraintLayout, textView, appCompatImageView, constraintLayout, textView2, textView3, textView4, textView5), this.f7113a);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("buOI").concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
