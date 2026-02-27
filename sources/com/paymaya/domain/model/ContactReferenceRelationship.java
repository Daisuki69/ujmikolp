package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferenceRelationship implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceRelationship> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<ContactReferenceRelationship> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceRelationship createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferenceRelationship(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceRelationship[] newArray(int i) {
            return new ContactReferenceRelationship[i];
        }
    }

    public ContactReferenceRelationship() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ContactReferenceRelationship copy$default(ContactReferenceRelationship contactReferenceRelationship, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = contactReferenceRelationship.id;
        }
        if ((i & 2) != 0) {
            str = contactReferenceRelationship.code;
        }
        if ((i & 4) != 0) {
            str2 = contactReferenceRelationship.name;
        }
        return contactReferenceRelationship.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final ContactReferenceRelationship copy(Integer num, String str, String str2) {
        return new ContactReferenceRelationship(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReferenceRelationship)) {
            return false;
        }
        ContactReferenceRelationship contactReferenceRelationship = (ContactReferenceRelationship) obj;
        return j.b(this.id, contactReferenceRelationship.id) && j.b(this.code, contactReferenceRelationship.code) && j.b(this.name, contactReferenceRelationship.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.code;
        return s.p(AbstractC1213b.O(num, "ContactReferenceRelationship(id=", ", code=", str, ", name="), this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    public ContactReferenceRelationship(Integer num, String str, String str2) {
        this.id = num;
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ ContactReferenceRelationship(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
