package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.FundSource;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FundSource, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FundSource extends FundSource {
    private final CardProfile mCardProfile;
    private final String mId;
    private final String mName;
    private final String mStatus;
    private final Boolean mTransactionEnabled;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FundSource$Builder */
    public static class Builder extends FundSource.Builder {
        private CardProfile mCardProfile;
        private String mId;
        private String mName;
        private String mStatus;
        private Boolean mTransactionEnabled;
        private String mType;

        public /* synthetic */ Builder(FundSource fundSource, int i) {
            this(fundSource);
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource build() {
            return new AutoValue_FundSource(this.mName, this.mStatus, this.mType, this.mId, this.mTransactionEnabled, this.mCardProfile);
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mCardProfile(CardProfile cardProfile) {
            this.mCardProfile = cardProfile;
            return this;
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mName(String str) {
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mStatus(String str) {
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mTransactionEnabled(Boolean bool) {
            this.mTransactionEnabled = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.FundSource.Builder
        public FundSource.Builder mType(String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(FundSource fundSource) {
            this.mName = fundSource.mName();
            this.mStatus = fundSource.mStatus();
            this.mType = fundSource.mType();
            this.mId = fundSource.mId();
            this.mTransactionEnabled = fundSource.mTransactionEnabled();
            this.mCardProfile = fundSource.mCardProfile();
        }
    }

    public C$$AutoValue_FundSource(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable CardProfile cardProfile) {
        this.mName = str;
        this.mStatus = str2;
        this.mType = str3;
        this.mId = str4;
        this.mTransactionEnabled = bool;
        this.mCardProfile = cardProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FundSource) {
            FundSource fundSource = (FundSource) obj;
            String str = this.mName;
            if (str != null ? str.equals(fundSource.mName()) : fundSource.mName() == null) {
                String str2 = this.mStatus;
                if (str2 != null ? str2.equals(fundSource.mStatus()) : fundSource.mStatus() == null) {
                    String str3 = this.mType;
                    if (str3 != null ? str3.equals(fundSource.mType()) : fundSource.mType() == null) {
                        String str4 = this.mId;
                        if (str4 != null ? str4.equals(fundSource.mId()) : fundSource.mId() == null) {
                            Boolean bool = this.mTransactionEnabled;
                            if (bool != null ? bool.equals(fundSource.mTransactionEnabled()) : fundSource.mTransactionEnabled() == null) {
                                CardProfile cardProfile = this.mCardProfile;
                                if (cardProfile != null ? cardProfile.equals(fundSource.mCardProfile()) : fundSource.mCardProfile() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mStatus;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mType;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mId;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Boolean bool = this.mTransactionEnabled;
        int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CardProfile cardProfile = this.mCardProfile;
        return iHashCode5 ^ (cardProfile != null ? cardProfile.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b("card_profile")
    public CardProfile mCardProfile() {
        return this.mCardProfile;
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b("transaction_enabled")
    public Boolean mTransactionEnabled() {
        return this.mTransactionEnabled;
    }

    @Override // com.paymaya.domain.model.FundSource
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.FundSource
    public FundSource.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "FundSource{mName=" + this.mName + ", mStatus=" + this.mStatus + ", mType=" + this.mType + ", mId=" + this.mId + ", mTransactionEnabled=" + this.mTransactionEnabled + ", mCardProfile=" + this.mCardProfile + "}";
    }
}
