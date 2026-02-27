package Ih;

import D.S;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import d4.AbstractC1331a;
import io.split.android.client.network.HttpException;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.service.sseclient.EventStreamParser;
import io.split.android.client.service.sseclient.InvalidJwtTokenException;
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import io.split.android.client.service.sseclient.SseJwtToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o6.C1967a;
import p3.C2011b;
import wi.C2440a;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2338b;
    public final Object c;

    public /* synthetic */ y(Object obj, long j, int i) {
        this.f2337a = i;
        this.c = obj;
        this.f2338b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v9, types: [Ci.b] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        yi.g gVar;
        SseJwtToken sseJwtToken;
        String string;
        Object obj;
        ?? r17;
        ?? r22;
        io.split.android.client.network.i iVarD;
        ?? B10;
        SseJwtToken sseJwtToken2;
        boolean z4;
        BufferedReader bufferedReader;
        SseJwtToken sseJwtTokenA;
        switch (this.f2337a) {
            case 0:
                ((nk.c) this.c).request(this.f2338b);
                return;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                yi.e eVar = (yi.e) this.c;
                com.google.firebase.messaging.r rVar = eVar.c;
                rVar.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str = (String) rVar.f9803b;
                    if (str != null && !str.trim().isEmpty()) {
                        linkedHashMap.put(CmcdData.Factory.STREAMING_FORMAT_SS, str);
                    }
                    linkedHashMap.put("users", (Set) rVar.f9804d);
                    SseAuthenticationResponse sseAuthenticationResponse = (SseAuthenticationResponse) ((U8.c) rVar.c).k(linkedHashMap, null);
                    Ri.a.d("SSE Authentication done, now parsing token");
                    if (sseAuthenticationResponse.isClientError()) {
                        Ri.a.d("Error while authenticating to streaming. Check your SDK key is correct.");
                        gVar = new yi.g(false, false, false, 0L, null, null);
                    } else if (sseAuthenticationResponse.isStreamingEnabled()) {
                        try {
                            long jLongValue = sseAuthenticationResponse.getSseConnectionDelay() != null ? sseAuthenticationResponse.getSseConnectionDelay().longValue() : this.f2338b;
                            Ri.a.d("SSE token parsed successfully");
                            io.split.android.client.service.sseclient.b bVar = (io.split.android.client.service.sseclient.b) rVar.e;
                            String token = sseAuthenticationResponse.getToken();
                            bVar.getClass();
                            sseJwtTokenA = io.split.android.client.service.sseclient.b.a(token);
                            gVar = new yi.g(true, true, true, jLongValue, sseJwtTokenA, null);
                            sseJwtToken = sseJwtTokenA;
                        } catch (InvalidJwtTokenException unused) {
                            Ri.a.g("Error while parsing Jwt");
                            gVar = new yi.g(false, true, false, 0L, null, null);
                            sseJwtToken = sseJwtTokenA;
                        }
                    } else {
                        Ri.a.d("Streaming disabled for SDK key");
                        gVar = new yi.g(true, true, false, 0L, null, null);
                    }
                } catch (HttpFetcherException e) {
                    Ri.a.g("Error while authenticating to SSE server: " + ("Unexpected " + e.getLocalizedMessage()));
                    Integer num = e.f17609a;
                    if (num == null) {
                        gVar = new yi.g(false, true, false, 0L, null, null);
                    } else if (AbstractC1331a.f(AbstractC1331a.e(num))) {
                        sseJwtToken = null;
                        gVar = new yi.g(false, false, false, 0L, null, null);
                    } else {
                        gVar = new yi.g(false, true, false, 0L, null, num);
                    }
                } catch (Exception e7) {
                    Ri.a.g("Error while authenticating to SSE server: " + ("Unexpected " + e7.getLocalizedMessage()));
                    gVar = new yi.g(false, true, false, 0L, null, null);
                }
                Oi.n nVar = Oi.n.f;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                Qi.c cVar = eVar.e;
                cVar.c(nVar, jCurrentTimeMillis2);
                boolean z5 = gVar.f21301a;
                boolean z8 = true;
                z8 = true;
                z8 = true;
                z8 = true;
                z8 = true;
                AtomicBoolean atomicBoolean = eVar.i;
                C1967a c1967a = eVar.f21292b;
                if (z5 && !gVar.c) {
                    Ri.a.d("Streaming disabled");
                    c1967a.b(new S(2));
                    atomicBoolean.set(true);
                    return;
                }
                boolean z9 = gVar.f21302b;
                if (!z5 && !z9) {
                    Ri.a.d("Streaming no recoverable auth error.");
                    c1967a.b(new S(4));
                    atomicBoolean.set(true);
                    cVar.g();
                    Integer num2 = gVar.f;
                    if (num2 != null) {
                        cVar.u(nVar, num2);
                        return;
                    }
                    return;
                }
                if (!z5 && z9) {
                    eVar.f21292b.b(new S(3));
                    return;
                }
                SseJwtToken sseJwtToken3 = gVar.e;
                if (sseJwtToken3 == null || sseJwtToken3.getChannels() == null || sseJwtToken3.getRawJwt() == null) {
                    Ri.a.d("Streaming auth error. Retrying");
                    eVar.f21292b.b(new S(3));
                    return;
                }
                cVar.p(nVar, System.currentTimeMillis());
                cVar.t(new Pi.a(Oi.b.TOKEN_REFRESH, Long.valueOf(sseJwtToken3.getExpirationTime()), System.currentTimeMillis()));
                cVar.o();
                long j = gVar.f21303d;
                c1967a.b(new C2440a(j));
                if (j > 0) {
                    try {
                        Thread.sleep(j * 1000);
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                if (eVar.h.get() || atomicBoolean.get()) {
                    return;
                }
                b1.t tVar = eVar.f21293d;
                EventStreamParser eventStreamParser = (EventStreamParser) tVar.f8335d;
                ?? r82 = (Ci.b) tVar.f;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) tVar.e;
                atomicBoolean2.set(false);
                AtomicInteger atomicInteger = (AtomicInteger) tVar.f8334b;
                atomicInteger.set(0);
                List<String> channels = sseJwtToken3.getChannels();
                ((C2011b) tVar.f8336g).getClass();
                if (channels == null || channels.size() == 0) {
                    string = "";
                    obj = sseJwtToken;
                } else {
                    String str2 = channels.get(0);
                    StringBuilder sb2 = new StringBuilder(str2);
                    for (int i = 1; i < channels.size(); i++) {
                        sb2.append(",");
                        sb2.append(channels.get(i));
                    }
                    string = sb2.toString();
                    obj = str2;
                }
                String rawJwt = sseJwtToken3.getRawJwt();
                try {
                    try {
                        try {
                            try {
                            } catch (Exception e10) {
                                e = e10;
                                r17 = 1;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (!atomicBoolean2.getAndSet(false)) {
                                r82.x(true);
                                tVar.c();
                            }
                            throw th;
                        }
                    } catch (HttpException e11) {
                        e = e11;
                    } catch (IOException e12) {
                        e = e12;
                    } catch (URISyntaxException e13) {
                        e = e13;
                    }
                    try {
                        com.google.firebase.messaging.r rVar2 = new com.google.firebase.messaging.r((URI) tVar.f8333a);
                        rVar2.j("v", "1.1");
                        rVar2.j(AppsFlyerProperties.CHANNEL, string);
                        rVar2.j(PlayMayaWebViewParameters.PARAMETER_ACCESS_TOKEN, rawJwt);
                        io.split.android.client.network.h hVarD = ((io.split.android.client.network.d) tVar.c).d(rVar2.k());
                        tVar.h = hVarD;
                        iVarD = hVarD.d();
                        tVar.i = iVarD;
                        try {
                        } catch (Exception e14) {
                            e = e14;
                            r17 = obj;
                            b1.t.j("An unexpected error has occurred while receiving stream events from: ", e);
                            if (atomicBoolean2.getAndSet(false)) {
                                return;
                            }
                            r22 = r17;
                            r82.x(r22);
                        }
                    } catch (HttpException e15) {
                        e = e15;
                        b1.t.j("An error has occurred while creating stream Url ", e);
                        boolean z10 = !AbstractC1331a.f(AbstractC1331a.e(e.f17569a));
                        if (atomicBoolean2.getAndSet(false)) {
                            return;
                        } else {
                            r82.x(z10);
                        }
                    } catch (IOException e16) {
                        e = e16;
                        Ri.a.d("An error has occurred while parsing stream: " + e.getLocalizedMessage());
                        if (atomicBoolean2.getAndSet(false)) {
                            return;
                        }
                        r22 = 1;
                        r82.x(r22);
                    } catch (URISyntaxException e17) {
                        e = e17;
                        b1.t.j("An error has occurred while creating stream Url ", e);
                        r22 = 0;
                        if (atomicBoolean2.getAndSet(false)) {
                            return;
                        }
                        r82.x(r22);
                    }
                    if (iVarD.b()) {
                        BufferedReader bufferedReader2 = ((io.split.android.client.network.i) tVar.i).f17600b;
                        if (bufferedReader2 == null) {
                            throw new IOException("Buffer is null");
                        }
                        Ri.a.d("Streaming connection opened");
                        atomicInteger.set(1);
                        HashMap map = new HashMap();
                        boolean z11 = false;
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                boolean z12 = z8 ? 1 : 0;
                                B10 = z8;
                            } else if (eventStreamParser.parseLineAndAppendValue(line, map)) {
                                if (z11) {
                                    sseJwtToken2 = sseJwtToken3;
                                    z4 = z8 ? 1 : 0;
                                    bufferedReader = bufferedReader2;
                                    z11 = z11;
                                } else {
                                    if (!eventStreamParser.isKeepAlive(map) && !r82.A(map)) {
                                        Ri.a.d("Streaming error after connection");
                                        B10 = r82.B(map);
                                    }
                                    Ri.a.d("Streaming connection success");
                                    c1967a.b(new S(z8 ? 1 : 0));
                                    yi.j jVar = eVar.f;
                                    long issuedAtTime = sseJwtToken3.getIssuedAtTime();
                                    long expirationTime = sseJwtToken3.getExpirationTime();
                                    String str3 = jVar.c;
                                    boolean z13 = z8 ? 1 : 0;
                                    jVar.f21307a.k(str3);
                                    sseJwtToken2 = sseJwtToken3;
                                    long jMax = Math.max((expirationTime - issuedAtTime) - 600, 0L);
                                    bufferedReader = bufferedReader2;
                                    jVar.c = jVar.f21307a.i(new ki.i(jVar, 4), jMax, null);
                                    z11 = z13 ? 1 : 0;
                                    z4 = z13;
                                }
                                if (!eventStreamParser.isKeepAlive(map)) {
                                    r82.y(map);
                                }
                                map = new HashMap();
                                sseJwtToken3 = sseJwtToken2;
                                z8 = z4;
                                bufferedReader2 = bufferedReader;
                                break;
                            }
                        }
                        tVar.c();
                        return;
                    }
                    Ri.a.g("Streaming connection error. Http return code " + ((io.split.android.client.network.i) tVar.i).f6237a);
                    int i4 = ((io.split.android.client.network.i) tVar.i).f6237a;
                    B10 = ((i4 < 400 || i4 >= 500) ? (char) 0 : (char) 1) ^ 1;
                    if (atomicBoolean2.getAndSet(false)) {
                        return;
                    }
                    r82.x(B10);
                    tVar.c();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
                break;
        }
    }
}
