package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.ShopPurchaseHistory;
import g3.InterfaceC1498b;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopPurchaseHistory, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ShopPurchaseHistory extends ShopPurchaseHistory {
    private final boolean mAvailableReceipt;
    private final String mCode;
    private final String mCreatedAt;
    private final String mIconUrl;
    private final String mImageUrl;
    private final boolean mIsGifted;
    private final String mNetwork;
    private final String mOrderReferenceNumber;
    private final List<OrderProviderField> mOtherFields;
    private final int mPage;
    private final String mPaymentTrn;
    private final double mPrice;
    private final String mProductDescription;
    private final String mProductId;
    private final String mProductName;
    private final String mRecipient;
    private final String mStatus;
    private final String mUpdatedAt;
    private final boolean mWithReceipt;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopPurchaseHistory$Builder */
    public static class Builder extends ShopPurchaseHistory.Builder {
        private Boolean mAvailableReceipt;
        private String mCode;
        private String mCreatedAt;
        private String mIconUrl;
        private String mImageUrl;
        private Boolean mIsGifted;
        private String mNetwork;
        private String mOrderReferenceNumber;
        private List<OrderProviderField> mOtherFields;
        private Integer mPage;
        private String mPaymentTrn;
        private Double mPrice;
        private String mProductDescription;
        private String mProductId;
        private String mProductName;
        private String mRecipient;
        private String mStatus;
        private String mUpdatedAt;
        private Boolean mWithReceipt;

        public /* synthetic */ Builder(ShopPurchaseHistory shopPurchaseHistory, int i) {
            this(shopPurchaseHistory);
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory build() {
            String strI = this.mProductId == null ? " mProductId" : "";
            if (this.mPrice == null) {
                strI = s.i(strI, " mPrice");
            }
            if (this.mOrderReferenceNumber == null) {
                strI = s.i(strI, " mOrderReferenceNumber");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (this.mIsGifted == null) {
                strI = s.i(strI, " mIsGifted");
            }
            if (this.mWithReceipt == null) {
                strI = s.i(strI, " mWithReceipt");
            }
            if (this.mAvailableReceipt == null) {
                strI = s.i(strI, " mAvailableReceipt");
            }
            if (this.mPage == null) {
                strI = s.i(strI, " mPage");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ShopPurchaseHistory(this.mProductId, this.mProductName, this.mProductDescription, this.mImageUrl, this.mIconUrl, this.mPrice.doubleValue(), this.mRecipient, this.mPaymentTrn, this.mOrderReferenceNumber, this.mCreatedAt, this.mUpdatedAt, this.mStatus, this.mIsGifted.booleanValue(), this.mCode, this.mNetwork, this.mWithReceipt.booleanValue(), this.mAvailableReceipt.booleanValue(), this.mOtherFields, this.mPage.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mAvailableReceipt(boolean z4) {
            this.mAvailableReceipt = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mCode(String str) {
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mCreatedAt(String str) {
            this.mCreatedAt = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mIconUrl(String str) {
            this.mIconUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mIsGifted(boolean z4) {
            this.mIsGifted = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mNetwork(String str) {
            this.mNetwork = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mOrderReferenceNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mOrderReferenceNumber");
            }
            this.mOrderReferenceNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mOtherFields(List<OrderProviderField> list) {
            this.mOtherFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mPage(int i) {
            this.mPage = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mPaymentTrn(String str) {
            this.mPaymentTrn = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mPrice(double d10) {
            this.mPrice = Double.valueOf(d10);
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mProductDescription(String str) {
            this.mProductDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductId");
            }
            this.mProductId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mProductName(String str) {
            this.mProductName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mRecipient(String str) {
            this.mRecipient = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mUpdatedAt(String str) {
            this.mUpdatedAt = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistory.Builder
        public ShopPurchaseHistory.Builder mWithReceipt(boolean z4) {
            this.mWithReceipt = Boolean.valueOf(z4);
            return this;
        }

        public Builder() {
        }

        private Builder(ShopPurchaseHistory shopPurchaseHistory) {
            this.mProductId = shopPurchaseHistory.mProductId();
            this.mProductName = shopPurchaseHistory.mProductName();
            this.mProductDescription = shopPurchaseHistory.mProductDescription();
            this.mImageUrl = shopPurchaseHistory.mImageUrl();
            this.mIconUrl = shopPurchaseHistory.mIconUrl();
            this.mPrice = Double.valueOf(shopPurchaseHistory.mPrice());
            this.mRecipient = shopPurchaseHistory.mRecipient();
            this.mPaymentTrn = shopPurchaseHistory.mPaymentTrn();
            this.mOrderReferenceNumber = shopPurchaseHistory.mOrderReferenceNumber();
            this.mCreatedAt = shopPurchaseHistory.mCreatedAt();
            this.mUpdatedAt = shopPurchaseHistory.mUpdatedAt();
            this.mStatus = shopPurchaseHistory.mStatus();
            this.mIsGifted = Boolean.valueOf(shopPurchaseHistory.mIsGifted());
            this.mCode = shopPurchaseHistory.mCode();
            this.mNetwork = shopPurchaseHistory.mNetwork();
            this.mWithReceipt = Boolean.valueOf(shopPurchaseHistory.mWithReceipt());
            this.mAvailableReceipt = Boolean.valueOf(shopPurchaseHistory.mAvailableReceipt());
            this.mOtherFields = shopPurchaseHistory.mOtherFields();
            this.mPage = Integer.valueOf(shopPurchaseHistory.mPage());
        }
    }

    public C$$AutoValue_ShopPurchaseHistory(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, double d10, @Nullable String str6, @Nullable String str7, String str8, @Nullable String str9, @Nullable String str10, String str11, boolean z4, @Nullable String str12, @Nullable String str13, boolean z5, boolean z8, @Nullable List<OrderProviderField> list, int i) {
        if (str == null) {
            throw new NullPointerException("Null mProductId");
        }
        this.mProductId = str;
        this.mProductName = str2;
        this.mProductDescription = str3;
        this.mImageUrl = str4;
        this.mIconUrl = str5;
        this.mPrice = d10;
        this.mRecipient = str6;
        this.mPaymentTrn = str7;
        if (str8 == null) {
            throw new NullPointerException("Null mOrderReferenceNumber");
        }
        this.mOrderReferenceNumber = str8;
        this.mCreatedAt = str9;
        this.mUpdatedAt = str10;
        if (str11 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str11;
        this.mIsGifted = z4;
        this.mCode = str12;
        this.mNetwork = str13;
        this.mWithReceipt = z5;
        this.mAvailableReceipt = z8;
        this.mOtherFields = list;
        this.mPage = i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        List<OrderProviderField> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShopPurchaseHistory) {
            ShopPurchaseHistory shopPurchaseHistory = (ShopPurchaseHistory) obj;
            if (this.mProductId.equals(shopPurchaseHistory.mProductId()) && ((str = this.mProductName) != null ? str.equals(shopPurchaseHistory.mProductName()) : shopPurchaseHistory.mProductName() == null) && ((str2 = this.mProductDescription) != null ? str2.equals(shopPurchaseHistory.mProductDescription()) : shopPurchaseHistory.mProductDescription() == null) && ((str3 = this.mImageUrl) != null ? str3.equals(shopPurchaseHistory.mImageUrl()) : shopPurchaseHistory.mImageUrl() == null) && ((str4 = this.mIconUrl) != null ? str4.equals(shopPurchaseHistory.mIconUrl()) : shopPurchaseHistory.mIconUrl() == null) && Double.doubleToLongBits(this.mPrice) == Double.doubleToLongBits(shopPurchaseHistory.mPrice()) && ((str5 = this.mRecipient) != null ? str5.equals(shopPurchaseHistory.mRecipient()) : shopPurchaseHistory.mRecipient() == null) && ((str6 = this.mPaymentTrn) != null ? str6.equals(shopPurchaseHistory.mPaymentTrn()) : shopPurchaseHistory.mPaymentTrn() == null) && this.mOrderReferenceNumber.equals(shopPurchaseHistory.mOrderReferenceNumber()) && ((str7 = this.mCreatedAt) != null ? str7.equals(shopPurchaseHistory.mCreatedAt()) : shopPurchaseHistory.mCreatedAt() == null) && ((str8 = this.mUpdatedAt) != null ? str8.equals(shopPurchaseHistory.mUpdatedAt()) : shopPurchaseHistory.mUpdatedAt() == null) && this.mStatus.equals(shopPurchaseHistory.mStatus()) && this.mIsGifted == shopPurchaseHistory.mIsGifted() && ((str9 = this.mCode) != null ? str9.equals(shopPurchaseHistory.mCode()) : shopPurchaseHistory.mCode() == null) && ((str10 = this.mNetwork) != null ? str10.equals(shopPurchaseHistory.mNetwork()) : shopPurchaseHistory.mNetwork() == null) && this.mWithReceipt == shopPurchaseHistory.mWithReceipt() && this.mAvailableReceipt == shopPurchaseHistory.mAvailableReceipt() && ((list = this.mOtherFields) != null ? list.equals(shopPurchaseHistory.mOtherFields()) : shopPurchaseHistory.mOtherFields() == null) && this.mPage == shopPurchaseHistory.mPage()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mProductId.hashCode() ^ 1000003) * 1000003;
        String str = this.mProductName;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mProductDescription;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mImageUrl;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mIconUrl;
        int iHashCode5 = (((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.mPrice) >>> 32) ^ Double.doubleToLongBits(this.mPrice)))) * 1000003;
        String str5 = this.mRecipient;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.mPaymentTrn;
        int iHashCode7 = (((iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.mOrderReferenceNumber.hashCode()) * 1000003;
        String str7 = this.mCreatedAt;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.mUpdatedAt;
        int iHashCode9 = (((((iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ (this.mIsGifted ? 1231 : 1237)) * 1000003;
        String str9 = this.mCode;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mNetwork;
        int iHashCode11 = (((((iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003) ^ (this.mWithReceipt ? 1231 : 1237)) * 1000003) ^ (this.mAvailableReceipt ? 1231 : 1237)) * 1000003;
        List<OrderProviderField> list = this.mOtherFields;
        return ((iHashCode11 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.mPage;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("available_receipt")
    public boolean mAvailableReceipt() {
        return this.mAvailableReceipt;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b(MPDbAdapter.KEY_CREATED_AT)
    public String mCreatedAt() {
        return this.mCreatedAt;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("icon_url")
    public String mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("image_url")
    public String mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("gifted")
    public boolean mIsGifted() {
        return this.mIsGifted;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("network")
    public String mNetwork() {
        return this.mNetwork;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("order_reference_number")
    public String mOrderReferenceNumber() {
        return this.mOrderReferenceNumber;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("other_fields")
    public List<OrderProviderField> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    public int mPage() {
        return this.mPage;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("payment_trn")
    public String mPaymentTrn() {
        return this.mPaymentTrn;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("price")
    public double mPrice() {
        return this.mPrice;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("product_description")
    public String mProductDescription() {
        return this.mProductDescription;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("product_id")
    public String mProductId() {
        return this.mProductId;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("product_name")
    public String mProductName() {
        return this.mProductName;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("recipient")
    public String mRecipient() {
        return this.mRecipient;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @Nullable
    @InterfaceC1498b("updated_at")
    public String mUpdatedAt() {
        return this.mUpdatedAt;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    @InterfaceC1498b("with_receipt")
    public boolean mWithReceipt() {
        return this.mWithReceipt;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistory
    public ShopPurchaseHistory.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShopPurchaseHistory{mProductId=");
        sb2.append(this.mProductId);
        sb2.append(", mProductName=");
        sb2.append(this.mProductName);
        sb2.append(", mProductDescription=");
        sb2.append(this.mProductDescription);
        sb2.append(", mImageUrl=");
        sb2.append(this.mImageUrl);
        sb2.append(", mIconUrl=");
        sb2.append(this.mIconUrl);
        sb2.append(", mPrice=");
        sb2.append(this.mPrice);
        sb2.append(", mRecipient=");
        sb2.append(this.mRecipient);
        sb2.append(", mPaymentTrn=");
        sb2.append(this.mPaymentTrn);
        sb2.append(", mOrderReferenceNumber=");
        sb2.append(this.mOrderReferenceNumber);
        sb2.append(", mCreatedAt=");
        sb2.append(this.mCreatedAt);
        sb2.append(", mUpdatedAt=");
        sb2.append(this.mUpdatedAt);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mIsGifted=");
        sb2.append(this.mIsGifted);
        sb2.append(", mCode=");
        sb2.append(this.mCode);
        sb2.append(", mNetwork=");
        sb2.append(this.mNetwork);
        sb2.append(", mWithReceipt=");
        sb2.append(this.mWithReceipt);
        sb2.append(", mAvailableReceipt=");
        sb2.append(this.mAvailableReceipt);
        sb2.append(", mOtherFields=");
        sb2.append(this.mOtherFields);
        sb2.append(", mPage=");
        return s.o(sb2, "}", this.mPage);
    }
}
