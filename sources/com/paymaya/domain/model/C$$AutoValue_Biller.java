package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Biller;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Biller, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Biller extends Biller {
    private final String mAccountNumber;
    private final Boolean mActive;
    private final String mCategory;
    private final String mCategorySlug;
    private final ImageUrl mConfirmationUrl;
    private final List<BillerDynamicField> mDynamicFields;
    private final Boolean mHasOtherCharges;
    private final ImageUrl mIconUrl;
    private final ImageUrl mListUrl;
    private final BillerMetadata mMetadata;
    private final String mName;
    private final List<UIComponent> mOtherFields;
    private final List<String> mPaymentMethod;
    private final String mSlug;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Biller$Builder */
    public static class Builder extends Biller.Builder {
        private String mAccountNumber;
        private Boolean mActive;
        private String mCategory;
        private String mCategorySlug;
        private ImageUrl mConfirmationUrl;
        private List<BillerDynamicField> mDynamicFields;
        private Boolean mHasOtherCharges;
        private ImageUrl mIconUrl;
        private ImageUrl mListUrl;
        private BillerMetadata mMetadata;
        private String mName;
        private List<UIComponent> mOtherFields;
        private List<String> mPaymentMethod;
        private String mSlug;

        public /* synthetic */ Builder(Biller biller, int i) {
            this(biller);
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller build() {
            String str = this.mSlug == null ? " mSlug" : "";
            if (str.isEmpty()) {
                return new AutoValue_Biller(this.mName, this.mSlug, this.mHasOtherCharges, this.mOtherFields, this.mCategory, this.mCategorySlug, this.mActive, this.mListUrl, this.mIconUrl, this.mConfirmationUrl, this.mAccountNumber, this.mDynamicFields, this.mPaymentMethod, this.mMetadata);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mAccountNumber(@Nullable String str) {
            this.mAccountNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mActive(@Nullable Boolean bool) {
            this.mActive = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mCategorySlug(@Nullable String str) {
            this.mCategorySlug = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mConfirmationUrl(@Nullable ImageUrl imageUrl) {
            this.mConfirmationUrl = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mDynamicFields(@Nullable List<BillerDynamicField> list) {
            this.mDynamicFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mHasOtherCharges(@Nullable Boolean bool) {
            this.mHasOtherCharges = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mIconUrl(@Nullable ImageUrl imageUrl) {
            this.mIconUrl = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mListUrl(@Nullable ImageUrl imageUrl) {
            this.mListUrl = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mMetadata(@Nullable BillerMetadata billerMetadata) {
            this.mMetadata = billerMetadata;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mName(@Nullable String str) {
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mOtherFields(@Nullable List<UIComponent> list) {
            this.mOtherFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mPaymentMethod(@Nullable List<String> list) {
            this.mPaymentMethod = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Biller.Builder
        public Biller.Builder mSlug(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSlug");
            }
            this.mSlug = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Biller biller) {
            this.mName = biller.mName();
            this.mSlug = biller.mSlug();
            this.mHasOtherCharges = biller.mHasOtherCharges();
            this.mOtherFields = biller.mOtherFields();
            this.mCategory = biller.mCategory();
            this.mCategorySlug = biller.mCategorySlug();
            this.mActive = biller.mActive();
            this.mListUrl = biller.mListUrl();
            this.mIconUrl = biller.mIconUrl();
            this.mConfirmationUrl = biller.mConfirmationUrl();
            this.mAccountNumber = biller.mAccountNumber();
            this.mDynamicFields = biller.mDynamicFields();
            this.mPaymentMethod = biller.mPaymentMethod();
            this.mMetadata = biller.mMetadata();
        }
    }

    public C$$AutoValue_Biller(@Nullable String str, String str2, @Nullable Boolean bool, @Nullable List<UIComponent> list, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable ImageUrl imageUrl, @Nullable ImageUrl imageUrl2, @Nullable ImageUrl imageUrl3, @Nullable String str5, @Nullable List<BillerDynamicField> list2, @Nullable List<String> list3, @Nullable BillerMetadata billerMetadata) {
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
        this.mListUrl = imageUrl;
        this.mIconUrl = imageUrl2;
        this.mConfirmationUrl = imageUrl3;
        this.mAccountNumber = str5;
        this.mDynamicFields = list2;
        this.mPaymentMethod = list3;
        this.mMetadata = billerMetadata;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        List<UIComponent> list;
        String str;
        String str2;
        Boolean bool2;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        ImageUrl imageUrl3;
        String str3;
        List<BillerDynamicField> list2;
        List<String> list3;
        BillerMetadata billerMetadata;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Biller) {
            Biller biller = (Biller) obj;
            String str4 = this.mName;
            if (str4 != null ? str4.equals(biller.mName()) : biller.mName() == null) {
                if (this.mSlug.equals(biller.mSlug()) && ((bool = this.mHasOtherCharges) != null ? bool.equals(biller.mHasOtherCharges()) : biller.mHasOtherCharges() == null) && ((list = this.mOtherFields) != null ? list.equals(biller.mOtherFields()) : biller.mOtherFields() == null) && ((str = this.mCategory) != null ? str.equals(biller.mCategory()) : biller.mCategory() == null) && ((str2 = this.mCategorySlug) != null ? str2.equals(biller.mCategorySlug()) : biller.mCategorySlug() == null) && ((bool2 = this.mActive) != null ? bool2.equals(biller.mActive()) : biller.mActive() == null) && ((imageUrl = this.mListUrl) != null ? imageUrl.equals(biller.mListUrl()) : biller.mListUrl() == null) && ((imageUrl2 = this.mIconUrl) != null ? imageUrl2.equals(biller.mIconUrl()) : biller.mIconUrl() == null) && ((imageUrl3 = this.mConfirmationUrl) != null ? imageUrl3.equals(biller.mConfirmationUrl()) : biller.mConfirmationUrl() == null) && ((str3 = this.mAccountNumber) != null ? str3.equals(biller.mAccountNumber()) : biller.mAccountNumber() == null) && ((list2 = this.mDynamicFields) != null ? list2.equals(biller.mDynamicFields()) : biller.mDynamicFields() == null) && ((list3 = this.mPaymentMethod) != null ? list3.equals(biller.mPaymentMethod()) : biller.mPaymentMethod() == null) && ((billerMetadata = this.mMetadata) != null ? billerMetadata.equals(biller.mMetadata()) : biller.mMetadata() == null)) {
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
        ImageUrl imageUrl = this.mListUrl;
        int iHashCode7 = (iHashCode6 ^ (imageUrl == null ? 0 : imageUrl.hashCode())) * 1000003;
        ImageUrl imageUrl2 = this.mIconUrl;
        int iHashCode8 = (iHashCode7 ^ (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 1000003;
        ImageUrl imageUrl3 = this.mConfirmationUrl;
        int iHashCode9 = (iHashCode8 ^ (imageUrl3 == null ? 0 : imageUrl3.hashCode())) * 1000003;
        String str4 = this.mAccountNumber;
        int iHashCode10 = (iHashCode9 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List<BillerDynamicField> list2 = this.mDynamicFields;
        int iHashCode11 = (iHashCode10 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<String> list3 = this.mPaymentMethod;
        int iHashCode12 = (iHashCode11 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        BillerMetadata billerMetadata = this.mMetadata;
        return iHashCode12 ^ (billerMetadata != null ? billerMetadata.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("account_number")
    public String mAccountNumber() {
        return this.mAccountNumber;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public Boolean mActive() {
        return this.mActive;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("category")
    public String mCategory() {
        return this.mCategory;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("categorySlug")
    public String mCategorySlug() {
        return this.mCategorySlug;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("confirmationUrl")
    public ImageUrl mConfirmationUrl() {
        return this.mConfirmationUrl;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("other_fields")
    public List<BillerDynamicField> mDynamicFields() {
        return this.mDynamicFields;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("hasOtherCharges")
    public Boolean mHasOtherCharges() {
        return this.mHasOtherCharges;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("iconUrl")
    public ImageUrl mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("listUrl")
    public ImageUrl mListUrl() {
        return this.mListUrl;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    public BillerMetadata mMetadata() {
        return this.mMetadata;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("otherFields")
    public List<UIComponent> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.Biller
    @Nullable
    @InterfaceC1498b("paymentMethods")
    public List<String> mPaymentMethod() {
        return this.mPaymentMethod;
    }

    @Override // com.paymaya.domain.model.Biller
    @InterfaceC1498b("slug")
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.Biller
    public Biller.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "Biller{mName=" + this.mName + ", mSlug=" + this.mSlug + ", mHasOtherCharges=" + this.mHasOtherCharges + ", mOtherFields=" + this.mOtherFields + ", mCategory=" + this.mCategory + ", mCategorySlug=" + this.mCategorySlug + ", mActive=" + this.mActive + ", mListUrl=" + this.mListUrl + ", mIconUrl=" + this.mIconUrl + ", mConfirmationUrl=" + this.mConfirmationUrl + ", mAccountNumber=" + this.mAccountNumber + ", mDynamicFields=" + this.mDynamicFields + ", mPaymentMethod=" + this.mPaymentMethod + ", mMetadata=" + this.mMetadata + "}";
    }
}
