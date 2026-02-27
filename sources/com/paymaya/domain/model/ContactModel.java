package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactModel extends ContactListItem implements Parcelable {
    public static final Parcelable.Creator<ContactModel> CREATOR = new Creator();
    private final String contactId;
    private final String firstName;
    private final String imageUri;
    private final String lastName;
    private final String middleName;
    private final String name;
    private final String number;

    public static final class Creator implements Parcelable.Creator<ContactModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactModel createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactModel[] newArray(int i) {
            return new ContactModel[i];
        }
    }

    public /* synthetic */ ContactModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ ContactModel copy$default(ContactModel contactModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactModel.name;
        }
        if ((i & 2) != 0) {
            str2 = contactModel.number;
        }
        if ((i & 4) != 0) {
            str3 = contactModel.imageUri;
        }
        if ((i & 8) != 0) {
            str4 = contactModel.firstName;
        }
        if ((i & 16) != 0) {
            str5 = contactModel.middleName;
        }
        if ((i & 32) != 0) {
            str6 = contactModel.lastName;
        }
        if ((i & 64) != 0) {
            str7 = contactModel.contactId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return contactModel.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.imageUri;
    }

    public final String component4() {
        return this.firstName;
    }

    public final String component5() {
        return this.middleName;
    }

    public final String component6() {
        return this.lastName;
    }

    public final String component7() {
        return this.contactId;
    }

    public final ContactModel copy(String name, String number, String str, String str2, String str3, String str4, String str5) {
        j.g(name, "name");
        j.g(number, "number");
        return new ContactModel(name, number, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactModel)) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        return j.b(this.name, contactModel.name) && j.b(this.number, contactModel.number) && j.b(this.imageUri, contactModel.imageUri) && j.b(this.firstName, contactModel.firstName) && j.b(this.middleName, contactModel.middleName) && j.b(this.lastName, contactModel.lastName) && j.b(this.contactId, contactModel.contactId);
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.name.hashCode() * 31, 31, this.number);
        String str = this.imageUri;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contactId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.number;
        String str3 = this.imageUri;
        String str4 = this.firstName;
        String str5 = this.middleName;
        String str6 = this.lastName;
        String str7 = this.contactId;
        StringBuilder sbX = s.x("ContactModel(name=", str, ", number=", str2, ", imageUri=");
        c.A(sbX, str3, ", firstName=", str4, ", middleName=");
        c.A(sbX, str5, ", lastName=", str6, ", contactId=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.number);
        dest.writeString(this.imageUri);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.contactId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactModel(String name, String number, String str, String str2, String str3, String str4, String str5) {
        super(null);
        j.g(name, "name");
        j.g(number, "number");
        this.name = name;
        this.number = number;
        this.imageUri = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.contactId = str5;
    }
}
