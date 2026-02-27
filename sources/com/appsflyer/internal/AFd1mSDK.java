package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1mSDK extends AFd1wSDK<Boolean> {
    private static volatile boolean afInfoLog;
    private Boolean AFLogger;
    private final AFd1vSDK afDebugLog;
    private final AFc1zSDK afErrorLog;
    private final AFa1mSDK afRDLog;

    public AFd1mSDK(@NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1uSDK.LOAD_CACHE, new AFd1uSDK[0], "LoadCachedRequests");
        this.afRDLog = aFc1zSDK.afErrorLogForExcManagerOnly();
        this.afDebugLog = aFc1zSDK.AFLogger();
        this.afErrorLog = aFc1zSDK;
    }

    public static boolean afErrorLog() {
        return afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        for (AFc1qSDK aFc1qSDK : this.afRDLog.AFInAppEventParameterName()) {
            StringBuilder sb2 = new StringBuilder("CACHE: resending request: ");
            sb2.append(aFc1qSDK.valueOf);
            AFLogger.afInfoLog(sb2.toString());
            try {
                AFe1aSDK aFe1aSDK = new AFe1aSDK(AFInAppEventParameterName(aFc1qSDK), aFc1qSDK.AFInAppEventType(), aFc1qSDK.AFKeystoreWrapper, aFc1qSDK.AFInAppEventParameterName);
                AFd1vSDK aFd1vSDK = this.afDebugLog;
                aFd1vSDK.values.execute(aFd1vSDK.new AnonymousClass2(new AFd1iSDK(aFe1aSDK, this.afErrorLog)));
            } catch (Exception e) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e);
            }
        }
        this.AFLogger = Boolean.TRUE;
        afInfoLog = true;
        return AFd1tSDK.SUCCESS;
    }

    private static String AFInAppEventParameterName(AFc1qSDK aFc1qSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = Long.parseLong(aFc1qSDK.AFKeystoreWrapper, 10);
        String str = aFc1qSDK.valueOf;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
