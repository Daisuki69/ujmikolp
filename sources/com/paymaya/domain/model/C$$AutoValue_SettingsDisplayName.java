package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.SettingsDisplayName;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_SettingsDisplayName, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_SettingsDisplayName extends SettingsDisplayName {
    private final DisplayName mDisplayName;
    private final boolean mIsEnabled;
    private final String mUpdatedDate;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_SettingsDisplayName$Builder */
    public static class Builder extends SettingsDisplayName.Builder {
        private DisplayName mDisplayName;
        private Boolean mIsEnabled;
        private String mUpdatedDate;

        public /* synthetic */ Builder(SettingsDisplayName settingsDisplayName, int i) {
            this(settingsDisplayName);
        }

        @Override // com.paymaya.domain.model.SettingsDisplayName.Builder
        public SettingsDisplayName build() {
            String strI = this.mDisplayName == null ? " mDisplayName" : "";
            if (this.mIsEnabled == null) {
                strI = s.i(strI, " mIsEnabled");
            }
            if (this.mUpdatedDate == null) {
                strI = s.i(strI, " mUpdatedDate");
            }
            if (strI.isEmpty()) {
                return new AutoValue_SettingsDisplayName(this.mDisplayName, this.mIsEnabled.booleanValue(), this.mUpdatedDate);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.SettingsDisplayName.Builder
        public SettingsDisplayName.Builder mDisplayName(DisplayName displayName) {
            if (displayName == null) {
                throw new NullPointerException("Null mDisplayName");
            }
            this.mDisplayName = displayName;
            return this;
        }

        @Override // com.paymaya.domain.model.SettingsDisplayName.Builder
        public SettingsDisplayName.Builder mIsEnabled(boolean z4) {
            this.mIsEnabled = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.SettingsDisplayName.Builder
        public SettingsDisplayName.Builder mUpdatedDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mUpdatedDate");
            }
            this.mUpdatedDate = str;
            return this;
        }

        public Builder() {
        }

        private Builder(SettingsDisplayName settingsDisplayName) {
            this.mDisplayName = settingsDisplayName.mDisplayName();
            this.mIsEnabled = Boolean.valueOf(settingsDisplayName.mIsEnabled());
            this.mUpdatedDate = settingsDisplayName.mUpdatedDate();
        }
    }

    public C$$AutoValue_SettingsDisplayName(DisplayName displayName, boolean z4, String str) {
        if (displayName == null) {
            throw new NullPointerException("Null mDisplayName");
        }
        this.mDisplayName = displayName;
        this.mIsEnabled = z4;
        if (str == null) {
            throw new NullPointerException("Null mUpdatedDate");
        }
        this.mUpdatedDate = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsDisplayName) {
            SettingsDisplayName settingsDisplayName = (SettingsDisplayName) obj;
            if (this.mDisplayName.equals(settingsDisplayName.mDisplayName()) && this.mIsEnabled == settingsDisplayName.mIsEnabled() && this.mUpdatedDate.equals(settingsDisplayName.mUpdatedDate())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mDisplayName.hashCode() ^ 1000003) * 1000003) ^ (this.mIsEnabled ? 1231 : 1237)) * 1000003) ^ this.mUpdatedDate.hashCode();
    }

    @Override // com.paymaya.domain.model.SettingsDisplayName
    @InterfaceC1498b("display_name")
    public DisplayName mDisplayName() {
        return this.mDisplayName;
    }

    @Override // com.paymaya.domain.model.SettingsDisplayName
    @InterfaceC1498b(Constants.ENABLED)
    public boolean mIsEnabled() {
        return this.mIsEnabled;
    }

    @Override // com.paymaya.domain.model.SettingsDisplayName
    @InterfaceC1498b("updated_date")
    public String mUpdatedDate() {
        return this.mUpdatedDate;
    }

    @Override // com.paymaya.domain.model.SettingsDisplayName
    public SettingsDisplayName.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsDisplayName{mDisplayName=");
        sb2.append(this.mDisplayName);
        sb2.append(", mIsEnabled=");
        sb2.append(this.mIsEnabled);
        sb2.append(", mUpdatedDate=");
        return s.p(sb2, this.mUpdatedDate, "}");
    }
}
