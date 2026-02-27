package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMfaChallengeIdentity implements Parcelable {
    public static final Parcelable.Creator<OpenMfaChallengeIdentity> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<OpenMfaChallengeIdentity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaChallengeIdentity createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMfaChallengeIdentity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaChallengeIdentity[] newArray(int i) {
            return new OpenMfaChallengeIdentity[i];
        }
    }

    public OpenMfaChallengeIdentity(String type, String value) {
        j.g(type, "type");
        j.g(value, "value");
        this.type = type;
        this.value = value;
    }

    public static /* synthetic */ OpenMfaChallengeIdentity copy$default(OpenMfaChallengeIdentity openMfaChallengeIdentity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMfaChallengeIdentity.type;
        }
        if ((i & 2) != 0) {
            str2 = openMfaChallengeIdentity.value;
        }
        return openMfaChallengeIdentity.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final OpenMfaChallengeIdentity copy(String type, String value) {
        j.g(type, "type");
        j.g(value, "value");
        return new OpenMfaChallengeIdentity(type, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMfaChallengeIdentity)) {
            return false;
        }
        OpenMfaChallengeIdentity openMfaChallengeIdentity = (OpenMfaChallengeIdentity) obj;
        return j.b(this.type, openMfaChallengeIdentity.type) && j.b(this.value, openMfaChallengeIdentity.value);
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return s.l("OpenMfaChallengeIdentity(type=", this.type, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.value);
    }
}
