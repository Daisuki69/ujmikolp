package mx_com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class MixpanelActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final int CHECK_DELAY = 500;
    private static Double sStartSessionTime;
    private Runnable check;
    private final MPConfig mConfig;
    private WeakReference<Activity> mCurrentActivity;
    private final MixpanelAPI mMpInstance;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mIsForeground = false;
    private boolean mPaused = true;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public MixpanelActivityLifecycleCallbacks(MixpanelAPI mixpanelAPI, MPConfig mPConfig) {
        this.mMpInstance = mixpanelAPI;
        this.mConfig = mPConfig;
        if (sStartSessionTime == null) {
            sStartSessionTime = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.mPaused = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
        this.mCurrentActivity = null;
        Handler handler = this.mHandler;
        Runnable runnable2 = new Runnable() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelActivityLifecycleCallbacks.1
            @Override // java.lang.Runnable
            public void run() {
                if (MixpanelActivityLifecycleCallbacks.this.mIsForeground && MixpanelActivityLifecycleCallbacks.this.mPaused) {
                    MixpanelActivityLifecycleCallbacks.this.mIsForeground = false;
                    try {
                        double dCurrentTimeMillis = System.currentTimeMillis();
                        double dDoubleValue = MixpanelActivityLifecycleCallbacks.sStartSessionTime.doubleValue();
                        Double.isNaN(dCurrentTimeMillis);
                        double d10 = dCurrentTimeMillis - dDoubleValue;
                        if (d10 >= MixpanelActivityLifecycleCallbacks.this.mConfig.getMinimumSessionDuration() && d10 < MixpanelActivityLifecycleCallbacks.this.mConfig.getSessionTimeoutDuration() && MixpanelActivityLifecycleCallbacks.this.mMpInstance.getTrackAutomaticEvents().booleanValue()) {
                            double dRound = Math.round((d10 / 1000.0d) * 10.0d);
                            Double.isNaN(dRound);
                            double d11 = dRound / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(AutomaticEvents.SESSION_LENGTH, d11);
                            MixpanelActivityLifecycleCallbacks.this.mMpInstance.getPeople().increment(AutomaticEvents.TOTAL_SESSIONS, 1.0d);
                            MixpanelActivityLifecycleCallbacks.this.mMpInstance.getPeople().increment(AutomaticEvents.TOTAL_SESSIONS_LENGTH, d11);
                            MixpanelActivityLifecycleCallbacks.this.mMpInstance.track(AutomaticEvents.SESSION, jSONObject, true);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    MixpanelActivityLifecycleCallbacks.this.mMpInstance.onBackground();
                }
            }
        };
        this.check = runnable2;
        handler.postDelayed(runnable2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mCurrentActivity = new WeakReference<>(activity);
        this.mPaused = false;
        boolean z4 = !this.mIsForeground;
        this.mIsForeground = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
        if (z4) {
            sStartSessionTime = Double.valueOf(System.currentTimeMillis());
            this.mMpInstance.onForeground();
        }
    }

    protected boolean isInForeground() {
        return this.mIsForeground;
    }
}
