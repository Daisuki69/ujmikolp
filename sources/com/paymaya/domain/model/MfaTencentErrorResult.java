package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import cj.C1132s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MfaTencentErrorResult implements Parcelable {
    public static final int TENCENT_ERROR_APP_SWITCH = 214;
    public static final int TENCENT_ERROR_CAMERA_PERMISSION = 215;
    public static final int TENCENT_ERROR_CHECK_PERMISSION = 224;
    public static final int TENCENT_ERROR_PERMISSION_CHECK = 218;
    public static final int TENCENT_ERROR_USER_STOPS = 212;
    private final int errorCode;
    private final String errorString;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MfaTencentErrorResult> CREATOR = new Creator();
    public static final int TENCENT_ERROR_INNER_ERROR_CODE = 213;
    public static final int TENCENT_ERROR_LIVE_DATA = 220;
    public static final int TENCENT_ERROR_APP_STOP = 219;
    private static final List<Integer> tencentGenericErrorCodes = C1132s.g(Integer.valueOf(TENCENT_ERROR_INNER_ERROR_CODE), Integer.valueOf(TENCENT_ERROR_LIVE_DATA), Integer.valueOf(TENCENT_ERROR_APP_STOP));
    public static final int TENCENT_ERROR_LOCAL_REF_FAILED = 211;
    public static final int TENCENT_ERROR_INIT_SDK = 216;
    private static final List<Integer> tencentInitErrorCodes = C1132s.g(Integer.valueOf(TENCENT_ERROR_LOCAL_REF_FAILED), Integer.valueOf(TENCENT_ERROR_INIT_SDK));
    public static final int TENCENT_ERROR_NO_FACE_WHILE_CAPTURING = 228;
    public static final int TENCENT_ERROR_FACE_DETECTION_TIMED_OUT = 217;
    public static final int TENCENT_ERROR_LOCAL_TIME_OUT = 222;
    public static final int TENCENT_ERROR_PREPARE_TIME_OUT = 223;
    private static final List<Integer> tencentTimeoutErrorCodes = C1132s.g(Integer.valueOf(TENCENT_ERROR_NO_FACE_WHILE_CAPTURING), Integer.valueOf(TENCENT_ERROR_FACE_DETECTION_TIMED_OUT), Integer.valueOf(TENCENT_ERROR_LOCAL_TIME_OUT), Integer.valueOf(TENCENT_ERROR_PREPARE_TIME_OUT));
    private static final List<Integer> tencentFaceCompareErrorCodes = C1132s.g(2015, 2016);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<MfaTencentErrorResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaTencentErrorResult createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MfaTencentErrorResult(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaTencentErrorResult[] newArray(int i) {
            return new MfaTencentErrorResult[i];
        }
    }

    public MfaTencentErrorResult(int i, String errorString) {
        j.g(errorString, "errorString");
        this.errorCode = i;
        this.errorString = errorString;
    }

    public static /* synthetic */ MfaTencentErrorResult copy$default(MfaTencentErrorResult mfaTencentErrorResult, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mfaTencentErrorResult.errorCode;
        }
        if ((i4 & 2) != 0) {
            str = mfaTencentErrorResult.errorString;
        }
        return mfaTencentErrorResult.copy(i, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorString;
    }

    public final MfaTencentErrorResult copy(int i, String errorString) {
        j.g(errorString, "errorString");
        return new MfaTencentErrorResult(i, errorString);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MfaTencentErrorResult)) {
            return false;
        }
        MfaTencentErrorResult mfaTencentErrorResult = (MfaTencentErrorResult) obj;
        return this.errorCode == mfaTencentErrorResult.errorCode && j.b(this.errorString, mfaTencentErrorResult.errorString);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorString() {
        return this.errorString;
    }

    public final boolean getShouldBypassTencentRealtimeFaceComparison() {
        return tencentFaceCompareErrorCodes.contains(Integer.valueOf(this.errorCode));
    }

    public int hashCode() {
        return this.errorString.hashCode() + (this.errorCode * 31);
    }

    public final boolean isTencentErrorFaceDetectionTimeout() {
        return tencentTimeoutErrorCodes.contains(Integer.valueOf(this.errorCode));
    }

    public final boolean isTencentErrorFromAppSwitch() {
        return this.errorCode == 214;
    }

    public final boolean isTencentErrorGeneric() {
        return tencentGenericErrorCodes.contains(Integer.valueOf(this.errorCode));
    }

    public final boolean isTencentErrorInitFailure() {
        return tencentInitErrorCodes.contains(Integer.valueOf(this.errorCode));
    }

    public final boolean isTencentErrorUserStops() {
        return this.errorCode == 212;
    }

    public String toString() {
        return "MfaTencentErrorResult(errorCode=" + this.errorCode + ", errorString=" + this.errorString + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.errorCode);
        dest.writeString(this.errorString);
    }
}
