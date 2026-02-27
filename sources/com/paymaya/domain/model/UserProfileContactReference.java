package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UserProfileContactReference implements Parcelable {
    public static final Parcelable.Creator<UserProfileContactReference> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("mobileNumber")
    private final String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final Name name;

    @InterfaceC1497a
    @InterfaceC1498b("relationship")
    private final String relationship;

    public static final class Creator implements Parcelable.Creator<UserProfileContactReference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileContactReference createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UserProfileContactReference(parcel.readString(), parcel.readInt() == 0 ? null : Name.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileContactReference[] newArray(int i) {
            return new UserProfileContactReference[i];
        }
    }

    public UserProfileContactReference() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserProfileContactReference copy$default(UserProfileContactReference userProfileContactReference, String str, Name name, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfileContactReference.mobileNumber;
        }
        if ((i & 2) != 0) {
            name = userProfileContactReference.name;
        }
        if ((i & 4) != 0) {
            str2 = userProfileContactReference.relationship;
        }
        return userProfileContactReference.copy(str, name, str2);
    }

    public final String component1() {
        return this.mobileNumber;
    }

    public final Name component2() {
        return this.name;
    }

    public final String component3() {
        return this.relationship;
    }

    public final UserProfileContactReference copy(String str, Name name, String str2) {
        return new UserProfileContactReference(str, name, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileContactReference)) {
            return false;
        }
        UserProfileContactReference userProfileContactReference = (UserProfileContactReference) obj;
        return j.b(this.mobileNumber, userProfileContactReference.mobileNumber) && j.b(this.name, userProfileContactReference.name) && j.b(this.relationship, userProfileContactReference.relationship);
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final Name getName() {
        return this.name;
    }

    public final String getRelationship() {
        return this.relationship;
    }

    public int hashCode() {
        String str = this.mobileNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Name name = this.name;
        int iHashCode2 = (iHashCode + (name == null ? 0 : name.hashCode())) * 31;
        String str2 = this.relationship;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.mobileNumber;
        Name name = this.name;
        String str2 = this.relationship;
        StringBuilder sb2 = new StringBuilder("UserProfileContactReference(mobileNumber=");
        sb2.append(str);
        sb2.append(", name=");
        sb2.append(name);
        sb2.append(", relationship=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mobileNumber);
        Name name = this.name;
        if (name == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            name.writeToParcel(dest, i);
        }
        dest.writeString(this.relationship);
    }

    public UserProfileContactReference(String str, Name name, String str2) {
        this.mobileNumber = str;
        this.name = name;
        this.relationship = str2;
    }

    public /* synthetic */ UserProfileContactReference(String str, Name name, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : name, (i & 4) != 0 ? null : str2);
    }
}
