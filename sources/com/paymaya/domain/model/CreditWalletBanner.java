package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditWalletBanner implements Parcelable {
    public static final Parcelable.Creator<CreditWalletBanner> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("accountDetails")
    private CreditAccount creditAccount;

    @InterfaceC1497a
    @InterfaceC1498b("applicationDetails")
    private CreditApplication creditApplication;

    @InterfaceC1497a
    @InterfaceC1498b("details")
    private final CreditWalletBannerDetails creditWalletBannerDetails;

    @InterfaceC1497a
    @InterfaceC1498b("customerDetails")
    private CustomerDetails customerDetails;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<CreditWalletBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditWalletBanner createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditWalletBanner(parcel.readString(), CreditWalletBannerDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditApplication.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CustomerDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditWalletBanner[] newArray(int i) {
            return new CreditWalletBanner[i];
        }
    }

    public CreditWalletBanner(String status, CreditWalletBannerDetails creditWalletBannerDetails, CreditApplication creditApplication, CreditAccount creditAccount, CustomerDetails customerDetails) {
        j.g(status, "status");
        j.g(creditWalletBannerDetails, "creditWalletBannerDetails");
        this.status = status;
        this.creditWalletBannerDetails = creditWalletBannerDetails;
        this.creditApplication = creditApplication;
        this.creditAccount = creditAccount;
        this.customerDetails = customerDetails;
    }

    public static /* synthetic */ CreditWalletBanner copy$default(CreditWalletBanner creditWalletBanner, String str, CreditWalletBannerDetails creditWalletBannerDetails, CreditApplication creditApplication, CreditAccount creditAccount, CustomerDetails customerDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditWalletBanner.status;
        }
        if ((i & 2) != 0) {
            creditWalletBannerDetails = creditWalletBanner.creditWalletBannerDetails;
        }
        if ((i & 4) != 0) {
            creditApplication = creditWalletBanner.creditApplication;
        }
        if ((i & 8) != 0) {
            creditAccount = creditWalletBanner.creditAccount;
        }
        if ((i & 16) != 0) {
            customerDetails = creditWalletBanner.customerDetails;
        }
        CustomerDetails customerDetails2 = customerDetails;
        CreditApplication creditApplication2 = creditApplication;
        return creditWalletBanner.copy(str, creditWalletBannerDetails, creditApplication2, creditAccount, customerDetails2);
    }

    public final String component1() {
        return this.status;
    }

    public final CreditWalletBannerDetails component2() {
        return this.creditWalletBannerDetails;
    }

    public final CreditApplication component3() {
        return this.creditApplication;
    }

    public final CreditAccount component4() {
        return this.creditAccount;
    }

    public final CustomerDetails component5() {
        return this.customerDetails;
    }

    public final CreditWalletBanner copy(String status, CreditWalletBannerDetails creditWalletBannerDetails, CreditApplication creditApplication, CreditAccount creditAccount, CustomerDetails customerDetails) {
        j.g(status, "status");
        j.g(creditWalletBannerDetails, "creditWalletBannerDetails");
        return new CreditWalletBanner(status, creditWalletBannerDetails, creditApplication, creditAccount, customerDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditWalletBanner)) {
            return false;
        }
        CreditWalletBanner creditWalletBanner = (CreditWalletBanner) obj;
        return j.b(this.status, creditWalletBanner.status) && j.b(this.creditWalletBannerDetails, creditWalletBanner.creditWalletBannerDetails) && j.b(this.creditApplication, creditWalletBanner.creditApplication) && j.b(this.creditAccount, creditWalletBanner.creditAccount) && j.b(this.customerDetails, creditWalletBanner.customerDetails);
    }

    public final CreditAccount getCreditAccount() {
        return this.creditAccount;
    }

    public final CreditApplication getCreditApplication() {
        return this.creditApplication;
    }

    public final CreditWalletBannerDetails getCreditWalletBannerDetails() {
        return this.creditWalletBannerDetails;
    }

    public final CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.creditWalletBannerDetails.hashCode() + (this.status.hashCode() * 31)) * 31;
        CreditApplication creditApplication = this.creditApplication;
        int iHashCode2 = (iHashCode + (creditApplication == null ? 0 : creditApplication.hashCode())) * 31;
        CreditAccount creditAccount = this.creditAccount;
        int iHashCode3 = (iHashCode2 + (creditAccount == null ? 0 : creditAccount.hashCode())) * 31;
        CustomerDetails customerDetails = this.customerDetails;
        return iHashCode3 + (customerDetails != null ? customerDetails.hashCode() : 0);
    }

    public final void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public final void setCreditApplication(CreditApplication creditApplication) {
        this.creditApplication = creditApplication;
    }

    public final void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String toString() {
        return "CreditWalletBanner(status=" + this.status + ", creditWalletBannerDetails=" + this.creditWalletBannerDetails + ", creditApplication=" + this.creditApplication + ", creditAccount=" + this.creditAccount + ", customerDetails=" + this.customerDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.status);
        this.creditWalletBannerDetails.writeToParcel(dest, i);
        CreditApplication creditApplication = this.creditApplication;
        if (creditApplication == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditApplication.writeToParcel(dest, i);
        }
        CreditAccount creditAccount = this.creditAccount;
        if (creditAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditAccount.writeToParcel(dest, i);
        }
        CustomerDetails customerDetails = this.customerDetails;
        if (customerDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customerDetails.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ CreditWalletBanner(String str, CreditWalletBannerDetails creditWalletBannerDetails, CreditApplication creditApplication, CreditAccount creditAccount, CustomerDetails customerDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, creditWalletBannerDetails, (i & 4) != 0 ? null : creditApplication, (i & 8) != 0 ? null : creditAccount, (i & 16) != 0 ? null : customerDetails);
    }
}
