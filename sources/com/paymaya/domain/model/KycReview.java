package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycReview implements Parcelable {
    public static final Parcelable.Creator<KycReview> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("customerServiceUrl")
    private final String customerServiceUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("info")
    private final String info;

    public static final class Creator implements Parcelable.Creator<KycReview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycReview createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycReview(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycReview[] newArray(int i) {
            return new KycReview[i];
        }
    }

    public KycReview() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycReview copy$default(KycReview kycReview, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycReview.id;
        }
        if ((i & 2) != 0) {
            str = kycReview.info;
        }
        if ((i & 4) != 0) {
            str2 = kycReview.customerServiceUrl;
        }
        return kycReview.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.info;
    }

    public final String component3() {
        return this.customerServiceUrl;
    }

    public final KycReview copy(Integer num, String str, String str2) {
        return new KycReview(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycReview)) {
            return false;
        }
        KycReview kycReview = (KycReview) obj;
        return j.b(this.id, kycReview.id) && j.b(this.info, kycReview.info) && j.b(this.customerServiceUrl, kycReview.customerServiceUrl);
    }

    public final String getCustomerServiceUrl() {
        return this.customerServiceUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.info;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerServiceUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.info;
        return s.p(AbstractC1213b.O(num, "KycReview(id=", ", info=", str, ", customerServiceUrl="), this.customerServiceUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.info);
        dest.writeString(this.customerServiceUrl);
    }

    public KycReview(Integer num, String str, String str2) {
        this.id = num;
        this.info = str;
        this.customerServiceUrl = str2;
    }

    public /* synthetic */ KycReview(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
