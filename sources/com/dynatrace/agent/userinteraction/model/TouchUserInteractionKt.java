package com.dynatrace.agent.userinteraction.model;

import cj.t;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.userinteraction.util.UserInteractionKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteractionKt {
    public static final JSONObject toJSONObject(TouchUserInteraction touchUserInteraction) throws JSONException {
        j.g(touchUserInteraction, "<this>");
        List<TouchEvent> positions = touchUserInteraction.getPositions();
        ArrayList arrayList = new ArrayList(t.l(positions, 10));
        for (TouchEvent touchEvent : positions) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", (int) touchEvent.getX());
            jSONObject.put("y", (int) touchEvent.getY());
            arrayList.add(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(EventKeys.Characteristics.HAS_USER_INTERACTION, true);
        jSONObject2.put(UserInteractionKeys.INTERACTION_NAME, "touch");
        UiElement ancestor = touchUserInteraction.getAncestor();
        if (ancestor != null) {
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_NAME, ancestor.getName());
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_COMPONENT, ancestor.getComponent());
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_ID, ancestor.getId());
        }
        jSONObject2.put(UserInteractionKeys.ELEMENT_NAME, touchUserInteraction.getElement().getName());
        jSONObject2.put(UserInteractionKeys.ELEMENT_COMPONENT, touchUserInteraction.getElement().getComponent());
        jSONObject2.put(UserInteractionKeys.ELEMENT_ID, touchUserInteraction.getElement().getId());
        jSONObject2.put(UserInteractionKeys.Touch.POSITIONS, new JSONArray((Collection) arrayList));
        return jSONObject2;
    }
}
