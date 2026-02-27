package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteria implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteria> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("affected_reasons")
    private final List<ReKycCriteriaAffectedReason> affectedReasons;

    @InterfaceC1497a
    @InterfaceC1498b("affected_statuses")
    private final List<ReKycCriteriaAffectedStatus> affectedStatuses;

    @InterfaceC1497a
    @InterfaceC1498b("after_tagged_days")
    private final Integer afterTaggedDays;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    public static final class Creator implements Parcelable.Creator<ReKycCriteria> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteria createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            int I9 = 0;
            while (I9 != i4) {
                I9 = AbstractC1213b.I(ReKycCriteriaAffectedReason.CREATOR, parcel, arrayList, I9, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            while (I4 != i6) {
                I4 = AbstractC1213b.I(ReKycCriteriaAffectedStatus.CREATOR, parcel, arrayList2, I4, 1);
            }
            return new ReKycCriteria(i, numValueOf, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteria[] newArray(int i) {
            return new ReKycCriteria[i];
        }
    }

    public ReKycCriteria(int i, Integer num, List<ReKycCriteriaAffectedReason> affectedReasons, List<ReKycCriteriaAffectedStatus> affectedStatuses) {
        j.g(affectedReasons, "affectedReasons");
        j.g(affectedStatuses, "affectedStatuses");
        this.id = i;
        this.afterTaggedDays = num;
        this.affectedReasons = affectedReasons;
        this.affectedStatuses = affectedStatuses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReKycCriteria copy$default(ReKycCriteria reKycCriteria, int i, Integer num, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteria.id;
        }
        if ((i4 & 2) != 0) {
            num = reKycCriteria.afterTaggedDays;
        }
        if ((i4 & 4) != 0) {
            list = reKycCriteria.affectedReasons;
        }
        if ((i4 & 8) != 0) {
            list2 = reKycCriteria.affectedStatuses;
        }
        return reKycCriteria.copy(i, num, list, list2);
    }

    public final int component1() {
        return this.id;
    }

    public final Integer component2() {
        return this.afterTaggedDays;
    }

    public final List<ReKycCriteriaAffectedReason> component3() {
        return this.affectedReasons;
    }

    public final List<ReKycCriteriaAffectedStatus> component4() {
        return this.affectedStatuses;
    }

    public final ReKycCriteria copy(int i, Integer num, List<ReKycCriteriaAffectedReason> affectedReasons, List<ReKycCriteriaAffectedStatus> affectedStatuses) {
        j.g(affectedReasons, "affectedReasons");
        j.g(affectedStatuses, "affectedStatuses");
        return new ReKycCriteria(i, num, affectedReasons, affectedStatuses);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteria)) {
            return false;
        }
        ReKycCriteria reKycCriteria = (ReKycCriteria) obj;
        return this.id == reKycCriteria.id && j.b(this.afterTaggedDays, reKycCriteria.afterTaggedDays) && j.b(this.affectedReasons, reKycCriteria.affectedReasons) && j.b(this.affectedStatuses, reKycCriteria.affectedStatuses);
    }

    public final List<ReKycCriteriaAffectedReason> getAffectedReasons() {
        return this.affectedReasons;
    }

    public final List<ReKycCriteriaAffectedStatus> getAffectedStatuses() {
        return this.affectedStatuses;
    }

    public final Integer getAfterTaggedDays() {
        return this.afterTaggedDays;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        int i = this.id * 31;
        Integer num = this.afterTaggedDays;
        return this.affectedStatuses.hashCode() + AbstractC1414e.d(this.affectedReasons, (i + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public String toString() {
        return "ReKycCriteria(id=" + this.id + ", afterTaggedDays=" + this.afterTaggedDays + ", affectedReasons=" + this.affectedReasons + ", affectedStatuses=" + this.affectedStatuses + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        Integer num = this.afterTaggedDays;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        Iterator itQ = AbstractC1213b.Q(this.affectedReasons, dest);
        while (itQ.hasNext()) {
            ((ReKycCriteriaAffectedReason) itQ.next()).writeToParcel(dest, i);
        }
        Iterator itQ2 = AbstractC1213b.Q(this.affectedStatuses, dest);
        while (itQ2.hasNext()) {
            ((ReKycCriteriaAffectedStatus) itQ2.next()).writeToParcel(dest, i);
        }
    }
}
