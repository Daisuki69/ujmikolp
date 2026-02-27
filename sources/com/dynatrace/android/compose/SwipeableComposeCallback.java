package com.dynatrace.android.compose;

import We.s;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class SwipeableComposeCallback {
    public static final int $stable = 0;
    public static final SwipeableComposeCallback INSTANCE = new SwipeableComposeCallback();
    private static final String tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "SwipeableCompose");

    private SwipeableComposeCallback() {
    }

    public final void enterAction(SwipeableState<?> state, boolean z4) {
        j.g(state, "state");
        if (Global.isAlive.get()) {
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            SwipeableInfo swipeableInfo = new SwipeableInfo(state.getCurrentValue(), state.getTargetValue(), state);
            if (Global.DEBUG) {
                Utility.zlogD(tag, "onUA: " + swipeableInfo);
            }
            new SwipeActionRecorder(measurementProviderImpl, userActionFactoryImpl, swipeableInfo, SemanticsManager.INSTANCE.fetchNameAndClear(), z4).recordAction();
        }
    }
}
