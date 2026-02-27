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
public final class KycRule implements Parcelable {
    public static final Parcelable.Creator<KycRule> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<KycRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRule createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycRule(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycRule[] newArray(int i) {
            return new KycRule[i];
        }
    }

    public KycRule() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycRule copy$default(KycRule kycRule, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycRule.id;
        }
        if ((i & 2) != 0) {
            str = kycRule.header;
        }
        if ((i & 4) != 0) {
            str2 = kycRule.value;
        }
        return kycRule.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.value;
    }

    public final KycRule copy(Integer num, String str, String str2) {
        return new KycRule(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycRule)) {
            return false;
        }
        KycRule kycRule = (KycRule) obj;
        return j.b(this.id, kycRule.id) && j.b(this.header, kycRule.header) && j.b(this.value, kycRule.value);
    }

    public final String getHeader() {
        return this.header;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.header;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.header;
        return s.p(AbstractC1213b.O(num, "KycRule(id=", ", header=", str, ", value="), this.value, ")");
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
        dest.writeString(this.header);
        dest.writeString(this.value);
    }

    public KycRule(Integer num, String str, String str2) {
        this.id = num;
        this.header = str;
        this.value = str2;
    }

    public /* synthetic */ KycRule(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
