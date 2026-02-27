package df;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.L;
import d4.AbstractC1331a;
import io.split.android.client.network.HttpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import n3.C1916a;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16444a;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16446d;
    public Object e;
    public Serializable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16447g;
    public Object i;
    public Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f16449l;
    public Object m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16445b = -1;
    public Object h = new L(6);

    public static io.split.android.client.network.g b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = Callback.getResponseCode(httpURLConnection);
        if (responseCode < 200 || responseCode >= 300) {
            return new io.split.android.client.network.g(responseCode, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        InputStream inputStream = Callback.getInputStream(httpURLConnection);
        if (inputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return new io.split.android.client.network.g(responseCode, sb2.length() > 0 ? sb2.toString() : null, null);
    }

    public k a() {
        if (((C1365g) this.e) == null) {
            throw new IllegalStateException("request == null");
        }
        if (((EnumC1355A) this.f) == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f16445b >= 0) {
            if (this.f16444a != null) {
                return new k(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f16445b);
    }

    public io.split.android.client.network.g c() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        int i = this.f16445b;
        int iC = AbstractC2217b.c(i);
        HttpURLConnection httpURLConnectionE = null;
        if (iC != 0) {
            if (iC != 1) {
                throw new IllegalArgumentException("Request HTTP Method not valid: ".concat(AbstractC1331a.v(i)));
            }
            try {
                if (this.f16444a == null) {
                    throw new HttpException("Json data is null");
                }
                try {
                    httpURLConnectionE = e(false);
                    io.split.android.client.network.g gVarB = b(httpURLConnectionE);
                    if (gVarB.f6237a == 407) {
                        gVarB = d(gVarB, false, atomicBoolean);
                    }
                    httpURLConnectionE.disconnect();
                    return gVarB;
                } catch (SSLPeerUnverifiedException e) {
                    throw new HttpException("SSL Peer Unverified: " + e.getLocalizedMessage(), 0);
                } catch (IOException e7) {
                    throw new HttpException("Something happened while posting data: " + e7.getLocalizedMessage());
                }
            } finally {
            }
        }
        try {
            try {
                try {
                    try {
                        httpURLConnectionE = e(false);
                        io.split.android.client.network.g gVarB2 = b(httpURLConnectionE);
                        if (gVarB2.f6237a == 407) {
                            gVarB2 = d(gVarB2, true, atomicBoolean);
                        }
                        httpURLConnectionE.disconnect();
                        return gVarB2;
                    } catch (ProtocolException e10) {
                        throw new HttpException("Http method not allowed: " + e10.getLocalizedMessage());
                    }
                } catch (SSLPeerUnverifiedException e11) {
                    throw new HttpException("SSL Peer Unverified: " + e11.getLocalizedMessage(), 0);
                }
            } catch (MalformedURLException e12) {
                throw new HttpException("URL is malformed: " + e12.getLocalizedMessage());
            } catch (IOException e13) {
                throw new HttpException("Something happened while retrieving data: " + e13.getLocalizedMessage());
            }
        } finally {
        }
    }

    public io.split.android.client.network.g d(io.split.android.client.network.g gVar, boolean z4, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.getAndSet(true)) {
            return gVar;
        }
        HttpURLConnection httpURLConnectionE = null;
        try {
            try {
                Ri.a.d("Retrying with proxy authentication");
                httpURLConnectionE = z4 ? e(true) : e(true);
                io.split.android.client.network.g gVarB = b(httpURLConnectionE);
                httpURLConnectionE.disconnect();
                return gVarB;
            } catch (IOException e) {
                throw new HttpException("Something happened while retrieving data: " + e.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            if (httpURLConnectionE != null) {
                httpURLConnectionE.disconnect();
            }
            throw th2;
        }
    }

    public HttpURLConnection e(boolean z4) throws Exception {
        boolean z5;
        HttpURLConnection httpURLConnectionC;
        HashMap map = (HashMap) this.f;
        ((C1916a) this.f16447g).getClass();
        URL urlC = C1916a.c((URI) this.e);
        if (urlC == null) {
            throw new IOException("Error parsing URL");
        }
        try {
            z5 = z4;
        } catch (HttpRetryException e) {
            e = e;
            z5 = z4;
        }
        try {
            httpURLConnectionC = io.split.android.client.network.b.c(urlC, (Proxy) this.h, (io.split.android.client.network.e) this.i, (A0) this.j, this.f16445b, map, z5, (SSLSocketFactory) this.f16449l, (io.split.android.client.network.k) this.f16448k, this.f16444a);
        } catch (HttpRetryException e7) {
            e = e7;
            HttpRetryException httpRetryException = e;
            A0 a02 = (A0) this.j;
            if (a02 == null) {
                throw httpRetryException;
            }
            httpURLConnectionC = io.split.android.client.network.b.c(urlC, (Proxy) this.h, (io.split.android.client.network.e) this.i, a02, this.f16445b, map, z5, (SSLSocketFactory) this.f16449l, (io.split.android.client.network.k) this.f16448k, this.f16444a);
        }
        long j = this.c;
        if (j > 0) {
            httpURLConnectionC.setReadTimeout(j > 2147483647L ? Integer.MAX_VALUE : (int) j);
        }
        long j6 = this.f16446d;
        if (j6 > 0) {
            httpURLConnectionC.setConnectTimeout(j6 <= 2147483647L ? (int) j6 : Integer.MAX_VALUE);
        }
        SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) this.f16449l;
        if (sSLSocketFactory != null) {
            if (httpURLConnectionC instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnectionC).setSSLSocketFactory(sSLSocketFactory);
            } else {
                Ri.a.g("Failed to set SSL socket factory.");
            }
        }
        String str = this.f16444a;
        if (str != null && !str.trim().isEmpty()) {
            httpURLConnectionC.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
            httpURLConnectionC.setDoOutput(true);
            OutputStream outputStream = Callback.getOutputStream(httpURLConnectionC);
            try {
                outputStream.write(str.getBytes());
                outputStream.flush();
                outputStream.close();
            } finally {
            }
        }
        Callback.connect(httpURLConnectionC);
        io.split.android.client.network.b.b(httpURLConnectionC, (com.google.firebase.messaging.r) this.m);
        return httpURLConnectionC;
    }
}
