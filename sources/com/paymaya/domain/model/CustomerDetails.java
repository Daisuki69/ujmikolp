package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerDetails implements Parcelable {
    public static final Parcelable.Creator<CustomerDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private String id;

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private MothersMaidenName mothersMaidenName;

    public static final class Creator implements Parcelable.Creator<CustomerDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerDetails(parcel.readString(), parcel.readInt() == 0 ? null : MothersMaidenName.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerDetails[] newArray(int i) {
            return new CustomerDetails[i];
        }
    }

    public CustomerDetails(String id, MothersMaidenName mothersMaidenName) {
        j.g(id, "id");
        this.id = id;
        this.mothersMaidenName = mothersMaidenName;
    }

    public static /* synthetic */ CustomerDetails copy$default(CustomerDetails customerDetails, String str, MothersMaidenName mothersMaidenName, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerDetails.id;
        }
        if ((i & 2) != 0) {
            mothersMaidenName = customerDetails.mothersMaidenName;
        }
        return customerDetails.copy(str, mothersMaidenName);
    }

    public final String component1() {
        return this.id;
    }

    public final MothersMaidenName component2() {
        return this.mothersMaidenName;
    }

    public final CustomerDetails copy(String id, MothersMaidenName mothersMaidenName) {
        j.g(id, "id");
        return new CustomerDetails(id, mothersMaidenName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerDetails)) {
            return false;
        }
        CustomerDetails customerDetails = (CustomerDetails) obj;
        return j.b(this.id, customerDetails.id) && j.b(this.mothersMaidenName, customerDetails.mothersMaidenName);
    }

    public final String getId() {
        return this.id;
    }

    public final MothersMaidenName getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        MothersMaidenName mothersMaidenName = this.mothersMaidenName;
        return iHashCode + (mothersMaidenName == null ? 0 : mothersMaidenName.hashCode());
    }

    public final void setId(String str) {
        j.g(str, "<set-?>");
        this.id = str;
    }

    public final void setMothersMaidenName(MothersMaidenName mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String toString() {
        return "CustomerDetails(id=" + this.id + ", mothersMaidenName=" + this.mothersMaidenName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        MothersMaidenName mothersMaidenName = this.mothersMaidenName;
        if (mothersMaidenName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mothersMaidenName.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ CustomerDetails(String str, MothersMaidenName mothersMaidenName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : mothersMaidenName);
    }
}
