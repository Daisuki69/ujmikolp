package D8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1029a;

    static {
        int[] iArr = new int[X.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            X x6 = X.f1026a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            X x8 = X.f1026a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[KycFieldType.values().length];
        try {
            iArr2[KycFieldType.WORK_NATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[KycFieldType.JOB_TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[KycFieldType.INCOME_SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[KycFieldType.COMPANY_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f1029a = iArr2;
    }
}
