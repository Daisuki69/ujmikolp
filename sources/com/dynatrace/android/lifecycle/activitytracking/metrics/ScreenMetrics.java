package com.dynatrace.android.lifecycle.activitytracking.metrics;

import com.dynatrace.agent.metrics.OneAgentScreenMetrics;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenMetrics implements OneAgentScreenMetrics {
    private final int screenDensityDpi;
    private final float screenDensityFactor;
    private final int screenHeight;
    private final int screenWidth;

    public static class Builder {
        private int screenDensityDpi;
        private float screenDensityFactor;
        private int screenHeight;
        private int screenWidth;

        public ScreenMetrics build() {
            return new ScreenMetrics(this);
        }

        public Builder withScreenDensityDpi(int i) {
            this.screenDensityDpi = i;
            return this;
        }

        public Builder withScreenDensityFactor(float f) {
            this.screenDensityFactor = f;
            return this;
        }

        public Builder withScreenHeight(int i) {
            this.screenHeight = i;
            return this;
        }

        public Builder withScreenWidth(int i) {
            this.screenWidth = i;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ScreenMetrics screenMetrics = (ScreenMetrics) obj;
            if (this.screenWidth == screenMetrics.screenWidth && this.screenHeight == screenMetrics.screenHeight && this.screenDensityDpi == screenMetrics.screenDensityDpi && Float.compare(screenMetrics.screenDensityFactor, this.screenDensityFactor) == 0) {
                return true;
            }
        }
        return false;
    }

    public int getScreenDensityDpi() {
        return this.screenDensityDpi;
    }

    public float getScreenDensityFactor() {
        return this.screenDensityFactor;
    }

    @Override // com.dynatrace.agent.metrics.OneAgentScreenMetrics
    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Override // com.dynatrace.agent.metrics.OneAgentScreenMetrics
    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int hashCode() {
        int i = ((((this.screenWidth * 31) + this.screenHeight) * 31) + this.screenDensityDpi) * 31;
        float f = this.screenDensityFactor;
        return i + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public String toString() {
        return "ActivityMetrics{screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + ", screenDensityDpi=" + this.screenDensityDpi + ", screenDensityFactor=" + this.screenDensityFactor + '}';
    }

    private ScreenMetrics(Builder builder) {
        this.screenWidth = builder.screenWidth;
        this.screenHeight = builder.screenHeight;
        this.screenDensityFactor = builder.screenDensityFactor;
        this.screenDensityDpi = builder.screenDensityDpi;
    }
}
