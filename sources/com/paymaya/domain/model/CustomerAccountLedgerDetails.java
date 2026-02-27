package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccountLedgerDetails implements Parcelable {
    public static final Parcelable.Creator<CustomerAccountLedgerDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("ledger")
    private String ledger;

    @InterfaceC1497a
    @InterfaceC1498b("mode")
    private String mode;

    public static final class Creator implements Parcelable.Creator<CustomerAccountLedgerDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountLedgerDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccountLedgerDetails(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountLedgerDetails[] newArray(int i) {
            return new CustomerAccountLedgerDetails[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerAccountLedgerDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomerAccountLedgerDetails copy$default(CustomerAccountLedgerDetails customerAccountLedgerDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccountLedgerDetails.ledger;
        }
        if ((i & 2) != 0) {
            str2 = customerAccountLedgerDetails.mode;
        }
        return customerAccountLedgerDetails.copy(str, str2);
    }

    public final String component1() {
        return this.ledger;
    }

    public final String component2() {
        return this.mode;
    }

    public final CustomerAccountLedgerDetails copy(String str, String str2) {
        return new CustomerAccountLedgerDetails(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerAccountLedgerDetails)) {
            return false;
        }
        CustomerAccountLedgerDetails customerAccountLedgerDetails = (CustomerAccountLedgerDetails) obj;
        return j.b(this.ledger, customerAccountLedgerDetails.ledger) && j.b(this.mode, customerAccountLedgerDetails.mode);
    }

    public final String getLedger() {
        return this.ledger;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        String str = this.ledger;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setLedger(String str) {
        this.ledger = str;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public String toString() {
        return s.l("CustomerAccountLedgerDetails(ledger=", this.ledger, ", mode=", this.mode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.ledger);
        dest.writeString(this.mode);
    }

    public CustomerAccountLedgerDetails(String str, String str2) {
        this.ledger = str;
        this.mode = str2;
    }

    public /* synthetic */ CustomerAccountLedgerDetails(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
