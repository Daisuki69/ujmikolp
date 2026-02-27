package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1sSDK {

    @VisibleForTesting
    public static Intent AFInAppEventType;
    public static String[] AFKeystoreWrapper;

    @VisibleForTesting
    private static AFa1sSDK afRDLog;
    static final List<String> values = new ArrayList();
    public DeepLinkListener AFInAppEventParameterName;

    @Nullable
    public List<List<String>> AFLogger = new ArrayList();
    public Map<String, String> afInfoLog;
    public String valueOf;

    public static AFa1sSDK AFInAppEventParameterName() {
        if (afRDLog == null) {
            afRDLog = new AFa1sSDK();
        }
        return afRDLog;
    }

    public static void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFd1fSDK aFd1fSDK = new AFd1fSDK(context, map, uri, values);
        AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(context);
        AFd1vSDK aFd1vSDKAFLogger = AFb1wSDK.AFKeystoreWrapper().valueOf().AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1fSDK));
        AFInAppEventType = null;
    }

    public final void AFInAppEventParameterName(Map<String, Object> map, Intent intent, Context context) {
        AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(context);
        AFc1zSDK aFc1zSDKValueOf = AFb1wSDK.AFKeystoreWrapper().valueOf();
        AFb1gSDK aFb1gSDKAfDebugLog = aFc1zSDKValueOf.afDebugLog();
        if (!AFInAppEventParameterName(intent, context, map) && this.AFInAppEventParameterName != null && aFc1zSDKValueOf.valueOf().AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0) == 0 && !aFb1gSDKAfDebugLog.AFKeystoreWrapper("ddl_sent")) {
            AFb1qSDK aFb1qSDK = new AFb1qSDK(context, aFc1zSDKValueOf);
            AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
            aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(new AFd1gSDK(aFb1qSDK)));
        }
        aFb1gSDKAfDebugLog.valueOf("ddl_sent", true);
    }

    @Nullable
    @VisibleForTesting
    public static Uri valueOf(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    @Nullable
    private Uri AFInAppEventParameterName(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[LOOP:0: B:23:0x0048->B:65:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFInAppEventParameterName(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1sSDK.AFInAppEventParameterName(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }
}
