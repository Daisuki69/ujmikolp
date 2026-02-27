package j0;

import D.A;
import D.C0178k;
import D.S;
import D.d0;
import D.r;
import Z.p;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17649b;
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CleverTapInstanceConfig f17650d;
    public final S e;
    public final A f;

    public h(CleverTapInstanceConfig cleverTapInstanceConfig, C0178k c0178k, r rVar, A a8) {
        this.f17650d = cleverTapInstanceConfig;
        this.c = rVar;
        this.e = cleverTapInstanceConfig.c();
        this.f17649b = c0178k.f926b;
        this.f = a8;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f17650d;
        if (cleverTapInstanceConfig.h) {
            S s9 = this.e;
            String str2 = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.s(str2, "CleverTap instance is configured to analytics only, not processing inbox messages");
            return;
        }
        S s10 = this.e;
        String str3 = cleverTapInstanceConfig.f9439a;
        s10.getClass();
        S.s(str3, "Inbox: Processing response");
        if (!jSONObject.has("inbox_notifs")) {
            S s11 = this.e;
            String str4 = this.f17650d.f9439a;
            s11.getClass();
            S.s(str4, "Inbox: Response JSON object doesn't contain the inbox key");
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("inbox_notifs");
            synchronized (this.f17649b) {
                try {
                    A a8 = this.f;
                    if (((p) a8.e) == null) {
                        a8.g();
                    }
                    p pVar = (p) this.f.e;
                    if (pVar != null && pVar.f(jSONArray)) {
                        r rVar = this.c;
                        if (rVar.f != null) {
                            d0.i(new C.h(rVar, 1));
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            S s12 = this.e;
            String str5 = this.f17650d.f9439a;
            s12.getClass();
            S.t(str5, "InboxResponse: Failed to parse response", th2);
        }
    }
}
