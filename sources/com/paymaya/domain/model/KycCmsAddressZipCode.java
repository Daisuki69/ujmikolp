package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCmsAddressZipCode implements Parcelable {
    public static final Parcelable.Creator<KycCmsAddressZipCode> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    public static final class Creator implements Parcelable.Creator<KycCmsAddressZipCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressZipCode createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycCmsAddressZipCode(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressZipCode[] newArray(int i) {
            return new KycCmsAddressZipCode[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycCmsAddressZipCode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycCmsAddressZipCode copy$default(KycCmsAddressZipCode kycCmsAddressZipCode, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycCmsAddressZipCode.id;
        }
        if ((i & 2) != 0) {
            str = kycCmsAddressZipCode.code;
        }
        return kycCmsAddressZipCode.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final KycCmsAddressZipCode copy(Integer num, String str) {
        return new KycCmsAddressZipCode(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCmsAddressZipCode)) {
            return false;
        }
        KycCmsAddressZipCode kycCmsAddressZipCode = (KycCmsAddressZipCode) obj;
        return j.b(this.id, kycCmsAddressZipCode.id) && j.b(this.code, kycCmsAddressZipCode.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.code;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "KycCmsAddressZipCode(id=" + this.id + ", code=" + this.code + ")";
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
        dest.writeString(this.code);
    }

    public KycCmsAddressZipCode(Integer num, String str) {
        this.id = num;
        this.code = str;
    }

    public /* synthetic */ KycCmsAddressZipCode(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str);
    }
}
