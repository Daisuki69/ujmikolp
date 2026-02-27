package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    private static final String TAG = "BiometricManager";

    @Nullable
    private final android.hardware.biometrics.BiometricManager mBiometricManager;

    @Nullable
    private final FingerprintManagerCompat mFingerprintManager;

    @NonNull
    private final Injector mInjector;

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static int canAuthenticate(@NonNull android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @Nullable
        public static android.hardware.biometrics.BiometricManager create(@NonNull Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        @Nullable
        public static Method getCanAuthenticateWithCryptoMethod() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int canAuthenticate(@NonNull android.hardware.biometrics.BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    public static class DefaultInjector implements Injector {

        @NonNull
        private final Context mContext;

        public DefaultInjector(@NonNull Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        @Nullable
        @RequiresApi(29)
        public android.hardware.biometrics.BiometricManager getBiometricManager() {
            return Api29Impl.create(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        @Nullable
        public FingerprintManagerCompat getFingerprintManager() {
            return FingerprintManagerCompat.from(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecurable() {
            return KeyguardUtils.getKeyguardManager(this.mContext) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecuredWithCredential() {
            return KeyguardUtils.isDeviceSecuredWithCredential(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFingerprintHardwarePresent() {
            return PackageUtils.hasSystemFeatureFingerprint(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isStrongBiometricGuaranteed() {
            return DeviceUtils.canAssumeStrongBiometrics(this.mContext, Build.MODEL);
        }
    }

    @VisibleForTesting
    public interface Injector {
        @Nullable
        @RequiresApi(29)
        android.hardware.biometrics.BiometricManager getBiometricManager();

        @Nullable
        FingerprintManagerCompat getFingerprintManager();

        boolean isDeviceSecurable();

        boolean isDeviceSecuredWithCredential();

        boolean isFingerprintHardwarePresent();

        boolean isStrongBiometricGuaranteed();
    }

    @VisibleForTesting
    public BiometricManager(@NonNull Injector injector) {
        this.mInjector = injector;
        int i = Build.VERSION.SDK_INT;
        this.mBiometricManager = i >= 29 ? injector.getBiometricManager() : null;
        this.mFingerprintManager = i <= 29 ? injector.getFingerprintManager() : null;
    }

    private int canAuthenticateCompat(int i) {
        if (!AuthenticatorUtils.isSupportedCombination(i)) {
            return -2;
        }
        if (i == 0 || !this.mInjector.isDeviceSecurable()) {
            return 12;
        }
        if (AuthenticatorUtils.isDeviceCredentialAllowed(i)) {
            return this.mInjector.isDeviceSecuredWithCredential() ? 0 : 11;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 29) {
            return AuthenticatorUtils.isWeakBiometricAllowed(i) ? canAuthenticateWithWeakBiometricOnApi29() : canAuthenticateWithStrongBiometricOnApi29();
        }
        if (i4 != 28) {
            return canAuthenticateWithFingerprint();
        }
        if (this.mInjector.isFingerprintHardwarePresent()) {
            return canAuthenticateWithFingerprintOrUnknownBiometric();
        }
        return 12;
    }

    private int canAuthenticateWithFingerprint() {
        FingerprintManagerCompat fingerprintManagerCompat = this.mFingerprintManager;
        if (fingerprintManagerCompat == null) {
            Log.e(TAG, "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.mFingerprintManager.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    private int canAuthenticateWithFingerprintOrUnknownBiometric() {
        return !this.mInjector.isDeviceSecuredWithCredential() ? canAuthenticateWithFingerprint() : canAuthenticateWithFingerprint() == 0 ? 0 : -1;
    }

    @RequiresApi(29)
    private int canAuthenticateWithStrongBiometricOnApi29() {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt;
        Method canAuthenticateWithCryptoMethod = Api29Impl.getCanAuthenticateWithCryptoMethod();
        if (canAuthenticateWithCryptoMethod != null && (cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(CryptoObjectUtils.createFakeCryptoObject())) != null) {
            try {
                Object objInvoke = canAuthenticateWithCryptoMethod.invoke(this.mBiometricManager, cryptoObjectWrapForBiometricPrompt);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w(TAG, "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e) {
                e = e;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e7) {
                e = e7;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e10) {
                e = e10;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
        return (this.mInjector.isStrongBiometricGuaranteed() || iCanAuthenticateWithWeakBiometricOnApi29 != 0) ? iCanAuthenticateWithWeakBiometricOnApi29 : canAuthenticateWithFingerprintOrUnknownBiometric();
    }

    @RequiresApi(29)
    private int canAuthenticateWithWeakBiometricOnApi29() {
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return Api29Impl.canAuthenticate(biometricManager);
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    @NonNull
    public static BiometricManager from(@NonNull Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    public int canAuthenticate(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            return canAuthenticateCompat(i);
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return Api30Impl.canAuthenticate(biometricManager, i);
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
