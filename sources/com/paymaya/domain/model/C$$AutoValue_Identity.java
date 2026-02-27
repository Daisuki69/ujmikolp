package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.Identity;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Identity, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Identity extends Identity {
    private final String mRegistrationId;
    private final String mType;
    private final String mValue;
    private final Boolean mVerified;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Identity$Builder */
    public static class Builder extends Identity.Builder {
        private String mRegistrationId;
        private String mType;
        private String mValue;
        private Boolean mVerified;

        @Override // com.paymaya.domain.model.Identity.Builder
        public Identity build() {
            String strI = this.mType == null ? " mType" : "";
            if (this.mValue == null) {
                strI = s.i(strI, " mValue");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Identity(this.mType, this.mValue, this.mVerified, this.mRegistrationId);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Identity.Builder
        public Identity.Builder mRegistrationId(@Nullable String str) {
            this.mRegistrationId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Identity.Builder
        public Identity.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Identity.Builder
        public Identity.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Identity.Builder
        public Identity.Builder mVerified(@Nullable Boolean bool) {
            this.mVerified = bool;
            return this;
        }
    }

    public C$$AutoValue_Identity(String str, String str2, @Nullable Boolean bool, @Nullable String str3) {
        if (str == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str2;
        this.mVerified = bool;
        this.mRegistrationId = str3;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identity) {
            Identity identity = (Identity) obj;
            if (this.mType.equals(identity.mType()) && this.mValue.equals(identity.mValue()) && ((bool = this.mVerified) != null ? bool.equals(identity.mVerified()) : identity.mVerified() == null) && ((str = this.mRegistrationId) != null ? str.equals(identity.mRegistrationId()) : identity.mRegistrationId() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mValue.hashCode()) * 1000003;
        Boolean bool = this.mVerified;
        int iHashCode2 = (iHashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str = this.mRegistrationId;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Identity
    @Nullable
    @InterfaceC1498b("registration_id")
    public String mRegistrationId() {
        return this.mRegistrationId;
    }

    @Override // com.paymaya.domain.model.Identity
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.Identity
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.Identity
    @Nullable
    @InterfaceC1498b("verified")
    public Boolean mVerified() {
        return this.mVerified;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Identity{mType=");
        sb2.append(this.mType);
        sb2.append(", mValue=");
        sb2.append(this.mValue);
        sb2.append(", mVerified=");
        sb2.append(this.mVerified);
        sb2.append(", mRegistrationId=");
        return s.p(sb2, this.mRegistrationId, "}");
    }
}
