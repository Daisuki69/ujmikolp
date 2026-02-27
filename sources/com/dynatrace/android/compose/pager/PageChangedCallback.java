package com.dynatrace.android.compose.pager;

import We.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class PageChangedCallback {
    public static final int $stable = 0;
    private final Modifier modifier;
    private final Orientation orientation;
    private final String tag;
    private final boolean useSemantics;

    public PageChangedCallback(Modifier modifier, Orientation orientation, boolean z4) {
        j.g(modifier, "modifier");
        j.g(orientation, "orientation");
        this.modifier = modifier;
        this.orientation = orientation;
        this.useSemantics = z4;
        this.tag = s.p(new StringBuilder(), Global.LOG_PREFIX, "PageChangedCallback");
    }

    public final void invoke(int i, int i4) {
        if (Global.isAlive.get()) {
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            PagerInfo pagerInfo = new PagerInfo(i, i4, this.orientation);
            if (Global.DEBUG) {
                Utility.zlogD(this.tag, "onUA: " + pagerInfo);
            }
            new PagerActionRecorder(measurementProviderImpl, userActionFactoryImpl, pagerInfo, SemanticsManager.INSTANCE.fetchSemanticsNameFromModifier(this.modifier), this.useSemantics).recordAction();
        }
    }
}
