package ac;

import N5.B1;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopSearchListItem;
import dOYHB6.tiZVw8.numX49;
import dc.C1351b;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f7085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7086b = new ArrayList();
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7087d;

    /* JADX WARN: Multi-variable type inference failed */
    public F(Context context, InterfaceC0675D interfaceC0675D) {
        this.f7085a = (MayaBaseFragment) interfaceC0675D;
        Object systemService = context.getSystemService(numX49.tnTj78("buOU"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buOe"));
        this.c = (LayoutInflater) systemService;
    }

    public final void e(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buO8"));
        ArrayList arrayList = this.f7086b;
        ArrayList arrayListL = C1110A.L(list, arrayList);
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new G(arrayList, arrayListL));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("buOC"));
        arrayList.clear();
        arrayList.addAll(arrayListL);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    public final void f(boolean z4) {
        if (z4 && !this.f7087d) {
            this.f7087d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f7087d) {
                return;
            }
            this.f7087d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f7086b.size() + (this.f7087d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.f7087d && i == getItemCount() + (-1)) ? ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue() : ((ShopSearchListItem) this.f7086b.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buO4"));
        ArrayList arrayList = this.f7086b;
        if (i < arrayList.size()) {
            int i4 = AbstractC0676E.f7084a[((ShopSearchListItem) arrayList.get(i)).getViewType().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            dc.q qVar = (dc.q) viewHolder;
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, numX49.tnTj78("buOo"));
            ProductV3 productV3 = (ProductV3) obj;
            qVar.i = i;
            qVar.j = productV3;
            Q6.r rVar = qVar.f16357g;
            rVar.getClass();
            boolean zIsDisabled = productV3.isDisabled();
            String iconUrl = productV3.getIconUrl();
            boolean z4 = !(iconUrl == null || iconUrl.length() == 0);
            dc.q qVar2 = (dc.q) rVar.f5291b;
            if (zIsDisabled) {
                String iconUrl2 = productV3.getIconUrl();
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = qVar2.f16354a.getContext().getTheme();
                if (theme != null) {
                    theme.resolveAttribute(R.attr.mayaDrawable_ShopPlaceholder, typedValue, true);
                }
                qVar2.D(iconUrl2, typedValue.resourceId, z4, z4);
                String name = productV3.getName();
                TextView textView = qVar2.f16355b;
                textView.setText(name);
                textView.setTextAppearance(textView.getContext(), R.style.JekoSemiBoldTextBody_Tertiary);
                String description = productV3.getDescription();
                TextView textView2 = qVar2.c;
                textView2.setText(description);
                textView2.setTextAppearance(textView2.getContext(), R.style.JekoSemiBoldSmallText_Quaternanry);
                qVar2.f16356d.setVisibility(0);
                qVar2.f.setVisibility(8);
                qVar2.e.setVisibility(8);
                return;
            }
            qVar2.D(productV3.getIconUrl(), R.drawable.maya_ic_shop_placeholder_green, z4, z4);
            String name2 = productV3.getName();
            TextView textView3 = qVar2.f16355b;
            textView3.setText(name2);
            textView3.setTextAppearance(textView3.getContext(), R.style.JekoSemiBoldTextBody_Primary);
            String description2 = productV3.getDescription();
            TextView textView4 = qVar2.c;
            textView4.setText(description2);
            textView4.setTextAppearance(textView4.getContext(), R.style.JekoSemiBoldSmallText_Tertiary);
            if (productV3.isPromo()) {
                Amount amountDiscounted = productV3.getAmountDiscounted();
                String strV = com.paymaya.common.utility.C.v(amountDiscounted != null ? amountDiscounted.mValue() : null);
                TextView textView5 = qVar2.f;
                textView5.setText(textView5.getContext().getString(R.string.maya_currency_with_value, strV));
            } else {
                Amount amountOriginal = productV3.getAmountOriginal();
                String strV2 = com.paymaya.common.utility.C.v(amountOriginal != null ? amountOriginal.mValue() : null);
                TextView textView6 = qVar2.f;
                textView6.setText(textView6.getContext().getString(R.string.maya_currency_with_value, strV2));
            }
            boolean zIsPromo = productV3.isPromo();
            TextView textView7 = qVar2.e;
            if (zIsPromo) {
                textView7.setText(textView7.getContext().getString(R.string.maya_currency_with_value, com.paymaya.common.utility.C.v(productV3.getAmountOriginal().mValue())));
                com.paymaya.common.utility.C.v0(textView7);
            }
            qVar2.f16356d.setVisibility(8);
            qVar2.f.setVisibility(0);
            if (productV3.isPromo()) {
                textView7.setVisibility(0);
            } else {
                qVar2.e.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [ac.D, com.paymaya.common.base.MayaBaseFragment] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOK"));
        int value = ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i != ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buOc")));
            }
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, viewGroup, false);
            kotlin.jvm.internal.j.d(viewInflate);
            return new C1351b(viewInflate);
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_search_item, viewGroup, false);
        int i4 = R.id.product_description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_description_text_view);
        if (textView != null) {
            i4 = R.id.product_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate2, R.id.product_image_view);
            if (appCompatImageView != null) {
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
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                                return new dc.q(new B1(constraintLayout, textView, appCompatImageView, textView2, textView3, textView4, textView5, constraintLayout), this.f7085a);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("buOw").concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
