package ac;

import com.paymaya.domain.model.ShopProviderListItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7118a;

    static {
        int[] iArr = new int[ShopProviderListItem.VIEW_TYPE.values().length];
        try {
            iArr[ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f7118a = iArr;
    }
}
