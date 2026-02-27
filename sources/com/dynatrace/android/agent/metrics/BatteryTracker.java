package com.dynatrace.android.agent.metrics;

import android.content.Context;
import android.os.BatteryManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class BatteryTracker {
    private static final String LOG_TAG = "BatteryTracker";
    private final BatteryManager batteryManager;

    public BatteryTracker(BatteryManager batteryManager) {
        this.batteryManager = batteryManager;
    }

    public static BatteryTracker generateBatteryTracker(Context context) {
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager != null) {
                return new BatteryTracker(batteryManager);
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "unable to track the battery service");
            }
            return null;
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "unable to track the battery service", e);
            }
            return null;
        }
    }

    public int captureBatteryLevel() {
        try {
            int intProperty = this.batteryManager.getIntProperty(4);
            if (intProperty >= 0 && intProperty <= 100) {
                return intProperty;
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "invalid battery level '" + intProperty + "' detected");
            }
            return Integer.MIN_VALUE;
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "unable to determine the battery level", e);
            }
            return Integer.MIN_VALUE;
        }
    }
}
