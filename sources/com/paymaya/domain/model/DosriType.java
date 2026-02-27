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
public final class DosriType implements Parcelable {
    public static final Parcelable.Creator<DosriType> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additional_description")
    private final String additionalDescription;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    @InterfaceC1497a
    @InterfaceC1498b("requires_related_to")
    private final Boolean requiresRelatedTo;

    public static final class Creator implements Parcelable.Creator<DosriType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriType createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DosriType(string, string2, numValueOf, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriType[] newArray(int i) {
            return new DosriType[i];
        }
    }

    public DosriType() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DosriType copy$default(DosriType dosriType, String str, String str2, Integer num, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dosriType.additionalDescription;
        }
        if ((i & 2) != 0) {
            str2 = dosriType.description;
        }
        if ((i & 4) != 0) {
            num = dosriType.id;
        }
        if ((i & 8) != 0) {
            str3 = dosriType.key;
        }
        if ((i & 16) != 0) {
            bool = dosriType.requiresRelatedTo;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        return dosriType.copy(str, str2, num2, str3, bool2);
    }

    public final String component1() {
        return this.additionalDescription;
    }

    public final String component2() {
        return this.description;
    }

    public final Integer component3() {
        return this.id;
    }

    public final String component4() {
        return this.key;
    }

    public final Boolean component5() {
        return this.requiresRelatedTo;
    }

    public final DosriType copy(String str, String str2, Integer num, String str3, Boolean bool) {
        return new DosriType(str, str2, num, str3, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriType)) {
            return false;
        }
        DosriType dosriType = (DosriType) obj;
        return j.b(this.additionalDescription, dosriType.additionalDescription) && j.b(this.description, dosriType.description) && j.b(this.id, dosriType.id) && j.b(this.key, dosriType.key) && j.b(this.requiresRelatedTo, dosriType.requiresRelatedTo);
    }

    public final String getAdditionalDescription() {
        return this.additionalDescription;
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

    public final Boolean getRequiresRelatedTo() {
        return this.requiresRelatedTo;
    }

    public int hashCode() {
        String str = this.additionalDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.requiresRelatedTo;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.additionalDescription;
        String str2 = this.description;
        Integer num = this.id;
        String str3 = this.key;
        Boolean bool = this.requiresRelatedTo;
        StringBuilder sbX = s.x("DosriType(additionalDescription=", str, ", description=", str2, ", id=");
        sbX.append(num);
        sbX.append(", key=");
        sbX.append(str3);
        sbX.append(", requiresRelatedTo=");
        return AbstractC1213b.N(sbX, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.additionalDescription);
        dest.writeString(this.description);
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.key);
        Boolean bool = this.requiresRelatedTo;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public DosriType(String str, String str2, Integer num, String str3, Boolean bool) {
        this.additionalDescription = str;
        this.description = str2;
        this.id = num;
        this.key = str3;
        this.requiresRelatedTo = bool;
    }

    public /* synthetic */ DosriType(String str, String str2, Integer num, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}
