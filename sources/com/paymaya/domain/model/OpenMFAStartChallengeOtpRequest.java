package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMFAStartChallengeOtpRequest implements Parcelable {
    public static final Parcelable.Creator<OpenMFAStartChallengeOtpRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("params")
    private final OpenMFAStartChallengeOtpRequestParams params;

    public static final class Creator implements Parcelable.Creator<OpenMFAStartChallengeOtpRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMFAStartChallengeOtpRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMFAStartChallengeOtpRequest(parcel.readString(), parcel.readInt() == 0 ? null : OpenMFAStartChallengeOtpRequestParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMFAStartChallengeOtpRequest[] newArray(int i) {
            return new OpenMFAStartChallengeOtpRequest[i];
        }
    }

    public OpenMFAStartChallengeOtpRequest(String method, OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams) {
        j.g(method, "method");
        this.method = method;
        this.params = openMFAStartChallengeOtpRequestParams;
    }

    public static /* synthetic */ OpenMFAStartChallengeOtpRequest copy$default(OpenMFAStartChallengeOtpRequest openMFAStartChallengeOtpRequest, String str, OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMFAStartChallengeOtpRequest.method;
        }
        if ((i & 2) != 0) {
            openMFAStartChallengeOtpRequestParams = openMFAStartChallengeOtpRequest.params;
        }
        return openMFAStartChallengeOtpRequest.copy(str, openMFAStartChallengeOtpRequestParams);
    }

    public final String component1() {
        return this.method;
    }

    public final OpenMFAStartChallengeOtpRequestParams component2() {
        return this.params;
    }

    public final OpenMFAStartChallengeOtpRequest copy(String method, OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams) {
        j.g(method, "method");
        return new OpenMFAStartChallengeOtpRequest(method, openMFAStartChallengeOtpRequestParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMFAStartChallengeOtpRequest)) {
            return false;
        }
        OpenMFAStartChallengeOtpRequest openMFAStartChallengeOtpRequest = (OpenMFAStartChallengeOtpRequest) obj;
        return j.b(this.method, openMFAStartChallengeOtpRequest.method) && j.b(this.params, openMFAStartChallengeOtpRequest.params);
    }

    public final String getMethod() {
        return this.method;
    }

    public final OpenMFAStartChallengeOtpRequestParams getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams = this.params;
        return iHashCode + (openMFAStartChallengeOtpRequestParams == null ? 0 : openMFAStartChallengeOtpRequestParams.hashCode());
    }

    public String toString() {
        return "OpenMFAStartChallengeOtpRequest(method=" + this.method + ", params=" + this.params + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.method);
        OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams = this.params;
        if (openMFAStartChallengeOtpRequestParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            openMFAStartChallengeOtpRequestParams.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ OpenMFAStartChallengeOtpRequest(String str, OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : openMFAStartChallengeOtpRequestParams);
    }
}
