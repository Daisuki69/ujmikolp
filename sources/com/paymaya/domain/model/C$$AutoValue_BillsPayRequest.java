package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.BillsPayRequest;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillsPayRequest, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillsPayRequest extends BillsPayRequest {
    private final Amount mAmount;
    private final BillsPayRequestDetails mBiller;
    private final ImageUrlUnfiltered mImageUrl;
    private final Map<String, String> mOtherFields;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillsPayRequest$Builder */
    public static class Builder extends BillsPayRequest.Builder {
        private Amount mAmount;
        private BillsPayRequestDetails mBiller;
        private ImageUrlUnfiltered mImageUrl;
        private Map<String, String> mOtherFields;

        public /* synthetic */ Builder(BillsPayRequest billsPayRequest, int i) {
            this(billsPayRequest);
        }

        @Override // com.paymaya.domain.model.BillsPayRequest.Builder
        public BillsPayRequest build() {
            return new AutoValue_BillsPayRequest(this.mBiller, this.mAmount, this.mOtherFields, this.mImageUrl);
        }

        @Override // com.paymaya.domain.model.BillsPayRequest.Builder
        public BillsPayRequest.Builder mAmount(Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BillsPayRequest.Builder
        public BillsPayRequest.Builder mBiller(BillsPayRequestDetails billsPayRequestDetails) {
            this.mBiller = billsPayRequestDetails;
            return this;
        }

        @Override // com.paymaya.domain.model.BillsPayRequest.Builder
        public BillsPayRequest.Builder mImageUrl(ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mImageUrl = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.BillsPayRequest.Builder
        public BillsPayRequest.Builder mOtherFields(Map<String, String> map) {
            this.mOtherFields = map;
            return this;
        }

        public Builder() {
        }

        private Builder(BillsPayRequest billsPayRequest) {
            this.mBiller = billsPayRequest.mBiller();
            this.mAmount = billsPayRequest.mAmount();
            this.mOtherFields = billsPayRequest.mOtherFields();
            this.mImageUrl = billsPayRequest.mImageUrl();
        }
    }

    public C$$AutoValue_BillsPayRequest(@Nullable BillsPayRequestDetails billsPayRequestDetails, @Nullable Amount amount, @Nullable Map<String, String> map, @Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
        this.mBiller = billsPayRequestDetails;
        this.mAmount = amount;
        this.mOtherFields = map;
        this.mImageUrl = imageUrlUnfiltered;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillsPayRequest) {
            BillsPayRequest billsPayRequest = (BillsPayRequest) obj;
            BillsPayRequestDetails billsPayRequestDetails = this.mBiller;
            if (billsPayRequestDetails != null ? billsPayRequestDetails.equals(billsPayRequest.mBiller()) : billsPayRequest.mBiller() == null) {
                Amount amount = this.mAmount;
                if (amount != null ? amount.equals(billsPayRequest.mAmount()) : billsPayRequest.mAmount() == null) {
                    Map<String, String> map = this.mOtherFields;
                    if (map != null ? map.equals(billsPayRequest.mOtherFields()) : billsPayRequest.mOtherFields() == null) {
                        ImageUrlUnfiltered imageUrlUnfiltered = this.mImageUrl;
                        if (imageUrlUnfiltered != null ? imageUrlUnfiltered.equals(billsPayRequest.mImageUrl()) : billsPayRequest.mImageUrl() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        BillsPayRequestDetails billsPayRequestDetails = this.mBiller;
        int iHashCode = ((billsPayRequestDetails == null ? 0 : billsPayRequestDetails.hashCode()) ^ 1000003) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode2 = (iHashCode ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        Map<String, String> map = this.mOtherFields;
        int iHashCode3 = (iHashCode2 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered = this.mImageUrl;
        return iHashCode3 ^ (imageUrlUnfiltered != null ? imageUrlUnfiltered.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillsPayRequest
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.BillsPayRequest
    @Nullable
    @InterfaceC1498b("biller")
    public BillsPayRequestDetails mBiller() {
        return this.mBiller;
    }

    @Override // com.paymaya.domain.model.BillsPayRequest
    @Nullable
    @InterfaceC1498b("icon_url")
    public ImageUrlUnfiltered mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.BillsPayRequest
    @Nullable
    @InterfaceC1498b("other_fields")
    public Map<String, String> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.BillsPayRequest
    public BillsPayRequest.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "BillsPayRequest{mBiller=" + this.mBiller + ", mAmount=" + this.mAmount + ", mOtherFields=" + this.mOtherFields + ", mImageUrl=" + this.mImageUrl + "}";
    }
}
