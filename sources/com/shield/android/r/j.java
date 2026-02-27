package com.shield.android.r;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static volatile CertificateFactory rL;
    private static byte[] rM = "-----BEGIN CERTIFICATE-----".getBytes();
    private static byte[] rN = "-----END CERTIFICATE-----".getBytes();

    public static X509Certificate a(byte[] bArr, CertificateFactory certificateFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (com.shield.android.p.c | com.shield.android.p.e | CertificateException e) {
                throw new CertificateException("Failed to parse certificate", e);
            }
        } catch (CertificateException unused) {
            ByteBuffer byteBufferX = x(ByteBuffer.wrap(bArr));
            int iPosition = byteBufferX.position();
            X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(com.shield.android.p.d.a((com.shield.android.s.a) com.shield.android.p.a.a(byteBufferX, com.shield.android.s.a.class))));
            byte[] bArr2 = new byte[byteBufferX.position() - iPosition];
            byteBufferX.position(iPosition);
            byteBufferX.get(bArr2);
            return new f(x509Certificate, bArr2);
        }
    }

    private static synchronized void ew() {
        if (rL != null) {
            return;
        }
        try {
            rL = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
        }
    }

    public static X509Certificate h(byte[] bArr) throws CertificateException {
        if (rL == null) {
            ew();
        }
        return a(bArr, rL);
    }

    private static ByteBuffer x(ByteBuffer byteBuffer) throws CertificateException {
        char c;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        if (byteBuffer.remaining() < rM.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        for (int i = 0; i < rM.length; i++) {
            if (byteBuffer.get() != rM[i]) {
                byteBuffer.reset();
                return byteBuffer;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) byteBuffer.get()) != '-') {
            if (!Character.isWhitespace(c)) {
                sb2.append(c);
            }
        }
        for (int i4 = 1; i4 < rN.length; i4++) {
            if (!byteBuffer.hasRemaining()) {
                throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
            }
            if (byteBuffer.get() != rN[i4]) {
                throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
            }
        }
        byte[] bArrDecode = Base64.getDecoder().decode(sb2.toString());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
            iPosition++;
        }
        byteBuffer.position(iPosition);
        return ByteBuffer.wrap(bArrDecode);
    }
}
