package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.BillsPayRequestDetails;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillsPayRequestDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillsPayRequestDetails extends BillsPayRequestDetails {
    private final String mAccountNumber;
    private final String mSlug;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillsPayRequestDetails$Builder */
    public static class Builder extends BillsPayRequestDetails.Builder {
        private String mAccountNumber;
        private String mSlug;

        public /* synthetic */ Builder(BillsPayRequestDetails billsPayRequestDetails, int i) {
            this(billsPayRequestDetails);
        }

        @Override // com.paymaya.domain.model.BillsPayRequestDetails.Builder
        public BillsPayRequestDetails build() {
            return new AutoValue_BillsPayRequestDetails(this.mSlug, this.mAccountNumber);
        }

        @Override // com.paymaya.domain.model.BillsPayRequestDetails.Builder
        public BillsPayRequestDetails.Builder mAccountNumber(String str) {
            this.mAccountNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillsPayRequestDetails.Builder
        public BillsPayRequestDetails.Builder mSlug(String str) {
            this.mSlug = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillsPayRequestDetails billsPayRequestDetails) {
            this.mSlug = billsPayRequestDetails.mSlug();
            this.mAccountNumber = billsPayRequestDetails.mAccountNumber();
        }
    }

    public C$$AutoValue_BillsPayRequestDetails(@Nullable String str, @Nullable String str2) {
        this.mSlug = str;
        this.mAccountNumber = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillsPayRequestDetails) {
            BillsPayRequestDetails billsPayRequestDetails = (BillsPayRequestDetails) obj;
            String str = this.mSlug;
            if (str != null ? str.equals(billsPayRequestDetails.mSlug()) : billsPayRequestDetails.mSlug() == null) {
                String str2 = this.mAccountNumber;
                if (str2 != null ? str2.equals(billsPayRequestDetails.mAccountNumber()) : billsPayRequestDetails.mAccountNumber() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mSlug;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mAccountNumber;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillsPayRequestDetails
    @Nullable
    @InterfaceC1498b("account_number")
    public String mAccountNumber() {
        return this.mAccountNumber;
    }

    @Override // com.paymaya.domain.model.BillsPayRequestDetails
    @Nullable
    @InterfaceC1498b("slug")
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.BillsPayRequestDetails
    public BillsPayRequestDetails.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillsPayRequestDetails{mSlug=");
        sb2.append(this.mSlug);
        sb2.append(", mAccountNumber=");
        return s.p(sb2, this.mAccountNumber, "}");
    }
}
