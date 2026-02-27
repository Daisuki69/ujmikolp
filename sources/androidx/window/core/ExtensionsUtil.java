package androidx.window.core;

import android.util.Log;
import androidx.annotation.IntRange;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionsUtil {
    public static final ExtensionsUtil INSTANCE = new ExtensionsUtil();
    private static final String TAG = z.a(ExtensionsUtil.class).c();

    private ExtensionsUtil() {
    }

    @IntRange(from = 0)
    public final int getSafeVendorApiLevel() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(TAG, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(TAG, "Stub Extension");
            return 0;
        }
    }
}
