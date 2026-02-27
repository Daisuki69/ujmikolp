package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycVideoTip implements Parcelable {
    public static final Parcelable.Creator<KycVideoTip> CREATOR = new Creator();

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

    public static final class Creator implements Parcelable.Creator<KycVideoTip> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycVideoTip createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycVideoTip(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycVideoTip[] newArray(int i) {
            return new KycVideoTip[i];
        }
    }

    public KycVideoTip() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KycVideoTip copy$default(KycVideoTip kycVideoTip, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycVideoTip.id;
        }
        if ((i & 2) != 0) {
            str = kycVideoTip.key;
        }
        if ((i & 4) != 0) {
            str2 = kycVideoTip.description;
        }
        if ((i & 8) != 0) {
            str3 = kycVideoTip.iconUrl;
        }
        return kycVideoTip.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final KycVideoTip copy(Integer num, String str, String str2, String str3) {
        return new KycVideoTip(num, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycVideoTip)) {
            return false;
        }
        KycVideoTip kycVideoTip = (KycVideoTip) obj;
        return j.b(this.id, kycVideoTip.id) && j.b(this.key, kycVideoTip.key) && j.b(this.description, kycVideoTip.description) && j.b(this.iconUrl, kycVideoTip.iconUrl);
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

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.key;
        return a.p(AbstractC1213b.O(num, "KycVideoTip(id=", ", key=", str, ", description="), this.description, ", iconUrl=", this.iconUrl, ")");
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
        dest.writeString(this.key);
        dest.writeString(this.description);
        dest.writeString(this.iconUrl);
    }

    public KycVideoTip(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.key = str;
        this.description = str2;
        this.iconUrl = str3;
    }

    public /* synthetic */ KycVideoTip(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
