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
public final class ClickActionRecorder {
    public static final int $stable = 8;
    private final ClickableInfo clickableInfo;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final UserActionFactory userActionFactory;

    public ClickActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, ClickableInfo clickableInfo, String str) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(clickableInfo, "clickableInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.clickableInfo = clickableInfo;
        this.semanticsName = str;
    }

    public final Object recordAction(Function0<? extends Object> clickableFunction) {
        j.g(clickableFunction, "clickableFunction");
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.clickableInfo, this.semanticsName), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("role", String.valueOf(this.clickableInfo.m172getRoleRLKlGQI()));
        userActionCreateUserAction.reportValue("function", this.clickableInfo.getFunction().getClass().getName());
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, this.clickableInfo.getInteractionType());
        Object objInvoke = clickableFunction.invoke();
        userActionCreateUserAction.startTimer();
        return objInvoke;
    }
}
