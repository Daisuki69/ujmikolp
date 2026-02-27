package com.paymaya.domain.model;

import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditAccountData {
    private final CreditAccount creditAccount;
    private final CreditResponse creditResponse;
    private final Pair<Boolean, CreditBillingStatement> statementResult;

    public CreditAccountData(CreditResponse creditResponse, CreditAccount creditAccount, Pair<Boolean, CreditBillingStatement> statementResult) {
        j.g(creditResponse, "creditResponse");
        j.g(creditAccount, "creditAccount");
        j.g(statementResult, "statementResult");
        this.creditResponse = creditResponse;
        this.creditAccount = creditAccount;
        this.statementResult = statementResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditAccountData copy$default(CreditAccountData creditAccountData, CreditResponse creditResponse, CreditAccount creditAccount, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            creditResponse = creditAccountData.creditResponse;
        }
        if ((i & 2) != 0) {
            creditAccount = creditAccountData.creditAccount;
        }
        if ((i & 4) != 0) {
            pair = creditAccountData.statementResult;
        }
        return creditAccountData.copy(creditResponse, creditAccount, pair);
    }

    public final CreditResponse component1() {
        return this.creditResponse;
    }

    public final CreditAccount component2() {
        return this.creditAccount;
    }

    public final Pair<Boolean, CreditBillingStatement> component3() {
        return this.statementResult;
    }

    public final CreditAccountData copy(CreditResponse creditResponse, CreditAccount creditAccount, Pair<Boolean, CreditBillingStatement> statementResult) {
        j.g(creditResponse, "creditResponse");
        j.g(creditAccount, "creditAccount");
        j.g(statementResult, "statementResult");
        return new CreditAccountData(creditResponse, creditAccount, statementResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAccountData)) {
            return false;
        }
        CreditAccountData creditAccountData = (CreditAccountData) obj;
        return j.b(this.creditResponse, creditAccountData.creditResponse) && j.b(this.creditAccount, creditAccountData.creditAccount) && j.b(this.statementResult, creditAccountData.statementResult);
    }

    public final CreditAccount getCreditAccount() {
        return this.creditAccount;
    }

    public final CreditResponse getCreditResponse() {
        return this.creditResponse;
    }

    public final Pair<Boolean, CreditBillingStatement> getStatementResult() {
        return this.statementResult;
    }

    public int hashCode() {
        return this.statementResult.hashCode() + ((this.creditAccount.hashCode() + (this.creditResponse.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CreditAccountData(creditResponse=" + this.creditResponse + ", creditAccount=" + this.creditAccount + ", statementResult=" + this.statementResult + ")";
    }
}
