package com.dynatrace.android.agent;

import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.conf.ConfigurationSubscriber;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class HybridBridge {
    private HybridBridge() {
    }

    public static void addConfigurationSubscriber(ConfigurationSubscriber configurationSubscriber) {
        if (configurationSubscriber != null) {
            Core.getConfigurationPublisher().register(configurationSubscriber);
        }
    }

    public static void forwardAppStartEvent(JSONObject jSONObject, List<String> list) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "forward a JSON app start event to the enrichment pipeline");
        CoreComponent holder = CoreComponent.Holder.getInstance();
        Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
        if (isEventCanBeSent(jSONObject, holder, sessionDetermineActiveSessionForInternalEvent)) {
            holder.getOneAgentStartupEventDispatcher().dispatchCrossPlatformEvent(jSONObject, SessionInformationGenerator.generate(sessionDetermineActiveSessionForInternalEvent), list);
        }
    }

    public static void forwardEvent(JSONObject jSONObject) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "forward a JSON event to the enrichment pipeline");
        CoreComponent holder = CoreComponent.Holder.getInstance();
        Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
        if (isEventCanBeSent(jSONObject, holder, sessionDetermineActiveSessionForInternalEvent)) {
            holder.getRumEventDispatcher().dispatchEvent(jSONObject, SessionInformationGenerator.generate(sessionDetermineActiveSessionForInternalEvent), null);
        }
    }

    private static boolean isCrash(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        Object objOpt = jSONObject.opt(EventKeys.Characteristics.HAS_CRASH);
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        return false;
    }

    private static boolean isEventCanBeSent(JSONObject jSONObject, CoreComponent coreComponent, Session session) {
        if (!Dynatrace.getCaptureStatus()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "forward event not possible, capturing is disabled");
            return false;
        }
        if (jSONObject == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot forward a hybrid JSON event that is 'null'");
            return false;
        }
        if (coreComponent == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot forward a hybrid JSON event because agent is not set up yet");
            return false;
        }
        if (session == null || !session.isActive() || !session.isGrailEventsShouldBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "current session is 'null' or cannot accept Grail events");
            return false;
        }
        EventType eventType = isCrash(jSONObject) ? EventType.CRASH : EventType.EVENT_API;
        if (session.getPrivacyRules().shouldCollectEvent(eventType)) {
            return true;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "forward event not possible because of data collection level: " + eventType);
        return false;
    }

    public static void removeConfigurationSubscriber(ConfigurationSubscriber configurationSubscriber) {
        if (configurationSubscriber != null) {
            Core.getConfigurationPublisher().unregister(configurationSubscriber);
        }
    }
}
