package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayMayaWebViewParameters implements Parcelable {
    public static final String PARAMETER_ACCESS_TOKEN = "accessToken";
    public static final String PARAMETER_EXTERNAL_PROFILE_ID = "externalProfileId";
    public static final String PARAMETER_TIMESTAMP = "timestamp";
    public static final String PARAMETER_USER_TOKEN = "userToken";

    @InterfaceC1497a
    @InterfaceC1498b(PARAMETER_ACCESS_TOKEN)
    private final String accessToken;

    @InterfaceC1497a
    @InterfaceC1498b(PARAMETER_EXTERNAL_PROFILE_ID)
    private final String externalProfileId;

    @InterfaceC1497a
    @InterfaceC1498b("timestamp")
    private final long timestamp;

    @InterfaceC1497a
    @InterfaceC1498b(PARAMETER_USER_TOKEN)
    private final String userToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlayMayaWebViewParameters> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<PlayMayaWebViewParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayMayaWebViewParameters createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PlayMayaWebViewParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayMayaWebViewParameters[] newArray(int i) {
            return new PlayMayaWebViewParameters[i];
        }
    }

    public PlayMayaWebViewParameters(String externalProfileId, String userToken, String accessToken, long j) {
        j.g(externalProfileId, "externalProfileId");
        j.g(userToken, "userToken");
        j.g(accessToken, "accessToken");
        this.externalProfileId = externalProfileId;
        this.userToken = userToken;
        this.accessToken = accessToken;
        this.timestamp = j;
    }

    public static /* synthetic */ PlayMayaWebViewParameters copy$default(PlayMayaWebViewParameters playMayaWebViewParameters, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playMayaWebViewParameters.externalProfileId;
        }
        if ((i & 2) != 0) {
            str2 = playMayaWebViewParameters.userToken;
        }
        if ((i & 4) != 0) {
            str3 = playMayaWebViewParameters.accessToken;
        }
        if ((i & 8) != 0) {
            j = playMayaWebViewParameters.timestamp;
        }
        String str4 = str3;
        return playMayaWebViewParameters.copy(str, str2, str4, j);
    }

    public final String component1() {
        return this.externalProfileId;
    }

    public final String component2() {
        return this.userToken;
    }

    public final String component3() {
        return this.accessToken;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final PlayMayaWebViewParameters copy(String externalProfileId, String userToken, String accessToken, long j) {
        j.g(externalProfileId, "externalProfileId");
        j.g(userToken, "userToken");
        j.g(accessToken, "accessToken");
        return new PlayMayaWebViewParameters(externalProfileId, userToken, accessToken, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayMayaWebViewParameters)) {
            return false;
        }
        PlayMayaWebViewParameters playMayaWebViewParameters = (PlayMayaWebViewParameters) obj;
        return j.b(this.externalProfileId, playMayaWebViewParameters.externalProfileId) && j.b(this.userToken, playMayaWebViewParameters.userToken) && j.b(this.accessToken, playMayaWebViewParameters.accessToken) && this.timestamp == playMayaWebViewParameters.timestamp;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getExternalProfileId() {
        return this.externalProfileId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(this.externalProfileId.hashCode() * 31, 31, this.userToken), 31, this.accessToken);
        long j = this.timestamp;
        return iC + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        String str = this.externalProfileId;
        String str2 = this.userToken;
        String str3 = this.accessToken;
        long j = this.timestamp;
        StringBuilder sbX = s.x("PlayMayaWebViewParameters(externalProfileId=", str, ", userToken=", str2, ", accessToken=");
        sbX.append(str3);
        sbX.append(", timestamp=");
        sbX.append(j);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.externalProfileId);
        dest.writeString(this.userToken);
        dest.writeString(this.accessToken);
        dest.writeLong(this.timestamp);
    }
}
