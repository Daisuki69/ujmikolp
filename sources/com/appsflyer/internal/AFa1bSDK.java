package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1bSDK {

    @VisibleForTesting
    private static volatile AFa1bSDK AFLogger;
    private static final BitSet afInfoLog;
    final Runnable AFInAppEventParameterName;
    boolean AFInAppEventType;
    final Handler AFKeystoreWrapper;
    private long AFLogger$LogLevel;
    private final Runnable AFVersionDeclaration;
    private final Map<AFa1gSDK, Map<String, Object>> afDebugLog;
    private final Map<AFa1gSDK, AFa1gSDK> afErrorLog;
    private final SensorManager afErrorLogForExcManagerOnly;
    final Runnable afRDLog;
    private int afWarnLog;
    private boolean getLevel;
    final Object valueOf = new Object();
    final Runnable values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1bSDK$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFa1bSDK.this.afErrorLog.isEmpty()) {
                    for (AFa1gSDK aFa1gSDK : AFa1bSDK.this.afErrorLog.values()) {
                        AFa1bSDK.this.afErrorLogForExcManagerOnly.unregisterListener(aFa1gSDK);
                        aFa1gSDK.AFInAppEventType(AFa1bSDK.this.afDebugLog, true);
                    }
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
            }
            AFa1bSDK.this.afWarnLog = 0;
            AFa1bSDK.this.getLevel = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afInfoLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFa1bSDK(@NonNull SensorManager sensorManager, Handler handler) {
        BitSet bitSet = afInfoLog;
        this.afErrorLog = new HashMap(bitSet.size());
        this.afDebugLog = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.valueOf) {
                    final AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    aFa1bSDK.AFKeystoreWrapper.post(new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFa1bSDK.this.afErrorLogForExcManagerOnly.getSensorList(-1)) {
                                    if (AFa1bSDK.values(sensor.getType())) {
                                        AFa1gSDK aFa1gSDK = new AFa1gSDK(sensor);
                                        if (!AFa1bSDK.this.afErrorLog.containsKey(aFa1gSDK)) {
                                            AFa1bSDK.this.afErrorLog.put(aFa1gSDK, aFa1gSDK);
                                        }
                                        AFa1bSDK.this.afErrorLogForExcManagerOnly.registerListener((SensorEventListener) AFa1bSDK.this.afErrorLog.get(aFa1gSDK), sensor, 0, AFa1bSDK.this.AFKeystoreWrapper);
                                    }
                                }
                            } catch (Throwable th2) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
                            }
                            AFa1bSDK.this.getLevel = true;
                        }
                    });
                    AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                    aFa1bSDK2.AFKeystoreWrapper.postDelayed(aFa1bSDK2.AFVersionDeclaration, 100L);
                    AFa1bSDK.this.AFInAppEventType = true;
                }
            }
        };
        this.values = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.valueOf) {
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    aFa1bSDK.AFKeystoreWrapper.post(aFa1bSDK.new AnonymousClass10());
                }
            }
        };
        this.afRDLog = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.valueOf) {
                    try {
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        if (aFa1bSDK.AFInAppEventType) {
                            aFa1bSDK.AFKeystoreWrapper.removeCallbacks(aFa1bSDK.AFInAppEventParameterName);
                            AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                            aFa1bSDK2.AFKeystoreWrapper.removeCallbacks(aFa1bSDK2.values);
                            AFa1bSDK aFa1bSDK3 = AFa1bSDK.this;
                            aFa1bSDK3.AFKeystoreWrapper.post(aFa1bSDK3.new AnonymousClass10());
                            AFa1bSDK.this.AFInAppEventType = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.afWarnLog = 1;
        this.AFLogger$LogLevel = 0L;
        this.AFVersionDeclaration = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.valueOf) {
                    try {
                        if (AFa1bSDK.this.afWarnLog == 0) {
                            AFa1bSDK.this.afWarnLog = 1;
                        }
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        aFa1bSDK.AFKeystoreWrapper.postDelayed(aFa1bSDK.values, ((long) aFa1bSDK.afWarnLog) * 500);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.afErrorLogForExcManagerOnly = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    private static AFa1bSDK AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (AFLogger == null) {
            synchronized (AFa1bSDK.class) {
                try {
                    if (AFLogger == null) {
                        AFLogger = new AFa1bSDK(sensorManager, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return AFLogger;
    }

    @NonNull
    private List<Map<String, Object>> valueOf() {
        synchronized (this.valueOf) {
            try {
                if (!this.afErrorLog.isEmpty() && this.getLevel) {
                    Iterator<AFa1gSDK> it = this.afErrorLog.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFInAppEventType(this.afDebugLog, false);
                    }
                }
                if (this.afDebugLog.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.afDebugLog.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void AFKeystoreWrapper() {
        this.AFKeystoreWrapper.post(this.afRDLog);
    }

    public final Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listValueOf = valueOf();
        if (!listValueOf.isEmpty()) {
            concurrentHashMap.put("sensors", listValueOf);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listAFInAppEventParameterName = AFInAppEventParameterName();
        if (!listAFInAppEventParameterName.isEmpty()) {
            concurrentHashMap.put("sensors", listAFInAppEventParameterName);
        }
        return concurrentHashMap;
    }

    public static AFa1bSDK values(Context context) {
        if (AFLogger != null) {
            return AFLogger;
        }
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        return AFInAppEventParameterName(sensorManager, new Handler(handlerThread.getLooper()));
    }

    public final List<Map<String, Object>> AFInAppEventParameterName() {
        Iterator<AFa1gSDK> it = this.afErrorLog.values().iterator();
        while (it.hasNext()) {
            it.next().AFInAppEventType(this.afDebugLog, true);
        }
        Map<AFa1gSDK, Map<String, Object>> map = this.afDebugLog;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.afDebugLog.values());
        }
        return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && afInfoLog.get(i);
    }
}
