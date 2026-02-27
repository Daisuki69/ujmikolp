package j0;

import D.A;
import D.S;
import android.content.Context;
import b1.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1652a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f17637b;
    public final CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f17638d;
    public final o0.d e;
    public final Y.e f;

    public C1652a(CleverTapInstanceConfig cleverTapInstanceConfig, o0.d dVar, A a8, Y.e eVar) {
        this.c = cleverTapInstanceConfig;
        this.f17637b = (t) a8.f794g;
        this.f17638d = cleverTapInstanceConfig.c();
        this.e = dVar;
        this.f = eVar;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        S s9 = this.f17638d;
        try {
            if (jSONObject.has("arp")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("arp");
                if (jSONObject2.length() > 0) {
                    t tVar = this.f17637b;
                    if (tVar != null) {
                        tVar.n(jSONObject2);
                    }
                    try {
                        b(jSONObject2);
                    } catch (Throwable th2) {
                        String str2 = "Error handling discarded events response: " + th2.getLocalizedMessage();
                        s9.getClass();
                        S.q(str2);
                    }
                    this.f.n(context, jSONObject2);
                }
            }
        } catch (Throwable th3) {
            String str3 = this.c.f9439a;
            s9.getClass();
            S.t(str3, "Failed to process ARP", th3);
        }
    }

    public final void b(JSONObject jSONObject) {
        boolean zHas = jSONObject.has("d_e");
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        S s9 = this.f17638d;
        if (!zHas) {
            String str = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.s(str, "ARP doesn't contain the Discarded Events key");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("d_e");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            o0.d dVar = this.e;
            if (dVar != null) {
                dVar.f18757a = arrayList;
                return;
            }
            String str2 = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.s(str2, "Validator object is NULL");
        } catch (JSONException e) {
            String str3 = cleverTapInstanceConfig.f9439a;
            String str4 = "Error parsing discarded events list" + e.getLocalizedMessage();
            s9.getClass();
            S.s(str3, str4);
        }
    }
}
