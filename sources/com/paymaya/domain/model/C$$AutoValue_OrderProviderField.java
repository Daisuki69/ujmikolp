package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.OrderProviderField;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_OrderProviderField, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_OrderProviderField extends OrderProviderField {
    private final String mCode;
    private final Boolean mIsHidden;
    private final String mName;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_OrderProviderField$Builder */
    public static class Builder extends OrderProviderField.Builder {
        private String mCode;
        private Boolean mIsHidden;
        private String mName;
        private String mValue;

        public /* synthetic */ Builder(OrderProviderField orderProviderField, int i) {
            this(orderProviderField);
        }

        @Override // com.paymaya.domain.model.OrderProviderField.Builder
        public OrderProviderField build() {
            String strI = this.mCode == null ? " mCode" : "";
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (this.mValue == null) {
                strI = s.i(strI, " mValue");
            }
            if (strI.isEmpty()) {
                return new AutoValue_OrderProviderField(this.mCode, this.mName, this.mValue, this.mIsHidden);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.OrderProviderField.Builder
        public OrderProviderField.Builder mCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCode");
            }
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.OrderProviderField.Builder
        public OrderProviderField.Builder mIsHidden(@Nullable Boolean bool) {
            this.mIsHidden = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.OrderProviderField.Builder
        public OrderProviderField.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.OrderProviderField.Builder
        public OrderProviderField.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(OrderProviderField orderProviderField) {
            this.mCode = orderProviderField.mCode();
            this.mName = orderProviderField.mName();
            this.mValue = orderProviderField.mValue();
            this.mIsHidden = orderProviderField.mIsHidden();
        }
    }

    public C$$AutoValue_OrderProviderField(String str, String str2, String str3, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mCode");
        }
        this.mCode = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str3;
        this.mIsHidden = bool;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof OrderProviderField) {
            OrderProviderField orderProviderField = (OrderProviderField) obj;
            if (this.mCode.equals(orderProviderField.mCode()) && this.mName.equals(orderProviderField.mName()) && this.mValue.equals(orderProviderField.mValue()) && ((bool = this.mIsHidden) != null ? bool.equals(orderProviderField.mIsHidden()) : orderProviderField.mIsHidden() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mCode.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mValue.hashCode()) * 1000003;
        Boolean bool = this.mIsHidden;
        return iHashCode ^ (bool == null ? 0 : bool.hashCode());
    }

    @Override // com.paymaya.domain.model.OrderProviderField
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.OrderProviderField
    @Nullable
    @InterfaceC1498b("hidden")
    public Boolean mIsHidden() {
        return this.mIsHidden;
    }

    @Override // com.paymaya.domain.model.OrderProviderField
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.OrderProviderField
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.OrderProviderField
    public OrderProviderField.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrderProviderField{mCode=");
        sb2.append(this.mCode);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mValue=");
        sb2.append(this.mValue);
        sb2.append(", mIsHidden=");
        return AbstractC1213b.N(sb2, this.mIsHidden, "}");
    }
}
