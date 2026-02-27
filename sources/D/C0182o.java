package D;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.core.app.FrameMetricsAggregator;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import o0.C1954a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: D.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0182o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f932b;

    public C0182o(C0187u c0187u, CTInAppBaseFragment cTInAppBaseFragment) {
        this.f931a = new WeakReference(null);
        this.f932b = new WeakReference(null);
        this.f931a = new WeakReference(c0187u);
        this.f932b = new WeakReference(cTInAppBaseFragment);
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peu3"));
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            ((C0176i) c0187u.f949b.f).b(str);
            return;
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(str2));
        C0176i c0176i = (C0176i) c0187u.f949b.f;
        ((l0.c) c0176i.f922p).b().k(numX49.tnTj78("Peuy"), new CallableC0175h(c0176i, arrayList, str, 2));
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peuv"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("Peu7"));
            return;
        }
        if (str2 == null) {
            S.l("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList arrayListB = d0.b(new JSONArray(str2));
            C0176i c0176i = (C0176i) c0187u.f949b.f;
            ((l0.c) c0176i.f922p).b().k("addMultiValuesForKey", new CallableC0175h(c0176i, arrayListB, str, 2));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("PeuA")));
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d10) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeuY"));
        } else {
            ((C0176i) c0187u.f949b.f).a(Double.valueOf(d10), str, numX49.tnTj78("PeuT"));
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (((C0187u) this.f931a.get()) == null) {
            S.b(numX49.tnTj78("PeuR"));
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = (CTInAppBaseFragment) this.f932b.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.m1(null);
        }
    }

    @JavascriptInterface
    public int getSdkVersion() {
        return 70502;
    }

    @JavascriptInterface
    public void incrementValue(String str, double d10) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peup"));
        } else {
            ((C0176i) c0187u.f949b.f).a(Double.valueOf(d10), str, numX49.tnTj78("Peu0"));
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peug"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("Peu1"));
            return;
        }
        try {
            c0187u.l(d0.c(new JSONObject(str)));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("Peuf")));
        }
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z4) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peun"));
        } else {
            dismissInAppNotification();
            ((N.k) c0187u.f949b.f818k).f3478k.C(z4);
        }
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList arrayList;
        Iterator it;
        String strTnTj78;
        String strTnTj782;
        o0.d dVar;
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peux"));
            return;
        }
        HashMap map = new HashMap();
        if (str == null) {
            S.l(numX49.tnTj78("Peuz"));
            return;
        }
        try {
            map = d0.c(new JSONObject(str));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("Peus")));
        }
        if (str2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                Pattern pattern = d0.f906a;
                arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(d0.c(jSONArray.getJSONObject(i)));
                    } catch (JSONException e7) {
                        S.l("Could not convert JSONArray of JSONObjects to ArrayList of HashMaps - " + e7.getMessage());
                    }
                }
            } catch (JSONException e10) {
                AbstractC1414e.t(e10, new StringBuilder(numX49.tnTj78("Peu5")));
                arrayList = null;
            }
            C0176i c0176i = (C0176i) c0187u.f949b.f;
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c0176i.f917g;
            if (arrayList == null) {
                S sC = cleverTapInstanceConfig.c();
                String str3 = cleverTapInstanceConfig.f9439a;
                sC.getClass();
                S.g(str3, numX49.tnTj78("PeuJ"));
                return;
            }
            int size = arrayList.size();
            o0.c cVar = (o0.c) c0176i.f919l;
            if (size > 50) {
                C1954a c1954aA = o0.b.a(new String[0], 522, -1);
                S sC2 = cleverTapInstanceConfig.c();
                String str4 = c1954aA.f18752b;
                String str5 = cleverTapInstanceConfig.f9439a;
                sC2.getClass();
                S.g(str5, str4);
                cVar.b(c1954aA);
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                it = map.keySet().iterator();
            } catch (Throwable unused) {
                return;
            }
            while (true) {
                boolean zHasNext = it.hasNext();
                strTnTj78 = numX49.tnTj78("PeuI");
                strTnTj782 = numX49.tnTj78("Peuq");
                dVar = (o0.d) c0176i.m;
                if (!zHasNext) {
                    break;
                }
                String str6 = (String) it.next();
                Object obj = map.get(str6);
                dVar.getClass();
                C1954a c1954aC = o0.d.c(str6);
                String string = c1954aC.c.toString();
                if (c1954aC.f18751a != 0) {
                    jSONObject2.put("wzrk_error", n0.b.c(c1954aC));
                }
                try {
                    C1954a c1954aD = o0.d.d(2, obj);
                    Object obj2 = c1954aD.c;
                    if (c1954aD.f18751a != 0) {
                        jSONObject2.put("wzrk_error", n0.b.c(c1954aD));
                    }
                    jSONObject.put(string, obj2);
                } catch (IllegalArgumentException unused2) {
                    if (obj != null) {
                        strTnTj78 = obj.toString();
                    }
                    C1954a c1954aA2 = o0.b.a(new String[]{strTnTj782, string, strTnTj78}, FrameMetricsAggregator.EVERY_DURATION, 7);
                    cVar.b(c1954aA2);
                    S sC3 = cleverTapInstanceConfig.c();
                    String str7 = cleverTapInstanceConfig.f9439a;
                    String str8 = c1954aA2.f18752b;
                    sC3.getClass();
                    S.g(str7, str8);
                }
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                HashMap map2 = (HashMap) it2.next();
                JSONObject jSONObject3 = new JSONObject();
                for (String str9 : map2.keySet()) {
                    Object obj3 = map2.get(str9);
                    dVar.getClass();
                    C1954a c1954aC2 = o0.d.c(str9);
                    Iterator it3 = it2;
                    String string2 = c1954aC2.c.toString();
                    HashMap map3 = map2;
                    if (c1954aC2.f18751a != 0) {
                        jSONObject2.put("wzrk_error", n0.b.c(c1954aC2));
                    }
                    try {
                        C1954a c1954aD2 = o0.d.d(2, obj3);
                        Object obj4 = c1954aD2.c;
                        if (c1954aD2.f18751a != 0) {
                            jSONObject2.put("wzrk_error", n0.b.c(c1954aD2));
                        }
                        jSONObject3.put(string2, obj4);
                    } catch (IllegalArgumentException unused3) {
                        C1954a c1954aA3 = o0.b.a(new String[]{string2, obj3 != null ? obj3.toString() : strTnTj78}, FrameMetricsAggregator.EVERY_DURATION, 15);
                        S sC4 = cleverTapInstanceConfig.c();
                        String str10 = cleverTapInstanceConfig.f9439a;
                        String str11 = c1954aA3.f18752b;
                        sC4.getClass();
                        S.g(str10, str11);
                        cVar.b(c1954aA3);
                    }
                    it2 = it3;
                    map2 = map3;
                }
                jSONArray2.put(jSONObject3);
                it2 = it2;
            }
            jSONObject.put("Items", jSONArray2);
            jSONObject2.put("evtName", strTnTj782);
            jSONObject2.put("evtData", jSONObject);
            ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject2, 4);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("Peul"));
        } else {
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            c0187u.o(str, null);
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeVb"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("PeVL"));
            return;
        }
        try {
            ((C0176i) c0187u.f949b.f).x(d0.c(new JSONObject(str)));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("PeV2")));
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeVr"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("PeVZ"));
            return;
        }
        if (str2 == null) {
            S.l(numX49.tnTj78("PeVk"));
            return;
        }
        if (str2.isEmpty()) {
            ((C0176i) c0187u.f949b.f).b(str);
            return;
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(str2));
        C0176i c0176i = (C0176i) c0187u.f949b.f;
        ((l0.c) c0176i.f922p).b().k(numX49.tnTj78("PeVB"), new CallableC0175h(c0176i, arrayList, str, 0));
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeVu"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("PeVV"));
            return;
        }
        if (str2 == null) {
            S.l("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList arrayListB = d0.b(new JSONArray(str2));
            C0176i c0176i = (C0176i) c0187u.f949b.f;
            ((l0.c) c0176i.f922p).b().k("removeMultiValuesForKey", new CallableC0175h(c0176i, arrayListB, str, 0));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("PeVS")));
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeVj"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("PeVd"));
            return;
        }
        C0176i c0176i = (C0176i) c0187u.f949b.f;
        ((l0.c) c0176i.f922p).b().k(numX49.tnTj78("PeVi"), new CallableC0170c(1, c0176i, str));
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeVE"));
            return;
        }
        if (str == null) {
            S.l(numX49.tnTj78("PeVF"));
            return;
        }
        if (str2 == null) {
            S.l("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList arrayListB = d0.b(new JSONArray(str2));
            C0176i c0176i = (C0176i) c0187u.f949b.f;
            ((l0.c) c0176i.f922p).b().k("setMultiValuesForKey", new CallableC0175h(c0176i, arrayListB, str, 1));
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("PeVH")));
        }
    }

    @JavascriptInterface
    public void triggerInAppAction(String str, String str2, String str3) {
        String strTnTj78 = numX49.tnTj78("PeVO");
        if (((C0187u) this.f931a.get()) == null) {
            S.b(numX49.tnTj78("PeVQ"));
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = (CTInAppBaseFragment) this.f932b.get();
        if (cTInAppBaseFragment == null) {
            S.b(numX49.tnTj78("PeVt"));
            return;
        }
        if (str == null) {
            S.b(numX49.tnTj78("PeVU"));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            CTInAppAction.CREATOR.getClass();
            CTInAppAction cTInAppActionA = N.a.a(jSONObject);
            if (cTInAppActionA == null) {
                S.b(strTnTj78.concat(str));
                return;
            }
            Bundle bundle = new Bundle();
            if (str3 != null) {
                bundle.putString("button_id", str3);
            }
            cTInAppBaseFragment.u1(cTInAppActionA, str2, bundle);
        } catch (JSONException unused) {
            S.b(strTnTj78.concat(str));
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        C0187u c0187u = (C0187u) this.f931a.get();
        if (c0187u == null) {
            S.b(numX49.tnTj78("PeuW"));
            return;
        }
        if (str2 != null) {
            try {
                c0187u.o(str, d0.c(new JSONObject(str2)));
                return;
            } catch (JSONException e) {
                AbstractC1414e.t(e, new StringBuilder(numX49.tnTj78("PeV9")));
                return;
            }
        }
        S.l(numX49.tnTj78("PeVP"));
    }
}
