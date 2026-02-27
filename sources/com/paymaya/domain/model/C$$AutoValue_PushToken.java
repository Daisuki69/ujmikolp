package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.PushToken;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PushToken, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PushToken extends PushToken {
    private final String mToken;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PushToken$Builder */
    public static class Builder extends PushToken.Builder {
        private String mToken;

        @Override // com.paymaya.domain.model.PushToken.Builder
        public PushToken build() {
            String str = this.mToken == null ? " mToken" : "";
            if (str.isEmpty()) {
                return new AutoValue_PushToken(this.mToken);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.PushToken.Builder
        public PushToken.Builder mToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null mToken");
            }
            this.mToken = str;
            return this;
        }
    }

    public C$$AutoValue_PushToken(String str) {
        if (str == null) {
            throw new NullPointerException("Null mToken");
        }
        this.mToken = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PushToken) {
            return this.mToken.equals(((PushToken) obj).mToken());
        }
        return false;
    }

    public int hashCode() {
        return this.mToken.hashCode() ^ 1000003;
    }

    @Override // com.paymaya.domain.model.PushToken
    @InterfaceC1498b("push_token")
    public String mToken() {
        return this.mToken;
    }

    public String toString() {
        return s.p(new StringBuilder("PushToken{mToken="), this.mToken, "}");
    }
}
