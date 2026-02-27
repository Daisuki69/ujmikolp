package com.dynatrace.android.lifecycle.activitytracking;

import android.app.Activity;
import android.view.Display;
import com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ActivityScreenMetricsCollector.DisplayAccessor {
    @Override // com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector.DisplayAccessor
    public final Display getDisplay(Activity activity) {
        return ActivityScreenMetricsCollector.lambda$static$0(activity);
    }
}
