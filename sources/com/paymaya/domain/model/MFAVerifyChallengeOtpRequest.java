package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MFAVerifyChallengeOtpRequest implements Parcelable {
    public static final Parcelable.Creator<MFAVerifyChallengeOtpRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("params")
    private final MFAVerifyChallengeOTPParams params;

    public static final class Creator implements Parcelable.Creator<MFAVerifyChallengeOtpRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAVerifyChallengeOtpRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MFAVerifyChallengeOtpRequest(parcel.readString(), MFAVerifyChallengeOTPParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAVerifyChallengeOtpRequest[] newArray(int i) {
            return new MFAVerifyChallengeOtpRequest[i];
        }
    }

    public MFAVerifyChallengeOtpRequest(String method, MFAVerifyChallengeOTPParams params) {
        j.g(method, "method");
        j.g(params, "params");
        this.method = method;
        this.params = params;
    }

    public static /* synthetic */ MFAVerifyChallengeOtpRequest copy$default(MFAVerifyChallengeOtpRequest mFAVerifyChallengeOtpRequest, String str, MFAVerifyChallengeOTPParams mFAVerifyChallengeOTPParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mFAVerifyChallengeOtpRequest.method;
        }
        if ((i & 2) != 0) {
            mFAVerifyChallengeOTPParams = mFAVerifyChallengeOtpRequest.params;
        }
        return mFAVerifyChallengeOtpRequest.copy(str, mFAVerifyChallengeOTPParams);
    }

    public final String component1() {
        return this.method;
    }

    public final MFAVerifyChallengeOTPParams component2() {
        return this.params;
    }

    public final MFAVerifyChallengeOtpRequest copy(String method, MFAVerifyChallengeOTPParams params) {
        j.g(method, "method");
        j.g(params, "params");
        return new MFAVerifyChallengeOtpRequest(method, params);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFAVerifyChallengeOtpRequest)) {
            return false;
        }
        MFAVerifyChallengeOtpRequest mFAVerifyChallengeOtpRequest = (MFAVerifyChallengeOtpRequest) obj;
        return j.b(this.method, mFAVerifyChallengeOtpRequest.method) && j.b(this.params, mFAVerifyChallengeOtpRequest.params);
    }

    public final String getMethod() {
        return this.method;
    }

    public final MFAVerifyChallengeOTPParams getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.method.hashCode() * 31);
    }

    public String toString() {
        return "MFAVerifyChallengeOtpRequest(method=" + this.method + ", params=" + this.params + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.method);
        this.params.writeToParcel(dest, i);
    }
}
