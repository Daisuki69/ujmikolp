package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.compose.ClassBasedActionNameGeneratorKt;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SliderActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final SliderInfo sliderInfo;
    private final boolean useSemantics;
    private final UserActionFactory userActionFactory;

    public SliderActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, SliderInfo sliderInfo, String str, boolean z4) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(sliderInfo, "sliderInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.sliderInfo = sliderInfo;
        this.semanticsName = str;
        this.useSemantics = z4;
    }

    public final void recordAction(Function0<Unit> function0) {
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.sliderInfo, this.semanticsName, !this.useSemantics), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("function", this.sliderInfo.getSource().getClass().getName());
        userActionCreateUserAction.reportValue("toState", String.valueOf(this.sliderInfo.getPuckPosition()));
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, "slide");
        if (function0 != null) {
            function0.invoke();
        }
        userActionCreateUserAction.startTimer();
    }
}
