package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.VoucherDenomination;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherDenomination, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VoucherDenomination extends VoucherDenomination {
    private final String mStringValue;
    private final String mType;
    private final double mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherDenomination$Builder */
    public static class Builder extends VoucherDenomination.Builder {
        private String mStringValue;
        private String mType;
        private Double mValue;

        @Override // com.paymaya.domain.model.VoucherDenomination.Builder
        public VoucherDenomination build() {
            String strI = this.mType == null ? " mType" : "";
            if (this.mValue == null) {
                strI = s.i(strI, " mValue");
            }
            if (strI.isEmpty()) {
                return new AutoValue_VoucherDenomination(this.mType, this.mStringValue, this.mValue.doubleValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.VoucherDenomination.Builder
        public VoucherDenomination.Builder mStringValue(@Nullable String str) {
            this.mStringValue = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherDenomination.Builder
        public VoucherDenomination.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherDenomination.Builder
        public VoucherDenomination.Builder mValue(double d10) {
            this.mValue = Double.valueOf(d10);
            return this;
        }
    }

    public C$$AutoValue_VoucherDenomination(String str, @Nullable String str2, double d10) {
        if (str == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str;
        this.mStringValue = str2;
        this.mValue = d10;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoucherDenomination) {
            VoucherDenomination voucherDenomination = (VoucherDenomination) obj;
            if (this.mType.equals(voucherDenomination.mType()) && ((str = this.mStringValue) != null ? str.equals(voucherDenomination.mStringValue()) : voucherDenomination.mStringValue() == null) && Double.doubleToLongBits(this.mValue) == Double.doubleToLongBits(voucherDenomination.mValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mType.hashCode() ^ 1000003) * 1000003;
        String str = this.mStringValue;
        return ((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.mValue) >>> 32) ^ Double.doubleToLongBits(this.mValue)));
    }

    @Override // com.paymaya.domain.model.VoucherDenomination
    @Nullable
    @InterfaceC1498b(alternate = {"stringValue"}, value = "string_value")
    public String mStringValue() {
        return this.mStringValue;
    }

    @Override // com.paymaya.domain.model.VoucherDenomination
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.VoucherDenomination
    @InterfaceC1498b("value")
    public double mValue() {
        return this.mValue;
    }

    public String toString() {
        return "VoucherDenomination{mType=" + this.mType + ", mStringValue=" + this.mStringValue + ", mValue=" + this.mValue + "}";
    }
}
