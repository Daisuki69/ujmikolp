package j0;

import D.A;
import D.S;
import D.d0;
import D.r;
import G6.u;
import S1.v;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17643b = new Object();
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CleverTapInstanceConfig f17644d;
    public final A e;
    public final S f;

    public e(r rVar, A a8, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f17644d = cleverTapInstanceConfig;
        this.f = cleverTapInstanceConfig.c();
        this.c = rVar;
        this.e = a8;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f17644d;
        String str2 = cleverTapInstanceConfig.f9439a;
        this.f.getClass();
        S.s(str2, "Processing Display Unit items...");
        if (cleverTapInstanceConfig.h) {
            S.s(cleverTapInstanceConfig.f9439a, "CleverTap instance is configured to analytics only, not processing Display Unit response");
            return;
        }
        if (jSONObject == null) {
            S.s(cleverTapInstanceConfig.f9439a, "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("adUnit_notifs")) {
            S.s(cleverTapInstanceConfig.f9439a, "DisplayUnit : JSON object doesn't contain the Display Units key");
            return;
        }
        try {
            S.s(cleverTapInstanceConfig.f9439a, "DisplayUnit : Processing Display Unit response");
            b(jSONObject.getJSONArray("adUnit_notifs"));
        } catch (Throwable th2) {
            S.t(cleverTapInstanceConfig.f9439a, "DisplayUnit : Failed to parse response", th2);
        }
    }

    public final void b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            S s9 = this.f;
            String str = this.f17644d.f9439a;
            s9.getClass();
            S.s(str, "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
            return;
        }
        synchronized (this.f17643b) {
            try {
                A a8 = this.e;
                if (((u) a8.c) == null) {
                    a8.c = new u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayListF = ((u) this.e.c).f(jSONArray);
        r rVar = this.c;
        CleverTapInstanceConfig cleverTapInstanceConfig = rVar.f937g;
        if (arrayListF == null || arrayListF.isEmpty()) {
            S sC = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.s(str2, "DisplayUnit : No Display Units found");
            return;
        }
        WeakReference weakReference = rVar.c;
        if (weakReference != null && weakReference.get() != null) {
            d0.i(new v(3, rVar, arrayListF, false));
            return;
        }
        S sC2 = cleverTapInstanceConfig.c();
        String str3 = cleverTapInstanceConfig.f9439a;
        sC2.getClass();
        S.s(str3, "DisplayUnit : No registered listener, failed to notify");
    }
}
