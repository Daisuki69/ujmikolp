package L;

import D.C0176i;
import D.S;
import D.r;
import G6.u;
import We.s;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import dOYHB6.tiZVw8.numX49;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n0.d;
import n2.C1915b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CleverTapInstanceConfig f2792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2793b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0176i f2794d;
    public final r e;
    public final d f;
    public boolean c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f2795g = Collections.synchronizedMap(new HashMap());

    public b(String str, CleverTapInstanceConfig cleverTapInstanceConfig, r rVar, C0176i c0176i, d dVar) {
        this.f2793b = str;
        this.f2792a = cleverTapInstanceConfig;
        this.e = rVar;
        this.f2794d = c0176i;
        this.f = dVar;
        c();
    }

    public final synchronized void a(JSONObject jSONObject) {
        String strTnTj78 = numX49.tnTj78("Pgb");
        String strTnTj782 = numX49.tnTj78("Pg2");
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    this.f.c(jSONObject, "Feature_Flag_" + this.f2792a.f9439a + Global.UNDERSCORE + this.f2793b, "ff_cache.json");
                    S sC = this.f2792a.c();
                    String strB = b();
                    StringBuilder sb2 = new StringBuilder(strTnTj782);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Feature_Flag_" + this.f2792a.f9439a + Global.UNDERSCORE + this.f2793b);
                    sb3.append("/ff_cache.json");
                    sb2.append(sb3.toString());
                    sb2.append("]");
                    sb2.append(this.f2795g);
                    String string = sb2.toString();
                    sC.getClass();
                    S.s(strB, string);
                } catch (Exception e) {
                    e.printStackTrace();
                    S sC2 = this.f2792a.c();
                    String strB2 = b();
                    String str = strTnTj78 + e.getLocalizedMessage();
                    sC2.getClass();
                    S.s(strB2, str);
                }
            }
        }
    }

    public final String b() {
        return s.p(new StringBuilder(), this.f2792a.f9439a, numX49.tnTj78("PgL"));
    }

    public final void c() {
        if (TextUtils.isEmpty(this.f2793b)) {
            return;
        }
        C1915b c1915bA = l0.b.a(this.f2792a).a();
        c1915bA.e(new u(this, 7));
        c1915bA.k(numX49.tnTj78("Pgr"), new a(this, 1));
    }
}
