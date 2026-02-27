package c0;

import D.A;
import D.AbstractC0184q;
import D.B;
import D.C0176i;
import D.C0178k;
import D.C0187u;
import D.CallableC0168a;
import D.H;
import D.S;
import D.Z;
import D.b0;
import D.r;
import We.s;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import bg.AbstractC0983W;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver;
import com.dynatrace.android.agent.Global;
import d0.C1325a;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import e0.C1416a;
import e2.C1421c;
import j0.C1652a;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.AbstractC2217b;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f9200b;
    public final H c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f9201d;
    public final A e;
    public final Ci.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f9202g;
    public final com.google.firebase.messaging.r h;
    public final i i;
    public final C1652a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f9203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ei.a f9204l;
    public final C1421c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S f9205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f9209r;

    public j(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, H h, B b8, A a8, Ci.b bVar, r rVar, com.google.firebase.messaging.r rVar2, i iVar, C1652a c1652a, k kVar, Ei.a aVar, C1421c c1421c) {
        S logger = cleverTapInstanceConfig.c();
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(logger, "logger");
        this.f9199a = context;
        this.f9200b = cleverTapInstanceConfig;
        this.c = h;
        this.f9201d = b8;
        this.e = a8;
        this.f = bVar;
        this.f9202g = rVar;
        this.h = rVar2;
        this.i = iVar;
        this.j = c1652a;
        this.f9203k = kVar;
        this.f9204l = aVar;
        this.m = c1421c;
        this.f9205n = logger;
        this.f9209r = new ArrayList();
    }

    public final boolean a(C1416a c1416a) {
        String strB = c1416a.b("X-WZRK-RD");
        if (!AbstractC0184q.e(strB)) {
            return false;
        }
        k kVar = this.f9203k;
        if (kotlin.jvm.internal.j.b(strB, b0.h(kVar.f9210a, kVar.f9211b, "comms_dmn", null))) {
            return false;
        }
        l(strB);
        String str = this.f9200b.f9439a;
        String strJ = s.j("The domain has changed to ", strB, ". The request will be retried shortly.");
        this.f9205n.getClass();
        S.g(str, strJ);
        return true;
    }

    public final void b(Context context, int i, String str, boolean z4) {
        B1.a aVarP;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        S s9;
        kotlin.jvm.internal.j.g(context, "context");
        AbstractC1331a.r(i, "eventGroup");
        S sC = this.f9200b.c();
        String str2 = this.f9200b.f9439a;
        sC.getClass();
        S.s(str2, "Starting queue flush to CleverTap servers");
        boolean z5 = true;
        int i4 = 0;
        while (true) {
            if (!z5) {
                break;
            }
            Ci.b bVar = this.f;
            bVar.getClass();
            if (H.c.f2061a[AbstractC2217b.c(i)] == 1) {
                S sC2 = ((CleverTapInstanceConfig) bVar.f785b).c();
                String str3 = ((CleverTapInstanceConfig) bVar.f785b).f9439a;
                sC2.getClass();
                S.s(str3, "Returning Queued Notification Viewed events");
                synchronized (((C0178k) bVar.c).f925a) {
                    aVarP = bVar.D(context).g(H.e.e, 50);
                }
            } else {
                S sC3 = ((CleverTapInstanceConfig) bVar.f785b).c();
                String str4 = ((CleverTapInstanceConfig) bVar.f785b).f9439a;
                sC3.getClass();
                S.s(str4, "Returning combined queued events");
                aVarP = bVar.p(context);
            }
            B1.a aVar = aVarP;
            if (((JSONArray) aVar.c).length() <= 0) {
                S sC4 = this.f9200b.c();
                String str5 = this.f9200b.f9439a;
                sC4.getClass();
                S.s(str5, "No more events in queue");
                break;
            }
            JSONArray jSONArray = (JSONArray) aVar.c;
            int length = jSONArray.length();
            S sC5 = this.f9200b.c();
            String str6 = this.f9200b.f9439a;
            StringBuilder sbT = s.t(length, "Processing batch of ", " events (");
            sbT.append(((ArrayList) aVar.f337d).size());
            sbT.append(" from events, ");
            sbT.append(((ArrayList) aVar.e).size());
            sbT.append(" from profile)");
            String string = sbT.toString();
            sC5.getClass();
            S.s(str6, string);
            if (k(context, i, jSONArray, str, z4)) {
                C1053a c1053a = ((r) this.e.h).f939l;
                if (c1053a != null) {
                    c1053a.a(jSONArray, true);
                }
                i4 += length;
                if (i == 2) {
                    this.f.l(context, (ArrayList) aVar.f337d);
                    JSONArray jSONArray2 = (JSONArray) aVar.c;
                    int length2 = jSONArray2.length();
                    int i6 = 0;
                    while (true) {
                        cleverTapInstanceConfig = this.f9200b;
                        s9 = this.f9205n;
                        if (i6 >= length2) {
                            break;
                        }
                        try {
                            JSONObject jSONObjectOptJSONObject = jSONArray2.getJSONObject(i6).optJSONObject("evtData");
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("wzrk_pid");
                                String str7 = jSONObjectOptJSONObject.optString("wzrk_acct_id") + Global.UNDERSCORE + strOptString;
                                kotlin.jvm.internal.j.f(str7, "buildPushNotificationRenderedListenerKey(...)");
                                i(str7);
                            }
                        } catch (JSONException unused) {
                            String str8 = cleverTapInstanceConfig.f9439a;
                            s9.getClass();
                            S.s(str8, "Encountered an exception while parsing the push notification viewed event queue");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        i6++;
                    }
                    String str9 = cleverTapInstanceConfig.f9439a;
                    s9.getClass();
                    S.s(str9, "push notification viewed event sent successfully");
                } else {
                    this.f.m(context, (ArrayList) aVar.f337d, (ArrayList) aVar.e);
                }
                z5 = aVar.f336b;
            } else {
                S sC6 = this.f9200b.c();
                String str10 = this.f9200b.f9439a;
                sC6.getClass();
                S.s(str10, "Failed to send batch - will retry later");
                Z z8 = (Z) this.e.f797n;
                if (z8 != null) {
                    z8.b();
                }
                C1053a c1053a2 = ((r) this.e.h).f939l;
                if (c1053a2 != null) {
                    c1053a2.a(jSONArray, false);
                }
            }
        }
        S sC7 = this.f9200b.c();
        sC7.getClass();
        S.s(this.f9200b.f9439a, "Queue flush completed. Total events sent: " + i4);
    }

    public final boolean c(C1416a c1416a) {
        int i = c1416a.f16544a;
        boolean z4 = i == 200;
        S s9 = this.f9205n;
        if (!z4) {
            s9.j("Received error response code: " + i);
            return false;
        }
        if (a(c1416a) || o(c1416a)) {
            return false;
        }
        j(c1416a);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f9200b;
        String str = cleverTapInstanceConfig.f9439a;
        s9.getClass();
        S.g(str, "Push Impressions sent successfully");
        com.google.firebase.messaging.r rVar = this.h;
        int i4 = rVar.q().m;
        k kVar = this.f9203k;
        b0.k(kVar.f9210a, i4, b0.o(kVar.f9211b.f9439a, "comms_last_ts"));
        int i6 = rVar.q().m;
        CleverTapInstanceConfig cleverTapInstanceConfig2 = kVar.f9211b;
        Context context = kVar.f9210a;
        if (b0.c(context, cleverTapInstanceConfig2, "comms_first_ts") <= 0) {
            b0.k(context, i6, b0.o(kVar.f9211b.f9439a, "comms_first_ts"));
        }
        String str2 = cleverTapInstanceConfig.f9439a;
        StringBuilder sb2 = new StringBuilder("Processing response : ");
        BufferedReader bufferedReader = c1416a.f16546d;
        sb2.append(AbstractC0184q.h(bufferedReader != null ? AbstractC0983W.x(bufferedReader) : null));
        S.s(str2, sb2.toString());
        return true;
    }

    public final boolean d(C1416a c1416a, boolean z4, Ld.b bVar, boolean z5) {
        int i = c1416a.f16544a;
        boolean z8 = i == 200;
        S s9 = this.f9205n;
        if (!z8) {
            s9.j("Received error response code: " + i);
            B b8 = this.f9201d;
            if (i == 402) {
                S.q("Encryption in transit feature on not enabled for your account, please contact Clevertap support.");
                b8.f813u = true;
                return false;
            }
            if (i == 419) {
                S.q("There is decryption failure on backend, disabling encrypted requests.");
                b8.f813u = true;
                return false;
            }
        } else if (!a(c1416a) && !o(c1416a)) {
            j(c1416a);
            bVar.invoke();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f9200b;
            String str = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.g(str, "Queue sent successfully");
            com.google.firebase.messaging.r rVar = this.h;
            int i4 = rVar.q().m;
            k kVar = this.f9203k;
            b0.k(kVar.f9210a, i4, b0.o(kVar.f9211b.f9439a, "comms_last_ts"));
            int i6 = rVar.q().m;
            CleverTapInstanceConfig cleverTapInstanceConfig2 = kVar.f9211b;
            Context context = kVar.f9210a;
            if (b0.c(context, cleverTapInstanceConfig2, "comms_first_ts") <= 0) {
                b0.k(context, i6, b0.o(kVar.f9211b.f9439a, "comms_first_ts"));
            }
            BufferedReader bufferedReader = c1416a.f16546d;
            String strX = bufferedReader != null ? AbstractC0983W.x(bufferedReader) : null;
            JSONObject jSONObjectH = AbstractC0184q.h(strX);
            S.s(cleverTapInstanceConfig.f9439a, "Processing response : " + jSONObjectH);
            if (strX != null && !C2576A.H(strX) && jSONObjectH != null) {
                if (Boolean.parseBoolean(c1416a.b("X-CleverTap-Encryption-Enabled"))) {
                    i iVar = this.i;
                    iVar.getClass();
                    S1.s dVar = d0.c.f16241b;
                    try {
                        JSONObject jSONObject = new JSONObject(strX);
                        String string = jSONObject.getString("itp");
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = jSONObject.getString("itv");
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        byte[] bArrDecode = Base64.decode(string, 2);
                        byte[] bArrDecode2 = Base64.decode(string2, 2);
                        kotlin.jvm.internal.j.d(bArrDecode);
                        F.b bVarC = F.c.c(2, bArrDecode, bArrDecode2, iVar.a());
                        if (bVarC != null) {
                            byte[] bArr = bVarC.f1493b;
                            Charset charset = C2581c.f21468b;
                            dVar = new d0.d(new String(bArr, charset), new String(bVarC.f1492a, charset));
                        }
                    } catch (Exception e) {
                        S.o("Error decrypting response", e);
                    }
                    if (dVar instanceof d0.c) {
                        S.s(cleverTapInstanceConfig.f9439a, "Failed to decrypt response");
                        return false;
                    }
                    if (!(dVar instanceof d0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strX = ((d0.d) dVar).f16242b;
                    jSONObjectH = AbstractC0184q.h(strX);
                    S.q("Decrypted response = ".concat(strX));
                }
                this.m.i(z4, jSONObjectH, strX, z5);
            }
            return true;
        }
        return false;
    }

    public final boolean e(C1416a c1416a) {
        int i = c1416a.f16544a;
        boolean z4 = i == 200;
        BufferedReader bufferedReader = c1416a.f16546d;
        S s9 = this.f9205n;
        if (z4) {
            String strX = bufferedReader != null ? AbstractC0983W.x(bufferedReader) : null;
            JSONObject jSONObjectH = AbstractC0184q.h(strX);
            s9.getClass();
            S.s(this.f9200b.f9439a, "Processing variables response : " + jSONObjectH);
            this.j.a(jSONObjectH, strX, this.f9199a);
            return true;
        }
        if (i == 400) {
            JSONObject jSONObjectH2 = AbstractC0184q.h(bufferedReader != null ? AbstractC0983W.x(bufferedReader) : null);
            if (jSONObjectH2 == null || TextUtils.isEmpty(jSONObjectH2.optString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR))) {
                s9.k("Variables", "Error while syncing.");
            } else {
                s9.k("Variables", "Error while syncing: " + jSONObjectH2.optString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR));
            }
        } else if (i != 401) {
            s9.k("Variables", "Response code " + i + " while syncing.");
        } else {
            s9.k("Variables", "Unauthorized access from a non-test profile. Please mark this profile as a test profile from the CleverTap dashboard.");
        }
        return false;
    }

    public final void f(int i, Runnable runnable) {
        AbstractC1331a.r(i, "eventGroup");
        this.f9206o = 0;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f9200b;
        S s9 = this.f9205n;
        try {
            C1416a c1416aD = this.h.q().d(i == 2);
            int i4 = c1416aD.f16544a;
            try {
                if (i4 == 200) {
                    String str = cleverTapInstanceConfig.f9439a;
                    s9.getClass();
                    S.s(str, "Received success from handshake :)");
                    if (o(c1416aD)) {
                        c1416aD.close();
                        return;
                    } else {
                        j(c1416aD);
                        S.s(cleverTapInstanceConfig.f9439a, "We are not muted");
                        runnable.run();
                    }
                } else {
                    s9.getClass();
                    S.s(cleverTapInstanceConfig.f9439a, "Invalid HTTP status code received for handshake - " + i4);
                }
                Unit unit = Unit.f18162a;
                c1416aD.close();
            } finally {
            }
        } catch (Exception e) {
            String str2 = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.t(str2, "Failed to perform handshake!", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "eventGroup"
            d4.AbstractC1331a.r(r5, r0)
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != r0) goto Lc
            r5 = r2
            goto Ld
        Lc:
            r5 = r1
        Ld:
            com.google.firebase.messaging.r r0 = r4.h
            d0.b r0 = r0.q()
            java.lang.String r3 = r0.f16237d
            boolean r3 = D.AbstractC0184q.e(r3)
            if (r3 == 0) goto L1c
            goto L3a
        L1c:
            if (r5 == 0) goto L21
            java.lang.String r3 = r0.f
            goto L23
        L21:
            java.lang.String r3 = r0.e
        L23:
            boolean r3 = D.AbstractC0184q.e(r3)
            if (r3 == 0) goto L2a
            goto L3a
        L2a:
            if (r5 == 0) goto L2f
            java.lang.String r5 = r0.c
            goto L31
        L2f:
            java.lang.String r5 = r0.f16236b
        L31:
            if (r5 == 0) goto L3c
            boolean r5 = zj.C2576A.H(r5)
            if (r5 == 0) goto L3a
            goto L3c
        L3a:
            r5 = r1
            goto L3d
        L3c:
            r5 = r2
        L3d:
            int r0 = r4.f9206o
            r3 = 5
            if (r0 <= r3) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r1
        L45:
            if (r0 == 0) goto L4b
            r3 = 0
            r4.l(r3)
        L4b:
            if (r5 != 0) goto L51
            if (r0 == 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.j.g(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    public final boolean h(int i, C1325a c1325a, Ld.b bVar, boolean z4) throws JSONException {
        C1416a c1416aE;
        S1.s dVar;
        boolean z5;
        boolean zD;
        int iC = AbstractC2217b.c(i);
        int i4 = 0;
        com.google.firebase.messaging.r rVar = this.h;
        if (iC == 0) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f9200b;
            cleverTapInstanceConfig.getClass();
            try {
            } catch (NumberFormatException unused) {
                S.l("Invalid value passed in manifest for encryption in transit");
            }
            if (Integer.parseInt(cleverTapInstanceConfig.f9455x) <= 0 || this.f9201d.f813u) {
                c1416aE = rVar.q().e(c1325a.toString(), false);
            } else {
                String response = c1325a.toString();
                i iVar = this.i;
                iVar.getClass();
                kotlin.jvm.internal.j.g(response, "response");
                byte[] bytes = response.getBytes(C2581c.f21468b);
                kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
                F.b bVarC = F.c.c(1, bytes, null, iVar.a());
                if (bVarC != null) {
                    String strEncodeToString = Base64.encodeToString(bVarC.f1493b, 2);
                    kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(...)");
                    String strEncodeToString2 = Base64.encodeToString(bVarC.f1492a, 2);
                    kotlin.jvm.internal.j.f(strEncodeToString2, "encodeToString(...)");
                    dVar = new d0.d(strEncodeToString, strEncodeToString2);
                } else {
                    dVar = d0.c.f16241b;
                }
                byte[] encoded = iVar.a().getEncoded();
                kotlin.jvm.internal.j.f(encoded, "getEncoded(...)");
                String strEncodeToString3 = Base64.encodeToString(encoded, 2);
                boolean z8 = dVar instanceof d0.d;
                S s9 = this.f9205n;
                if (z8) {
                    d0.d dVar2 = (d0.d) dVar;
                    kotlin.jvm.internal.j.d(strEncodeToString3);
                    String str = dVar2.f16242b;
                    String str2 = dVar2.c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("itp", str);
                    jSONObject.put("itk", strEncodeToString3);
                    jSONObject.put("itv", str2);
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    String strConcat = "Encrypted Request = ".concat(string);
                    s9.getClass();
                    S.q(strConcat);
                    c1416aE = rVar.q().e(string, true);
                } else {
                    s9.getClass();
                    S.q("Normal Request cause encryption failed = " + c1325a);
                    c1416aE = rVar.q().e(c1325a.toString(), false);
                }
            }
        } else if (iC == 1) {
            d0.b bVarQ = rVar.q();
            String body = c1325a.toString();
            bVarQ.getClass();
            kotlin.jvm.internal.j.g(body, "body");
            String strC = bVarQ.c(true);
            c1416aE = bVarQ.f16235a.c(d0.b.b(bVarQ, strC != null ? strC : "clevertap-prod.com", "a1", body, bVarQ.i, 8));
        } else {
            if (iC != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d0.b bVarQ2 = rVar.q();
            bVarQ2.getClass();
            String strC2 = bVarQ2.c(false);
            c1416aE = bVarQ2.f16235a.c(d0.b.b(bVarQ2, strC2 == null ? "clevertap-prod.com" : strC2, "defineVars", c1325a.toString(), null, 24));
        }
        C1416a c1416a = c1416aE;
        JSONArray jSONArray = c1325a.c;
        try {
            this.f9207p = 0;
            int iC2 = AbstractC2217b.c(i);
            if (iC2 == 0) {
                int length = jSONArray.length();
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                        if ("event".equals(jSONObject2.getString(SessionDescription.ATTR_TYPE))) {
                            String string2 = jSONObject2.getString("evtName");
                            if ("App Launched".equals(string2) || "wzrk_fetch".equals(string2)) {
                                z5 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (JSONException unused2) {
                    }
                }
                z5 = false;
                zD = d(c1416a, z5, bVar, z4);
                if (!zD) {
                    i4 = this.f9206o + 1;
                }
                this.f9206o = i4;
            } else if (iC2 == 1) {
                zD = c(c1416a);
                if (!zD) {
                    i4 = this.f9206o + 1;
                }
                this.f9206o = i4;
            } else {
                if (iC2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zD = e(c1416a);
            }
            c1416a.close();
            return zD;
        } finally {
        }
    }

    public final void i(String str) {
        a0.b bVar = (a0.b) C0187u.f.get(str);
        if (bVar != null) {
            String str2 = this.f9200b.f9439a;
            String strJ = s.j("notifying listener ", str, ", that push impression sent successfully");
            this.f9205n.getClass();
            S.s(str2, strJ);
            CTFirebaseMessagingReceiver cTFirebaseMessagingReceiver = (CTFirebaseMessagingReceiver) bVar;
            S.m("CTRM", "push impression sent successfully by core, i should inform OS to kill receiver. my callback key is " + cTFirebaseMessagingReceiver.f9574b);
            cTFirebaseMessagingReceiver.a("push impression sent successfully by core");
        }
    }

    public final void j(C1416a c1416a) {
        String strB = c1416a.b("X-WZRK-RD");
        S.l("Getting domain from header - " + strB);
        if (strB == null || C2576A.H(strB)) {
            return;
        }
        String strB2 = c1416a.b("X-WZRK-SPIKY-RD");
        S.l("Getting spiky domain from header - " + strB2);
        m(false);
        l(strB);
        S.l("Setting spiky domain from header as -" + strB2);
        if (strB2 == null) {
            n(strB);
        } else {
            n(strB2);
        }
    }

    public final boolean k(Context context, int i, JSONArray jSONArray, String str, boolean z4) {
        g gVar;
        kotlin.jvm.internal.j.g(context, "context");
        AbstractC1331a.r(i, "eventGroup");
        if (jSONArray != null && jSONArray.length() > 0) {
            String strF = this.c.f();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f9200b;
            S s9 = this.f9205n;
            if (strF == null) {
                String str2 = cleverTapInstanceConfig.f9439a;
                s9.getClass();
                S.g(str2, "CleverTap Id not finalized, unable to send queue");
                return false;
            }
            g.f9194a.getClass();
            int iC = AbstractC2217b.c(i);
            if (iC == 0) {
                gVar = g.c;
            } else if (iC == 1) {
                gVar = g.f9195b;
            } else {
                if (iC != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = g.f9196d;
            }
            JSONObject jSONObjectD = this.f9204l.d(str);
            if (jSONObjectD != null) {
                for (R.c cVar : this.f9209r) {
                    cVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    if (gVar == g.c) {
                        if (!cVar.f.isEmpty()) {
                            jSONObject.put("inapps_eval", x3.d.t(cVar.f));
                        }
                        if (!cVar.f5404g.isEmpty()) {
                            jSONObject.put("inapps_suppressed", x3.d.t(cVar.f5404g));
                        }
                    }
                    if (jSONObject.length() <= 0) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        AbstractC0184q.c(jSONObjectD, jSONObject);
                    }
                }
            }
            C1325a c1325a = new C1325a(jSONObjectD, jSONArray, 1);
            String str3 = cleverTapInstanceConfig.f9439a;
            String str4 = "Send queue contains " + jSONArray.length() + " items: " + c1325a;
            s9.getClass();
            S.g(str3, str4);
            try {
                return h(i, c1325a, new Ld.b(5, this, c1325a, gVar), z4);
            } catch (Exception e) {
                this.f9207p++;
                this.f9206o++;
                S.h(cleverTapInstanceConfig.f9439a, "An exception occurred while sending the queue, will retry: ", e);
                C0176i c0176i = this.f9202g.i;
                if (c0176i != null) {
                    c0176i.z(context);
                }
            }
        }
        return false;
    }

    public final void l(String str) {
        String str2 = this.f9200b.f9439a;
        String strH = AbstractC1414e.h("Setting domain to ", str);
        this.f9205n.getClass();
        S.s(str2, strH);
        k kVar = this.f9203k;
        b0.l(kVar.f9210a, b0.o(kVar.f9211b.f9439a, "comms_dmn"), str);
        this.h.q().f16236b = str;
        this.f9202g.getClass();
    }

    public final void m(boolean z4) {
        k kVar = this.f9203k;
        if (!z4) {
            kVar.a(false);
            return;
        }
        kVar.a(true);
        b0.l(kVar.f9210a, b0.o(kVar.f9211b.f9439a, "comms_dmn"), null);
        l0.b.a(this.f9200b).b().k("CommsManager#setMuted", new CallableC0168a(this, 12));
    }

    public final void n(String spikyDomainName) {
        String str = this.f9200b.f9439a;
        String strH = AbstractC1414e.h("Setting spiky domain to ", spikyDomainName);
        this.f9205n.getClass();
        S.s(str, strH);
        k kVar = this.f9203k;
        kVar.getClass();
        kotlin.jvm.internal.j.g(spikyDomainName, "spikyDomainName");
        b0.l(kVar.f9210a, b0.o(kVar.f9211b.f9439a, "comms_dmn_spiky"), spikyDomainName);
        this.h.q().c = spikyDomainName;
    }

    public final boolean o(C1416a c1416a) {
        String string;
        String strB = c1416a.b("X-WZRK-MUTE");
        if (strB != null && (string = C2576A.b0(strB).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (string.equals("true")) {
                    m(true);
                    return true;
                }
                m(false);
            }
        }
        return false;
    }
}
