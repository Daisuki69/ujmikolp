package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Name implements Parcelable {
    public static final Parcelable.Creator<Name> CREATOR = new Creator();

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

    public static final class Creator implements Parcelable.Creator<Name> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Name(string, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name[] newArray(int i) {
            return new Name[i];
        }
    }

    public Name() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Name copy$default(Name name, String str, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = name.firstName;
        }
        if ((i & 2) != 0) {
            bool = name.hasNoMiddleName;
        }
        if ((i & 4) != 0) {
            str2 = name.lastName;
        }
        if ((i & 8) != 0) {
            str3 = name.middleName;
        }
        return name.copy(str, bool, str2, str3);
    }

    public final String component1() {
        return this.firstName;
    }

    public final Boolean component2() {
        return this.hasNoMiddleName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.middleName;
    }

    public final Name copy(String str, Boolean bool, String str2, String str3) {
        return new Name(str, bool, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return j.b(this.firstName, name.firstName) && j.b(this.hasNoMiddleName, name.hasNoMiddleName) && j.b(this.lastName, name.lastName) && j.b(this.middleName, name.middleName);
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
        Boolean bool = this.hasNoMiddleName;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        Boolean bool = this.hasNoMiddleName;
        String str2 = this.lastName;
        String str3 = this.middleName;
        StringBuilder sb2 = new StringBuilder("Name(firstName=");
        sb2.append(str);
        sb2.append(", hasNoMiddleName=");
        sb2.append(bool);
        sb2.append(", lastName=");
        return a.p(sb2, str2, ", middleName=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.firstName);
        Boolean bool = this.hasNoMiddleName;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        dest.writeString(this.lastName);
        dest.writeString(this.middleName);
    }

    public Name(String str, Boolean bool, String str2, String str3) {
        this.firstName = str;
        this.hasNoMiddleName = bool;
        this.lastName = str2;
        this.middleName = str3;
    }

    public /* synthetic */ Name(String str, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
