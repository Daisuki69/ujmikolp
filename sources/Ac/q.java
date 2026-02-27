package ac;

import com.paymaya.domain.model.ShopV3ListItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7112a;

    static {
        int[] iArr = new int[ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.values().length];
        try {
            iArr[ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PRODUCT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_LOADING_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f7112a = iArr;
    }
}
