package com.dynatrace.android.compose.pullrefresh;

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
public final class PullRefreshActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final PullRefreshInfo pullRefreshInfo;
    private final String semanticsName;
    private final UserActionFactory userActionFactory;

    public PullRefreshActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, PullRefreshInfo pullRefreshInfo, String str) {
        j.g(measurementProvider, "measurementProvider");
        j.g(userActionFactory, "userActionFactory");
        j.g(pullRefreshInfo, "pullRefreshInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.pullRefreshInfo = pullRefreshInfo;
        this.semanticsName = str;
    }

    public final void recordAction(Function0<Unit> onRefresh) {
        j.g(onRefresh, "onRefresh");
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.pullRefreshInfo, this.semanticsName), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue("function", this.pullRefreshInfo.getOnRefresh().getClass().getName());
        userActionCreateUserAction.reportValue(SessionDescription.ATTR_TYPE, "pull refresh");
        onRefresh.invoke();
        userActionCreateUserAction.startTimer();
    }
}
