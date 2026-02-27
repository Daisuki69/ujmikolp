package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.C;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import of.p;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditAccount implements Parcelable, Billable {
    public static final Parcelable.Creator<CreditAccount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("application_number")
    private final String applicationNumber;

    @InterfaceC1497a
    @InterfaceC1498b("balances")
    private final CreditAmount balances;
    private String billingStatementAmountDue;

    @InterfaceC1497a
    @InterfaceC1498b("created_date")
    private final String createDate;

    @InterfaceC1497a
    @InterfaceC1498b("currency_code")
    private final String currencyCode;

    @InterfaceC1497a
    @InterfaceC1498b("days_in_arrears")
    private final int daysInArrears;

    @InterfaceC1497a
    @InterfaceC1498b("days_late")
    private final int daysLate;

    @InterfaceC1497a
    @InterfaceC1498b("dues")
    private final CreditAmount dues;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("loan_amount")
    private final double loanAmount;

    @InterfaceC1497a
    @InterfaceC1498b("promissory_note_number")
    private final String promissoryNoteNumber;

    @InterfaceC1497a
    @InterfaceC1498b("repayment_settings")
    private final RepaymentSettings repaymentSettings;

    @InterfaceC1497a
    @InterfaceC1498b("schedule_settings")
    private final CreditTermScheduleSettings scheduleSettings;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<CreditAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAccount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            double d10 = parcel.readDouble();
            Parcelable.Creator<CreditAmount> creator = CreditAmount.CREATOR;
            return new CreditAccount(string, string2, string3, string4, string5, d10, creator.createFromParcel(parcel), creator.createFromParcel(parcel), CreditTermScheduleSettings.CREATOR.createFromParcel(parcel), RepaymentSettings.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAccount[] newArray(int i) {
            return new CreditAccount[i];
        }
    }

    public CreditAccount(String id, String applicationNumber, String promissoryNoteNumber, String status, String currencyCode, double d10, CreditAmount balances, CreditAmount dues, CreditTermScheduleSettings scheduleSettings, RepaymentSettings repaymentSettings, String createDate, int i, int i4, String str) {
        j.g(id, "id");
        j.g(applicationNumber, "applicationNumber");
        j.g(promissoryNoteNumber, "promissoryNoteNumber");
        j.g(status, "status");
        j.g(currencyCode, "currencyCode");
        j.g(balances, "balances");
        j.g(dues, "dues");
        j.g(scheduleSettings, "scheduleSettings");
        j.g(repaymentSettings, "repaymentSettings");
        j.g(createDate, "createDate");
        this.id = id;
        this.applicationNumber = applicationNumber;
        this.promissoryNoteNumber = promissoryNoteNumber;
        this.status = status;
        this.currencyCode = currencyCode;
        this.loanAmount = d10;
        this.balances = balances;
        this.dues = dues;
        this.scheduleSettings = scheduleSettings;
        this.repaymentSettings = repaymentSettings;
        this.createDate = createDate;
        this.daysInArrears = i;
        this.daysLate = i4;
        this.billingStatementAmountDue = str;
    }

    public final String component1() {
        return this.id;
    }

    public final RepaymentSettings component10() {
        return this.repaymentSettings;
    }

    public final String component11() {
        return this.createDate;
    }

    public final int component12() {
        return this.daysInArrears;
    }

    public final int component13() {
        return this.daysLate;
    }

    public final String component14() {
        return this.billingStatementAmountDue;
    }

    public final String component2() {
        return this.applicationNumber;
    }

    public final String component3() {
        return this.promissoryNoteNumber;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.currencyCode;
    }

    public final double component6() {
        return this.loanAmount;
    }

    public final CreditAmount component7() {
        return this.balances;
    }

    public final CreditAmount component8() {
        return this.dues;
    }

    public final CreditTermScheduleSettings component9() {
        return this.scheduleSettings;
    }

    public final CreditAccount copy(String id, String applicationNumber, String promissoryNoteNumber, String status, String currencyCode, double d10, CreditAmount balances, CreditAmount dues, CreditTermScheduleSettings scheduleSettings, RepaymentSettings repaymentSettings, String createDate, int i, int i4, String str) {
        j.g(id, "id");
        j.g(applicationNumber, "applicationNumber");
        j.g(promissoryNoteNumber, "promissoryNoteNumber");
        j.g(status, "status");
        j.g(currencyCode, "currencyCode");
        j.g(balances, "balances");
        j.g(dues, "dues");
        j.g(scheduleSettings, "scheduleSettings");
        j.g(repaymentSettings, "repaymentSettings");
        j.g(createDate, "createDate");
        return new CreditAccount(id, applicationNumber, promissoryNoteNumber, status, currencyCode, d10, balances, dues, scheduleSettings, repaymentSettings, createDate, i, i4, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAccount)) {
            return false;
        }
        CreditAccount creditAccount = (CreditAccount) obj;
        return j.b(this.id, creditAccount.id) && j.b(this.applicationNumber, creditAccount.applicationNumber) && j.b(this.promissoryNoteNumber, creditAccount.promissoryNoteNumber) && j.b(this.status, creditAccount.status) && j.b(this.currencyCode, creditAccount.currencyCode) && Double.compare(this.loanAmount, creditAccount.loanAmount) == 0 && j.b(this.balances, creditAccount.balances) && j.b(this.dues, creditAccount.dues) && j.b(this.scheduleSettings, creditAccount.scheduleSettings) && j.b(this.repaymentSettings, creditAccount.repaymentSettings) && j.b(this.createDate, creditAccount.createDate) && this.daysInArrears == creditAccount.daysInArrears && this.daysLate == creditAccount.daysLate && j.b(this.billingStatementAmountDue, creditAccount.billingStatementAmountDue);
    }

    @Override // com.paymaya.domain.model.Billable
    public String getAccountNumber() {
        return this.promissoryNoteNumber;
    }

    @Override // com.paymaya.domain.model.Billable
    public Amount getAmount() {
        if (this.billingStatementAmountDue != null) {
            return Amount.sBuilder().mCurrency(this.currencyCode).mValue(this.billingStatementAmountDue).build();
        }
        return null;
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final double getAvailableValue() {
        return this.loanAmount - this.balances.getPrincipal();
    }

    public final CreditAmount getBalances() {
        return this.balances;
    }

    @Override // com.paymaya.domain.model.Billable
    public String getBillerSlug() {
        return this.repaymentSettings.getBiller();
    }

    public final String getBillingStatementAmountDue() {
        return this.billingStatementAmountDue;
    }

    public final String getCreateDate() {
        return this.createDate;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final int getDaysInArrears() {
        return this.daysInArrears;
    }

    public final int getDaysLate() {
        return this.daysLate;
    }

    public final CreditAmount getDues() {
        return this.dues;
    }

    public final String getFormatNoteNumberValue() {
        String str = this.promissoryNoteNumber;
        j.g(str, "<this>");
        p.l(4, 4);
        int length = str.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 4) + (length % 4 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i4 = i + 4;
            CharSequence it = str.subSequence(i, (i4 < 0 || i4 > length) ? length : i4);
            j.g(it, "it");
            arrayList.add(it.toString());
            i = i4;
        }
        return C1110A.F(arrayList, Global.BLANK, null, null, null, 62);
    }

    public final String getFormattedAvailableBalanceValue() {
        String strU = C.u(Double.valueOf(getAvailableValue()));
        j.f(strU, "formatValue(...)");
        return strU;
    }

    public final String getFormattedLoanAmountValue() {
        String strU = C.u(Double.valueOf(this.loanAmount));
        j.f(strU, "formatValue(...)");
        return strU;
    }

    public final String getFormattedUsedBalanceValue() {
        String strU = C.u(Double.valueOf(getUsedValue()));
        j.f(strU, "formatValue(...)");
        return strU;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLoanAmount() {
        return this.loanAmount;
    }

    public final String getPromissoryNoteNumber() {
        return this.promissoryNoteNumber;
    }

    public final int getRemainingDaystoLock() {
        return 30 - this.daysInArrears;
    }

    public final RepaymentSettings getRepaymentSettings() {
        return this.repaymentSettings;
    }

    public final CreditTermScheduleSettings getScheduleSettings() {
        return this.scheduleSettings;
    }

    public final String getStatus() {
        return this.status;
    }

    public final double getUsedValue() {
        return this.balances.getPrincipal();
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.applicationNumber), 31, this.promissoryNoteNumber), 31, this.status), 31, this.currencyCode);
        long jDoubleToLongBits = Double.doubleToLongBits(this.loanAmount);
        int iC2 = (((AbstractC1414e.c((this.repaymentSettings.hashCode() + ((this.scheduleSettings.hashCode() + ((this.dues.hashCode() + ((this.balances.hashCode() + ((iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.createDate) + this.daysInArrears) * 31) + this.daysLate) * 31;
        String str = this.billingStatementAmountDue;
        return iC2 + (str == null ? 0 : str.hashCode());
    }

    public final void setBillingStatementAmountDue(String str) {
        this.billingStatementAmountDue = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.applicationNumber;
        String str3 = this.promissoryNoteNumber;
        String str4 = this.status;
        String str5 = this.currencyCode;
        double d10 = this.loanAmount;
        CreditAmount creditAmount = this.balances;
        CreditAmount creditAmount2 = this.dues;
        CreditTermScheduleSettings creditTermScheduleSettings = this.scheduleSettings;
        RepaymentSettings repaymentSettings = this.repaymentSettings;
        String str6 = this.createDate;
        int i = this.daysInArrears;
        int i4 = this.daysLate;
        String str7 = this.billingStatementAmountDue;
        StringBuilder sbX = s.x("CreditAccount(id=", str, ", applicationNumber=", str2, ", promissoryNoteNumber=");
        c.A(sbX, str3, ", status=", str4, ", currencyCode=");
        sbX.append(str5);
        sbX.append(", loanAmount=");
        sbX.append(d10);
        sbX.append(", balances=");
        sbX.append(creditAmount);
        sbX.append(", dues=");
        sbX.append(creditAmount2);
        sbX.append(", scheduleSettings=");
        sbX.append(creditTermScheduleSettings);
        sbX.append(", repaymentSettings=");
        sbX.append(repaymentSettings);
        sbX.append(", createDate=");
        sbX.append(str6);
        sbX.append(", daysInArrears=");
        sbX.append(i);
        sbX.append(", daysLate=");
        sbX.append(i4);
        sbX.append(", billingStatementAmountDue=");
        sbX.append(str7);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.applicationNumber);
        dest.writeString(this.promissoryNoteNumber);
        dest.writeString(this.status);
        dest.writeString(this.currencyCode);
        dest.writeDouble(this.loanAmount);
        this.balances.writeToParcel(dest, i);
        this.dues.writeToParcel(dest, i);
        this.scheduleSettings.writeToParcel(dest, i);
        this.repaymentSettings.writeToParcel(dest, i);
        dest.writeString(this.createDate);
        dest.writeInt(this.daysInArrears);
        dest.writeInt(this.daysLate);
        dest.writeString(this.billingStatementAmountDue);
    }

    public /* synthetic */ CreditAccount(String str, String str2, String str3, String str4, String str5, double d10, CreditAmount creditAmount, CreditAmount creditAmount2, CreditTermScheduleSettings creditTermScheduleSettings, RepaymentSettings repaymentSettings, String str6, int i, int i4, String str7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, d10, creditAmount, creditAmount2, creditTermScheduleSettings, repaymentSettings, str6, i, i4, (i6 & 8192) != 0 ? null : str7);
    }
}
