package mx_android.support.v4.content;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class ContextCompatFroyo {
    ContextCompatFroyo() {
    }

    public static File getExternalCacheDir(Context context) {
        return context.getExternalCacheDir();
    }

    public static File getExternalFilesDir(Context context, String str) {
        return context.getExternalFilesDir(str);
    }
}
