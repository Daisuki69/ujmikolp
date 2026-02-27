package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactName implements Parcelable {
    public static final Parcelable.Creator<ContactName> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private final String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("hasNoMiddleName")
    private final Boolean hasNoMiddleName;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("middleName")
    private final String middleName;

    public static final class Creator implements Parcelable.Creator<ContactName> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactName createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContactName(string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactName[] newArray(int i) {
            return new ContactName[i];
        }
    }

    public ContactName() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ContactName copy$default(ContactName contactName, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactName.firstName;
        }
        if ((i & 2) != 0) {
            str2 = contactName.middleName;
        }
        if ((i & 4) != 0) {
            str3 = contactName.lastName;
        }
        if ((i & 8) != 0) {
            bool = contactName.hasNoMiddleName;
        }
        return contactName.copy(str, str2, str3, bool);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.middleName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final Boolean component4() {
        return this.hasNoMiddleName;
    }

    public final ContactName copy(String str, String str2, String str3, Boolean bool) {
        return new ContactName(str, str2, str3, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactName)) {
            return false;
        }
        ContactName contactName = (ContactName) obj;
        return j.b(this.firstName, contactName.firstName) && j.b(this.middleName, contactName.middleName) && j.b(this.lastName, contactName.lastName) && j.b(this.hasNoMiddleName, contactName.hasNoMiddleName);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Boolean getHasNoMiddleName() {
        return this.hasNoMiddleName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasNoMiddleName;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.middleName;
        String str3 = this.lastName;
        Boolean bool = this.hasNoMiddleName;
        StringBuilder sbX = s.x("ContactName(firstName=", str, ", middleName=", str2, ", lastName=");
        sbX.append(str3);
        sbX.append(", hasNoMiddleName=");
        sbX.append(bool);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        Boolean bool = this.hasNoMiddleName;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public ContactName(String str, String str2, String str3, Boolean bool) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.hasNoMiddleName = bool;
    }

    public /* synthetic */ ContactName(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
