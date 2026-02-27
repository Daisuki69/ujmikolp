package Q6;

import com.paymaya.domain.model.FavoriteStatus;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5279a;

    static {
        int[] iArr = new int[FavoriteStatus.values().length];
        try {
            iArr[FavoriteStatus.FAVORITE_CREATE_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_NO_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_NOT_CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_CREATE_FAILURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_UPDATE_SUCCESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FavoriteStatus.FAVORITE_UPDATE_FAILURE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f5279a = iArr;
    }
}
