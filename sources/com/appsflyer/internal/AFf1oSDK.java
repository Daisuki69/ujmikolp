package com.appsflyer.internal;

import android.content.Context;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFf1oSDK extends Observable {
    final Runnable AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    public final String AFLogger;
    long afDebugLog;
    public final Map<String, Object> valueOf = new HashMap();
    public AFa1zSDK afRDLog = AFa1zSDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1oSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Observer {
        public AnonymousClass2() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFf1oSDK.this.AFInAppEventParameterName.run();
        }
    }

    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFf1oSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventParameterName = runnable;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = str;
    }

    public abstract void valueOf(Context context);

    public final void values() {
        this.valueOf.put("source", this.AFKeystoreWrapper);
        this.valueOf.put(SessionDescription.ATTR_TYPE, this.AFLogger);
        this.valueOf.put("latency", Long.valueOf(System.currentTimeMillis() - this.afDebugLog));
        this.afRDLog = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
