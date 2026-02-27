package W5;

import android.content.Context;
import android.content.SharedPreferences;
import bj.C1034e;
import bj.EnumC1035f;
import cj.M;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import dOYHB6.yFtIp6.svM7M6;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6312b = C1034e.a(EnumC1035f.f9163a, new W4.b(this, 1));

    public c(Context context) {
        this.f6311a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bj.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bj.d, java.lang.Object] */
    public final Map a(Y5.a aVar) {
        try {
            String string = svM7M6.getString((SharedPreferences) this.f6312b.getValue(), ((e) aVar).f6316a, WeJson.EMPTY_MAP);
            TypeToken<Map<String, ? extends String>> typeToken = new TypeToken<Map<String, ? extends String>>() { // from class: com.paymaya.featureflags.providers.splitio.base.SplitCachingSharedPreference$getRemoteFlagsConfigMap$tokenType$1
            };
            j jVar = (j) Y5.b.f6757a.getValue();
            jVar.getClass();
            Map map = (Map) (string == null ? null : jVar.d(new StringReader(string), typeToken));
            return map == null ? M.e() : map;
        } catch (JsonSyntaxException unused) {
            String str = ((e) aVar).f6316a;
            yk.a.d();
            return M.e();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bj.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bj.d, java.lang.Object] */
    public final void b(Y5.d flag, String str) {
        kotlin.jvm.internal.j.g(flag, "flag");
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMapO = M.o(a(flag.a()));
        linkedHashMapO.put(flag.getKey(), str);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f6312b.getValue();
        kotlin.jvm.internal.j.f(sharedPreferences, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.j.f(editor, "editor");
        String str2 = ((e) flag.a()).f6316a;
        String strK = ((j) Y5.b.f6757a.getValue()).k(linkedHashMapO);
        kotlin.jvm.internal.j.f(strK, "toJson(...)");
        editor.putString(str2, strK);
        editor.apply();
    }
}
