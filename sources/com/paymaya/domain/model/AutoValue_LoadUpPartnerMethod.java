package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.LoadUpPartnerMethod;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoadUpPartnerMethod extends LoadUpPartnerMethod {
    private final String mLoadUpPartnerId;
    private final String mLoadUpPartnerName;
    private final int mMethodType;

    public static final class Builder extends LoadUpPartnerMethod.Builder {
        private String mLoadUpPartnerId;
        private String mLoadUpPartnerName;
        private Integer mMethodType;

        @Override // com.paymaya.domain.model.LoadUpPartnerMethod.Builder
        public LoadUpPartnerMethod build() {
            String strI = this.mMethodType == null ? " mMethodType" : "";
            if (this.mLoadUpPartnerName == null) {
                strI = strI.concat(" mLoadUpPartnerName");
            }
            if (this.mLoadUpPartnerId == null) {
                strI = s.i(strI, " mLoadUpPartnerId");
            }
            if (strI.isEmpty()) {
                return new AutoValue_LoadUpPartnerMethod(this.mMethodType.intValue(), 0, this.mLoadUpPartnerName, this.mLoadUpPartnerId);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.LoadUpPartnerMethod.Builder
        public LoadUpPartnerMethod.Builder mLoadUpPartnerId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLoadUpPartnerId");
            }
            this.mLoadUpPartnerId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartnerMethod.Builder
        public LoadUpPartnerMethod.Builder mLoadUpPartnerName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLoadUpPartnerName");
            }
            this.mLoadUpPartnerName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartnerMethod.Builder
        public LoadUpPartnerMethod.Builder mMethodType(int i) {
            this.mMethodType = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ AutoValue_LoadUpPartnerMethod(int i, int i4, String str, String str2) {
        this(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoadUpPartnerMethod) {
            LoadUpPartnerMethod loadUpPartnerMethod = (LoadUpPartnerMethod) obj;
            if (this.mMethodType == loadUpPartnerMethod.mMethodType() && this.mLoadUpPartnerName.equals(loadUpPartnerMethod.mLoadUpPartnerName()) && this.mLoadUpPartnerId.equals(loadUpPartnerMethod.mLoadUpPartnerId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mMethodType ^ 1000003) * 1000003) ^ this.mLoadUpPartnerName.hashCode()) * 1000003) ^ this.mLoadUpPartnerId.hashCode();
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerMethod
    public String mLoadUpPartnerId() {
        return this.mLoadUpPartnerId;
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerMethod
    public String mLoadUpPartnerName() {
        return this.mLoadUpPartnerName;
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerMethod
    public int mMethodType() {
        return this.mMethodType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoadUpPartnerMethod{mMethodType=");
        sb2.append(this.mMethodType);
        sb2.append(", mLoadUpPartnerName=");
        sb2.append(this.mLoadUpPartnerName);
        sb2.append(", mLoadUpPartnerId=");
        return s.p(sb2, this.mLoadUpPartnerId, "}");
    }

    private AutoValue_LoadUpPartnerMethod(int i, String str, String str2) {
        this.mMethodType = i;
        this.mLoadUpPartnerName = str;
        this.mLoadUpPartnerId = str2;
    }
}
