package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditTerm implements Parcelable {
    public static final Parcelable.Creator<CreditTerm> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("agreements")
    private final List<CreditAgreement> agreements;

    @InterfaceC1497a
    @InterfaceC1498b("schedule_settings")
    private final CreditTermScheduleSettings creditTermScheduleSettings;

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("expires_on")
    private final String expiresOn;

    @InterfaceC1497a
    @InterfaceC1498b("fee_rate")
    private final double feeRate;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("interest_rate")
    private final double interestRate;

    @InterfaceC1497a
    @InterfaceC1498b("loan_amount")
    private final double loanAmount;

    public static final class Creator implements Parcelable.Creator<CreditTerm> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTerm createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d10 = parcel.readDouble();
            String string3 = parcel.readString();
            double d11 = parcel.readDouble();
            double d12 = parcel.readDouble();
            ArrayList arrayList = null;
            CreditTermScheduleSettings creditTermScheduleSettingsCreateFromParcel = parcel.readInt() == 0 ? null : CreditTermScheduleSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(CreditAgreement.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new CreditTerm(string, string2, d10, string3, d11, d12, creditTermScheduleSettingsCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTerm[] newArray(int i) {
            return new CreditTerm[i];
        }
    }

    public CreditTerm(String str, String str2, double d10, String str3, double d11, double d12, CreditTermScheduleSettings creditTermScheduleSettings, List<CreditAgreement> list) {
        this.id = str;
        this.expiresOn = str2;
        this.loanAmount = d10;
        this.currency = str3;
        this.feeRate = d11;
        this.interestRate = d12;
        this.creditTermScheduleSettings = creditTermScheduleSettings;
        this.agreements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditTerm copy$default(CreditTerm creditTerm, String str, String str2, double d10, String str3, double d11, double d12, CreditTermScheduleSettings creditTermScheduleSettings, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditTerm.id;
        }
        if ((i & 2) != 0) {
            str2 = creditTerm.expiresOn;
        }
        if ((i & 4) != 0) {
            d10 = creditTerm.loanAmount;
        }
        if ((i & 8) != 0) {
            str3 = creditTerm.currency;
        }
        if ((i & 16) != 0) {
            d11 = creditTerm.feeRate;
        }
        if ((i & 32) != 0) {
            d12 = creditTerm.interestRate;
        }
        if ((i & 64) != 0) {
            creditTermScheduleSettings = creditTerm.creditTermScheduleSettings;
        }
        if ((i & 128) != 0) {
            list = creditTerm.agreements;
        }
        double d13 = d12;
        String str4 = str3;
        double d14 = d10;
        return creditTerm.copy(str, str2, d14, str4, d11, d13, creditTermScheduleSettings, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.expiresOn;
    }

    public final double component3() {
        return this.loanAmount;
    }

    public final String component4() {
        return this.currency;
    }

    public final double component5() {
        return this.feeRate;
    }

    public final double component6() {
        return this.interestRate;
    }

    public final CreditTermScheduleSettings component7() {
        return this.creditTermScheduleSettings;
    }

    public final List<CreditAgreement> component8() {
        return this.agreements;
    }

    public final CreditTerm copy(String str, String str2, double d10, String str3, double d11, double d12, CreditTermScheduleSettings creditTermScheduleSettings, List<CreditAgreement> list) {
        return new CreditTerm(str, str2, d10, str3, d11, d12, creditTermScheduleSettings, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditTerm)) {
            return false;
        }
        CreditTerm creditTerm = (CreditTerm) obj;
        return j.b(this.id, creditTerm.id) && j.b(this.expiresOn, creditTerm.expiresOn) && Double.compare(this.loanAmount, creditTerm.loanAmount) == 0 && j.b(this.currency, creditTerm.currency) && Double.compare(this.feeRate, creditTerm.feeRate) == 0 && Double.compare(this.interestRate, creditTerm.interestRate) == 0 && j.b(this.creditTermScheduleSettings, creditTerm.creditTermScheduleSettings) && j.b(this.agreements, creditTerm.agreements);
    }

    public final List<CreditAgreement> getAgreements() {
        return this.agreements;
    }

    public final CreditTermScheduleSettings getCreditTermScheduleSettings() {
        return this.creditTermScheduleSettings;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getEffectiveInterestRate() {
        return this.interestRate * ((double) 100);
    }

    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final double getFeeRate() {
        return this.feeRate;
    }

    public final String getFormattedLoanAmountValue() {
        return C.u(Double.valueOf(this.loanAmount));
    }

    public final String getId() {
        return this.id;
    }

    public final double getInterestRate() {
        return this.interestRate;
    }

    public final double getLoanAmount() {
        return this.loanAmount;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiresOn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.loanAmount);
        int i = (iHashCode2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str3 = this.currency;
        int iHashCode3 = (i + (str3 == null ? 0 : str3.hashCode())) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.feeRate);
        int i4 = (iHashCode3 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.interestRate);
        int i6 = (i4 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        CreditTermScheduleSettings creditTermScheduleSettings = this.creditTermScheduleSettings;
        int iHashCode4 = (i6 + (creditTermScheduleSettings == null ? 0 : creditTermScheduleSettings.hashCode())) * 31;
        List<CreditAgreement> list = this.agreements;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.expiresOn;
        double d10 = this.loanAmount;
        String str3 = this.currency;
        double d11 = this.feeRate;
        double d12 = this.interestRate;
        CreditTermScheduleSettings creditTermScheduleSettings = this.creditTermScheduleSettings;
        List<CreditAgreement> list = this.agreements;
        StringBuilder sbX = s.x("CreditTerm(id=", str, ", expiresOn=", str2, ", loanAmount=");
        sbX.append(d10);
        sbX.append(", currency=");
        sbX.append(str3);
        sbX.append(", feeRate=");
        sbX.append(d11);
        sbX.append(", interestRate=");
        sbX.append(d12);
        sbX.append(", creditTermScheduleSettings=");
        sbX.append(creditTermScheduleSettings);
        sbX.append(", agreements=");
        sbX.append(list);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.expiresOn);
        dest.writeDouble(this.loanAmount);
        dest.writeString(this.currency);
        dest.writeDouble(this.feeRate);
        dest.writeDouble(this.interestRate);
        CreditTermScheduleSettings creditTermScheduleSettings = this.creditTermScheduleSettings;
        if (creditTermScheduleSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditTermScheduleSettings.writeToParcel(dest, i);
        }
        List<CreditAgreement> list = this.agreements;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((CreditAgreement) itP.next()).writeToParcel(dest, i);
        }
    }
}
