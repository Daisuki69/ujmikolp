package b0;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static c a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, o0.c cVar) {
        g gVar = new g(context, cleverTapInstanceConfig);
        boolean z4 = gVar.b() > 0 && TextUtils.isEmpty(gVar.c());
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "isLegacyProfileLoggedIn:" + z4);
        c eVar = z4 ? new Y.e(cleverTapInstanceConfig) : new b(cleverTapInstanceConfig, gVar, cVar);
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "Repo provider: ".concat(eVar.getClass().getSimpleName()));
        return eVar;
    }
}
