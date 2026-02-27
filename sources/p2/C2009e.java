package p2;

import D.S;
import Kh.I;
import com.google.gson.JsonSyntaxException;
import io.split.android.client.dtos.Split;
import io.split.android.client.dtos.Status;
import io.split.android.client.service.http.HttpResponseParserException;
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import java.util.ArrayList;
import mi.InterfaceC1866a;
import mi.InterfaceC1867b;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import q2.InterfaceC2160a;
import ri.C2209a;
import ui.InterfaceC2314a;

/* JADX INFO: renamed from: p2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2009e implements InterfaceC2008d, InterfaceC2160a, InterfaceC1866a, InterfaceC2314a, InterfaceC1867b {
    @Override // mi.InterfaceC1866a
    public String a(Object obj) {
        return io.split.android.client.utils.b.f17635a.k((C2209a) obj);
    }

    @Override // p2.InterfaceC2008d
    public C2007c b(I i, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        S s9 = jSONObject.has("session") ? new S(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new S(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new C2007c(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (((long) iOptInt) * 1000) + System.currentTimeMillis(), s9, new C2006b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // q2.InterfaceC2160a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] c(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C2009e.c(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // mi.InterfaceC1867b
    public Object d(String str) throws HttpResponseParserException {
        try {
            return (SseAuthenticationResponse) io.split.android.client.utils.b.f17635a.e(str, SseAuthenticationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new HttpResponseParserException("Syntax error parsing my segments http response: " + e.getLocalizedMessage());
        } catch (Exception e7) {
            throw new HttpResponseParserException("Unknown error parsing my segments http response: " + e7.getLocalizedMessage());
        }
    }

    @Override // ui.InterfaceC2314a
    public void e(ArrayList arrayList, ArrayList arrayList2, Split split) {
        if (split.status == Status.ACTIVE) {
            arrayList.add(split);
        } else {
            arrayList2.add(split);
        }
    }
}
