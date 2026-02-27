package D;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import n2.C1915b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: renamed from: D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0184q {
    public static final boolean a(Context context) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("Perh"));
        try {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        } catch (Exception e) {
            S.b(numX49.tnTj78("PerM"));
            e.printStackTrace();
            return true;
        }
    }

    public static final JSONObject b(JSONObject jSONObject) throws JSONException {
        kotlin.jvm.internal.j.g(jSONObject, numX49.tnTj78("PerN"));
        JSONObject jSONObject2 = new JSONObject();
        c(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static final void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        kotlin.jvm.internal.j.g(jSONObject2, numX49.tnTj78("Per6"));
        Iterator<String> itKeys = jSONObject2.keys();
        kotlin.jvm.internal.j.f(itKeys, numX49.tnTj78("Pera"));
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static final void d(C0187u c0187u, Context context, String str, String str2) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PerX"));
        C1915b c1915bB = l0.b.a((CleverTapInstanceConfig) c0187u.f949b.f814a).b();
        CallableC0183p callableC0183p = new CallableC0183p(c0187u, context, str2, str);
        Executor executor = (Executor) c1915bB.e;
        if (!(executor instanceof ExecutorService)) {
            throw new UnsupportedOperationException(numX49.tnTj78("PerG"));
        }
        try {
            ((ExecutorService) executor).submit(new P(5, str, (Object) c1915bB, (Object) callableC0183p)).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final boolean e(String str) {
        return !(str == null || C2576A.H(str));
    }

    public static final Pair f(String str, JSONObject jSONObject) {
        kotlin.jvm.internal.j.g(jSONObject, numX49.tnTj78("Per3"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair(Boolean.FALSE, null);
        }
        Boolean boolValueOf = Boolean.valueOf(jSONArrayOptJSONArray.length() >= 0);
        if (jSONArrayOptJSONArray.length() < 0) {
            jSONArrayOptJSONArray = null;
        }
        return new Pair(boolValueOf, jSONArrayOptJSONArray);
    }

    public static final Pair g(String str, JSONObject jSONObject) {
        kotlin.jvm.internal.j.g(jSONObject, numX49.tnTj78("Pery"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair(Boolean.FALSE, null);
        }
        Boolean boolValueOf = Boolean.valueOf(jSONArrayOptJSONArray.length() > 0);
        if (jSONArrayOptJSONArray.length() <= 0) {
            jSONArrayOptJSONArray = null;
        }
        return new Pair(boolValueOf, jSONArrayOptJSONArray);
    }

    public static final JSONObject h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
