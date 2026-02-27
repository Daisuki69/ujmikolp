package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.Order;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Order, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Order extends Order {
    private final Amount mAvailableBalance;
    private final String mCode;
    private final Amount mCurrentBalance;
    private final String mId;
    private final List<OrderProviderField> mOtherFields;
    private final String mPaymentId;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Order$Builder */
    public static class Builder extends Order.Builder {
        private Amount mAvailableBalance;
        private String mCode;
        private Amount mCurrentBalance;
        private String mId;
        private List<OrderProviderField> mOtherFields;
        private String mPaymentId;
        private String mStatus;

        public /* synthetic */ Builder(Order order, int i) {
            this(order);
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Order(this.mId, this.mStatus, this.mCode, this.mPaymentId, this.mOtherFields, this.mCurrentBalance, this.mAvailableBalance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mAvailableBalance(Amount amount) {
            this.mAvailableBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mCode(String str) {
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mCurrentBalance(Amount amount) {
            this.mCurrentBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mOtherFields(List<OrderProviderField> list) {
            this.mOtherFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mPaymentId(String str) {
            this.mPaymentId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Order.Builder
        public Order.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Order order) {
            this.mId = order.mId();
            this.mStatus = order.mStatus();
            this.mCode = order.mCode();
            this.mPaymentId = order.mPaymentId();
            this.mOtherFields = order.mOtherFields();
            this.mCurrentBalance = order.mCurrentBalance();
            this.mAvailableBalance = order.mAvailableBalance();
        }
    }

    public C$$AutoValue_Order(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable List<OrderProviderField> list, @Nullable Amount amount, @Nullable Amount amount2) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str2;
        this.mCode = str3;
        this.mPaymentId = str4;
        this.mOtherFields = list;
        this.mCurrentBalance = amount;
        this.mAvailableBalance = amount2;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        List<OrderProviderField> list;
        Amount amount;
        Amount amount2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Order) {
            Order order = (Order) obj;
            if (this.mId.equals(order.mId()) && this.mStatus.equals(order.mStatus()) && ((str = this.mCode) != null ? str.equals(order.mCode()) : order.mCode() == null) && ((str2 = this.mPaymentId) != null ? str2.equals(order.mPaymentId()) : order.mPaymentId() == null) && ((list = this.mOtherFields) != null ? list.equals(order.mOtherFields()) : order.mOtherFields() == null) && ((amount = this.mCurrentBalance) != null ? amount.equals(order.mCurrentBalance()) : order.mCurrentBalance() == null) && ((amount2 = this.mAvailableBalance) != null ? amount2.equals(order.mAvailableBalance()) : order.mAvailableBalance() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mStatus.hashCode()) * 1000003;
        String str = this.mCode;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mPaymentId;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        List<OrderProviderField> list = this.mOtherFields;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Amount amount = this.mCurrentBalance;
        int iHashCode5 = (iHashCode4 ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        Amount amount2 = this.mAvailableBalance;
        return iHashCode5 ^ (amount2 != null ? amount2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Order
    @Nullable
    public Amount mAvailableBalance() {
        return this.mAvailableBalance;
    }

    @Override // com.paymaya.domain.model.Order
    @Nullable
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.Order
    @Nullable
    public Amount mCurrentBalance() {
        return this.mCurrentBalance;
    }

    @Override // com.paymaya.domain.model.Order
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Order
    @Nullable
    @InterfaceC1498b("other_fields")
    public List<OrderProviderField> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.Order
    @Nullable
    @InterfaceC1498b("payment_id")
    public String mPaymentId() {
        return this.mPaymentId;
    }

    @Override // com.paymaya.domain.model.Order
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.Order
    public Order.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "Order{mId=" + this.mId + ", mStatus=" + this.mStatus + ", mCode=" + this.mCode + ", mPaymentId=" + this.mPaymentId + ", mOtherFields=" + this.mOtherFields + ", mCurrentBalance=" + this.mCurrentBalance + ", mAvailableBalance=" + this.mAvailableBalance + "}";
    }
}
