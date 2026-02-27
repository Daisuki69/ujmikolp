package ue;

import com.paymaya.domain.model.ShopProviderListItem;

/* JADX INFO: renamed from: ue.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC2312b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20289a;

    static {
        int[] iArr = new int[ShopProviderListItem.VIEW_TYPE.values().length];
        try {
            iArr[ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f20289a = iArr;
    }
}
