package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1oSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFf1qSDK extends AFf1tSDK {
    public final Map<String, Object> AFInAppEventType;

    public AFf1qSDK(Runnable runnable) {
        super("store", "google", runnable);
        this.AFInAppEventType = new HashMap();
    }

    private static boolean AFKeystoreWrapper(@NonNull Context context) {
        if (!AFf1tSDK.values(context)) {
            return false;
        }
        try {
            if (AFa1cSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void valueOf(final Context context) {
        if (AFKeystoreWrapper(context)) {
            this.afDebugLog = System.currentTimeMillis();
            this.afRDLog = AFf1oSDK.AFa1zSDK.STARTED;
            addObserver(new AFf1oSDK.AnonymousClass2());
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.AFf1qSDK.2
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.afDebugLog("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i) {
                        AFf1qSDK.this.AFInAppEventType.put("code", String.valueOf(i));
                        AFf1qSDK.this.valueOf.put("api_ver", Long.valueOf(AFa1cSDK.AFKeystoreWrapper(context, "com.android.vending")));
                        AFf1qSDK.this.valueOf.put("api_ver_name", AFa1cSDK.AFInAppEventType(context, "com.android.vending"));
                        if (i == -1) {
                            AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                            AFf1qSDK.this.valueOf.put("response", "SERVICE_DISCONNECTED");
                        } else if (i == 0) {
                            AFf1qSDK.this.valueOf.put("response", "OK");
                            try {
                                AFLogger.afDebugLog("InstallReferrer connected");
                                if (installReferrerClientBuild.isReady()) {
                                    ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        AFf1qSDK.this.AFInAppEventType.put("val", installReferrer2);
                                        AFf1qSDK.this.valueOf.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    AFf1qSDK.this.AFInAppEventType.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    AFf1qSDK.this.valueOf.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    AFf1qSDK.this.AFInAppEventType.put("install", Long.toString(installBeginTimestampSeconds));
                                    AFf1qSDK.this.valueOf.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap map = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        AFf1qSDK.this.AFInAppEventType.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError e) {
                                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                                    }
                                    try {
                                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        map.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError e7) {
                                        AFLogger.afErrorLogForExcManagerOnly("some method not exist", e7);
                                    }
                                    if (!map.isEmpty()) {
                                        AFf1qSDK.this.valueOf.put("google_custom", map);
                                    }
                                } else {
                                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                                    AFf1qSDK.this.AFInAppEventType.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th2) {
                                AFLogger.afWarnLog("Failed to get install referrer: " + th2.getMessage());
                                AFf1qSDK.this.AFInAppEventType.put("err", th2.getMessage());
                                AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th2);
                            }
                        } else if (i == 1) {
                            AFf1qSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.afWarnLog("InstallReferrer not supported");
                        } else if (i == 2) {
                            AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                            AFf1qSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i != 3) {
                            AFLogger.afWarnLog("responseCode not found.");
                        } else {
                            AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                            AFf1qSDK.this.valueOf.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.afDebugLog("Install Referrer collected locally");
                        AFf1qSDK.this.values();
                        installReferrerClientBuild.endConnection();
                    }
                });
            } catch (Throwable th2) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th2);
            }
        }
    }
}
