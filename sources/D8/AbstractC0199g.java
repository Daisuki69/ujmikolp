package D8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: renamed from: D8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0199g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1047a;

    static {
        int[] iArr = new int[KycFieldType.values().length];
        try {
            iArr[KycFieldType.AMLC_CERT_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycFieldType.AMLC_CERT_EXPIRY_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1047a = iArr;
    }
}
