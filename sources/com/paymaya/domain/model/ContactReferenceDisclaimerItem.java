package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferenceDisclaimerItem implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceDisclaimerItem> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("info")
    private final String info;

    public static final class Creator implements Parcelable.Creator<ContactReferenceDisclaimerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceDisclaimerItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferenceDisclaimerItem(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceDisclaimerItem[] newArray(int i) {
            return new ContactReferenceDisclaimerItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactReferenceDisclaimerItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContactReferenceDisclaimerItem copy$default(ContactReferenceDisclaimerItem contactReferenceDisclaimerItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferenceDisclaimerItem.info;
        }
        return contactReferenceDisclaimerItem.copy(str);
    }

    public final String component1() {
        return this.info;
    }

    public final ContactReferenceDisclaimerItem copy(String str) {
        return new ContactReferenceDisclaimerItem(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactReferenceDisclaimerItem) && j.b(this.info, ((ContactReferenceDisclaimerItem) obj).info);
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        String str = this.info;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("ContactReferenceDisclaimerItem(info=", this.info, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.info);
    }

    public ContactReferenceDisclaimerItem(String str) {
        this.info = str;
    }

    public /* synthetic */ ContactReferenceDisclaimerItem(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
