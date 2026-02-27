package com.dynatrace.android.agent.comm.ssl;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class LocalX509TrustManager implements X509TrustManager {
    private X509Certificate[] acceptedCertIssuers;
    private boolean allowAnyCert;
    private X509TrustManager defTrustMgr;
    private X509TrustManager localTrustMgr;

    public LocalX509TrustManager(KeyStore keyStore, boolean z4) throws NoSuchAlgorithmException, KeyStoreException {
        this.localTrustMgr = null;
        this.defTrustMgr = null;
        this.allowAnyCert = z4;
        ArrayList arrayList = new ArrayList();
        SimpleX509TrustManager simpleX509TrustManager = new SimpleX509TrustManager(null);
        this.defTrustMgr = simpleX509TrustManager;
        for (X509Certificate x509Certificate : simpleX509TrustManager.getAcceptedIssuers()) {
            arrayList.add(x509Certificate);
        }
        if (keyStore != null) {
            SimpleX509TrustManager simpleX509TrustManager2 = new SimpleX509TrustManager(keyStore);
            this.localTrustMgr = simpleX509TrustManager2;
            for (X509Certificate x509Certificate2 : simpleX509TrustManager2.getAcceptedIssuers()) {
                arrayList.add(x509Certificate2);
            }
        }
        this.acceptedCertIssuers = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    private void checkTrusted(X509Certificate[] x509CertificateArr, String str, boolean z4) throws CertificateException {
        if (this.allowAnyCert) {
            return;
        }
        if (z4) {
            try {
                this.defTrustMgr.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                X509TrustManager x509TrustManager = this.localTrustMgr;
                if (x509TrustManager == null) {
                    throw e;
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            }
        }
        try {
            this.defTrustMgr.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e7) {
            X509TrustManager x509TrustManager2 = this.localTrustMgr;
            if (x509TrustManager2 == null) {
                throw e7;
            }
            x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        checkTrusted(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        checkTrusted(x509CertificateArr, str, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.acceptedCertIssuers;
    }
}
