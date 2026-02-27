package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes2.dex */
public class ServerConfiguration {
    public static final int DEFAULT_CAPTURE = 1;
    public static final boolean DEFAULT_GEN3_ENABLED = false;
    public static final int DEFAULT_MAX_BEACON_SIZE_KB_APPMON = 30;
    public static final int DEFAULT_MAX_BEACON_SIZE_KB_SAAS = 150;
    public static final int DEFAULT_MAX_CACHED_CRASHES = 0;
    public static final int DEFAULT_MULTIPLICITY = 1;
    public static final boolean DEFAULT_SELFMONITORING = true;
    public static final int DEFAULT_SEND_INTERVAL_SEC = 120;
    public static final int DEFAULT_SERVERID = 1;
    private static final Status DEFAULT_STATUS = Status.OK;
    public static final boolean DEFAULT_SWITCH_SERVER = false;
    public static final int DEFAULT_TRAFFIC_CONTROL_PERCENTAGE = 100;
    public static final int NU_POST_SIZE = 5;
    private final int capture;
    private final boolean gen3Enabled;
    private final int maxBeaconSizeKb;
    private final int maxCachedCrashesCount;
    private final int multiplicity;
    private final RageTapConfiguration rageTapConfiguration;
    private final ReplayConfiguration replayConfiguration;
    private final boolean selfmonitoring;
    private final int sendIntervalSec;
    private final int serverId;
    private final SessionSplitConfiguration sessionSplitConfiguration;
    private final Status status;
    private final boolean switchServer;
    private final long timestamp;
    private final int trafficControlPercentage;

