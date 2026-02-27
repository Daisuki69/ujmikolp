package rc;

import com.paymaya.domain.model.UpdateProfileFieldType;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19926b;

    static {
        int[] iArr = new int[AbstractC2217b.d(109).length];
        try {
            iArr[87] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f19925a = iArr;
        int[] iArr2 = new int[UpdateProfileFieldType.values().length];
        try {
            iArr2[UpdateProfileFieldType.NATURE_OF_WORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[UpdateProfileFieldType.JOB_TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UpdateProfileFieldType.SOURCE_OF_INCOME.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UpdateProfileFieldType.NAME_OF_COMPANY.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f19926b = iArr2;
    }
}
