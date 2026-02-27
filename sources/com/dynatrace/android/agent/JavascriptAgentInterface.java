package com.dynatrace.android.agent;

import We.s;
import android.webkit.JavascriptInterface;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JavascriptAgentInterface {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "JavascriptAgentInterface");

    @JavascriptInterface
    public void applyUserPrivacyOptions(int i, boolean z4) {
        Dynatrace.applyUserPrivacyOptions(new UserPrivacyOptions.Builder().withCrashReportingOptedIn(z4).withDataCollectionLevel(DataCollectionLevel.castJavaScriptValue(i)).build());
    }

    @JavascriptInterface
    public String getUserPrivacyOptions() {
        JSONObject jSONObject = new JSONObject();
        UserPrivacyOptions privacySettings = Session.currentSession().getPrivacyRules().getPrivacySettings();
        try {
            jSONObject.put("dataCollectionLevel", privacySettings.getDataCollectionLevel().getJavaScriptValue());
            jSONObject.put("crashReportingOptedIn", privacySettings.isCrashReportingOptedIn());
            return jSONObject.toString();
        } catch (JSONException e) {
            if (!Global.DEBUG) {
                return "";
            }
            Utility.zlogD(LOGTAG, "Exception while creating JSON object for UserPrivacyOptions: " + e.getMessage());
            return "";
        }
    }

    @JavascriptInterface
    public void incrementActionCount() {
        if (Dynatrace.getCaptureStatus()) {
            Session.determineActiveSession(false);
        }
    }
}
