package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditResponse implements Parcelable {
    public static final Parcelable.Creator<CreditResponse> CREATOR = new Creator();
    private CreditAccount creditAccount;
    private CreditApplication creditApplication;
    private CreditEligibility creditEligibility;

    public static final class Creator implements Parcelable.Creator<CreditResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditResponse(parcel.readInt() == 0 ? null : CreditApplication.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditEligibility.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditAccount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditResponse[] newArray(int i) {
            return new CreditResponse[i];
        }
    }

    public CreditResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CreditResponse copy$default(CreditResponse creditResponse, CreditApplication creditApplication, CreditEligibility creditEligibility, CreditAccount creditAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            creditApplication = creditResponse.creditApplication;
        }
        if ((i & 2) != 0) {
            creditEligibility = creditResponse.creditEligibility;
        }
        if ((i & 4) != 0) {
            creditAccount = creditResponse.creditAccount;
        }
        return creditResponse.copy(creditApplication, creditEligibility, creditAccount);
    }

    public final CreditApplication component1() {
        return this.creditApplication;
    }

    public final CreditEligibility component2() {
        return this.creditEligibility;
    }

    public final CreditAccount component3() {
        return this.creditAccount;
    }

    public final CreditResponse copy(CreditApplication creditApplication, CreditEligibility creditEligibility, CreditAccount creditAccount) {
        return new CreditResponse(creditApplication, creditEligibility, creditAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditResponse)) {
            return false;
        }
        CreditResponse creditResponse = (CreditResponse) obj;
        return j.b(this.creditApplication, creditResponse.creditApplication) && j.b(this.creditEligibility, creditResponse.creditEligibility) && j.b(this.creditAccount, creditResponse.creditAccount);
    }

    public final CreditAccount getCreditAccount() {
        return this.creditAccount;
    }

    public final CreditApplication getCreditApplication() {
        return this.creditApplication;
    }

    public final CreditEligibility getCreditEligibility() {
        return this.creditEligibility;
    }

    public int hashCode() {
        CreditApplication creditApplication = this.creditApplication;
        int iHashCode = (creditApplication == null ? 0 : creditApplication.hashCode()) * 31;
        CreditEligibility creditEligibility = this.creditEligibility;
        int iHashCode2 = (iHashCode + (creditEligibility == null ? 0 : creditEligibility.hashCode())) * 31;
        CreditAccount creditAccount = this.creditAccount;
        return iHashCode2 + (creditAccount != null ? creditAccount.hashCode() : 0);
    }

    public final void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public final void setCreditApplication(CreditApplication creditApplication) {
        this.creditApplication = creditApplication;
    }

    public final void setCreditEligibility(CreditEligibility creditEligibility) {
        this.creditEligibility = creditEligibility;
    }

    public String toString() {
        return "CreditResponse(creditApplication=" + this.creditApplication + ", creditEligibility=" + this.creditEligibility + ", creditAccount=" + this.creditAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        CreditApplication creditApplication = this.creditApplication;
        if (creditApplication == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditApplication.writeToParcel(dest, i);
        }
        CreditEligibility creditEligibility = this.creditEligibility;
        if (creditEligibility == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditEligibility.writeToParcel(dest, i);
        }
        CreditAccount creditAccount = this.creditAccount;
        if (creditAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditAccount.writeToParcel(dest, i);
        }
    }

    public CreditResponse(CreditApplication creditApplication, CreditEligibility creditEligibility, CreditAccount creditAccount) {
        this.creditApplication = creditApplication;
        this.creditEligibility = creditEligibility;
        this.creditAccount = creditAccount;
    }

    public /* synthetic */ CreditResponse(CreditApplication creditApplication, CreditEligibility creditEligibility, CreditAccount creditAccount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : creditApplication, (i & 2) != 0 ? null : creditEligibility, (i & 4) != 0 ? null : creditAccount);
    }
}
