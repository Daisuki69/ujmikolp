package com.dynatrace.android.agent.comm;

import We.s;
import android.os.Build;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.ssl.LocalX509TrustManager;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.util.Utility;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class CommHandler {
    private Configuration configuration;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CommHandler");
    private static int CONN_TIMEOUT = 10000;
    private static int READ_TIMEOUT = 30000;

    public CommHandler(Configuration configuration) {
        this.configuration = configuration;
    }

    private static byte[] decompress(byte[] bArr) throws IOException {
        return Utility.readStream(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    private static boolean isGZIPStream(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    private HttpURLConnection openConnection(URL url) throws GeneralSecurityException, IOException {
        if (!this.configuration.getServerUrl().startsWith(ProxyConfig.MATCH_HTTPS)) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        if (Build.VERSION.SDK_INT >= 24) {
            Configuration configuration = this.configuration;
            if (configuration.keyStore == null && configuration.certificateValidation) {
                return httpsURLConnection;
            }
        }
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Configuration configuration2 = this.configuration;
        sSLContext.init(configuration2.keyManagers, new TrustManager[]{new LocalX509TrustManager(configuration2.keyStore, !configuration2.certificateValidation)}, new SecureRandom());
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        return httpsURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dynatrace.android.agent.comm.HttpResponse executeRequest(java.lang.String r7, java.lang.String r8, boolean r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.comm.CommHandler.executeRequest(java.lang.String, java.lang.String, boolean):com.dynatrace.android.agent.comm.HttpResponse");
    }
}
