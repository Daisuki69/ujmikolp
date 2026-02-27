package Ei;

import A7.f;
import D.A;
import D.AbstractC0184q;
import D.B;
import D.C0176i;
import D.C0187u;
import D.C0190x;
import D.H;
import D.K;
import D.S;
import D.b0;
import Y.e;
import android.content.Context;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import b0.d;
import bi.C1026d;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.messaging.r;
import g0.InterfaceC1492a;
import g0.g;
import g0.h;
import io.split.android.client.service.sseclient.notifications.MySegmentsV2PayloadDecoder;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import io.split.android.client.service.sseclient.notifications.mysegments.MembershipsNotificationProcessorFactoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1368b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1369d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1370g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1371k;

    public a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, B b8, A a8, H h, e eVar, Qd.a aVar, Ci.b bVar, o0.c cVar, C0190x c0190x, C0190x c0190x2, S s9) {
        j.g(context, "context");
        this.f1367a = context;
        this.f1368b = cleverTapInstanceConfig;
        this.c = b8;
        this.f1369d = a8;
        this.e = h;
        this.f = eVar;
        this.f1370g = aVar;
        this.h = bVar;
        this.i = cVar;
        this.j = c0190x;
        this.f1371k = c0190x2;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f1368b;
        String str = cleverTapInstanceConfig.f9439a;
        String str2 = cleverTapInstanceConfig.c;
        jSONObject.put(TtmlNode.ATTR_ID, str);
        jSONObject.put("tk", str2);
        jSONObject.put("l_ts", ((Number) ((C0190x) this.f1371k).invoke()).intValue());
        jSONObject.put("f_ts", ((Number) ((C0190x) this.j).invoke()).intValue());
    }

    public void b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        K k8 = (K) ((A) this.f1369d).f791a;
        if (k8 != null) {
            S.l("Attaching InAppFC to Header");
            jSONObject.put("imp", k8.c(0, K.d("istc_inapp", k8.f852d)));
            Context context = (Context) this.f1367a;
            try {
                jSONArray = new JSONArray();
                for (Map.Entry<String, ?> entry : b0.f(context, k8.i(K.d("counts_per_inapp", k8.f852d))).getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        String[] strArrSplit = ((String) entry.getValue()).split(",");
                        if (strArrSplit.length == 2) {
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(0, entry.getKey());
                            jSONArray2.put(1, Integer.parseInt(strArrSplit[0]));
                            jSONArray2.put(2, Integer.parseInt(strArrSplit[1]));
                            jSONArray.put(jSONArray2);
                        }
                    }
                }
            } catch (Throwable th2) {
                S.o("Failed to get in apps count", th2);
                jSONArray = null;
            }
            if (jSONObject.put("tlc", jSONArray) != null) {
                return;
            }
        }
        S.s(((CleverTapInstanceConfig) this.f1368b).f9439a, "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
        Unit unit = Unit.f18162a;
    }

    public void c(JSONObject jSONObject) {
        String str;
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strH = ((B) this.c).h();
            if (strH != null) {
                jSONObject2.put("us", strH);
            }
            B b8 = (B) this.c;
            synchronized (b8) {
                str = b8.f810r;
            }
            if (str != null) {
                jSONObject2.put("um", str);
            }
            String strE = ((B) this.c).e();
            if (strE != null) {
                jSONObject2.put("uc", strE);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("ref", jSONObject2);
            }
        } catch (JSONException e) {
            S.t(((CleverTapInstanceConfig) this.f1368b).f9439a, "Failed to attach ref", e);
        }
    }

    public JSONObject d(String str) {
        boolean z4;
        JSONObject jSONObject;
        boolean z5;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f1368b;
        String str2 = cleverTapInstanceConfig.f9439a;
        String str3 = cleverTapInstanceConfig.c;
        if (str2 == null || str3 == null) {
            S.g(str2, "Account ID/token not found, unable to configure queue request");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (str != null) {
                jSONObject2.put("d_src", str);
            }
            String strF = ((H) this.e).f();
            if (strF == null || strF.length() == 0) {
                S.s(((CleverTapInstanceConfig) this.f1368b).f9439a, "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
            } else {
                jSONObject2.put("g", strF);
            }
            jSONObject2.put(SessionDescription.ATTR_TYPE, "meta");
            jSONObject2.put("af", ((H) this.e).d());
            Qd.a aVar = (Qd.a) this.f1370g;
            Context context = (Context) this.f1367a;
            j.g(context, "context");
            CleverTapInstanceConfig cleverTapInstanceConfig2 = (CleverTapInstanceConfig) aVar.f5354b;
            long jD = b0.d(context, cleverTapInstanceConfig2, "comms_i");
            if (jD > 0) {
                jSONObject2.put("_i", jD);
            }
            long jD2 = b0.d(context, cleverTapInstanceConfig2, "comms_j");
            if (jD2 > 0) {
                jSONObject2.put("_j", jD2);
            }
            a(jSONObject2);
            jSONObject2.put("ct_pi", d.a((Context) this.f1367a, (CleverTapInstanceConfig) this.f1368b, (o0.c) this.i).b().toString());
            if (AbstractC0184q.a((Context) this.f1367a)) {
                g gVar = (g) ((A) this.f1369d).m;
                if (gVar != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVar.f16778b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InterfaceC1492a) it.next()).getPushType());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z5 = false;
                            break;
                        }
                        if (gVar.c((h) it2.next()) != null) {
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        z4 = true;
                    }
                }
                z4 = false;
            } else {
                z4 = true;
            }
            jSONObject2.put("ddnd", z4);
            B b8 = (B) this.c;
            if (b8.f805l) {
                jSONObject2.put("bk", 1);
                b8.f805l = false;
            }
            jSONObject2.put("rtl", n0.b.d(((Ci.b) this.h).D((Context) this.f1367a).i()));
            B b10 = (B) this.c;
            if (!b10.f804k) {
                jSONObject2.put("rct", b10.f808p);
                jSONObject2.put("ait", b10.c);
            }
            B b11 = (B) this.c;
            jSONObject2.put("frs", b11.i);
            b11.i = false;
            if (C0187u.c == 3) {
                jSONObject2.put("debug", true);
            }
            try {
                JSONObject jSONObjectH = ((e) this.f).h((Context) this.f1367a);
                if (jSONObjectH != null && jSONObjectH.length() > 0) {
                    jSONObject2.put("arp", jSONObjectH);
                }
            } catch (JSONException e) {
                S.t(((CleverTapInstanceConfig) this.f1368b).f9439a, "Failed to attach ARP", e);
            }
            c(jSONObject2);
            B b12 = (B) this.c;
            synchronized (b12) {
                jSONObject = b12.f812t;
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObject2.put("wzrk_ref", jSONObject);
            }
            b(jSONObject2);
            return jSONObject2;
        } catch (JSONException e7) {
            S.t(((CleverTapInstanceConfig) this.f1368b).f9439a, "CommsManager: Failed to attach header", e7);
            return null;
        }
    }

    public a(Xh.d dVar, f fVar, C0176i c0176i, f fVar2, Ai.c cVar, Bi.e eVar, zi.c cVar2, C1026d c1026d, r rVar, NotificationProcessor notificationProcessor, MembershipsNotificationProcessorFactoryImpl membershipsNotificationProcessorFactoryImpl, MySegmentsV2PayloadDecoder mySegmentsV2PayloadDecoder) {
        this.f1367a = fVar;
        this.c = c0176i;
        this.f1369d = fVar2;
        this.e = cVar;
        this.i = c1026d;
        this.f = eVar;
        this.h = notificationProcessor;
        this.f1370g = cVar2;
        this.j = rVar;
        this.f1368b = membershipsNotificationProcessorFactoryImpl;
        this.f1371k = mySegmentsV2PayloadDecoder;
    }
}
