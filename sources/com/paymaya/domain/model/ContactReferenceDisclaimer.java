package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferenceDisclaimer implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceDisclaimer> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b("info")
    private final String info;

    @InterfaceC1497a
    @InterfaceC1498b("items")
    private final List<ContactReferenceDisclaimerItem> items;

    public static final class Creator implements Parcelable.Creator<ContactReferenceDisclaimer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceDisclaimer createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ContactReferenceDisclaimerItem.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ContactReferenceDisclaimer(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceDisclaimer[] newArray(int i) {
            return new ContactReferenceDisclaimer[i];
        }
    }

    public ContactReferenceDisclaimer() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactReferenceDisclaimer copy$default(ContactReferenceDisclaimer contactReferenceDisclaimer, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferenceDisclaimer.header;
        }
        if ((i & 2) != 0) {
            str2 = contactReferenceDisclaimer.info;
        }
        if ((i & 4) != 0) {
            list = contactReferenceDisclaimer.items;
        }
        return contactReferenceDisclaimer.copy(str, str2, list);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.info;
    }

    public final List<ContactReferenceDisclaimerItem> component3() {
        return this.items;
    }

    public final ContactReferenceDisclaimer copy(String str, String str2, List<ContactReferenceDisclaimerItem> list) {
        return new ContactReferenceDisclaimer(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReferenceDisclaimer)) {
            return false;
        }
        ContactReferenceDisclaimer contactReferenceDisclaimer = (ContactReferenceDisclaimer) obj;
        return j.b(this.header, contactReferenceDisclaimer.header) && j.b(this.info, contactReferenceDisclaimer.info) && j.b(this.items, contactReferenceDisclaimer.items);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<ContactReferenceDisclaimerItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ContactReferenceDisclaimerItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.info;
        return s.r(s.x("ContactReferenceDisclaimer(header=", str, ", info=", str2, ", items="), this.items, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.header);
        dest.writeString(this.info);
        List<ContactReferenceDisclaimerItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((ContactReferenceDisclaimerItem) itP.next()).writeToParcel(dest, i);
        }
    }

    public ContactReferenceDisclaimer(String str, String str2, List<ContactReferenceDisclaimerItem> list) {
        this.header = str;
        this.info = str2;
        this.items = list;
    }

    public ContactReferenceDisclaimer(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C1112C.f9377a : list);
    }
}
