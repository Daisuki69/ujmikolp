package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DosriRelationship implements Parcelable {
    public static final Parcelable.Creator<DosriRelationship> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<DosriRelationship> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriRelationship createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new DosriRelationship(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriRelationship[] newArray(int i) {
            return new DosriRelationship[i];
        }
    }

    public DosriRelationship() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DosriRelationship copy$default(DosriRelationship dosriRelationship, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dosriRelationship.description;
        }
        if ((i & 2) != 0) {
            num = dosriRelationship.id;
        }
        if ((i & 4) != 0) {
            str2 = dosriRelationship.key;
        }
        return dosriRelationship.copy(str, num, str2);
    }

    public final String component1() {
        return this.description;
    }

    public final Integer component2() {
        return this.id;
    }

    public final String component3() {
        return this.key;
    }

    public final DosriRelationship copy(String str, Integer num, String str2) {
        return new DosriRelationship(str, num, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriRelationship)) {
            return false;
        }
        DosriRelationship dosriRelationship = (DosriRelationship) obj;
        return j.b(this.description, dosriRelationship.description) && j.b(this.id, dosriRelationship.id) && j.b(this.key, dosriRelationship.key);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.key;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        Integer num = this.id;
        String str2 = this.key;
        StringBuilder sb2 = new StringBuilder("DosriRelationship(description=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(num);
        sb2.append(", key=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.description);
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.key);
    }

    public DosriRelationship(String str, Integer num, String str2) {
        this.description = str;
        this.id = num;
        this.key = str2;
    }

    public /* synthetic */ DosriRelationship(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
