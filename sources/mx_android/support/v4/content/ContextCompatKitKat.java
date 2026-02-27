package mx_android.support.v4.content;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class ContextCompatKitKat {
    ContextCompatKitKat() {
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }
}
