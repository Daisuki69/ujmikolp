package ac;

import com.paymaya.domain.model.ShopSearchListItem;

/* JADX INFO: renamed from: ac.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0676E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7084a;

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
        f7084a = iArr;
    }
}
