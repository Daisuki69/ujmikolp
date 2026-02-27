package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycNudgeInfoContent implements Parcelable {
    public static final Parcelable.Creator<ReKycNudgeInfoContent> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("nudge_info_icon")
    private final String icon;

    @InterfaceC1497a
    @InterfaceC1498b("nudge_info_label")
    private final String label;

    public static final class Creator implements Parcelable.Creator<ReKycNudgeInfoContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycNudgeInfoContent createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycNudgeInfoContent(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycNudgeInfoContent[] newArray(int i) {
            return new ReKycNudgeInfoContent[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReKycNudgeInfoContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReKycNudgeInfoContent copy$default(ReKycNudgeInfoContent reKycNudgeInfoContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reKycNudgeInfoContent.icon;
        }
        if ((i & 2) != 0) {
            str2 = reKycNudgeInfoContent.label;
        }
        return reKycNudgeInfoContent.copy(str, str2);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.label;
    }

    public final ReKycNudgeInfoContent copy(String str, String str2) {
        return new ReKycNudgeInfoContent(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycNudgeInfoContent)) {
            return false;
        }
        ReKycNudgeInfoContent reKycNudgeInfoContent = (ReKycNudgeInfoContent) obj;
        return j.b(this.icon, reKycNudgeInfoContent.icon) && j.b(this.label, reKycNudgeInfoContent.label);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("ReKycNudgeInfoContent(icon=", this.icon, ", label=", this.label, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.icon);
        dest.writeString(this.label);
    }

    public ReKycNudgeInfoContent(String str, String str2) {
        this.icon = str;
        this.label = str2;
    }

    public /* synthetic */ ReKycNudgeInfoContent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
