package com.dynatrace.android.compose.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.compose.ClassBasedActionNameGeneratorKt;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class PagerActionRecorder {
    public static final int $stable = 8;
    private final PagerInfo info;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final boolean useSemantics;
    private final UserActionFactory userActionFactory;

    public PagerActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, PagerInfo info, String str, boolean z4) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(info, "info");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.info = info;
        this.semanticsName = str;
        this.useSemantics = z4;
    }

    public final void recordAction() {
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.info, this.semanticsName, !this.useSemantics), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("orientation", this.info.getOrientation().name());
        userActionCreateUserAction.reportValue("fromState", String.valueOf(this.info.getPreviousPage()));
        userActionCreateUserAction.reportValue("toState", String.valueOf(this.info.getCurrentPage()));
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, "pager");
        userActionCreateUserAction.startTimer();
    }
}
