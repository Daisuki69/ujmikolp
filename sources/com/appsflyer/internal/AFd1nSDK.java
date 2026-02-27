package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.dynatrace.android.agent.Global;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1nSDK<Result> extends AFd1wSDK<AFc1eSDK<Result>> {
    public final AFe1sSDK AFLogger;
    protected final AFb1rSDK afDebugLog;

    @Nullable
    public AFc1eSDK<Result> afErrorLog;
    protected final AFc1pSDK afInfoLog;
    private AFa1mSDK afRDLog;

    @Nullable
    private String getLevel;

    private AFd1nSDK(@NonNull AFd1uSDK aFd1uSDK, @NonNull AFd1uSDK[] aFd1uSDKArr, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFb1rSDK aFb1rSDK, @NonNull AFa1mSDK aFa1mSDK, @Nullable String str) {
        super(aFd1uSDK, aFd1uSDKArr, str);
        this.afInfoLog = aFc1pSDK;
        this.AFLogger = aFe1sSDK;
        this.afDebugLog = aFb1rSDK;
        this.afRDLog = aFa1mSDK;
    }

    @WorkerThread
    public abstract AFc1iSDK<Result> AFInAppEventParameterName(@NonNull String str);

    @Override // com.appsflyer.internal.AFd1wSDK
    public boolean AFInAppEventParameterName() {
        if (afRDLog() instanceof AFd1qSDK) {
            return false;
        }
        if (this.values == AFd1tSDK.TIMEOUT) {
            return true;
        }
        Throwable thAfRDLog = afRDLog();
        return (thAfRDLog instanceof IOException) && !(thAfRDLog instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @CallSuper
    public final void AFInAppEventType(Throwable th2) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th2)), th2, true);
        AppsFlyerRequestListener appsFlyerRequestListenerAfInfoLog = afInfoLog();
        if (appsFlyerRequestListenerAfInfoLog != null) {
            String message = th2.getMessage();
            int i = RequestError.NETWORK_FAILURE;
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerAfInfoLog.onError(i, message);
        }
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void AFKeystoreWrapper() {
        String str;
        super.AFKeystoreWrapper();
        if (!afErrorLog() || (str = this.AFLogger.AFInAppEventParameterName) == null || str.trim().isEmpty()) {
            return;
        }
        AFInAppEventType(AFInAppEventParameterName(str).AFKeystoreWrapper);
    }

    public boolean AFLogger$LogLevel() {
        return true;
    }

    public abstract boolean afErrorLog();

    @Nullable
    public abstract AppsFlyerRequestListener afInfoLog();

    @Override // com.appsflyer.internal.AFd1wSDK
    public long valueOf() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    @CallSuper
    public AFd1tSDK values() throws Exception {
        if (AFLogger$LogLevel() && this.AFLogger.AFInAppEventParameterName()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAfInfoLog = afInfoLog();
            if (appsFlyerRequestListenerAfInfoLog != null) {
                appsFlyerRequestListenerAfInfoLog.onError(RequestError.STOP_TRACKING, AFb1fSDK.values);
            }
            throw new AFd1qSDK();
        }
        String str = this.AFLogger.AFInAppEventParameterName;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAfInfoLog2 = afInfoLog();
            if (appsFlyerRequestListenerAfInfoLog2 != null) {
                appsFlyerRequestListenerAfInfoLog2.onError(RequestError.NO_DEV_KEY, AFb1fSDK.AFInAppEventType);
            }
            throw new AFd1rSDK();
        }
        AFc1iSDK<Result> aFc1iSDKAFInAppEventParameterName = AFInAppEventParameterName(str);
        if (afErrorLog()) {
            AFInAppEventType(aFc1iSDKAFInAppEventParameterName.AFKeystoreWrapper);
        }
        AFc1eSDK<Result> aFc1eSDKValueOf = aFc1iSDKAFInAppEventParameterName.valueOf();
        this.afErrorLog = aFc1eSDKValueOf;
        this.afDebugLog.valueOf(aFc1iSDKAFInAppEventParameterName.AFKeystoreWrapper.AFInAppEventType(), aFc1eSDKValueOf.getStatusCode(), aFc1eSDKValueOf.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerAfInfoLog3 = afInfoLog();
        if (appsFlyerRequestListenerAfInfoLog3 != null) {
            if (aFc1eSDKValueOf.isSuccessful()) {
                appsFlyerRequestListenerAfInfoLog3.onSuccess();
            } else {
                int i = RequestError.RESPONSE_CODE_FAILURE;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFb1fSDK.AFInAppEventParameterName);
                sb2.append(Global.BLANK);
                sb2.append(aFc1eSDKValueOf.getStatusCode());
                appsFlyerRequestListenerAfInfoLog3.onError(i, sb2.toString());
            }
        }
        return aFc1eSDKValueOf.isSuccessful() ? AFd1tSDK.SUCCESS : AFd1tSDK.FAILURE;
    }

    @WorkerThread
    private void AFInAppEventType(AFc1vSDK aFc1vSDK) {
        String str = this.getLevel;
        this.getLevel = this.afRDLog.valueOf(new AFc1qSDK(aFc1vSDK.AFInAppEventType(), aFc1vSDK.valueOf(), "6.10.1", this.AFKeystoreWrapper));
        if (str != null) {
            this.afRDLog.AFInAppEventType(str);
        }
    }

    public AFd1nSDK(@NonNull AFd1uSDK aFd1uSDK, @NonNull AFd1uSDK[] aFd1uSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str) {
        this(aFd1uSDK, aFd1uSDKArr, aFc1zSDK.values(), aFc1zSDK.afWarnLog(), aFc1zSDK.getLevel(), aFc1zSDK.afErrorLogForExcManagerOnly(), str);
    }

    public AFd1nSDK(@NonNull AFd1uSDK aFd1uSDK, @NonNull AFd1uSDK[] aFd1uSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str, @Nullable String str2) {
        this(aFd1uSDK, aFd1uSDKArr, aFc1zSDK.values(), aFc1zSDK.afWarnLog(), aFc1zSDK.getLevel(), aFc1zSDK.afErrorLogForExcManagerOnly(), str);
        this.getLevel = str2;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @CallSuper
    public void AFInAppEventType() {
        String str;
        if (this.values == AFd1tSDK.SUCCESS) {
            String str2 = this.getLevel;
            if (str2 != null) {
                this.afRDLog.AFInAppEventType(str2);
                return;
            }
            return;
        }
        if (AFInAppEventParameterName() || (str = this.getLevel) == null) {
            return;
        }
        this.afRDLog.AFInAppEventType(str);
    }
}
