package androidx.media3.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i, int i4) {
        for (int i6 = 1; i6 <= 2; i6++) {
            int i10 = (i + i6) % 3;
            if (isRepeatModeEnabled(i10, i4)) {
                return i10;
            }
        }
        return i;
    }

    public static boolean isRepeatModeEnabled(int i, int i4) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i4 & 2) != 0 : (i4 & 1) != 0;
        }
        return true;
    }
}
