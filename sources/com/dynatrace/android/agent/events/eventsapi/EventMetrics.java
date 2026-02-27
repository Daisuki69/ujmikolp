package com.dynatrace.android.agent.events.eventsapi;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public class EventMetrics {
    private final String agentFlavor;
    private final String agentTechnologyType;
    private final String agentVersion;
    private final String appBundle;
    private final String appShortVersion;
    private final String appVersion;
    private final String applicationId;
    private final Integer deviceBatteryLevel;
    private final boolean deviceIsRooted;
    private final String deviceManufacturer;
    private final String deviceModelIdentifier;
    private final String instanceId;
    private final String osName;
    private final String osVersion;
    private final String schemaVersion;
    private final String sessionId;
    private final String windowOrientation;

    public static class Builder {
        private String agentFlavor;
        private String agentTechnologyType;
        private String agentVersion;
        private String appBundle;
        private String appShortVersion;
        private String appVersion;
        private String applicationId;
        private Integer deviceBatteryLevel;
        private boolean deviceIsRooted;
        private String deviceManufacturer;
        private String deviceModelIdentifier;
        private String instanceId;
        private String osName;
        private String osVersion;
        private String schemaVersion;
        private String sessionId;
        private String windowOrientation;

        public EventMetrics build() {
            return new EventMetrics(this);
        }

        public Builder withAgentFlavor(String str) {
            this.agentFlavor = str;
            return this;
        }

        public Builder withAgentTechnologyType(String str) {
            this.agentTechnologyType = str;
            return this;
        }

        public Builder withAgentVersion(String str) {
            this.agentVersion = str;
            return this;
        }

        public Builder withAppBundle(String str) {
            this.appBundle = str;
            return this;
        }

        public Builder withAppShortVersion(String str) {
            this.appShortVersion = str;
            return this;
        }

        public Builder withAppVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder withApplicationId(String str) {
            this.applicationId = str;
            return this;
        }

        public Builder withDeviceBatteryLevel(Integer num) {
            this.deviceBatteryLevel = num;
            return this;
        }

        public Builder withDeviceManufacturer(String str) {
            this.deviceManufacturer = str;
            return this;
        }

        public Builder withDeviceModelIdentifier(String str) {
            this.deviceModelIdentifier = str;
            return this;
        }

        public Builder withDeviceRooted(boolean z4) {
            this.deviceIsRooted = z4;
            return this;
        }

        public Builder withInstanceId(String str) {
            this.instanceId = str;
            return this;
        }

        public Builder withOsName(String str) {
            this.osName = str;
            return this;
        }

        public Builder withOsVersion(String str) {
            this.osVersion = str;
            return this;
        }

        public Builder withSchemaVersion(String str) {
            this.schemaVersion = str;
            return this;
        }

        public Builder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder withWindowOrientation(String str) {
            this.windowOrientation = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EventMetrics eventMetrics = (EventMetrics) obj;
            if (this.deviceIsRooted != eventMetrics.deviceIsRooted) {
                return false;
            }
            String str = this.applicationId;
            if (str == null ? eventMetrics.applicationId != null : !str.equals(eventMetrics.applicationId)) {
                return false;
            }
            String str2 = this.agentVersion;
            if (str2 == null ? eventMetrics.agentVersion != null : !str2.equals(eventMetrics.agentVersion)) {
                return false;
            }
            String str3 = this.agentTechnologyType;
            if (str3 == null ? eventMetrics.agentTechnologyType != null : !str3.equals(eventMetrics.agentTechnologyType)) {
                return false;
            }
            String str4 = this.agentFlavor;
            if (str4 == null ? eventMetrics.agentFlavor != null : !str4.equals(eventMetrics.agentFlavor)) {
                return false;
            }
            String str5 = this.deviceManufacturer;
            if (str5 == null ? eventMetrics.deviceManufacturer != null : !str5.equals(eventMetrics.deviceManufacturer)) {
                return false;
            }
            String str6 = this.deviceModelIdentifier;
            if (str6 == null ? eventMetrics.deviceModelIdentifier != null : !str6.equals(eventMetrics.deviceModelIdentifier)) {
                return false;
            }
            String str7 = this.osName;
            if (str7 == null ? eventMetrics.osName != null : !str7.equals(eventMetrics.osName)) {
                return false;
            }
            String str8 = this.osVersion;
            if (str8 == null ? eventMetrics.osVersion != null : !str8.equals(eventMetrics.osVersion)) {
                return false;
            }
            String str9 = this.appVersion;
            if (str9 == null ? eventMetrics.appVersion != null : !str9.equals(eventMetrics.appVersion)) {
                return false;
            }
            String str10 = this.appShortVersion;
            if (str10 == null ? eventMetrics.appShortVersion != null : !str10.equals(eventMetrics.appShortVersion)) {
                return false;
            }
            String str11 = this.appBundle;
            if (str11 == null ? eventMetrics.appBundle != null : !str11.equals(eventMetrics.appBundle)) {
                return false;
            }
            String str12 = this.instanceId;
            if (str12 == null ? eventMetrics.instanceId != null : !str12.equals(eventMetrics.instanceId)) {
                return false;
            }
            String str13 = this.sessionId;
            if (str13 == null ? eventMetrics.sessionId != null : !str13.equals(eventMetrics.sessionId)) {
                return false;
            }
            Integer num = this.deviceBatteryLevel;
            if (num == null ? eventMetrics.deviceBatteryLevel != null : !num.equals(eventMetrics.deviceBatteryLevel)) {
                return false;
            }
            String str14 = this.schemaVersion;
            if (str14 == null ? eventMetrics.schemaVersion != null : !str14.equals(eventMetrics.schemaVersion)) {
                return false;
            }
            String str15 = this.windowOrientation;
            if (str15 != null) {
                return str15.equals(eventMetrics.windowOrientation);
            }
            if (eventMetrics.windowOrientation == null) {
                return true;
            }
        }
        return false;
    }

    public String getAgentFlavor() {
        return this.agentFlavor;
    }

    public String getAgentTechnologyType() {
        return this.agentTechnologyType;
    }

    public String getAgentVersion() {
        return this.agentVersion;
    }

    public String getAppBundle() {
        return this.appBundle;
    }

    public String getAppShortVersion() {
        return this.appShortVersion;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public Integer getDeviceBatteryLevel() {
        return this.deviceBatteryLevel;
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public String getDeviceModelIdentifier() {
        return this.deviceModelIdentifier;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getOsName() {
        return this.osName;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getWindowOrientation() {
        return this.windowOrientation;
    }

    public int hashCode() {
        String str = this.applicationId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.agentVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.agentTechnologyType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.agentFlavor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.deviceManufacturer;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.deviceModelIdentifier;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.deviceIsRooted ? 1 : 0)) * 31;
        String str7 = this.osName;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.osVersion;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.appVersion;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.appShortVersion;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.appBundle;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.instanceId;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.sessionId;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Integer num = this.deviceBatteryLevel;
        int iHashCode14 = (iHashCode13 + (num != null ? num.hashCode() : 0)) * 31;
        String str14 = this.windowOrientation;
        int iHashCode15 = (iHashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.schemaVersion;
        return iHashCode15 + (str15 != null ? str15.hashCode() : 0);
    }

    public boolean isDeviceRooted() {
        return this.deviceIsRooted;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventMetrics{applicationId='");
        sb2.append(this.applicationId);
        sb2.append("', agentVersion='");
        sb2.append(this.agentVersion);
        sb2.append("', agentTechnologyType='");
        sb2.append(this.agentTechnologyType);
        sb2.append("', agentFlavor='");
        sb2.append(this.agentFlavor);
        sb2.append("', deviceManufacturer='");
        sb2.append(this.deviceManufacturer);
        sb2.append("', deviceModelIdentifier='");
        sb2.append(this.deviceModelIdentifier);
        sb2.append("', deviceIsRooted=");
        sb2.append(this.deviceIsRooted);
        sb2.append(", osName='");
        sb2.append(this.osName);
        sb2.append("', osVersion='");
        sb2.append(this.osVersion);
        sb2.append("', appVersion='");
        sb2.append(this.appVersion);
        sb2.append("', appShortVersion='");
        sb2.append(this.appShortVersion);
        sb2.append("', appBundle='");
        sb2.append(this.appBundle);
        sb2.append("', instanceId='");
        sb2.append(this.instanceId);
        sb2.append("', sessionId='");
        sb2.append(this.sessionId);
        sb2.append("', deviceBatteryLevel=");
        sb2.append(this.deviceBatteryLevel);
        sb2.append(", windowOrientation='");
        sb2.append(this.windowOrientation);
        sb2.append("', schemaVersion='");
        return s.p(sb2, this.schemaVersion, "'}");
    }

    private EventMetrics(Builder builder) {
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.sessionId = builder.sessionId;
        this.agentVersion = builder.agentVersion;
        this.agentTechnologyType = builder.agentTechnologyType;
        this.agentFlavor = builder.agentFlavor;
        this.deviceManufacturer = builder.deviceManufacturer;
        this.deviceModelIdentifier = builder.deviceModelIdentifier;
        this.deviceBatteryLevel = builder.deviceBatteryLevel;
        this.deviceIsRooted = builder.deviceIsRooted;
        this.windowOrientation = builder.windowOrientation;
        this.osName = builder.osName;
        this.osVersion = builder.osVersion;
        this.appVersion = builder.appVersion;
        this.appShortVersion = builder.appShortVersion;
        this.appBundle = builder.appBundle;
        this.schemaVersion = builder.schemaVersion;
    }
}
