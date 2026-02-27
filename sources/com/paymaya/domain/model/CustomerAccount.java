package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccount implements Parcelable {
    public static final Parcelable.Creator<CustomerAccount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("account_number")
    private String accountNumber;

    @InterfaceC1497a
    @InterfaceC1498b("creation_date")
    private String creationDate;

    @InterfaceC1497a
    @InterfaceC1498b("currency_code")
    private String currencyCode;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private String id;

    @InterfaceC1497a
    @InterfaceC1498b("ledger_details")
    private CustomerAccountLedgerDetails ledgerDetails;

    @InterfaceC1497a
    @InterfaceC1498b("owner")
    private CustomerAccountOwner owner;

    @InterfaceC1497a
    @InterfaceC1498b("product_offering")
    private CustomerAccountProductOffering productOffering;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private CustomerAccountStatus status;

    @InterfaceC1497a
    @InterfaceC1498b("tenant")
    private String tenant;

    public static final class Creator implements Parcelable.Creator<CustomerAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccount(parcel.readString(), parcel.readString(), parcel.readString(), CustomerAccountLedgerDetails.CREATOR.createFromParcel(parcel), CustomerAccountOwner.CREATOR.createFromParcel(parcel), parcel.readString(), CustomerAccountProductOffering.CREATOR.createFromParcel(parcel), CustomerAccountStatus.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccount[] newArray(int i) {
            return new CustomerAccount[i];
        }
    }

    public CustomerAccount(String id, String accountNumber, String currencyCode, CustomerAccountLedgerDetails ledgerDetails, CustomerAccountOwner owner, String creationDate, CustomerAccountProductOffering productOffering, CustomerAccountStatus status, String tenant) {
        j.g(id, "id");
        j.g(accountNumber, "accountNumber");
        j.g(currencyCode, "currencyCode");
        j.g(ledgerDetails, "ledgerDetails");
        j.g(owner, "owner");
        j.g(creationDate, "creationDate");
        j.g(productOffering, "productOffering");
        j.g(status, "status");
        j.g(tenant, "tenant");
        this.id = id;
        this.accountNumber = accountNumber;
        this.currencyCode = currencyCode;
        this.ledgerDetails = ledgerDetails;
        this.owner = owner;
        this.creationDate = creationDate;
        this.productOffering = productOffering;
        this.status = status;
        this.tenant = tenant;
    }

    public static /* synthetic */ CustomerAccount copy$default(CustomerAccount customerAccount, String str, String str2, String str3, CustomerAccountLedgerDetails customerAccountLedgerDetails, CustomerAccountOwner customerAccountOwner, String str4, CustomerAccountProductOffering customerAccountProductOffering, CustomerAccountStatus customerAccountStatus, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = customerAccount.accountNumber;
        }
        if ((i & 4) != 0) {
            str3 = customerAccount.currencyCode;
        }
        if ((i & 8) != 0) {
            customerAccountLedgerDetails = customerAccount.ledgerDetails;
        }
        if ((i & 16) != 0) {
            customerAccountOwner = customerAccount.owner;
        }
        if ((i & 32) != 0) {
            str4 = customerAccount.creationDate;
        }
        if ((i & 64) != 0) {
            customerAccountProductOffering = customerAccount.productOffering;
        }
        if ((i & 128) != 0) {
            customerAccountStatus = customerAccount.status;
        }
        if ((i & 256) != 0) {
            str5 = customerAccount.tenant;
        }
        CustomerAccountStatus customerAccountStatus2 = customerAccountStatus;
        String str6 = str5;
        String str7 = str4;
        CustomerAccountProductOffering customerAccountProductOffering2 = customerAccountProductOffering;
        CustomerAccountOwner customerAccountOwner2 = customerAccountOwner;
        String str8 = str3;
        return customerAccount.copy(str, str2, str8, customerAccountLedgerDetails, customerAccountOwner2, str7, customerAccountProductOffering2, customerAccountStatus2, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.accountNumber;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final CustomerAccountLedgerDetails component4() {
        return this.ledgerDetails;
    }

    public final CustomerAccountOwner component5() {
        return this.owner;
    }

    public final String component6() {
        return this.creationDate;
    }

    public final CustomerAccountProductOffering component7() {
        return this.productOffering;
    }

    public final CustomerAccountStatus component8() {
        return this.status;
    }

    public final String component9() {
        return this.tenant;
    }

    public final CustomerAccount copy(String id, String accountNumber, String currencyCode, CustomerAccountLedgerDetails ledgerDetails, CustomerAccountOwner owner, String creationDate, CustomerAccountProductOffering productOffering, CustomerAccountStatus status, String tenant) {
        j.g(id, "id");
        j.g(accountNumber, "accountNumber");
        j.g(currencyCode, "currencyCode");
        j.g(ledgerDetails, "ledgerDetails");
        j.g(owner, "owner");
        j.g(creationDate, "creationDate");
        j.g(productOffering, "productOffering");
        j.g(status, "status");
        j.g(tenant, "tenant");
        return new CustomerAccount(id, accountNumber, currencyCode, ledgerDetails, owner, creationDate, productOffering, status, tenant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerAccount)) {
            return false;
        }
        CustomerAccount customerAccount = (CustomerAccount) obj;
        return j.b(this.id, customerAccount.id) && j.b(this.accountNumber, customerAccount.accountNumber) && j.b(this.currencyCode, customerAccount.currencyCode) && j.b(this.ledgerDetails, customerAccount.ledgerDetails) && j.b(this.owner, customerAccount.owner) && j.b(this.creationDate, customerAccount.creationDate) && j.b(this.productOffering, customerAccount.productOffering) && j.b(this.status, customerAccount.status) && j.b(this.tenant, customerAccount.tenant);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getCreationDate() {
        return this.creationDate;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getId() {
        return this.id;
    }

    public final CustomerAccountLedgerDetails getLedgerDetails() {
        return this.ledgerDetails;
    }

    public final CustomerAccountOwner getOwner() {
        return this.owner;
    }

    public final CustomerAccountProductOffering getProductOffering() {
        return this.productOffering;
    }

    public final CustomerAccountStatus getStatus() {
        return this.status;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        return this.tenant.hashCode() + ((this.status.hashCode() + ((this.productOffering.hashCode() + AbstractC1414e.c((this.owner.hashCode() + ((this.ledgerDetails.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.accountNumber), 31, this.currencyCode)) * 31)) * 31, 31, this.creationDate)) * 31)) * 31);
    }

    public final void setAccountNumber(String str) {
        j.g(str, "<set-?>");
        this.accountNumber = str;
    }

    public final void setCreationDate(String str) {
        j.g(str, "<set-?>");
        this.creationDate = str;
    }

    public final void setCurrencyCode(String str) {
        j.g(str, "<set-?>");
        this.currencyCode = str;
    }

    public final void setId(String str) {
        j.g(str, "<set-?>");
        this.id = str;
    }

    public final void setLedgerDetails(CustomerAccountLedgerDetails customerAccountLedgerDetails) {
        j.g(customerAccountLedgerDetails, "<set-?>");
        this.ledgerDetails = customerAccountLedgerDetails;
    }

    public final void setOwner(CustomerAccountOwner customerAccountOwner) {
        j.g(customerAccountOwner, "<set-?>");
        this.owner = customerAccountOwner;
    }

    public final void setProductOffering(CustomerAccountProductOffering customerAccountProductOffering) {
        j.g(customerAccountProductOffering, "<set-?>");
        this.productOffering = customerAccountProductOffering;
    }

    public final void setStatus(CustomerAccountStatus customerAccountStatus) {
        j.g(customerAccountStatus, "<set-?>");
        this.status = customerAccountStatus;
    }

    public final void setTenant(String str) {
        j.g(str, "<set-?>");
        this.tenant = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.accountNumber;
        String str3 = this.currencyCode;
        CustomerAccountLedgerDetails customerAccountLedgerDetails = this.ledgerDetails;
        CustomerAccountOwner customerAccountOwner = this.owner;
        String str4 = this.creationDate;
        CustomerAccountProductOffering customerAccountProductOffering = this.productOffering;
        CustomerAccountStatus customerAccountStatus = this.status;
        String str5 = this.tenant;
        StringBuilder sbX = s.x("CustomerAccount(id=", str, ", accountNumber=", str2, ", currencyCode=");
        sbX.append(str3);
        sbX.append(", ledgerDetails=");
        sbX.append(customerAccountLedgerDetails);
        sbX.append(", owner=");
        sbX.append(customerAccountOwner);
        sbX.append(", creationDate=");
        sbX.append(str4);
        sbX.append(", productOffering=");
        sbX.append(customerAccountProductOffering);
        sbX.append(", status=");
        sbX.append(customerAccountStatus);
        sbX.append(", tenant=");
        return s.p(sbX, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.accountNumber);
        dest.writeString(this.currencyCode);
        this.ledgerDetails.writeToParcel(dest, i);
        this.owner.writeToParcel(dest, i);
        dest.writeString(this.creationDate);
        this.productOffering.writeToParcel(dest, i);
        this.status.writeToParcel(dest, i);
        dest.writeString(this.tenant);
    }
}
