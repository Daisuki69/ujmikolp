package com.dynatrace.android.agent.events.lifecycle;

import We.s;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;
import com.dynatrace.android.lifecycle.appstart.AppStartActionObserver;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartActionObserverImpl implements AppStartActionObserver {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "AppStartActionObserverImpl");
    private final AppStartSegmentFactory segmentFactory = new AppStartSegmentFactory();

    @Override // com.dynatrace.android.lifecycle.appstart.AppStartActionObserver
    public void onAppStartCompleted(AppStartAction appStartAction) {
        DTXAutoAction autoAction;
        UserAction parentAction = appStartAction.getParentAction();
        if (parentAction == null || parentAction.isFinalized()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "Parent action is not available anymore, discard action '" + appStartAction.getName() + "'");
                return;
            }
            return;
        }
        if (!AdkSettings.getInstance().getConfiguration().activityMonitoring && (autoAction = DTXAutoAction.getAutoAction()) != null) {
            autoAction.cancelTimer();
        }
        if (Dynatrace.getCaptureStatus()) {
            Core.saveSegment(this.segmentFactory.createSegment(appStartAction, parentAction.getSession(), parentAction.getServerId()));
        }
        AppStartPlaceholderSegment placeholderSegment = appStartAction.getPlaceholderSegment();
        Core.removeFromCalloutTable(placeholderSegment);
        placeholderSegment.leaveAction();
        parentAction.startTimerIfNeeded();
    }
}
