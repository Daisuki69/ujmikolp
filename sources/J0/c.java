package j0;

import D.C0187u;
import D.S;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f17640b;
    public final S c;

    public c(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f17640b = cleverTapInstanceConfig;
        this.c = cleverTapInstanceConfig.c();
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        int i;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f17640b;
        S s9 = this.c;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        String str2 = cleverTapInstanceConfig.f9439a;
                        String string = jSONArray.get(i4).toString();
                        s9.getClass();
                        S.g(str2, string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (!jSONObject.has("dbg_lvl") || (i = jSONObject.getInt("dbg_lvl")) < 0) {
                return;
            }
            C0187u.c = i;
            s9.getClass();
            S.s(cleverTapInstanceConfig.f9439a, "Set debug level to " + i + " for this session (set by upstream)");
        } catch (Throwable unused2) {
        }
    }
}
