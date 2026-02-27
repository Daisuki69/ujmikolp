package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1tSDK implements AFd1xSDK {
    private final AFb1bSDK AFInAppEventParameterName;
    private final AFe1sSDK AFInAppEventType;
    private final AFe1wSDK AFKeystoreWrapper;

    @Nullable
    private AFb1eSDK AFLogger;
    private final AFe1pSDK afDebugLog;

    @Nullable
    private AFe1ySDK afErrorLog;
    private final AFd1vSDK afInfoLog;
    private final AFc1pSDK afRDLog;
    public final AFe1vSDK valueOf;
    private final Object values;

    public AFb1tSDK() {
    }

    public static Map<String, String> AFInAppEventType(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return map2;
    }

    public final void AFKeystoreWrapper(AFe1zSDK aFe1zSDK) {
        AFd1dSDK aFd1dSDK = new AFd1dSDK(this.AFKeystoreWrapper, this.AFInAppEventParameterName, this.AFInAppEventType, this.valueOf, this.afRDLog, this.afDebugLog, "v1", aFe1zSDK);
        AFd1vSDK aFd1vSDK = this.afInfoLog;
        aFd1vSDK.values.execute(aFd1vSDK.new AnonymousClass2(aFd1dSDK));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void valueOf(AFd1wSDK<?> aFd1wSDK) {
    }

    public AFb1tSDK(AFe1wSDK aFe1wSDK, AFb1bSDK aFb1bSDK, AFe1sSDK aFe1sSDK, AFe1vSDK aFe1vSDK, AFc1pSDK aFc1pSDK, AFe1pSDK aFe1pSDK, AFd1vSDK aFd1vSDK) {
        this.values = new Object();
        this.AFKeystoreWrapper = aFe1wSDK;
        this.AFInAppEventParameterName = aFb1bSDK;
        this.AFInAppEventType = aFe1sSDK;
        this.valueOf = aFe1vSDK;
        this.afRDLog = aFc1pSDK;
        this.afDebugLog = aFe1pSDK;
        this.afInfoLog = aFd1vSDK;
        aFd1vSDK.AFKeystoreWrapper.add(this);
    }

    private void valueOf(AFe1ySDK aFe1ySDK, AFe1zSDK aFe1zSDK) {
        synchronized (this.values) {
            this.afErrorLog = aFe1ySDK;
        }
        if (aFe1zSDK != null) {
            aFe1zSDK.onRemoteConfigUpdateFinished(aFe1ySDK);
        }
    }

    @Nullable
    public final AFb1eSDK AFInAppEventType() {
        AFb1eSDK aFb1eSDK;
        synchronized (this.values) {
            aFb1eSDK = this.AFLogger;
            this.AFLogger = null;
        }
        return aFb1eSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType(AFd1wSDK<?> aFd1wSDK, AFd1tSDK aFd1tSDK) {
        if (aFd1wSDK instanceof AFd1dSDK) {
            AFd1dSDK aFd1dSDK = (AFd1dSDK) aFd1wSDK;
            AFe1ySDK aFe1ySDK = aFd1dSDK.afDebugLog;
            if (aFe1ySDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFe1ySDK = AFe1ySDK.FAILURE;
            }
            if (aFe1ySDK != AFe1ySDK.USE_CACHED) {
                AFb1eSDK aFb1eSDK = aFd1dSDK.afErrorLog;
                synchronized (this.values) {
                    this.AFLogger = aFb1eSDK;
                }
            }
            valueOf(aFe1ySDK, aFd1dSDK.AFLogger);
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType(AFd1wSDK<?> aFd1wSDK) {
        if (aFd1wSDK instanceof AFd1dSDK) {
            AFd1dSDK aFd1dSDK = (AFd1dSDK) aFd1wSDK;
            synchronized (this.values) {
                this.AFLogger = null;
            }
            valueOf(AFe1ySDK.FAILURE, aFd1dSDK.AFLogger);
        }
    }
}
