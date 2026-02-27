package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.c;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.Locale;
import kotlin.jvm.internal.j;
import org.joda.time.DateTime;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditTransactionItem implements Parcelable, Dated {
    public static final Parcelable.Creator<CreditTransactionItem> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("accountId")
    private final String accountId;

    @InterfaceC1497a
    @InterfaceC1498b("action")
    private final String action;

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("dateTime")
    private final String dateTime;

    @InterfaceC1497a
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    private final String target;

    @InterfaceC1497a
    @InterfaceC1498b("totalAmount")
    private final String totalAmount;

    @InterfaceC1497a
    @InterfaceC1498b("transactionId")
    private final String transactionId;

    @InterfaceC1497a
    @InterfaceC1498b("transactionReference")
    private final String transactionReference;

    @InterfaceC1497a
    @InterfaceC1498b("transactionType")
    private String transactionType;

    public static final class Creator implements Parcelable.Creator<CreditTransactionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTransactionItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditTransactionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTransactionItem[] newArray(int i) {
            return new CreditTransactionItem[i];
        }
    }

    public CreditTransactionItem(String str, String transactionId, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        j.g(transactionId, "transactionId");
        this.accountId = str;
        this.transactionId = transactionId;
        this.transactionReference = str2;
        this.totalAmount = str3;
        this.currency = str4;
        this.transactionType = str5;
        this.action = str6;
        this.target = str7;
        this.dateTime = str8;
    }

    public static /* synthetic */ CreditTransactionItem copy$default(CreditTransactionItem creditTransactionItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditTransactionItem.accountId;
        }
        if ((i & 2) != 0) {
            str2 = creditTransactionItem.transactionId;
        }
        if ((i & 4) != 0) {
            str3 = creditTransactionItem.transactionReference;
        }
        if ((i & 8) != 0) {
            str4 = creditTransactionItem.totalAmount;
        }
        if ((i & 16) != 0) {
            str5 = creditTransactionItem.currency;
        }
        if ((i & 32) != 0) {
            str6 = creditTransactionItem.transactionType;
        }
        if ((i & 64) != 0) {
            str7 = creditTransactionItem.action;
        }
        if ((i & 128) != 0) {
            str8 = creditTransactionItem.target;
        }
        if ((i & 256) != 0) {
            str9 = creditTransactionItem.dateTime;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return creditTransactionItem.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.transactionId;
    }

    public final String component3() {
        return this.transactionReference;
    }

    public final String component4() {
        return this.totalAmount;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.transactionType;
    }

    public final String component7() {
        return this.action;
    }

    public final String component8() {
        return this.target;
    }

    public final String component9() {
        return this.dateTime;
    }

    public final CreditTransactionItem copy(String str, String transactionId, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        j.g(transactionId, "transactionId");
        return new CreditTransactionItem(str, transactionId, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditTransactionItem)) {
            return false;
        }
        CreditTransactionItem creditTransactionItem = (CreditTransactionItem) obj;
        return j.b(this.accountId, creditTransactionItem.accountId) && j.b(this.transactionId, creditTransactionItem.transactionId) && j.b(this.transactionReference, creditTransactionItem.transactionReference) && j.b(this.totalAmount, creditTransactionItem.totalAmount) && j.b(this.currency, creditTransactionItem.currency) && j.b(this.transactionType, creditTransactionItem.transactionType) && j.b(this.action, creditTransactionItem.action) && j.b(this.target, creditTransactionItem.target) && j.b(this.dateTime, creditTransactionItem.dateTime);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getFormattedValue() {
        String str = this.totalAmount;
        if (str == null || C2576A.H(str)) {
            return "";
        }
        String strV = C.v(this.totalAmount);
        j.d(strV);
        return strV;
    }

    @Override // com.paymaya.domain.model.Dated
    public DateTime getLocalDateTime() {
        return AbstractC1234x.b(this.dateTime);
    }

    public final String getLocalDateTimeDisplaySimpleDate() {
        DateTime localDateTime = getLocalDateTime();
        if (AbstractC1234x.n(localDateTime)) {
            String strG = AbstractC1234x.g(localDateTime);
            j.d(strG);
            return strG;
        }
        String strPrint = AbstractC1234x.c.withLocale(AbstractC1234x.l()).print(localDateTime);
        j.d(strPrint);
        return strPrint;
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDateHeader(Locale locale) {
        DateTime localDateTime = getLocalDateTime();
        if (AbstractC1234x.n(localDateTime)) {
            String str = AbstractC1234x.f11265y;
            j.d(str);
            return str;
        }
        String strPrint = AbstractC1234x.f11248a.withLocale(AbstractC1234x.l()).print(localDateTime);
        j.d(strPrint);
        return strPrint;
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDisplay(Locale locale) {
        DateTime localDateTime = getLocalDateTime();
        if (AbstractC1234x.n(localDateTime)) {
            String strG = AbstractC1234x.g(localDateTime);
            j.d(strG);
            return strG;
        }
        String strReplace = AbstractC1234x.f11251g.withLocale(AbstractC1234x.l()).print(localDateTime).replace("am", "AM").replace("pm", "PM");
        j.d(strReplace);
        return strReplace;
    }

    @Override // com.paymaya.domain.model.Dated
    public String getMayaLocalDateTimeForDateHeader(Locale locale, boolean z4) {
        DateTime localDateTime = getLocalDateTime();
        if (AbstractC1234x.n(localDateTime)) {
            String str = AbstractC1234x.f11265y;
            j.d(str);
            return str;
        }
        String strH = AbstractC1234x.h(localDateTime);
        j.d(strH);
        return strH;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTransactionReference() {
        return this.transactionReference;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        String str = this.accountId;
        int iC = AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.transactionId);
        String str2 = this.transactionReference;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalAmount;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionType;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.target;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dateTime;
        return iHashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setTransactionType(String str) {
        this.transactionType = str;
    }

    public String toString() {
        String str = this.accountId;
        String str2 = this.transactionId;
        String str3 = this.transactionReference;
        String str4 = this.totalAmount;
        String str5 = this.currency;
        String str6 = this.transactionType;
        String str7 = this.action;
        String str8 = this.target;
        String str9 = this.dateTime;
        StringBuilder sbX = s.x("CreditTransactionItem(accountId=", str, ", transactionId=", str2, ", transactionReference=");
        c.A(sbX, str3, ", totalAmount=", str4, ", currency=");
        c.A(sbX, str5, ", transactionType=", str6, ", action=");
        c.A(sbX, str7, ", target=", str8, ", dateTime=");
        return s.p(sbX, str9, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.accountId);
        dest.writeString(this.transactionId);
        dest.writeString(this.transactionReference);
        dest.writeString(this.totalAmount);
        dest.writeString(this.currency);
        dest.writeString(this.transactionType);
        dest.writeString(this.action);
        dest.writeString(this.target);
        dest.writeString(this.dateTime);
    }
}
