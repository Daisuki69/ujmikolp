package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface ServerConfigurationParser {
    ServerConfiguration fromJSON(ServerConfiguration serverConfiguration, String str) throws JSONException, InvalidConfigurationException, ClassCastException;

    ServerConfiguration fromMap(Map<String, String> map, AgentMode agentMode);

    void parseAppConfigV3(ServerConfiguration.Builder builder, ReplayConfiguration.Builder builder2, JSONObject jSONObject) throws JSONException, ParseException;

    void parseDynamicConfigV3(ServerConfiguration.Builder builder, JSONObject jSONObject) throws JSONException, ParseException;

    void parseMobileAgentConfigV3(ServerConfiguration.Builder builder, ReplayConfiguration.Builder builder2, JSONObject jSONObject) throws JSONException;
}
