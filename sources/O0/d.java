package o0;

import We.s;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f18755b = {".", Global.COLON, "$", "'", "\"", "\\"};
    public static final String[] c = {".", Global.COLON, "$", "'", "\"", "\\"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f18756d = {"'", "\"", "\\"};
    public static final String[] e = {"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced", "Geocluster Entered", "Geocluster Exited", "SCOutgoing", "SCIncoming", "SCEnd", "SCCampaignOptOut"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18757a;

    public static C1954a a(String str) {
        C1954a c1954a = new C1954a();
        String strTrim = str.trim();
        String[] strArr = f18755b;
        for (int i = 0; i < 6; i++) {
            strTrim = strTrim.replace(strArr[i], "");
        }
        if (strTrim.length() > 512) {
            strTrim = strTrim.substring(0, FrameMetricsAggregator.EVERY_DURATION);
            C1954a c1954aA = b.a(new String[]{strTrim.trim(), "512"}, TypedValues.PositionType.TYPE_POSITION_TYPE, 11);
            c1954a.f18752b = c1954aA.f18752b;
            c1954a.f18751a = c1954aA.f18751a;
        }
        c1954a.c = strTrim.trim();
        return c1954a;
    }

    public static C1954a b(String str) {
        C1954a c1954a = new C1954a();
        String lowerCase = str.trim().toLowerCase();
        String[] strArr = f18756d;
        for (int i = 0; i < 3; i++) {
            lowerCase = lowerCase.replace(strArr[i], "");
        }
        try {
            if (lowerCase.length() > 512) {
                lowerCase = lowerCase.substring(0, FrameMetricsAggregator.EVERY_DURATION);
                C1954a c1954aA = b.a(new String[]{lowerCase, "512"}, 521, 11);
                c1954a.f18752b = c1954aA.f18752b;
                c1954a.f18751a = c1954aA.f18751a;
            }
        } catch (Exception unused) {
        }
        c1954a.c = lowerCase;
        return c1954a;
    }

    public static C1954a c(String str) {
        C1954a c1954a = new C1954a();
        String strTrim = str.trim();
        String[] strArr = c;
        for (int i = 0; i < 6; i++) {
            strTrim = strTrim.replace(strArr[i], "");
        }
        if (strTrim.length() > 120) {
            strTrim = strTrim.substring(0, 119);
            C1954a c1954aA = b.a(new String[]{strTrim.trim(), "120"}, 520, 11);
            c1954a.f18752b = c1954aA.f18752b;
            c1954a.f18751a = c1954aA.f18751a;
        }
        c1954a.c = strTrim.trim();
        return c1954a;
    }

    public static C1954a d(int i, Object obj) {
        C1954a c1954a = new C1954a();
        if ((obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Long)) {
            c1954a.c = obj;
            return c1954a;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            String strTrim = (obj instanceof Character ? String.valueOf(obj) : (String) obj).trim();
            String[] strArr = f18756d;
            for (int i4 = 0; i4 < 3; i4++) {
                strTrim = strTrim.replace(strArr[i4], "");
            }
            try {
                if (strTrim.length() > 512) {
                    strTrim = strTrim.substring(0, FrameMetricsAggregator.EVERY_DURATION);
                    C1954a c1954aA = b.a(new String[]{strTrim.trim(), "512"}, 521, 11);
                    c1954a.f18752b = c1954aA.f18752b;
                    c1954a.f18751a = c1954aA.f18751a;
                }
            } catch (Exception unused) {
            }
            c1954a.c = strTrim.trim();
        } else {
            if (obj instanceof Date) {
                c1954a.c = "$D_" + (((Date) obj).getTime() / 1000);
                return c1954a;
            }
            boolean z4 = obj instanceof String[];
            if ((!z4 && !(obj instanceof ArrayList)) || !AbstractC2217b.b(i, 1)) {
                throw new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
            }
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            String[] strArr2 = z4 ? (String[]) obj : null;
            ArrayList arrayList2 = new ArrayList();
            if (strArr2 != null) {
                for (String str : strArr2) {
                    try {
                        arrayList2.add(str);
                    } catch (Exception unused2) {
                    }
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add((String) it.next());
                    } catch (Exception unused3) {
                    }
                }
            }
            String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
            if (strArr3.length <= 0 || strArr3.length > 100) {
                C1954a c1954aA2 = b.a(new String[]{s.o(new StringBuilder(), "", strArr3.length), "100"}, 521, 13);
                c1954a.f18752b = c1954aA2.f18752b;
                c1954a.f18751a = c1954aA2.f18751a;
            } else {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                for (String str2 : strArr3) {
                    jSONArray.put(str2);
                }
                try {
                    jSONObject.put("$set", jSONArray);
                } catch (JSONException unused4) {
                }
                c1954a.c = jSONObject;
            }
        }
        return c1954a;
    }

    public static int e(JSONArray jSONArray, HashSet hashSet, BitSet bitSet, int i) {
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            try {
                Object obj = jSONArray.get(length);
                String string = obj != null ? obj.toString() : null;
                if (bitSet == null) {
                    if (string != null) {
                        hashSet.add(string);
                    }
                } else if (string == null || hashSet.contains(string)) {
                    bitSet.set(length + i, true);
                } else {
                    hashSet.add(string);
                    if (hashSet.size() == 100) {
                        return length;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
