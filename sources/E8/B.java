package E8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1265a;

    static {
        int[] iArr = new int[KycFieldType.values().length];
        try {
            iArr[KycFieldType.FIRST_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycFieldType.MIDDLE_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KycFieldType.LAST_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f1265a = iArr;
    }
}
