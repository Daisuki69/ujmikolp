package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.PaymentSummary;
import java.util.Map;

/* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PaymentSummary, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$AutoValue_PaymentSummary extends PaymentSummary {
    private final String mFundSourceId;
    private final boolean mIsGifted;
    private final boolean mIsIncludeSignatureEnabled;
    private final String mMessage;
    private final Map<String, String> mOtherFields;
    private final String mProductId;
    private final String mRecipient;
    private final String mTargetNumber;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PaymentSummary$Builder */
    public static class Builder extends PaymentSummary.Builder {
        private String mFundSourceId;
        private Boolean mIsGifted;
        private Boolean mIsIncludeSignatureEnabled;
        private String mMessage;
        private Map<String, String> mOtherFields;
        private String mProductId;
        private String mRecipient;
        private String mTargetNumber;

        public /* synthetic */ Builder(PaymentSummary paymentSummary, int i) {
            this(paymentSummary);
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary build() {
            String strI = this.mProductId == null ? " mProductId" : "";
            if (this.mIsIncludeSignatureEnabled == null) {
                strI = s.i(strI, " mIsIncludeSignatureEnabled");
            }
            if (this.mIsGifted == null) {
                strI = s.i(strI, " mIsGifted");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PaymentSummary(this.mFundSourceId, this.mProductId, this.mRecipient, this.mMessage, this.mTargetNumber, this.mOtherFields, this.mIsIncludeSignatureEnabled.booleanValue(), this.mIsGifted.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mFundSourceId(String str) {
            this.mFundSourceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mIsGifted(boolean z4) {
            this.mIsGifted = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mIsIncludeSignatureEnabled(boolean z4) {
            this.mIsIncludeSignatureEnabled = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mMessage(String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mOtherFields(Map<String, String> map) {
            this.mOtherFields = map;
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductId");
            }
            this.mProductId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mRecipient(String str) {
            this.mRecipient = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PaymentSummary.Builder
        public PaymentSummary.Builder mTargetNumber(String str) {
            this.mTargetNumber = str;
            return this;
        }

        public Builder() {
        }

        private Builder(PaymentSummary paymentSummary) {
            this.mFundSourceId = paymentSummary.mFundSourceId();
            this.mProductId = paymentSummary.mProductId();
            this.mRecipient = paymentSummary.mRecipient();
            this.mMessage = paymentSummary.mMessage();
            this.mTargetNumber = paymentSummary.mTargetNumber();
            this.mOtherFields = paymentSummary.mOtherFields();
            this.mIsIncludeSignatureEnabled = Boolean.valueOf(paymentSummary.mIsIncludeSignatureEnabled());
            this.mIsGifted = Boolean.valueOf(paymentSummary.mIsGifted());
        }
    }

    public C$AutoValue_PaymentSummary(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, boolean z4, boolean z5) {
        this.mFundSourceId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mProductId");
        }
        this.mProductId = str2;
        this.mRecipient = str3;
        this.mMessage = str4;
        this.mTargetNumber = str5;
        this.mOtherFields = map;
        this.mIsIncludeSignatureEnabled = z4;
        this.mIsGifted = z5;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaymentSummary) {
            PaymentSummary paymentSummary = (PaymentSummary) obj;
            String str4 = this.mFundSourceId;
            if (str4 != null ? str4.equals(paymentSummary.mFundSourceId()) : paymentSummary.mFundSourceId() == null) {
                if (this.mProductId.equals(paymentSummary.mProductId()) && ((str = this.mRecipient) != null ? str.equals(paymentSummary.mRecipient()) : paymentSummary.mRecipient() == null) && ((str2 = this.mMessage) != null ? str2.equals(paymentSummary.mMessage()) : paymentSummary.mMessage() == null) && ((str3 = this.mTargetNumber) != null ? str3.equals(paymentSummary.mTargetNumber()) : paymentSummary.mTargetNumber() == null) && ((map = this.mOtherFields) != null ? map.equals(paymentSummary.mOtherFields()) : paymentSummary.mOtherFields() == null) && this.mIsIncludeSignatureEnabled == paymentSummary.mIsIncludeSignatureEnabled() && this.mIsGifted == paymentSummary.mIsGifted()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mFundSourceId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mProductId.hashCode()) * 1000003;
        String str2 = this.mRecipient;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mMessage;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mTargetNumber;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Map<String, String> map = this.mOtherFields;
        return ((((iHashCode4 ^ (map != null ? map.hashCode() : 0)) * 1000003) ^ (this.mIsIncludeSignatureEnabled ? 1231 : 1237)) * 1000003) ^ (this.mIsGifted ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    @Nullable
    public String mFundSourceId() {
        return this.mFundSourceId;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    public boolean mIsGifted() {
        return this.mIsGifted;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    public boolean mIsIncludeSignatureEnabled() {
        return this.mIsIncludeSignatureEnabled;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    @Nullable
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    @Nullable
    public Map<String, String> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    public String mProductId() {
        return this.mProductId;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    @Nullable
    public String mRecipient() {
        return this.mRecipient;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    @Nullable
    public String mTargetNumber() {
        return this.mTargetNumber;
    }

    @Override // com.paymaya.domain.model.PaymentSummary
    public PaymentSummary.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentSummary{mFundSourceId=");
        sb2.append(this.mFundSourceId);
        sb2.append(", mProductId=");
        sb2.append(this.mProductId);
        sb2.append(", mRecipient=");
        sb2.append(this.mRecipient);
        sb2.append(", mMessage=");
        sb2.append(this.mMessage);
        sb2.append(", mTargetNumber=");
        sb2.append(this.mTargetNumber);
        sb2.append(", mOtherFields=");
        sb2.append(this.mOtherFields);
        sb2.append(", mIsIncludeSignatureEnabled=");
        sb2.append(this.mIsIncludeSignatureEnabled);
        sb2.append(", mIsGifted=");
        return s.s(sb2, this.mIsGifted, "}");
    }
}
