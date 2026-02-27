package com.dynatrace.android.agent.comm.ssl;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleX509TrustManager implements X509TrustManager {
    private X509Certificate[] acceptedIssuers;
    private X509TrustManager myTrustManager;

    public SimpleX509TrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        this.myTrustManager = null;
        this.acceptedIssuers = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        X509TrustManager x509TrustManagerFindX509TrustManager = findX509TrustManager(trustManagerFactory);
        this.myTrustManager = x509TrustManagerFindX509TrustManager;
        if (x509TrustManagerFindX509TrustManager == null) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.acceptedIssuers = x509TrustManagerFindX509TrustManager.getAcceptedIssuers();
    }

    private X509TrustManager findX509TrustManager(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.myTrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509Certificate x509Certificate;
        if (x509CertificateArr != null && x509CertificateArr.length == 1 && (x509Certificate = x509CertificateArr[0]) != null) {
            x509Certificate.checkValidity();
            X509Certificate[] acceptedIssuers = getAcceptedIssuers();
            if (acceptedIssuers != null) {
                for (X509Certificate x509Certificate2 : acceptedIssuers) {
                    if (x509CertificateArr[0].equals(x509Certificate2)) {
                        return;
                    }
                }
            }
        }
        this.myTrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.acceptedIssuers;
    }
}
