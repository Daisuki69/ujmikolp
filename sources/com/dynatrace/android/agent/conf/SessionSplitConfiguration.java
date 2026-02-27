package com.dynatrace.android.agent.conf;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionSplitConfiguration {
    public static final int DEFAULT_MAX_SESSION_DURATION_MINS = 360;
    static final SessionSplitConfiguration DEFAULT_SESSION_SPLIT_CONFIGURATION = builder().build();
    public static final int DEFAULT_SESSION_TIMEOUT_SEC = 600;
    private final int inactivityTimeout;
    private final int maxSessionDuration;

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SessionSplitConfiguration.class == obj.getClass()) {
            SessionSplitConfiguration sessionSplitConfiguration = (SessionSplitConfiguration) obj;
            if (this.maxSessionDuration == sessionSplitConfiguration.maxSessionDuration && this.inactivityTimeout == sessionSplitConfiguration.inactivityTimeout) {
                return true;
            }
        }
        return false;
    }

    public long getInactivityTimeoutMs() {
        return ((long) this.inactivityTimeout) * 1000;
    }

    public long getInactivityTimeoutSeconds() {
        return this.inactivityTimeout;
    }

    public long getMaxSessionDurationMinutes() {
        return this.maxSessionDuration;
    }

    public long getMaxSessionDurationMs() {
        return ((long) (this.maxSessionDuration * 60)) * 1000;
    }

    public int hashCode() {
        return (this.maxSessionDuration * 31) + this.inactivityTimeout;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionSplitConfiguration{maxSessionDuration=");
        sb2.append(this.maxSessionDuration);
        sb2.append(", inactivityTimeout=");
        return s.m(sb2, this.inactivityTimeout, '}');
    }

    private SessionSplitConfiguration(Builder builder) {
        this.maxSessionDuration = builder.maxSessionDuration;
        this.inactivityTimeout = builder.inactivityTimeout;
    }

    public static class Builder {
        private int inactivityTimeout;
        private int maxSessionDuration;

        public Builder() {
            this.maxSessionDuration = SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            this.inactivityTimeout = 600;
        }

        public SessionSplitConfiguration build() {
            return new SessionSplitConfiguration(this);
        }

        public Builder withInactivityTimeout(int i) {
            this.inactivityTimeout = i;
            return this;
        }

        public Builder withMaxSessionDuration(int i) {
            this.maxSessionDuration = i;
            return this;
        }

        public Builder(SessionSplitConfiguration sessionSplitConfiguration) {
            this.maxSessionDuration = sessionSplitConfiguration.maxSessionDuration;
            this.inactivityTimeout = sessionSplitConfiguration.inactivityTimeout;
        }
    }
}
