package d0;

import D.AbstractC0184q;
import D.S;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.webkit.ProxyConfig;
import cj.M;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import e0.C1416a;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1.a f16235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16236b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16237d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16238g;
    public final String h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pair f16239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16240l;
    public int m;

    public b(B1.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String accountId, String accountToken, String sdkVersion, S s9, String logTag) {
        j.g(accountId, "accountId");
        j.g(accountToken, "accountToken");
        j.g(sdkVersion, "sdkVersion");
        j.g(logTag, "logTag");
        this.f16235a = aVar;
        this.f16236b = str;
        this.c = str2;
        this.f16237d = str3;
        this.e = str4;
        this.f = str5;
        this.f16238g = str6;
        this.h = logTag;
        this.i = M.h(new Pair(RtspHeaders.CONTENT_TYPE, "application/json; charset=utf-8"), new Pair("X-CleverTap-Account-ID", accountId), new Pair("X-CleverTap-Token", accountToken));
        this.j = M.h(new Pair("os", EventMetricsAggregator.OS_NAME), new Pair("t", sdkVersion), new Pair("z", accountId));
        this.f16239k = new Pair("X-CleverTap-Encryption-Enabled", "true");
        this.f16240l = "-spiky";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [d0.b] */
    public static /* synthetic */ U8.c b(b bVar, String str, String str2, String str3, Map map, int i) {
        Object obj = map;
        if ((i & 16) != 0) {
            obj = bVar.i;
        }
        return bVar.a(str, str2, str3, true, obj);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final U8.c a(String str, String str2, String str3, boolean z4, Map map) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(str).appendPath(str2);
        j.f(builderAppendPath, "appendPath(...)");
        for (Map.Entry entry : this.j.entrySet()) {
            builderAppendPath.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        if (z4) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
            this.m = iCurrentTimeMillis;
            j.f(builderAppendPath.appendQueryParameter("ts", String.valueOf(iCurrentTimeMillis)), "appendQueryParameter(...)");
        }
        Uri uriBuild = builderAppendPath.build();
        j.f(uriBuild, "build(...)");
        return new U8.c(uriBuild, map, str3);
    }

    public final String c(boolean z4) {
        String str = this.f16237d;
        if (!AbstractC0184q.e(str)) {
            String str2 = z4 ? this.f : this.e;
            return AbstractC0184q.e(str2) ? str2 : z4 ? this.c : this.f16236b;
        }
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(z4 ? this.f16240l : "");
        sbW.append(".clevertap-prod.com");
        String string = sbW.toString();
        j.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [d0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e0.C1416a d(boolean r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f16237d
            boolean r1 = D.AbstractC0184q.e(r0)
            java.lang.String r2 = r9.f16238g
            if (r1 == 0) goto L29
            java.lang.StringBuilder r0 = androidx.camera.core.impl.a.w(r0)
            if (r10 == 0) goto L13
            java.lang.String r10 = r9.f16240l
            goto L15
        L13:
            java.lang.String r10 = ""
        L15:
            r0.append(r10)
            java.lang.String r10 = ".clevertap-prod.com"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.j.f(r10, r0)
        L27:
            r4 = r10
            goto L54
        L29:
            if (r10 == 0) goto L2e
            java.lang.String r0 = r9.f
            goto L30
        L2e:
            java.lang.String r0 = r9.e
        L30:
            boolean r1 = D.AbstractC0184q.e(r0)
            if (r1 == 0) goto L38
            r4 = r0
            goto L54
        L38:
            boolean r0 = D.AbstractC0184q.e(r2)
            if (r0 == 0) goto L43
            kotlin.jvm.internal.j.d(r2)
            r4 = r2
            goto L54
        L43:
            if (r10 == 0) goto L48
            java.lang.String r10 = r9.c
            goto L4a
        L48:
            java.lang.String r10 = r9.f16236b
        L4a:
            boolean r0 = D.AbstractC0184q.e(r10)
            if (r0 == 0) goto L51
            goto L27
        L51:
            java.lang.String r10 = "clevertap-prod.com"
            goto L27
        L54:
            boolean r10 = D.AbstractC0184q.e(r2)
            java.lang.Object r0 = r9.i
            if (r10 == 0) goto L70
            boolean r10 = kotlin.jvm.internal.j.b(r4, r2)
            if (r10 == 0) goto L70
            kotlin.jvm.internal.j.d(r2)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r1 = "X-CleverTap-Handshake-Domain"
            r10.<init>(r1, r2)
            java.util.Map r0 = cj.M.j(r0, r10)
        L70:
            r8 = r0
            r7 = 0
            java.lang.String r5 = "hello"
            r6 = 0
            r3 = r9
            U8.c r10 = r3.a(r4, r5, r6, r7, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Performing handshake with "
            r0.<init>(r1)
            java.lang.Object r1 = r10.f5964b
            android.net.Uri r1 = (android.net.Uri) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.h
            D.S.s(r1, r0)
            B1.a r0 = r3.f16235a
            e0.a r10 = r0.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.d(boolean):e0.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    public final C1416a e(String body, boolean z4) {
        j.g(body, "body");
        String strC = c(false);
        if (strC == null) {
            strC = "clevertap-prod.com";
        }
        String str = strC;
        ?? r02 = this.i;
        ?? J = r02;
        if (z4) {
            J = M.j(r02, this.f16239k);
        }
        return this.f16235a.c(b(this, str, "a1", body, J, 8));
    }
}
