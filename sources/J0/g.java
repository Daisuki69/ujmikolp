package j0;

import Ag.l;
import D.A;
import D.AbstractC0184q;
import D.B;
import D.K;
import D.S;
import D.b0;
import O.k;
import Z.n;
import android.content.Context;
import android.content.SharedPreferences;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f17646b;
    public final A c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17647d;
    public final S e;
    public final Y.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f17648g;
    public final Cg.c h;
    public final B i;

    public g(CleverTapInstanceConfig cleverTapInstanceConfig, A a8, boolean z4, Y.f fVar, Cg.c cVar, k kVar, B b8) {
        this.f17646b = cleverTapInstanceConfig;
        this.e = cleverTapInstanceConfig.c();
        this.c = a8;
        this.f17647d = z4;
        this.f = fVar;
        this.h = cVar;
        this.i = b8;
        this.f17648g = kVar;
    }

    public static void b(JSONArray jSONArray, Y.b bVar, Cg.c cVar) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String campaignId = jSONArray.optString(i);
            bVar.getClass();
            kotlin.jvm.internal.j.g(campaignId, "campaignId");
            bVar.f6702a.c("__impressions_".concat(campaignId));
            cVar.getClass();
            SharedPreferences sharedPreferencesW = cVar.w();
            if (sharedPreferencesW != null) {
                sharedPreferencesW.edit().remove("__triggers_".concat(campaignId)).apply();
            }
        }
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        d(jSONObject, context, false);
    }

    public final void c(JSONArray jSONArray) {
        try {
            N.k kVar = (N.k) this.c.f796l;
            this.i.getClass();
            kVar.g(jSONArray);
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f17646b;
            String str = cleverTapInstanceConfig.f9439a;
            this.e.getClass();
            S.s(str, "InAppManager: Malformed AppLaunched ServerSide inApps");
            S.t(cleverTapInstanceConfig.f9439a, "InAppManager: Reason: " + th2.getMessage(), th2);
        }
    }

    public final void d(JSONObject jSONObject, Context context, boolean z4) {
        ArrayList arrayList;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        CTInAppNotificationMedia cTInAppNotificationMediaH;
        try {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f17646b;
            if (cleverTapInstanceConfig.h) {
                S s9 = this.e;
                String str = cleverTapInstanceConfig.f9439a;
                s9.getClass();
                S.s(str, "CleverTap instance is configured to analytics only, not processing inapp messages");
                return;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                k templatesManager = this.f17648g;
                kotlin.jvm.internal.j.g(templatesManager, "templatesManager");
                Pair pairG = AbstractC0184q.g("inapp_notifs", jSONObject);
                Pair pairF = AbstractC0184q.f("inapp_notifs_cs", jSONObject);
                Pair pairF2 = AbstractC0184q.f("inapp_notifs_ss", jSONObject);
                Pair pairG2 = AbstractC0184q.g("inapp_notifs_applaunched", jSONObject);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (((Boolean) pairF.f18160a).booleanValue() && (jSONArray2 = (JSONArray) pairF.f18161b) != null) {
                    int length = jSONArray2.length();
                    int i = 0;
                    while (i < length) {
                        Object obj = jSONArray2.get(i);
                        if (obj instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("media");
                            if (jSONObjectOptJSONObject != null) {
                                jSONArray3 = jSONArray2;
                                CTInAppNotificationMedia cTInAppNotificationMediaH2 = AbstractC0983W.h(jSONObjectOptJSONObject, 1);
                                if (cTInAppNotificationMediaH2 != null && !C2576A.H(cTInAppNotificationMediaH2.f9512a)) {
                                    if (cTInAppNotificationMediaH2.c()) {
                                        arrayList2.add(cTInAppNotificationMediaH2.f9512a);
                                    } else if (cTInAppNotificationMediaH2.b()) {
                                        arrayList3.add(cTInAppNotificationMediaH2.f9512a);
                                    }
                                }
                            } else {
                                jSONArray3 = jSONArray2;
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("mediaLandscape");
                            if (jSONObjectOptJSONObject2 != null && (cTInAppNotificationMediaH = AbstractC0983W.h(jSONObjectOptJSONObject2, 2)) != null && !C2576A.H(cTInAppNotificationMediaH.f9512a)) {
                                if (cTInAppNotificationMediaH.c()) {
                                    arrayList2.add(cTInAppNotificationMediaH.f9512a);
                                } else if (cTInAppNotificationMediaH.b()) {
                                    arrayList3.add(cTInAppNotificationMediaH.f9512a);
                                }
                            }
                        } else {
                            jSONArray3 = jSONArray2;
                        }
                        i++;
                        jSONArray2 = jSONArray3;
                    }
                }
                if (((Boolean) pairF.f18160a).booleanValue() && (jSONArray = (JSONArray) pairF.f18161b) != null) {
                    int length2 = jSONArray.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        O.g gVar = CustomTemplateInAppData.CREATOR;
                        JSONObject jSONObjectOptJSONObject3 = jSONArray.optJSONObject(i4);
                        gVar.getClass();
                        CustomTemplateInAppData customTemplateInAppDataA = O.g.a(jSONObjectOptJSONObject3);
                        if (customTemplateInAppDataA != null) {
                            customTemplateInAppDataA.a(templatesManager, arrayList4);
                        }
                    }
                }
                ArrayList arrayListL = C1110A.L(arrayList4, C1110A.L(arrayList3, arrayList2));
                ArrayList arrayList5 = new ArrayList(t.l(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new Pair((String) it.next(), Q.a.f5194a));
                }
                ArrayList arrayList6 = new ArrayList(t.l(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(new Pair((String) it2.next(), Q.a.f5195b));
                }
                ArrayList arrayListL2 = C1110A.L(arrayList6, arrayList5);
                ArrayList arrayList7 = new ArrayList(t.l(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(new Pair((String) it3.next(), Q.a.c));
                }
                ArrayList arrayListL3 = C1110A.L(arrayList7, arrayListL2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : arrayListL3) {
                    if (hashSet.add((String) ((Pair) obj2).f18160a)) {
                        arrayList8.add(obj2);
                    }
                }
                int iOptInt = jSONObject.optInt("imc", 10);
                int iOptInt2 = jSONObject.optInt("imp", 10);
                String strOptString = jSONObject.optString("inapp_delivery_mode", "");
                kotlin.jvm.internal.j.f(strOptString, "optString(...)");
                Pair pairG3 = AbstractC0184q.g("inapp_stale", jSONObject);
                Y.f fVar = this.f;
                Y.b bVar = fVar.f6710b;
                Y.d dVar = fVar.f6709a;
                if (bVar == null || dVar == null) {
                    S s10 = this.e;
                    String str2 = this.f17646b.f9439a;
                    s10.getClass();
                    S.s(str2, "Stores are not initialised, ignoring inapps!!!!");
                    return;
                }
                S s11 = this.e;
                String str3 = this.f17646b.f9439a;
                s11.getClass();
                S.s(str3, "InApp: Processing response");
                if (this.f17647d || ((K) this.c.f791a) == null) {
                    arrayList = arrayList8;
                    S s12 = this.e;
                    String str4 = this.f17646b.f9439a;
                    s12.getClass();
                    S.s(str4, "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
                } else {
                    S.l("Updating InAppFC Limits");
                    K k8 = (K) this.c.f791a;
                    synchronized (k8) {
                        arrayList = arrayList8;
                        b0.k(context, iOptInt2, k8.i(K.d("istmcd_inapp", k8.f852d)));
                        b0.k(context, iOptInt, k8.i(K.d("imc", k8.f852d)));
                    }
                    ((K) this.c.f791a).h(context, jSONObject);
                }
                if (((Boolean) pairG3.f18160a).booleanValue()) {
                    b((JSONArray) pairG3.f18161b, bVar, this.h);
                }
                if (!strOptString.isEmpty() && !kotlin.jvm.internal.j.b(dVar.e, strOptString)) {
                    dVar.e = strOptString;
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1437347487) {
                        if (iHashCode != 2160) {
                            if (iHashCode == 2656 && strOptString.equals("SS")) {
                                dVar.f6704a.c("inapp_notifs_cs");
                                dVar.c = null;
                            }
                        } else if (strOptString.equals("CS")) {
                            dVar.f6704a.c("inapp_notifs_ss");
                        }
                    } else if (strOptString.equals("NO_MODE")) {
                        dVar.f6704a.c("inapp_notifs_ss");
                        dVar.f6704a.c("inapp_notifs_cs");
                        dVar.c = null;
                    }
                }
                if (z4) {
                    return;
                }
                if (((Boolean) pairG.f18160a).booleanValue()) {
                    l0.b.a(this.f17646b).c("TAG_FEATURE_IN_APPS").k("InAppResponse#processResponse", new n(6, this, (JSONArray) pairG.f18161b));
                }
                if (((Boolean) pairG2.f18160a).booleanValue()) {
                    c((JSONArray) pairG2.f18161b);
                }
                if (((Boolean) pairF.f18160a).booleanValue()) {
                    JSONArray clientSideInApps = (JSONArray) pairF.f18161b;
                    kotlin.jvm.internal.j.g(clientSideInApps, "clientSideInApps");
                    dVar.c = clientSideInApps;
                    String string = clientSideInApps.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    Cg.c cVar = dVar.f6705b;
                    F.e eVar = F.e.f1495a;
                    String strG = cVar.g(string);
                    if (strG != null) {
                        dVar.f6704a.f("inapp_notifs_cs", strG);
                    }
                }
                if (((Boolean) pairF2.f18160a).booleanValue()) {
                    JSONArray serverSideInAppsMetaData = (JSONArray) pairF2.f18161b;
                    kotlin.jvm.internal.j.g(serverSideInAppsMetaData, "serverSideInAppsMetaData");
                    String string2 = serverSideInAppsMetaData.toString();
                    kotlin.jvm.internal.j.f(string2, "toString(...)");
                    dVar.f6704a.f("inapp_notifs_ss", string2);
                }
                S logger = this.e;
                Y.f storeRegistry = this.f;
                kotlin.jvm.internal.j.g(context, "context");
                kotlin.jvm.internal.j.g(logger, "logger");
                kotlin.jvm.internal.j.g(storeRegistry, "storeRegistry");
                l lVar = new l(18, context, logger);
                X.d dVar2 = new X.d(new Lh.c(lVar), new W.e(lVar, logger), storeRegistry.f6711d, storeRegistry.e, storeRegistry.c);
                if (!arrayList.isEmpty()) {
                    dVar2.b(arrayList, new Rg.g(13), new Rg.g(14), new Rg.g(15));
                }
                if (!this.f17639a) {
                    S s13 = this.e;
                    String str5 = this.f17646b.f9439a;
                    s13.getClass();
                    S.s(str5, "Ignoring cache eviction");
                    return;
                }
                S s14 = this.e;
                String str6 = this.f17646b.f9439a;
                s14.getClass();
                S.s(str6, "Handling cache eviction");
                dVar2.a(arrayListL);
                return;
            }
            S s15 = this.e;
            String str7 = this.f17646b.f9439a;
            s15.getClass();
            S.s(str7, "There is no inapps data to handle");
        } catch (Throwable th2) {
            S.o("InAppManager: Failed to parse response", th2);
        }
    }
}
