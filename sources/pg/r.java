package pg;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19113b;

    public r(String str, Object obj) {
        this.f19112a = str;
        this.f19113b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f19113b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public final boolean b(String str) {
        Object obj = this.f19113b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
