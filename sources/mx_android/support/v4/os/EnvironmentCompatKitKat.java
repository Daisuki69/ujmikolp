package mx_android.support.v4.os;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class EnvironmentCompatKitKat {
    EnvironmentCompatKitKat() {
    }

    public static String getStorageState(File file) {
        return Environment.getStorageState(file);
    }
}
