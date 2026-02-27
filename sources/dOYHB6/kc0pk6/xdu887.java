package dOYHB6.kc0pk6;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class xdu887 {
    public static String hFfSd2(String str, int i) {
        Exception e;
        SSLSocket sSLSocket;
        SSLSocket sSLSocket2 = null;
        try {
            sSLSocket = (SSLSocket) ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket(str, i);
        } catch (Exception e7) {
            e = e7;
        }
        try {
            sSLSocket.startHandshake();
            e = new Exception("handshake should not have finished successfully");
        } catch (Exception e10) {
            e = e10;
            sSLSocket2 = sSLSocket;
            sSLSocket = sSLSocket2;
        }
        try {
            sSLSocket.close();
        } catch (Throwable th2) {
        }
        return e.getClass().getCanonicalName();
    }
}
