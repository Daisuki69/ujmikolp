package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return TypedValues.Custom.TYPE_DIMENSION;
            case "string":
                return TypedValues.Custom.TYPE_STRING;
            case "refrence":
                return TypedValues.Custom.TYPE_REFERENCE;
            case "boolean":
                return TypedValues.Custom.TYPE_BOOLEAN;
            case "color":
                return TypedValues.Custom.TYPE_COLOR;
            case "float":
                return TypedValues.Custom.TYPE_FLOAT;
            case "integer":
                return 900;
            default:
                return -1;
        }
    }
}
