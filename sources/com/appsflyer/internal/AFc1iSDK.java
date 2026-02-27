package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1iSDK<ResponseBody> {
    private final AFc1cSDK<ResponseBody> AFInAppEventParameterName;
    private final AFc1lSDK AFInAppEventType;
    public final AFc1vSDK AFKeystoreWrapper;
    private final ExecutorService valueOf;
    private final AtomicBoolean values = new AtomicBoolean(false);

    public AFc1iSDK(AFc1vSDK aFc1vSDK, ExecutorService executorService, AFc1lSDK aFc1lSDK, AFc1cSDK<ResponseBody> aFc1cSDK) {
        this.AFKeystoreWrapper = aFc1vSDK;
        this.valueOf = executorService;
        this.AFInAppEventType = aFc1lSDK;
        this.AFInAppEventParameterName = aFc1cSDK;
    }

    public final AFc1eSDK<ResponseBody> valueOf() throws Throwable {
        if (this.values.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFc1eSDK<String> aFc1eSDKAFInAppEventParameterName = this.AFInAppEventType.AFInAppEventParameterName(this.AFKeystoreWrapper);
        try {
            return new AFc1eSDK<>(this.AFInAppEventParameterName.AFKeystoreWrapper(aFc1eSDKAFInAppEventParameterName.getBody()), aFc1eSDKAFInAppEventParameterName.AFKeystoreWrapper, aFc1eSDKAFInAppEventParameterName.values, aFc1eSDKAFInAppEventParameterName.AFInAppEventType, aFc1eSDKAFInAppEventParameterName.valueOf);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
            throw new ParsingException(e.getMessage(), e, aFc1eSDKAFInAppEventParameterName);
        }
    }
}
