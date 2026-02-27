package mx_com.mixpanel.android.mpmetrics;

import android.os.Process;
import java.lang.Thread;
import mx_com.mixpanel.android.mpmetrics.MixpanelAPI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final int SLEEP_TIMEOUT_MS = 400;
    private static ExceptionHandler sInstance;
    private final Thread.UncaughtExceptionHandler mDefaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

    public ExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void init() {
        if (sInstance == null) {
            synchronized (ExceptionHandler.class) {
                if (sInstance == null) {
                    sInstance = new ExceptionHandler();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, final Throwable th2) {
        MixpanelAPI.allInstances(new MixpanelAPI.InstanceProcessor() { // from class: mx_com.mixpanel.android.mpmetrics.ExceptionHandler.1
            @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.InstanceProcessor
            public void process(MixpanelAPI mixpanelAPI) {
                if (mixpanelAPI.getTrackAutomaticEvents().booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(AutomaticEvents.APP_CRASHED_REASON, th2.toString());
                        mixpanelAPI.track(AutomaticEvents.APP_CRASHED, jSONObject, true);
                    } catch (JSONException unused) {
                    }
                }
            }
        });
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            killProcessAndExit();
        }
    }

    private void killProcessAndExit() {
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
