package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycRegulatoryProfileStatusResponse implements Parcelable {
    public static final Parcelable.Creator<KycRegulatoryProfileStatusResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("dosri")
    private final Dosri dosri;

    @InterfaceC1497a
    @InterfaceC1498b("fatca")
    private final Fatca fatca;

    public static final class Creator implements Parcelable.Creator<KycRegulatoryProfileStatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRegulatoryProfileStatusResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycRegulatoryProfileStatusResponse(parcel.readInt() == 0 ? null : Dosri.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Fatca.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRegulatoryProfileStatusResponse[] newArray(int i) {
            return new KycRegulatoryProfileStatusResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycRegulatoryProfileStatusResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycRegulatoryProfileStatusResponse copy$default(KycRegulatoryProfileStatusResponse kycRegulatoryProfileStatusResponse, Dosri dosri, Fatca fatca, int i, Object obj) {
        if ((i & 1) != 0) {
            dosri = kycRegulatoryProfileStatusResponse.dosri;
        }
        if ((i & 2) != 0) {
            fatca = kycRegulatoryProfileStatusResponse.fatca;
        }
        return kycRegulatoryProfileStatusResponse.copy(dosri, fatca);
    }

    public final Dosri component1() {
        return this.dosri;
    }

    public final Fatca component2() {
        return this.fatca;
    }

    public final KycRegulatoryProfileStatusResponse copy(Dosri dosri, Fatca fatca) {
        return new KycRegulatoryProfileStatusResponse(dosri, fatca);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycRegulatoryProfileStatusResponse)) {
            return false;
        }
        KycRegulatoryProfileStatusResponse kycRegulatoryProfileStatusResponse = (KycRegulatoryProfileStatusResponse) obj;
        return j.b(this.dosri, kycRegulatoryProfileStatusResponse.dosri) && j.b(this.fatca, kycRegulatoryProfileStatusResponse.fatca);
    }

    public final Dosri getDosri() {
        return this.dosri;
    }

    public final Fatca getFatca() {
        return this.fatca;
    }

    public int hashCode() {
        Dosri dosri = this.dosri;
        int iHashCode = (dosri == null ? 0 : dosri.hashCode()) * 31;
        Fatca fatca = this.fatca;
        return iHashCode + (fatca != null ? fatca.hashCode() : 0);
    }

    public String toString() {
        return "KycRegulatoryProfileStatusResponse(dosri=" + this.dosri + ", fatca=" + this.fatca + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Dosri dosri = this.dosri;
        if (dosri == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dosri.writeToParcel(dest, i);
        }
        Fatca fatca = this.fatca;
        if (fatca == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatca.writeToParcel(dest, i);
        }
    }

    public KycRegulatoryProfileStatusResponse(Dosri dosri, Fatca fatca) {
        this.dosri = dosri;
        this.fatca = fatca;
    }

    public /* synthetic */ KycRegulatoryProfileStatusResponse(Dosri dosri, Fatca fatca, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dosri, (i & 2) != 0 ? null : fatca);
    }
}
