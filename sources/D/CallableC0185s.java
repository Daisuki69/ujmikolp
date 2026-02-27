package D;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import e2.C1421c;
import g0.InterfaceC1492a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: D.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0185s implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0187u f941b;

    public /* synthetic */ CallableC0185s(C0187u c0187u, int i) {
        this.f940a = i;
        this.f941b = c0187u;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        String string2;
        switch (this.f940a) {
            case 0:
                C0187u c0187u = this.f941b;
                HashMap map = new HashMap();
                map.put(numX49.tnTj78("Pebh"), Boolean.FALSE);
                map.put(numX49.tnTj78("PebM"), true);
                C c = c0187u.f949b;
                ((B) c.f815b).l(false);
                ((C0176i) c.f).x(map);
                B b8 = (B) c.f815b;
                b8.l(false);
                synchronized (b8.f806n) {
                    b8.h = true;
                    break;
                }
                H h = (H) c.c;
                String strF = h.f();
                String strConcat = strF == null ? null : numX49.tnTj78("PebN").concat(strF);
                Context context = h.e;
                CleverTapInstanceConfig cleverTapInstanceConfig = h.f844d;
                if (strConcat == null) {
                    S sC = cleverTapInstanceConfig.c();
                    String strTnTj78 = numX49.tnTj78("Peb6");
                    String str = cleverTapInstanceConfig.f9439a;
                    sC.getClass();
                    S.s(str, strTnTj78);
                } else {
                    b0.j(context, b0.o(cleverTapInstanceConfig.f9439a, strConcat), false);
                    S sC2 = cleverTapInstanceConfig.c();
                    String strTnTj782 = numX49.tnTj78("Peba");
                    String str2 = cleverTapInstanceConfig.f9439a;
                    sC2.getClass();
                    S.s(str2, strTnTj782);
                }
                String strF2 = h.f();
                String strConcat2 = strF2 == null ? null : numX49.tnTj78("PebX").concat(strF2);
                if (strConcat2 == null) {
                    S sC3 = cleverTapInstanceConfig.c();
                    String strTnTj783 = numX49.tnTj78("PebG");
                    String str3 = cleverTapInstanceConfig.f9439a;
                    sC3.getClass();
                    S.s(str3, strTnTj783);
                } else {
                    b0.j(context, b0.o(cleverTapInstanceConfig.f9439a, strConcat2), true);
                    S sC4 = cleverTapInstanceConfig.c();
                    String str4 = numX49.tnTj78("Peb3") + true;
                    String str5 = cleverTapInstanceConfig.f9439a;
                    sC4.getClass();
                    S.s(str5, str4);
                }
                return null;
            case 1:
                C0187u c0187u2 = this.f941b;
                C c10 = c0187u2.f949b;
                if (((CleverTapInstanceConfig) c10.f814a).f9447p) {
                    String strTnTj784 = numX49.tnTj78("PebU");
                    Context context2 = c0187u2.f948a;
                    Pattern pattern = d0.f906a;
                    try {
                        break;
                    } catch (Throwable unused) {
                    }
                    if (ContextCompat.checkSelfPermission(context2, strTnTj784) != 0) {
                        S.b(numX49.tnTj78("Pebe"));
                    }
                    S.i(numX49.tnTj78("Peb8") + ((H) c10.c).e().f833l);
                    if (!AbstractC0173f.f907a && !B.f798v) {
                        S.i(numX49.tnTj78("PebC"));
                        String str6 = context2.getApplicationInfo().className;
                        if (str6 == null || str6.isEmpty()) {
                            S.i(numX49.tnTj78("Pebw"));
                        } else if (str6.equals(numX49.tnTj78("Peb4"))) {
                            S.i(numX49.tnTj78("Pebo"));
                        } else {
                            S.i(numX49.tnTj78("PebK").concat(str6));
                        }
                    }
                    String strTnTj785 = numX49.tnTj78("Pebc");
                    try {
                        jk.b.B((Application) context2.getApplicationContext(), CTPushNotificationReceiver.class.getName());
                        jk.b.C((Application) context2.getApplicationContext(), CTNotificationIntentService.class.getName());
                        jk.b.A(InAppNotificationActivity.class, (Application) context2.getApplicationContext());
                        jk.b.A(CTInboxActivity.class, (Application) context2.getApplicationContext());
                        jk.b.B((Application) context2.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceReceiver");
                        jk.b.B((Application) context2.getApplicationContext(), "com.clevertap.android.geofence.CTLocationUpdateReceiver");
                        jk.b.B((Application) context2.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceBootReceiver");
                    } catch (Exception e) {
                        S.l(strTnTj785 + e.toString());
                    }
                    g0.g gVar = (g0.g) c10.f822p;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVar.f16778b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InterfaceC1492a) it.next()).getPushType());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((g0.h) it2.next()) == g0.e.f16773a) {
                            try {
                                jk.b.C((Application) context2.getApplicationContext(), "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService");
                            } catch (Error e7) {
                                S.l(numX49.tnTj78("Pebm") + e7.getMessage());
                            } catch (Exception e10) {
                                S.l(strTnTj785 + e10.toString());
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(T.b(context2).h)) {
                        S.i(numX49.tnTj78("PebD"));
                    }
                    break;
                }
                return null;
            case 2:
                String strTnTj786 = numX49.tnTj78("PebV");
                C c11 = this.f941b.f949b;
                Q q9 = ((a0) c11.f821o).f;
                CleverTapInstanceConfig cleverTapInstanceConfig2 = q9.f862b;
                String strTnTj787 = numX49.tnTj78("PebS");
                try {
                    if (cleverTapInstanceConfig2.f9450s) {
                        boolean z4 = cleverTapInstanceConfig2.f9447p;
                        String str7 = z4 ? "local_events" : strTnTj787 + cleverTapInstanceConfig2.f9439a;
                        Context context3 = q9.c;
                        if (z4) {
                            string = svM7M6.getString(b0.f(context3, str7), q9.i(strTnTj786), null);
                            if (string == null) {
                                string = svM7M6.getString(b0.f(context3, str7), strTnTj786, null);
                            }
                        } else {
                            string = svM7M6.getString(b0.f(context3, str7), q9.i(strTnTj786), null);
                        }
                        if (string != null) {
                            String[] strArrSplit = string.split("\\|");
                            Integer.parseInt(strArrSplit[0]);
                            Integer.parseInt(strArrSplit[1]);
                            Integer.parseInt(strArrSplit[2]);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    S sC5 = cleverTapInstanceConfig2.c();
                    String str8 = cleverTapInstanceConfig2.f9439a;
                    sC5.getClass();
                    S.t(str8, numX49.tnTj78("Pebj"), th2);
                }
                String strTnTj788 = numX49.tnTj78("Pebd");
                Q q10 = ((a0) c11.f821o).f;
                String strF3 = q10.f864g.f();
                String strC = q10.c(strTnTj786);
                C1421c c1421cR = q10.e.D(q10.c).r();
                String strTnTj789 = numX49.tnTj78("Pebi");
                String strTnTj7810 = numX49.tnTj78("PebE");
                kotlin.jvm.internal.j.g(strF3, strTnTj7810);
                String strTnTj7811 = numX49.tnTj78("PebF");
                kotlin.jvm.internal.j.g(strC, strTnTj7811);
                H.e eVar = H.e.f2065b;
                try {
                    Cursor cursorQuery = ((H.d) c1421cR.f16555b).getReadableDatabase().query("userEventLogs", null, numX49.tnTj78("PebH"), new String[]{strF3, strC}, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                kotlin.jvm.internal.j.f(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strTnTj788)), strTnTj789);
                                kotlin.jvm.internal.j.f(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strTnTj7811)), strTnTj789);
                                cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("firstTs"));
                                cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("lastTs"));
                                cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("count"));
                                kotlin.jvm.internal.j.f(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strTnTj7810)), strTnTj789);
                            }
                            cursorQuery.close();
                        } finally {
                        }
                    }
                    break;
                } catch (Exception e11) {
                    ((S) c1421cR.c).getClass();
                    S.r(numX49.tnTj78("PebO"), e11);
                }
                H h6 = (H) c11.c;
                String strTnTj7812 = numX49.tnTj78("PebQ");
                Context context4 = h6.e;
                CleverTapInstanceConfig cleverTapInstanceConfig3 = h6.f844d;
                boolean zA = b0.a(context4, cleverTapInstanceConfig3, strTnTj7812);
                S sC6 = cleverTapInstanceConfig3.c();
                String str9 = numX49.tnTj78("Pebt") + zA;
                String str10 = cleverTapInstanceConfig3.f9439a;
                sC6.getClass();
                S.s(str10, str9);
                h6.f845g = zA;
                h6.k();
                h6.l();
                return null;
            case 3:
                C0187u c0187u3 = this.f941b;
                C c12 = c0187u3.f949b;
                CleverTapInstanceConfig cleverTapInstanceConfig4 = (CleverTapInstanceConfig) c12.f814a;
                cleverTapInstanceConfig4.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("accountId", cleverTapInstanceConfig4.f9439a);
                    jSONObject.put("accountToken", cleverTapInstanceConfig4.c);
                    jSONObject.put("accountRegion", cleverTapInstanceConfig4.f9440b);
                    jSONObject.put("proxyDomain", cleverTapInstanceConfig4.f9441d);
                    jSONObject.put("spikyProxyDomain", cleverTapInstanceConfig4.e);
                    jSONObject.put("customHandshakeDomain", cleverTapInstanceConfig4.f);
                    jSONObject.put("fcmSenderId", cleverTapInstanceConfig4.f9446o);
                    jSONObject.put("analyticsOnly", cleverTapInstanceConfig4.h);
                    jSONObject.put("isDefaultInstance", cleverTapInstanceConfig4.f9447p);
                    jSONObject.put("useGoogleAdId", cleverTapInstanceConfig4.f9453v);
                    jSONObject.put("disableAppLaunchedEvent", cleverTapInstanceConfig4.m);
                    jSONObject.put("personalization", cleverTapInstanceConfig4.f9450s);
                    jSONObject.put("debugLevel", cleverTapInstanceConfig4.f9444l);
                    jSONObject.put("createdPostAppLaunch", cleverTapInstanceConfig4.f9443k);
                    jSONObject.put("sslPinning", cleverTapInstanceConfig4.f9452u);
                    jSONObject.put("backgroundSync", cleverTapInstanceConfig4.i);
                    jSONObject.put("getEnableCustomCleverTapId", cleverTapInstanceConfig4.f9445n);
                    jSONObject.put("packageName", cleverTapInstanceConfig4.f9449r);
                    jSONObject.put("beta", cleverTapInstanceConfig4.j);
                    jSONObject.put("encryptionLevel", cleverTapInstanceConfig4.f9454w);
                    jSONObject.put("encryptionInTransit", cleverTapInstanceConfig4.f9455x);
                    jSONObject.put("allowedPushTypes", cleverTapInstanceConfig4.d());
                    string2 = jSONObject.toString();
                    break;
                } catch (Throwable th3) {
                    S.o(numX49.tnTj78("Pebk"), th3.getCause());
                    string2 = null;
                }
                if (string2 == null) {
                    S.l(numX49.tnTj78("PebB"));
                } else {
                    b0.l(c0187u3.f948a, b0.n((CleverTapInstanceConfig) c12.f814a, numX49.tnTj78("Pebu")), string2);
                }
                return null;
            default:
                C c13 = this.f941b.f949b;
                if (((H) c13.c).f() != null) {
                    ((b0.f) c13.f820n).f();
                }
                return null;
        }
    }

    public /* synthetic */ CallableC0185s(C0187u c0187u, boolean z4) {
        this.f940a = 0;
        this.f941b = c0187u;
    }
}
