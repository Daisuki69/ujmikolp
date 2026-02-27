package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.PayMayaErrorAction;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PayMayaErrorAction, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$AutoValue_PayMayaErrorAction extends PayMayaErrorAction {
    private final Boolean isExternal;
    private final String mTitle;
    private final String mUrl;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PayMayaErrorAction$Builder */
    public static class Builder extends PayMayaErrorAction.Builder {
        private Boolean isExternal;
        private String mTitle;
        private String mUrl;

        public /* synthetic */ Builder(PayMayaErrorAction payMayaErrorAction, int i) {
            this(payMayaErrorAction);
        }

        @Override // com.paymaya.domain.model.PayMayaErrorAction.Builder
        public PayMayaErrorAction build() {
            String strI = this.mTitle == null ? " mTitle" : "";
            if (this.mUrl == null) {
                strI = s.i(strI, " mUrl");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PayMayaErrorAction(this.mTitle, this.mUrl, this.isExternal);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PayMayaErrorAction.Builder
        public PayMayaErrorAction.Builder isExternal(Boolean bool) {
            this.isExternal = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaErrorAction.Builder
        public PayMayaErrorAction.Builder mTitle(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTitle");
            }
            this.mTitle = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaErrorAction.Builder
        public PayMayaErrorAction.Builder mUrl(String str) {
            if (str == null) {
                throw new NullPointerException("Null mUrl");
            }
            this.mUrl = str;
            return this;
        }

        public Builder() {
        }

        private Builder(PayMayaErrorAction payMayaErrorAction) {
            this.mTitle = payMayaErrorAction.mTitle();
            this.mUrl = payMayaErrorAction.mUrl();
            this.isExternal = payMayaErrorAction.isExternal();
        }
    }

    public C$AutoValue_PayMayaErrorAction(String str, String str2, Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mTitle");
        }
        this.mTitle = str;
        if (str2 == null) {
            throw new NullPointerException("Null mUrl");
        }
        this.mUrl = str2;
        this.isExternal = bool;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PayMayaErrorAction) {
            PayMayaErrorAction payMayaErrorAction = (PayMayaErrorAction) obj;
            if (this.mTitle.equals(payMayaErrorAction.mTitle()) && this.mUrl.equals(payMayaErrorAction.mUrl()) && ((bool = this.isExternal) != null ? bool.equals(payMayaErrorAction.isExternal()) : payMayaErrorAction.isExternal() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mTitle.hashCode() ^ 1000003) * 1000003) ^ this.mUrl.hashCode()) * 1000003;
        Boolean bool = this.isExternal;
        return iHashCode ^ (bool == null ? 0 : bool.hashCode());
    }

    @Override // com.paymaya.domain.model.PayMayaErrorAction
    @InterfaceC1498b("is_external")
    public Boolean isExternal() {
        return this.isExternal;
    }

    @Override // com.paymaya.domain.model.PayMayaErrorAction
    @InterfaceC1498b("title")
    public String mTitle() {
        return this.mTitle;
    }

    @Override // com.paymaya.domain.model.PayMayaErrorAction
    @InterfaceC1498b(ImagesContract.URL)
    public String mUrl() {
        return this.mUrl;
    }

    @Override // com.paymaya.domain.model.PayMayaErrorAction
    public PayMayaErrorAction.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PayMayaErrorAction{mTitle=");
        sb2.append(this.mTitle);
        sb2.append(", mUrl=");
        sb2.append(this.mUrl);
        sb2.append(", isExternal=");
        return AbstractC1213b.N(sb2, this.isExternal, "}");
    }
}
