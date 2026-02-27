package com.dynatrace.android.compose;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class TriToggleableComposeCallback_1_7 implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final Function0<Object> source;
    private final ToggleableState state;
    private final String tag;

    public TriToggleableComposeCallback_1_7(Function0<? extends Object> source, ToggleableState state) {
        j.g(source, "source");
        j.g(state, "state");
        this.source = source;
        this.state = state;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "TriToggleableCompose");
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        if (!Global.isAlive.get()) {
            return this.source.invoke();
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableState toggleableStateProvidesToggleableState = providesToggleableState();
        SemanticsManager semanticsManager = SemanticsManager.INSTANCE;
        Object objFetchRole = semanticsManager.fetchRole();
        ToggleableInfo toggleableInfo = new ToggleableInfo(toggleableStateProvidesToggleableState, objFetchRole instanceof Role ? (Role) objFetchRole : null, providesSourceName(), null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, semanticsManager.fetchNameAndClear()).recordAction(this.source);
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        return this.source.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return this.state;
    }
}
