package M8;

import com.paymaya.domain.model.PersonalInfoConfirmAction;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3145a;

    static {
        int[] iArr = new int[PersonalInfoConfirmAction.Section.values().length];
        try {
            iArr[PersonalInfoConfirmAction.Section.FULL_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PersonalInfoConfirmAction.Section.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PersonalInfoConfirmAction.Section.CURRENT_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PersonalInfoConfirmAction.Section.PERMANENT_ADDRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PersonalInfoConfirmAction.Section.PERMANENT_TOGGLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f3145a = iArr;
    }
}
