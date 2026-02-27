package androidx.ads.identifier;

import We.s;
import androidx.ads.identifier.AdvertisingIdInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AdvertisingIdInfo extends AdvertisingIdInfo {
    private final String id;
    private final boolean limitAdTrackingEnabled;
    private final String providerPackageName;

    public static final class Builder extends AdvertisingIdInfo.Builder {
        private String id;
        private Boolean limitAdTrackingEnabled;
        private String providerPackageName;

        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo build() {
            String strI = this.id == null ? " id" : "";
            if (this.providerPackageName == null) {
                strI = s.i(strI, " providerPackageName");
            }
            if (this.limitAdTrackingEnabled == null) {
                strI = s.i(strI, " limitAdTrackingEnabled");
            }
            if (strI.isEmpty()) {
                return new AutoValue_AdvertisingIdInfo(this.id, this.providerPackageName, this.limitAdTrackingEnabled.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setId(String str) {
            if (str == null) {
                throw new NullPointerException("Null id");
            }
            this.id = str;
            return this;
        }

        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setLimitAdTrackingEnabled(boolean z4) {
            this.limitAdTrackingEnabled = Boolean.valueOf(z4);
            return this;
        }

        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setProviderPackageName(String str) {
            if (str == null) {
                throw new NullPointerException("Null providerPackageName");
            }
            this.providerPackageName = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdvertisingIdInfo) {
            AdvertisingIdInfo advertisingIdInfo = (AdvertisingIdInfo) obj;
            if (this.id.equals(advertisingIdInfo.getId()) && this.providerPackageName.equals(advertisingIdInfo.getProviderPackageName()) && this.limitAdTrackingEnabled == advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    @NonNull
    public String getId() {
        return this.id;
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    @NonNull
    public String getProviderPackageName() {
        return this.providerPackageName;
    }

    public int hashCode() {
        return ((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.providerPackageName.hashCode()) * 1000003) ^ (this.limitAdTrackingEnabled ? 1231 : 1237);
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    public boolean isLimitAdTrackingEnabled() {
        return this.limitAdTrackingEnabled;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertisingIdInfo{id=");
        sb2.append(this.id);
        sb2.append(", providerPackageName=");
        sb2.append(this.providerPackageName);
        sb2.append(", limitAdTrackingEnabled=");
        return s.s(sb2, this.limitAdTrackingEnabled, "}");
    }

    private AutoValue_AdvertisingIdInfo(String str, String str2, boolean z4) {
        this.id = str;
        this.providerPackageName = str2;
        this.limitAdTrackingEnabled = z4;
    }
}
