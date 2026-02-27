package dOYHB6.lAavc8;

import android.os.Build;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public class gDpfv6 {
    private static HashMap<String, KeyStore> keystoreMap = new HashMap<>();

    static class dbs7n4 implements X509TrustManager {
        private X509TrustManager orig;

        dbs7n4(X509TrustManager x509TrustManager) {
            this.orig = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.orig.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (x509CertificateArr != null && x509CertificateArr[0] != null) {
                x509CertificateArr[0].getSubjectDN().toString();
            }
            try {
                this.orig.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException e) {
                throw e;
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static class xai3y6 extends X509ExtendedTrustManager {
        private X509ExtendedTrustManager orig;

        xai3y6(X509ExtendedTrustManager x509ExtendedTrustManager) {
            this.orig = x509ExtendedTrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.orig.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            this.orig.checkClientTrusted(x509CertificateArr, str, socket);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            this.orig.checkClientTrusted(x509CertificateArr, str, sSLEngine);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (x509CertificateArr != null && x509CertificateArr[0] != null) {
                x509CertificateArr[0].getSubjectDN().toString();
            }
            try {
                this.orig.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException e) {
                throw e;
            }
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            if (socket != null && socket.getInetAddress() != null) {
                socket.getInetAddress().getHostName();
            }
            if (x509CertificateArr != null && x509CertificateArr[0] != null) {
                x509CertificateArr[0].getSubjectDN().toString();
            }
            try {
                this.orig.checkServerTrusted(x509CertificateArr, str, socket);
            } catch (CertificateException e) {
                throw e;
            }
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            if (sSLEngine != null) {
                sSLEngine.getPeerHost();
            }
            if (x509CertificateArr != null && x509CertificateArr[0] != null) {
                x509CertificateArr[0].getSubjectDN().toString();
            }
            try {
                this.orig.checkServerTrusted(x509CertificateArr, str, sSLEngine);
            } catch (CertificateException e) {
                throw e;
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private static List<Certificate> bm1Y41() throws IOException {
        String strReplaceAll = fChUQ4.y8AHA5().replaceAll(numX49.tnTj78("bH62"), numX49.tnTj78("bH6L"));
        ArrayList arrayList = new ArrayList();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strReplaceAll.getBytes());
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    }
                    arrayList.add(certificateGenerateCertificate);
                }
                byteArrayInputStream.close();
            } finally {
            }
        } catch (CertificateException e) {
        }
        return arrayList;
    }

    private static Certificate bw3gh7(String str) throws IOException, CertificateException {
        byte[] bArrUxZzb2 = qOnQ39.uxZzb2(str, null);
        if (bArrUxZzb2 == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrUxZzb2);
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
        } finally {
            byteArrayInputStream.close();
        }
    }

    private static synchronized KeyStore ezx519() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (keystoreMap.containsKey(mIG9c2())) {
            return keystoreMap.get(mIG9c2());
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        for (Certificate certificate : bm1Y41()) {
            keyStore.setCertificateEntry(h1H4C6() + certificate.hashCode(), certificate);
        }
        Certificate certificateBw3gh7 = bw3gh7(fRSuX9());
        if (certificateBw3gh7 != null) {
            keyStore.setCertificateEntry(zZIBm2(), certificateBw3gh7);
        }
        keystoreMap.put(mIG9c2(), keyStore);
        return keyStore;
    }

    private static synchronized KeyStore ezx519(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (keystoreMap.containsKey(str)) {
            return keystoreMap.get(str);
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setCertificateEntry(h1H4C6(), bw3gh7(str));
        Certificate certificateBw3gh7 = bw3gh7(fRSuX9());
        if (certificateBw3gh7 != null) {
            keyStore.setCertificateEntry(zZIBm2(), certificateBw3gh7);
        }
        keystoreMap.put(str, keyStore);
        return keyStore;
    }

    private static String fRSuX9() {
        return numX49.tnTj78("bH6P");
    }

    private static String h1H4C6() {
        return numX49.tnTj78("bH6r");
    }

    private static Certificate kXtb49(String str) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
            byteArrayInputStream.close();
            return certificateGenerateCertificate;
        } catch (CertificateException e) {
            byteArrayInputStream.close();
            return null;
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    private static TrustManager[] lKBf80() throws Exception {
        KeyStore keyStoreEzx519 = ezx519();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStoreEzx519);
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (Build.VERSION.SDK_INT >= 24 && (trustManager instanceof X509ExtendedTrustManager)) {
                return new TrustManager[]{new xai3y6((X509ExtendedTrustManager) trustManager)};
            }
            if (trustManager instanceof X509TrustManager) {
                return new TrustManager[]{new dbs7n4((X509TrustManager) trustManager)};
            }
        }
        throw new GeneralSecurityException(numX49.tnTj78("bH6k"));
    }

    private static String mIG9c2() {
        return numX49.tnTj78("bH6b");
    }

    private static String zZIBm2() {
        return numX49.tnTj78("bH6Z");
    }

    public static SSLSocketFactory zdOBR1() {
        SSLContext sSLContext;
        try {
            try {
                sSLContext = SSLContext.getInstance("TLSv1.3");
            } catch (NoSuchAlgorithmException e) {
                sSLContext = SSLContext.getInstance("TLSv1.2");
            }
            sSLContext.init(null, lKBf80(), null);
            return sSLContext.getSocketFactory();
        } catch (Exception e7) {
            return null;
        }
    }
}
