package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMfaVerifyRequestOtpParams implements Parcelable {
    public static final Parcelable.Creator<OpenMfaVerifyRequestOtpParams> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("otp")
    private final String otp;

    public static final class Creator implements Parcelable.Creator<OpenMfaVerifyRequestOtpParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaVerifyRequestOtpParams createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMfaVerifyRequestOtpParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaVerifyRequestOtpParams[] newArray(int i) {
            return new OpenMfaVerifyRequestOtpParams[i];
        }
    }

    public OpenMfaVerifyRequestOtpParams(String otp) {
        j.g(otp, "otp");
        this.otp = otp;
    }

    public static /* synthetic */ OpenMfaVerifyRequestOtpParams copy$default(OpenMfaVerifyRequestOtpParams openMfaVerifyRequestOtpParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMfaVerifyRequestOtpParams.otp;
        }
        return openMfaVerifyRequestOtpParams.copy(str);
    }

    public final String component1() {
        return this.otp;
    }

    public final OpenMfaVerifyRequestOtpParams copy(String otp) {
        j.g(otp, "otp");
        return new OpenMfaVerifyRequestOtpParams(otp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenMfaVerifyRequestOtpParams) && j.b(this.otp, ((OpenMfaVerifyRequestOtpParams) obj).otp);
    }

    public final String getOtp() {
        return this.otp;
    }

    public int hashCode() {
        return this.otp.hashCode();
    }

    public String toString() {
        return s.j("OpenMfaVerifyRequestOtpParams(otp=", this.otp, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.otp);
    }
}
