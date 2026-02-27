package io.split.android.client.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Permission;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f17588b;
    public final Certificate[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteArrayOutputStream f17589d;
    public ByteArrayInputStream e;
    public ByteArrayInputStream f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17590g;

    public f(URL url, g gVar, Certificate[] certificateArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        super(url);
        this.f17590g = false;
        this.f17588b = url;
        this.f17587a = gVar;
        this.c = certificateArr;
        this.f17589d = byteArrayOutputStream;
        this.e = null;
        this.f = null;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
    }

    @Override // java.net.URLConnection
    public final void connect() {
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.f17589d;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
        } catch (IOException unused) {
        }
        try {
            ByteArrayInputStream byteArrayInputStream = this.e;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        } catch (IOException unused2) {
        }
        try {
            ByteArrayInputStream byteArrayInputStream2 = this.f;
            if (byteArrayInputStream2 != null) {
                byteArrayInputStream2.close();
            }
        } catch (IOException unused3) {
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return null;
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return 0;
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return "utf-8";
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        long contentLengthLong = getContentLengthLong();
        if (contentLengthLong > 2147483647L) {
            return -1;
        }
        return (int) contentLengthLong;
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        if (this.f17587a.f17591b == null) {
            return 0L;
        }
        return r0.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        String str = this.f17587a.f17591b;
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String strTrim = str.trim();
        return (strTrim.startsWith("{") || strTrim.startsWith("[")) ? "application/json; charset=utf-8" : strTrim.startsWith("<") ? "text/html; charset=utf-8" : "text/plain; charset=utf-8";
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return System.currentTimeMillis();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return false;
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return true;
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f17590g;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        g gVar = this.f17587a;
        if (gVar.f6237a < 400) {
            return null;
        }
        if (this.f == null) {
            String str = gVar.f17591b;
            if (str == null) {
                str = "";
            }
            this.f = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        }
        return this.f;
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) ((HashMap) getHeaderFields()).get(str.toLowerCase());
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        return "date".equalsIgnoreCase(str) ? System.currentTimeMillis() : j;
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        String headerField = getHeaderField(str);
        if (headerField != null) {
            try {
                return Integer.parseInt(headerField);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map headerFields = getHeaderFields();
        if (i < 0) {
            return null;
        }
        HashMap map = (HashMap) headerFields;
        if (i < map.size()) {
            return (String) map.keySet().toArray()[i];
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        HashMap map = new HashMap();
        String contentType = getContentType();
        if (contentType != null) {
            map.put("content-type", Collections.singletonList(contentType));
        }
        long contentLengthLong = getContentLengthLong();
        if (contentLengthLong >= 0) {
            map.put("content-length", Collections.singletonList(String.valueOf(contentLengthLong)));
        }
        map.put("content-encoding", Collections.singletonList("utf-8"));
        try {
            map.put("status", Collections.singletonList(this.f17587a.f6237a + Global.BLANK + getResponseMessage()));
        } catch (IOException unused) {
        }
        return map;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return null;
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return 0L;
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        g gVar = this.f17587a;
        if (gVar.f6237a >= 400) {
            throw new IOException("HTTP " + gVar.f6237a);
        }
        if (this.e == null) {
            String str = gVar.f17591b;
            if (str == null) {
                str = "";
            }
            this.e = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        }
        return this.e;
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return true;
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return 0L;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return null;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        if (this.f17590g) {
            return this.f17589d;
        }
        throw new IOException("Output not enabled for this connection. Call setDoOutput(true) first.");
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return null;
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return 0;
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return ShareTarget.METHOD_GET;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return null;
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f17587a.f6237a;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        g gVar = this.f17587a;
        int i = gVar.f6237a;
        if (i == 200) {
            return "OK";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 403) {
            return "Forbidden";
        }
        if (i == 404) {
            return "Not Found";
        }
        return "HTTP " + gVar.f6237a;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.c;
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f17588b;
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return false;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z4) {
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z4) {
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z4) {
        this.f17590g = z4;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z4) {
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z4) {
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return true;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        String headerFieldKey = getHeaderFieldKey(i);
        if (headerFieldKey != null) {
            return getHeaderField(headerFieldKey);
        }
        return null;
    }
}
