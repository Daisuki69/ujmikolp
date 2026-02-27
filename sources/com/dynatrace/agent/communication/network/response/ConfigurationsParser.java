package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationParser;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationsParser {
    private final ServerConfigurationParser v3configParser;
    private final ServerConfigurationManagerV4 v4configParser;

    public ConfigurationsParser(ServerConfigurationParser v3configParser, ServerConfigurationManagerV4 v4configParser) {
        j.g(v3configParser, "v3configParser");
        j.g(v4configParser, "v4configParser");
        this.v3configParser = v3configParser;
        this.v4configParser = v4configParser;
    }

    private final ServerConfiguration fromJSON(ServerConfiguration serverConfiguration, String str) throws Exception {
        ServerConfiguration.Builder builderNewBuilder;
        Object objNextValue = new JSONTokener(str).nextValue();
        j.e(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) objNextValue;
        JSONObject jSONObject2 = jSONObject.getJSONObject("dynamicConfig");
        if (!jSONObject2.has("bp3Config")) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config v3 parsing: BPv3 config missing");
            return null;
        }
        boolean z4 = jSONObject.has("revision") && jSONObject.has("appConfig") && jSONObject.has("environmentConfig");
        Long longOrNull = JsonExtensionKt.getLongOrNull(jSONObject, "revision");
        if (!z4 || longOrNull == null || longOrNull.longValue() <= serverConfiguration.getTimestamp()) {
            builderNewBuilder = serverConfiguration.newBuilder(true);
        } else {
            builderNewBuilder = ServerConfiguration.builder();
            builderNewBuilder.withTimestamp(longOrNull.longValue());
            ReplayConfiguration.Builder builder = ReplayConfiguration.builder();
            this.v3configParser.parseMobileAgentConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject("environmentConfig").getJSONObject("bp3Config"));
            this.v3configParser.parseAppConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject("appConfig").getJSONObject("bp3Config"));
            builderNewBuilder.withReplayConfiguration(builder.build());
        }
        this.v3configParser.parseDynamicConfigV3(builderNewBuilder, jSONObject2.getJSONObject("bp3Config"));
        return builderNewBuilder.build();
    }

    public final ServerDataUpdate parse$com_dynatrace_agent_release(String jsonBody, LocalServerData serverData, EndPointInfo endPointInfo) {
        j.g(jsonBody, "jsonBody");
        j.g(serverData, "serverData");
        j.g(endPointInfo, "endPointInfo");
        ParsedResponse responseOrNull$com_dynatrace_agent_release = this.v4configParser.parseResponseOrNull$com_dynatrace_agent_release(serverData.getConfig().getRevision(), endPointInfo.getApplicationId(), jsonBody);
        if (responseOrNull$com_dynatrace_agent_release == null) {
            return null;
        }
        try {
            return new ServerDataUpdate(responseOrNull$com_dynatrace_agent_release.getState(), responseOrNull$com_dynatrace_agent_release.getConfiguration(), fromJSON(serverData.getConfigV3(), jsonBody));
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config v3 parsing: invalid JSON", e);
            return null;
        }
    }
}
