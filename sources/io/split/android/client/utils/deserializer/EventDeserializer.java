package io.split.android.client.utils.deserializer;

import com.google.gson.JsonParseException;
import com.google.gson.internal.i;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class EventDeserializer implements n {
    private static Map<String, Object> buildMappedProperties(q qVar) {
        HashMap map = new HashMap();
        if (qVar == null) {
            return Collections.unmodifiableMap(map);
        }
        for (Map.Entry entry : (i) qVar.f10034a.entrySet()) {
            o oVar = (o) entry.getValue();
            String str = (String) entry.getKey();
            if (oVar == null || (oVar instanceof p)) {
                map.put(str, null);
            } else {
                try {
                    String strJ = oVar.j();
                    if (strJ.equals(String.valueOf(oVar.c()))) {
                        map.put(str, Boolean.valueOf(oVar.c()));
                    } else if (strJ.equals(String.valueOf(oVar.e()))) {
                        map.put(str, Integer.valueOf(oVar.e()));
                    } else if (strJ.equals(String.valueOf(oVar.i()))) {
                        map.put(str, Long.valueOf(oVar.i()));
                    } else if (strJ.equals(String.valueOf(oVar.d()))) {
                        map.put(str, Double.valueOf(oVar.d()));
                    } else if (strJ.equals(String.valueOf(oVar.a()))) {
                        map.put(str, oVar.a());
                    } else {
                        map.put(str, strJ);
                    }
                } catch (NumberFormatException unused) {
                    map.put(str, oVar.j());
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.gson.n
    public Event deserialize(o oVar, Type type, m mVar) throws JsonParseException {
        q qVarG = oVar.g();
        o oVarM = qVarG.m(SerializableEvent.PROPERTIES_FIELD);
        oVarM.getClass();
        q qVarG2 = !(oVarM instanceof p) ? qVarG.m(SerializableEvent.PROPERTIES_FIELD).g() : new q();
        Event event = new Event();
        if (qVarG.m(Event.SIZE_IN_BYTES_FIELD) != null) {
            o oVarM2 = qVarG.m(Event.SIZE_IN_BYTES_FIELD);
            oVarM2.getClass();
            if (!(oVarM2 instanceof p)) {
                event.setSizeInBytes(qVarG.m(Event.SIZE_IN_BYTES_FIELD).e());
            }
        }
        event.eventTypeId = qVarG.m(SerializableEvent.EVENT_TYPE_FIELD).j();
        event.trafficTypeName = qVarG.m(SerializableEvent.TRAFFIC_TYPE_NAME_FIELD).j();
        event.key = qVarG.m("key").j();
        event.value = qVarG.m("value").d();
        event.timestamp = qVarG.m("timestamp").i();
        event.properties = buildMappedProperties(qVarG2);
        return event;
    }
}
