package com.dynatrace.android.lifecycle.appstart;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartAction {
    private final MeasurementPoint endPoint;
    private final String name;
    private final UserAction parentAction;

    @Deprecated
    private final AppStartPlaceholderSegment placeholderSegment;
    private final MeasurementPoint startPoint;

    public static class Builder {
        private MeasurementPoint endPoint;
        private String name;
        private UserAction parentAction;

        @Deprecated
        private AppStartPlaceholderSegment placeholderSegment;
        private MeasurementPoint startPoint;

        public AppStartAction build() {
            return new AppStartAction(this);
        }

        public MeasurementPoint getEndPoint() {
            return this.endPoint;
        }

        public String getName() {
            return this.name;
        }

        public UserAction getParentAction() {
            return this.parentAction;
        }

        public AppStartPlaceholderSegment getPlaceholderSegment() {
            return this.placeholderSegment;
        }

        public MeasurementPoint getStartPoint() {
            return this.startPoint;
        }

        public Builder withEndPoint(MeasurementPoint measurementPoint) {
            this.endPoint = measurementPoint;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withParentAction(UserAction userAction) {
            this.parentAction = userAction;
            return this;
        }

        @Deprecated
        public Builder withPlaceholderSegment(AppStartPlaceholderSegment appStartPlaceholderSegment) {
            this.placeholderSegment = appStartPlaceholderSegment;
            return this;
        }

        public Builder withStartPoint(MeasurementPoint measurementPoint) {
            this.startPoint = measurementPoint;
            return this;
        }
    }

    public MeasurementPoint getEndPoint() {
        return this.endPoint;
    }

    public String getName() {
        return this.name;
    }

    public UserAction getParentAction() {
        return this.parentAction;
    }

    public AppStartPlaceholderSegment getPlaceholderSegment() {
        return this.placeholderSegment;
    }

    public MeasurementPoint getStartPoint() {
        return this.startPoint;
    }

    public String toString() {
        return "AppStartAction{name='" + this.name + "', startPoint=" + this.startPoint + ", parentAction=" + this.parentAction + ", endPoint=" + this.endPoint + '}';
    }

    private AppStartAction(Builder builder) {
        this.name = builder.getName();
        this.startPoint = builder.getStartPoint();
        this.parentAction = builder.getParentAction();
        this.placeholderSegment = builder.getPlaceholderSegment();
        this.endPoint = builder.getEndPoint();
    }
}
