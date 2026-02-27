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
public final class KycIdGuide implements Parcelable {
    public static final Parcelable.Creator<KycIdGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("back")
    private final String back;

    @InterfaceC1497a
    @InterfaceC1498b("front")
    private final String front;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    public static final class Creator implements Parcelable.Creator<KycIdGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIdGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycIdGuide(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIdGuide[] newArray(int i) {
            return new KycIdGuide[i];
        }
    }

    public KycIdGuide() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycIdGuide copy$default(KycIdGuide kycIdGuide, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycIdGuide.id;
        }
        if ((i & 2) != 0) {
            str = kycIdGuide.front;
        }
        if ((i & 4) != 0) {
            str2 = kycIdGuide.back;
        }
        return kycIdGuide.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.front;
    }

    public final String component3() {
        return this.back;
    }

    public final KycIdGuide copy(Integer num, String str, String str2) {
        return new KycIdGuide(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycIdGuide)) {
            return false;
        }
        KycIdGuide kycIdGuide = (KycIdGuide) obj;
        return j.b(this.id, kycIdGuide.id) && j.b(this.front, kycIdGuide.front) && j.b(this.back, kycIdGuide.back);
    }

    public final String getBack() {
        return this.back;
    }

    public final String getFront() {
        return this.front;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.front;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.back;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.front;
        return s.p(AbstractC1213b.O(num, "KycIdGuide(id=", ", front=", str, ", back="), this.back, ")");
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
        dest.writeString(this.front);
        dest.writeString(this.back);
    }

    public KycIdGuide(Integer num, String str, String str2) {
        this.id = num;
        this.front = str;
        this.back = str2;
    }

    public /* synthetic */ KycIdGuide(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
