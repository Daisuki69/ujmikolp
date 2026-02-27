package com.dynatrace.android.agent.conf;

import We.s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class UserPrivacyOptions {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "UserPrivacyOptions");
    private final boolean crashReplayOptedIn;
    private final boolean crashReportingOptedIn;
    private final DataCollectionLevel dataCollectionLevel;
    private final Boolean screenRecordOptedIn;

    public static class Builder {
        private boolean crashReplayOptedIn;
        private boolean crashReportingOptedIn;
        private DataCollectionLevel dataCollectionLevel;
        private Boolean screenRecordOptedIn;

        public UserPrivacyOptions build() {
            return new UserPrivacyOptions(this);
        }

        @Deprecated(since = "8.321")
        public Builder withCrashReplayOptedIn(boolean z4) {
            if (this.screenRecordOptedIn == null) {
                this.crashReplayOptedIn = z4;
            }
            return this;
        }

        public Builder withCrashReportingOptedIn(boolean z4) {
            this.crashReportingOptedIn = z4;
            return this;
        }

        public Builder withDataCollectionLevel(DataCollectionLevel dataCollectionLevel) {
            if (dataCollectionLevel != null) {
                this.dataCollectionLevel = dataCollectionLevel;
                return this;
            }
            if (Global.DEBUG) {
                Utility.zlogE(UserPrivacyOptions.LOGTAG, "dataCollectionLevel == null is not allowed");
            }
            return this;
        }

        public Builder withScreenRecordOptedIn(Boolean bool) {
            this.screenRecordOptedIn = bool;
            if (bool != null) {
                this.crashReplayOptedIn = bool.booleanValue();
            }
            return this;
        }

        public Builder() {
            this.dataCollectionLevel = DataCollectionLevel.OFF;
            this.crashReportingOptedIn = false;
            this.crashReplayOptedIn = false;
            this.screenRecordOptedIn = null;
        }

        private Builder(UserPrivacyOptions userPrivacyOptions) {
            this.dataCollectionLevel = userPrivacyOptions.dataCollectionLevel;
            this.crashReportingOptedIn = userPrivacyOptions.crashReportingOptedIn;
            this.crashReplayOptedIn = userPrivacyOptions.crashReplayOptedIn;
            this.screenRecordOptedIn = userPrivacyOptions.screenRecordOptedIn;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UserPrivacyOptions.class == obj.getClass()) {
            UserPrivacyOptions userPrivacyOptions = (UserPrivacyOptions) obj;
            if (this.dataCollectionLevel == userPrivacyOptions.dataCollectionLevel && this.crashReportingOptedIn == userPrivacyOptions.crashReportingOptedIn && this.crashReplayOptedIn == userPrivacyOptions.crashReplayOptedIn && Objects.equals(this.screenRecordOptedIn, userPrivacyOptions.screenRecordOptedIn)) {
                return true;
            }
        }
        return false;
    }

    public DataCollectionLevel getDataCollectionLevel() {
        return this.dataCollectionLevel;
    }

    public int hashCode() {
        int iHashCode = ((((this.dataCollectionLevel.hashCode() * 31) + (this.crashReportingOptedIn ? 1 : 0)) * 31) + (this.crashReplayOptedIn ? 1 : 0)) * 31;
        Boolean bool = this.screenRecordOptedIn;
        return iHashCode + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    @Deprecated(since = "8.321")
    public boolean isCrashReplayOptedIn() {
        return this.crashReplayOptedIn;
    }

    public boolean isCrashReportingOptedIn() {
        return this.crashReportingOptedIn;
    }

    public Boolean isScreenRecordOptedIn() {
        return this.screenRecordOptedIn;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        return "UserPrivacyOptions{dataCollectionLevel=" + this.dataCollectionLevel + ", crashReportingOptedIn=" + this.crashReportingOptedIn + ", crashReplayOptedIn=" + this.crashReplayOptedIn + ", screenRecordOptedIn=" + this.screenRecordOptedIn + '}';
    }

    private UserPrivacyOptions(Builder builder) {
        this.dataCollectionLevel = builder.dataCollectionLevel;
        this.crashReportingOptedIn = builder.crashReportingOptedIn;
        this.crashReplayOptedIn = builder.crashReplayOptedIn;
        this.screenRecordOptedIn = builder.screenRecordOptedIn;
    }
}
