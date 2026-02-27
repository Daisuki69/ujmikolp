package b0;

import D.S;
import D.b0;
import F.i;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CleverTapInstanceConfig f8281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8282b;
    public final Cg.c c;

    public g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Cg.c cVar) {
        this.f8282b = context;
        this.f8281a = cleverTapInstanceConfig;
        this.c = cVar;
    }

    public final void a(String str, String str2, String str3) {
        Cg.c cVar = this.c;
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        String strJ = androidx.camera.core.impl.a.j(str2, Global.UNDERSCORE, str3);
        JSONObject jSONObjectD = d();
        if (jSONObjectD.optString(strJ).equals(str)) {
            return;
        }
        try {
            jSONObjectD.put(strJ, str);
            String string = jSONObjectD.toString();
            F.e eVar = F.e.f1495a;
            String strH = cVar.h(string, str2);
            if (strH == null) {
                strH = jSONObjectD.toString();
                ((i) cVar.c).g(false);
            }
            g(jSONObjectD.length(), strH);
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
            S sC = cleverTapInstanceConfig.c();
            sC.getClass();
            S.s(cleverTapInstanceConfig.f9439a, "Error caching guid: " + th2);
        }
    }

    public final int b() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
        int iB = b0.b(this.f8282b, 0, b0.o(cleverTapInstanceConfig.f9439a, "cachedGUIDsLengthKey"));
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "Retrieved size of cachedGUIDs: " + iB);
        return iB;
    }

    public final String c() {
        Context context = this.f8282b;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
        String strH = b0.h(context, cleverTapInstanceConfig, "SP_KEY_PROFILE_IDENTITIES", "");
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:" + strH);
        return strH;
    }

    public final JSONObject d() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
        String strH = b0.h(this.f8282b, cleverTapInstanceConfig, "cachedGUIDsKey", null);
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "getCachedGUIDs:[" + strH + "]");
        if (strH != null) {
            F.e eVar = F.e.f1495a;
            strH = this.c.e(strH, "cgk");
        }
        return n0.b.e(strH, cleverTapInstanceConfig.c(), cleverTapInstanceConfig.f9439a);
    }

    public final String e(String str, String str2) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
        if (str != null) {
            try {
                String string = d().getString(androidx.camera.core.impl.a.j(str, Global.UNDERSCORE, str2));
                cleverTapInstanceConfig.e("ON_USER_LOGIN", "getGUIDForIdentifier:[Key:" + str + ", value:" + string + "]");
                return string;
            } catch (Throwable th2) {
                S sC = cleverTapInstanceConfig.c();
                sC.getClass();
                S.s(cleverTapInstanceConfig.f9439a, "Error reading guid cache: " + th2);
            }
        }
        return null;
    }

    public final void f(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JSONObject jSONObjectD = d();
        try {
            Iterator<String> itKeys = jSONObjectD.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.toLowerCase().contains(str2.toLowerCase()) && jSONObjectD.getString(next).equals(str)) {
                    jSONObjectD.remove(next);
                    g(jSONObjectD.length(), jSONObjectD.toString());
                }
            }
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
            S sC = cleverTapInstanceConfig.c();
            sC.getClass();
            S.s(cleverTapInstanceConfig.f9439a, "Error removing cached key: " + th2);
        }
    }

    public final void g(int i, String str) {
        if (str == null) {
            return;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8281a;
        String strO = b0.o(cleverTapInstanceConfig.f9439a, "cachedGUIDsLengthKey");
        Context context = this.f8282b;
        b0.k(context, i, strO);
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "Storing size of cachedGUIDs: " + i);
        if (i != 0) {
            b0.l(context, b0.o(cleverTapInstanceConfig.f9439a, "cachedGUIDsKey"), str);
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "setCachedGUIDs:[" + str + "]");
            return;
        }
        try {
            b0.m(context, b0.o(cleverTapInstanceConfig.f9439a, "cachedGUIDsKey"));
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th2) {
            S sC = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.s(str2, "Error removing guid cache: " + th2);
        }
    }

    public g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f8282b = context;
        this.f8281a = cleverTapInstanceConfig;
    }
}
