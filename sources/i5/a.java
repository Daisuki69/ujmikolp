package I5;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.paymaya.common.utility.C;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static byte[] a(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestReferenceNo", str3);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("productKey", "MAYA_CREDIT_CONSUMER_LOAN");
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("requestReferenceNo", str3);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(TtmlNode.ATTR_ID, str);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject2.put(AppsFlyerProperties.CHANNEL, str2);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        try {
            jSONObject2.put("version", str4);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        try {
            jSONObject2.put("dataReferenceId", str5);
        } catch (JSONException unused7) {
            yk.a.e();
        }
        if (bool != null) {
            try {
                jSONObject2.put("permission", bool);
            } catch (JSONException unused8) {
                yk.a.e();
            }
        }
        if (bool2 != null) {
            try {
                jSONObject2.put("isCreditScoringEnabled", bool2);
            } catch (JSONException unused9) {
                yk.a.e();
            }
        }
        try {
            jSONObject.put("device", jSONObject2);
        } catch (JSONException unused10) {
            yk.a.e();
        }
        return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] b(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, "msisdn");
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("password", str2);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject2.put("identity", jSONObject);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject2.put("source", "android");
        } catch (JSONException unused5) {
            yk.a.e();
        }
        if (!C.e(str3)) {
            try {
                jSONObject2.put("device_token", str3);
            } catch (JSONException unused6) {
                yk.a.e();
            }
        }
        return jSONObject2.toString().getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("challenge_id", str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("mfa", jSONObject);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject2.put("source", "android");
        } catch (JSONException unused3) {
            yk.a.e();
        }
        return jSONObject2.toString().getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp_id", str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("otp", str2);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("registration_id", str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("vcode", str2);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
    }
}
