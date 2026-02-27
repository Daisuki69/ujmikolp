package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.InstapayAccount;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_InstapayAccount, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_InstapayAccount extends InstapayAccount {
    private final String mName;
    private final String mNumber;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_InstapayAccount$Builder */
    public static class Builder extends InstapayAccount.Builder {
        private String mName;
        private String mNumber;
        private String mType;

        @Override // com.paymaya.domain.model.InstapayAccount.Builder
        public InstapayAccount build() {
            String strI = this.mType == null ? " mType" : "";
            if (this.mNumber == null) {
                strI = s.i(strI, " mNumber");
            }
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_InstapayAccount(this.mType, this.mNumber, this.mName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.InstapayAccount.Builder
        public InstapayAccount.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InstapayAccount.Builder
        public InstapayAccount.Builder mNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mNumber");
            }
            this.mNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InstapayAccount.Builder
        public InstapayAccount.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }
    }

    public C$$AutoValue_InstapayAccount(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mNumber");
        }
        this.mNumber = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstapayAccount) {
            InstapayAccount instapayAccount = (InstapayAccount) obj;
            if (this.mType.equals(instapayAccount.mType()) && this.mNumber.equals(instapayAccount.mNumber()) && this.mName.equals(instapayAccount.mName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mNumber.hashCode()) * 1000003) ^ this.mName.hashCode();
    }

    @Override // com.paymaya.domain.model.InstapayAccount
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.InstapayAccount
    @InterfaceC1498b("number")
    public String mNumber() {
        return this.mNumber;
    }

    @Override // com.paymaya.domain.model.InstapayAccount
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstapayAccount{mType=");
        sb2.append(this.mType);
        sb2.append(", mNumber=");
        sb2.append(this.mNumber);
        sb2.append(", mName=");
        return s.p(sb2, this.mName, "}");
    }
}
