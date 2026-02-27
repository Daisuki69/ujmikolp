package kf;

import We.s;
import df.EnumC1355A;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import nf.C1943a;
import nf.C1944b;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f18132b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    static {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "java.vm.name"
            java.lang.String r3 = java.lang.System.getProperty(r2)
            java.lang.String r4 = "Dalvik"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L9e
            java.lang.String r3 = java.lang.System.getProperty(r2)
            boolean r3 = r4.equals(r3)
            java.lang.String r5 = "com.android.org.conscrypt.SSLParametersImpl"
            r6 = 0
            if (r3 != 0) goto L1f
        L1d:
            r8 = r6
            goto L34
        L1f:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ReflectiveOperationException -> L1d java.lang.NoClassDefFoundError -> L22
            goto L23
        L22:
            r3 = r1
        L23:
            r7 = 29
            if (r3 < r7) goto L1d
            java.lang.Class.forName(r5)     // Catch: java.lang.ReflectiveOperationException -> L1d
            kf.b r8 = new kf.b     // Catch: java.lang.ReflectiveOperationException -> L1d
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.ReflectiveOperationException -> L1d
        L34:
            if (r8 == 0) goto L37
            goto La3
        L37:
            java.lang.String r2 = java.lang.System.getProperty(r2)
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L42
            goto L92
        L42:
            java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.String r2 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r8 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L92
            java.lang.String r2 = "setUseSessionTickets"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L7c
            r3[r1] = r4     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.String r2 = "setHostname"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.reflect.Method r10 = r8.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.String r2 = "getAlpnSelectedProtocol"
            java.lang.reflect.Method r11 = r8.getMethod(r2, r6)     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.String r2 = "setAlpnProtocols"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r1] = r3     // Catch: java.lang.NoSuchMethodException -> L7c
            java.lang.reflect.Method r12 = r8.getMethod(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L7c
            kf.e r7 = new kf.e     // Catch: java.lang.NoSuchMethodException -> L7c
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.NoSuchMethodException -> L7c
            r6 = r7
            goto L92
        L7c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected Android API level 21+ but was "
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L92:
            if (r6 == 0) goto L96
            r8 = r6
            goto La3
        L96:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
        L9e:
            kf.f r8 = new kf.f
            r8.<init>()
        La3:
            kf.f.f18131a = r8
            java.lang.Class<df.f> r0 = df.C1364f.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            kf.f.f18132b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.<clinit>():void");
    }

    public static byte[] h(List list) {
        of.e eVar = new of.e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC1355A enumC1355A = (EnumC1355A) list.get(i);
            if (enumC1355A != EnumC1355A.HTTP_1_0) {
                eVar.t(enumC1355A.f16391a.length());
                String str = enumC1355A.f16391a;
                eVar.f(0, str.length(), str);
            }
        }
        return eVar.x();
    }

    public X5.f a(X509TrustManager x509TrustManager) {
        return new C1943a(i(x509TrustManager));
    }

    public Object b() {
        if (f18132b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public String c(SSLSocket sSLSocket) {
        return null;
    }

    public void d(int i, String str, Throwable th2) {
        f18132b.log(i == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void e(Object obj, String str) {
        if (obj == null) {
            str = s.i(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        d(5, str, (Throwable) obj);
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void g(SSLSocket sSLSocket, String str, List list) {
    }

    public nf.d i(X509TrustManager x509TrustManager) {
        return new C1944b(x509TrustManager.getAcceptedIssuers());
    }

    public boolean j(String str) {
        return true;
    }

    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
