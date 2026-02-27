package j0;

import D.A;
import D.S;
import D.r;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17653b;
    public final CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f17654d;
    public final S e;
    public final A f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ci.b f17655g;

    public j(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Ci.b bVar, r rVar, A a8) {
        this.f17654d = context;
        this.c = cleverTapInstanceConfig;
        this.e = cleverTapInstanceConfig.c();
        this.f17655g = bVar;
        this.f17653b = rVar;
        this.f = a8;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        Ci.b bVar = this.f17655g;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        boolean z4 = cleverTapInstanceConfig.h;
        S s9 = this.e;
        if (z4) {
            String str2 = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.s(str2, "CleverTap instance is configured to analytics only, not processing push amp response");
            return;
        }
        try {
            if (jSONObject.has("pushamp_notifs")) {
                String str3 = cleverTapInstanceConfig.f9439a;
                s9.getClass();
                S.s(str3, "Processing pushamp messages...");
                JSONObject jSONObject2 = jSONObject.getJSONObject("pushamp_notifs");
                JSONArray jSONArray = jSONObject2.getJSONArray("list");
                if (jSONArray.length() > 0) {
                    S.s(cleverTapInstanceConfig.f9439a, "Handling Push payload locally");
                    b(jSONArray);
                }
                if (jSONObject2.has("pf")) {
                    try {
                        ((g0.g) this.f.m).j(context, jSONObject2.getInt("pf"));
                    } catch (Throwable th2) {
                        S.q("Error handling ping frequency in response : " + th2.getMessage());
                    }
                }
                if (jSONObject2.has("ack")) {
                    boolean z5 = jSONObject2.getBoolean("ack");
                    S.q("Received ACK -" + z5);
                    if (z5) {
                        JSONArray jSONArrayD = n0.b.d(bVar.D(context).i());
                        int length = jSONArrayD.length();
                        String[] strArr = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr[i] = jSONArrayD.getString(i);
                        }
                        S.q("Updating RTL values...");
                        bVar.D(context).p(strArr);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: JSONException -> 0x00b0, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00b0, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x001f, B:8:0x0026, B:9:0x002a, B:11:0x0030, B:12:0x0040, B:15:0x0049, B:16:0x0053, B:18:0x0061, B:20:0x0064, B:24:0x008e, B:25:0x008f, B:17:0x0054), top: B:31:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.json.JSONArray r12) {
        /*
            r11 = this;
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r11.c
            android.content.Context r1 = r11.f17654d
            D.S r2 = r11.e
            java.lang.String r3 = "wzrk_ttl"
            r4 = 0
        La:
            int r5 = r12.length()     // Catch: org.json.JSONException -> Lb0
            if (r4 >= r5) goto Lba
            android.os.Bundle r5 = new android.os.Bundle     // Catch: org.json.JSONException -> Lb0
            r5.<init>()     // Catch: org.json.JSONException -> Lb0
            org.json.JSONObject r6 = r12.getJSONObject(r4)     // Catch: org.json.JSONException -> Lb0
            boolean r7 = r6.has(r3)     // Catch: org.json.JSONException -> Lb0
            if (r7 == 0) goto L26
            long r7 = r6.getLong(r3)     // Catch: org.json.JSONException -> Lb0
            r5.putLong(r3, r7)     // Catch: org.json.JSONException -> Lb0
        L26:
            java.util.Iterator r7 = r6.keys()     // Catch: org.json.JSONException -> Lb0
        L2a:
            boolean r8 = r7.hasNext()     // Catch: org.json.JSONException -> Lb0
            if (r8 == 0) goto L40
            java.lang.Object r8 = r7.next()     // Catch: org.json.JSONException -> Lb0
            java.lang.String r8 = r8.toString()     // Catch: org.json.JSONException -> Lb0
            java.lang.String r9 = r6.getString(r8)     // Catch: org.json.JSONException -> Lb0
            r5.putString(r8, r9)     // Catch: org.json.JSONException -> Lb0
            goto L2a
        L40:
            boolean r7 = r5.isEmpty()     // Catch: org.json.JSONException -> Lb0
            java.lang.String r8 = "wzrk_pid"
            if (r7 != 0) goto L8f
            Ci.b r7 = r11.f17655g     // Catch: org.json.JSONException -> Lb0
            H.b r7 = r7.D(r1)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r9 = r6.getString(r8)     // Catch: org.json.JSONException -> Lb0
            monitor-enter(r7)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r10 = "id"
            kotlin.jvm.internal.j.g(r9, r10)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r10 = r7.h(r9)     // Catch: java.lang.Throwable -> L8c
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r7)     // Catch: org.json.JSONException -> Lb0
            if (r9 != 0) goto L8f
            java.lang.String r6 = "Creating Push Notification locally"
            r2.getClass()     // Catch: org.json.JSONException -> Lb0
            D.S.q(r6)     // Catch: org.json.JSONException -> Lb0
            D.r r6 = r11.f17653b     // Catch: org.json.JSONException -> Lb0
            r6.getClass()     // Catch: org.json.JSONException -> Lb0
            N4.d r6 = g0.e.f16774b     // Catch: org.json.JSONException -> Lb0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb0
            java.lang.String r8 = " [PushType:"
            r7.<init>(r8)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r8 = "fcm"
            r7.append(r8)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r8 = "] "
            r7.append(r8)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> Lb0
            r6.g(r1, r5, r7)     // Catch: org.json.JSONException -> Lb0
            goto Lac
        L8c:
            r12 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            throw r12     // Catch: org.json.JSONException -> Lb0
        L8f:
            java.lang.String r5 = r0.f9439a     // Catch: org.json.JSONException -> Lb0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb0
            r7.<init>()     // Catch: org.json.JSONException -> Lb0
            java.lang.String r9 = "Push Notification already shown, ignoring local notification :"
            r7.append(r9)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r6 = r6.getString(r8)     // Catch: org.json.JSONException -> Lb0
            r7.append(r6)     // Catch: org.json.JSONException -> Lb0
            java.lang.String r6 = r7.toString()     // Catch: org.json.JSONException -> Lb0
            r2.getClass()     // Catch: org.json.JSONException -> Lb0
            D.S.s(r5, r6)     // Catch: org.json.JSONException -> Lb0
        Lac:
            int r4 = r4 + 1
            goto La
        Lb0:
            java.lang.String r12 = r0.f9439a
            java.lang.String r0 = "Error parsing push notification JSON"
            r2.getClass()
            D.S.s(r12, r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j.b(org.json.JSONArray):void");
    }
}
