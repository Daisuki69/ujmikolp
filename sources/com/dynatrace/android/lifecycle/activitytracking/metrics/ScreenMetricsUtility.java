package com.dynatrace.android.lifecycle.activitytracking.metrics;

import We.s;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenMetricsUtility {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DisplayMetricsUtility");

    private ScreenMetricsUtility() {
    }

    @Deprecated
    public static Point getDimensionsFromDisplay(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @Deprecated
    public static DisplayMetrics getDisplayMetricsFromDisplay(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
