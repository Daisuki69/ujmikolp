package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
class CancellationSignalProvider {
    private static final String TAG = "CancelSignalProvider";

    @Nullable
    private CancellationSignal mBiometricCancellationSignal;

    @Nullable
    private androidx.core.os.CancellationSignal mFingerprintCancellationSignal;
    private final Injector mInjector;

    @RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
        }

        public static void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal create() {
            return new CancellationSignal();
        }
    }

    @VisibleForTesting
    public interface Injector {
        @NonNull
        @RequiresApi(16)
        CancellationSignal getBiometricCancellationSignal();

        @NonNull
        androidx.core.os.CancellationSignal getFingerprintCancellationSignal();
    }

    public CancellationSignalProvider() {
        this.mInjector = new Injector() { // from class: androidx.biometric.CancellationSignalProvider.1
            @Override // androidx.biometric.CancellationSignalProvider.Injector
            @NonNull
            @RequiresApi(16)
            public CancellationSignal getBiometricCancellationSignal() {
                return Api16Impl.create();
            }

            @Override // androidx.biometric.CancellationSignalProvider.Injector
            @NonNull
            public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
                return new androidx.core.os.CancellationSignal();
            }
        };
    }

    public void cancel() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            try {
                Api16Impl.cancel(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e(TAG, "Got NPE while canceling biometric authentication.", e);
            }
            this.mBiometricCancellationSignal = null;
        }
        androidx.core.os.CancellationSignal cancellationSignal2 = this.mFingerprintCancellationSignal;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.cancel();
            } catch (NullPointerException e7) {
                Log.e(TAG, "Got NPE while canceling fingerprint authentication.", e7);
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    @NonNull
    @RequiresApi(16)
    public CancellationSignal getBiometricCancellationSignal() {
        if (this.mBiometricCancellationSignal == null) {
            this.mBiometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        }
        return this.mBiometricCancellationSignal;
    }

    @NonNull
    public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
        if (this.mFingerprintCancellationSignal == null) {
            this.mFingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        }
        return this.mFingerprintCancellationSignal;
    }

    @VisibleForTesting
    public CancellationSignalProvider(Injector injector) {
        this.mInjector = injector;
    }
}
