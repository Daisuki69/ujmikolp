package P5;

import cg.InterfaceC1101b;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import o1.AbstractC1955a;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5141a;

    public w0(a0 a0Var, InterfaceC1101b interfaceC1101b) {
        this.f5141a = interfaceC1101b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [okhttp3.OkHttpClient$Builder] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, okhttp3.logging.HttpLoggingInterceptor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.logging.HttpLoggingInterceptor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.OkHttpClient$Builder] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.logging.HttpLoggingInterceptor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [okhttp3.OkHttpClient$Builder] */
    /* JADX WARN: Type inference failed for: r0v7, types: [okhttp3.logging.HttpLoggingInterceptor] */
    /* JADX WARN: Type inference failed for: r0v8, types: [okhttp3.OkHttpClient$Builder] */
    /* JADX WARN: Type inference failed for: r0v9, types: [okhttp3.logging.HttpLoggingInterceptor] */
    @Override // aj.InterfaceC0716a
    public final Object get() {
        ?? httpLoggingInterceptor = (HttpLoggingInterceptor) this.f5141a.get();
        kotlin.jvm.internal.j.g(httpLoggingInterceptor, "httpLoggingInterceptor");
        try {
            X509TrustManager x509TrustManagerC = H5.a.c();
            if (x509TrustManagerC == null) {
                httpLoggingInterceptor = H5.a.a(httpLoggingInterceptor);
            } else {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                httpLoggingInterceptor = H5.a.b(new String[]{"sha256/7cOvxhc2ihuO6ng1GnoZJUuHGOE6cDS6h1VA017njm0=", "sha256/NUeRluqd4llE8y461qNMfCMTCvf0ZXP+3sT1XFUZzEY=", "sha256//mSOUryIbkYb0tDZHlKHg49qsxIGOIpZVBbACoxoz4w="}, new H5.c(sSLContext), x509TrustManagerC, httpLoggingInterceptor);
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
            yk.a.d();
            httpLoggingInterceptor = H5.a.a(httpLoggingInterceptor);
        } catch (IllegalStateException e7) {
            e7.getMessage();
            yk.a.d();
            httpLoggingInterceptor = H5.a.a(httpLoggingInterceptor);
        } catch (KeyManagementException e10) {
            e10.getMessage();
            yk.a.d();
            httpLoggingInterceptor = H5.a.a(httpLoggingInterceptor);
        } catch (NoSuchAlgorithmException e11) {
            e11.getMessage();
            yk.a.d();
            httpLoggingInterceptor = H5.a.a(httpLoggingInterceptor);
        }
        AbstractC1955a.d(httpLoggingInterceptor);
        return httpLoggingInterceptor;
    }
}
