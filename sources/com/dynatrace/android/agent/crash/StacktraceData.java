package com.dynatrace.android.agent.crash;

/* JADX INFO: loaded from: classes2.dex */
public class StacktraceData {
    private final String name;
    private final String reason;
    private final String stacktrace;
    private final PlatformType type;

    public StacktraceData(String str, String str2, String str3, PlatformType platformType) {
        this.name = str;
        this.reason = str2;
        this.stacktrace = str3;
        this.type = platformType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StacktraceData stacktraceData = (StacktraceData) obj;
            String str = this.name;
            if (str == null ? stacktraceData.name != null : !str.equals(stacktraceData.name)) {
                return false;
            }
            String str2 = this.reason;
            if (str2 == null ? stacktraceData.reason != null : !str2.equals(stacktraceData.reason)) {
                return false;
            }
            String str3 = this.stacktrace;
            if (str3 == null ? stacktraceData.stacktrace != null : !str3.equals(stacktraceData.stacktrace)) {
                return false;
            }
            if (this.type == stacktraceData.type) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getReason() {
        return this.reason;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }

    public PlatformType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.stacktrace;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PlatformType platformType = this.type;
        return iHashCode3 + (platformType != null ? platformType.hashCode() : 0);
    }

    public String toString() {
        return "StacktraceData{name='" + this.name + "', reason='" + this.reason + "', stacktrace='" + this.stacktrace + "', type=" + this.type + '}';
    }
}
