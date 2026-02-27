package com.paymaya.domain.model;

import android.os.Parcelable;
import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopHomeCarouselListItem extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[] $VALUES;
        private final int value;
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_ERROR_REFRESH = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_ERROR_REFRESH", 0, -999999);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING", 1, -5);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_FAVORITE_LOADING = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_FAVORITE_LOADING", 2, -4);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_PROVIDER_LOGO_LOADING = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_PROVIDER_LOGO_LOADING", 3, -3);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_DEALS_AND_PROMOS_LOADING = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_DEALS_AND_PROMOS_LOADING", 4, -2);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING", 5, -1);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_LOADING_MORE = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_LOADING_MORE", 6, 0);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_MOST_POPULAR_PRODUCT = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_MOST_POPULAR_PRODUCT", 7, 1);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_DEALS_AND_PROMOS = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_DEALS_AND_PROMOS", 8, 2);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_PROVIDER_LOGO = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_PROVIDER_LOGO", 9, 3);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_FAVORITE = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_FAVORITE", 10, 4);
        public static final VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM VIEW_TYPE_BUY_AGAIN_PURCHASE = new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM("VIEW_TYPE_BUY_AGAIN_PURCHASE", 11, 5);

        private static final /* synthetic */ VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[] $values() {
            return new VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[]{VIEW_TYPE_ERROR_REFRESH, VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING, VIEW_TYPE_FAVORITE_LOADING, VIEW_TYPE_PROVIDER_LOGO_LOADING, VIEW_TYPE_DEALS_AND_PROMOS_LOADING, VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING, VIEW_TYPE_LOADING_MORE, VIEW_TYPE_MOST_POPULAR_PRODUCT, VIEW_TYPE_DEALS_AND_PROMOS, VIEW_TYPE_PROVIDER_LOGO, VIEW_TYPE_FAVORITE, VIEW_TYPE_BUY_AGAIN_PURCHASE};
        }

        static {
            VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[] view_type_shop_home_carousel_itemArr$values = $values();
            $VALUES = view_type_shop_home_carousel_itemArr$values;
            $ENTRIES = v0.h(view_type_shop_home_carousel_itemArr$values);
        }

        private VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM(String str, int i, int i4) {
            this.value = i4;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM valueOf(String str) {
            return (VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM) Enum.valueOf(VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.class, str);
        }

        public static VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[] values() {
            return (VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem();
}
