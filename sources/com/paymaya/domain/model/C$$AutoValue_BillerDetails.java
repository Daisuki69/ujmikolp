package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.BillerDetails;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerDetails extends BillerDetails {
    private final String mAccountNumber;
    private final Boolean mActive;
    private final String mCategory;
    private final String mCategorySlug;
    private final ImageUrlUnfiltered mConfirmationUrl;
    private final List<BillerDynamicField> mDynamicFields;
    private final Boolean mHasOtherCharges;
    private final ImageUrlUnfiltered mIconUrl;
    private final ImageUrlUnfiltered mListUrl;
    private final BillerMetadata mMetadata;
    private final String mName;
    private final List<UIComponent> mOtherFields;
    private final String mSlug;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerDetails$Builder */
    public static class Builder extends BillerDetails.Builder {
        private String mAccountNumber;
        private Boolean mActive;
        private String mCategory;
        private String mCategorySlug;
        private ImageUrlUnfiltered mConfirmationUrl;
        private List<BillerDynamicField> mDynamicFields;
        private Boolean mHasOtherCharges;
        private ImageUrlUnfiltered mIconUrl;
        private ImageUrlUnfiltered mListUrl;
        private BillerMetadata mMetadata;
        private String mName;
        private List<UIComponent> mOtherFields;
        private String mSlug;

        public /* synthetic */ Builder(BillerDetails billerDetails, int i) {
            this(billerDetails);
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails build() {
            String str = this.mSlug == null ? " mSlug" : "";
            if (str.isEmpty()) {
                return new AutoValue_BillerDetails(this.mName, this.mSlug, this.mHasOtherCharges, this.mOtherFields, this.mCategory, this.mCategorySlug, this.mActive, this.mListUrl, this.mIconUrl, this.mConfirmationUrl, this.mAccountNumber, this.mDynamicFields, this.mMetadata);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mAccountNumber(@Nullable String str) {
            this.mAccountNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mActive(@Nullable Boolean bool) {
            this.mActive = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mCategorySlug(@Nullable String str) {
            this.mCategorySlug = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mConfirmationUrl(@Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mConfirmationUrl = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mDynamicFields(@Nullable List<BillerDynamicField> list) {
            this.mDynamicFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mHasOtherCharges(@Nullable Boolean bool) {
            this.mHasOtherCharges = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mIconUrl(@Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mIconUrl = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mListUrl(@Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mListUrl = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mMetadata(@Nullable BillerMetadata billerMetadata) {
            this.mMetadata = billerMetadata;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mName(@Nullable String str) {
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mOtherFields(@Nullable List<UIComponent> list) {
            this.mOtherFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerDetails.Builder
        public BillerDetails.Builder mSlug(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSlug");
            }
            this.mSlug = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerDetails billerDetails) {
            this.mName = billerDetails.mName();
            this.mSlug = billerDetails.mSlug();
            this.mHasOtherCharges = billerDetails.mHasOtherCharges();
            this.mOtherFields = billerDetails.mOtherFields();
            this.mCategory = billerDetails.mCategory();
            this.mCategorySlug = billerDetails.mCategorySlug();
            this.mActive = billerDetails.mActive();
            this.mListUrl = billerDetails.mListUrl();
            this.mIconUrl = billerDetails.mIconUrl();
            this.mConfirmationUrl = billerDetails.mConfirmationUrl();
            this.mAccountNumber = billerDetails.mAccountNumber();
            this.mDynamicFields = billerDetails.mDynamicFields();
            this.mMetadata = billerDetails.mMetadata();
        }
    }

    public C$$AutoValue_BillerDetails(@Nullable String str, String str2, @Nullable Boolean bool, @Nullable List<UIComponent> list, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable ImageUrlUnfiltered imageUrlUnfiltered, @Nullable ImageUrlUnfiltered imageUrlUnfiltered2, @Nullable ImageUrlUnfiltered imageUrlUnfiltered3, @Nullable String str5, @Nullable List<BillerDynamicField> list2, @Nullable BillerMetadata billerMetadata) {
        this.mName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mSlug");
        }
        this.mSlug = str2;
        this.mHasOtherCharges = bool;
        this.mOtherFields = list;
        this.mCategory = str3;
        this.mCategorySlug = str4;
        this.mActive = bool2;
        this.mListUrl = imageUrlUnfiltered;
        this.mIconUrl = imageUrlUnfiltered2;
        this.mConfirmationUrl = imageUrlUnfiltered3;
        this.mAccountNumber = str5;
        this.mDynamicFields = list2;
        this.mMetadata = billerMetadata;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        List<UIComponent> list;
        String str;
        String str2;
        Boolean bool2;
        ImageUrlUnfiltered imageUrlUnfiltered;
        ImageUrlUnfiltered imageUrlUnfiltered2;
        ImageUrlUnfiltered imageUrlUnfiltered3;
        String str3;
        List<BillerDynamicField> list2;
        BillerMetadata billerMetadata;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerDetails) {
            BillerDetails billerDetails = (BillerDetails) obj;
            String str4 = this.mName;
            if (str4 != null ? str4.equals(billerDetails.mName()) : billerDetails.mName() == null) {
                if (this.mSlug.equals(billerDetails.mSlug()) && ((bool = this.mHasOtherCharges) != null ? bool.equals(billerDetails.mHasOtherCharges()) : billerDetails.mHasOtherCharges() == null) && ((list = this.mOtherFields) != null ? list.equals(billerDetails.mOtherFields()) : billerDetails.mOtherFields() == null) && ((str = this.mCategory) != null ? str.equals(billerDetails.mCategory()) : billerDetails.mCategory() == null) && ((str2 = this.mCategorySlug) != null ? str2.equals(billerDetails.mCategorySlug()) : billerDetails.mCategorySlug() == null) && ((bool2 = this.mActive) != null ? bool2.equals(billerDetails.mActive()) : billerDetails.mActive() == null) && ((imageUrlUnfiltered = this.mListUrl) != null ? imageUrlUnfiltered.equals(billerDetails.mListUrl()) : billerDetails.mListUrl() == null) && ((imageUrlUnfiltered2 = this.mIconUrl) != null ? imageUrlUnfiltered2.equals(billerDetails.mIconUrl()) : billerDetails.mIconUrl() == null) && ((imageUrlUnfiltered3 = this.mConfirmationUrl) != null ? imageUrlUnfiltered3.equals(billerDetails.mConfirmationUrl()) : billerDetails.mConfirmationUrl() == null) && ((str3 = this.mAccountNumber) != null ? str3.equals(billerDetails.mAccountNumber()) : billerDetails.mAccountNumber() == null) && ((list2 = this.mDynamicFields) != null ? list2.equals(billerDetails.mDynamicFields()) : billerDetails.mDynamicFields() == null) && ((billerMetadata = this.mMetadata) != null ? billerMetadata.equals(billerDetails.mMetadata()) : billerDetails.mMetadata() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mSlug.hashCode()) * 1000003;
        Boolean bool = this.mHasOtherCharges;
        int iHashCode2 = (iHashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        List<UIComponent> list = this.mOtherFields;
        int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.mCategory;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mCategorySlug;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Boolean bool2 = this.mActive;
        int iHashCode6 = (iHashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered = this.mListUrl;
        int iHashCode7 = (iHashCode6 ^ (imageUrlUnfiltered == null ? 0 : imageUrlUnfiltered.hashCode())) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered2 = this.mIconUrl;
        int iHashCode8 = (iHashCode7 ^ (imageUrlUnfiltered2 == null ? 0 : imageUrlUnfiltered2.hashCode())) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered3 = this.mConfirmationUrl;
        int iHashCode9 = (iHashCode8 ^ (imageUrlUnfiltered3 == null ? 0 : imageUrlUnfiltered3.hashCode())) * 1000003;
        String str4 = this.mAccountNumber;
        int iHashCode10 = (iHashCode9 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List<BillerDynamicField> list2 = this.mDynamicFields;
        int iHashCode11 = (iHashCode10 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        BillerMetadata billerMetadata = this.mMetadata;
        return iHashCode11 ^ (billerMetadata != null ? billerMetadata.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("account_number")
    public String mAccountNumber() {
        return this.mAccountNumber;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public Boolean mActive() {
        return this.mActive;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("category")
    public String mCategory() {
        return this.mCategory;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("categorySlug")
    public String mCategorySlug() {
        return this.mCategorySlug;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("confirmationUrl")
    public ImageUrlUnfiltered mConfirmationUrl() {
        return this.mConfirmationUrl;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("other_fields")
    public List<BillerDynamicField> mDynamicFields() {
        return this.mDynamicFields;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("hasOtherCharges")
    public Boolean mHasOtherCharges() {
        return this.mHasOtherCharges;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("iconUrl")
    public ImageUrlUnfiltered mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("listUrl")
    public ImageUrlUnfiltered mListUrl() {
        return this.mListUrl;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    public BillerMetadata mMetadata() {
        return this.mMetadata;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @Nullable
    @InterfaceC1498b("otherFields")
    public List<UIComponent> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    @InterfaceC1498b("slug")
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.BillerDetails
    public BillerDetails.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "BillerDetails{mName=" + this.mName + ", mSlug=" + this.mSlug + ", mHasOtherCharges=" + this.mHasOtherCharges + ", mOtherFields=" + this.mOtherFields + ", mCategory=" + this.mCategory + ", mCategorySlug=" + this.mCategorySlug + ", mActive=" + this.mActive + ", mListUrl=" + this.mListUrl + ", mIconUrl=" + this.mIconUrl + ", mConfirmationUrl=" + this.mConfirmationUrl + ", mAccountNumber=" + this.mAccountNumber + ", mDynamicFields=" + this.mDynamicFields + ", mMetadata=" + this.mMetadata + "}";
    }
}
