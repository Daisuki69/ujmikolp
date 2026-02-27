package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SwipeActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final SwipeableInfo swipeableInfo;
    private final boolean useSemantics;
    private final UserActionFactory userActionFactory;

    public SwipeActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, SwipeableInfo swipeableInfo, String str, boolean z4) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(swipeableInfo, "swipeableInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.swipeableInfo = swipeableInfo;
        this.semanticsName = str;
        this.useSemantics = z4;
    }

    public final void recordAction() {
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.swipeableInfo, this.semanticsName, !this.useSemantics), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("state class", this.swipeableInfo.getSourceName());
        if (this.useSemantics) {
            userActionCreateUserAction.reportValue("fromState", this.swipeableInfo.getFromState());
            userActionCreateUserAction.reportValue("toState", this.swipeableInfo.getToState());
        }
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, "swipe");
        userActionCreateUserAction.startTimer();
    }
}
