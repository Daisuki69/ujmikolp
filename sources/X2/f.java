package X2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final Date h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f6483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f6484b;
    public final Date c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f6485d;
    public final JSONObject e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f6486g;

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f6484b = jSONObject;
        this.c = date;
        this.f6485d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.f6486g = jSONArray2;
        this.f6483a = jSONObject3;
    }

    public static f a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static e c() {
        e eVar = new e();
        eVar.f6481b = new JSONObject();
        eVar.f6482d = h;
        eVar.e = new JSONArray();
        eVar.c = new JSONObject();
        eVar.f6480a = 0L;
        eVar.f = new JSONArray();
        return eVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f6486g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                String string3 = jSONArray2.getString(i4);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f6483a.toString().equals(((f) obj).f6483a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6483a.hashCode();
    }

    public final String toString() {
        return this.f6483a.toString();
    }
}
