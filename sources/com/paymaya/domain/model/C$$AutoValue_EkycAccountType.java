package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.EkycAccountType;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycAccountType, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_EkycAccountType extends EkycAccountType {
    private final String mAccountType;
    private final String mClassification;
    private final String mName;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycAccountType$Builder */
    public static class Builder extends EkycAccountType.Builder {
        private String mAccountType;
        private String mClassification;
        private String mName;
        private String mType;

        @Override // com.paymaya.domain.model.EkycAccountType.Builder
        public EkycAccountType build() {
            String strI = this.mAccountType == null ? " mAccountType" : "";
            if (this.mClassification == null) {
                strI = s.i(strI, " mClassification");
            }
            if (this.mType == null) {
                strI = s.i(strI, " mType");
            }
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_EkycAccountType(this.mAccountType, this.mClassification, this.mType, this.mName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.EkycAccountType.Builder
        public EkycAccountType.Builder mAccountType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAccountType");
            }
            this.mAccountType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycAccountType.Builder
        public EkycAccountType.Builder mClassification(String str) {
            if (str == null) {
                throw new NullPointerException("Null mClassification");
            }
            this.mClassification = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycAccountType.Builder
        public EkycAccountType.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycAccountType.Builder
        public EkycAccountType.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }
    }

    public C$$AutoValue_EkycAccountType(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null mAccountType");
        }
        this.mAccountType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mClassification");
        }
        this.mClassification = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EkycAccountType) {
            EkycAccountType ekycAccountType = (EkycAccountType) obj;
            if (this.mAccountType.equals(ekycAccountType.mAccountType()) && this.mClassification.equals(ekycAccountType.mClassification()) && this.mType.equals(ekycAccountType.mType()) && this.mName.equals(ekycAccountType.mName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.mAccountType.hashCode() ^ 1000003) * 1000003) ^ this.mClassification.hashCode()) * 1000003) ^ this.mType.hashCode()) * 1000003) ^ this.mName.hashCode();
    }

    @Override // com.paymaya.domain.model.EkycAccountType
    @InterfaceC1498b("account_type")
    public String mAccountType() {
        return this.mAccountType;
    }

    @Override // com.paymaya.domain.model.EkycAccountType
    @InterfaceC1498b("classification")
    public String mClassification() {
        return this.mClassification;
    }

    @Override // com.paymaya.domain.model.EkycAccountType
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.EkycAccountType
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EkycAccountType{mAccountType=");
        sb2.append(this.mAccountType);
        sb2.append(", mClassification=");
        sb2.append(this.mClassification);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mName=");
        return s.p(sb2, this.mName, "}");
    }
}
