package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.BillerField;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerField, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerField extends BillerField {
    private final String mDisplayValue;
    private final boolean mIsHidden;
    private final boolean mIsRequired;
    private final String mParameter;
    private final String mPlaceholder;
    private final String mRegex;
    private final String mType;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerField$Builder */
    public static class Builder extends BillerField.Builder {
        private String mDisplayValue;
        private Boolean mIsHidden;
        private Boolean mIsRequired;
        private String mParameter;
        private String mPlaceholder;
        private String mRegex;
        private String mType;
        private String mValue;

        public /* synthetic */ Builder(BillerField billerField, int i) {
            this(billerField);
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField build() {
            String strI = this.mIsRequired == null ? " mIsRequired" : "";
            if (this.mIsHidden == null) {
                strI = s.i(strI, " mIsHidden");
            }
            if (strI.isEmpty()) {
                return new AutoValue_BillerField(this.mValue, this.mType, this.mDisplayValue, this.mParameter, this.mPlaceholder, this.mIsRequired.booleanValue(), this.mIsHidden.booleanValue(), this.mRegex);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mDisplayValue(@Nullable String str) {
            this.mDisplayValue = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mIsHidden(boolean z4) {
            this.mIsHidden = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mIsRequired(boolean z4) {
            this.mIsRequired = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mParameter(@Nullable String str) {
            this.mParameter = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mPlaceholder(@Nullable String str) {
            this.mPlaceholder = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mRegex(@Nullable String str) {
            this.mRegex = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mType(@Nullable String str) {
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerField.Builder
        public BillerField.Builder mValue(@Nullable String str) {
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerField billerField) {
            this.mValue = billerField.mValue();
            this.mType = billerField.mType();
            this.mDisplayValue = billerField.mDisplayValue();
            this.mParameter = billerField.mParameter();
            this.mPlaceholder = billerField.mPlaceholder();
            this.mIsRequired = Boolean.valueOf(billerField.mIsRequired());
            this.mIsHidden = Boolean.valueOf(billerField.mIsHidden());
            this.mRegex = billerField.mRegex();
        }
    }

    public C$$AutoValue_BillerField(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, boolean z5, @Nullable String str6) {
        this.mValue = str;
        this.mType = str2;
        this.mDisplayValue = str3;
        this.mParameter = str4;
        this.mPlaceholder = str5;
        this.mIsRequired = z4;
        this.mIsHidden = z5;
        this.mRegex = str6;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerField) {
            BillerField billerField = (BillerField) obj;
            String str2 = this.mValue;
            if (str2 != null ? str2.equals(billerField.mValue()) : billerField.mValue() == null) {
                String str3 = this.mType;
                if (str3 != null ? str3.equals(billerField.mType()) : billerField.mType() == null) {
                    String str4 = this.mDisplayValue;
                    if (str4 != null ? str4.equals(billerField.mDisplayValue()) : billerField.mDisplayValue() == null) {
                        String str5 = this.mParameter;
                        if (str5 != null ? str5.equals(billerField.mParameter()) : billerField.mParameter() == null) {
                            String str6 = this.mPlaceholder;
                            if (str6 != null ? str6.equals(billerField.mPlaceholder()) : billerField.mPlaceholder() == null) {
                                if (this.mIsRequired == billerField.mIsRequired() && this.mIsHidden == billerField.mIsHidden() && ((str = this.mRegex) != null ? str.equals(billerField.mRegex()) : billerField.mRegex() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mValue;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mType;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mDisplayValue;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mParameter;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mPlaceholder;
        int iHashCode5 = (((((iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ (this.mIsRequired ? 1231 : 1237)) * 1000003) ^ (this.mIsHidden ? 1231 : 1237)) * 1000003;
        String str6 = this.mRegex;
        return iHashCode5 ^ (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mDisplayValue() {
        return this.mDisplayValue;
    }

    @Override // com.paymaya.domain.model.BillerField
    public boolean mIsHidden() {
        return this.mIsHidden;
    }

    @Override // com.paymaya.domain.model.BillerField
    public boolean mIsRequired() {
        return this.mIsRequired;
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mParameter() {
        return this.mParameter;
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mPlaceholder() {
        return this.mPlaceholder;
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mRegex() {
        return this.mRegex;
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.BillerField
    @Nullable
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.BillerField
    public BillerField.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillerField{mValue=");
        sb2.append(this.mValue);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mDisplayValue=");
        sb2.append(this.mDisplayValue);
        sb2.append(", mParameter=");
        sb2.append(this.mParameter);
        sb2.append(", mPlaceholder=");
        sb2.append(this.mPlaceholder);
        sb2.append(", mIsRequired=");
        sb2.append(this.mIsRequired);
        sb2.append(", mIsHidden=");
        sb2.append(this.mIsHidden);
        sb2.append(", mRegex=");
        return s.p(sb2, this.mRegex, "}");
    }
}
