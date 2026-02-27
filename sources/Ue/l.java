package ue;

import N5.C0450f;
import N5.F1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopHomeErrorRefreshCard;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopPurchaseHistory;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import oi.C1983a;
import xe.C2470a;
import xe.C2471b;
import xe.C2474e;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f20297b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20298d;

    public l(Context context, m mVar) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("bFlPL"));
        this.f20296a = context;
        this.f20297b = mVar;
        Object systemService = context.getSystemService(numX49.tnTj78("bFlPr"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlPZ"));
        this.c = (LayoutInflater) systemService;
        this.f20298d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20298d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopHomeCarouselListItem) this.f20298d.get(i)).getViewTypeShopHomeCarouselItem().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlPk"));
        ArrayList arrayList = this.f20298d;
        if (i < arrayList.size()) {
            ShopHomeCarouselListItem shopHomeCarouselListItem = (ShopHomeCarouselListItem) arrayList.get(i);
            int i4 = f.f20295a[shopHomeCarouselListItem.getViewTypeShopHomeCarouselItem().ordinal()];
            if (i4 == 1) {
                C2470a c2470a = (C2470a) viewHolder;
                ShopPurchaseHistory shopPurchaseHistory = (ShopPurchaseHistory) shopHomeCarouselListItem;
                c2470a.c = shopPurchaseHistory;
                C1983a c1983a = c2470a.f20936b;
                c1983a.getClass();
                String strMProductName = shopPurchaseHistory.mProductName();
                C2470a c2470a2 = (C2470a) c1983a.f18892b;
                if (strMProductName != null && strMProductName.length() != 0) {
                    c2470a2.f20937d.setText(strMProductName);
                }
                String strMProductDescription = shopPurchaseHistory.mProductDescription();
                if (strMProductDescription != null && strMProductDescription.length() != 0) {
                    c2470a2.e.setText(strMProductDescription);
                }
                String str = numX49.tnTj78("bFlPj") + J.f10420a.format(shopPurchaseHistory.mPrice());
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFlPd"));
                c2470a2.f.setText(str);
                String strMIconUrl = shopPurchaseHistory.mIconUrl();
                if (strMIconUrl != null) {
                    C.e0(strMIconUrl, c2470a2.f20938g, 2131232014);
                    return;
                }
                return;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    xe.g gVar = (xe.g) viewHolder;
                    ShopProvider shopProvider = (ShopProvider) shopHomeCarouselListItem;
                    gVar.c = shopProvider;
                    o6.f fVar = gVar.f20958b;
                    fVar.getClass();
                    C.e0(shopProvider.getLogoUrl(), ((xe.g) fVar.f18793b).f20959d, 2131232014);
                    return;
                }
                if (i4 != 4) {
                    return;
                }
                C2471b c2471b = (C2471b) viewHolder;
                ShopHomeErrorRefreshCard shopHomeErrorRefreshCard = (ShopHomeErrorRefreshCard) shopHomeCarouselListItem;
                c2471b.c = shopHomeErrorRefreshCard;
                qc.c cVar = c2471b.f20940b;
                cVar.getClass();
                String errorMessage = shopHomeErrorRefreshCard.getErrorMessage();
                C2471b c2471b2 = (C2471b) cVar.f19770b;
                kotlin.jvm.internal.j.g(errorMessage, numX49.tnTj78("bFlPB"));
                c2471b2.f20941d.setText(errorMessage);
                return;
            }
            C2474e c2474e = (C2474e) viewHolder;
            ProductV3 productV3 = (ProductV3) shopHomeCarouselListItem;
            c2474e.c = productV3;
            qc.c cVar2 = c2474e.f20950b;
            cVar2.getClass();
            String name = productV3.getName();
            C2474e c2474e2 = (C2474e) cVar2.f19770b;
            kotlin.jvm.internal.j.g(name, numX49.tnTj78("bFlPu"));
            c2474e2.f20951d.setText(name);
            String description = productV3.getDescription();
            if (description != null) {
                c2474e2.e.setText(description);
            }
            boolean zIsPromo = productV3.isPromo();
            Amount amountOriginal = productV3.getAmountOriginal();
            Amount amountDiscounted = productV3.getAmountDiscounted();
            kotlin.jvm.internal.j.g(amountOriginal, numX49.tnTj78("bFlPV"));
            TextView textView = c2474e2.f;
            String strTnTj78 = numX49.tnTj78("bFlPS");
            if (!zIsPromo || amountDiscounted == null) {
                String currencyFormattedValue = amountOriginal.getCurrencyFormattedValue();
                kotlin.jvm.internal.j.f(currencyFormattedValue, strTnTj78);
                textView.setText(currencyFormattedValue);
            } else {
                String currencyFormattedValue2 = amountDiscounted.getCurrencyFormattedValue();
                kotlin.jvm.internal.j.f(currencyFormattedValue2, strTnTj78);
                textView.setText(currencyFormattedValue2);
            }
            String iconUrl = productV3.getIconUrl();
            if (iconUrl != null) {
                C.e0(iconUrl, c2474e2.f20952g, 2131232014);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlPi"));
        int value = ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_FAVORITE_LOADING.getValue();
        LayoutInflater layoutInflater = this.c;
        if (i == value) {
            return new g(layoutInflater.inflate(R.layout.pma_view_shop_v3_favorite_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING.getValue()) {
            return new h(layoutInflater.inflate(R.layout.pma_view_shop_v3_buy_again_purchase_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING.getValue()) {
            return new i(layoutInflater.inflate(R.layout.pma_view_shop_v3_most_popular_product_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_DEALS_AND_PROMOS_LOADING.getValue()) {
            return new j(layoutInflater.inflate(R.layout.pma_view_shop_v3_deals_and_promos_card_loading, viewGroup, false));
        }
        if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO_LOADING.getValue()) {
            return new k(layoutInflater.inflate(R.layout.pma_view_shop_v3_provider_logo_card_loading, viewGroup, false));
        }
        int value2 = ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE.getValue();
        Context context = this.f20296a;
        String strTnTj78 = numX49.tnTj78("bFlPE");
        m mVar = this.f20297b;
        if (i == value2) {
            View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_buy_again_purchase_card, viewGroup, false);
            CardView cardView = (CardView) viewInflate;
            int i4 = R.id.product_description_snippet_text_view_pma_view_shop_v3_buy_again_purchase_card;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_description_snippet_text_view_pma_view_shop_v3_buy_again_purchase_card);
            if (textView != null) {
                i4 = R.id.product_icon_image_view_pma_view_shop_v3_buy_again_purchase_card;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_image_view_pma_view_shop_v3_buy_again_purchase_card);
                if (imageView != null) {
                    i4 = R.id.product_name_text_view_pma_view_shop_v3_buy_again_purchase_card;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_view_pma_view_shop_v3_buy_again_purchase_card);
                    if (textView2 != null) {
                        i4 = R.id.product_price_text_view_pma_view_shop_v3_buy_again_purchase_card;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_price_text_view_pma_view_shop_v3_buy_again_purchase_card);
                        if (textView3 != null) {
                            return new C2470a(new F1(cardView, cardView, textView, imageView, textView2, textView3, 0), context, mVar);
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT.getValue()) {
            if (i != ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO.getValue()) {
                if (i == ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_ERROR_REFRESH.getValue()) {
                    return new C2471b(C0450f.e(layoutInflater, viewGroup), mVar);
                }
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlPF")));
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.pma_view_shop_v3_provider_logo_card, viewGroup, false);
            CardView cardView2 = (CardView) viewInflate2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.provider_icon_image_view_pma_shop_view_v3_provider_logo_card);
            if (imageView2 != null) {
                return new xe.g(new Z4.a(cardView2, cardView2, imageView2, 1), context, mVar);
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(R.id.provider_icon_image_view_pma_shop_view_v3_provider_logo_card)));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.pma_view_shop_v3_most_popular_product_card, viewGroup, false);
        CardView cardView3 = (CardView) viewInflate3;
        int i6 = R.id.product_description_snippet_text_view_pma_view_shop_v3_most_popular_product_card;
        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_description_snippet_text_view_pma_view_shop_v3_most_popular_product_card);
        if (textView4 != null) {
            i6 = R.id.product_icon_image_view_pma_view_shop_v3_most_popular_product_card;
            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.product_icon_image_view_pma_view_shop_v3_most_popular_product_card);
            if (imageView3 != null) {
                i6 = R.id.product_name_text_view_pma_view_shop_v3_most_popular_product_card;
                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_name_text_view_pma_view_shop_v3_most_popular_product_card);
                if (textView5 != null) {
                    i6 = R.id.product_price_text_view_pma_view_shop_v3_most_popular_product_card;
                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_price_text_view_pma_view_shop_v3_most_popular_product_card);
                    if (textView6 != null) {
                        return new C2474e(new F1(cardView3, cardView3, textView4, imageView3, textView5, textView6, 1), context, mVar);
                    }
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate3.getResources().getResourceName(i6)));
    }
}
