package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.BillerCategory;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerCategory, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerCategory extends BillerCategory {
    private final String mListUrl;
    private final String mName;
    private final String mSlug;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerCategory$Builder */
    public static class Builder extends BillerCategory.Builder {
        private String mListUrl;
        private String mName;
        private String mSlug;

        public /* synthetic */ Builder(BillerCategory billerCategory, int i) {
            this(billerCategory);
        }

        @Override // com.paymaya.domain.model.BillerCategory.Builder
        public BillerCategory build() {
            String strI = this.mName == null ? " mName" : "";
            if (this.mSlug == null) {
                strI = s.i(strI, " mSlug");
            }
            if (strI.isEmpty()) {
                return new AutoValue_BillerCategory(this.mName, this.mSlug, this.mListUrl);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.BillerCategory.Builder
        public BillerCategory.Builder mListUrl(String str) {
            this.mListUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerCategory.Builder
        public BillerCategory.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerCategory.Builder
        public BillerCategory.Builder mSlug(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSlug");
            }
            this.mSlug = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerCategory billerCategory) {
            this.mName = billerCategory.mName();
            this.mSlug = billerCategory.mSlug();
            this.mListUrl = billerCategory.mListUrl();
        }
    }

    public C$$AutoValue_BillerCategory(String str, String str2, @Nullable String str3) {
        if (str == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mSlug");
        }
        this.mSlug = str2;
        this.mListUrl = str3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerCategory) {
            BillerCategory billerCategory = (BillerCategory) obj;
            if (this.mName.equals(billerCategory.mName()) && this.mSlug.equals(billerCategory.mSlug()) && ((str = this.mListUrl) != null ? str.equals(billerCategory.mListUrl()) : billerCategory.mListUrl() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mName.hashCode() ^ 1000003) * 1000003) ^ this.mSlug.hashCode()) * 1000003;
        String str = this.mListUrl;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.paymaya.domain.model.BillerCategory
    @Nullable
    @InterfaceC1498b("iconUrl")
    public String mListUrl() {
        return this.mListUrl;
    }

    @Override // com.paymaya.domain.model.BillerCategory
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.BillerCategory
    @InterfaceC1498b("slug")
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.BillerCategory
    public BillerCategory.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillerCategory{mName=");
        sb2.append(this.mName);
        sb2.append(", mSlug=");
        sb2.append(this.mSlug);
        sb2.append(", mListUrl=");
        return s.p(sb2, this.mListUrl, "}");
    }
}
