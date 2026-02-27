package com.shield.android.r;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {
    private final byte[] rC;
    private int rD;

    public f(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.rD = -1;
        this.rC = bArr != null ? (byte[]) bArr.clone() : null;
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // com.shield.android.r.d, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        byte[] bArr = this.rC;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (this.rD == -1) {
            try {
                this.rD = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.rD = 0;
            }
        }
        return this.rD;
    }
}
