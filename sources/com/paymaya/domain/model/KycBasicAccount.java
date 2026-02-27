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
public final class KycBasicAccount implements Parcelable {
    public static final Parcelable.Creator<KycBasicAccount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("iconUrl")
    private final String iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("info")
    private final String info;

    public static final class Creator implements Parcelable.Creator<KycBasicAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycBasicAccount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycBasicAccount(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycBasicAccount[] newArray(int i) {
            return new KycBasicAccount[i];
        }
    }

    public KycBasicAccount() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycBasicAccount copy$default(KycBasicAccount kycBasicAccount, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycBasicAccount.id;
        }
        if ((i & 2) != 0) {
            str = kycBasicAccount.info;
        }
        if ((i & 4) != 0) {
            str2 = kycBasicAccount.iconUrl;
        }
        return kycBasicAccount.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.info;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final KycBasicAccount copy(Integer num, String str, String str2) {
        return new KycBasicAccount(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycBasicAccount)) {
            return false;
        }
        KycBasicAccount kycBasicAccount = (KycBasicAccount) obj;
        return j.b(this.id, kycBasicAccount.id) && j.b(this.info, kycBasicAccount.info) && j.b(this.iconUrl, kycBasicAccount.iconUrl);
    }

    public final String getIconUrl() {
        return this.iconUrl;
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
        String str2 = this.iconUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.info;
        return s.p(AbstractC1213b.O(num, "KycBasicAccount(id=", ", info=", str, ", iconUrl="), this.iconUrl, ")");
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
        dest.writeString(this.iconUrl);
    }

    public KycBasicAccount(Integer num, String str, String str2) {
        this.id = num;
        this.info = str;
        this.iconUrl = str2;
    }

    public /* synthetic */ KycBasicAccount(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
