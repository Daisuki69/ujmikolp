package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Amount;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Amount, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Amount extends Amount {
    private final String mCurrency;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Amount$Builder */
    public static class Builder extends Amount.Builder {
        private String mCurrency;
        private String mValue;

        @Override // com.paymaya.domain.model.Amount.Builder
        public Amount build() {
            return new AutoValue_Amount(this.mCurrency, this.mValue);
        }

        @Override // com.paymaya.domain.model.Amount.Builder
        public Amount.Builder mCurrency(String str) {
            this.mCurrency = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Amount.Builder
        public Amount.Builder mValue(String str) {
            this.mValue = str;
            return this;
        }
    }

    public C$$AutoValue_Amount(@Nullable String str, @Nullable String str2) {
        this.mCurrency = str;
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Amount) {
            Amount amount = (Amount) obj;
            String str = this.mCurrency;
            if (str != null ? str.equals(amount.mCurrency()) : amount.mCurrency() == null) {
                String str2 = this.mValue;
                if (str2 != null ? str2.equals(amount.mValue()) : amount.mValue() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mCurrency;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mValue;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Amount
    @Nullable
    @InterfaceC1498b("currency")
    public String mCurrency() {
        return this.mCurrency;
    }

    @Override // com.paymaya.domain.model.Amount
    @Nullable
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Amount{mCurrency=");
        sb2.append(this.mCurrency);
        sb2.append(", mValue=");
        return s.p(sb2, this.mValue, "}");
    }
}
