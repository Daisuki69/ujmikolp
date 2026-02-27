package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FatcaSelection implements Parcelable {
    public static final Parcelable.Creator<FatcaSelection> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("fatca_reason")
    private final FatcaReason fatcaReason;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("is_fatca")
    private final Boolean isFatca;

    public static final class Creator implements Parcelable.Creator<FatcaSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaSelection createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf = null;
            FatcaReason fatcaReasonCreateFromParcel = parcel.readInt() == 0 ? null : FatcaReason.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FatcaSelection(string, fatcaReasonCreateFromParcel, numValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaSelection[] newArray(int i) {
            return new FatcaSelection[i];
        }
    }

    public FatcaSelection() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FatcaSelection copy$default(FatcaSelection fatcaSelection, String str, FatcaReason fatcaReason, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fatcaSelection.description;
        }
        if ((i & 2) != 0) {
            fatcaReason = fatcaSelection.fatcaReason;
        }
        if ((i & 4) != 0) {
            num = fatcaSelection.id;
        }
        if ((i & 8) != 0) {
            bool = fatcaSelection.isFatca;
        }
        return fatcaSelection.copy(str, fatcaReason, num, bool);
    }

    public final String component1() {
        return this.description;
    }

    public final FatcaReason component2() {
        return this.fatcaReason;
    }

    public final Integer component3() {
        return this.id;
    }

    public final Boolean component4() {
        return this.isFatca;
    }

    public final FatcaSelection copy(String str, FatcaReason fatcaReason, Integer num, Boolean bool) {
        return new FatcaSelection(str, fatcaReason, num, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatcaSelection)) {
            return false;
        }
        FatcaSelection fatcaSelection = (FatcaSelection) obj;
        return j.b(this.description, fatcaSelection.description) && j.b(this.fatcaReason, fatcaSelection.fatcaReason) && j.b(this.id, fatcaSelection.id) && j.b(this.isFatca, fatcaSelection.isFatca);
    }

    public final String getDescription() {
        return this.description;
    }

    public final FatcaReason getFatcaReason() {
        return this.fatcaReason;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FatcaReason fatcaReason = this.fatcaReason;
        int iHashCode2 = (iHashCode + (fatcaReason == null ? 0 : fatcaReason.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFatca;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isFatca() {
        return this.isFatca;
    }

    public String toString() {
        return "FatcaSelection(description=" + this.description + ", fatcaReason=" + this.fatcaReason + ", id=" + this.id + ", isFatca=" + this.isFatca + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.description);
        FatcaReason fatcaReason = this.fatcaReason;
        if (fatcaReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatcaReason.writeToParcel(dest, i);
        }
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        Boolean bool = this.isFatca;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public FatcaSelection(String str, FatcaReason fatcaReason, Integer num, Boolean bool) {
        this.description = str;
        this.fatcaReason = fatcaReason;
        this.id = num;
        this.isFatca = bool;
    }

    public /* synthetic */ FatcaSelection(String str, FatcaReason fatcaReason, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : fatcaReason, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
