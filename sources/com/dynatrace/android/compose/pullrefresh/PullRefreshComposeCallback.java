package com.dynatrace.android.compose.pullrefresh;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class PullRefreshComposeCallback implements Function0<Unit> {
    public static final int $stable = 0;
    private final Function0<Unit> onRefresh;
    private final String tag;

    public PullRefreshComposeCallback(Function0<Unit> onRefresh) {
        j.g(onRefresh, "onRefresh");
        this.onRefresh = onRefresh;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "PullRefreshComposeCallback");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m174invoke();
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m174invoke() {
        if (!Global.isAlive.get()) {
            this.onRefresh.invoke();
            return;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        PullRefreshInfo pullRefreshInfo = new PullRefreshInfo(this.onRefresh);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + pullRefreshInfo);
        }
        new PullRefreshActionRecorder(measurementProviderImpl, userActionFactoryImpl, pullRefreshInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.onRefresh);
    }
}
