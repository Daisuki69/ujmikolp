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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ClickableComposeCallback implements Function0<Object> {
    public static final int $stable = 8;
    private final Function0<Object> function;
    private Role role;
    private final String tag;
    private final String type;

    public /* synthetic */ ClickableComposeCallback(Function0 function0, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, role, str);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        if (!Global.isAlive.get()) {
            return this.function.invoke();
        }
        if (this.role == null) {
            Object objFetchRole = SemanticsManager.INSTANCE.fetchRole();
            this.role = objFetchRole instanceof Role ? (Role) objFetchRole : null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        Function0<Object> function0 = this.function;
        if (!(function0 instanceof ToggleableDataProvider)) {
            ClickableInfo clickableInfo = new ClickableInfo(this.type, this.role, function0, null);
            if (Global.DEBUG) {
                Utility.zlogD(this.tag, "onUA: " + clickableInfo);
            }
            return new ClickActionRecorder(measurementProviderImpl, userActionFactoryImpl, clickableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
        }
        ToggleableState toggleableStateProvidesToggleableState = ((ToggleableDataProvider) function0).providesToggleableState();
        j.f(toggleableStateProvidesToggleableState, "providesToggleableState(...)");
        Role role = this.role;
        String strProvidesSourceName = ((ToggleableDataProvider) this.function).providesSourceName();
        j.f(strProvidesSourceName, "providesSourceName(...)");
        ToggleableInfo toggleableInfo = new ToggleableInfo(toggleableStateProvidesToggleableState, role, strProvidesSourceName, null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
    }

    private ClickableComposeCallback(Function0<? extends Object> function, Role role, String type) {
        j.g(function, "function");
        j.g(type, "type");
        this.function = function;
        this.role = role;
        this.type = type;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "ClickableCompose");
    }
}
