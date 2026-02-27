package com.dynatrace.android.compose;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class CheckBoxComposeCallback_1_7 implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final boolean checked;
    private final Function0<Object> function;
    private final Function1<Object, Object> source;
    private final String tag;

    public CheckBoxComposeCallback_1_7(Function0<? extends Object> function, Function1<Object, ? extends Object> source, boolean z4) {
        j.g(function, "function");
        j.g(source, "source");
        this.function = function;
        this.source = source;
        this.checked = z4;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "CheckBoxCompose");
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        if (!Global.isAlive.get()) {
            return this.function.invoke();
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableInfo toggleableInfo = new ToggleableInfo(providesToggleableState(), Role.box-impl(Role.Companion.getCheckbox-o7Vup1c()), providesSourceName(), null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        return this.source.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return ToggleableStateKt.ToggleableState(this.checked);
    }
}
