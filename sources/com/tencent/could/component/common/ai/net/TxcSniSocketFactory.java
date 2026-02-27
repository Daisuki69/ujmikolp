package com.tencent.could.component.common.ai.net;

import android.net.SSLCertificateSocketFactory;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class TxcSniSocketFactory extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HostnameVerifier f15603a = HttpsURLConnection.getDefaultHostnameVerifier();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpsURLConnection f15604b;

    public TxcSniSocketFactory(HttpsURLConnection httpsURLConnection) {
        this.f15604b = httpsURLConnection;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i4) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i4) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z4) throws IOException {
        String requestProperty = this.f15604b.getRequestProperty("Host");
        if (requestProperty != null) {
            str = requestProperty;
        }
        TxNetWorkHelper.getInstance().logError("TxcSniSocketFactory", "customized peerHost host: " + str);
        InetAddress inetAddress = socket.getInetAddress();
        if (z4) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, str);
        SSLSession session = sSLSocket.getSession();
        HostnameVerifier hostnameVerifier = this.f15604b.getHostnameVerifier();
        if (hostnameVerifier == null) {
            TxNetWorkHelper.getInstance().logError("TxcSniSocketFactory", "current verifier is null, use default verifier.");
            hostnameVerifier = this.f15603a;
        }
        if (hostnameVerifier.verify(str, session)) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException(AbstractC1414e.h("Cannot verify hostname: ", str));
    }
}
