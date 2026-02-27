package mx_android.support.v4.text;

import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class ICUCompat {
    private static final ICUCompatImpl IMPL;

    interface ICUCompatImpl {
        String addLikelySubtags(String str);

        String getScript(String str);
    }

    static class ICUCompatImplBase implements ICUCompatImpl {
        @Override // mx_android.support.v4.text.ICUCompat.ICUCompatImpl
        public String addLikelySubtags(String str) {
            return str;
        }

        @Override // mx_android.support.v4.text.ICUCompat.ICUCompatImpl
        public String getScript(String str) {
            return null;
        }

        ICUCompatImplBase() {
        }
    }

    static class ICUCompatImplIcs implements ICUCompatImpl {
        ICUCompatImplIcs() {
        }

        @Override // mx_android.support.v4.text.ICUCompat.ICUCompatImpl
        public String getScript(String str) {
            return ICUCompatIcs.getScript(str);
        }

        @Override // mx_android.support.v4.text.ICUCompat.ICUCompatImpl
        public String addLikelySubtags(String str) {
            return ICUCompatIcs.addLikelySubtags(str);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new ICUCompatImplIcs();
        } else {
            IMPL = new ICUCompatImplBase();
        }
    }

    public static String getScript(String str) {
        return IMPL.getScript(str);
    }

    public static String addLikelySubtags(String str) {
        return IMPL.addLikelySubtags(str);
    }
}
