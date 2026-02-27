package com.shield.android.n;

import We.s;
import android.content.SharedPreferences;
import com.shield.android.ShieldCallback;
import com.shield.android.f.h;
import com.shield.android.internal.d;
import com.shield.android.j.c;
import com.shield.android.r.f;
import com.shield.android.r.j;
import dOYHB6.yFtIp6.svM7M6;
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
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class b implements h {
    private final SharedPreferences pU;
    private final boolean pV;

    public static class a {
        private byte[] oU;
        private com.shield.android.j.h pE;
        public com.shield.android.j.h pF;
        private int pG;
        public final X509Certificate pW;

        public a(X509Certificate x509Certificate, com.shield.android.j.h hVar, com.shield.android.j.h hVar2, byte[] bArr, int i) {
            this.pW = x509Certificate;
            this.pE = hVar;
            this.pF = hVar2;
            this.oU = bArr;
            this.pG = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.pW.equals(aVar.pW) && this.pE == aVar.pE && this.pF == aVar.pF && Arrays.equals(this.oU, aVar.oU) && this.pG == aVar.pG;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.oU) + (Objects.hash(this.pW, this.pE, this.pF, Integer.valueOf(this.pG)) * 31);
        }
    }

    public b(SharedPreferences sharedPreferences, boolean z4) {
        this.pU = sharedPreferences;
        this.pV = z4;
    }

    public static List<a> m(ByteBuffer byteBuffer) throws IOException {
        ArrayList arrayList = new ArrayList();
        f fVar = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        c.j(byteBuffer);
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
                    ByteBuffer byteBufferK = c.k(byteBuffer);
                    ByteBuffer byteBufferK2 = c.k(byteBufferK);
                    int i6 = byteBufferK.getInt();
                    int i10 = byteBufferK.getInt();
                    com.shield.android.j.h hVarM = com.shield.android.j.h.m(i4);
                    byte[] bArrL = c.l(byteBufferK);
                    if (fVar != null) {
                        String strEt = hVarM.dI().et();
                        AlgorithmParameterSpec algorithmParameterSpecEu = hVarM.dI().eu();
                        PublicKey publicKey = fVar.getPublicKey();
                        Signature signature = Signature.getInstance(strEt);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpecEu != null) {
                            signature.setParameter(algorithmParameterSpecEu);
                        }
                        signature.update(byteBufferK2);
                        if (!signature.verify(bArrL)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strEt + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    byteBufferK2.rewind();
                    byte[] bArrL2 = c.l(byteBufferK2);
                    int i11 = byteBufferK2.getInt();
                    if (fVar != null && i4 != i11) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferK + " when verifying V3SigningCertificateLineage object");
                    }
                    f fVar2 = new f(j.h(bArrL2), bArrL2);
                    if (hashSet.contains(fVar2)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(fVar2);
                    arrayList.add(new a(fVar2, com.shield.android.j.h.m(i11), com.shield.android.j.h.m(i10), bArrL, i6));
                    fVar = fVar2;
                    i4 = i10;
                }
                return arrayList;
            } catch (com.shield.android.i.a | BufferUnderflowException e) {
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            }
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (SignatureException e12) {
            e = e12;
            throw new SecurityException(s.g(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (CertificateException e13) {
            throw new SecurityException(s.g(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e13);
        }
    }

    @Override // com.shield.android.f.h
    public void c(ShieldCallback<d> shieldCallback) {
        String str = "";
        boolean z4 = this.pV;
        String str2 = z4 ? "fallback_endpoint" : "endpoint";
        String str3 = z4 ? "fallback_version" : "version";
        try {
            String string = svM7M6.getString(this.pU, str2, "");
            String string2 = svM7M6.getString(this.pU, str3, "");
            if (string != null) {
                str = string;
            }
            if (string2 == null) {
                string2 = "0";
            }
            shieldCallback.onSuccess(new d(str, string2));
        } catch (Exception unused) {
        }
    }
}
