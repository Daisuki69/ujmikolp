package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
class PackageUtils {

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static boolean hasSystemFeatureFingerprint(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    private PackageUtils() {
    }

    public static boolean hasSystemFeatureFingerprint(@Nullable Context context) {
        return (context == null || context.getPackageManager() == null || !Api23Impl.hasSystemFeatureFingerprint(context.getPackageManager())) ? false : true;
    }
}
