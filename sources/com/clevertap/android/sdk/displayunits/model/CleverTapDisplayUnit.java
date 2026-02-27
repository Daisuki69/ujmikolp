package com.clevertap.android.sdk.displayunits.model;

import A1.a;
import D.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f9460b;
    public HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9461d;
    public JSONObject e;
    public I.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9462g;

    public CleverTapDisplayUnit(JSONObject jSONObject, String str, I.a aVar, String str2, ArrayList arrayList, JSONObject jSONObject2, String str3) {
        this.e = jSONObject;
        this.f9462g = str;
        this.f = aVar;
        this.f9459a = str2;
        this.f9460b = arrayList;
        HashMap map = null;
        if (jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                if (itKeys != null) {
                    HashMap map2 = null;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            map2 = map2 == null ? new HashMap() : map2;
                            map2.put(next, string);
                        }
                    }
                    map = map2;
                }
            } catch (Exception e) {
                S.c("DisplayUnit : ", "Error in getting Key Value Pairs " + e.getLocalizedMessage());
            }
        }
        this.c = map;
        this.f9461d = str3;
    }

    public static CleverTapDisplayUnit b(JSONObject jSONObject) {
        I.a aVar;
        try {
            String string = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            if (jSONObject.has(SessionDescription.ATTR_TYPE)) {
                String string2 = jSONObject.getString(SessionDescription.ATTR_TYPE);
                if (!TextUtils.isEmpty(string2)) {
                    string2.getClass();
                    switch (string2) {
                        case "carousel-image":
                            aVar = I.a.e;
                            break;
                        case "message-icon":
                            aVar = I.a.f;
                            break;
                        case "simple":
                            aVar = I.a.f2192b;
                            break;
                        case "custom-key-value":
                            aVar = I.a.f2194g;
                            break;
                        case "carousel":
                            aVar = I.a.f2193d;
                            break;
                        case "simple-image":
                            aVar = I.a.c;
                            break;
                    }
                }
                Log.d("DisplayUnit : ", "Unsupported Display Unit Type");
                aVar = null;
            } else {
                aVar = null;
            }
            String string3 = jSONObject.has("bg") ? jSONObject.getString("bg") : "";
            JSONArray jSONArray = jSONObject.has("content") ? jSONObject.getJSONArray("content") : null;
            String str = string3;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContentA = CleverTapDisplayUnitContent.a(jSONArray.getJSONObject(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitContentA.c)) {
                        arrayList.add(cleverTapDisplayUnitContentA);
                    }
                }
            }
            return new CleverTapDisplayUnit(jSONObject, string, aVar, str, arrayList, jSONObject.has("custom_kv") ? jSONObject.getJSONObject("custom_kv") : null, null);
        } catch (Exception e) {
            S.c("DisplayUnit : ", "Unable to init CleverTapDisplayUnit with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e.getLocalizedMessage());
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return null;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            JSONObject jSONObject2 = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return jSONObject2;
        } catch (Exception e) {
            S.c("DisplayUnit : ", "Error in getting WiZRK fields " + e.getLocalizedMessage());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(" Unit id- ");
            sb2.append(this.f9462g);
            sb2.append(", Type- ");
            I.a aVar = this.f;
            sb2.append(aVar != null ? aVar.f2195a : null);
            sb2.append(", bgColor- ");
            sb2.append(this.f9459a);
            ArrayList arrayList = this.f9460b;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = (CleverTapDisplayUnitContent) arrayList.get(i);
                    if (cleverTapDisplayUnitContent != null) {
                        sb2.append(", Content Item:");
                        sb2.append(i);
                        sb2.append(Global.BLANK);
                        sb2.append(cleverTapDisplayUnitContent.toString());
                        sb2.append(Global.NEWLINE);
                    }
                }
            }
            HashMap map = this.c;
            if (map != null) {
                sb2.append(", Custom KV:");
                sb2.append(map);
            }
            sb2.append(", JSON -");
            sb2.append(this.e);
            sb2.append(", Error-");
            sb2.append(this.f9461d);
            sb2.append(" ]");
            return sb2.toString();
        } catch (Exception e) {
            S.c("DisplayUnit : ", "Exception in toString:" + e);
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9462g);
        parcel.writeValue(this.f);
        parcel.writeString(this.f9459a);
        ArrayList arrayList = this.f9460b;
        if (arrayList == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList);
        }
        parcel.writeMap(this.c);
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject.toString());
        }
        parcel.writeString(this.f9461d);
    }
}
