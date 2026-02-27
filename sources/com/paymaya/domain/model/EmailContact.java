package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EmailContact implements Parcelable {
    public static final Parcelable.Creator<EmailContact> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("emailAddress")
    private String emailAddress;

    public static final class Creator implements Parcelable.Creator<EmailContact> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailContact createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EmailContact(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailContact[] newArray(int i) {
            return new EmailContact[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailContact() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EmailContact copy$default(EmailContact emailContact, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailContact.emailAddress;
        }
        return emailContact.copy(str);
    }

    public final String component1() {
        return this.emailAddress;
    }

    public final EmailContact copy(String str) {
        return new EmailContact(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailContact) && j.b(this.emailAddress, ((EmailContact) obj).emailAddress);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public int hashCode() {
        String str = this.emailAddress;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setEmailAddress(String str) {
        this.emailAddress = str;
    }

    public String toString() {
        return s.j("EmailContact(emailAddress=", this.emailAddress, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.emailAddress);
    }

    public EmailContact(String str) {
        this.emailAddress = str;
    }

    public /* synthetic */ EmailContact(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
