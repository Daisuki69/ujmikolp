package d0;

import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1325a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f16234b;
    public final JSONArray c;

    public C1325a(JSONObject jSONObject, JSONArray queue, int i) {
        this.f16233a = i;
        switch (i) {
            case 1:
                j.g(queue, "queue");
                this.f16234b = jSONObject;
                this.c = queue;
                break;
            default:
                this.f16234b = jSONObject;
                this.c = queue;
                break;
        }
    }

    public final String toString() {
        switch (this.f16233a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(this.f16234b);
                sb2.append(',');
                String string = this.c.toString();
                j.f(string, "toString(...)");
                String strSubstring = string.substring(1);
                j.f(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            default:
                JSONArray jSONArray = this.c;
                JSONObject jSONObject = this.f16234b;
                if (jSONObject == null) {
                    String string2 = jSONArray.toString();
                    j.d(string2);
                    return string2;
                }
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(jSONObject);
                sb3.append(',');
                String string3 = jSONArray.toString();
                j.f(string3, "toString(...)");
                String strSubstring2 = string3.substring(1);
                j.f(strSubstring2, "substring(...)");
                sb3.append(strSubstring2);
                return sb3.toString();
        }
    }
}
