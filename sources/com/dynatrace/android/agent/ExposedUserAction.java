package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
class ExposedUserAction implements ModifiableUserAction {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ExposedUserAction");
    private final DTXAutoAction autoAction;

    public ExposedUserAction(DTXAutoAction dTXAutoAction) {
        this.autoAction = dTXAutoAction;
    }

    private boolean actionCanTakeEvents() {
        if (isActionClosed()) {
            return false;
        }
        if (!this.autoAction.isGraceTimeOver()) {
            return true;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "The action cannot be modified since its grace time passed");
        }
        return false;
    }

    private boolean isActionClosed() {
        if (!this.autoAction.isFinalized()) {
            return false;
        }
        if (!Global.DEBUG) {
            return true;
        }
        Utility.zlogD(TAG, "The action cannot be modified since it is already closed");
        return true;
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void cancel() {
        if (isActionClosed()) {
            return;
        }
        this.autoAction.cancelGracefully();
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public String getActionName() {
        return this.autoAction.getName();
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportError(String str, int i) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportError(str, i);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportEvent(String str) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportEvent(str);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, int i) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, i);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void setActionName(String str) {
        if (str == null || str.isEmpty()) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "The action name cannot be changed to an empty String or null");
            }
        } else {
            if (isActionClosed()) {
                return;
            }
            this.autoAction.modifyName(str);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportError(String str, Throwable th2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportError(str, th2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, long j) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, j);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, double d10) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, d10);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, String str2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, str2);
        }
    }
}
