package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCountry implements Parcelable {
    public static final Parcelable.Creator<KycCountry> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<KycCountry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCountry createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycCountry(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCountry[] newArray(int i) {
            return new KycCountry[i];
        }
    }

    public KycCountry() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycCountry copy$default(KycCountry kycCountry, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycCountry.id;
        }
        if ((i & 2) != 0) {
            str = kycCountry.name;
        }
        if ((i & 4) != 0) {
            str2 = kycCountry.code;
        }
        return kycCountry.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.code;
    }

    public final KycCountry copy(Integer num, String str, String str2) {
        return new KycCountry(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCountry)) {
            return false;
        }
        KycCountry kycCountry = (KycCountry) obj;
        return j.b(this.id, kycCountry.id) && j.b(this.name, kycCountry.name) && j.b(this.code, kycCountry.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        return s.p(AbstractC1213b.O(num, "KycCountry(id=", ", name=", str, ", code="), this.code, ")");
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
        dest.writeString(this.name);
        dest.writeString(this.code);
    }

    public KycCountry(Integer num, String str, String str2) {
        this.id = num;
        this.name = str;
        this.code = str2;
    }

    public /* synthetic */ KycCountry(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
