package com.dynatrace.android.agent;

import We.s;
import android.content.Context;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PreferencesManager;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.Utility;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class AdkSettings {
    public static final int GLOBAL_CHAR_LIMIT = 250;
    static final String ONE_AGENT_PROTOCOL_VERSION = "3";
    public static final String PLATFORM_TYPE_MOBILE = "0";
    public static final int SELF_MONITORING_PAYLOAD_CHAR_LIMIT = 1000;
    public static final String TECHNOLOGY_TYPE = "maandroid";
    private AgentStateListener agentStateListener;
    private Configuration configuration;
    private Context context;
    private volatile ServerConfiguration serverConfiguration;
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "AdkSettings");
    public static String appIdEncoded = "";
    public static String applName = "";
    public static String applIdentifier = "";
    public static volatile Map<String, String> customBeaconHeaders = null;
    private static AdkSettings theInstance = new AdkSettings();
    public AtomicBoolean newVisitorSentPending = new AtomicBoolean(false);
    public AtomicBoolean newVisitorSent = new AtomicBoolean(true);
    public int serverId = 1;
    public PreferencesManager preferencesManager = null;
    boolean hybridApp = false;

    private AdkSettings() {
        switchServerConfiguration(new ServerConfiguration.Builder().withServerId(1).build());
    }

    public static String getADKName() {
        return "Dynatrace OneAgent (Android)";
    }

    public static AdkSettings getInstance() {
        return theInstance;
    }

    public AgentStateListener getAgentStateListener() {
        return this.agentStateListener;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public Context getContext() {
        return this.context;
    }

    public ServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    public SessionSplitConfiguration getSessionSplitConfiguration() {
        return this.serverConfiguration.getSessionSplitConfiguration();
    }

    public void setAgentStateListener(AgentStateListener agentStateListener) {
        this.agentStateListener = agentStateListener;
    }

    public void setNewVisitorSent(boolean z4) {
        this.newVisitorSent.set(z4);
        this.preferencesManager.setNewVisitorSent(z4);
    }

    public void setup(Configuration configuration, Context context) {
        this.configuration = configuration;
        this.hybridApp = configuration.hybridApp;
        if (context == null || this.context == context.getApplicationContext()) {
            return;
        }
        this.context = context;
        applName = Utility.truncateString(context.getApplicationInfo().loadLabel(this.context.getPackageManager()).toString(), 250);
        applIdentifier = Utility.truncateString(this.context.getPackageName(), 250);
        PreferencesManager preferencesManagerCreatePreferencesManager = PreferencesManager.createPreferencesManager(this.context, new ServerConfigurationManager(configuration.appIdEncoded));
        this.preferencesManager = preferencesManagerCreatePreferencesManager;
        this.newVisitorSent.set(preferencesManagerCreatePreferencesManager.getNewVisitorFlag());
    }

    public void switchServerConfiguration(ServerConfiguration serverConfiguration) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "switching settings: " + serverConfiguration);
        }
        this.serverConfiguration = serverConfiguration;
    }
}
