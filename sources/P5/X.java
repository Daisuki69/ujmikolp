package P5;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bg.AbstractC0983W;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.U0;
import java.io.IOException;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class X implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5044a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f5045b;
    public final /* synthetic */ com.paymaya.data.preference.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5046d;

    public /* synthetic */ X(OkHttpClient okHttpClient, com.paymaya.data.preference.a aVar, U0 u0) {
        this.f5045b = okHttpClient;
        this.c = aVar;
        this.f5046d = u0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:7:0x003c, B:10:0x0046, B:19:0x005c, B:21:0x0060, B:15:0x004d, B:17:0x0055, B:18:0x0058), top: B:34:0x003c, outer: #0, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.Response a(okhttp3.Interceptor.Chain r10) {
        /*
            r9 = this;
            okhttp3.OkHttpClient r0 = r9.f5045b
            com.paymaya.data.preference.a r1 = r9.c
            java.lang.Object r2 = r9.f5046d
            com.paymaya.domain.store.U0 r2 = (com.paymaya.domain.store.U0) r2
            okhttp3.Request r3 = r10.request()
            monitor-enter(r0)
            java.lang.String r4 = "key_has_suspended_session"
            android.content.SharedPreferences r1 = r1.f11330b     // Catch: java.lang.Throwable -> L70
            r5 = 0
            boolean r1 = r1.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6a
            com.paymaya.data.api.SuspendApi r1 = r2.f11397b     // Catch: java.lang.Throwable -> L70
            Ah.a r1 = r1.resumeSession()     // Catch: java.lang.Throwable -> L70
            com.paymaya.domain.store.T0 r4 = new com.paymaya.domain.store.T0     // Catch: java.lang.Throwable -> L70
            r5 = 0
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L70
            Hh.g r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L70
            com.paymaya.domain.store.L r4 = new com.paymaya.domain.store.L     // Catch: java.lang.Throwable -> L70
            r5 = 4
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L70
            Hh.g r1 = r1.b(r4)     // Catch: java.lang.Throwable -> L70
            Gh.c r2 = new Gh.c     // Catch: java.lang.Throwable -> L70
            r4 = 1
            r5 = 0
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L70
            r1.d(r2)     // Catch: java.lang.Throwable -> L70
            long r5 = r2.getCount()     // Catch: java.lang.Throwable -> L4a
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L5c
            r2.await()     // Catch: java.lang.Throwable -> L4a java.lang.InterruptedException -> L4c
            goto L5c
        L4a:
            r1 = move-exception
            goto L64
        L4c:
            r1 = move-exception
            r2.f1987d = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r2.e     // Catch: java.lang.Throwable -> L4a
            io.reactivex.rxjava3.disposables.b r2 = (io.reactivex.rxjava3.disposables.b) r2     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L58
            r2.dispose()     // Catch: java.lang.Throwable -> L4a
        L58:
            E1.c.k(r1)     // Catch: java.lang.Throwable -> L4a
            goto L6a
        L5c:
            java.lang.Throwable r1 = r2.c     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L6a
            E1.c.k(r1)     // Catch: java.lang.Throwable -> L4a
            goto L6a
        L64:
            bg.AbstractC0983W.G(r1)     // Catch: java.lang.Throwable -> L70
            E1.c.k(r1)     // Catch: java.lang.Throwable -> L70
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            okhttp3.Response r10 = r10.proceed(r3)
            return r10
        L70:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.X.a(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Response responseProceed;
        switch (this.f5044a) {
            case 0:
                return a(chain);
            default:
                OkHttpClient okHttpClient = this.f5045b;
                C1261h c1261h = (C1261h) this.f5046d;
                com.paymaya.data.preference.a aVar = this.c;
                Request request = chain.request();
                Response responseProceed2 = chain.proceed(request);
                if (responseProceed2.code() != 401) {
                    return responseProceed2;
                }
                int i = Integer.parseInt(responseProceed2.header("error-code", "0"));
                String strString = responseProceed2.peekBody(5000L).string();
                try {
                    i = new JSONObject(strString).getJSONObject(MediaRouteProviderProtocol.SERVICE_DATA_ERROR).getInt("code");
                    break;
                } catch (JSONException unused) {
                    yk.a.e();
                }
                if (i == -26 || i == -25 || i == -24) {
                    synchronized (okHttpClient) {
                        Lh.d dVarA = c1261h.a(aVar.d(), aVar.z());
                        Gh.c cVar = new Gh.c(1, 0);
                        dVarA.f(cVar);
                        try {
                            if (cVar.getCount() != 0) {
                                try {
                                    cVar.await();
                                } catch (InterruptedException e) {
                                    cVar.f1987d = true;
                                    io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) cVar.e;
                                    if (bVar != null) {
                                        bVar.dispose();
                                    }
                                    E1.c.k(e);
                                }
                            }
                            Throwable th2 = cVar.c;
                            if (th2 != null) {
                                E1.c.k(th2);
                            }
                        } catch (Throwable th3) {
                            AbstractC0983W.G(th3);
                            E1.c.k(th3);
                        }
                        Request.Builder builderNewBuilder = request.newBuilder();
                        builderNewBuilder.header(RtspHeaders.AUTHORIZATION, "Bearer ".concat(aVar.b()));
                        responseProceed = chain.proceed(builderNewBuilder.build());
                        break;
                    }
                } else {
                    responseProceed = responseProceed2.newBuilder().body(ResponseBody.create(responseProceed2.body().contentType(), strString)).build();
                }
                return responseProceed;
        }
    }

    public /* synthetic */ X(OkHttpClient okHttpClient, C1261h c1261h, com.paymaya.data.preference.a aVar) {
        this.f5045b = okHttpClient;
        this.f5046d = c1261h;
        this.c = aVar;
    }
}
