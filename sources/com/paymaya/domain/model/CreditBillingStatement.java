package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import com.paymaya.common.utility.C;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditBillingStatement {

    @InterfaceC1497a
    @InterfaceC1498b("creation_date_time")
    private final String creationDateTime;

    @InterfaceC1497a
    @InterfaceC1498b("due_date")
    private final String dueDate;

    @InterfaceC1497a
    @InterfaceC1498b("end_date_time")
    private final String endDateTime;

    @InterfaceC1497a
    @InterfaceC1498b("start_date_time")
    private final String startDateTime;

    @InterfaceC1497a
    @InterfaceC1498b("statement_description")
    private final List<String> statementDescription;

    @InterfaceC1497a
    @InterfaceC1498b("statement_id")
    private final String statementId;

    @InterfaceC1497a
    @InterfaceC1498b("statement_reference")
    private final String statementReference;

    @InterfaceC1497a
    @InterfaceC1498b("total_amount_due")
    private final String totalAmountDue;

    @InterfaceC1497a
    @InterfaceC1498b("total_penalties_due")
    private final String totalPenaltiesDue;

    @InterfaceC1497a
    @InterfaceC1498b("total_service_fee")
    private final String totalServiceFee;

    @InterfaceC1497a
    @InterfaceC1498b("total_transaction_amount")
    private final String totalTransactionAmount;

    public CreditBillingStatement(String statementId, String statementReference, String startDateTime, String endDateTime, String creationDateTime, List<String> statementDescription, String dueDate, String totalAmountDue, String totalTransactionAmount, String totalPenaltiesDue, String totalServiceFee) {
        j.g(statementId, "statementId");
        j.g(statementReference, "statementReference");
        j.g(startDateTime, "startDateTime");
        j.g(endDateTime, "endDateTime");
        j.g(creationDateTime, "creationDateTime");
        j.g(statementDescription, "statementDescription");
        j.g(dueDate, "dueDate");
        j.g(totalAmountDue, "totalAmountDue");
        j.g(totalTransactionAmount, "totalTransactionAmount");
        j.g(totalPenaltiesDue, "totalPenaltiesDue");
        j.g(totalServiceFee, "totalServiceFee");
        this.statementId = statementId;
        this.statementReference = statementReference;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.creationDateTime = creationDateTime;
        this.statementDescription = statementDescription;
        this.dueDate = dueDate;
        this.totalAmountDue = totalAmountDue;
        this.totalTransactionAmount = totalTransactionAmount;
        this.totalPenaltiesDue = totalPenaltiesDue;
        this.totalServiceFee = totalServiceFee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditBillingStatement copy$default(CreditBillingStatement creditBillingStatement, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditBillingStatement.statementId;
        }
        if ((i & 2) != 0) {
            str2 = creditBillingStatement.statementReference;
        }
        if ((i & 4) != 0) {
            str3 = creditBillingStatement.startDateTime;
        }
        if ((i & 8) != 0) {
            str4 = creditBillingStatement.endDateTime;
        }
        if ((i & 16) != 0) {
            str5 = creditBillingStatement.creationDateTime;
        }
        if ((i & 32) != 0) {
            list = creditBillingStatement.statementDescription;
        }
        if ((i & 64) != 0) {
            str6 = creditBillingStatement.dueDate;
        }
        if ((i & 128) != 0) {
            str7 = creditBillingStatement.totalAmountDue;
        }
        if ((i & 256) != 0) {
            str8 = creditBillingStatement.totalTransactionAmount;
        }
        if ((i & 512) != 0) {
            str9 = creditBillingStatement.totalPenaltiesDue;
        }
        if ((i & 1024) != 0) {
            str10 = creditBillingStatement.totalServiceFee;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        List list2 = list;
        String str15 = str6;
        String str16 = str5;
        String str17 = str3;
        return creditBillingStatement.copy(str, str2, str17, str4, str16, list2, str15, str13, str14, str11, str12);
    }

    public final String component1() {
        return this.statementId;
    }

    public final String component10() {
        return this.totalPenaltiesDue;
    }

    public final String component11() {
        return this.totalServiceFee;
    }

    public final String component2() {
        return this.statementReference;
    }

    public final String component3() {
        return this.startDateTime;
    }

    public final String component4() {
        return this.endDateTime;
    }

    public final String component5() {
        return this.creationDateTime;
    }

    public final List<String> component6() {
        return this.statementDescription;
    }

    public final String component7() {
        return this.dueDate;
    }

    public final String component8() {
        return this.totalAmountDue;
    }

    public final String component9() {
        return this.totalTransactionAmount;
    }

    public final CreditBillingStatement copy(String statementId, String statementReference, String startDateTime, String endDateTime, String creationDateTime, List<String> statementDescription, String dueDate, String totalAmountDue, String totalTransactionAmount, String totalPenaltiesDue, String totalServiceFee) {
        j.g(statementId, "statementId");
        j.g(statementReference, "statementReference");
        j.g(startDateTime, "startDateTime");
        j.g(endDateTime, "endDateTime");
        j.g(creationDateTime, "creationDateTime");
        j.g(statementDescription, "statementDescription");
        j.g(dueDate, "dueDate");
        j.g(totalAmountDue, "totalAmountDue");
        j.g(totalTransactionAmount, "totalTransactionAmount");
        j.g(totalPenaltiesDue, "totalPenaltiesDue");
        j.g(totalServiceFee, "totalServiceFee");
        return new CreditBillingStatement(statementId, statementReference, startDateTime, endDateTime, creationDateTime, statementDescription, dueDate, totalAmountDue, totalTransactionAmount, totalPenaltiesDue, totalServiceFee);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditBillingStatement)) {
            return false;
        }
        CreditBillingStatement creditBillingStatement = (CreditBillingStatement) obj;
        return j.b(this.statementId, creditBillingStatement.statementId) && j.b(this.statementReference, creditBillingStatement.statementReference) && j.b(this.startDateTime, creditBillingStatement.startDateTime) && j.b(this.endDateTime, creditBillingStatement.endDateTime) && j.b(this.creationDateTime, creditBillingStatement.creationDateTime) && j.b(this.statementDescription, creditBillingStatement.statementDescription) && j.b(this.dueDate, creditBillingStatement.dueDate) && j.b(this.totalAmountDue, creditBillingStatement.totalAmountDue) && j.b(this.totalTransactionAmount, creditBillingStatement.totalTransactionAmount) && j.b(this.totalPenaltiesDue, creditBillingStatement.totalPenaltiesDue) && j.b(this.totalServiceFee, creditBillingStatement.totalServiceFee);
    }

    public final String getCreationDateTime() {
        return this.creationDateTime;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getEndDateTime() {
        return this.endDateTime;
    }

    public final String getFormattedTotalAmountDueValue() {
        String strV = C.v(this.totalAmountDue);
        j.f(strV, "formatValue(...)");
        return strV;
    }

    public final String getStartDateTime() {
        return this.startDateTime;
    }

    public final List<String> getStatementDescription() {
        return this.statementDescription;
    }

    public final String getStatementId() {
        return this.statementId;
    }

    public final String getStatementReference() {
        return this.statementReference;
    }

    public final String getTotalAmountDue() {
        return this.totalAmountDue;
    }

    public final String getTotalPenaltiesDue() {
        return this.totalPenaltiesDue;
    }

    public final String getTotalServiceFee() {
        return this.totalServiceFee;
    }

    public final String getTotalTransactionAmount() {
        return this.totalTransactionAmount;
    }

    public int hashCode() {
        return this.totalServiceFee.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.d(this.statementDescription, AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.statementId.hashCode() * 31, 31, this.statementReference), 31, this.startDateTime), 31, this.endDateTime), 31, this.creationDateTime), 31), 31, this.dueDate), 31, this.totalAmountDue), 31, this.totalTransactionAmount), 31, this.totalPenaltiesDue);
    }

    public String toString() {
        String str = this.statementId;
        String str2 = this.statementReference;
        String str3 = this.startDateTime;
        String str4 = this.endDateTime;
        String str5 = this.creationDateTime;
        List<String> list = this.statementDescription;
        String str6 = this.dueDate;
        String str7 = this.totalAmountDue;
        String str8 = this.totalTransactionAmount;
        String str9 = this.totalPenaltiesDue;
        String str10 = this.totalServiceFee;
        StringBuilder sbX = s.x("CreditBillingStatement(statementId=", str, ", statementReference=", str2, ", startDateTime=");
        c.A(sbX, str3, ", endDateTime=", str4, ", creationDateTime=");
        sbX.append(str5);
        sbX.append(", statementDescription=");
        sbX.append(list);
        sbX.append(", dueDate=");
        c.A(sbX, str6, ", totalAmountDue=", str7, ", totalTransactionAmount=");
        c.A(sbX, str8, ", totalPenaltiesDue=", str9, ", totalServiceFee=");
        return s.p(sbX, str10, ")");
    }
}
