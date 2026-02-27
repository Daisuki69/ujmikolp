package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1bSDK extends AFd1hSDK {
    private static char[] AFLogger$LogLevel = {'0', 'g', 'i', 'c', 'j'};
    private static int AFVersionDeclaration = 0;
    private static int onInstallConversionDataLoadedNative = 1;
    private final String afWarnLog;
    private final AFc1xSDK getLevel;

    public AFd1bSDK(@NonNull String str, @NonNull AFc1zSDK aFc1zSDK) {
        super(new AFe1qSDK(aFc1zSDK.AFVersionDeclaration().AFKeystoreWrapper), aFc1zSDK, str);
        this.getLevel = aFc1zSDK.AFVersionDeclaration();
        this.afWarnLog = str;
    }

    private void AFVersionDeclaration() {
        int i = onInstallConversionDataLoadedNative + 43;
        AFVersionDeclaration = i % 128;
        int i4 = i % 2;
        this.afErrorLogForExcManagerOnly.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i6 = onInstallConversionDataLoadedNative + 27;
        AFVersionDeclaration = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        int i = AFVersionDeclaration + 51;
        onInstallConversionDataLoadedNative = i % 128;
        if (i % 2 == 0) {
            super.AFInAppEventType();
            responseNetwork = ((AFd1nSDK) this).afErrorLog;
            int i4 = 43 / 0;
            if (responseNetwork == null) {
                return;
            }
        } else {
            super.AFInAppEventType();
            responseNetwork = ((AFd1nSDK) this).afErrorLog;
            if (responseNetwork == null) {
                return;
            }
        }
        if (responseNetwork.isSuccessful()) {
            AFVersionDeclaration();
            onInstallConversionDataLoadedNative = (AFVersionDeclaration + 73) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK, com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        int i = (onInstallConversionDataLoadedNative + 113) % 128;
        AFVersionDeclaration = i;
        onInstallConversionDataLoadedNative = (i + 43) % 128;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r2.AFInAppEventParameterName() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = r0.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r5 = r3.getPackageInfo(r0.getPackageName(), 0);
        r10.AFKeystoreWrapper("app_version_code", java.lang.Integer.toString(r5.versionCode));
        r10.AFKeystoreWrapper("app_version_name", r5.versionName);
        r10.AFKeystoreWrapper("app_name", r3.getApplicationLabel(r5.applicationInfo).toString());
        r10.AFKeystoreWrapper("installDate", com.appsflyer.internal.AFb1wSDK.valueOf(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r5.firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        com.appsflyer.internal.AFd1bSDK.AFVersionDeclaration = (com.appsflyer.internal.AFd1bSDK.onInstallConversionDataLoadedNative + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    @Override // com.appsflyer.internal.AFd1hSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void valueOf(com.appsflyer.internal.AFa1tSDK r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1bSDK.valueOf(com.appsflyer.internal.AFa1tSDK):void");
    }

    private static void AFInAppEventType(String str, int[] iArr, boolean z4, Object[] objArr) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (AFf1dSDK.values) {
            try {
                int i = iArr[0];
                int i4 = iArr[1];
                int i6 = iArr[2];
                int i10 = iArr[3];
                char[] cArr = new char[i4];
                System.arraycopy(AFLogger$LogLevel, i, cArr, 0, i4);
                if (bArr != null) {
                    char[] cArr2 = new char[i4];
                    AFf1dSDK.AFInAppEventParameterName = 0;
                    char c = 0;
                    while (true) {
                        int i11 = AFf1dSDK.AFInAppEventParameterName;
                        if (i11 >= i4) {
                            break;
                        }
                        if (bArr[i11] == 1) {
                            cArr2[i11] = (char) (((cArr[i11] << 1) + 1) - c);
                        } else {
                            cArr2[i11] = (char) ((cArr[i11] << 1) - c);
                        }
                        c = cArr2[i11];
                        AFf1dSDK.AFInAppEventParameterName = i11 + 1;
                    }
                    cArr = cArr2;
                }
                if (i10 > 0) {
                    char[] cArr3 = new char[i4];
                    System.arraycopy(cArr, 0, cArr3, 0, i4);
                    int i12 = i4 - i10;
                    System.arraycopy(cArr3, 0, cArr, i12, i10);
                    System.arraycopy(cArr3, i10, cArr, 0, i12);
                }
                if (z4) {
                    char[] cArr4 = new char[i4];
                    AFf1dSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i13 = AFf1dSDK.AFInAppEventParameterName;
                        if (i13 >= i4) {
                            break;
                        }
                        cArr4[i13] = cArr[(i4 - i13) - 1];
                        AFf1dSDK.AFInAppEventParameterName = i13 + 1;
                    }
                    cArr = cArr4;
                }
                if (i6 > 0) {
                    AFf1dSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i14 = AFf1dSDK.AFInAppEventParameterName;
                        if (i14 >= i4) {
                            break;
                        }
                        cArr[i14] = (char) (cArr[i14] - iArr[2]);
                        AFf1dSDK.AFInAppEventParameterName = i14 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }
}
