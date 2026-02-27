package j0;

import D.A;
import D.C0187u;
import D.S;
import D.Z;
import D.r;
import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f17645b;
    public final A c;

    public f(r rVar, A a8, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f17645b = cleverTapInstanceConfig;
        this.c = a8;
    }

    public static void b(String str) {
        S.c("variables", str);
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        A a8 = this.c;
        b("Processing Variable response...");
        S.c("variables", "processResponse() called with: response = [" + jSONObject + "], stringBody = [" + str + "], context = [" + context + "]");
        if (this.f17645b.h) {
            b("CleverTap instance is configured to analytics only, not processing Variable response");
            return;
        }
        if (jSONObject == null) {
            b("Can't parse Variable Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("vars")) {
            b("JSON object doesn't contain the vars key");
            return;
        }
        try {
            b("Processing Request Variables response");
            JSONObject jSONObject2 = jSONObject.getJSONObject("vars");
            Z z4 = (Z) a8.f797n;
            if (z4 != null) {
                z4.a(jSONObject2);
            } else {
                b("Can't parse Variable Response, CTVariables is null");
            }
        } catch (Throwable th2) {
            if (C0187u.c >= 0) {
                Log.i("CleverTap:variables", "Failed to parse response", th2);
            }
        }
    }
}
