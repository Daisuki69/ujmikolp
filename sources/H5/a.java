package H5;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.j;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static OkHttpClient.Builder a(HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).addInterceptor(httpLoggingInterceptor);
    }

    public static OkHttpClient.Builder b(String[] strArr, c cVar, X509TrustManager x509TrustManager, HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).sslSocketFactory(cVar, x509TrustManager).addInterceptor(httpLoggingInterceptor);
        if (strArr.length == 0) {
            return builderAddInterceptor;
        }
        CertificatePinner.Builder builder2 = new CertificatePinner.Builder();
        builder2.add("app.maya.ph", (String[]) Arrays.copyOf(strArr, strArr.length));
        CertificatePinner certificatePinnerBuild = builder2.build();
        String string = Arrays.toString(strArr);
        j.f(string, "toString(...)");
        "Certificate Pinning Keys for app.maya.ph: ".concat(string);
        yk.a.a();
        builderAddInterceptor.certificatePinner(certificatePinnerBuild);
        return builderAddInterceptor;
    }

    public static X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    j.e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    return (X509TrustManager) trustManager;
                }
            }
            String string = Arrays.toString(trustManagers);
            j.f(string, "toString(...)");
            throw new IllegalStateException("Unexpected default trust managers:".concat(string));
        } catch (KeyStoreException e) {
            e.getMessage();
            yk.a.d();
            return null;
        } catch (NoSuchAlgorithmException e7) {
            e7.getMessage();
            yk.a.d();
            return null;
        }
    }
}
