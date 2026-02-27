package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ToggleActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final ToggleableInfo toggleableInfo;
    private final UserActionFactory userActionFactory;

    public ToggleActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, ToggleableInfo toggleableInfo, String str) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(toggleableInfo, "toggleableInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.toggleableInfo = toggleableInfo;
        this.semanticsName = str;
    }

    public final Object recordAction(Function0<? extends Object> function) {
        j.g(function, "function");
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.toggleableInfo, this.semanticsName), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("role", String.valueOf(this.toggleableInfo.m173getRoleRLKlGQI()));
        userActionCreateUserAction.reportValue("function", this.toggleableInfo.getSourceName());
        userActionCreateUserAction.reportValue("fromState", this.toggleableInfo.getState().name());
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, "toggle");
        Object objInvoke = function.invoke();
        userActionCreateUserAction.startTimer();
        return objInvoke;
    }
}
