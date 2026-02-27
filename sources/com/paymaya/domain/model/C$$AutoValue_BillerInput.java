package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.BillerInput;
import java.util.Map;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerInput, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerInput extends BillerInput {
    private final String mAccountNumber;
    private final Amount mAmount;
    private final Map<String, BillerField> mBillerFields;
    private final String mSlug;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerInput$Builder */
    public static class Builder extends BillerInput.Builder {
        private String mAccountNumber;
        private Amount mAmount;
        private Map<String, BillerField> mBillerFields;
        private String mSlug;

        public /* synthetic */ Builder(BillerInput billerInput, int i) {
            this(billerInput);
        }

        @Override // com.paymaya.domain.model.BillerInput.Builder
        public BillerInput build() {
            String str = this.mBillerFields == null ? " mBillerFields" : "";
            if (str.isEmpty()) {
                return new AutoValue_BillerInput(this.mSlug, this.mAccountNumber, this.mAmount, this.mBillerFields);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.BillerInput.Builder
        public BillerInput.Builder mAccountNumber(@Nullable String str) {
            this.mAccountNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerInput.Builder
        public BillerInput.Builder mAmount(@Nullable Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerInput.Builder
        public BillerInput.Builder mBillerFields(Map<String, BillerField> map) {
            if (map == null) {
                throw new NullPointerException("Null mBillerFields");
            }
            this.mBillerFields = map;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerInput.Builder
        public BillerInput.Builder mSlug(@Nullable String str) {
            this.mSlug = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerInput billerInput) {
            this.mSlug = billerInput.mSlug();
            this.mAccountNumber = billerInput.mAccountNumber();
            this.mAmount = billerInput.mAmount();
            this.mBillerFields = billerInput.mBillerFields();
        }
    }

    public C$$AutoValue_BillerInput(@Nullable String str, @Nullable String str2, @Nullable Amount amount, Map<String, BillerField> map) {
        this.mSlug = str;
        this.mAccountNumber = str2;
        this.mAmount = amount;
        if (map == null) {
            throw new NullPointerException("Null mBillerFields");
        }
        this.mBillerFields = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerInput) {
            BillerInput billerInput = (BillerInput) obj;
            String str = this.mSlug;
            if (str != null ? str.equals(billerInput.mSlug()) : billerInput.mSlug() == null) {
                String str2 = this.mAccountNumber;
                if (str2 != null ? str2.equals(billerInput.mAccountNumber()) : billerInput.mAccountNumber() == null) {
                    Amount amount = this.mAmount;
                    if (amount != null ? amount.equals(billerInput.mAmount()) : billerInput.mAmount() == null) {
                        if (this.mBillerFields.equals(billerInput.mBillerFields())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mSlug;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mAccountNumber;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Amount amount = this.mAmount;
        return ((iHashCode2 ^ (amount != null ? amount.hashCode() : 0)) * 1000003) ^ this.mBillerFields.hashCode();
    }

    @Override // com.paymaya.domain.model.BillerInput
    @Nullable
    public String mAccountNumber() {
        return this.mAccountNumber;
    }

    @Override // com.paymaya.domain.model.BillerInput
    @Nullable
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.BillerInput
    public Map<String, BillerField> mBillerFields() {
        return this.mBillerFields;
    }

    @Override // com.paymaya.domain.model.BillerInput
    @Nullable
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.BillerInput
    public BillerInput.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "BillerInput{mSlug=" + this.mSlug + ", mAccountNumber=" + this.mAccountNumber + ", mAmount=" + this.mAmount + ", mBillerFields=" + this.mBillerFields + "}";
    }
}
