package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMfaVerifyRequestOtp implements Parcelable {
    public static final Parcelable.Creator<OpenMfaVerifyRequestOtp> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("params")
    private final OpenMfaVerifyRequestOtpParams params;

    public static final class Creator implements Parcelable.Creator<OpenMfaVerifyRequestOtp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaVerifyRequestOtp createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMfaVerifyRequestOtp(parcel.readString(), OpenMfaVerifyRequestOtpParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaVerifyRequestOtp[] newArray(int i) {
            return new OpenMfaVerifyRequestOtp[i];
        }
    }

    public OpenMfaVerifyRequestOtp(String method, OpenMfaVerifyRequestOtpParams params) {
        j.g(method, "method");
        j.g(params, "params");
        this.method = method;
        this.params = params;
    }

    public static /* synthetic */ OpenMfaVerifyRequestOtp copy$default(OpenMfaVerifyRequestOtp openMfaVerifyRequestOtp, String str, OpenMfaVerifyRequestOtpParams openMfaVerifyRequestOtpParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMfaVerifyRequestOtp.method;
        }
        if ((i & 2) != 0) {
            openMfaVerifyRequestOtpParams = openMfaVerifyRequestOtp.params;
        }
        return openMfaVerifyRequestOtp.copy(str, openMfaVerifyRequestOtpParams);
    }

    public final String component1() {
        return this.method;
    }

    public final OpenMfaVerifyRequestOtpParams component2() {
        return this.params;
    }

    public final OpenMfaVerifyRequestOtp copy(String method, OpenMfaVerifyRequestOtpParams params) {
        j.g(method, "method");
        j.g(params, "params");
        return new OpenMfaVerifyRequestOtp(method, params);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMfaVerifyRequestOtp)) {
            return false;
        }
        OpenMfaVerifyRequestOtp openMfaVerifyRequestOtp = (OpenMfaVerifyRequestOtp) obj;
        return j.b(this.method, openMfaVerifyRequestOtp.method) && j.b(this.params, openMfaVerifyRequestOtp.params);
    }

    public final String getMethod() {
        return this.method;
    }

    public final OpenMfaVerifyRequestOtpParams getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.method.hashCode() * 31);
    }

    public String toString() {
        return "OpenMfaVerifyRequestOtp(method=" + this.method + ", params=" + this.params + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.method);
        this.params.writeToParcel(dest, i);
    }
}
