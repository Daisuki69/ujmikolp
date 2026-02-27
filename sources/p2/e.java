package P2;

import U2.p;
import U2.r;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final M2.a f = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.d f4990b;
    public long c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4991d = -1;
    public final Timer e;

    public e(HttpURLConnection httpURLConnection, Timer timer, N2.d dVar) {
        this.f4989a = httpURLConnection;
        this.f4990b = dVar;
        this.e = timer;
        dVar.j(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        N2.d dVar = this.f4990b;
        Timer timer = this.e;
        if (j == -1) {
            timer.c();
            long j6 = timer.f9858a;
            this.c = j6;
            dVar.f(j6);
        }
        try {
            this.f4989a.connect();
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f4989a;
        int responseCode = httpURLConnection.getResponseCode();
        N2.d dVar = this.f4990b;
        dVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                dVar.g(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, timer);
            }
            dVar.g(httpURLConnection.getContentType());
            dVar.h(httpURLConnection.getContentLength());
            dVar.i(timer.a());
            dVar.b();
            return content;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f4989a;
        int responseCode = httpURLConnection.getResponseCode();
        N2.d dVar = this.f4990b;
        dVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                dVar.g(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, timer);
            }
            dVar.g(httpURLConnection.getContentType());
            dVar.h(httpURLConnection.getContentLength());
            dVar.i(timer.a());
            dVar.b();
            return content;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f4989a;
        N2.d dVar = this.f4990b;
        i();
        try {
            dVar.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new a(errorStream, dVar, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f4989a;
        int responseCode = httpURLConnection.getResponseCode();
        N2.d dVar = this.f4990b;
        dVar.d(responseCode);
        dVar.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new a(inputStream, dVar, timer) : inputStream;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f4989a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        N2.d dVar = this.f4990b;
        try {
            OutputStream outputStream = this.f4989a.getOutputStream();
            return outputStream != null ? new b(outputStream, dVar, timer) : outputStream;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.f4991d;
        Timer timer = this.e;
        N2.d dVar = this.f4990b;
        if (j == -1) {
            long jA = timer.a();
            this.f4991d = jA;
            p pVar = dVar.f3518d;
            pVar.i();
            r.z((r) pVar.f10116b, jA);
        }
        try {
            int responseCode = this.f4989a.getResponseCode();
            dVar.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f4989a;
        i();
        long j = this.f4991d;
        Timer timer = this.e;
        N2.d dVar = this.f4990b;
        if (j == -1) {
            long jA = timer.a();
            this.f4991d = jA;
            p pVar = dVar.f3518d;
            pVar.i();
            r.z((r) pVar.f10116b, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            dVar.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f4989a.hashCode();
    }

    public final void i() {
        long j = this.c;
        N2.d dVar = this.f4990b;
        if (j == -1) {
            Timer timer = this.e;
            timer.c();
            long j6 = timer.f9858a;
            this.c = j6;
            dVar.f(j6);
        }
        HttpURLConnection httpURLConnection = this.f4989a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            dVar.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            dVar.c(ShareTarget.METHOD_POST);
        } else {
            dVar.c(ShareTarget.METHOD_GET);
        }
    }

    public final String toString() {
        return this.f4989a.toString();
    }
}
