package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1xSDK {

    @VisibleForTesting
    public static long valueOf = 500;
    public static AFa1ySDK values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1xSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Application.ActivityLifecycleCallbacks {
        boolean AFInAppEventParameterName = true;
        boolean AFInAppEventType;
        private /* synthetic */ Executor valueOf;

        public AnonymousClass3(Executor executor) {
            this.valueOf = executor;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull final Activity activity, Bundle bundle) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.3.3
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1sSDK.AFInAppEventParameterName();
                    Intent intent = activity.getIntent();
                    if (AFa1sSDK.valueOf(intent) == null || intent == AFa1sSDK.AFInAppEventType) {
                        return;
                    }
                    AFa1sSDK.AFInAppEventType = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.3.4
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass3.this.AFInAppEventParameterName = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.AFb1xSDK.3.4.4
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                if (anonymousClass3.AFInAppEventType && anonymousClass3.AFInAppEventParameterName) {
                                    anonymousClass3.AFInAppEventType = false;
                                    try {
                                        AFb1xSDK.values.AFInAppEventType(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.afErrorLog("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, AFb1xSDK.valueOf);
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.3.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass3.this.AFInAppEventType) {
                        try {
                            AFb1xSDK.values.valueOf(activity);
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
                        }
                    }
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    anonymousClass3.AFInAppEventParameterName = false;
                    anonymousClass3.AFInAppEventType = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public interface AFa1ySDK {
        void AFInAppEventType(Context context);

        void valueOf(Activity activity);
    }

    public static void AFInAppEventType(Context context, AFa1ySDK aFa1ySDK, Executor executor) {
        values = aFa1ySDK;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(executor);
        if (context instanceof Activity) {
            anonymousClass3.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass3);
    }
}
