package com.dynatrace.android.agent.conf;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public class ServerConfigurationManager implements ServerConfigurationParser {
    private static final ServerConfiguration CONFIG_AGENT_ERROR = new ServerConfiguration.Builder().withCaptureOff().withStatus(ServerConfiguration.Status.ERROR).build();
    private static final ServerConfiguration CONFIG_INIT_MEMORY = new ServerConfiguration.Builder().withTimestamp(-1).build();
    private static final String KEY_APPLICATION_ID = "applicationId";
    private static final String KEY_APP_CONFIG = "appConfig";
    private static final String KEY_CAPTURE = "capture";
    private static final String KEY_COLOR_MASKING_ENABLED = "colorMasking";
    private static final String KEY_COMPOSE_ENABLED = "composeEnabled";
    private static final String KEY_DISPERSION_RADIUS = "dispersionRadius";
    private static final String KEY_DYNAMIC_CONFIG = "dynamicConfig";
    private static final String KEY_GEN3_ENABLED = "gen3Enabled";
    private static final String KEY_MAX_BEACON_SIZE_KB = "maxBeaconSizeKb";
    private static final String KEY_MAX_CACHED_CRASHES = "maxCachedCrashesCount";
    private static final String KEY_MAX_SESSION_DURATION_MINS = "maxSessionDurationMins";
    private static final String KEY_MINIMUM_NUMBER_OF_TAPS = "minimumNumberOfTaps";
    private static final String KEY_MOBILE_AGENT_CONFIG = "mobileAgentConfig";
    private static final String KEY_MULTIPLICITY = "multiplicity";
    private static final String KEY_PIXEL_COPY_ENABLED = "pixelCopy";
    private static final String KEY_RAGE_TAP_CONFIG = "rageTapConfig";
    private static final String KEY_REPLAY_CAPTURE = "capture";
    private static final String KEY_REPLAY_CONFIG = "replayConfig";
    private static final String KEY_REPLAY_CRASHES_ENABLED = "crashesEnabled";
    private static final String KEY_REPLAY_PROTOCOL_VERSION = "protocolVersion";
    private static final String KEY_REPLAY_RETENTION_TIME = "imageRetentionTimeInMinutes";
    private static final String KEY_REPLAY_SELFMONITORING = "selfmonitoring";
    private static final String KEY_REPLAY_TRAFFIC_CONTROL_PERCENTAGE = "trafficControlPercentage";
    private static final String KEY_SELFMONITORING = "selfmonitoring";
    private static final String KEY_SEND_INTERVAL_SEC = "sendIntervalSec";
    private static final String KEY_SERVERID = "serverId";
    private static final String KEY_SESSION_TIMEOUT_SEC = "sessionTimeoutSec";
    private static final String KEY_STATUS = "status";
    private static final String KEY_SWITCH_SERVER = "switchServer";
    private static final String KEY_TAP_DURATION = "tapDuration";
    private static final String KEY_TIMESPAN_DIFFERENCE = "timespanDifference";
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final String KEY_TRAFFIC_CONTROL_PERCENTAGE = "trafficControlPercentage";
    private final String appIdEncoded;

    public ServerConfigurationManager(String str) {
        this.appIdEncoded = str;
    }

    private int fitOrClosest(JSONObject jSONObject, String str, int i, int i4, int i6) {
        if (jSONObject.has(str)) {
            try {
                return Math.max(Math.min(jSONObject.getInt(str), i4), i);
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + str + "\" to be an Integer, but it was not");
            }
        }
        return i6;
    }

    private int fitOrDefault(JSONObject jSONObject, String str, int i, int i4, int i6) {
        return fitOrDefault(jSONObject, str, i, i4, i6, i6);
    }

    private JSONObject generateAppConfiguration(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_REPLAY_CONFIG, generateReplayConfigurationApp(serverConfiguration));
        jSONObject.put(KEY_GEN3_ENABLED, serverConfiguration.isGen3Enabled());
        return jSONObject;
    }

    private JSONObject generateDynamicConfiguration(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_SERVERID, serverConfiguration.getServerId());
        return jSONObject;
    }

    private JSONObject generateMobileAgentConfiguration(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_MAX_BEACON_SIZE_KB, serverConfiguration.getMaxBeaconSizeKb());
        jSONObject.put("selfmonitoring", serverConfiguration.isSelfmonitoring());
        SessionSplitConfiguration sessionSplitConfiguration = serverConfiguration.getSessionSplitConfiguration();
        jSONObject.put(KEY_MAX_SESSION_DURATION_MINS, sessionSplitConfiguration.getMaxSessionDurationMinutes());
        jSONObject.put(KEY_SESSION_TIMEOUT_SEC, sessionSplitConfiguration.getInactivityTimeoutSeconds());
        jSONObject.put(KEY_SEND_INTERVAL_SEC, serverConfiguration.getSendIntervalSec());
        jSONObject.put(KEY_MAX_CACHED_CRASHES, serverConfiguration.getMaxCachedCrashesCount());
        jSONObject.put(KEY_RAGE_TAP_CONFIG, generateRageTapConfiguration(serverConfiguration));
        jSONObject.put(KEY_REPLAY_CONFIG, generateReplayConfigurationMobileAgent(serverConfiguration));
        return jSONObject;
    }

    private JSONObject generateRageTapConfiguration(ServerConfiguration serverConfiguration) throws JSONException {
        RageTapConfiguration rageTapConfiguration = serverConfiguration.getRageTapConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_TAP_DURATION, rageTapConfiguration.getTapDuration());
        jSONObject.put(KEY_DISPERSION_RADIUS, rageTapConfiguration.getDispersionRadius());
        jSONObject.put(KEY_TIMESPAN_DIFFERENCE, rageTapConfiguration.getTimespanDifference());
        jSONObject.put(KEY_MINIMUM_NUMBER_OF_TAPS, rageTapConfiguration.getMinimumNumberOfTaps());
        return jSONObject;
    }

    private JSONObject generateReplayConfigurationApp(ServerConfiguration serverConfiguration) throws JSONException {
        ReplayConfiguration replayConfiguration = serverConfiguration.getReplayConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capture", replayConfiguration.isCaptureOn());
        jSONObject.put(KEY_REPLAY_RETENTION_TIME, replayConfiguration.getRetentionTimeInMinutes());
        if (replayConfiguration.getFullSessionConfigReceived()) {
            jSONObject.put("trafficControlPercentage", replayConfiguration.getTrafficControlPercentage());
            jSONObject.put(KEY_REPLAY_CRASHES_ENABLED, replayConfiguration.getCrashesEnabled());
        }
        return jSONObject;
    }

    private JSONObject generateReplayConfigurationMobileAgent(ServerConfiguration serverConfiguration) throws JSONException {
        ReplayConfiguration replayConfiguration = serverConfiguration.getReplayConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_REPLAY_PROTOCOL_VERSION, replayConfiguration.getProtocolVersion());
        jSONObject.put(KEY_PIXEL_COPY_ENABLED, replayConfiguration.isPixelCopyEnabled());
        jSONObject.put(KEY_COLOR_MASKING_ENABLED, replayConfiguration.isColorMaskingEnabled());
        jSONObject.put(KEY_COMPOSE_ENABLED, replayConfiguration.isComposeEnabled());
        return jSONObject;
    }

    private boolean tryBooleanOrDefault(JSONObject jSONObject, String str, boolean z4) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + str + "\" to be a Boolean, but it was not");
            return z4;
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public ServerConfiguration fromJSON(ServerConfiguration serverConfiguration, String str) throws JSONException, InvalidConfigurationException, ClassCastException {
        ServerConfiguration.Builder builderNewBuilder;
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (!jSONObject.has(KEY_DYNAMIC_CONFIG)) {
            throw new InvalidConfigurationException("The configuration is missing the dynamicConfig block");
        }
        if (jSONObject.has("timestamp") && jSONObject.has(KEY_APP_CONFIG) && jSONObject.has(KEY_MOBILE_AGENT_CONFIG)) {
            builderNewBuilder = ServerConfiguration.builder();
            try {
                long j = jSONObject.getLong("timestamp");
                if (j <= serverConfiguration.getTimestamp()) {
                    return serverConfiguration;
                }
                builderNewBuilder.withTimestamp(j);
                ReplayConfiguration.Builder builder = ReplayConfiguration.builder();
                parseMobileAgentConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject(KEY_MOBILE_AGENT_CONFIG));
                try {
                    parseAppConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject(KEY_APP_CONFIG));
                    builderNewBuilder.withReplayConfiguration(builder.build());
                } catch (ParseException unused) {
                    return CONFIG_AGENT_ERROR;
                }
            } catch (JSONException unused2) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: timestamp must be of type long");
                return CONFIG_AGENT_ERROR;
            }
        } else {
            builderNewBuilder = serverConfiguration.newBuilder(true);
        }
        try {
            parseDynamicConfigV3(builderNewBuilder, jSONObject.getJSONObject(KEY_DYNAMIC_CONFIG));
            return builderNewBuilder.build();
        } catch (ParseException unused3) {
            return CONFIG_AGENT_ERROR;
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public ServerConfiguration fromMap(Map<String, String> map, AgentMode agentMode) {
        ServerConfiguration.Builder builder = new ServerConfiguration.Builder();
        builder.withCapture(Utility.parseInt(map, "cp", 0, 1, 1, true));
        builder.withSendIntervalSec(Utility.parseInt(map, "si", 60, 540, 120));
        builder.withServerId(Utility.parseInt(map, TtmlNode.ATTR_ID, 0, Integer.MAX_VALUE, 1));
        builder.withMaxBeaconSizeKb(Utility.parseInt(map, CmcdConfiguration.KEY_BUFFER_LENGTH, 1, Integer.MAX_VALUE, agentMode == AgentMode.APP_MON ? 30 : ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS));
        builder.withSessionSplitConfiguration(SessionSplitConfiguration.builder().withInactivityTimeout(Utility.parseInt(map, CmcdConfiguration.KEY_STREAM_TYPE, 0, Integer.MAX_VALUE, 600)).build());
        builder.withTrafficControlPercentage(Utility.parseInt(map, "tc", 1, 100, 100, true));
        builder.withMultiplicity(Utility.parseInt(map, "mp", 0, Integer.MAX_VALUE, 1, true));
        builder.withSelfmonitoring(Utility.parseInt(map, "sm", 0, 1, 1, true) == 1);
        return builder.build();
    }

    public ServerConfiguration fromMemory(String str) throws JSONException, InvalidConfigurationException {
        ServerConfiguration serverConfigurationFromJSON = fromJSON(CONFIG_INIT_MEMORY, str);
        if (serverConfigurationFromJSON.getStatus() == ServerConfiguration.Status.OK) {
            return serverConfigurationFromJSON;
        }
        throw new InvalidConfigurationException("unexpected status code: " + serverConfigurationFromJSON.getStatus());
    }

    public String generateStorableConfiguration(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_MOBILE_AGENT_CONFIG, generateMobileAgentConfiguration(serverConfiguration));
        jSONObject.put(KEY_APP_CONFIG, generateAppConfiguration(serverConfiguration));
        jSONObject.put(KEY_DYNAMIC_CONFIG, generateDynamicConfiguration(serverConfiguration));
        jSONObject.put("timestamp", 0L);
        return jSONObject.toString();
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseAppConfigV3(ServerConfiguration.Builder builder, ReplayConfiguration.Builder builder2, JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        ServerConfigurationManager serverConfigurationManager;
        if (jSONObject.has(KEY_APPLICATION_ID)) {
            if (!this.appIdEncoded.equals(jSONObject.getString(KEY_APPLICATION_ID))) {
                throw new ParseException("No application id", 0);
            }
        }
        if (jSONObject.has("capture")) {
            jSONObject2 = jSONObject;
            builder.withCapture(fitOrDefault(jSONObject2, "capture", 0, 1, 1));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("trafficControlPercentage")) {
            serverConfigurationManager = this;
            builder.withTrafficControlPercentage(serverConfigurationManager.fitOrDefault(jSONObject2, "trafficControlPercentage", 1, 100, 100));
        } else {
            serverConfigurationManager = this;
        }
        if (jSONObject2.has(KEY_GEN3_ENABLED)) {
            builder.withGen3Enabled(tryBooleanOrDefault(jSONObject2, KEY_GEN3_ENABLED, false));
        }
        if (jSONObject2.has(KEY_REPLAY_CONFIG)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(KEY_REPLAY_CONFIG);
            if (jSONObject3.has("capture")) {
                builder2.withCapture(tryBooleanOrDefault(jSONObject3, "capture", false));
            }
            if (jSONObject3.has(KEY_REPLAY_CRASHES_ENABLED)) {
                builder2.withCrashesEnabled(tryBooleanOrDefault(jSONObject3, KEY_REPLAY_CRASHES_ENABLED, false));
                builder2.withFullSessionConfigReceived(true);
            }
            if (jSONObject3.has("trafficControlPercentage")) {
                builder2.withTrafficControlPercentage(serverConfigurationManager.fitOrDefault(jSONObject3, "trafficControlPercentage", 0, 100, 0, 100));
            }
            if (jSONObject3.has(KEY_REPLAY_RETENTION_TIME)) {
                builder2.withRetentionTimeInMinutes(fitOrClosest(jSONObject3, KEY_REPLAY_RETENTION_TIME, 0, Integer.MAX_VALUE, 0));
            }
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseDynamicConfigV3(ServerConfiguration.Builder builder, JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        if (jSONObject.has("status") && jSONObject.getString("status").compareToIgnoreCase("ERROR") == 0) {
            throw new ParseException("Error status detected", 0);
        }
        builder.withStatus(ServerConfiguration.Status.OK);
        if (jSONObject.has(KEY_MULTIPLICITY)) {
            jSONObject2 = jSONObject;
            builder.withMultiplicity(fitOrDefault(jSONObject2, KEY_MULTIPLICITY, 0, Integer.MAX_VALUE, 1));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has(KEY_SERVERID)) {
            builder.withServerId(fitOrDefault(jSONObject2, KEY_SERVERID, 0, Integer.MAX_VALUE, 1));
        }
        if (jSONObject2.has(KEY_SWITCH_SERVER)) {
            builder.withSwitchServer(tryBooleanOrDefault(jSONObject2, KEY_SWITCH_SERVER, false));
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseMobileAgentConfigV3(ServerConfiguration.Builder builder, ReplayConfiguration.Builder builder2, JSONObject jSONObject) throws JSONException {
        ServerConfigurationManager serverConfigurationManager;
        JSONObject jSONObject2;
        ServerConfigurationManager serverConfigurationManager2;
        if (jSONObject.has(KEY_MAX_BEACON_SIZE_KB)) {
            serverConfigurationManager = this;
            jSONObject2 = jSONObject;
            builder.withMaxBeaconSizeKb(fitOrClosest(jSONObject, KEY_MAX_BEACON_SIZE_KB, 10, Integer.MAX_VALUE, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS));
        } else {
            serverConfigurationManager = this;
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("selfmonitoring")) {
            builder.withSelfmonitoring(tryBooleanOrDefault(jSONObject2, "selfmonitoring", true));
        }
        builder.withSessionSplitConfiguration(parseSessionSplitConfiguration(jSONObject2));
        if (jSONObject2.has(KEY_SEND_INTERVAL_SEC)) {
            builder.withSendIntervalSec(serverConfigurationManager.fitOrClosest(jSONObject2, KEY_SEND_INTERVAL_SEC, 10, 120, 120));
        }
        if (jSONObject2.has(KEY_MAX_CACHED_CRASHES)) {
            serverConfigurationManager2 = this;
            builder.withMaxCachedCrashesCount(serverConfigurationManager2.fitOrClosest(jSONObject2, KEY_MAX_CACHED_CRASHES, 0, 100, 0));
        } else {
            serverConfigurationManager2 = this;
        }
        if (jSONObject2.has(KEY_RAGE_TAP_CONFIG)) {
            builder.withRageTapConfiguration(parseRageTapConfiguration(jSONObject2.getJSONObject(KEY_RAGE_TAP_CONFIG)));
        }
        if (jSONObject2.has(KEY_REPLAY_CONFIG)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(KEY_REPLAY_CONFIG);
            if (jSONObject3.has(KEY_REPLAY_PROTOCOL_VERSION)) {
                builder2.withProtocolVersion(serverConfigurationManager2.fitOrClosest(jSONObject3, KEY_REPLAY_PROTOCOL_VERSION, 1, 32767, 1));
            }
            if (jSONObject3.has("selfmonitoring")) {
                builder2.withSelfMonitoring(fitOrClosest(jSONObject3, "selfmonitoring", 0, Integer.MAX_VALUE, 0));
            }
            if (jSONObject3.has(KEY_PIXEL_COPY_ENABLED)) {
                builder2.withPixelCopyEnabled(tryBooleanOrDefault(jSONObject3, KEY_PIXEL_COPY_ENABLED, false));
            }
            if (jSONObject3.has(KEY_COLOR_MASKING_ENABLED)) {
                builder2.withColorMaskingEnabled(tryBooleanOrDefault(jSONObject3, KEY_COLOR_MASKING_ENABLED, false));
            }
            if (jSONObject3.has(KEY_COMPOSE_ENABLED)) {
                builder2.withComposeEnabled(tryBooleanOrDefault(jSONObject3, KEY_COMPOSE_ENABLED, true));
            }
        }
    }

    public RageTapConfiguration parseRageTapConfiguration(JSONObject jSONObject) {
        JSONObject jSONObject2;
        RageTapConfiguration.Builder builder = RageTapConfiguration.builder();
        if (jSONObject.has(KEY_TAP_DURATION)) {
            jSONObject2 = jSONObject;
            builder.withTapDuration(fitOrClosest(jSONObject, KEY_TAP_DURATION, 0, Integer.MAX_VALUE, 100));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has(KEY_DISPERSION_RADIUS)) {
            builder.withDispersionRadius(fitOrClosest(jSONObject2, KEY_DISPERSION_RADIUS, 0, Integer.MAX_VALUE, 100));
        }
        if (jSONObject2.has(KEY_TIMESPAN_DIFFERENCE)) {
            builder.withTimespanDifference(fitOrClosest(jSONObject2, KEY_TIMESPAN_DIFFERENCE, 0, Integer.MAX_VALUE, 300));
        }
        if (jSONObject2.has(KEY_MINIMUM_NUMBER_OF_TAPS)) {
            builder.withMinimumNumberOfTaps(fitOrClosest(jSONObject2, KEY_MINIMUM_NUMBER_OF_TAPS, 3, Integer.MAX_VALUE, 3));
        }
        return builder.build();
    }

    public SessionSplitConfiguration parseSessionSplitConfiguration(JSONObject jSONObject) {
        JSONObject jSONObject2;
        SessionSplitConfiguration.Builder builder = SessionSplitConfiguration.builder();
        if (jSONObject.has(KEY_MAX_SESSION_DURATION_MINS)) {
            jSONObject2 = jSONObject;
            builder.withMaxSessionDuration(fitOrClosest(jSONObject, KEY_MAX_SESSION_DURATION_MINS, 10, Integer.MAX_VALUE, SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has(KEY_SESSION_TIMEOUT_SEC)) {
            builder.withInactivityTimeout(fitOrClosest(jSONObject2, KEY_SESSION_TIMEOUT_SEC, 30, Integer.MAX_VALUE, 600));
        }
        return builder.build();
    }

    private int fitOrDefault(JSONObject jSONObject, String str, int i, int i4, int i6, int i10) {
        if (jSONObject.has(str)) {
            try {
                int i11 = jSONObject.getInt(str);
                if (i11 >= i) {
                    return i11 > i4 ? i10 : i11;
                }
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + str + "\" to be an Integer, but it was not");
            }
        }
        return i6;
    }
}
