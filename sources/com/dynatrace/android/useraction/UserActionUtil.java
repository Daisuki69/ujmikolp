package com.dynatrace.android.useraction;

import We.s;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public final class UserActionUtil {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "UserActionSupplier");

    private UserActionUtil() {
    }

    public static DTXAutoAction createNewAutoUserAction(String str, MeasurementPoint measurementPoint) {
        DTXAutoAction dTXAutoActionCreateAutoAction = DTXAutoAction.createAutoAction(str, Session.determineActiveSession(false, measurementPoint.getTimestamp()), AdkSettings.getInstance().serverId);
        dTXAutoActionCreateAutoAction.setStartTime(measurementPoint.getTimestamp() - dTXAutoActionCreateAutoAction.getSession().getSessionStartTime());
        dTXAutoActionCreateAutoAction.setLcSeqNum(measurementPoint.getSequenceNumber());
        return dTXAutoActionCreateAutoAction;
    }

    public static DTXAutoAction determineAutoUserAction(String str, MeasurementPoint measurementPoint) {
        DTXAutoAction autoAction = DTXAutoAction.getAutoAction();
        DTXAutoAction dTXAutoActionCreateAutoAction = null;
        if (autoAction != null && autoAction.getNumberOfParentActions() >= 9) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Maximum depth of actions reached (10). Do not attach lifecycle action to user action '" + autoAction.getName() + "'");
            }
            autoAction = null;
        }
        if (autoAction == null || !autoAction.isLimitNumberOfAllowedUserEventsExceed()) {
            dTXAutoActionCreateAutoAction = autoAction;
        } else if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Limit of auto user actions is reached: " + CustomSegment.NUMBER_OF_ALLOWED_USER_ACTIONS);
        }
        if (dTXAutoActionCreateAutoAction == null) {
            dTXAutoActionCreateAutoAction = DTXAutoAction.createAutoAction(str, Session.determineActiveSession(false, measurementPoint.getTimestamp()), AdkSettings.getInstance().serverId);
            dTXAutoActionCreateAutoAction.setStartTime(measurementPoint.getTimestamp() - dTXAutoActionCreateAutoAction.getSession().getSessionStartTime());
            dTXAutoActionCreateAutoAction.setLcSeqNum(measurementPoint.getSequenceNumber());
        }
        dTXAutoActionCreateAutoAction.cancelTimer();
        dTXAutoActionCreateAutoAction.getSession().updateLastInteractionTime(TimeLineProvider.getSystemTime());
        return dTXAutoActionCreateAutoAction;
    }
}
