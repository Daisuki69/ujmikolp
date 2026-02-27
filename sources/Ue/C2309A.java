package ue;

import N5.G1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopSearchListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ph.C2070f1;

/* JADX INFO: renamed from: ue.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2309A extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseLoadingFragment f20282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20283b = new ArrayList();
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20284d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2309A(FragmentActivity fragmentActivity, y yVar) {
        this.f20282a = (BaseLoadingFragment) yVar;
        Object systemService = fragmentActivity.getSystemService(numX49.tnTj78("bFls"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFl5"));
        this.c = (LayoutInflater) systemService;
    }

    public final void e(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlJ"));
        ArrayList arrayList = this.f20283b;
        ArrayList arrayListL = C1110A.L(list, arrayList);
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C2310B(arrayList, arrayListL));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("bFlI"));
        arrayList.clear();
        arrayList.addAll(arrayListL);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    public final void f(boolean z4) {
        if (z4 && !this.f20284d) {
            this.f20284d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f20284d) {
                return;
            }
            this.f20284d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20283b.size() + (this.f20284d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.f20284d && i == getItemCount() + (-1)) ? ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue() : ((ShopSearchListItem) this.f20283b.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlq"));
        ArrayList arrayList = this.f20283b;
        if (i < arrayList.size()) {
            int i4 = z.f20319a[((ShopSearchListItem) arrayList.get(i)).getViewType().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            xe.m mVar = (xe.m) viewHolder;
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, numX49.tnTj78("bFlz"));
            ProductV3 productV3 = (ProductV3) obj;
            mVar.i = productV3;
            C2070f1 c2070f1 = mVar.f20982g;
            c2070f1.getClass();
            String name = productV3.getName();
            xe.m mVar2 = (xe.m) c2070f1.f19463b;
            mVar2.f20980b.setText(name);
            String description = productV3.getDescription();
            TextView textView = mVar2.c;
            textView.setText(description);
            String iconUrl = productV3.getIconUrl();
            mVar2.itemView.getContext();
            ImageView imageView = mVar2.f20979a;
            C.e0(iconUrl, imageView, 2131232014);
            boolean zIsDisabled = productV3.isDisabled();
            TextView textView2 = mVar2.f20981d;
            TextView textView3 = mVar2.f20980b;
            TextView textView4 = mVar2.f;
            if (zIsDisabled) {
                textView4.setVisibility(8);
                mVar2.e.setVisibility(8);
                imageView.setAlpha(0.4f);
                textView3.setTextColor(ColorUtils.setAlphaComponent(ContextCompat.getColor(textView3.getContext(), R.color.pma_text_color_dark_grey), 100));
                textView.setTextColor(ColorUtils.setAlphaComponent(ContextCompat.getColor(textView.getContext(), R.color.pma_text_color_light_grey), 100));
                textView2.setVisibility(0);
                return;
            }
            boolean zIsPromo = productV3.isPromo();
            TextView textView5 = mVar2.e;
            String strTnTj78 = numX49.tnTj78("bFll");
            if (zIsPromo) {
                textView5.setText(productV3.getAmountOriginal().mCurrency() + strTnTj78 + C.v(productV3.getAmountOriginal().mValue()));
                C.v0(textView5);
            }
            if (productV3.isPromo()) {
                textView5.setVisibility(0);
            } else {
                mVar2.e.setVisibility(8);
            }
            textView4.setVisibility(0);
            textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), R.color.pma_text_color_dark_grey));
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.pma_text_color_light_grey));
            textView2.setVisibility(8);
            imageView.setAlpha(1.0f);
            if (!productV3.isPromo()) {
                mVar2.f.setText(androidx.camera.core.impl.a.j(productV3.getAmountOriginal().mCurrency(), strTnTj78, C.v(productV3.getAmountOriginal().mValue())));
                return;
            }
            Amount amountDiscounted = productV3.getAmountDiscounted();
            String strMCurrency = amountDiscounted != null ? amountDiscounted.mCurrency() : null;
            Amount amountDiscounted2 = productV3.getAmountDiscounted();
            mVar2.f.setText(androidx.camera.core.impl.a.j(strMCurrency, strTnTj78, C.v(amountDiscounted2 != null ? amountDiscounted2.mValue() : null)));
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [com.paymaya.common.base.BaseLoadingFragment, ue.y] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlW"));
        int value = ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i == ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                return new ad.c(layoutInflater.inflate(R.layout.pma_view_loading, viewGroup, false));
            }
            throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlPP")));
        }
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_search_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.product_bottom_details_barrier_pma_view_shop_search_item;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.product_bottom_details_barrier_pma_view_shop_search_item)) != null) {
            i4 = R.id.product_description_text_view_pma_view_shop_search_item;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_description_text_view_pma_view_shop_search_item);
            if (textView != null) {
                i4 = R.id.product_icon_guideline_pma_view_shop_search_item;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_guideline_pma_view_shop_search_item)) != null) {
                    i4 = R.id.product_icon_image_view_pma_view_shop_search_item;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_image_view_pma_view_shop_search_item);
                    if (imageView != null) {
                        i4 = R.id.product_name_text_view_pma_view_shop_search_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_view_pma_view_shop_search_item);
                        if (textView2 != null) {
                            i4 = R.id.product_not_available_text_view_pma_view_shop_search_item;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_not_available_text_view_pma_view_shop_search_item);
                            if (textView3 != null) {
                                i4 = R.id.product_previous_price_text_view_pma_view_shop_search_item;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_previous_price_text_view_pma_view_shop_search_item);
                                if (textView4 != null) {
                                    i4 = R.id.product_price_text_view_pma_view_shop_search_item;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_price_text_view_pma_view_shop_search_item);
                                    if (textView5 != null) {
                                        return new xe.m(new G1(constraintLayout, constraintLayout, textView, imageView, textView2, textView3, textView4, textView5, 1), this.f20282a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bFlP9").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
