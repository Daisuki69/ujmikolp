package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.ProductProviderField;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductProviderField, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ProductProviderField extends ProductProviderField {
    private final String mCode;
    private final Boolean mIsHidden;
    private final String mName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductProviderField$Builder */
    public static class Builder extends ProductProviderField.Builder {
        private String mCode;
        private Boolean mIsHidden;
        private String mName;

        public /* synthetic */ Builder(ProductProviderField productProviderField, int i) {
            this(productProviderField);
        }

        @Override // com.paymaya.domain.model.ProductProviderField.Builder
        public ProductProviderField build() {
            String strI = this.mCode == null ? " mCode" : "";
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ProductProviderField(this.mCode, this.mName, this.mIsHidden);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ProductProviderField.Builder
        public ProductProviderField.Builder mCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCode");
            }
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ProductProviderField.Builder
        public ProductProviderField.Builder mIsHidden(@Nullable Boolean bool) {
            this.mIsHidden = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.ProductProviderField.Builder
        public ProductProviderField.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ProductProviderField productProviderField) {
            this.mCode = productProviderField.mCode();
            this.mName = productProviderField.mName();
            this.mIsHidden = productProviderField.mIsHidden();
        }
    }

    public C$$AutoValue_ProductProviderField(String str, String str2, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mCode");
        }
        this.mCode = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        this.mIsHidden = bool;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProductProviderField) {
            ProductProviderField productProviderField = (ProductProviderField) obj;
            if (this.mCode.equals(productProviderField.mCode()) && this.mName.equals(productProviderField.mName()) && ((bool = this.mIsHidden) != null ? bool.equals(productProviderField.mIsHidden()) : productProviderField.mIsHidden() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mCode.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003;
        Boolean bool = this.mIsHidden;
        return iHashCode ^ (bool == null ? 0 : bool.hashCode());
    }

    @Override // com.paymaya.domain.model.ProductProviderField
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.ProductProviderField
    @Nullable
    @InterfaceC1498b("hidden")
    public Boolean mIsHidden() {
        return this.mIsHidden;
    }

    @Override // com.paymaya.domain.model.ProductProviderField
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.ProductProviderField
    public ProductProviderField.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProductProviderField{mCode=");
        sb2.append(this.mCode);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mIsHidden=");
        return AbstractC1213b.N(sb2, this.mIsHidden, "}");
    }
}
