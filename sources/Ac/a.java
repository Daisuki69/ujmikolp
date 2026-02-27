package Ac;

import com.paymaya.domain.model.VoucherListItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f251a;

    static {
        int[] iArr = new int[VoucherListItem.VIEW_TYPE.values().length];
        try {
            iArr[VoucherListItem.VIEW_TYPE.VIEW_TYPE_AVAILABLE_VOUCHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoucherListItem.VIEW_TYPE.VIEW_TYPE_CLAIMED_VOUCHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoucherListItem.VIEW_TYPE.VIEW_TYPE_EXPIRED_VOUCHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f251a = iArr;
    }
}
