package N;

import S1.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public static CTInAppAction a(JSONObject jSONObject) {
        f fVarV = null;
        if (jSONObject == null) {
            return null;
        }
        CTInAppAction cTInAppAction = new CTInAppAction(null);
        String strK = s.k(jSONObject, SessionDescription.ATTR_TYPE);
        if (strK != null) {
            f.f3462b.getClass();
            fVarV = M2.b.V(strK);
        }
        cTInAppAction.f9471a = fVarV;
        cTInAppAction.f9472b = s.k(jSONObject, numX49.tnTj78("PJPa"));
        CustomTemplateInAppData.CREATOR.getClass();
        cTInAppAction.f9473d = O.g.a(jSONObject);
        cTInAppAction.e = jSONObject.optBoolean(numX49.tnTj78("PJPX"));
        String strOptString = jSONObject.optString(SessionDescription.ATTR_TYPE);
        String strTnTj78 = numX49.tnTj78("PJPG");
        if (strTnTj78.equalsIgnoreCase(strOptString) && jSONObject.has(strTnTj78)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strTnTj78);
            HashMap map = cTInAppAction.c;
            if (map == null) {
                map = new HashMap();
            }
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                kotlin.jvm.internal.j.f(itKeys, numX49.tnTj78("PJP3"));
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString2 = jSONObjectOptJSONObject.optString(next);
                    kotlin.jvm.internal.j.d(strOptString2);
                    if (strOptString2.length() > 0) {
                        map.put(next, strOptString2);
                    }
                }
                cTInAppAction.c = map;
            }
        }
        return cTInAppAction;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.j.g(parcel, numX49.tnTj78("PJPy"));
        return new CTInAppAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CTInAppAction[i];
    }
}
