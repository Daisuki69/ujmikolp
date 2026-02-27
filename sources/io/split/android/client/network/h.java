package io.split.android.client.network;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.M;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URI f17592a;
    public final HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1916a f17594d;
    public HttpURLConnection e;
    public BufferedReader f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f17595g;
    public final A0 h;
    public final long i;
    public final SSLSocketFactory j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f17596k;
    public final e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f17598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f17599o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f17597l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17593b = 1;

    public h(URI uri, HashMap map, Proxy proxy, A0 a02, long j, SSLSocketFactory sSLSocketFactory, C1916a c1916a, r rVar, e eVar, k kVar, M m) {
        this.f17592a = uri;
        this.f17595g = proxy;
        Objects.requireNonNull(c1916a);
        this.f17594d = c1916a;
        Objects.requireNonNull(map);
        this.c = new HashMap(map);
        this.h = a02;
        this.i = j;
        this.j = sSLSocketFactory;
        this.f17596k = rVar;
        this.m = eVar;
        this.f17598n = kVar;
        this.f17599o = m;
    }

    public final i a(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream;
        int responseCode = Callback.getResponseCode(httpURLConnection);
        if (responseCode < 200 || responseCode >= 300 || (inputStream = Callback.getInputStream(httpURLConnection)) == null) {
            return new i(responseCode, null, null, null);
        }
        if (this.f != null) {
            b();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        this.f = bufferedReader;
        return new i(responseCode, bufferedReader, null, null);
    }

    public final void b() {
        try {
            this.f.close();
        } catch (Exception e) {
            Ri.a.d("Unknown error closing buffer: " + e.getLocalizedMessage());
        }
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final i d() throws Exception {
        e eVar;
        try {
            M m = this.f17599o;
            if (m == null || (eVar = this.m) == null || this.j == null) {
                HttpURLConnection httpURLConnectionF = f(false);
                this.e = httpURLConnectionF;
                i iVarA = a(httpURLConnectionF);
                return iVarA.f6237a == 407 ? e(iVarA) : iVarA;
            }
            this.f17594d.getClass();
            URL urlC = C1916a.c(this.f17592a);
            if (urlC != null) {
                return m.f(eVar, urlC, this.f17593b, this.c, this.j, this.f17598n);
            }
            throw new IOException("Error parsing URL");
        } catch (MalformedURLException e) {
            c();
            throw new HttpException("URL is malformed: " + e.getLocalizedMessage());
        } catch (ProtocolException e7) {
            c();
            throw new HttpException("Http method not allowed: " + e7.getLocalizedMessage());
        } catch (SocketException e10) {
            c();
            throw e10;
        } catch (SSLPeerUnverifiedException e11) {
            c();
            throw new HttpException("SSL peer not verified: " + e11.getLocalizedMessage(), 0);
        } catch (IOException e12) {
            c();
            throw new HttpException("Something happened while retrieving data: " + e12.getLocalizedMessage());
        }
    }

    public final i e(i iVar) throws HttpException {
        if (this.f17597l.getAndSet(true)) {
            return iVar;
        }
        try {
            Ri.a.d("Retrying with proxy authentication");
            f(true);
            return a(this.e);
        } catch (Exception e) {
            throw new HttpException("Something happened while retrieving data: " + e.getLocalizedMessage());
        }
    }

    public final HttpURLConnection f(boolean z4) throws Exception {
        this.f17594d.getClass();
        URL urlC = C1916a.c(this.f17592a);
        if (urlC == null) {
            throw new IOException("Error parsing URL");
        }
        HttpURLConnection httpURLConnectionC = b.c(urlC, this.f17595g, this.m, this.h, this.f17593b, this.c, z4, this.j, this.f17598n, null);
        httpURLConnectionC.setReadTimeout((int) 80000);
        long j = this.i;
        if (j > 0) {
            httpURLConnectionC.setConnectTimeout(j > 2147483647L ? Integer.MAX_VALUE : (int) j);
        }
        SSLSocketFactory sSLSocketFactory = this.j;
        if (sSLSocketFactory != null) {
            if (httpURLConnectionC instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnectionC).setSSLSocketFactory(sSLSocketFactory);
            } else {
                Ri.a.g("Failed to set SSL socket factory.");
            }
        }
        Callback.connect(httpURLConnectionC);
        b.b(httpURLConnectionC, this.f17596k);
        return httpURLConnectionC;
    }
}
