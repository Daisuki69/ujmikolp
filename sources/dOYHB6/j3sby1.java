package dOYHB6;

import android.net.http.SslCertificate;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes6.dex */
public class j3sby1 {
    public static String axPpu7(SslCertificate sslCertificate) {
        return axPpu7(mSJXQ1(sslCertificate));
    }

    public static String axPpu7(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            return null;
        }
        try {
            return eu0207(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateEncodingException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String eu0207(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 3);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = numX49.tnTj78("bHMf") + hexString;
            } else if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb2.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb2.append(':');
            }
        }
        return sb2.toString();
    }

    public static X509Certificate mSJXQ1(SslCertificate sslCertificate) {
        byte[] byteArray;
        if (sslCertificate == null || (byteArray = SslCertificate.saveState(sslCertificate).getByteArray(numX49.tnTj78("bHM1"))) == null || byteArray.length == 0) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private static String zMmdx0() {
        return j3sby1.class.getSimpleName();
    }
}
