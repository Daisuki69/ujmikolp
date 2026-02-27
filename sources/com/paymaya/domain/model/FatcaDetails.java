package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FatcaDetails implements Parcelable {
    public static final Parcelable.Creator<FatcaDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("fatca")
    private final Boolean fatca;

    @InterfaceC1497a
    @InterfaceC1498b("fatcaReason")
    private final ArrayList<String> fatcaReason;

    @InterfaceC1497a
    @InterfaceC1498b("updateRequestedBy")
    private final String updateRequestedBy;

    public static final class Creator implements Parcelable.Creator<FatcaDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaDetails createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FatcaDetails(boolValueOf, parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaDetails[] newArray(int i) {
            return new FatcaDetails[i];
        }
    }

    public FatcaDetails() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FatcaDetails copy$default(FatcaDetails fatcaDetails, Boolean bool, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fatcaDetails.fatca;
        }
        if ((i & 2) != 0) {
            arrayList = fatcaDetails.fatcaReason;
        }
        if ((i & 4) != 0) {
            str = fatcaDetails.updateRequestedBy;
        }
        return fatcaDetails.copy(bool, arrayList, str);
    }

    public final Boolean component1() {
        return this.fatca;
    }

    public final ArrayList<String> component2() {
        return this.fatcaReason;
    }

    public final String component3() {
        return this.updateRequestedBy;
    }

    public final FatcaDetails copy(Boolean bool, ArrayList<String> arrayList, String str) {
        return new FatcaDetails(bool, arrayList, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatcaDetails)) {
            return false;
        }
        FatcaDetails fatcaDetails = (FatcaDetails) obj;
        return j.b(this.fatca, fatcaDetails.fatca) && j.b(this.fatcaReason, fatcaDetails.fatcaReason) && j.b(this.updateRequestedBy, fatcaDetails.updateRequestedBy);
    }

    public final Boolean getFatca() {
        return this.fatca;
    }

    public final ArrayList<String> getFatcaReason() {
        return this.fatcaReason;
    }

    public final String getUpdateRequestedBy() {
        return this.updateRequestedBy;
    }

    public int hashCode() {
        Boolean bool = this.fatca;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ArrayList<String> arrayList = this.fatcaReason;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.updateRequestedBy;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.fatca;
        ArrayList<String> arrayList = this.fatcaReason;
        String str = this.updateRequestedBy;
        StringBuilder sb2 = new StringBuilder("FatcaDetails(fatca=");
        sb2.append(bool);
        sb2.append(", fatcaReason=");
        sb2.append(arrayList);
        sb2.append(", updateRequestedBy=");
        return s.p(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Boolean bool = this.fatca;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        dest.writeStringList(this.fatcaReason);
        dest.writeString(this.updateRequestedBy);
    }

    public FatcaDetails(Boolean bool, ArrayList<String> arrayList, String str) {
        this.fatca = bool;
        this.fatcaReason = arrayList;
        this.updateRequestedBy = str;
    }

    public /* synthetic */ FatcaDetails(Boolean bool, ArrayList arrayList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : str);
    }
}
