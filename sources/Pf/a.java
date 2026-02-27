package Pf;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.paymaya.domain.model.DeviceInformation;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5159b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5160d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5161g;
    public HashMap h;
    public String i;
    public int j;

    public static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str.isEmpty() || str2 == null || str2.isEmpty()) {
            return;
        }
        jSONObject.putOpt(str, str2);
    }

    public final String b() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cts", this.f);
        jSONObject.put("t", (Object) null);
        jSONObject.put("tid", this.f5161g);
        int i = this.j;
        if (i == 1) {
            str = "android";
        } else if (i == 2) {
            str = DeviceInformation.PLATFORM_IOS;
        } else if (i == 3) {
            str = "web";
        } else if (i == 4) {
            str = "db";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "server";
        }
        jSONObject.put("ds", str);
        jSONObject.put(CmcdConfiguration.KEY_CONTENT_ID, this.e);
        a(jSONObject, CmcdConfiguration.KEY_SESSION_ID, this.i);
        a(jSONObject, "uid", null);
        a(jSONObject, "uip", null);
        a(jSONObject, "ua", null);
        a(jSONObject, "geoid", null);
        a(jSONObject, "dt", null);
        a(jSONObject, "an", this.f5158a);
        a(jSONObject, CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, this.f5159b);
        a(jSONObject, "aid", this.c);
        a(jSONObject, "aiid", this.f5160d);
        HashMap map = this.h;
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject2.putOpt(str2, map.get(str2));
            }
            jSONObject.put("m", jSONObject2);
        }
        return jSONObject.toString();
    }
}
