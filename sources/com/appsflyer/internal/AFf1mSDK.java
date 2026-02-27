package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1oSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1mSDK extends AFf1tSDK {
    public AFf1mSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean AFInAppEventParameterName(@NonNull Context context) {
        if (!AFf1tSDK.values(context)) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void valueOf(final Context context) {
        if (AFInAppEventParameterName(context)) {
            this.afDebugLog = System.currentTimeMillis();
            this.afRDLog = AFf1oSDK.AFa1zSDK.STARTED;
            addObserver(new AFf1oSDK.AnonymousClass2());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFf1mSDK.3
                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFf1mSDK.this.valueOf.put("api_ver", Long.valueOf(AFa1cSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks")));
                    AFf1mSDK.this.valueOf.put("api_ver_name", AFa1cSDK.AFInAppEventType(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFf1mSDK.this.valueOf.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFf1mSDK aFf1mSDK = AFf1mSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFf1mSDK.valueOf.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFf1mSDK.valueOf.put("referrer", installReferrer2);
                                }
                                aFf1mSDK.valueOf.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFf1mSDK.valueOf.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFf1mSDK.valueOf.put("xiaomi_custom", map);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            AFLogger.afWarnLog(sb2.toString());
                        }
                    } else if (i == 1) {
                        AFf1mSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFf1mSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1mSDK.this.valueOf.put("response", "DEVELOPER_ERROR");
                    } else if (i != 4) {
                        AFLogger.afWarnLog("responseCode not found.");
                    } else {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1mSDK.this.valueOf.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                    AFf1mSDK.this.values();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
