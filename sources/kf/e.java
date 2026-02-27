package kf;

import android.os.Build;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ij.C1612f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import nf.C1943a;
import nf.C1944b;

/* JADX INFO: loaded from: classes4.dex */
public class e extends f {
    public final Class c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f18129d;
    public final Method e;
    public final Method f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f18130g;
    public final C1612f h;

    public e(Class cls, Method method, Method method2, Method method3, Method method4) throws NoSuchMethodException {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", null);
            method6 = cls2.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
            method5 = cls2.getMethod("warnIfOpen", null);
            method7 = method8;
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
        }
        this.h = new C1612f(method7, method6, method5);
        this.c = cls;
        this.f18129d = method;
        this.e = method2;
        this.f = method3;
        this.f18130g = method4;
    }

    public static boolean l(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // kf.f
    public final X5.f a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new c(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new C1943a(i(x509TrustManager));
        }
    }

    @Override // kf.f
    public final Object b() {
        C1612f c1612f = this.h;
        Method method = c1612f.f17152a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                c1612f.f17153b.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // kf.f
    public String c(SSLSocket sSLSocket) {
        if (this.c.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }
        return null;
    }

    @Override // kf.f
    public final void d(int i, String str, Throwable th2) {
        int iMin;
        int i4 = i != 5 ? 3 : 5;
        if (th2 != null) {
            str = str + '\n' + Log.getStackTraceString(th2);
        }
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            int iIndexOf = str.indexOf(10, i6);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i6 + 4000);
                Log.println(i4, "OkHttp", str.substring(i6, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i6 = iMin;
                }
            }
            i6 = iMin + 1;
        }
    }

    @Override // kf.f
    public final void e(Object obj, String str) {
        C1612f c1612f = this.h;
        c1612f.getClass();
        if (obj != null) {
            try {
                c1612f.c.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        d(5, str, null);
    }

    @Override // kf.f
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!ef.c.k(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // kf.f
    public void g(SSLSocket sSLSocket, String str, List list) {
        if (this.c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f18129d.invoke(sSLSocket, Boolean.TRUE);
                    this.e.invoke(sSLSocket, str);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    throw new AssertionError(e);
                }
            }
            this.f18130g.invoke(sSLSocket, f.h(list));
        }
    }

    @Override // kf.f
    public final nf.d i(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new d(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C1944b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // kf.f
    public final boolean j(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                return l(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // kf.f
    public final SSLContext k() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
