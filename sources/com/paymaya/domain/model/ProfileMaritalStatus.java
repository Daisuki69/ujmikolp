package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileMaritalStatus implements Parcelable {
    public static final Parcelable.Creator<ProfileMaritalStatus> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("classification")
    private String classification;

    public static final class Creator implements Parcelable.Creator<ProfileMaritalStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileMaritalStatus createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileMaritalStatus(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileMaritalStatus[] newArray(int i) {
            return new ProfileMaritalStatus[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileMaritalStatus() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProfileMaritalStatus copy$default(ProfileMaritalStatus profileMaritalStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileMaritalStatus.classification;
        }
        return profileMaritalStatus.copy(str);
    }

    public final String component1() {
        return this.classification;
    }

    public final ProfileMaritalStatus copy(String str) {
        return new ProfileMaritalStatus(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileMaritalStatus) && j.b(this.classification, ((ProfileMaritalStatus) obj).classification);
    }

    public final String getClassification() {
        return this.classification;
    }

    public int hashCode() {
        String str = this.classification;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setClassification(String str) {
        this.classification = str;
    }

    public String toString() {
        return s.j("ProfileMaritalStatus(classification=", this.classification, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.classification);
    }

    public ProfileMaritalStatus(String str) {
        this.classification = str;
    }

    public /* synthetic */ ProfileMaritalStatus(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
