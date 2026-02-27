package com.appsflyer.share;

import We.s;
import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.a;
import androidx.webkit.ProxyConfig;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1pSDK;
import com.dynatrace.agent.events.enrichment.EventKeys;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class LinkGenerator {
    private final String AFInAppEventParameterName;
    private String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> AFLogger$LogLevel = new HashMap();
    private String afDebugLog;
    private String afErrorLog;
    private String afErrorLogForExcManagerOnly;
    private String afInfoLog;
    private String afRDLog;
    private String getLevel;
    String valueOf;
    private String values;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFInAppEventParameterName = str;
    }

    private Map<String, String> values() {
        HashMap map = new HashMap();
        map.put("pid", this.AFInAppEventParameterName);
        String str = this.afDebugLog;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.values;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.AFLogger;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventType;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.afRDLog;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.afErrorLog;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.getLevel != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getLevel);
            String str7 = this.afInfoLog;
            if (str7 != null) {
                this.afInfoLog = str7.replaceFirst("^[/]", "");
                sb2.append(this.getLevel.endsWith("/") ? "" : "/");
                sb2.append(this.afInfoLog);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.AFLogger$LogLevel.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFb1tSDK.AFInAppEventType(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.AFLogger$LogLevel.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.AFLogger$LogLevel.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str == null || !str.startsWith(ProxyConfig.MATCH_HTTP)) {
            sb2.append(String.format(AFf1pSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        } else {
            sb2.append(this.AFKeystoreWrapper);
        }
        if (this.valueOf != null) {
            sb2.append('/');
            sb2.append(this.valueOf);
        }
        Map<String, String> mapValues = values();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapValues.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.afErrorLogForExcManagerOnly;
    }

    public String getCampaign() {
        return this.AFInAppEventType;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.AFInAppEventParameterName;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.AFLogger$LogLevel);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFKeystoreWrapper = s.k("https://", a.j(AppsFlyerLib.getInstance().getHostPrefix(), EventKeys.APP.NAMESPACE, AFb1wSDK.AFKeystoreWrapper().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFKeystoreWrapper = s.k("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afErrorLogForExcManagerOnly = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.afDebugLog = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.afErrorLogForExcManagerOnly;
        Map<String, String> mapValues = values();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(context);
        AFc1zSDK aFc1zSDKValueOf = AFb1wSDK.AFKeystoreWrapper().valueOf();
        AFd1kSDK aFd1kSDK = new AFd1kSDK(aFc1zSDKValueOf, UUID.randomUUID(), string, mapValues, str, responseListener);
        AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1kSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
