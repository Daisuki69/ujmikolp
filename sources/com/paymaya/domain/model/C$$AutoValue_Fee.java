package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Fee;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Fee, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Fee extends Fee {
    private final String mCurrency;
    private final String mDisplay;
    private final String mLabel;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Fee$Builder */
    public static class Builder extends Fee.Builder {
        private String mCurrency;
        private String mDisplay;
        private String mLabel;
        private String mValue;

        public /* synthetic */ Builder(Fee fee, int i) {
            this(fee);
        }

        @Override // com.paymaya.domain.model.Fee.Builder
        public Fee build() {
            return new AutoValue_Fee(this.mCurrency, this.mValue, this.mLabel, this.mDisplay);
        }

        @Override // com.paymaya.domain.model.Fee.Builder
        public Fee.Builder mCurrency(String str) {
            this.mCurrency = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Fee.Builder
        public Fee.Builder mDisplay(String str) {
            this.mDisplay = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Fee.Builder
        public Fee.Builder mLabel(String str) {
            this.mLabel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Fee.Builder
        public Fee.Builder mValue(String str) {
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Fee fee) {
            this.mCurrency = fee.mCurrency();
            this.mValue = fee.mValue();
            this.mLabel = fee.mLabel();
            this.mDisplay = fee.mDisplay();
        }
    }

    public C$$AutoValue_Fee(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.mCurrency = str;
        this.mValue = str2;
        this.mLabel = str3;
        this.mDisplay = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Fee) {
            Fee fee = (Fee) obj;
            String str = this.mCurrency;
            if (str != null ? str.equals(fee.mCurrency()) : fee.mCurrency() == null) {
                String str2 = this.mValue;
                if (str2 != null ? str2.equals(fee.mValue()) : fee.mValue() == null) {
                    String str3 = this.mLabel;
                    if (str3 != null ? str3.equals(fee.mLabel()) : fee.mLabel() == null) {
                        String str4 = this.mDisplay;
                        if (str4 != null ? str4.equals(fee.mDisplay()) : fee.mDisplay() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mCurrency;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mValue;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mLabel;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mDisplay;
        return iHashCode3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Fee
    @Nullable
    @InterfaceC1498b("currency")
    public String mCurrency() {
        return this.mCurrency;
    }

    @Override // com.paymaya.domain.model.Fee
    @Nullable
    @InterfaceC1498b("display")
    public String mDisplay() {
        return this.mDisplay;
    }

    @Override // com.paymaya.domain.model.Fee
    @Nullable
    @InterfaceC1498b("label")
    public String mLabel() {
        return this.mLabel;
    }

    @Override // com.paymaya.domain.model.Fee
    @Nullable
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.Fee
    public Fee.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Fee{mCurrency=");
        sb2.append(this.mCurrency);
        sb2.append(", mValue=");
        sb2.append(this.mValue);
        sb2.append(", mLabel=");
        sb2.append(this.mLabel);
        sb2.append(", mDisplay=");
        return s.p(sb2, this.mDisplay, "}");
    }
}
