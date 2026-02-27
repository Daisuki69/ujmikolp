package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1gSDK extends AFd1wSDK<DeepLinkResult> {
    private DeepLinkResult AFLogger;
    private final AFb1qSDK afInfoLog;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1gSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1gSDK(@NonNull AFb1qSDK aFb1qSDK) {
        super(AFd1uSDK.DLSDK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, "DdlSdk");
        this.afInfoLog = aFb1qSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return 90000L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        DeepLinkResult deepLinkResultAfErrorLog = this.afInfoLog.afErrorLog();
        this.AFLogger = deepLinkResultAfErrorLog;
        return AnonymousClass2.AFKeystoreWrapper[deepLinkResultAfErrorLog.getStatus().ordinal()] != 1 ? this.AFLogger.getError() == DeepLinkResult.Error.TIMEOUT ? AFd1tSDK.TIMEOUT : AFd1tSDK.FAILURE : AFd1tSDK.SUCCESS;
    }
}
