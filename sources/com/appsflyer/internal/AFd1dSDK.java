package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1dSDK extends AFd1wSDK<AFe1ySDK> {

    @Nullable
    public final AFe1zSDK AFLogger;
    private final AFe1pSDK AFLogger$LogLevel;
    private final AFe1sSDK AFVersionDeclaration;

    @Nullable
    public AFe1ySDK afDebugLog;
    public AFb1eSDK afErrorLog;
    private final String afErrorLogForExcManagerOnly;
    private final AFe1wSDK afInfoLog;
    private final AFb1bSDK afRDLog;
    private final AFc1pSDK afWarnLog;
    private final AFe1vSDK getLevel;

    public AFd1dSDK(@NonNull AFe1wSDK aFe1wSDK, @NonNull AFb1bSDK aFb1bSDK, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFe1vSDK aFe1vSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFe1pSDK aFe1pSDK, @NonNull String str, @Nullable AFe1zSDK aFe1zSDK) {
        super(AFd1uSDK.RC_CDN, new AFd1uSDK[0], "UpdateRemoteConfiguration");
        this.afDebugLog = null;
        this.afInfoLog = aFe1wSDK;
        this.afRDLog = aFb1bSDK;
        this.AFVersionDeclaration = aFe1sSDK;
        this.getLevel = aFe1vSDK;
        this.afWarnLog = aFc1pSDK;
        this.AFLogger$LogLevel = aFe1pSDK;
        this.afErrorLogForExcManagerOnly = str;
        this.AFLogger = aFe1zSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFe1ySDK afInfoLog() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1dSDK.afInfoLog():com.appsflyer.internal.AFe1ySDK");
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        try {
            AFe1ySDK aFe1ySDKAfInfoLog = afInfoLog();
            this.afDebugLog = aFe1ySDKAfInfoLog;
            return aFe1ySDKAfInfoLog == AFe1ySDK.FAILURE ? AFd1tSDK.FAILURE : AFd1tSDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.afDebugLog = AFe1ySDK.FAILURE;
            return AFd1tSDK.TIMEOUT;
        }
    }

    private void AFInAppEventParameterName(String str, long j, @Nullable AFc1eSDK<?> aFc1eSDK, AFb1iSDK aFb1iSDK, AFf1ySDK aFf1ySDK, @Nullable String str2, @Nullable Throwable th2) {
        long j6;
        int statusCode;
        Throwable th3;
        if (aFc1eSDK != null) {
            j6 = aFc1eSDK.valueOf.values;
            statusCode = aFc1eSDK.getStatusCode();
        } else {
            j6 = 0;
            statusCode = 0;
        }
        int i = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j6 = ((HttpException) th2).getMetrics().values;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.afErrorLog = new AFb1eSDK(aFb1iSDK != null ? aFb1iSDK.AFInAppEventParameterName : null, str, j6, System.currentTimeMillis() - j, i, aFf1ySDK, str2, th3);
    }

    private void valueOf(String str, long j, AFf1ySDK aFf1ySDK, @Nullable String str2, @Nullable AFc1eSDK<AFb1iSDK> aFc1eSDK) {
        AFInAppEventParameterName(str, j, aFc1eSDK, aFc1eSDK != null ? aFc1eSDK.getBody() : null, aFf1ySDK, str2 != null ? str2 : null, null);
    }
}
