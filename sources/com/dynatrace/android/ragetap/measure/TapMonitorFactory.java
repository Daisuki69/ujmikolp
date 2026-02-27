package com.dynatrace.android.ragetap.measure;

import We.s;
import android.view.Window;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.window.OnKeyEventListener;
import com.dynatrace.android.window.OnTouchEventListener;
import com.dynatrace.android.window.WindowListenerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class TapMonitorFactory implements WindowListenerFactory {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "TapMonitorFactory");
    private final RageTapDetector detector;
    private final TimeLineProvider timeLineProvider;

    public TapMonitorFactory(RageTapDetector rageTapDetector, TimeLineProvider timeLineProvider) {
        this.detector = rageTapDetector;
        this.timeLineProvider = timeLineProvider;
    }

    private static float measureScreenDensity() {
        ScreenMetrics screenMetrics = AndroidMetrics.getInstance().getScreenMetrics();
        if (screenMetrics != null) {
            return screenMetrics.getScreenDensityFactor();
        }
        if (!Global.DEBUG) {
            return 1.0f;
        }
        Utility.zlogD(TAG, "Cannot determine screen density as ScreenMetrics is null");
        return 1.0f;
    }

    @Override // com.dynatrace.android.window.WindowListenerFactory
    public OnKeyEventListener generateOnKeyEventListener() {
        return null;
    }

    @Override // com.dynatrace.android.window.WindowListenerFactory
    public OnTouchEventListener generateOnTouchEventListener(Window window) {
        return new TapMonitor(this.detector, new MotionEventConverter(measureScreenDensity()), this.timeLineProvider);
    }
}
