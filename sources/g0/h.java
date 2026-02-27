package g0;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16784b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16785d;

    public h(String str, String str2, String str3, String str4) {
        this.f16785d = str;
        this.c = str2;
        this.f16783a = str3;
        this.f16784b = str4;
    }

    public static h a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("ctProviderClassName");
            String string2 = jSONObject.getString("messagingSDKClassName");
            return new h(jSONObject.getString(SessionDescription.ATTR_TYPE), jSONObject.getString("tokenPrefKey"), string, string2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f16783a, hVar.f16783a) && Objects.equals(this.f16784b, hVar.f16784b) && Objects.equals(this.c, hVar.c) && Objects.equals(this.f16785d, hVar.f16785d);
    }

    public final int hashCode() {
        return Objects.hash(this.f16783a, this.f16784b, this.c, this.f16785d);
    }

    public final String toString() {
        return s.p(new StringBuilder(" [PushType:"), this.f16785d, "] ");
    }
}
