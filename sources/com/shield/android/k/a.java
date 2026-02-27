package com.shield.android.k;

import We.s;
import android.util.Log;
import com.shield.android.internal.i;
import com.shield.android.j.d;
import com.shield.android.j.h;
import com.shield.android.r.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private static a pA;
    private final String pB;
    private final boolean pC;

    /* JADX INFO: renamed from: com.shield.android.k.a$a, reason: collision with other inner class name */
    public static class C0075a {
        private byte[] oU;
        public final X509Certificate pD;
        private h pE;
        private h pF;
        private int pG;

        public C0075a(X509Certificate x509Certificate, h hVar, h hVar2, byte[] bArr, int i) {
            this.pD = x509Certificate;
            this.pE = hVar;
            this.pF = hVar2;
            this.oU = bArr;
            this.pG = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0075a)) {
                return false;
            }
            C0075a c0075a = (C0075a) obj;
            return this.pD.equals(c0075a.pD) && this.pE == c0075a.pE && this.pF == c0075a.pF && Arrays.equals(this.oU, c0075a.oU) && this.pG == c0075a.pG;
        }

        public final int hashCode() {
            X509Certificate x509Certificate = this.pD;
            int iHashCode = ((x509Certificate == null ? 0 : x509Certificate.hashCode()) + 31) * 31;
            h hVar = this.pE;
            int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            h hVar2 = this.pF;
            return ((Arrays.hashCode(this.oU) + ((iHashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31)) * 31) + this.pG;
        }
    }

    private a(String str) {
        if (i.a(str)) {
            this.pB = "Shield";
        } else {
            this.pB = str;
        }
        this.pC = false;
    }

    public static a K(String str) {
        a aVar = pA;
        if (aVar == null || !aVar.pB.equals(str)) {
            pA = new a(str);
        }
        return pA;
    }

    public static a dL() {
        a aVar = pA;
        if (aVar == null || !aVar.pB.equals("Shield")) {
            pA = new a("Shield");
        }
        return pA;
    }

    public static List<C0075a> m(ByteBuffer byteBuffer) throws IOException {
        f fVar;
        ArrayList arrayList = new ArrayList();
        f fVar2 = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        d.j(byteBuffer);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int i = 0;
            try {
                try {
                    if (byteBuffer.getInt() != 1) {
                        throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                    }
                    HashSet hashSet = new HashSet();
                    int i4 = 0;
                    while (byteBuffer.hasRemaining()) {
                        i++;
                        ByteBuffer byteBufferK = d.k(byteBuffer);
                        ByteBuffer byteBufferK2 = d.k(byteBufferK);
                        int i6 = byteBufferK.getInt();
                        int i10 = byteBufferK.getInt();
                        h hVarM = h.m(i4);
                        byte[] bArrL = d.l(byteBufferK);
                        if (fVar2 != null) {
                            String strEt = hVarM.dI().et();
                            AlgorithmParameterSpec algorithmParameterSpecEu = hVarM.dI().eu();
                            PublicKey publicKey = fVar2.getPublicKey();
                            fVar = fVar2;
                            Signature signature = Signature.getInstance(strEt);
                            signature.initVerify(publicKey);
                            if (algorithmParameterSpecEu != null) {
                                signature.setParameter(algorithmParameterSpecEu);
                            }
                            signature.update(byteBufferK2);
                            if (!signature.verify(bArrL)) {
                                throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strEt + " when verifying SourceStampCertificateLineage object");
                            }
                        } else {
                            fVar = fVar2;
                        }
                        byteBufferK2.rewind();
                        byte[] bArrL2 = d.l(byteBufferK2);
                        int i11 = byteBufferK2.getInt();
                        if (fVar != null && i4 != i11) {
                            throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferK + " when verifying SourceStampCertificateLineage object");
                        }
                        f fVar3 = new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrL2)), bArrL2);
                        if (hashSet.contains(fVar3)) {
                            throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                        }
                        hashSet.add(fVar3);
                        arrayList.add(new C0075a(fVar3, h.m(i11), h.m(i10), bArrL, i6));
                        fVar2 = fVar3;
                        i4 = i10;
                    }
                    return arrayList;
                } catch (com.shield.android.i.a | BufferUnderflowException e) {
                    throw new IOException("Failed to parse SourceStampCertificateLineage object", e);
                }
            } catch (InvalidAlgorithmParameterException e7) {
                e = e7;
                throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (InvalidKeyException e10) {
                e = e10;
                throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (SignatureException e12) {
                e = e12;
                throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (CertificateException e13) {
                throw new SecurityException(s.g(0, "Failed to decode certificate #", " when parsing SourceStampCertificateLineage object"), e13);
            }
        } catch (CertificateException e14) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e14);
        }
    }

    public void a(String str, Object... objArr) {
    }

    public void b(String str, Object... objArr) {
    }

    public void a(Throwable th2) {
    }

    public void a(Throwable th2, String str, Object... objArr) {
    }

    public void a(boolean z4, String str, Object... objArr) {
        Log.i(this.pB, String.format(str, objArr));
    }

    public void a(boolean z4, Throwable th2, String str, Object... objArr) {
        Log.e(this.pB, String.format(str, objArr), th2);
    }
}
