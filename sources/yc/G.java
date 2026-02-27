package yc;

import com.paymaya.domain.model.UpdateProfileFieldType;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21102a;

    static {
        int[] iArr = new int[UpdateProfileFieldType.values().length];
        try {
            iArr[UpdateProfileFieldType.NATURE_OF_WORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpdateProfileFieldType.JOB_TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpdateProfileFieldType.SOURCE_OF_INCOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21102a = iArr;
    }
}
