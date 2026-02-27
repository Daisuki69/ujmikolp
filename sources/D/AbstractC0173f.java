package D;

import android.os.Bundle;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0173f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0172e f908b = new C0172e();

    public static final JSONObject a(Bundle bundle) throws JSONException {
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("Pek3"));
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                JSONObject jSONObjectA = a((Bundle) obj);
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            } else {
                kotlin.jvm.internal.j.d(str);
                if (zj.z.w(str, 2, "wzrk_", false)) {
                    jSONObject.put(str, bundle.get(str));
                }
            }
        }
        return jSONObject;
    }
}
