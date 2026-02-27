package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopV3ListItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VIEW_TYPE_SHOP_PRODUCT_ITEM {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ VIEW_TYPE_SHOP_PRODUCT_ITEM[] $VALUES;
        private final int value;
        public static final VIEW_TYPE_SHOP_PRODUCT_ITEM VIEW_TYPE_PROVIDER_PRODUCT_LOADING = new VIEW_TYPE_SHOP_PRODUCT_ITEM("VIEW_TYPE_PROVIDER_PRODUCT_LOADING", 0, -1);
        public static final VIEW_TYPE_SHOP_PRODUCT_ITEM VIEW_TYPE_PRODUCT = new VIEW_TYPE_SHOP_PRODUCT_ITEM("VIEW_TYPE_PRODUCT", 1, 0);
        public static final VIEW_TYPE_SHOP_PRODUCT_ITEM VIEW_TYPE_LOADING_MORE = new VIEW_TYPE_SHOP_PRODUCT_ITEM("VIEW_TYPE_LOADING_MORE", 2, 1);

        private static final /* synthetic */ VIEW_TYPE_SHOP_PRODUCT_ITEM[] $values() {
            return new VIEW_TYPE_SHOP_PRODUCT_ITEM[]{VIEW_TYPE_PROVIDER_PRODUCT_LOADING, VIEW_TYPE_PRODUCT, VIEW_TYPE_LOADING_MORE};
        }

        static {
            VIEW_TYPE_SHOP_PRODUCT_ITEM[] view_type_shop_product_itemArr$values = $values();
            $VALUES = view_type_shop_product_itemArr$values;
            $ENTRIES = v0.h(view_type_shop_product_itemArr$values);
        }

        private VIEW_TYPE_SHOP_PRODUCT_ITEM(String str, int i, int i4) {
            this.value = i4;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static VIEW_TYPE_SHOP_PRODUCT_ITEM valueOf(String str) {
            return (VIEW_TYPE_SHOP_PRODUCT_ITEM) Enum.valueOf(VIEW_TYPE_SHOP_PRODUCT_ITEM.class, str);
        }

        public static VIEW_TYPE_SHOP_PRODUCT_ITEM[] values() {
            return (VIEW_TYPE_SHOP_PRODUCT_ITEM[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    VIEW_TYPE_SHOP_PRODUCT_ITEM getViewTypeShopProductItem();
}
