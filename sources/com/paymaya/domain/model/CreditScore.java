package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditScore implements Parcelable {
    public static final Parcelable.Creator<CreditScore> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("creditDecisionId")
    private final String creditDecisionId;

    @InterfaceC1497a
    @InterfaceC1498b("creditScore")
    private final String creditScore;

    @InterfaceC1497a
    @InterfaceC1498b("customerId")
    private final String customerId;

    @InterfaceC1497a
    @InterfaceC1498b("riskLevel")
    private final String riskLevel;

    public static final class Creator implements Parcelable.Creator<CreditScore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditScore createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditScore(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditScore[] newArray(int i) {
            return new CreditScore[i];
        }
    }

    public CreditScore(String creditDecisionId, String customerId, String creditScore, String riskLevel) {
        j.g(creditDecisionId, "creditDecisionId");
        j.g(customerId, "customerId");
        j.g(creditScore, "creditScore");
        j.g(riskLevel, "riskLevel");
        this.creditDecisionId = creditDecisionId;
        this.customerId = customerId;
        this.creditScore = creditScore;
        this.riskLevel = riskLevel;
    }

    public static /* synthetic */ CreditScore copy$default(CreditScore creditScore, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditScore.creditDecisionId;
        }
        if ((i & 2) != 0) {
            str2 = creditScore.customerId;
        }
        if ((i & 4) != 0) {
            str3 = creditScore.creditScore;
        }
        if ((i & 8) != 0) {
            str4 = creditScore.riskLevel;
        }
        return creditScore.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.creditDecisionId;
    }

    public final String component2() {
        return this.customerId;
    }

    public final String component3() {
        return this.creditScore;
    }

    public final String component4() {
        return this.riskLevel;
    }

    public final CreditScore copy(String creditDecisionId, String customerId, String creditScore, String riskLevel) {
        j.g(creditDecisionId, "creditDecisionId");
        j.g(customerId, "customerId");
        j.g(creditScore, "creditScore");
        j.g(riskLevel, "riskLevel");
        return new CreditScore(creditDecisionId, customerId, creditScore, riskLevel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditScore)) {
            return false;
        }
        CreditScore creditScore = (CreditScore) obj;
        return j.b(this.creditDecisionId, creditScore.creditDecisionId) && j.b(this.customerId, creditScore.customerId) && j.b(this.creditScore, creditScore.creditScore) && j.b(this.riskLevel, creditScore.riskLevel);
    }

    public final String getCreditDecisionId() {
        return this.creditDecisionId;
    }

    public final String getCreditScore() {
        return this.creditScore;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getRiskLevel() {
        return this.riskLevel;
    }

    public int hashCode() {
        return this.riskLevel.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.creditDecisionId.hashCode() * 31, 31, this.customerId), 31, this.creditScore);
    }

    public String toString() {
        String str = this.creditDecisionId;
        String str2 = this.customerId;
        return a.p(s.x("CreditScore(creditDecisionId=", str, ", customerId=", str2, ", creditScore="), this.creditScore, ", riskLevel=", this.riskLevel, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.creditDecisionId);
        dest.writeString(this.customerId);
        dest.writeString(this.creditScore);
        dest.writeString(this.riskLevel);
    }
}
