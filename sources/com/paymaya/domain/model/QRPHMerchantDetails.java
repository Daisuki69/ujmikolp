package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHMerchantDetails implements Parcelable {
    public static final Parcelable.Creator<QRPHMerchantDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("acquirer_id")
    private final String acquirerId;

    @InterfaceC1497a
    @InterfaceC1498b("additional_info")
    private final QRPHMerchantAdditionalInfo additionalInfo;

    @InterfaceC1497a
    @InterfaceC1498b("category_code")
    private final String categoryCode;

    @InterfaceC1497a
    @InterfaceC1498b("city")
    private final String city;

    @InterfaceC1497a
    @InterfaceC1498b("claim_id")
    private final String claimId;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("store_name")
    private final String storeName;

    @InterfaceC1497a
    @InterfaceC1498b("terminal_id")
    private final String terminalId;

    public static final class Creator implements Parcelable.Creator<QRPHMerchantDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new QRPHMerchantDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : QRPHMerchantAdditionalInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantDetails[] newArray(int i) {
            return new QRPHMerchantDetails[i];
        }
    }

    public QRPHMerchantDetails(String str, String name, String str2, String str3, String str4, String str5, String str6, String str7, QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo) {
        j.g(name, "name");
        this.id = str;
        this.name = name;
        this.city = str2;
        this.claimId = str3;
        this.terminalId = str4;
        this.acquirerId = str5;
        this.storeName = str6;
        this.categoryCode = str7;
        this.additionalInfo = qRPHMerchantAdditionalInfo;
    }

    public static /* synthetic */ QRPHMerchantDetails copy$default(QRPHMerchantDetails qRPHMerchantDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRPHMerchantDetails.id;
        }
        if ((i & 2) != 0) {
            str2 = qRPHMerchantDetails.name;
        }
        if ((i & 4) != 0) {
            str3 = qRPHMerchantDetails.city;
        }
        if ((i & 8) != 0) {
            str4 = qRPHMerchantDetails.claimId;
        }
        if ((i & 16) != 0) {
            str5 = qRPHMerchantDetails.terminalId;
        }
        if ((i & 32) != 0) {
            str6 = qRPHMerchantDetails.acquirerId;
        }
        if ((i & 64) != 0) {
            str7 = qRPHMerchantDetails.storeName;
        }
        if ((i & 128) != 0) {
            str8 = qRPHMerchantDetails.categoryCode;
        }
        if ((i & 256) != 0) {
            qRPHMerchantAdditionalInfo = qRPHMerchantDetails.additionalInfo;
        }
        String str9 = str8;
        QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo2 = qRPHMerchantAdditionalInfo;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return qRPHMerchantDetails.copy(str, str2, str13, str4, str12, str10, str11, str9, qRPHMerchantAdditionalInfo2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.claimId;
    }

    public final String component5() {
        return this.terminalId;
    }

    public final String component6() {
        return this.acquirerId;
    }

    public final String component7() {
        return this.storeName;
    }

    public final String component8() {
        return this.categoryCode;
    }

    public final QRPHMerchantAdditionalInfo component9() {
        return this.additionalInfo;
    }

    public final QRPHMerchantDetails copy(String str, String name, String str2, String str3, String str4, String str5, String str6, String str7, QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo) {
        j.g(name, "name");
        return new QRPHMerchantDetails(str, name, str2, str3, str4, str5, str6, str7, qRPHMerchantAdditionalInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHMerchantDetails)) {
            return false;
        }
        QRPHMerchantDetails qRPHMerchantDetails = (QRPHMerchantDetails) obj;
        return j.b(this.id, qRPHMerchantDetails.id) && j.b(this.name, qRPHMerchantDetails.name) && j.b(this.city, qRPHMerchantDetails.city) && j.b(this.claimId, qRPHMerchantDetails.claimId) && j.b(this.terminalId, qRPHMerchantDetails.terminalId) && j.b(this.acquirerId, qRPHMerchantDetails.acquirerId) && j.b(this.storeName, qRPHMerchantDetails.storeName) && j.b(this.categoryCode, qRPHMerchantDetails.categoryCode) && j.b(this.additionalInfo, qRPHMerchantDetails.additionalInfo);
    }

    public final String getAcquirerId() {
        return this.acquirerId;
    }

    public final QRPHMerchantAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final String getCategoryCode() {
        return this.categoryCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getClaimId() {
        return this.claimId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final String getTerminalId() {
        return this.terminalId;
    }

    public int hashCode() {
        String str = this.id;
        int iC = AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.city;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.claimId;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.terminalId;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.acquirerId;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeName;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.categoryCode;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo = this.additionalInfo;
        return iHashCode6 + (qRPHMerchantAdditionalInfo != null ? qRPHMerchantAdditionalInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.city;
        String str4 = this.claimId;
        String str5 = this.terminalId;
        String str6 = this.acquirerId;
        String str7 = this.storeName;
        String str8 = this.categoryCode;
        QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo = this.additionalInfo;
        StringBuilder sbX = s.x("QRPHMerchantDetails(id=", str, ", name=", str2, ", city=");
        c.A(sbX, str3, ", claimId=", str4, ", terminalId=");
        c.A(sbX, str5, ", acquirerId=", str6, ", storeName=");
        c.A(sbX, str7, ", categoryCode=", str8, ", additionalInfo=");
        sbX.append(qRPHMerchantAdditionalInfo);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.city);
        dest.writeString(this.claimId);
        dest.writeString(this.terminalId);
        dest.writeString(this.acquirerId);
        dest.writeString(this.storeName);
        dest.writeString(this.categoryCode);
        QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo = this.additionalInfo;
        if (qRPHMerchantAdditionalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qRPHMerchantAdditionalInfo.writeToParcel(dest, i);
        }
    }
}
