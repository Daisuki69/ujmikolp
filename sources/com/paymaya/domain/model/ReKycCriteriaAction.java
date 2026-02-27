package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaAction implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaAction> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAction createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaAction(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaAction[] newArray(int i) {
            return new ReKycCriteriaAction[i];
        }
    }

    public ReKycCriteriaAction(int i, String code) {
        j.g(code, "code");
        this.id = i;
        this.code = code;
    }

    public static /* synthetic */ ReKycCriteriaAction copy$default(ReKycCriteriaAction reKycCriteriaAction, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteriaAction.id;
        }
        if ((i4 & 2) != 0) {
            str = reKycCriteriaAction.code;
        }
        return reKycCriteriaAction.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final ReKycCriteriaAction copy(int i, String code) {
        j.g(code, "code");
        return new ReKycCriteriaAction(i, code);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaAction)) {
            return false;
        }
        ReKycCriteriaAction reKycCriteriaAction = (ReKycCriteriaAction) obj;
        return this.id == reKycCriteriaAction.id && j.b(this.code, reKycCriteriaAction.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.code.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "ReKycCriteriaAction(id=" + this.id + ", code=" + this.code + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.code);
    }
}
