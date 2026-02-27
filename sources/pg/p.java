package pg;

import M8.T2;
import io.flutter.plugin.common.FlutterException;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.ByteBuffer;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f19111a = new p();

    @Override // pg.v
    public final r a(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    F.f19098b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(F.a(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Invalid JSON", e);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get(Constants.METHOD);
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new r((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // pg.v
    public final ByteBuffer b(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(T2.T(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objT = T2.T(jSONArrayPut);
        if (objT instanceof String) {
            F f = F.f19098b;
            String strQuote = JSONObject.quote((String) objT);
            f.getClass();
            return F.b(strQuote);
        }
        F f3 = F.f19098b;
        String string = objT.toString();
        f3.getClass();
        return F.b(string);
    }

    @Override // pg.v
    public final ByteBuffer c(r rVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.METHOD, rVar.f19112a);
            jSONObject.put("args", T2.T(rVar.f19113b));
            Object objT = T2.T(jSONObject);
            if (objT instanceof String) {
                F f = F.f19098b;
                String strQuote = JSONObject.quote((String) objT);
                f.getClass();
                return F.b(strQuote);
            }
            F f3 = F.f19098b;
            String string = objT.toString();
            f3.getClass();
            return F.b(string);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // pg.v
    public final Object d(ByteBuffer byteBuffer) {
        try {
            try {
                F.f19098b.getClass();
                JSONTokener jSONTokener = new JSONTokener(F.a(byteBuffer));
                Object objNextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object objOpt = jSONArray.opt(0);
                        if (objOpt == JSONObject.NULL) {
                            return null;
                        }
                        return objOpt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object objOpt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (objOpt2 == obj3) {
                            objOpt2 = null;
                        }
                        Object objOpt3 = jSONArray.opt(2);
                        if (objOpt3 != obj3) {
                            obj = objOpt3;
                        }
                        if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                            throw new FlutterException((String) obj2, (String) objOpt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON", e);
            }
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // pg.v
    public final ByteBuffer e(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR).put(T2.T(str)).put(JSONObject.NULL).put(T2.T(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objT = T2.T(jSONArrayPut);
        if (objT instanceof String) {
            F f = F.f19098b;
            String strQuote = JSONObject.quote((String) objT);
            f.getClass();
            return F.b(strQuote);
        }
        F f3 = F.f19098b;
        String string = objT.toString();
        f3.getClass();
        return F.b(string);
    }

    @Override // pg.v
    public final ByteBuffer f(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(T2.T(str2)).put(T2.T(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objT = T2.T(jSONArrayPut);
        if (objT instanceof String) {
            F f = F.f19098b;
            String strQuote = JSONObject.quote((String) objT);
            f.getClass();
            return F.b(strQuote);
        }
        F f3 = F.f19098b;
        String string = objT.toString();
        f3.getClass();
        return F.b(string);
    }
}
