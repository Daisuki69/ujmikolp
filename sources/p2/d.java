package P2;

import android.os.Build;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpsURLConnection f4988b;

    public d(HttpsURLConnection httpsURLConnection, Timer timer, N2.d dVar) {
        super(httpsURLConnection.getURL());
        this.f4988b = httpsURLConnection;
        this.f4987a = new e(httpsURLConnection, timer, dVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f4987a.f4989a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f4987a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.f4987a;
        long jA = eVar.e.a();
        N2.d dVar = eVar.f4990b;
        dVar.i(jA);
        dVar.b();
        eVar.f4989a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f4987a.f4989a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f4987a.f4989a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f4988b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f4987a.f4989a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f4987a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        e eVar = this.f4987a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f4989a.getContentLengthLong();
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f4987a.f4989a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f4987a.f4989a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f4987a.f4989a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f4987a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        e eVar = this.f4987a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f4989a.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f4988b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f4987a.f4989a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f4987a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f4987a.f4989a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f4988b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f4988b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f4987a.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f4988b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        e eVar = this.f4987a;
        eVar.getClass();
        try {
            return eVar.f4989a.getPermission();
        } catch (IOException e) {
            long jA = eVar.e.a();
            N2.d dVar = eVar.f4990b;
            dVar.i(jA);
            h.c(dVar);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f4987a.f4989a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f4987a.f4989a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f4987a.f4989a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f4987a.f4989a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f4987a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f4987a.h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f4988b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f4988b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f4987a.f4989a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f4987a.f4989a.getUseCaches();
    }

    public final int hashCode() {
        return this.f4987a.f4989a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z4) {
        this.f4987a.f4989a.setAllowUserInteraction(z4);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f4987a.f4989a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f4987a.f4989a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z4) {
        this.f4987a.f4989a.setDefaultUseCaches(z4);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z4) {
        this.f4987a.f4989a.setDoInput(z4);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z4) {
        this.f4987a.f4989a.setDoOutput(z4);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f4987a.f4989a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f4988b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f4987a.f4989a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z4) {
        this.f4987a.f4989a.setInstanceFollowRedirects(z4);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f4987a.f4989a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f4987a.f4989a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f4987a;
        eVar.getClass();
        if (RtspHeaders.USER_AGENT.equalsIgnoreCase(str)) {
            eVar.f4990b.f = str2;
        }
        eVar.f4989a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f4988b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z4) {
        this.f4987a.f4989a.setUseCaches(z4);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f4987a.f4989a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f4987a.f4989a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f4987a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.f4987a;
        eVar.i();
        return eVar.f4989a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f4987a.f4989a.setFixedLengthStreamingMode(j);
    }
}
