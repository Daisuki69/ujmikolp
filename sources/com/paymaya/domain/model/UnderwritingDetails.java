package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UnderwritingDetails implements Parcelable {
    public static final Parcelable.Creator<UnderwritingDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("sss")
    private ProfileTin sss;

    @InterfaceC1497a
    @InterfaceC1498b("tin")
    private ProfileTin tin;

    @InterfaceC1497a
    @InterfaceC1498b("workDetails")
    private final WorkDetails workDetails;

    public static final class Creator implements Parcelable.Creator<UnderwritingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderwritingDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UnderwritingDetails(parcel.readInt() == 0 ? null : WorkDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileTin.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProfileTin.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderwritingDetails[] newArray(int i) {
            return new UnderwritingDetails[i];
        }
    }

    public UnderwritingDetails() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UnderwritingDetails copy$default(UnderwritingDetails underwritingDetails, WorkDetails workDetails, ProfileTin profileTin, ProfileTin profileTin2, int i, Object obj) {
        if ((i & 1) != 0) {
            workDetails = underwritingDetails.workDetails;
        }
        if ((i & 2) != 0) {
            profileTin = underwritingDetails.tin;
        }
        if ((i & 4) != 0) {
            profileTin2 = underwritingDetails.sss;
        }
        return underwritingDetails.copy(workDetails, profileTin, profileTin2);
    }

    public final WorkDetails component1() {
        return this.workDetails;
    }

    public final ProfileTin component2() {
        return this.tin;
    }

    public final ProfileTin component3() {
        return this.sss;
    }

    public final UnderwritingDetails copy(WorkDetails workDetails, ProfileTin profileTin, ProfileTin profileTin2) {
        return new UnderwritingDetails(workDetails, profileTin, profileTin2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnderwritingDetails)) {
            return false;
        }
        UnderwritingDetails underwritingDetails = (UnderwritingDetails) obj;
        return j.b(this.workDetails, underwritingDetails.workDetails) && j.b(this.tin, underwritingDetails.tin) && j.b(this.sss, underwritingDetails.sss);
    }

    public final ProfileTin getSss() {
        return this.sss;
    }

    public final ProfileTin getTin() {
        return this.tin;
    }

    public final WorkDetails getWorkDetails() {
        return this.workDetails;
    }

    public int hashCode() {
        WorkDetails workDetails = this.workDetails;
        int iHashCode = (workDetails == null ? 0 : workDetails.hashCode()) * 31;
        ProfileTin profileTin = this.tin;
        int iHashCode2 = (iHashCode + (profileTin == null ? 0 : profileTin.hashCode())) * 31;
        ProfileTin profileTin2 = this.sss;
        return iHashCode2 + (profileTin2 != null ? profileTin2.hashCode() : 0);
    }

    public final void setSss(ProfileTin profileTin) {
        this.sss = profileTin;
    }

    public final void setTin(ProfileTin profileTin) {
        this.tin = profileTin;
    }

    public String toString() {
        return "UnderwritingDetails(workDetails=" + this.workDetails + ", tin=" + this.tin + ", sss=" + this.sss + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        WorkDetails workDetails = this.workDetails;
        if (workDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            workDetails.writeToParcel(dest, i);
        }
        ProfileTin profileTin = this.tin;
        if (profileTin == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileTin.writeToParcel(dest, i);
        }
        ProfileTin profileTin2 = this.sss;
        if (profileTin2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileTin2.writeToParcel(dest, i);
        }
    }

    public UnderwritingDetails(WorkDetails workDetails, ProfileTin profileTin, ProfileTin profileTin2) {
        this.workDetails = workDetails;
        this.tin = profileTin;
        this.sss = profileTin2;
    }

    public /* synthetic */ UnderwritingDetails(WorkDetails workDetails, ProfileTin profileTin, ProfileTin profileTin2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : workDetails, (i & 2) != 0 ? null : profileTin, (i & 4) != 0 ? null : profileTin2);
    }
}
