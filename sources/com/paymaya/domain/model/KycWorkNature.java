package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycWorkNature implements Parcelable {
    public static final Parcelable.Creator<KycWorkNature> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additionalInfoRequired")
    private final Boolean additionalInfoRequired;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("prohibitedIncomeSources")
    private final List<KycIncomeSource> prohibitedIncomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("requiresEmploymentDetails")
    private final Boolean requiresEmploymentDetails;

    public static final class Creator implements Parcelable.Creator<KycWorkNature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycWorkNature createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            j.g(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int I4 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycIncomeSource.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycWorkNature(numValueOf, string, string2, boolValueOf, boolValueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycWorkNature[] newArray(int i) {
            return new KycWorkNature[i];
        }
    }

    public KycWorkNature() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycWorkNature copy$default(KycWorkNature kycWorkNature, Integer num, String str, String str2, Boolean bool, Boolean bool2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycWorkNature.id;
        }
        if ((i & 2) != 0) {
            str = kycWorkNature.name;
        }
        if ((i & 4) != 0) {
            str2 = kycWorkNature.description;
        }
        if ((i & 8) != 0) {
            bool = kycWorkNature.additionalInfoRequired;
        }
        if ((i & 16) != 0) {
            bool2 = kycWorkNature.requiresEmploymentDetails;
        }
        if ((i & 32) != 0) {
            list = kycWorkNature.prohibitedIncomeSources;
        }
        Boolean bool3 = bool2;
        List list2 = list;
        return kycWorkNature.copy(num, str, str2, bool, bool3, list2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final Boolean component4() {
        return this.additionalInfoRequired;
    }

    public final Boolean component5() {
        return this.requiresEmploymentDetails;
    }

    public final List<KycIncomeSource> component6() {
        return this.prohibitedIncomeSources;
    }

    public final KycWorkNature copy(Integer num, String str, String str2, Boolean bool, Boolean bool2, List<KycIncomeSource> list) {
        return new KycWorkNature(num, str, str2, bool, bool2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycWorkNature)) {
            return false;
        }
        KycWorkNature kycWorkNature = (KycWorkNature) obj;
        return j.b(this.id, kycWorkNature.id) && j.b(this.name, kycWorkNature.name) && j.b(this.description, kycWorkNature.description) && j.b(this.additionalInfoRequired, kycWorkNature.additionalInfoRequired) && j.b(this.requiresEmploymentDetails, kycWorkNature.requiresEmploymentDetails) && j.b(this.prohibitedIncomeSources, kycWorkNature.prohibitedIncomeSources);
    }

    public final Boolean getAdditionalInfoRequired() {
        return this.additionalInfoRequired;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<KycIncomeSource> getProhibitedIncomeSources() {
        return this.prohibitedIncomeSources;
    }

    public final Boolean getRequiresEmploymentDetails() {
        return this.requiresEmploymentDetails;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.additionalInfoRequired;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.requiresEmploymentDetails;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<KycIncomeSource> list = this.prohibitedIncomeSources;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.description;
        Boolean bool = this.additionalInfoRequired;
        Boolean bool2 = this.requiresEmploymentDetails;
        List<KycIncomeSource> list = this.prohibitedIncomeSources;
        StringBuilder sbO = AbstractC1213b.O(num, "KycWorkNature(id=", ", name=", str, ", description=");
        sbO.append(str2);
        sbO.append(", additionalInfoRequired=");
        sbO.append(bool);
        sbO.append(", requiresEmploymentDetails=");
        sbO.append(bool2);
        sbO.append(", prohibitedIncomeSources=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
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
        dest.writeString(this.name);
        dest.writeString(this.description);
        Boolean bool = this.additionalInfoRequired;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        Boolean bool2 = this.requiresEmploymentDetails;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool2);
        }
        List<KycIncomeSource> list = this.prohibitedIncomeSources;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycIncomeSource) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycWorkNature(Integer num, String str, String str2, Boolean bool, Boolean bool2, List<KycIncomeSource> list) {
        this.id = num;
        this.name = str;
        this.description = str2;
        this.additionalInfoRequired = bool;
        this.requiresEmploymentDetails = bool2;
        this.prohibitedIncomeSources = list;
    }

    public /* synthetic */ KycWorkNature(Integer num, String str, String str2, Boolean bool, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : list);
    }
}
