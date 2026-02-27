package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaAffectedStatus implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaAffectedStatus> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaAffectedStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAffectedStatus createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaAffectedStatus(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAffectedStatus[] newArray(int i) {
            return new ReKycCriteriaAffectedStatus[i];
        }
    }

    public ReKycCriteriaAffectedStatus(int i, String status) {
        j.g(status, "status");
        this.id = i;
        this.status = status;
    }

    public static /* synthetic */ ReKycCriteriaAffectedStatus copy$default(ReKycCriteriaAffectedStatus reKycCriteriaAffectedStatus, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteriaAffectedStatus.id;
        }
        if ((i4 & 2) != 0) {
            str = reKycCriteriaAffectedStatus.status;
        }
        return reKycCriteriaAffectedStatus.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.status;
    }

    public final ReKycCriteriaAffectedStatus copy(int i, String status) {
        j.g(status, "status");
        return new ReKycCriteriaAffectedStatus(i, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaAffectedStatus)) {
            return false;
        }
        ReKycCriteriaAffectedStatus reKycCriteriaAffectedStatus = (ReKycCriteriaAffectedStatus) obj;
        return this.id == reKycCriteriaAffectedStatus.id && j.b(this.status, reKycCriteriaAffectedStatus.status);
    }

    public final int getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "ReKycCriteriaAffectedStatus(id=" + this.id + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.status);
    }
}
