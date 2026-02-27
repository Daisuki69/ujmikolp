package ue;

import com.paymaya.domain.model.ShopSearchListItem;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20319a;

    static {
        int[] iArr = new int[ShopSearchListItem.VIEW_TYPE.values().length];
        try {
            iArr[ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20319a = iArr;
    }
}
