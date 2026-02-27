package rc;

import com.paymaya.domain.model.UpdateProfileFieldType;
import s.AbstractC2217b;

/* JADX INFO: renamed from: rc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC2197d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19891b;

    static {
        int[] iArr = new int[AbstractC2217b.d(109).length];
        try {
            iArr[88] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f19890a = iArr;
        int[] iArr2 = new int[UpdateProfileFieldType.values().length];
        try {
            iArr2[UpdateProfileFieldType.MOBILE_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[UpdateProfileFieldType.MIDDLE_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[UpdateProfileFieldType.LAST_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UpdateProfileFieldType.FIRST_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UpdateProfileFieldType.RELATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f19891b = iArr2;
    }
}
