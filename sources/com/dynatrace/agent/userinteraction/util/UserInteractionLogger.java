package com.dynatrace.agent.userinteraction.util;

import com.dynatrace.agent.userinteraction.model.TouchAction;
import com.dynatrace.agent.userinteraction.model.TouchEvent;
import com.dynatrace.agent.userinteraction.model.TouchUserInteraction;
import com.dynatrace.agent.userinteraction.model.UiElement;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionLogger {
    private final String toLogString(TouchUserInteraction touchUserInteraction) {
        String logString;
        String logString2;
        StringBuilder sb2 = new StringBuilder("Ancestor view ");
        UiElement ancestor = touchUserInteraction.getAncestor();
        String str = "NULL";
        if (ancestor == null || (logString = toLogString(ancestor)) == null) {
            logString = "NULL";
        }
        sb2.append(logString);
        sb2.append("\n\tElement view ");
        UiElement element = touchUserInteraction.getElement();
        if (element != null && (logString2 = toLogString(element)) != null) {
            str = logString2;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void logTouchEvent$com_dynatrace_agent_release(TouchEvent touchEvent) {
        j.g(touchEvent, "touchEvent");
        if (touchEvent.getAction() != TouchAction.MOVE) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "Received Touch event " + touchEvent.getAction().name() + " with coordinates [" + ((int) touchEvent.getX()) + ':' + ((int) touchEvent.getY()) + ']');
        }
    }

    public final void logTouchUserInteraction$com_dynatrace_agent_release(TouchUserInteraction touchUserInteraction) {
        j.g(touchUserInteraction, "touchUserInteraction");
        Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, toLogString(touchUserInteraction));
    }

    private final String toLogString(UiElement uiElement) {
        return "class: " + uiElement.getComponent() + " name: " + uiElement.getName() + " id: " + uiElement.getId();
    }
}
