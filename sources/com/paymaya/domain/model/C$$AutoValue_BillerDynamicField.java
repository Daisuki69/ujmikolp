package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.paymaya.domain.model.BillerDynamicField;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerDynamicField, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerDynamicField extends BillerDynamicField {
    private final String mLabel;
    private final String mParameter;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerDynamicField$Builder */
    public static class Builder extends BillerDynamicField.Builder {
        private String mLabel;
        private String mParameter;
        private String mValue;

        public /* synthetic */ Builder(BillerDynamicField billerDynamicField, int i) {
            this(billerDynamicField);
        }

        @Override // com.paymaya.domain.model.BillerDynamicField.Builder
        public BillerDynamicField build() {
            return new AutoValue_BillerDynamicField(this.mParameter, this.mValue, this.mLabel);
        }

        @Override // com.paymaya.domain.model.BillerDynamicField.Builder
        public BillerDynamicField.Builder mLabel(@Nullable String str) {
            this.mLabel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDynamicField.Builder
        public BillerDynamicField.Builder mParameter(@Nullable String str) {
            this.mParameter = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDynamicField.Builder
        public BillerDynamicField.Builder mValue(@Nullable String str) {
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerDynamicField billerDynamicField) {
            this.mParameter = billerDynamicField.mParameter();
            this.mValue = billerDynamicField.mValue();
            this.mLabel = billerDynamicField.mLabel();
        }
    }

    public C$$AutoValue_BillerDynamicField(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.mParameter = str;
        this.mValue = str2;
        this.mLabel = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerDynamicField) {
            BillerDynamicField billerDynamicField = (BillerDynamicField) obj;
            String str = this.mParameter;
            if (str != null ? str.equals(billerDynamicField.mParameter()) : billerDynamicField.mParameter() == null) {
                String str2 = this.mValue;
                if (str2 != null ? str2.equals(billerDynamicField.mValue()) : billerDynamicField.mValue() == null) {
                    String str3 = this.mLabel;
                    if (str3 != null ? str3.equals(billerDynamicField.mLabel()) : billerDynamicField.mLabel() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mParameter;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mValue;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mLabel;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillerDynamicField
    @Nullable
    @InterfaceC1498b("placeholder")
    public String mLabel() {
        return this.mLabel;
    }

    @Override // com.paymaya.domain.model.BillerDynamicField
    @Nullable
    @InterfaceC1498b(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)
    public String mParameter() {
        return this.mParameter;
    }

    @Override // com.paymaya.domain.model.BillerDynamicField
    @Nullable
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.BillerDynamicField
    public BillerDynamicField.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillerDynamicField{mParameter=");
        sb2.append(this.mParameter);
        sb2.append(", mValue=");
        sb2.append(this.mValue);
        sb2.append(", mLabel=");
        return s.p(sb2, this.mLabel, "}");
    }
}
