package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaPromptGuide implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaPromptGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("action")
    private final ReKycCriteriaAction action;

    @InterfaceC1497a
    @InterfaceC1498b("criteria")
    private final ReKycCriteria criteria;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaPromptGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaPromptGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaPromptGuide(parcel.readInt(), ReKycCriteriaAction.CREATOR.createFromParcel(parcel), ReKycCriteria.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaPromptGuide[] newArray(int i) {
            return new ReKycCriteriaPromptGuide[i];
        }
    }

    public ReKycCriteriaPromptGuide(int i, ReKycCriteriaAction action, ReKycCriteria criteria) {
        j.g(action, "action");
        j.g(criteria, "criteria");
        this.id = i;
        this.action = action;
        this.criteria = criteria;
    }

    public static /* synthetic */ ReKycCriteriaPromptGuide copy$default(ReKycCriteriaPromptGuide reKycCriteriaPromptGuide, int i, ReKycCriteriaAction reKycCriteriaAction, ReKycCriteria reKycCriteria, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteriaPromptGuide.id;
        }
        if ((i4 & 2) != 0) {
            reKycCriteriaAction = reKycCriteriaPromptGuide.action;
        }
        if ((i4 & 4) != 0) {
            reKycCriteria = reKycCriteriaPromptGuide.criteria;
        }
        return reKycCriteriaPromptGuide.copy(i, reKycCriteriaAction, reKycCriteria);
    }

    public final int component1() {
        return this.id;
    }

    public final ReKycCriteriaAction component2() {
        return this.action;
    }

    public final ReKycCriteria component3() {
        return this.criteria;
    }

    public final ReKycCriteriaPromptGuide copy(int i, ReKycCriteriaAction action, ReKycCriteria criteria) {
        j.g(action, "action");
        j.g(criteria, "criteria");
        return new ReKycCriteriaPromptGuide(i, action, criteria);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaPromptGuide)) {
            return false;
        }
        ReKycCriteriaPromptGuide reKycCriteriaPromptGuide = (ReKycCriteriaPromptGuide) obj;
        return this.id == reKycCriteriaPromptGuide.id && j.b(this.action, reKycCriteriaPromptGuide.action) && j.b(this.criteria, reKycCriteriaPromptGuide.criteria);
    }

    public final ReKycCriteriaAction getAction() {
        return this.action;
    }

    public final ReKycCriteria getCriteria() {
        return this.criteria;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.criteria.hashCode() + ((this.action.hashCode() + (this.id * 31)) * 31);
    }

    public final boolean matchesReason(String reason) {
        j.g(reason, "reason");
        if (this.criteria.getAffectedReasons().isEmpty()) {
            return true;
        }
        List<ReKycCriteriaAffectedReason> affectedReasons = this.criteria.getAffectedReasons();
        if ((affectedReasons instanceof Collection) && affectedReasons.isEmpty()) {
            return false;
        }
        Iterator<T> it = affectedReasons.iterator();
        while (it.hasNext()) {
            if (j.b(((ReKycCriteriaAffectedReason) it.next()).getReason(), reason)) {
                return true;
            }
        }
        return false;
    }

    public final boolean matchesStatus(String status) {
        j.g(status, "status");
        if (this.criteria.getAffectedStatuses().isEmpty()) {
            return true;
        }
        List<ReKycCriteriaAffectedStatus> affectedStatuses = this.criteria.getAffectedStatuses();
        if ((affectedStatuses instanceof Collection) && affectedStatuses.isEmpty()) {
            return false;
        }
        Iterator<T> it = affectedStatuses.iterator();
        while (it.hasNext()) {
            if (j.b(((ReKycCriteriaAffectedStatus) it.next()).getStatus(), status)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "ReKycCriteriaPromptGuide(id=" + this.id + ", action=" + this.action + ", criteria=" + this.criteria + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        this.action.writeToParcel(dest, i);
        this.criteria.writeToParcel(dest, i);
    }
}
