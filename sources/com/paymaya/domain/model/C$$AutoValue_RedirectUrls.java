package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.RedirectUrls;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_RedirectUrls, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_RedirectUrls extends RedirectUrls {
    private final String mCancel;
    private final String mFailure;
    private final String mSuccess;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_RedirectUrls$Builder */
    public static class Builder extends RedirectUrls.Builder {
        private String mCancel;
        private String mFailure;
        private String mSuccess;

        public /* synthetic */ Builder(RedirectUrls redirectUrls, int i) {
            this(redirectUrls);
        }

        @Override // com.paymaya.domain.model.RedirectUrls.Builder
        public RedirectUrls build() {
            String strI = this.mSuccess == null ? " mSuccess" : "";
            if (this.mFailure == null) {
                strI = s.i(strI, " mFailure");
            }
            if (this.mCancel == null) {
                strI = s.i(strI, " mCancel");
            }
            if (strI.isEmpty()) {
                return new AutoValue_RedirectUrls(this.mSuccess, this.mFailure, this.mCancel);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.RedirectUrls.Builder
        public RedirectUrls.Builder mCancel(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCancel");
            }
            this.mCancel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.RedirectUrls.Builder
        public RedirectUrls.Builder mFailure(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFailure");
            }
            this.mFailure = str;
            return this;
        }

        @Override // com.paymaya.domain.model.RedirectUrls.Builder
        public RedirectUrls.Builder mSuccess(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSuccess");
            }
            this.mSuccess = str;
            return this;
        }

        public Builder() {
        }

        private Builder(RedirectUrls redirectUrls) {
            this.mSuccess = redirectUrls.mSuccess();
            this.mFailure = redirectUrls.mFailure();
            this.mCancel = redirectUrls.mCancel();
        }
    }

    public C$$AutoValue_RedirectUrls(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null mSuccess");
        }
        this.mSuccess = str;
        if (str2 == null) {
            throw new NullPointerException("Null mFailure");
        }
        this.mFailure = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mCancel");
        }
        this.mCancel = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RedirectUrls) {
            RedirectUrls redirectUrls = (RedirectUrls) obj;
            if (this.mSuccess.equals(redirectUrls.mSuccess()) && this.mFailure.equals(redirectUrls.mFailure()) && this.mCancel.equals(redirectUrls.mCancel())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mSuccess.hashCode() ^ 1000003) * 1000003) ^ this.mFailure.hashCode()) * 1000003) ^ this.mCancel.hashCode();
    }

    @Override // com.paymaya.domain.model.RedirectUrls
    @InterfaceC1498b("cancel")
    public String mCancel() {
        return this.mCancel;
    }

    @Override // com.paymaya.domain.model.RedirectUrls
    @InterfaceC1498b("failure")
    public String mFailure() {
        return this.mFailure;
    }

    @Override // com.paymaya.domain.model.RedirectUrls
    @InterfaceC1498b("success")
    public String mSuccess() {
        return this.mSuccess;
    }

    @Override // com.paymaya.domain.model.RedirectUrls
    public RedirectUrls.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RedirectUrls{mSuccess=");
        sb2.append(this.mSuccess);
        sb2.append(", mFailure=");
        sb2.append(this.mFailure);
        sb2.append(", mCancel=");
        return s.p(sb2, this.mCancel, "}");
    }
}
