package pg;

import M8.T2;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f19110a = new o();

    @Override // pg.q
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            F.f19098b.getClass();
            JSONTokener jSONTokener = new JSONTokener(F.a(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // pg.q
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objT = T2.T(obj);
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
