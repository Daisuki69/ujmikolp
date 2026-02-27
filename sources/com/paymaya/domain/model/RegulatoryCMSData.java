package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RegulatoryCMSData implements Parcelable {
    public static final Parcelable.Creator<RegulatoryCMSData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("dosri_guides")
    private final DosriGuides dosriGuides;

    @InterfaceC1497a
    @InterfaceC1498b("dosri_related_to_max_count")
    private final Integer dosriRelatedToMaxCount;

    @InterfaceC1497a
    @InterfaceC1498b("dosri_relationships")
    private final List<DosriRelationship> dosriRelationships;

    @InterfaceC1497a
    @InterfaceC1498b("dosri_types")
    private final List<DosriType> dosriTypes;

    @InterfaceC1497a
    @InterfaceC1498b("fatca_guides")
    private final FatcaGuides fatcaGuides;

    @InterfaceC1497a
    @InterfaceC1498b("fatca_selections")
    private final List<FatcaSelection> fatcaSelections;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("validation_rules")
    private final List<DosriValidationRule> validationRules;

    public static final class Creator implements Parcelable.Creator<RegulatoryCMSData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegulatoryCMSData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            j.g(parcel, "parcel");
            ArrayList arrayList4 = null;
            DosriGuides dosriGuidesCreateFromParcel = parcel.readInt() == 0 ? null : DosriGuides.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int I4 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I9 = 0;
                while (I9 != i) {
                    I9 = AbstractC1213b.I(DosriRelationship.CREATOR, parcel, arrayList, I9, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                int I10 = 0;
                while (I10 != i4) {
                    I10 = AbstractC1213b.I(DosriType.CREATOR, parcel, arrayList2, I10, 1);
                }
            }
            FatcaGuides fatcaGuidesCreateFromParcel = parcel.readInt() == 0 ? null : FatcaGuides.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList3 = new ArrayList(i6);
                int I11 = 0;
                while (I11 != i6) {
                    I11 = AbstractC1213b.I(FatcaSelection.CREATOR, parcel, arrayList3, I11, 1);
                }
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                arrayList4 = new ArrayList(i10);
                while (I4 != i10) {
                    I4 = AbstractC1213b.I(DosriValidationRule.CREATOR, parcel, arrayList4, I4, 1);
                }
            }
            return new RegulatoryCMSData(dosriGuidesCreateFromParcel, numValueOf, arrayList, arrayList2, fatcaGuidesCreateFromParcel, arrayList3, numValueOf2, arrayList4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegulatoryCMSData[] newArray(int i) {
            return new RegulatoryCMSData[i];
        }
    }

    public RegulatoryCMSData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegulatoryCMSData copy$default(RegulatoryCMSData regulatoryCMSData, DosriGuides dosriGuides, Integer num, List list, List list2, FatcaGuides fatcaGuides, List list3, Integer num2, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            dosriGuides = regulatoryCMSData.dosriGuides;
        }
        if ((i & 2) != 0) {
            num = regulatoryCMSData.dosriRelatedToMaxCount;
        }
        if ((i & 4) != 0) {
            list = regulatoryCMSData.dosriRelationships;
        }
        if ((i & 8) != 0) {
            list2 = regulatoryCMSData.dosriTypes;
        }
        if ((i & 16) != 0) {
            fatcaGuides = regulatoryCMSData.fatcaGuides;
        }
        if ((i & 32) != 0) {
            list3 = regulatoryCMSData.fatcaSelections;
        }
        if ((i & 64) != 0) {
            num2 = regulatoryCMSData.id;
        }
        if ((i & 128) != 0) {
            list4 = regulatoryCMSData.validationRules;
        }
        Integer num3 = num2;
        List list5 = list4;
        FatcaGuides fatcaGuides2 = fatcaGuides;
        List list6 = list3;
        return regulatoryCMSData.copy(dosriGuides, num, list, list2, fatcaGuides2, list6, num3, list5);
    }

    public final DosriGuides component1() {
        return this.dosriGuides;
    }

    public final Integer component2() {
        return this.dosriRelatedToMaxCount;
    }

    public final List<DosriRelationship> component3() {
        return this.dosriRelationships;
    }

    public final List<DosriType> component4() {
        return this.dosriTypes;
    }

    public final FatcaGuides component5() {
        return this.fatcaGuides;
    }

    public final List<FatcaSelection> component6() {
        return this.fatcaSelections;
    }

    public final Integer component7() {
        return this.id;
    }

    public final List<DosriValidationRule> component8() {
        return this.validationRules;
    }

    public final RegulatoryCMSData copy(DosriGuides dosriGuides, Integer num, List<DosriRelationship> list, List<DosriType> list2, FatcaGuides fatcaGuides, List<FatcaSelection> list3, Integer num2, List<DosriValidationRule> list4) {
        return new RegulatoryCMSData(dosriGuides, num, list, list2, fatcaGuides, list3, num2, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegulatoryCMSData)) {
            return false;
        }
        RegulatoryCMSData regulatoryCMSData = (RegulatoryCMSData) obj;
        return j.b(this.dosriGuides, regulatoryCMSData.dosriGuides) && j.b(this.dosriRelatedToMaxCount, regulatoryCMSData.dosriRelatedToMaxCount) && j.b(this.dosriRelationships, regulatoryCMSData.dosriRelationships) && j.b(this.dosriTypes, regulatoryCMSData.dosriTypes) && j.b(this.fatcaGuides, regulatoryCMSData.fatcaGuides) && j.b(this.fatcaSelections, regulatoryCMSData.fatcaSelections) && j.b(this.id, regulatoryCMSData.id) && j.b(this.validationRules, regulatoryCMSData.validationRules);
    }

    public final DosriGuides getDosriGuides() {
        return this.dosriGuides;
    }

    public final Integer getDosriRelatedToMaxCount() {
        return this.dosriRelatedToMaxCount;
    }

    public final List<DosriRelationship> getDosriRelationships() {
        return this.dosriRelationships;
    }

    public final List<DosriType> getDosriTypes() {
        return this.dosriTypes;
    }

    public final FatcaGuides getFatcaGuides() {
        return this.fatcaGuides;
    }

    public final List<FatcaSelection> getFatcaSelections() {
        return this.fatcaSelections;
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<DosriValidationRule> getValidationRules() {
        return this.validationRules;
    }

    public int hashCode() {
        DosriGuides dosriGuides = this.dosriGuides;
        int iHashCode = (dosriGuides == null ? 0 : dosriGuides.hashCode()) * 31;
        Integer num = this.dosriRelatedToMaxCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<DosriRelationship> list = this.dosriRelationships;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DosriType> list2 = this.dosriTypes;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FatcaGuides fatcaGuides = this.fatcaGuides;
        int iHashCode5 = (iHashCode4 + (fatcaGuides == null ? 0 : fatcaGuides.hashCode())) * 31;
        List<FatcaSelection> list3 = this.fatcaSelections;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.id;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<DosriValidationRule> list4 = this.validationRules;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "RegulatoryCMSData(dosriGuides=" + this.dosriGuides + ", dosriRelatedToMaxCount=" + this.dosriRelatedToMaxCount + ", dosriRelationships=" + this.dosriRelationships + ", dosriTypes=" + this.dosriTypes + ", fatcaGuides=" + this.fatcaGuides + ", fatcaSelections=" + this.fatcaSelections + ", id=" + this.id + ", validationRules=" + this.validationRules + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        DosriGuides dosriGuides = this.dosriGuides;
        if (dosriGuides == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dosriGuides.writeToParcel(dest, i);
        }
        Integer num = this.dosriRelatedToMaxCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        List<DosriRelationship> list = this.dosriRelationships;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((DosriRelationship) itP.next()).writeToParcel(dest, i);
            }
        }
        List<DosriType> list2 = this.dosriTypes;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP2 = AbstractC1213b.P(dest, 1, list2);
            while (itP2.hasNext()) {
                ((DosriType) itP2.next()).writeToParcel(dest, i);
            }
        }
        FatcaGuides fatcaGuides = this.fatcaGuides;
        if (fatcaGuides == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatcaGuides.writeToParcel(dest, i);
        }
        List<FatcaSelection> list3 = this.fatcaSelections;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP3 = AbstractC1213b.P(dest, 1, list3);
            while (itP3.hasNext()) {
                ((FatcaSelection) itP3.next()).writeToParcel(dest, i);
            }
        }
        Integer num2 = this.id;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        List<DosriValidationRule> list4 = this.validationRules;
        if (list4 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP4 = AbstractC1213b.P(dest, 1, list4);
        while (itP4.hasNext()) {
            ((DosriValidationRule) itP4.next()).writeToParcel(dest, i);
        }
    }

    public RegulatoryCMSData(DosriGuides dosriGuides, Integer num, List<DosriRelationship> list, List<DosriType> list2, FatcaGuides fatcaGuides, List<FatcaSelection> list3, Integer num2, List<DosriValidationRule> list4) {
        this.dosriGuides = dosriGuides;
        this.dosriRelatedToMaxCount = num;
        this.dosriRelationships = list;
        this.dosriTypes = list2;
        this.fatcaGuides = fatcaGuides;
        this.fatcaSelections = list3;
        this.id = num2;
        this.validationRules = list4;
    }

    public /* synthetic */ RegulatoryCMSData(DosriGuides dosriGuides, Integer num, List list, List list2, FatcaGuides fatcaGuides, List list3, Integer num2, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dosriGuides, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : fatcaGuides, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : list4);
    }
}
