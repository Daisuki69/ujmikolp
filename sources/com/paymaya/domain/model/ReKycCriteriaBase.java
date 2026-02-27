package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaBase implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaBase> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final ReKycCriteriaData data;

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final ReKycCriteriaMeta meta;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaBase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaBase createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaBase(ReKycCriteriaData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReKycCriteriaMeta.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaBase[] newArray(int i) {
            return new ReKycCriteriaBase[i];
        }
    }

    public ReKycCriteriaBase(ReKycCriteriaData data, ReKycCriteriaMeta reKycCriteriaMeta) {
        j.g(data, "data");
        this.data = data;
        this.meta = reKycCriteriaMeta;
    }

    public static /* synthetic */ ReKycCriteriaBase copy$default(ReKycCriteriaBase reKycCriteriaBase, ReKycCriteriaData reKycCriteriaData, ReKycCriteriaMeta reKycCriteriaMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            reKycCriteriaData = reKycCriteriaBase.data;
        }
        if ((i & 2) != 0) {
            reKycCriteriaMeta = reKycCriteriaBase.meta;
        }
        return reKycCriteriaBase.copy(reKycCriteriaData, reKycCriteriaMeta);
    }

    public final ReKycCriteriaData component1() {
        return this.data;
    }

    public final ReKycCriteriaMeta component2() {
        return this.meta;
    }

    public final ReKycCriteriaBase copy(ReKycCriteriaData data, ReKycCriteriaMeta reKycCriteriaMeta) {
        j.g(data, "data");
        return new ReKycCriteriaBase(data, reKycCriteriaMeta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaBase)) {
            return false;
        }
        ReKycCriteriaBase reKycCriteriaBase = (ReKycCriteriaBase) obj;
        return j.b(this.data, reKycCriteriaBase.data) && j.b(this.meta, reKycCriteriaBase.meta);
    }

    public final ReKycCriteriaData getData() {
        return this.data;
    }

    public final ReKycCriteriaMeta getMeta() {
        return this.meta;
    }

    public final List<ReKycCriteriaPromptGuide> getPromptGuides() {
        return this.data.getPromptGuides();
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        ReKycCriteriaMeta reKycCriteriaMeta = this.meta;
        return iHashCode + (reKycCriteriaMeta == null ? 0 : reKycCriteriaMeta.hashCode());
    }

    public String toString() {
        return "ReKycCriteriaBase(data=" + this.data + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.data.writeToParcel(dest, i);
        ReKycCriteriaMeta reKycCriteriaMeta = this.meta;
        if (reKycCriteriaMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reKycCriteriaMeta.writeToParcel(dest, i);
        }
    }
}
