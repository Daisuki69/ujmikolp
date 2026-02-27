package ac;

import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7125a;

    static {
        int[] iArr = new int[ShopV3ProvidersCollectionItem.ViewType.values().length];
        try {
            iArr[ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_PROVIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f7125a = iArr;
    }
}
