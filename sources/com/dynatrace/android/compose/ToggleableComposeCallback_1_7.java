package com.dynatrace.android.compose;

import M8.K;
import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ToggleableComposeCallback_1_7 implements Function1<Boolean, Unit> {
    public static final int $stable = 8;
    private final Function1<Boolean, Unit> onValueChanged;
    private Role role;
    private final String tag;

    public /* synthetic */ ToggleableComposeCallback_1_7(Function1 function1, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, role);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(ToggleableComposeCallback_1_7 toggleableComposeCallback_1_7, boolean z4) {
        toggleableComposeCallback_1_7.onValueChanged.invoke(Boolean.valueOf(z4));
        return Unit.f18162a;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableComposeCallback_1_7(Function1<? super Boolean, Unit> onValueChanged, Role role) {
        j.g(onValueChanged, "onValueChanged");
        this.onValueChanged = onValueChanged;
        this.role = role;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "ToggleableCompose");
    }

    public void invoke(boolean z4) {
        if (!Global.isAlive.get()) {
            this.onValueChanged.invoke(Boolean.valueOf(z4));
            return;
        }
        if (this.role == null) {
            Object objFetchRole = SemanticsManager.INSTANCE.fetchRole();
            this.role = objFetchRole instanceof Role ? (Role) objFetchRole : null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableInfo toggleableInfo = new ToggleableInfo(ToggleableStateKt.ToggleableState(!z4), this.role, this.onValueChanged.getClass().getName(), null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(new K(this, z4, 1));
    }
}
