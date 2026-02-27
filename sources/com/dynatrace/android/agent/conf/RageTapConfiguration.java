package com.dynatrace.android.agent.conf;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class RageTapConfiguration {
    public static final int DEFAULT_DISPERSION_RADIUS = 100;
    public static final int DEFAULT_MINIMUM_NUMBER_OF_TAPS = 3;
    public static final RageTapConfiguration DEFAULT_RAGE_TAP_CONFIGURATION = builder().build();
    public static final int DEFAULT_TAP_DURATION = 100;
    public static final int DEFAULT_TIMESPAN_DIFFERENCE = 300;
    private final int dispersionRadius;
    private final int minimumNumberOfTaps;
    private final int tapDuration;
    private final int timespanDifference;

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RageTapConfiguration.class == obj.getClass()) {
            RageTapConfiguration rageTapConfiguration = (RageTapConfiguration) obj;
            if (this.tapDuration == rageTapConfiguration.tapDuration && this.dispersionRadius == rageTapConfiguration.dispersionRadius && this.timespanDifference == rageTapConfiguration.timespanDifference && this.minimumNumberOfTaps == rageTapConfiguration.minimumNumberOfTaps) {
                return true;
            }
        }
        return false;
    }

    public int getDispersionRadius() {
        return this.dispersionRadius;
    }

    public int getMinimumNumberOfTaps() {
        return this.minimumNumberOfTaps;
    }

    public int getTapDuration() {
        return this.tapDuration;
    }

    public int getTimespanDifference() {
        return this.timespanDifference;
    }

    public int hashCode() {
        return (((((this.tapDuration * 31) + this.dispersionRadius) * 31) + this.timespanDifference) * 31) + this.minimumNumberOfTaps;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RageTapConfiguration{tapDuration=");
        sb2.append(this.tapDuration);
        sb2.append(", dispersionRadius=");
        sb2.append(this.dispersionRadius);
        sb2.append(", timespanDifference=");
        sb2.append(this.timespanDifference);
        sb2.append(", minimumNumberOfTaps=");
        return s.m(sb2, this.minimumNumberOfTaps, '}');
    }

    private RageTapConfiguration(Builder builder) {
        this.tapDuration = builder.tapDuration;
        this.dispersionRadius = builder.dispersionRadius;
        this.timespanDifference = builder.timespanDifference;
        this.minimumNumberOfTaps = builder.minimumNumberOfTaps;
    }

    public static class Builder {
        private int dispersionRadius;
        private int minimumNumberOfTaps;
        private int tapDuration;
        private int timespanDifference;

        public Builder() {
            this.tapDuration = 100;
            this.dispersionRadius = 100;
            this.timespanDifference = 300;
            this.minimumNumberOfTaps = 3;
        }

        public RageTapConfiguration build() {
            return new RageTapConfiguration(this);
        }

        public Builder withDispersionRadius(int i) {
            this.dispersionRadius = i;
            return this;
        }

        public Builder withMinimumNumberOfTaps(int i) {
            this.minimumNumberOfTaps = i;
            return this;
        }

        public Builder withTapDuration(int i) {
            this.tapDuration = i;
            return this;
        }

        public Builder withTimespanDifference(int i) {
            this.timespanDifference = i;
            return this;
        }

        public Builder(RageTapConfiguration rageTapConfiguration) {
            this.tapDuration = rageTapConfiguration.tapDuration;
            this.dispersionRadius = rageTapConfiguration.dispersionRadius;
            this.timespanDifference = rageTapConfiguration.timespanDifference;
            this.minimumNumberOfTaps = rageTapConfiguration.minimumNumberOfTaps;
        }
    }
}
