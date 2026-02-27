package dOYHB6.hMHVh2;

import dOYHB6.lAavc8.gDpfv6;
import dOYHB6.mM0wQ9;
import java.io.IOException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class mHUjC9 {
    private static SSLSocketFactory sslSocketFactory = null;
    private static final Object sslSocketFactoryLock = new Object();

    public static void g239i4(HttpsURLConnection httpsURLConnection, SSLSocketFactory sSLSocketFactory) throws IOException {
        SSLSocketFactory sSLSocketFactoryLGo6h2 = lGo6h2(httpsURLConnection.getURL().getHost());
        if (sSLSocketFactoryLGo6h2 == null) {
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
        } else {
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryLGo6h2);
        }
    }

    private static SSLSocketFactory lGo6h2(String str) throws IOException {
        if (!str.equals("api.mixpanel.com") && !str.equals("decide.mixpanel.com")) {
            return null;
        }
        synchronized (sslSocketFactoryLock) {
            if (sslSocketFactory != null) {
                return sslSocketFactory;
            }
            sslSocketFactory = gDpfv6.zdOBR1();
            if (sslSocketFactory != null) {
                return sslSocketFactory;
            }
            mM0wQ9.xFRsG8("could not initialize MixPanel secure connection in order to load MixpanelAPI");
            throw new IOException("could not initialize MixPanel secure connection");
        }
    }
}
