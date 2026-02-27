package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaAffectedReason implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaAffectedReason> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.REASON)
    private final String reason;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaAffectedReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAffectedReason createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaAffectedReason(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAffectedReason[] newArray(int i) {
            return new ReKycCriteriaAffectedReason[i];
        }
    }

    public ReKycCriteriaAffectedReason(int i, String reason) {
        j.g(reason, "reason");
        this.id = i;
        this.reason = reason;
    }

    public static /* synthetic */ ReKycCriteriaAffectedReason copy$default(ReKycCriteriaAffectedReason reKycCriteriaAffectedReason, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteriaAffectedReason.id;
        }
        if ((i4 & 2) != 0) {
            str = reKycCriteriaAffectedReason.reason;
        }
        return reKycCriteriaAffectedReason.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.reason;
    }

    public final ReKycCriteriaAffectedReason copy(int i, String reason) {
        j.g(reason, "reason");
        return new ReKycCriteriaAffectedReason(i, reason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaAffectedReason)) {
            return false;
        }
        ReKycCriteriaAffectedReason reKycCriteriaAffectedReason = (ReKycCriteriaAffectedReason) obj;
        return this.id == reKycCriteriaAffectedReason.id && j.b(this.reason, reKycCriteriaAffectedReason.reason);
    }

    public final int getId() {
        return this.id;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "ReKycCriteriaAffectedReason(id=" + this.id + ", reason=" + this.reason + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.reason);
    }
}
