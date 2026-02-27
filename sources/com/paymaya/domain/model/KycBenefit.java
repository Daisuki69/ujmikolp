package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycBenefit implements Parcelable {
    public static final Parcelable.Creator<KycBenefit> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("iconUrl")
    private final String iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    @InterfaceC1497a
    @InterfaceC1498b("order")
    private final Integer order;

    public static final class Creator implements Parcelable.Creator<KycBenefit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycBenefit createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycBenefit(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycBenefit[] newArray(int i) {
            return new KycBenefit[i];
        }
    }

    public KycBenefit() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ KycBenefit copy$default(KycBenefit kycBenefit, Integer num, Integer num2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycBenefit.id;
        }
        if ((i & 2) != 0) {
            num2 = kycBenefit.order;
        }
        if ((i & 4) != 0) {
            str = kycBenefit.key;
        }
        if ((i & 8) != 0) {
            str2 = kycBenefit.description;
        }
        if ((i & 16) != 0) {
            str3 = kycBenefit.iconUrl;
        }
        String str4 = str3;
        String str5 = str;
        return kycBenefit.copy(num, num2, str5, str2, str4);
    }

    public final Integer component1() {
        return this.id;
    }

    public final Integer component2() {
        return this.order;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final KycBenefit copy(Integer num, Integer num2, String str, String str2, String str3) {
        return new KycBenefit(num, num2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycBenefit)) {
            return false;
        }
        KycBenefit kycBenefit = (KycBenefit) obj;
        return j.b(this.id, kycBenefit.id) && j.b(this.order, kycBenefit.order) && j.b(this.key, kycBenefit.key) && j.b(this.description, kycBenefit.description) && j.b(this.iconUrl, kycBenefit.iconUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.order;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.key;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.order;
        String str = this.key;
        String str2 = this.description;
        String str3 = this.iconUrl;
        StringBuilder sb2 = new StringBuilder("KycBenefit(id=");
        sb2.append(num);
        sb2.append(", order=");
        sb2.append(num2);
        sb2.append(", key=");
        c.A(sb2, str, ", description=", str2, ", iconUrl=");
        return s.p(sb2, str3, ")");
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
        Integer num2 = this.order;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        dest.writeString(this.key);
        dest.writeString(this.description);
        dest.writeString(this.iconUrl);
    }

    public KycBenefit(Integer num, Integer num2, String str, String str2, String str3) {
        this.id = num;
        this.order = num2;
        this.key = str;
        this.description = str2;
        this.iconUrl = str3;
    }

    public /* synthetic */ KycBenefit(Integer num, Integer num2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
