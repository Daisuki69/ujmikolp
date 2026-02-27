package D8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: renamed from: D8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0216y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1108a;

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
        try {
            iArr[KycFieldType.RELATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1108a = iArr;
    }
}
