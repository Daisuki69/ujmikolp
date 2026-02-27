package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BankTransferV3Recipient implements Parcelable {
    public static final Parcelable.Creator<BankTransferV3Recipient> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("account")
    private final String account;

    @InterfaceC1497a
    @InterfaceC1498b("account_name")
    private final String accountName;
    private String bankCode;
    private String bankName;

    @InterfaceC1497a
    @InterfaceC1498b("institution_code")
    private final String institutionCode;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private String type;

    public static final class Creator implements Parcelable.Creator<BankTransferV3Recipient> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3Recipient createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BankTransferV3Recipient(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3Recipient[] newArray(int i) {
            return new BankTransferV3Recipient[i];
        }
    }

    public BankTransferV3Recipient(String str, String str2, String str3, String str4, String str5, String str6) {
        this.account = str;
        this.accountName = str2;
        this.institutionCode = str3;
        this.type = str4;
        this.bankName = str5;
        this.bankCode = str6;
    }

    public static /* synthetic */ BankTransferV3Recipient copy$default(BankTransferV3Recipient bankTransferV3Recipient, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankTransferV3Recipient.account;
        }
        if ((i & 2) != 0) {
            str2 = bankTransferV3Recipient.accountName;
        }
        if ((i & 4) != 0) {
            str3 = bankTransferV3Recipient.institutionCode;
        }
        if ((i & 8) != 0) {
            str4 = bankTransferV3Recipient.type;
        }
        if ((i & 16) != 0) {
            str5 = bankTransferV3Recipient.bankName;
        }
        if ((i & 32) != 0) {
            str6 = bankTransferV3Recipient.bankCode;
        }
        String str7 = str5;
        String str8 = str6;
        return bankTransferV3Recipient.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.account;
    }

    public final String component2() {
        return this.accountName;
    }

    public final String component3() {
        return this.institutionCode;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.bankName;
    }

    public final String component6() {
        return this.bankCode;
    }

    public final BankTransferV3Recipient copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new BankTransferV3Recipient(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankTransferV3Recipient)) {
            return false;
        }
        BankTransferV3Recipient bankTransferV3Recipient = (BankTransferV3Recipient) obj;
        return j.b(this.account, bankTransferV3Recipient.account) && j.b(this.accountName, bankTransferV3Recipient.accountName) && j.b(this.institutionCode, bankTransferV3Recipient.institutionCode) && j.b(this.type, bankTransferV3Recipient.type) && j.b(this.bankName, bankTransferV3Recipient.bankName) && j.b(this.bankCode, bankTransferV3Recipient.bankCode);
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getInstitutionCode() {
        return this.institutionCode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.account;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.institutionCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankCode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBankCode(String str) {
        this.bankCode = str;
    }

    public final void setBankName(String str) {
        this.bankName = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        String str = this.account;
        String str2 = this.accountName;
        String str3 = this.institutionCode;
        String str4 = this.type;
        String str5 = this.bankName;
        String str6 = this.bankCode;
        StringBuilder sbX = s.x("BankTransferV3Recipient(account=", str, ", accountName=", str2, ", institutionCode=");
        c.A(sbX, str3, ", type=", str4, ", bankName=");
        return a.p(sbX, str5, ", bankCode=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.account);
        dest.writeString(this.accountName);
        dest.writeString(this.institutionCode);
        dest.writeString(this.type);
        dest.writeString(this.bankName);
        dest.writeString(this.bankCode);
    }

    public /* synthetic */ BankTransferV3Recipient(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