    public enum Status {
        OK,
        ERROR
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServerConfiguration serverConfiguration = (ServerConfiguration) obj;
            if (this.maxBeaconSizeKb == serverConfiguration.maxBeaconSizeKb && this.selfmonitoring == serverConfiguration.selfmonitoring && this.sessionSplitConfiguration.equals(serverConfiguration.sessionSplitConfiguration) && this.sendIntervalSec == serverConfiguration.sendIntervalSec && this.maxCachedCrashesCount == serverConfiguration.maxCachedCrashesCount && this.rageTapConfiguration.equals(serverConfiguration.rageTapConfiguration) && this.capture == serverConfiguration.capture && this.trafficControlPercentage == serverConfiguration.trafficControlPercentage && this.gen3Enabled == serverConfiguration.gen3Enabled && this.replayConfiguration.equals(serverConfiguration.replayConfiguration) && this.multiplicity == serverConfiguration.multiplicity && this.serverId == serverConfiguration.serverId && this.switchServer == serverConfiguration.switchServer && this.timestamp == serverConfiguration.timestamp && this.status == serverConfiguration.status) {
                return true;
            }
        }
        return false;
    }

    public int getCapture() {
        return this.capture;
    }

    public int getMaxBeaconSizeKb() {
        return this.maxBeaconSizeKb;
    }

    public int getMaxCachedCrashesCount() {
        return this.maxCachedCrashesCount;
    }

    public int getMultiplicity() {
        return this.multiplicity;
    }

    public RageTapConfiguration getRageTapConfiguration() {
        return this.rageTapConfiguration;
    }

    public ReplayConfiguration getReplayConfiguration() {
        return this.replayConfiguration;
    }

    public int getSendIntervalSec() {
        return this.sendIntervalSec;
    }

    public int getServerId() {
        return this.serverId;
    }

    public SessionSplitConfiguration getSessionSplitConfiguration() {
        return this.sessionSplitConfiguration;
    }

    public Status getStatus() {
        return this.status;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getTrafficControlPercentage() {
        return this.trafficControlPercentage;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + ((((((((this.replayConfiguration.hashCode() + ((((((((this.rageTapConfiguration.hashCode() + ((((((this.sessionSplitConfiguration.hashCode() + (((this.maxBeaconSizeKb * 31) + (this.selfmonitoring ? 1 : 0)) * 31)) * 31) + this.sendIntervalSec) * 31) + this.maxCachedCrashesCount) * 31)) * 31) + this.capture) * 31) + this.trafficControlPercentage) * 31) + (this.gen3Enabled ? 1 : 0)) * 31)) * 31) + this.multiplicity) * 31) + this.serverId) * 31) + (this.switchServer ? 1 : 0)) * 31)) * 31;
        long j = this.timestamp;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public boolean isCachingCrashes() {
        return this.maxCachedCrashesCount > 0;
    }

    public boolean isCaptureOn() {
        return this.capture == 1;
    }

    public boolean isGen3Enabled() {
        return this.gen3Enabled;
    }

    public boolean isSelfmonitoring() {
        return this.selfmonitoring;
    }

    public boolean isSwitchServer() {
        return this.switchServer;
    }

    public long maxSendLength() {
        return (((long) this.maxBeaconSizeKb) * 1024) - 5;
    }

    public Builder newBuilder(boolean z4) {
        return new Builder(this, z4);
    }

    public String toString() {
        return "ServerConfiguration{maxBeaconSizeKb=" + this.maxBeaconSizeKb + ", selfmonitoring=" + this.selfmonitoring + ", sessionSplitConfiguration=" + this.sessionSplitConfiguration + ", sendIntervalSec=" + this.sendIntervalSec + ", maxCachedCrashesCount=" + this.maxCachedCrashesCount + ", rageTapConfiguration=" + this.rageTapConfiguration + ", capture=" + this.capture + ", trafficControlPercentage=" + this.trafficControlPercentage + ", gen3Enabled=" + this.gen3Enabled + ", replayConfiguration=" + this.replayConfiguration + ", multiplicity=" + this.multiplicity + ", serverId=" + this.serverId + ", switchServer=" + this.switchServer + ", status=" + this.status + ", timestamp=" + this.timestamp + '}';
    }

    private ServerConfiguration(Builder builder) {
        this.maxBeaconSizeKb = builder.maxBeaconSizeKb;
        this.selfmonitoring = builder.selfmonitoring;
        this.sessionSplitConfiguration = builder.sessionSplitConfiguration;
        this.sendIntervalSec = builder.sendIntervalSec;
        this.maxCachedCrashesCount = builder.maxCachedCrashesCount;
        this.rageTapConfiguration = builder.rageTapConfiguration;
        this.capture = builder.capture;
        this.trafficControlPercentage = builder.trafficControlPercentage;
        this.replayConfiguration = builder.replayConfiguration;
        this.gen3Enabled = builder.gen3Enabled;
        this.multiplicity = builder.multiplicity;
        this.serverId = builder.serverId;
        this.switchServer = builder.switchServer;
        this.timestamp = builder.timestamp;
        this.status = builder.status;
    }

    public Builder newBuilder() {
        return newBuilder(false);
    }

    public static class Builder {
        private int capture;
        private boolean gen3Enabled;
        private int maxBeaconSizeKb;
        private int maxCachedCrashesCount;
        private int multiplicity;
        private RageTapConfiguration rageTapConfiguration;
        private ReplayConfiguration replayConfiguration;
        private boolean selfmonitoring;
        private int sendIntervalSec;
        private int serverId;
        private SessionSplitConfiguration sessionSplitConfiguration;
        private Status status;
        private boolean switchServer;
        private long timestamp;
        private int trafficControlPercentage;

        public Builder() {
            this.maxBeaconSizeKb = ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS;
            this.selfmonitoring = true;
            this.sessionSplitConfiguration = SessionSplitConfiguration.DEFAULT_SESSION_SPLIT_CONFIGURATION;
            this.sendIntervalSec = 120;
            this.maxCachedCrashesCount = 0;
            this.rageTapConfiguration = RageTapConfiguration.DEFAULT_RAGE_TAP_CONFIGURATION;
            this.capture = 1;
            this.trafficControlPercentage = 100;
            this.gen3Enabled = false;
            this.replayConfiguration = ReplayConfiguration.DEFAULT_REPLAY_CONFIGURATION;
            this.multiplicity = 1;
            this.serverId = 1;
            this.switchServer = false;
            this.status = ServerConfiguration.DEFAULT_STATUS;
            this.timestamp = 0L;
        }

        public ServerConfiguration build() {
            return new ServerConfiguration(this);
        }

        public Builder withCapture(int i) {
            this.capture = i;
            return this;
        }

        public Builder withCaptureOff() {
            this.capture = 0;
            return this;
        }

        public Builder withGen3Enabled(boolean z4) {
            this.gen3Enabled = z4;
            return this;
        }

        public Builder withMaxBeaconSizeKb(int i) {
            this.maxBeaconSizeKb = i;
            return this;
        }

        public Builder withMaxCachedCrashesCount(int i) {
            this.maxCachedCrashesCount = i;
            return this;
        }

        public Builder withMultiplicity(int i) {
            this.multiplicity = i;
            return this;
        }

        public Builder withRageTapConfiguration(RageTapConfiguration rageTapConfiguration) {
            this.rageTapConfiguration = rageTapConfiguration;
            return this;
        }

        public Builder withReplayConfiguration(ReplayConfiguration replayConfiguration) {
            this.replayConfiguration = replayConfiguration;
            return this;
        }

        public Builder withSelfmonitoring(boolean z4) {
            this.selfmonitoring = z4;
            return this;
        }

        public Builder withSendIntervalSec(int i) {
            this.sendIntervalSec = i;
            return this;
        }

        public Builder withServerId(int i) {
            this.serverId = i;
            return this;
        }

        public Builder withSessionSplitConfiguration(SessionSplitConfiguration sessionSplitConfiguration) {
            this.sessionSplitConfiguration = sessionSplitConfiguration;
            return this;
        }

        public Builder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public Builder withSwitchServer(boolean z4) {
            this.switchServer = z4;
            return this;
        }

        public Builder withTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public Builder withTrafficControlPercentage(int i) {
            this.trafficControlPercentage = i;
            return this;
        }

        public Builder(ServerConfiguration serverConfiguration, boolean z4) {
            this.maxBeaconSizeKb = serverConfiguration.maxBeaconSizeKb;
            this.selfmonitoring = serverConfiguration.selfmonitoring;
            this.sessionSplitConfiguration = serverConfiguration.sessionSplitConfiguration;
            this.sendIntervalSec = serverConfiguration.sendIntervalSec;
            this.maxCachedCrashesCount = serverConfiguration.maxCachedCrashesCount;
            this.rageTapConfiguration = serverConfiguration.rageTapConfiguration;
            this.capture = serverConfiguration.capture;
            this.trafficControlPercentage = serverConfiguration.trafficControlPercentage;
            this.gen3Enabled = serverConfiguration.gen3Enabled;
            this.replayConfiguration = serverConfiguration.replayConfiguration.newBuilder().build();
            this.timestamp = serverConfiguration.timestamp;
            if (!z4) {
                this.multiplicity = serverConfiguration.multiplicity;
                this.serverId = serverConfiguration.serverId;
                this.switchServer = serverConfiguration.switchServer;
                this.status = serverConfiguration.status;
                return;
            }
            this.multiplicity = 1;
            this.serverId = 1;
            this.switchServer = false;
            this.status = ServerConfiguration.DEFAULT_STATUS;
        }

        public Builder(ServerConfiguration serverConfiguration) {
            this(serverConfiguration, false);
        }
    }
}
