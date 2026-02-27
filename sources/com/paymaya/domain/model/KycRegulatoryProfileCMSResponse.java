package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycRegulatoryProfileCMSResponse implements Parcelable {
    public static final Parcelable.Creator<KycRegulatoryProfileCMSResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final RegulatoryProfileCMSMeta meta;

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final RegulatoryCMSData regulatoryCMSData;

    public static final class Creator implements Parcelable.Creator<KycRegulatoryProfileCMSResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRegulatoryProfileCMSResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycRegulatoryProfileCMSResponse(parcel.readInt() == 0 ? null : RegulatoryCMSData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RegulatoryProfileCMSMeta.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRegulatoryProfileCMSResponse[] newArray(int i) {
            return new KycRegulatoryProfileCMSResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycRegulatoryProfileCMSResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycRegulatoryProfileCMSResponse copy$default(KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse, RegulatoryCMSData regulatoryCMSData, RegulatoryProfileCMSMeta regulatoryProfileCMSMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            regulatoryCMSData = kycRegulatoryProfileCMSResponse.regulatoryCMSData;
        }
        if ((i & 2) != 0) {
            regulatoryProfileCMSMeta = kycRegulatoryProfileCMSResponse.meta;
        }
        return kycRegulatoryProfileCMSResponse.copy(regulatoryCMSData, regulatoryProfileCMSMeta);
    }

    public final RegulatoryCMSData component1() {
        return this.regulatoryCMSData;
    }

    public final RegulatoryProfileCMSMeta component2() {
        return this.meta;
    }

    public final KycRegulatoryProfileCMSResponse copy(RegulatoryCMSData regulatoryCMSData, RegulatoryProfileCMSMeta regulatoryProfileCMSMeta) {
        return new KycRegulatoryProfileCMSResponse(regulatoryCMSData, regulatoryProfileCMSMeta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycRegulatoryProfileCMSResponse)) {
            return false;
        }
        KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse = (KycRegulatoryProfileCMSResponse) obj;
        return j.b(this.regulatoryCMSData, kycRegulatoryProfileCMSResponse.regulatoryCMSData) && j.b(this.meta, kycRegulatoryProfileCMSResponse.meta);
    }

    public final RegulatoryProfileCMSMeta getMeta() {
        return this.meta;
    }

    public final RegulatoryCMSData getRegulatoryCMSData() {
        return this.regulatoryCMSData;
    }

    public int hashCode() {
        RegulatoryCMSData regulatoryCMSData = this.regulatoryCMSData;
        int iHashCode = (regulatoryCMSData == null ? 0 : regulatoryCMSData.hashCode()) * 31;
        RegulatoryProfileCMSMeta regulatoryProfileCMSMeta = this.meta;
        return iHashCode + (regulatoryProfileCMSMeta != null ? regulatoryProfileCMSMeta.hashCode() : 0);
    }

    public String toString() {
        return "KycRegulatoryProfileCMSResponse(regulatoryCMSData=" + this.regulatoryCMSData + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        RegulatoryCMSData regulatoryCMSData = this.regulatoryCMSData;
        if (regulatoryCMSData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            regulatoryCMSData.writeToParcel(dest, i);
        }
        RegulatoryProfileCMSMeta regulatoryProfileCMSMeta = this.meta;
        if (regulatoryProfileCMSMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            regulatoryProfileCMSMeta.writeToParcel(dest, i);
        }
    }

    public KycRegulatoryProfileCMSResponse(RegulatoryCMSData regulatoryCMSData, RegulatoryProfileCMSMeta regulatoryProfileCMSMeta) {
        this.regulatoryCMSData = regulatoryCMSData;
        this.meta = regulatoryProfileCMSMeta;
    }

    public /* synthetic */ KycRegulatoryProfileCMSResponse(RegulatoryCMSData regulatoryCMSData, RegulatoryProfileCMSMeta regulatoryProfileCMSMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : regulatoryCMSData, (i & 2) != 0 ? null : regulatoryProfileCMSMeta);
    }
}
