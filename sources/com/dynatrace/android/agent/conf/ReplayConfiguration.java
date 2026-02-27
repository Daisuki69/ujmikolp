package com.dynatrace.android.agent.conf;

import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayConfiguration {
    public static final boolean DEFAULT_COLOR_MASKING_ENABLED = false;
    public static final boolean DEFAULT_COMPOSE_ENABLED = true;
    public static final int DEFAULT_PROTOCOL_VERSION = 1;
    public static final boolean DEFAULT_REPLAY_CAPTURE = false;
    public static final ReplayConfiguration DEFAULT_REPLAY_CONFIGURATION = builder().build();
    public static final boolean DEFAULT_REPLAY_CRASHES_ENABLED = false;
    public static final boolean DEFAULT_REPLAY_FULL_SESSION_CONFIG_RECEIVED = false;
    public static final boolean DEFAULT_REPLAY_PIXEL_COPY_ENABLED = false;
    public static final int DEFAULT_REPLAY_SELFMONITORING = 0;
    public static final int DEFAULT_REPLAY_TRAFFIC_CONTROL_PERCENTAGE = 0;
    public static final int DEFAULT_RETENTION_TIME = 0;
    private final boolean capture;
    private final boolean colorMaskingEnabled;
    private final boolean composeEnabled;
    private final boolean crashesEnabled;
    private final boolean fullSessionConfigReceived;
    private final boolean pixelCopyEnabled;
    private final int protocolVersion;
    private final int retentionTimeInMinutes;
    private final int selfMonitoring;
    private final int trafficControlPercentage;

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ReplayConfiguration.class == obj.getClass()) {
            ReplayConfiguration replayConfiguration = (ReplayConfiguration) obj;
            if (this.capture == replayConfiguration.capture && this.fullSessionConfigReceived == replayConfiguration.fullSessionConfigReceived && this.retentionTimeInMinutes == replayConfiguration.retentionTimeInMinutes && this.crashesEnabled == replayConfiguration.crashesEnabled && this.protocolVersion == replayConfiguration.protocolVersion && this.selfMonitoring == replayConfiguration.selfMonitoring && this.trafficControlPercentage == replayConfiguration.trafficControlPercentage && this.pixelCopyEnabled == replayConfiguration.pixelCopyEnabled && this.colorMaskingEnabled == replayConfiguration.colorMaskingEnabled && this.composeEnabled == replayConfiguration.composeEnabled) {
                return true;
            }
        }
        return false;
    }

    public boolean getCrashesEnabled() {
        return this.crashesEnabled;
    }

    public boolean getFullSessionConfigReceived() {
        return this.fullSessionConfigReceived;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public int getRetentionTimeInMinutes() {
        return this.retentionTimeInMinutes;
    }

    public int getSelfMonitoring() {
        return this.selfMonitoring;
    }

    public int getTrafficControlPercentage() {
        return this.trafficControlPercentage;
    }

    public int hashCode() {
        int i = (((((((this.capture ? 1 : 0) * 31) + (this.fullSessionConfigReceived ? 1 : 0)) * 31) + (this.crashesEnabled ? 1 : 0)) * 31) + this.trafficControlPercentage) * 31;
        int i4 = this.retentionTimeInMinutes;
        return ((((((((((i + (i4 ^ (i4 >>> 32))) * 31) + this.protocolVersion) * 31) + this.selfMonitoring) * 31) + (this.pixelCopyEnabled ? 1 : 0)) * 31) + (this.colorMaskingEnabled ? 1 : 0)) * 31) + (this.composeEnabled ? 1 : 0);
    }

    public boolean isCaptureOn() {
        return this.capture;
    }

    public boolean isColorMaskingEnabled() {
        return this.colorMaskingEnabled;
    }

    public boolean isComposeEnabled() {
        return this.composeEnabled;
    }

    public boolean isPixelCopyEnabled() {
        return this.pixelCopyEnabled;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayConfiguration{capture=");
        sb2.append(this.capture);
        sb2.append(", fullSessionConfigReceived=");
        sb2.append(this.fullSessionConfigReceived);
        sb2.append(", crashesEnabled=");
        sb2.append(this.crashesEnabled);
        sb2.append(", trafficControlPercentage=");
        sb2.append(this.trafficControlPercentage);
        sb2.append(", retentionTime=");
        sb2.append(this.retentionTimeInMinutes);
        sb2.append(", protocolVersion=");
        sb2.append(this.protocolVersion);
        sb2.append(", selfMonitoring=");
        sb2.append(this.selfMonitoring);
        sb2.append(", pixelCopy=");
        sb2.append(this.pixelCopyEnabled);
        sb2.append(", colorMasking=");
        sb2.append(this.colorMaskingEnabled);
        sb2.append(", composeEnabled=");
        return a.q(sb2, this.composeEnabled, '}');
    }

    private ReplayConfiguration(Builder builder) {
        this.capture = builder.capture;
        this.fullSessionConfigReceived = builder.fullSessionConfigReceived;
        this.crashesEnabled = builder.crashesEnabled;
        this.trafficControlPercentage = builder.trafficControlPercentage;
        this.retentionTimeInMinutes = builder.retentionTimeInMinutes;
        this.protocolVersion = builder.protocolVersion;
        this.selfMonitoring = builder.selfMonitoring;
        this.pixelCopyEnabled = builder.pixelCopyEnabled;
        this.colorMaskingEnabled = builder.colorMaskingEnabled;
        this.composeEnabled = builder.composeEnabled;
    }

    public static class Builder {
        private boolean capture;
        private boolean colorMaskingEnabled;
        private boolean composeEnabled;
        private boolean crashesEnabled;
        private boolean fullSessionConfigReceived;
        private boolean pixelCopyEnabled;
        private int protocolVersion;
        private int retentionTimeInMinutes;
        private int selfMonitoring;
        private int trafficControlPercentage;

        public Builder() {
            this.capture = false;
            this.fullSessionConfigReceived = false;
            this.crashesEnabled = false;
            this.trafficControlPercentage = 0;
            this.retentionTimeInMinutes = 0;
            this.protocolVersion = 1;
            this.selfMonitoring = 0;
            this.pixelCopyEnabled = false;
            this.colorMaskingEnabled = false;
            this.composeEnabled = true;
        }

        public ReplayConfiguration build() {
            return new ReplayConfiguration(this);
        }

        public Builder withCapture(boolean z4) {
            this.capture = z4;
            return this;
        }

        public Builder withColorMaskingEnabled(boolean z4) {
            this.colorMaskingEnabled = z4;
            return this;
        }

        public Builder withComposeEnabled(boolean z4) {
            this.composeEnabled = z4;
            return this;
        }

        public Builder withCrashesEnabled(boolean z4) {
            this.crashesEnabled = z4;
            return this;
        }

        public Builder withFullSessionConfigReceived(boolean z4) {
            this.fullSessionConfigReceived = z4;
            return this;
        }

        public Builder withPixelCopyEnabled(boolean z4) {
            this.pixelCopyEnabled = z4;
            return this;
        }

        public Builder withProtocolVersion(int i) {
            this.protocolVersion = i;
            return this;
        }

        public Builder withRetentionTimeInMinutes(int i) {
            this.retentionTimeInMinutes = i;
            return this;
        }

        public Builder withSelfMonitoring(int i) {
            this.selfMonitoring = i;
            return this;
        }

        public Builder withTrafficControlPercentage(int i) {
            this.trafficControlPercentage = i;
            return this;
        }

        public Builder(ReplayConfiguration replayConfiguration) {
            this.capture = replayConfiguration.capture;
            this.fullSessionConfigReceived = replayConfiguration.fullSessionConfigReceived;
            this.crashesEnabled = replayConfiguration.crashesEnabled;
            this.trafficControlPercentage = replayConfiguration.trafficControlPercentage;
            this.retentionTimeInMinutes = replayConfiguration.retentionTimeInMinutes;
            this.protocolVersion = replayConfiguration.protocolVersion;
            this.selfMonitoring = replayConfiguration.selfMonitoring;
            this.pixelCopyEnabled = replayConfiguration.pixelCopyEnabled;
            this.colorMaskingEnabled = replayConfiguration.colorMaskingEnabled;
            this.composeEnabled = replayConfiguration.composeEnabled;
        }
    }
}
