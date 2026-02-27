package androidx.biometric;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class BiometricErrorData {
    private final int mErrorCode;

    @Nullable
    private final CharSequence mErrorMessage;

    public BiometricErrorData(int i, @Nullable CharSequence charSequence) {
        this.mErrorCode = i;
        this.mErrorMessage = charSequence;
    }

    @Nullable
    private static String convertToString(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean isErrorMessageEqualTo(@Nullable CharSequence charSequence) {
        String strConvertToString = convertToString(this.mErrorMessage);
        String strConvertToString2 = convertToString(charSequence);
        if (strConvertToString == null && strConvertToString2 == null) {
            return true;
        }
        return strConvertToString != null && strConvertToString.equals(strConvertToString2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof BiometricErrorData) {
            BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
            if (this.mErrorCode == biometricErrorData.mErrorCode && isErrorMessageEqualTo(biometricErrorData.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Nullable
    public CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mErrorCode), convertToString(this.mErrorMessage)});
    }
}
