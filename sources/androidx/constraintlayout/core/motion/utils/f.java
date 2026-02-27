package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                return TypedValues.PositionType.TYPE_TRANSITION_EASING;
            case "percentWidth":
                return TypedValues.PositionType.TYPE_PERCENT_WIDTH;
            case "percentHeight":
                return TypedValues.PositionType.TYPE_PERCENT_HEIGHT;
            case "drawPath":
                return TypedValues.PositionType.TYPE_DRAWPATH;
            case "sizePercent":
                return TypedValues.PositionType.TYPE_SIZE_PERCENT;
            case "percentX":
                return TypedValues.PositionType.TYPE_PERCENT_X;
            case "percentY":
                return TypedValues.PositionType.TYPE_PERCENT_Y;
            default:
                return -1;
        }
    }

    public static int b(int i) {
        if (i == 100) {
            return 2;
        }
        if (i == 101) {
            return 8;
        }
        switch (i) {
            case TypedValues.PositionType.TYPE_TRANSITION_EASING /* 501 */:
            case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                return 8;
            case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
            case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                return 4;
            case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                return 2;
            default:
                return -1;
        }
    }
}
