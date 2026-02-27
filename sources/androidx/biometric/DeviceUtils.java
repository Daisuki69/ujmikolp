package androidx.biometric;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class DeviceUtils {
    private DeviceUtils() {
    }

    public static boolean canAssumeStrongBiometrics(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return isModelInList(context, str, R.array.assume_strong_biometrics_models);
    }

    private static boolean isModelInList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isModelInPrefixList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVendorInList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean shouldDelayShowingPrompt(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return isModelInList(context, str, R.array.delay_showing_prompt_models);
    }

    public static boolean shouldHideFingerprintDialog(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isModelInPrefixList(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    public static boolean shouldUseFingerprintForCrypto(@NonNull Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isVendorInList(context, str, R.array.crypto_fingerprint_fallback_vendors) || isModelInPrefixList(context, str2, R.array.crypto_fingerprint_fallback_prefixes);
    }
}
