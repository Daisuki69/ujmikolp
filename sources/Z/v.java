package Z;

import D.S;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6861b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6862d;
    public JSONObject e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6863g;
    public String h;
    public JSONObject i;

    public static v b(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.has("_id") ? jSONObject.getString("_id") : null;
            long j = jSONObject.has("date") ? jSONObject.getInt("date") : System.currentTimeMillis() / 1000;
            long j6 = jSONObject.has("wzrk_ttl") ? jSONObject.getInt("wzrk_ttl") : (System.currentTimeMillis() + 86400000) / 1000;
            JSONObject jSONObject2 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.has("tags") ? jSONObject2.getJSONArray("tags") : null;
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
            }
            String string2 = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            if (string2.equalsIgnoreCase("0_0")) {
                jSONObject.put("wzrk_id", string2);
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    jSONObject3.put(next, jSONObject.get(next));
                }
            }
            if (string == null) {
                return null;
            }
            v vVar = new v();
            new ArrayList();
            vVar.f6862d = string;
            vVar.e = jSONObject2;
            vVar.f = false;
            vVar.f6861b = j;
            vVar.c = j6;
            vVar.h = str;
            vVar.f6863g = arrayList;
            vVar.f6860a = string2;
            vVar.i = jSONObject3;
            return vVar;
        } catch (JSONException e) {
            S.b("Unable to parse Notification inbox message to CTMessageDao - " + e.getLocalizedMessage());
            return null;
        }
    }

    public final boolean a() {
        S.b("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) new CTInboxMessage(c()).j.get(0);
        return cTInboxMessageContent.l() || cTInboxMessageContent.i();
    }

    public final JSONObject c() {
        ArrayList arrayList = this.f6863g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f6862d);
            jSONObject.put("msg", this.e);
            jSONObject.put("isRead", this.f);
            jSONObject.put("date", this.f6861b);
            jSONObject.put("wzrk_ttl", this.c);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < arrayList.size(); i++) {
                jSONArray.put(arrayList.get(i));
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put("wzrk_id", this.f6860a);
            jSONObject.put("wzrkParams", this.i);
            return jSONObject;
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to convert CTMessageDao to JSON - "));
            return jSONObject;
        }
    }
}
