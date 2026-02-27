package com.dynatrace.android.agent.comm;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.Version;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationParser;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class RequestExecutor {
    public static final String APPMON_DEFAULT_MONITOR = "dynaTraceMonitor";
    private static final int BEACON_MAX_ATTEMPTS = 3;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "RequestExecutor");
    private CommHandler commHandler;
    private Configuration configuration;
    private AtomicInteger failedBeaconAttempts = new AtomicInteger(0);
    private String monitor;
    private String serverUrl;
    private ServerConfigurationParser settingsParser;

    public RequestExecutor(CommHandler commHandler, Configuration configuration, ServerConfigurationParser serverConfigurationParser) {
        this.configuration = configuration;
        this.commHandler = commHandler;
        this.settingsParser = serverConfigurationParser;
        if (configuration.mode == AgentMode.SAAS) {
            this.serverUrl = configuration.getServerUrl();
            return;
        }
        this.monitor = AdkSettings.getInstance().preferencesManager.getBeacon();
        this.serverUrl = configuration.getServerUrl() + "/" + this.monitor;
    }

    private ServerConfiguration handleBeaconRequest(ServerConfiguration serverConfiguration, boolean z4, String str, int i, long j, int i4, boolean z5) throws Exception {
        HttpResponse httpResponseExecuteRequest = this.commHandler.executeRequest(getUriParms(serverConfiguration, z4, i, j, i4), str, z5);
        if (httpResponseExecuteRequest.isSuccessful()) {
            return processConfigResponse(serverConfiguration, httpResponseExecuteRequest);
        }
        if (httpResponseExecuteRequest.responseCode == 404) {
            handleInvalidBeacon();
        }
        throw new InvalidResponseException("invalid response code " + httpResponseExecuteRequest.responseCode, httpResponseExecuteRequest);
    }

    private void handleInvalidBeacon() {
        if (this.configuration.mode != AgentMode.APP_MON || APPMON_DEFAULT_MONITOR.equals(this.monitor)) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Resetting beacon signal (" + this.monitor + ") to (dynaTraceMonitor)");
        }
        this.monitor = APPMON_DEFAULT_MONITOR;
        AdkSettings.getInstance().preferencesManager.removeBeacon();
        this.failedBeaconAttempts.incrementAndGet();
    }

    private void setMonitor(String str) {
        if (str == null || str.length() <= 0 || this.failedBeaconAttempts.get() > 3) {
            str = APPMON_DEFAULT_MONITOR;
        } else if (Global.DEBUG) {
            Utility.zlogD(TAG, a.d(this.failedBeaconAttempts.get(), "Setting dtMonitor: ", str, " attempt: ", Global.BLANK));
        }
        if (str.equals(this.monitor)) {
            return;
        }
        this.monitor = str;
        this.serverUrl = this.configuration.getServerUrl() + "/" + this.monitor;
        AdkSettings.getInstance().preferencesManager.setBeacon(this.monitor);
    }

    public String getUriParms(ServerConfiguration serverConfiguration, boolean z4, int i, long j, int i4) {
        StringBuilder sb2 = new StringBuilder(this.serverUrl);
        sb2.append("?type=m&srvid=");
        sb2.append(i);
        sb2.append("&app=");
        sb2.append(AdkSettings.appIdEncoded);
        sb2.append("&va=");
        sb2.append(Utility.urlEncode(Version.getFullVersion()));
        sb2.append("&tt=maandroid&pt=0");
        if (this.configuration.mode == AgentMode.SAAS) {
            sb2.append("&resp=json&cts=");
            sb2.append(serverConfiguration.getTimestamp());
        }
        if (z4) {
            sb2.append("&ns=1");
        }
        c.z(sb2, "&si=", j, Global.UNDERSCORE);
        sb2.append(i4);
        return sb2.toString();
    }

    public ServerConfiguration processConfigResponse(ServerConfiguration serverConfiguration, HttpResponse httpResponse) throws InvalidResponseException {
        String str;
        if (httpResponse == null || (str = httpResponse.body) == null) {
            throw new InvalidResponseException("no message body", httpResponse);
        }
        if (str.startsWith("{")) {
            if (this.configuration.mode == AgentMode.APP_MON) {
                throw new InvalidResponseException("invalid configuration format", httpResponse);
            }
            try {
                return this.settingsParser.fromJSON(serverConfiguration, httpResponse.body);
            } catch (InvalidConfigurationException | ClassCastException | JSONException e) {
                throw new InvalidResponseException("invalid message protocol", e, httpResponse);
            }
        }
        Map<String, String> keyValueString = Utility.parseKeyValueString(httpResponse.body);
        if (keyValueString == null || !"m".equals(keyValueString.get(SessionDescription.ATTR_TYPE))) {
            throw new InvalidResponseException("invalid message protocol", httpResponse);
        }
        ServerConfiguration serverConfigurationFromMap = this.settingsParser.fromMap(keyValueString, this.configuration.mode);
        if (this.configuration.mode == AgentMode.APP_MON) {
            setMonitor(keyValueString.get("bn"));
        }
        return serverConfigurationFromMap;
    }

    public void resetBeaconRetries() {
        this.failedBeaconAttempts.set(0);
    }

    public ServerConfiguration sendBeacon(ServerConfiguration serverConfiguration, boolean z4, int i, Session session) throws Exception {
        return handleBeaconRequest(serverConfiguration, z4, null, i, session.visitorId, session.sessionId, false);
    }

    public ServerConfiguration sendData(ServerConfiguration serverConfiguration, String str, int i, long j, int i4, boolean z4) throws Exception {
        return handleBeaconRequest(serverConfiguration, false, str, i, j, i4, z4);
    }
}
