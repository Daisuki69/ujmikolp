package O;

import Kh.I;
import S1.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import dOYHB6.tiZVw8.numX49;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    public static CustomTemplateInAppData a(JSONObject jSONObject) {
        if (jSONObject != null) {
            I i = N.c.f3442b;
            String strOptString = jSONObject.optString(SessionDescription.ATTR_TYPE);
            i.getClass();
            if (N.c.f3451r == I.g(strOptString)) {
                CustomTemplateInAppData customTemplateInAppData = new CustomTemplateInAppData(null);
                customTemplateInAppData.f9515a = s.k(jSONObject, "templateName");
                customTemplateInAppData.f9516b = jSONObject.optBoolean(numX49.tnTj78("Pz6"));
                customTemplateInAppData.c = s.k(jSONObject, "templateId");
                customTemplateInAppData.f9517d = s.k(jSONObject, "templateDescription");
                customTemplateInAppData.e = jSONObject.optJSONObject("vars");
                return customTemplateInAppData;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.j.g(parcel, numX49.tnTj78("Pza"));
        return new CustomTemplateInAppData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CustomTemplateInAppData[i];
    }
}
