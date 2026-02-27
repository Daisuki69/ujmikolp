package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureDynamicStatus implements Parcelable {
    public static final Parcelable.Creator<FeatureDynamicStatus> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.END)
    private final String endDate;

    @InterfaceC1497a
    @InterfaceC1498b("promo_display")
    private final String promoDisplayText;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.START)
    private final String startDate;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<FeatureDynamicStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureDynamicStatus createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new FeatureDynamicStatus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureDynamicStatus[] newArray(int i) {
            return new FeatureDynamicStatus[i];
        }
    }

    public FeatureDynamicStatus(String status, String str, String str2, String str3) {
        j.g(status, "status");
        this.status = status;
        this.promoDisplayText = str;
        this.startDate = str2;
        this.endDate = str3;
    }

    public static /* synthetic */ FeatureDynamicStatus copy$default(FeatureDynamicStatus featureDynamicStatus, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureDynamicStatus.status;
        }
        if ((i & 2) != 0) {
            str2 = featureDynamicStatus.promoDisplayText;
        }
        if ((i & 4) != 0) {
            str3 = featureDynamicStatus.startDate;
        }
        if ((i & 8) != 0) {
            str4 = featureDynamicStatus.endDate;
        }
        return featureDynamicStatus.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.promoDisplayText;
    }

    public final String component3() {
        return this.startDate;
    }

    public final String component4() {
        return this.endDate;
    }

    public final FeatureDynamicStatus copy(String status, String str, String str2, String str3) {
        j.g(status, "status");
        return new FeatureDynamicStatus(status, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureDynamicStatus)) {
            return false;
        }
        FeatureDynamicStatus featureDynamicStatus = (FeatureDynamicStatus) obj;
        return j.b(this.status, featureDynamicStatus.status) && j.b(this.promoDisplayText, featureDynamicStatus.promoDisplayText) && j.b(this.startDate, featureDynamicStatus.startDate) && j.b(this.endDate, featureDynamicStatus.endDate);
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getPromoDisplayText() {
        return this.promoDisplayText;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.promoDisplayText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endDate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.promoDisplayText;
        return a.p(s.x("FeatureDynamicStatus(status=", str, ", promoDisplayText=", str2, ", startDate="), this.startDate, ", endDate=", this.endDate, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.status);
        dest.writeString(this.promoDisplayText);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
    }

    public /* synthetic */ FeatureDynamicStatus(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
