package com.dynatrace.android.compose.slider;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SliderValueFinishedCallback implements Function0<Unit> {
    public static final int $stable = 8;
    private final Modifier modifier;
    private final Function1<Float, Unit> onValueChange;
    private final Function0<Unit> onValueChangeFinished;
    private float puckPosition;
    private final String tag;
    private final boolean useSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderValueFinishedCallback(Function1<? super Float, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z4) {
        j.g(onValueChange, "onValueChange");
        this.onValueChange = onValueChange;
        this.modifier = modifier;
        this.onValueChangeFinished = function0;
        this.useSemantics = z4;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "SliderValueFinishedCallback");
    }

    public final float getPuckPosition() {
        return this.puckPosition;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m176invoke();
        return Unit.f18162a;
    }

    public final void setPuckPosition(float f) {
        this.puckPosition = f;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m176invoke() {
        if (!Global.isAlive.get()) {
            Function0<Unit> function0 = this.onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        SliderInfo sliderInfo = new SliderInfo(this.puckPosition, this.onValueChange);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + sliderInfo);
        }
        new SliderActionRecorder(measurementProviderImpl, userActionFactoryImpl, sliderInfo, SemanticsManager.INSTANCE.fetchSemanticsNameFromModifier(this.modifier), this.useSemantics).recordAction(this.onValueChangeFinished);
    }

    public /* synthetic */ SliderValueFinishedCallback(Function1 function1, Modifier modifier, Function0 function0, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, modifier, (i & 4) != 0 ? null : function0, z4);
    }
}
