package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMfaChallengeRequest implements Parcelable {
    public static final Parcelable.Creator<OpenMfaChallengeRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("identity")
    private final OpenMfaChallengeIdentity identity;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("resultToken")
    private final String resultToken;

    public static final class Creator implements Parcelable.Creator<OpenMfaChallengeRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaChallengeRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMfaChallengeRequest(parcel.readString(), OpenMfaChallengeIdentity.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaChallengeRequest[] newArray(int i) {
            return new OpenMfaChallengeRequest[i];
        }
    }

    public OpenMfaChallengeRequest(String method, OpenMfaChallengeIdentity identity, String str) {
        j.g(method, "method");
        j.g(identity, "identity");
        this.method = method;
        this.identity = identity;
        this.resultToken = str;
    }

    public static /* synthetic */ OpenMfaChallengeRequest copy$default(OpenMfaChallengeRequest openMfaChallengeRequest, String str, OpenMfaChallengeIdentity openMfaChallengeIdentity, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMfaChallengeRequest.method;
        }
        if ((i & 2) != 0) {
            openMfaChallengeIdentity = openMfaChallengeRequest.identity;
        }
        if ((i & 4) != 0) {
            str2 = openMfaChallengeRequest.resultToken;
        }
        return openMfaChallengeRequest.copy(str, openMfaChallengeIdentity, str2);
    }

    public final String component1() {
        return this.method;
    }

    public final OpenMfaChallengeIdentity component2() {
        return this.identity;
    }

    public final String component3() {
        return this.resultToken;
    }

    public final OpenMfaChallengeRequest copy(String method, OpenMfaChallengeIdentity identity, String str) {
        j.g(method, "method");
        j.g(identity, "identity");
        return new OpenMfaChallengeRequest(method, identity, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMfaChallengeRequest)) {
            return false;
        }
        OpenMfaChallengeRequest openMfaChallengeRequest = (OpenMfaChallengeRequest) obj;
        return j.b(this.method, openMfaChallengeRequest.method) && j.b(this.identity, openMfaChallengeRequest.identity) && j.b(this.resultToken, openMfaChallengeRequest.resultToken);
    }

    public final OpenMfaChallengeIdentity getIdentity() {
        return this.identity;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getResultToken() {
        return this.resultToken;
    }

    public int hashCode() {
        int iHashCode = (this.identity.hashCode() + (this.method.hashCode() * 31)) * 31;
        String str = this.resultToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.method;
        OpenMfaChallengeIdentity openMfaChallengeIdentity = this.identity;
        String str2 = this.resultToken;
        StringBuilder sb2 = new StringBuilder("OpenMfaChallengeRequest(method=");
        sb2.append(str);
        sb2.append(", identity=");
        sb2.append(openMfaChallengeIdentity);
        sb2.append(", resultToken=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.method);
        this.identity.writeToParcel(dest, i);
        dest.writeString(this.resultToken);
    }

    public /* synthetic */ OpenMfaChallengeRequest(String str, OpenMfaChallengeIdentity openMfaChallengeIdentity, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, openMfaChallengeIdentity, (i & 4) != 0 ? null : str2);
    }
}
