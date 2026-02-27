package ac;

import N5.C0450f;
import N5.C0466m;
import N5.C0491z;
import N5.t1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopHomeErrorRefreshCard;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.store.T;
import dOYHB6.tiZVw8.numX49;
import dc.C1353d;
import dc.C1354e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f7100b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7101d;
    public ShopHomeSectionCarousel e;

    public k(Context context, n nVar) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("buOPf"));
        this.f7099a = context;
        this.f7100b = nVar;
        Object systemService = context.getSystemService(numX49.tnTj78("buOP1"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buOPn"));
        this.c = (LayoutInflater) systemService;
        this.f7101d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f7101d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopHomeCarouselListItem) this.f7101d.get(i)).getViewTypeShopHomeCarouselItem().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOPx"));
        ArrayList arrayList = this.f7101d;
        if (i < arrayList.size()) {
            ShopHomeCarouselListItem shopHomeCarouselListItem = (ShopHomeCarouselListItem) arrayList.get(i);
            int i4 = AbstractC0681e.f7098a[shopHomeCarouselListItem.getViewTypeShopHomeCarouselItem().ordinal()];
            String strTnTj78 = numX49.tnTj78("buOPs");
            String strTnTj782 = numX49.tnTj78("buOP5");
            if (i4 == 1) {
                C1353d c1353d = (C1353d) viewHolder;
                ShopPurchaseHistory shopPurchaseHistory = (ShopPurchaseHistory) shopHomeCarouselListItem;
                c1353d.f16310d = i;
                c1353d.e = shopPurchaseHistory;
                R4.i iVar = c1353d.c;
                iVar.getClass();
                String strMProductName = shopPurchaseHistory.mProductName();
                C1353d c1353d2 = (C1353d) iVar.f5470b;
                if (strMProductName != null && strMProductName.length() != 0) {
                    c1353d2.getClass();
                    c1353d2.f.setText(strMProductName);
                }
                String strMProductDescription = shopPurchaseHistory.mProductDescription();
                if (strMProductDescription != null && strMProductDescription.length() != 0) {
                    c1353d2.getClass();
                    c1353d2.f16311g.setText(strMProductDescription);
                }
                String str = strTnTj782 + J.f10420a.format(shopPurchaseHistory.mPrice());
                c1353d2.getClass();
                kotlin.jvm.internal.j.g(str, strTnTj78);
                c1353d2.h.setText(str);
                String strMIconUrl = shopPurchaseHistory.mIconUrl();
                if (strMIconUrl == null || strMIconUrl.length() <= 0) {
                    return;
                }
                TypedValue typedValue = new TypedValue();
                Context context = c1353d2.f16308a;
                Resources.Theme theme = context.getTheme();
                if (theme != null) {
                    theme.resolveAttribute(R.attr.mayaShopDefaultIcon, typedValue, true);
                }
                com.paymaya.common.utility.C.f0(strMIconUrl, c1353d2.i, new Y.e(29, c1353d2, ContextCompat.getDrawable(context, typedValue.resourceId)));
                return;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    C1354e c1354e = (C1354e) viewHolder;
                    ShopHomeErrorRefreshCard shopHomeErrorRefreshCard = (ShopHomeErrorRefreshCard) shopHomeCarouselListItem;
                    c1354e.c = shopHomeErrorRefreshCard;
                    T3.l lVar = c1354e.f16313b;
                    lVar.getClass();
                    String errorMessage = shopHomeErrorRefreshCard.getErrorMessage();
                    C1354e c1354e2 = (C1354e) lVar.f5786b;
                    c1354e2.getClass();
                    kotlin.jvm.internal.j.g(errorMessage, numX49.tnTj78("buOPJ"));
                    c1354e2.f16314d.setText(errorMessage);
                    return;
                }
                dc.l lVar2 = (dc.l) viewHolder;
                ShopHomeSectionCarousel shopHomeSectionCarousel = this.e;
                ShopProvider shopProvider = (ShopProvider) shopHomeCarouselListItem;
                lVar2.c = i;
                lVar2.f16336d = shopHomeSectionCarousel;
                lVar2.e = shopProvider;
                Q6.s sVar = lVar2.f16335b;
                sVar.getClass();
                String iconUrl = shopProvider.getIconUrl();
                dc.l lVar3 = (dc.l) sVar.f5293b;
                lVar3.getClass();
                if (iconUrl == null || iconUrl.length() <= 0) {
                    return;
                }
                com.paymaya.common.utility.C.f0(iconUrl, lVar3.f, new T(lVar3, 4));
                return;
            }
            dc.j jVar = (dc.j) viewHolder;
            ProductV3 productV3 = (ProductV3) shopHomeCarouselListItem;
            jVar.f16328d = productV3;
            Q6.n nVar = jVar.c;
            nVar.getClass();
            String name = productV3.getName();
            dc.j jVar2 = (dc.j) nVar.f5284b;
            kotlin.jvm.internal.j.g(name, numX49.tnTj78("buOPI"));
            jVar2.e.setText(name);
            String description = productV3.getDescription();
            if (description != null) {
                jVar2.f.setText(description);
            }
            boolean zIsPromo = productV3.isPromo();
            Amount amountOriginal = productV3.getAmountOriginal();
            Amount amountDiscounted = productV3.getAmountDiscounted();
            kotlin.jvm.internal.j.g(amountOriginal, numX49.tnTj78("buOPq"));
            TextView textView = jVar2.f16329g;
            TextView textView2 = jVar2.h;
            if (!zIsPromo || amountDiscounted == null) {
                String str2 = strTnTj782 + amountOriginal.getFormattedValue();
                kotlin.jvm.internal.j.g(str2, strTnTj78);
                textView.setText(str2);
                textView2.setVisibility(8);
            } else {
                String str3 = strTnTj782 + amountDiscounted.getFormattedValue();
                kotlin.jvm.internal.j.g(str3, strTnTj78);
                textView.setText(str3);
                textView2.setVisibility(0);
                String str4 = strTnTj782 + amountOriginal.getFormattedValue();
                kotlin.jvm.internal.j.g(str4, strTnTj78);
                textView2.setText(str4);
                com.paymaya.common.utility.C.v0(textView2);
            }
            String iconUrl2 = productV3.getIconUrl();
            if (iconUrl2 != null) {
                TypedValue typedValue2 = new TypedValue();
                Context context2 = jVar2.f16326a;
                Resources.Theme theme2 = context2.getTheme();
                if (theme2 != null) {
                    theme2.resolveAttribute(R.attr.mayaShopDefaultIcon, typedValue2, true);
                }
                Drawable drawable = ContextCompat.getDrawable(context2, typedValue2.resourceId);
                if (iconUrl2.trim().length() == 0) {
                    iconUrl2 = null;
                }
                We.G gH = We.A.d().h(iconUrl2);
                if (gH.f6360d != 0) {
                    throw new IllegalStateException(numX49.tnTj78("buOPz"));
                }
                gH.h = drawable;
                gH.e(jVar2.i, null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOPl"));
        int value = ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_FAVORITE_LOADING.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i == value) {
            return new C0682f(layoutInflater.inflate(R.layout.pma_view_shop_v3_favorite_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING.getValue()) {
            return new C0683g(layoutInflater.inflate(R.layout.maya_view_shop_buy_again_purchase_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING.getValue()) {
            return new h(layoutInflater.inflate(R.layout.maya_view_shop_most_popular_product_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_DEALS_AND_PROMOS_LOADING.getValue()) {
            return new i(layoutInflater.inflate(R.layout.maya_view_shop_deals_and_promos_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO_LOADING.getValue()) {
            return new j(layoutInflater.inflate(R.layout.maya_view_shop_provider_logo_card_loading, viewGroup, false));
        }
        int value2 = ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE.getValue();
        Context context = this.f7099a;
        String strTnTj78 = numX49.tnTj78("buOPW");
        n nVar = this.f7100b;
        if (i == value2) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_shop_buy_again_purchase_card, viewGroup, false);
            int i4 = R.id.shop_buy_again_icon_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.shop_buy_again_icon_image_view);
            if (imageView != null) {
                i4 = R.id.shop_buy_again_product_description_snippet_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_buy_again_product_description_snippet_text_view);
                if (textView != null) {
                    i4 = R.id.shop_buy_again_product_name_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_buy_again_product_name_text_view);
                    if (textView2 != null) {
                        i4 = R.id.shop_buy_again_product_price_text_view;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_buy_again_product_price_text_view);
                        if (textView3 != null) {
                            i4 = R.id.shop_buy_again_voucher_details_divider;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.shop_buy_again_voucher_details_divider);
                            if (viewFindChildViewById != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                return new C1353d(new C0491z((ViewGroup) constraintLayout, (View) imageView, textView, textView2, textView3, viewFindChildViewById, (View) constraintLayout, 27), context, nVar);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT.getValue()) {
            if (i != ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO.getValue()) {
                if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_ERROR_REFRESH.getValue()) {
                    return new C1354e(C0450f.e(layoutInflater, viewGroup), nVar);
                }
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buOb9")));
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_provider_logo_card, viewGroup, false);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate2;
            int i6 = R.id.shop_provider_icon_image_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_provider_icon_image_view);
            if (imageView2 != null) {
                i6 = R.id.shop_provider_placeholder_icon_image_view;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_provider_placeholder_icon_image_view);
                if (imageView3 != null) {
                    return new dc.l(new t1(constraintLayout2, constraintLayout2, imageView2, imageView3, 1), context, nVar);
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(i6)));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.maya_view_shop_most_popular_product_card, viewGroup, false);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate3;
        int i10 = R.id.shop_most_popular_product_description_snippet_text_view;
        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_most_popular_product_description_snippet_text_view);
        if (textView4 != null) {
            i10 = R.id.shop_most_popular_product_icon_image_view;
            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_most_popular_product_icon_image_view);
            if (imageView4 != null) {
                i10 = R.id.shop_most_popular_product_name_text_view;
                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_most_popular_product_name_text_view);
                if (textView5 != null) {
                    i10 = R.id.shop_most_popular_product_previous_price_text_view;
                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_most_popular_product_previous_price_text_view);
                    if (textView6 != null) {
                        i10 = R.id.shop_most_popular_product_price_text_view;
                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_most_popular_product_price_text_view);
                        if (textView7 != null) {
                            i10 = R.id.voucher_details_divider_1;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate3, R.id.voucher_details_divider_1);
                            if (viewFindChildViewById2 != null) {
                                return new dc.j(new C0466m((ViewGroup) constraintLayout3, (View) constraintLayout3, (View) textView4, (View) imageView4, (View) textView5, (View) textView6, (View) textView7, viewFindChildViewById2, 22), context, nVar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate3.getResources().getResourceName(i10)));
    }
}
