package P5;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.paymaya.data.preference.a f5043b;

    public /* synthetic */ W(com.paymaya.data.preference.a aVar, int i) {
        this.f5042a = i;
        this.f5043b = aVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strA;
        com.paymaya.data.preference.a aVar = this.f5043b;
        switch (this.f5042a) {
            case 0:
                Request request = chain.request();
                return chain.proceed(request.newBuilder().headers(request.headers().newBuilder().add("X-Session-Authorization", aVar.s()).build()).method(request.method(), request.body()).build());
            case 1:
                Request request2 = chain.request();
                return chain.proceed(request2.newBuilder().headers(request2.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).add(MPDbAdapter.KEY_TOKEN, aVar.s()).add("x-idempotency-key", UUID.randomUUID().toString()).build()).method(request2.method(), request2.body()).build());
            case 2:
                Request request3 = chain.request();
                return chain.proceed(request3.newBuilder().headers(request3.headers().newBuilder().add("x-token", aVar.s()).add("x-request-id", UUID.randomUUID().toString()).add("x-trace-id", aVar.v()).build()).method(request3.method(), request3.body()).build());
            case 3:
                Request request4 = chain.request();
                return chain.proceed(request4.newBuilder().headers(request4.headers().newBuilder().add("x-presubmission-id", aVar.m()).build()).method(request4.method(), request4.body()).build());
            case 4:
                Request request5 = chain.request();
                return chain.proceed(request5.newBuilder().headers(request5.headers().newBuilder().add("x-token", aVar.s()).add("x-request-id", UUID.randomUUID().toString()).add("x-trace-id", aVar.v()).build()).method(request5.method(), request5.body()).build());
            case 5:
                String str = new String(Base64.encode(aVar.B().getBytes(StandardCharsets.UTF_8), 3));
                Request request6 = chain.request();
                return chain.proceed(request6.newBuilder().headers(request6.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).add(MPDbAdapter.KEY_TOKEN, aVar.s()).add("x-encoded-user-agent", str).add("x-traceid", UUID.randomUUID().toString().toUpperCase()).build()).method(request6.method(), request6.body()).build());
            case 6:
                Request request7 = chain.request();
                return chain.proceed(request7.newBuilder().headers(request7.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).add("Request-Reference-No", UUID.randomUUID().toString()).build()).method(request7.method(), request7.body()).build());
            case 7:
                String str2 = new String(Base64.encode(aVar.B().getBytes(StandardCharsets.UTF_8), 3));
                Request request8 = chain.request();
                return chain.proceed(request8.newBuilder().headers(request8.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).add(MPDbAdapter.KEY_TOKEN, aVar.s()).add("x-encoded-user-agent", str2).add("x-traceid", UUID.randomUUID().toString().toUpperCase()).build()).method(request8.method(), request8.body()).build());
            case 8:
                String strB = aVar.B();
                String str3 = new String(Base64.encode(strB.getBytes(StandardCharsets.UTF_8), 3));
                Request request9 = chain.request();
                Headers headers = request9.headers();
                Headers.Builder builderAdd = headers.newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).addUnsafeNonAscii(RtspHeaders.USER_AGENT, strB).add("x-encoded-user-agent", str3);
                if (TextUtils.isEmpty(headers.get(MPDbAdapter.KEY_TOKEN))) {
                    builderAdd.add(MPDbAdapter.KEY_TOKEN, aVar.s());
                }
                if (headers.get("Request-Reference-No") == null) {
                    builderAdd.add("Request-Reference-No", UUID.randomUUID().toString());
                }
                Request requestBuild = request9.newBuilder().headers(builderAdd.build()).method(request9.method(), request9.body()).build();
                aVar.b();
                aVar.s();
                yk.a.a();
                return chain.proceed(requestBuild);
            case 9:
                String str4 = new String(Base64.encode(aVar.B().getBytes(StandardCharsets.UTF_8), 3));
                Request request10 = chain.request();
                return chain.proceed(request10.newBuilder().headers(request10.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).add(MPDbAdapter.KEY_TOKEN, aVar.s()).add("x-encoded-user-agent", str4).add("x-traceid", UUID.randomUUID().toString().toUpperCase()).build()).method(request10.method(), request10.body()).build());
            case 10:
                Request request11 = chain.request();
                Request requestBuild2 = request11.newBuilder().headers(request11.headers().newBuilder().add("x-token", aVar.s()).add("x-request-id", UUID.randomUUID().toString()).add("x-trace-id", aVar.n()).build()).method(request11.method(), request11.body()).build();
                aVar.s();
                aVar.n();
                yk.a.a();
                return chain.proceed(requestBuild2);
            case 11:
                String strB2 = aVar.B();
                String str5 = new String(Base64.encode(strB2.getBytes("UTF-8"), 3));
                Request request12 = chain.request();
                Headers headers2 = request12.headers();
                Headers.Builder builderAdd2 = headers2.newBuilder().add("Session-Token", aVar.s()).add(RtspHeaders.AUTHORIZATION, aVar.b()).add("Platform", "mobile").addUnsafeNonAscii(RtspHeaders.USER_AGENT, strB2).add("x-encoded-user-agent", str5);
                if (headers2.get("Request-Reference-No") == null) {
                    builderAdd2.add("Request-Reference-No", UUID.randomUUID().toString());
                }
                return chain.proceed(request12.newBuilder().headers(builderAdd2.build()).method(request12.method(), request12.body()).build());
            case 12:
                char[] cArr = F5.b.f1550a;
                String strValueOf = String.valueOf(Instant.now().getMillis());
                try {
                    strA = F5.b.a(aVar.i(), "android" + strValueOf + aVar.B(), aVar.g());
                    break;
                } catch (Exception unused) {
                    yk.a.e();
                    strA = null;
                }
                String strB3 = aVar.B();
                String str6 = new String(Base64.encode(strB3.getBytes("UTF-8"), 3));
                Request request13 = chain.request();
                return chain.proceed(request13.newBuilder().headers(request13.headers().newBuilder().addUnsafeNonAscii(RtspHeaders.USER_AGENT, strB3).add("x-encoded-user-agent", str6).add("x-request-timestamp", strValueOf).add("source", "android").add("x-request-token", strA).add("Request-Reference-No", UUID.randomUUID().toString()).build()).method(request13.method(), request13.body()).build());
            case 13:
                Request request14 = chain.request();
                return chain.proceed(request14.newBuilder().headers(request14.headers().newBuilder().add("x-token", aVar.s()).add("x-request-id", UUID.randomUUID().toString()).add("x-trace-id", aVar.v()).build()).method(request14.method(), request14.body()).build());
            default:
                Request request15 = chain.request();
                return chain.proceed(request15.newBuilder().headers(request15.headers().newBuilder().add("Request-Reference-No", UUID.randomUUID().toString()).add(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b())).build()).method(request15.method(), request15.body()).build());
        }
    }
}
