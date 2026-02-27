package P5;

import cg.InterfaceC1101b;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import o1.AbstractC1955a;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5138a;

    public v0(a0 a0Var, InterfaceC1101b interfaceC1101b) {
        this.f5138a = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builderAddInterceptor;
        HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) this.f5138a.get();
        try {
            CertificatePinner certificatePinnerBuild = new CertificatePinner.Builder().add("api.paymaya.com", "sha256/Y2ueewxxRS5UvtXkeJ2ZnE3U7e4fRC6fd2qN9YqNKvw=").add("api.paymaya.com", "sha256/oxysGbvQOQYKFKhuhHXtW2gh9McPZHPLhiC6hXT6bYw=").add("api.paymaya.com", "sha256/XkFJl0e9wTeTogSGtlrJsMZLxvAzROzIQkquuCl1910=").build();
            X509TrustManager x509TrustManagerA = H5.b.a();
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builderAddInterceptor = builder.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).certificatePinner(certificatePinnerBuild).sslSocketFactory(new H5.c(sSLContext), x509TrustManagerA);
        } catch (IllegalArgumentException | KeyManagementException | NoSuchAlgorithmException e) {
            yk.a.a();
            e.getMessage();
            yk.a.d();
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            builderAddInterceptor = builder2.connectTimeout(30000L, timeUnit2).readTimeout(30000L, timeUnit2).addInterceptor(httpLoggingInterceptor);
        }
        AbstractC1955a.d(builderAddInterceptor);
        return builderAddInterceptor;
    }
}
