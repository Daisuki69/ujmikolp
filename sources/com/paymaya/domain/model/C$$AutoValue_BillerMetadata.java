package com.paymaya.domain.model;

import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.BillerMetadata;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerMetadata, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerMetadata extends BillerMetadata {
    private final String mAccountNumberPlaceHolder;
    private final String mAmountPlaceHolder;
    private final Boolean mIsAccountNumberDisabled;
    private final List<String> mNotes;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerMetadata$Builder */
    public static class Builder extends BillerMetadata.Builder {
        private String mAccountNumberPlaceHolder;
        private String mAmountPlaceHolder;
        private Boolean mIsAccountNumberDisabled;
        private List<String> mNotes;

        public /* synthetic */ Builder(BillerMetadata billerMetadata, int i) {
            this(billerMetadata);
        }

        @Override // com.paymaya.domain.model.BillerMetadata.Builder
        public BillerMetadata build() {
            return new AutoValue_BillerMetadata(this.mNotes, this.mAccountNumberPlaceHolder, this.mAmountPlaceHolder, this.mIsAccountNumberDisabled);
        }

        @Override // com.paymaya.domain.model.BillerMetadata.Builder
        public BillerMetadata.Builder mAccountNumberPlaceHolder(String str) {
            this.mAccountNumberPlaceHolder = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerMetadata.Builder
        public BillerMetadata.Builder mAmountPlaceHolder(String str) {
            this.mAmountPlaceHolder = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerMetadata.Builder
        public BillerMetadata.Builder mIsAccountNumberDisabled(Boolean bool) {
            this.mIsAccountNumberDisabled = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerMetadata.Builder
        public BillerMetadata.Builder mNotes(List<String> list) {
            this.mNotes = list;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerMetadata billerMetadata) {
            this.mNotes = billerMetadata.mNotes();
            this.mAccountNumberPlaceHolder = billerMetadata.mAccountNumberPlaceHolder();
            this.mAmountPlaceHolder = billerMetadata.mAmountPlaceHolder();
            this.mIsAccountNumberDisabled = billerMetadata.mIsAccountNumberDisabled();
        }
    }

    public C$$AutoValue_BillerMetadata(List<String> list, String str, String str2, Boolean bool) {
        this.mNotes = list;
        this.mAccountNumberPlaceHolder = str;
        this.mAmountPlaceHolder = str2;
        this.mIsAccountNumberDisabled = bool;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerMetadata) {
            BillerMetadata billerMetadata = (BillerMetadata) obj;
            List<String> list = this.mNotes;
            if (list != null ? list.equals(billerMetadata.mNotes()) : billerMetadata.mNotes() == null) {
                String str = this.mAccountNumberPlaceHolder;
                if (str != null ? str.equals(billerMetadata.mAccountNumberPlaceHolder()) : billerMetadata.mAccountNumberPlaceHolder() == null) {
                    String str2 = this.mAmountPlaceHolder;
                    if (str2 != null ? str2.equals(billerMetadata.mAmountPlaceHolder()) : billerMetadata.mAmountPlaceHolder() == null) {
                        Boolean bool = this.mIsAccountNumberDisabled;
                        if (bool != null ? bool.equals(billerMetadata.mIsAccountNumberDisabled()) : billerMetadata.mIsAccountNumberDisabled() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.mNotes;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        String str = this.mAccountNumberPlaceHolder;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mAmountPlaceHolder;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.mIsAccountNumberDisabled;
        return iHashCode3 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillerMetadata
    @InterfaceC1498b("accountNumberPlaceholder")
    public String mAccountNumberPlaceHolder() {
        return this.mAccountNumberPlaceHolder;
    }

    @Override // com.paymaya.domain.model.BillerMetadata
    @InterfaceC1498b("amountPlaceholder")
    public String mAmountPlaceHolder() {
        return this.mAmountPlaceHolder;
    }

    @Override // com.paymaya.domain.model.BillerMetadata
    @InterfaceC1498b("isAccountNumberDisabled")
    public Boolean mIsAccountNumberDisabled() {
        return this.mIsAccountNumberDisabled;
    }

    @Override // com.paymaya.domain.model.BillerMetadata
    @InterfaceC1498b("notes")
    public List<String> mNotes() {
        return this.mNotes;
    }

    @Override // com.paymaya.domain.model.BillerMetadata
    public BillerMetadata.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillerMetadata{mNotes=");
        sb2.append(this.mNotes);
        sb2.append(", mAccountNumberPlaceHolder=");
        sb2.append(this.mAccountNumberPlaceHolder);
        sb2.append(", mAmountPlaceHolder=");
        sb2.append(this.mAmountPlaceHolder);
        sb2.append(", mIsAccountNumberDisabled=");
        return AbstractC1213b.N(sb2, this.mIsAccountNumberDisabled, "}");
    }
}
