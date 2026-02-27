package c0;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements InterfaceC1054b {
    @Override // c0.InterfaceC1054b
    public final void a(JSONArray batch, boolean z4) {
        kotlin.jvm.internal.j.g(batch, "batch");
        if (batch.length() == 0) {
            return;
        }
        int length = batch.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = batch.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("evtData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            if (kotlin.jvm.internal.j.b(jSONObjectOptJSONObject.optString("evtName"), "wzrk_fetch") && jSONObjectOptJSONObject2.optInt("t") == 5) {
                return;
            }
        }
    }
}
