package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.LoadUpPartner;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoadUpPartner, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_LoadUpPartner extends LoadUpPartner {
    private final String mChannel;
    private final ImageUrl mIconUrl;
    private final String mId;
    private final Amount mLimitMax;
    private final Amount mLimitMin;
    private final MaintenanceDate mMaintenance;
    private final String mName;
    private final boolean mNoFeeDisplay;
    private final String mNote;
    private final String mSlug;
    private final String mSteps;
    private final String mSubtitle;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoadUpPartner$Builder */
    public static class Builder extends LoadUpPartner.Builder {
        private String mChannel;
        private ImageUrl mIconUrl;
        private String mId;
        private Amount mLimitMax;
        private Amount mLimitMin;
        private MaintenanceDate mMaintenance;
        private String mName;
        private Boolean mNoFeeDisplay;
        private String mNote;
        private String mSlug;
        private String mSteps;
        private String mSubtitle;
        private String mType;

        public /* synthetic */ Builder(LoadUpPartner loadUpPartner, int i) {
            this(loadUpPartner);
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (this.mType == null) {
                strI = s.i(strI, " mType");
            }
            if (this.mLimitMin == null) {
                strI = s.i(strI, " mLimitMin");
            }
            if (this.mLimitMax == null) {
                strI = s.i(strI, " mLimitMax");
            }
            if (this.mMaintenance == null) {
                strI = s.i(strI, " mMaintenance");
            }
            if (this.mIconUrl == null) {
                strI = s.i(strI, " mIconUrl");
            }
            if (this.mSlug == null) {
                strI = s.i(strI, " mSlug");
            }
            if (this.mNoFeeDisplay == null) {
                strI = s.i(strI, " mNoFeeDisplay");
            }
            if (strI.isEmpty()) {
                return new AutoValue_LoadUpPartner(this.mId, this.mName, this.mSubtitle, this.mType, this.mNote, this.mLimitMin, this.mLimitMax, this.mMaintenance, this.mIconUrl, this.mSteps, this.mChannel, this.mSlug, this.mNoFeeDisplay.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mChannel(String str) {
            this.mChannel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mIconUrl(ImageUrl imageUrl) {
            if (imageUrl == null) {
                throw new NullPointerException("Null mIconUrl");
            }
            this.mIconUrl = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mLimitMax(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mLimitMax");
            }
            this.mLimitMax = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mLimitMin(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mLimitMin");
            }
            this.mLimitMin = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mMaintenance(MaintenanceDate maintenanceDate) {
            if (maintenanceDate == null) {
                throw new NullPointerException("Null mMaintenance");
            }
            this.mMaintenance = maintenanceDate;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mNoFeeDisplay(boolean z4) {
            this.mNoFeeDisplay = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mNote(String str) {
            this.mNote = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mSlug(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSlug");
            }
            this.mSlug = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mSteps(@Nullable String str) {
            this.mSteps = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mSubtitle(@Nullable String str) {
            this.mSubtitle = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoadUpPartner.Builder
        public LoadUpPartner.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(LoadUpPartner loadUpPartner) {
            this.mId = loadUpPartner.mId();
            this.mName = loadUpPartner.mName();
            this.mSubtitle = loadUpPartner.mSubtitle();
            this.mType = loadUpPartner.mType();
            this.mNote = loadUpPartner.mNote();
            this.mLimitMin = loadUpPartner.mLimitMin();
            this.mLimitMax = loadUpPartner.mLimitMax();
            this.mMaintenance = loadUpPartner.mMaintenance();
            this.mIconUrl = loadUpPartner.mIconUrl();
            this.mSteps = loadUpPartner.mSteps();
            this.mChannel = loadUpPartner.mChannel();
            this.mSlug = loadUpPartner.mSlug();
            this.mNoFeeDisplay = Boolean.valueOf(loadUpPartner.mNoFeeDisplay());
        }
    }

    public C$$AutoValue_LoadUpPartner(String str, String str2, @Nullable String str3, String str4, @Nullable String str5, Amount amount, Amount amount2, MaintenanceDate maintenanceDate, ImageUrl imageUrl, @Nullable String str6, @Nullable String str7, String str8, boolean z4) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        this.mSubtitle = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str4;
        this.mNote = str5;
        if (amount == null) {
            throw new NullPointerException("Null mLimitMin");
        }
        this.mLimitMin = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mLimitMax");
        }
        this.mLimitMax = amount2;
        if (maintenanceDate == null) {
            throw new NullPointerException("Null mMaintenance");
        }
        this.mMaintenance = maintenanceDate;
        if (imageUrl == null) {
            throw new NullPointerException("Null mIconUrl");
        }
        this.mIconUrl = imageUrl;
        this.mSteps = str6;
        this.mChannel = str7;
        if (str8 == null) {
            throw new NullPointerException("Null mSlug");
        }
        this.mSlug = str8;
        this.mNoFeeDisplay = z4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoadUpPartner) {
            LoadUpPartner loadUpPartner = (LoadUpPartner) obj;
            if (this.mId.equals(loadUpPartner.mId()) && this.mName.equals(loadUpPartner.mName()) && ((str = this.mSubtitle) != null ? str.equals(loadUpPartner.mSubtitle()) : loadUpPartner.mSubtitle() == null) && this.mType.equals(loadUpPartner.mType()) && ((str2 = this.mNote) != null ? str2.equals(loadUpPartner.mNote()) : loadUpPartner.mNote() == null) && this.mLimitMin.equals(loadUpPartner.mLimitMin()) && this.mLimitMax.equals(loadUpPartner.mLimitMax()) && this.mMaintenance.equals(loadUpPartner.mMaintenance()) && this.mIconUrl.equals(loadUpPartner.mIconUrl()) && ((str3 = this.mSteps) != null ? str3.equals(loadUpPartner.mSteps()) : loadUpPartner.mSteps() == null) && ((str4 = this.mChannel) != null ? str4.equals(loadUpPartner.mChannel()) : loadUpPartner.mChannel() == null) && this.mSlug.equals(loadUpPartner.mSlug()) && this.mNoFeeDisplay == loadUpPartner.mNoFeeDisplay()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003;
        String str = this.mSubtitle;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mType.hashCode()) * 1000003;
        String str2 = this.mNote;
        int iHashCode3 = (((((((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.mLimitMin.hashCode()) * 1000003) ^ this.mLimitMax.hashCode()) * 1000003) ^ this.mMaintenance.hashCode()) * 1000003) ^ this.mIconUrl.hashCode()) * 1000003;
        String str3 = this.mSteps;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mChannel;
        return ((((iHashCode4 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ this.mSlug.hashCode()) * 1000003) ^ (this.mNoFeeDisplay ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @Nullable
    @InterfaceC1498b(AppsFlyerProperties.CHANNEL)
    public String mChannel() {
        return this.mChannel;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("icon_url")
    public ImageUrl mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("limit_max")
    public Amount mLimitMax() {
        return this.mLimitMax;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("limit_min")
    public Amount mLimitMin() {
        return this.mLimitMin;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("maintenance")
    public MaintenanceDate mMaintenance() {
        return this.mMaintenance;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("no_fee_display")
    public boolean mNoFeeDisplay() {
        return this.mNoFeeDisplay;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @Nullable
    @InterfaceC1498b("note")
    public String mNote() {
        return this.mNote;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b("slug")
    public String mSlug() {
        return this.mSlug;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @Nullable
    @InterfaceC1498b("steps")
    public String mSteps() {
        return this.mSteps;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @Nullable
    @InterfaceC1498b("subtitle")
    public String mSubtitle() {
        return this.mSubtitle;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.LoadUpPartner
    public LoadUpPartner.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoadUpPartner{mId=");
        sb2.append(this.mId);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mSubtitle=");
        sb2.append(this.mSubtitle);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mNote=");
        sb2.append(this.mNote);
        sb2.append(", mLimitMin=");
        sb2.append(this.mLimitMin);
        sb2.append(", mLimitMax=");
        sb2.append(this.mLimitMax);
        sb2.append(", mMaintenance=");
        sb2.append(this.mMaintenance);
        sb2.append(", mIconUrl=");
        sb2.append(this.mIconUrl);
        sb2.append(", mSteps=");
        sb2.append(this.mSteps);
        sb2.append(", mChannel=");
        sb2.append(this.mChannel);
        sb2.append(", mSlug=");
        sb2.append(this.mSlug);
        sb2.append(", mNoFeeDisplay=");
        return s.s(sb2, this.mNoFeeDisplay, "}");
    }
}
