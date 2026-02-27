package R;

import dOYHB6.tiZVw8.numX49;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f5415b;
    public final JSONArray c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f5416d;
    public final String e;
    public final boolean f;

    public h(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(numX49.tnTj78("bPuq"), numX49.tnTj78("bPuz"));
        kotlin.jvm.internal.j.f(strOptString, numX49.tnTj78("bPul"));
        this.f5414a = strOptString;
        this.f5415b = jSONObject.optJSONArray(numX49.tnTj78("bPuW"));
        this.c = jSONObject.optJSONArray(numX49.tnTj78("bPuP9"));
        this.f5416d = jSONObject.optJSONArray(numX49.tnTj78("bPuPP"));
        this.e = jSONObject.optString(numX49.tnTj78("bPuPb"), null);
        this.f = jSONObject.optBoolean(numX49.tnTj78("bPuP2"), false);
    }

    public static i a(JSONObject jSONObject) {
        j jVar;
        k kVar = new k(jSONObject.opt(numX49.tnTj78("bPuPL")));
        mg.c cVar = j.f5419b;
        int iOptInt = jSONObject.optInt(numX49.tnTj78("bPuPr"), 1);
        j.f5419b.getClass();
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (jVar.f5421a == iOptInt) {
                break;
            }
            i++;
        }
        if (jVar == null) {
            jVar = j.c;
        }
        String strOptString = jSONObject.optString(numX49.tnTj78("bPuPZ"), numX49.tnTj78("bPuPk"));
        kotlin.jvm.internal.j.f(strOptString, numX49.tnTj78("bPuPB"));
        return new i(strOptString, jVar, kVar);
    }
}
