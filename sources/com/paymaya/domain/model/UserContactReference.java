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
public final class UserContactReference implements Parcelable {
    public static final Parcelable.Creator<UserContactReference> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("mobileNumber")
    private final String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final ContactName name;

    @InterfaceC1497a
    @InterfaceC1498b("relationship")
    private final String relationship;

    public static final class Creator implements Parcelable.Creator<UserContactReference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserContactReference createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UserContactReference(parcel.readInt() == 0 ? null : ContactName.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserContactReference[] newArray(int i) {
            return new UserContactReference[i];
        }
    }

    public UserContactReference() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserContactReference copy$default(UserContactReference userContactReference, ContactName contactName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            contactName = userContactReference.name;
        }
        if ((i & 2) != 0) {
            str = userContactReference.relationship;
        }
        if ((i & 4) != 0) {
            str2 = userContactReference.mobileNumber;
        }
        return userContactReference.copy(contactName, str, str2);
    }

    public final ContactName component1() {
        return this.name;
    }

    public final String component2() {
        return this.relationship;
    }

    public final String component3() {
        return this.mobileNumber;
    }

    public final UserContactReference copy(ContactName contactName, String str, String str2) {
        return new UserContactReference(contactName, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserContactReference)) {
            return false;
        }
        UserContactReference userContactReference = (UserContactReference) obj;
        return j.b(this.name, userContactReference.name) && j.b(this.relationship, userContactReference.relationship) && j.b(this.mobileNumber, userContactReference.mobileNumber);
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final ContactName getName() {
        return this.name;
    }

    public final String getRelationship() {
        return this.relationship;
    }

    public int hashCode() {
        ContactName contactName = this.name;
        int iHashCode = (contactName == null ? 0 : contactName.hashCode()) * 31;
        String str = this.relationship;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mobileNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ContactName contactName = this.name;
        String str = this.relationship;
        String str2 = this.mobileNumber;
        StringBuilder sb2 = new StringBuilder("UserContactReference(name=");
        sb2.append(contactName);
        sb2.append(", relationship=");
        sb2.append(str);
        sb2.append(", mobileNumber=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        ContactName contactName = this.name;
        if (contactName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactName.writeToParcel(dest, i);
        }
        dest.writeString(this.relationship);
        dest.writeString(this.mobileNumber);
    }

    public UserContactReference(ContactName contactName, String str, String str2) {
        this.name = contactName;
        this.relationship = str;
        this.mobileNumber = str2;
    }

    public /* synthetic */ UserContactReference(ContactName contactName, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
