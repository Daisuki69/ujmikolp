package g0;

import D.C0176i;
import D.S;
import D.b0;
import Z.n;
import a.AbstractC0617a;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker;
import com.dynatrace.android.agent.Global;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC1493b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0176i f16779d;
    public final Ci.b e;
    public final CleverTapInstanceConfig f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f16780g;
    public final i0.a h;
    public final o0.c j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16777a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16778b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public C1494c i = new C1494c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f16781k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f16782l = new Object();

    public g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Ci.b bVar, o0.c cVar, C0176i c0176i, i0.a aVar) {
        this.f16780g = context;
        this.f = cleverTapInstanceConfig;
        this.e = bVar;
        this.j = cVar;
        this.f16779d = c0176i;
        this.h = aVar;
        l0.b.a(cleverTapInstanceConfig).c("PushProviders").k("createOrResetWorker", new f(this, 1));
    }

    public static void b(g gVar, boolean z4) {
        int i = Build.VERSION.SDK_INT;
        CleverTapInstanceConfig cleverTapInstanceConfig = gVar.f;
        if (i < 26) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, "Pushamp feature is not supported below Oreo");
            return;
        }
        Context context = gVar.f16780g;
        String strG = b0.g(context, "pfworkid", "");
        int iB = b0.b(context, PsExtractor.VIDEO_STREAM_MASK, "pf");
        if (strG.equals("") && iB <= 0) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC2.getClass();
            S.g(str2, "Pushamp - There is no running work and nothing to create");
            return;
        }
        if (iB <= 0) {
            S sC3 = cleverTapInstanceConfig.c();
            String str3 = cleverTapInstanceConfig.f9439a;
            sC3.getClass();
            S.g(str3, "Pushamp - Cancelling worker as pingFrequency <=0 ");
            gVar.h();
            return;
        }
        try {
            WorkManager workManager = WorkManager.getInstance(context);
            if (strG.equals("") || z4) {
                Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).setRequiresCharging(false).setRequiresBatteryNotLow(true).build();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) CTPushAmpWorker.class, iB, timeUnit, 5L, timeUnit).setConstraints(constraintsBuild).build();
                if (strG.equals("")) {
                    strG = cleverTapInstanceConfig.f9439a;
                }
                workManager.enqueueUniquePeriodicWork(strG, ExistingPeriodicWorkPolicy.UPDATE, periodicWorkRequestBuild);
                b0.l(context, "pfworkid", strG);
                S sC4 = cleverTapInstanceConfig.c();
                sC4.getClass();
                S.g(cleverTapInstanceConfig.f9439a, "Pushamp - Finished scheduling periodic work request - " + strG + " with repeatInterval- " + iB + " minutes");
            }
        } catch (Exception e) {
            S sC5 = cleverTapInstanceConfig.c();
            String str4 = cleverTapInstanceConfig.f9439a;
            sC5.getClass();
            S.g(str4, "Pushamp - Failed scheduling/cancelling periodic work request" + e);
        }
    }

    public final void a(Context context, Bundle bundle, int i) {
        boolean zEquals;
        if (bundle.get("wzrk_pn") == null) {
            return;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        if (cleverTapInstanceConfig.h) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, "Instance is set for Analytics only, cannot create notification");
            return;
        }
        try {
            if (bundle.getString("wzrk_pn_s", "").equalsIgnoreCase("true")) {
                this.f16779d.w(bundle);
                return;
            }
            String string = bundle.getString("extras_from");
            if (string == null || !string.equals("PTReceiver")) {
                S sC2 = cleverTapInstanceConfig.c();
                sC2.getClass();
                S.g(cleverTapInstanceConfig.f9439a, "Handling notification: " + bundle);
                String string2 = bundle.getString("wzrk_pid");
                Ci.b bVar = this.e;
                if (string2 != null) {
                    H.b bVarD = bVar.D(context);
                    String id = bundle.getString("wzrk_pid");
                    synchronized (bVarD) {
                        j.g(id, "id");
                        zEquals = id.equals(bVarD.h(id));
                    }
                    if (zEquals) {
                        S sC3 = cleverTapInstanceConfig.c();
                        String str2 = cleverTapInstanceConfig.f9439a;
                        sC3.getClass();
                        S.g(str2, "Push Notification already rendered, not showing again");
                        return;
                    }
                }
                C1494c c1494c = this.i;
                c1494c.getClass();
                String string3 = bundle.getString("nm");
                c1494c.f16769a = string3;
                if (string3 == null) {
                    string3 = "";
                }
                if (string3.isEmpty()) {
                    S sC4 = cleverTapInstanceConfig.c();
                    String str3 = cleverTapInstanceConfig.f9439a;
                    sC4.getClass();
                    S.s(str3, "Push notification message is empty, not rendering");
                    bVar.D(context).n();
                    String string4 = bundle.getString("pf", "");
                    if (TextUtils.isEmpty(string4)) {
                        return;
                    }
                    j(context, Integer.parseInt(string4));
                    return;
                }
            }
            C1494c c1494c2 = this.i;
            c1494c2.getClass();
            String string5 = bundle.getString("nt", "");
            if (string5.isEmpty()) {
                string5 = context.getApplicationInfo().name;
            }
            c1494c2.f16770b = string5;
            if (string5.isEmpty()) {
                String str4 = context.getApplicationInfo().name;
            }
            i(context, bundle, i);
        } catch (Throwable th2) {
            S sC5 = cleverTapInstanceConfig.c();
            String str5 = cleverTapInstanceConfig.f9439a;
            sC5.getClass();
            S.h(str5, "Couldn't render notification: ", th2);
        }
    }

    public final String c(h hVar) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        if (hVar != null) {
            String str = hVar.c;
            if (!TextUtils.isEmpty(str)) {
                String strH = b0.h(this.f16780g, cleverTapInstanceConfig, str, null);
                cleverTapInstanceConfig.e("PushProvider", hVar + "getting Cached Token - " + strH);
                return strH;
            }
        }
        if (hVar != null) {
            cleverTapInstanceConfig.e("PushProvider", hVar + " Unable to find cached Token for type ");
        }
        return null;
    }

    public final void d(String str) {
        h hVar = e.f16773a;
        f(str, true, hVar);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            l0.b.a(cleverTapInstanceConfig).a().k("PushProviders#cacheToken", new n(4, this, str));
        } catch (Throwable th2) {
            cleverTapInstanceConfig.f(hVar + "Unable to cache token " + str, th2);
        }
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return;
        }
        d(str);
    }

    public final void f(String str, boolean z4, h hVar) {
        if (hVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = c(hVar);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f16781k) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                String str2 = z4 ? "register" : "unregister";
                try {
                    jSONObject2.put("action", str2);
                    jSONObject2.put(TtmlNode.ATTR_ID, str);
                    jSONObject2.put(SessionDescription.ATTR_TYPE, hVar.f16785d);
                    jSONObject.put("data", jSONObject2);
                    S sC = this.f.c();
                    sC.getClass();
                    S.s(this.f.f9439a, hVar + str2 + " device token " + str);
                    C0176i c0176i = this.f16779d;
                    ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject, 5);
                } catch (Throwable th2) {
                    S sC2 = this.f.c();
                    sC2.getClass();
                    S.t(this.f.f9439a, hVar + str2 + " device token failed", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(Context context) {
        Date date;
        Date date2;
        Date date3;
        Exception exc;
        long j;
        Throwable th2;
        long j6;
        S.m(this.f.f9439a, "Pushamp - Running work request");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f16778b.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1492a) it.next()).getPushType());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (c((h) it2.next()) != null) {
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(11);
                int i4 = calendar.get(12);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
                try {
                    date = simpleDateFormat.parse(i + Global.COLON + i4);
                } catch (ParseException unused) {
                    date = new Date(0L);
                }
                try {
                    date2 = simpleDateFormat.parse("22:00");
                } catch (ParseException unused2) {
                    date2 = new Date(0L);
                }
                try {
                    date3 = simpleDateFormat.parse("06:00");
                } catch (ParseException unused3) {
                    date3 = new Date(0L);
                }
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date2);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(date);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTime(date3);
                if (date3.compareTo(date2) < 0) {
                    if (calendar3.compareTo(calendar4) < 0) {
                        calendar3.add(5, 1);
                    }
                    calendar4.add(5, 1);
                }
                if (calendar3.compareTo(calendar2) >= 0 && calendar3.compareTo(calendar4) < 0) {
                    S.m(this.f.f9439a, "Pushamp won't run in default DND hours");
                    return;
                }
                H.b bVarD = this.e.D(context);
                synchronized (bVarD) {
                    H.e eVar = H.e.f2065b;
                    try {
                        Cursor cursorQuery = bVarD.c.getReadableDatabase().query("uninstallTimestamp", null, null, null, null, null, "created_at DESC", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        if (cursorQuery != null) {
                            try {
                                j = cursorQuery.moveToFirst() ? cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(MPDbAdapter.KEY_CREATED_AT)) : 0L;
                            } catch (Throwable th3) {
                                th2 = th3;
                                j6 = 0;
                            }
                            try {
                                Unit unit = Unit.f18162a;
                                try {
                                    cursorQuery.close();
                                } catch (Exception e) {
                                    exc = e;
                                    bVarD.f2059b.getClass();
                                    S.r("Could not fetch records out of database uninstallTimestamp.", exc);
                                }
                            } catch (Throwable th4) {
                                j6 = j;
                                th2 = th4;
                                try {
                                    throw th2;
                                } catch (Throwable th5) {
                                    try {
                                        AbstractC0617a.p(cursorQuery, th2);
                                        throw th5;
                                    } catch (Exception e7) {
                                        exc = e7;
                                        j = j6;
                                        bVarD.f2059b.getClass();
                                        S.r("Could not fetch records out of database uninstallTimestamp.", exc);
                                        if (j != 0) {
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("bk", 1);
                                            C0176i c0176i = this.f16779d;
                                            ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject, 2);
                                            S.m(this.f.f9439a, "Pushamp - Successfully completed work request");
                                            return;
                                        } catch (JSONException unused4) {
                                            S.l("Pushamp - Unable to complete work request");
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            j = 0;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        j = 0;
                    }
                }
                if (j != 0 || j > System.currentTimeMillis() - 86400000) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("bk", 1);
                    C0176i c0176i2 = this.f16779d;
                    ((C0176i) c0176i2.e).y((Context) c0176i2.h, jSONObject2, 2);
                    S.m(this.f.f9439a, "Pushamp - Successfully completed work request");
                    return;
                }
                return;
            }
        }
        S.m(this.f.f9439a, "Pushamp - Token is not present, not running the work request");
    }

    public final void h() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        Context context = this.f16780g;
        String strG = b0.g(context, "pfworkid", "");
        if (strG.equals("")) {
            return;
        }
        try {
            WorkManager.getInstance(context).cancelUniqueWork(strG);
            b0.l(context, "pfworkid", "");
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, "Pushamp - Successfully cancelled work");
        } catch (Exception unused) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC2.getClass();
            S.g(str2, "Pushamp - Failure while cancelling work");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(1:14)(2:16|(1:18)(7:19|(1:21)|22|334|23|(1:28)(2:29|(5:39|(1:45)(1:44)|46|(4:48|313|49|52)|53))|(2:73|74)(3:59|(2:61|(3:349|63|(1:65)(1:67))(0))(1:68)|(2:70|71)(1:72))))|15|(0)|22|334|23|(1:25)(5:26|28|(1:56)|73|74)|29|(4:31|33|39|(9:41|43|45|46|(0)|53|(0)|73|74)(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        r0.printStackTrace();
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb A[Catch: Exception -> 0x00a8, TryCatch #13 {Exception -> 0x00a8, blocks: (B:23:0x0084, B:29:0x0092, B:31:0x009a, B:34:0x00a1, B:41:0x00ae, B:44:0x00b5, B:46:0x00c0, B:52:0x00d0, B:45:0x00bb, B:26:0x008b), top: B:334:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [g0.c] */
    /* JADX WARN: Type inference failed for: r2v32, types: [g0.c] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.core.app.NotificationCompat$Builder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.content.Context r28, android.os.Bundle r29, int r30) {
        /*
            Method dump skipped, instruction units count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.i(android.content.Context, android.os.Bundle, int):void");
    }

    public final void j(Context context, int i) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        cleverTapInstanceConfig.c().getClass();
        S.q("Ping frequency received - " + i);
        S sC = cleverTapInstanceConfig.c();
        String str = "Stored Ping Frequency - " + b0.b(context, PsExtractor.VIDEO_STREAM_MASK, "pf");
        sC.getClass();
        S.q(str);
        if (i != b0.e(context).getInt("pf", PsExtractor.VIDEO_STREAM_MASK)) {
            b0.k(context, i, "pf");
            if (!cleverTapInstanceConfig.i || cleverTapInstanceConfig.h) {
                return;
            }
            l0.b.a(cleverTapInstanceConfig).c("PushProviders").k("createOrResetWorker", new f(this, 0));
        }
    }
}
