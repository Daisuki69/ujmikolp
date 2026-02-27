package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.MissionReward;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionReward, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionReward extends MissionReward {
    private final String mDescription;
    private final String mName;
    private final String mPreviewIcon;
    private final String mTitle;
    private final String mType;
    private final double mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionReward$Builder */
    public static class Builder extends MissionReward.Builder {
        private String mDescription;
        private String mName;
        private String mPreviewIcon;
        private String mTitle;
        private String mType;
        private Double mValue;

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward build() {
            String str = this.mValue == null ? " mValue" : "";
            if (str.isEmpty()) {
                return new AutoValue_MissionReward(this.mTitle, this.mDescription, this.mPreviewIcon, this.mName, this.mType, this.mValue.doubleValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mDescription(@Nullable String str) {
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mName(@Nullable String str) {
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mPreviewIcon(@Nullable String str) {
            this.mPreviewIcon = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mTitle(@Nullable String str) {
            this.mTitle = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mType(@Nullable String str) {
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionReward.Builder
        public MissionReward.Builder mValue(double d10) {
            this.mValue = Double.valueOf(d10);
            return this;
        }
    }

    public C$$AutoValue_MissionReward(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, double d10) {
        this.mTitle = str;
        this.mDescription = str2;
        this.mPreviewIcon = str3;
        this.mName = str4;
        this.mType = str5;
        this.mValue = d10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionReward) {
            MissionReward missionReward = (MissionReward) obj;
            String str = this.mTitle;
            if (str != null ? str.equals(missionReward.mTitle()) : missionReward.mTitle() == null) {
                String str2 = this.mDescription;
                if (str2 != null ? str2.equals(missionReward.mDescription()) : missionReward.mDescription() == null) {
                    String str3 = this.mPreviewIcon;
                    if (str3 != null ? str3.equals(missionReward.mPreviewIcon()) : missionReward.mPreviewIcon() == null) {
                        String str4 = this.mName;
                        if (str4 != null ? str4.equals(missionReward.mName()) : missionReward.mName() == null) {
                            String str5 = this.mType;
                            if (str5 != null ? str5.equals(missionReward.mType()) : missionReward.mType() == null) {
                                if (Double.doubleToLongBits(this.mValue) == Double.doubleToLongBits(missionReward.mValue())) {
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
        String str = this.mTitle;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mDescription;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mPreviewIcon;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mName;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mType;
        return ((iHashCode4 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.mValue) >>> 32) ^ Double.doubleToLongBits(this.mValue)));
    }

    @Override // com.paymaya.domain.model.MissionReward
    @Nullable
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.MissionReward
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.MissionReward
    @Nullable
    @InterfaceC1498b("preview_icon")
    public String mPreviewIcon() {
        return this.mPreviewIcon;
    }

    @Override // com.paymaya.domain.model.MissionReward
    @Nullable
    @InterfaceC1498b("title")
    public String mTitle() {
        return this.mTitle;
    }

    @Override // com.paymaya.domain.model.MissionReward
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.MissionReward
    @InterfaceC1498b("value")
    public double mValue() {
        return this.mValue;
    }

    public String toString() {
        return "MissionReward{mTitle=" + this.mTitle + ", mDescription=" + this.mDescription + ", mPreviewIcon=" + this.mPreviewIcon + ", mName=" + this.mName + ", mType=" + this.mType + ", mValue=" + this.mValue + "}";
    }
}
