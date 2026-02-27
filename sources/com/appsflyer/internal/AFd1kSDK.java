package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1kSDK extends AFd1nSDK<String> {
    private final Map<String, String> AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final UUID afErrorLogForExcManagerOnly;
    private final AFb1bSDK afRDLog;

    @Nullable
    private final LinkGenerator.ResponseListener afWarnLog;

    @Nullable
    private final String getLevel;

    public AFd1kSDK(@NonNull AFc1zSDK aFc1zSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener) {
        super(AFd1uSDK.ONELINK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.afRDLog = aFc1zSDK.valueOf();
        this.afErrorLogForExcManagerOnly = uuid;
        this.AFVersionDeclaration = str;
        this.AFLogger$LogLevel = new HashMap(map);
        this.afWarnLog = responseListener;
        this.getLevel = str2;
    }

    private String afErrorLogForExcManagerOnly() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afRDLog.values.AFKeystoreWrapper.getPackageName();
        LinkGenerator linkGeneratorAddParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFVersionDeclaration, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFLogger$LogLevel);
        AFb1wSDK.AFKeystoreWrapper();
        String strAFInAppEventType = AFb1wSDK.AFInAppEventType();
        if (strAFInAppEventType != null) {
            linkGeneratorAddParameters.setReferrerCustomerId(strAFInAppEventType);
        }
        return linkGeneratorAddParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFd1nSDK) this).afInfoLog.valueOf(this.AFVersionDeclaration, this.AFLogger$LogLevel, this.getLevel, this.afErrorLogForExcManagerOnly, str);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.afWarnLog;
        if (responseListener != null) {
            if (this.values == AFd1tSDK.SUCCESS && (responseNetwork = ((AFd1nSDK) this).afErrorLog) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thAfRDLog = afRDLog();
            if (!(thAfRDLog instanceof ParsingException)) {
                responseListener.onResponse(afErrorLogForExcManagerOnly());
            } else if (((ParsingException) thAfRDLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(afErrorLogForExcManagerOnly());
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean AFLogger$LogLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }
}
