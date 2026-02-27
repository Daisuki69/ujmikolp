package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.DisplayName;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_DisplayName, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_DisplayName extends DisplayName {
    private final String mFirstName;
    private final String mLastName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_DisplayName$Builder */
    public static class Builder extends DisplayName.Builder {
        private String mFirstName;
        private String mLastName;

        public /* synthetic */ Builder(DisplayName displayName, int i) {
            this(displayName);
        }

        @Override // com.paymaya.domain.model.DisplayName.Builder
        public DisplayName build() {
            String strI = this.mFirstName == null ? " mFirstName" : "";
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_DisplayName(this.mFirstName, this.mLastName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.DisplayName.Builder
        public DisplayName.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.DisplayName.Builder
        public DisplayName.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(DisplayName displayName) {
            this.mFirstName = displayName.mFirstName();
            this.mLastName = displayName.mLastName();
        }
    }

    public C$$AutoValue_DisplayName(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mFirstName");
        }
        this.mFirstName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mLastName");
        }
        this.mLastName = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DisplayName) {
            DisplayName displayName = (DisplayName) obj;
            if (this.mFirstName.equals(displayName.mFirstName()) && this.mLastName.equals(displayName.mLastName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mFirstName.hashCode() ^ 1000003) * 1000003) ^ this.mLastName.hashCode();
    }

    @Override // com.paymaya.domain.model.DisplayName
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.DisplayName
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.DisplayName
    public DisplayName.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayName{mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mLastName=");
        return s.p(sb2, this.mLastName, "}");
    }
}
