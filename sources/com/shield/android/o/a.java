package com.shield.android.o;

import com.shield.android.h.b;
import com.shield.android.j.c;
import com.shield.android.j.f;
import com.shield.android.j.h;
import com.shield.android.o.b;
import com.shield.android.r.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static c.e a(com.shield.android.u.b bVar, File file) throws NoSuchAlgorithmException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int iB = b.b(fileInputStream);
            if (iB != 2) {
                throw new IOException("Invalid signature version.");
            }
            b bVar2 = new b(iB, b.c(fileInputStream), b.c(fileInputStream));
            byte[] bArrC = b.c(fileInputStream);
            fileInputStream.close();
            c.e eVar = new c.e(4);
            int i = bVar2.pX;
            if (i != 2) {
                eVar.d(b.c.f15391mf, Integer.valueOf(i), 2);
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bVar2.pY).order(ByteOrder.LITTLE_ENDIAN);
            b.a aVar = new b.a(byteBufferOrder.getInt(), byteBufferOrder.get(), b.n(byteBufferOrder), b.n(byteBufferOrder));
            b.d dVarG = b.d.g(bVar2.pZ);
            b.C0077b c0077b = dVarG.ql;
            c.e.a aVarA = a(c0077b, b.a(bVar.es(), aVar, c0077b));
            eVar.oy.add(aVarA);
            if (!eVar.cP()) {
                b.c[] cVarArr = dVarG.qm;
                int length = cVarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        b.C0077b c0077bO = b.C0077b.o(ByteBuffer.wrap(cVarArr[i4].f15473qk).order(ByteOrder.LITTLE_ENDIAN));
                        eVar.oy.add(a(c0077bO, b.a(bVar.es(), aVar, c0077bO)));
                        if (eVar.cP()) {
                            break;
                        }
                        i4++;
                    } else {
                        byte[] bArr = aVar.qd;
                        c.h hVarB = c.b(bVar);
                        f fVar = hVarB.oO;
                        byte[] bArr2 = hVarB.oP;
                        byte[] bArr3 = hVarB.oQ;
                        if (!Arrays.equals(bArr, bArr2)) {
                            aVarA.e(b.c.f15386ma, fVar, c.f(bArr), c.f(bArr2));
                        } else if (bArrC == null || Arrays.equals(bArrC, bArr3)) {
                            aVarA.oC.put(fVar, bArr2);
                        } else {
                            aVarA.e(b.c.f15387mb, fVar, c.f(bArr), c.f(bArr2));
                        }
                        if (!eVar.cP()) {
                            eVar.nI = true;
                        }
                    }
                }
            }
            return eVar;
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static c.e.a a(b.C0077b c0077b, byte[] bArr) throws NoSuchAlgorithmException {
        byte[] encoded;
        c.e.a aVar = new c.e.a();
        aVar.ob = 0;
        int i = c0077b.f15471qi;
        byte[] bArr2 = c0077b.f15472qj;
        aVar.oD.add(new c.e.a.C0074c(i, bArr2));
        h hVarM = h.m(i);
        if (hVarM == null) {
            aVar.e(b.c.lR, Integer.valueOf(i));
            return aVar;
        }
        String strEt = hVarM.dI().et();
        AlgorithmParameterSpec algorithmParameterSpecEu = hVarM.dI().eu();
        String strDH = hVarM.dH();
        byte[] bArr3 = c0077b.qh;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strDH).generatePublic(new X509EncodedKeySpec(bArr3));
            try {
                Signature signature = Signature.getInstance(strEt);
                signature.initVerify(publicKeyGeneratePublic);
                if (algorithmParameterSpecEu != null) {
                    signature.setParameter(algorithmParameterSpecEu);
                }
                signature.update(bArr);
                if (!signature.verify(bArr2)) {
                    aVar.e(b.c.lU, hVarM);
                    return aVar;
                }
                aVar.oE.put(hVarM, bArr2);
                if (c0077b.f15469qf == null) {
                    aVar.e(b.c.lY, new Object[0]);
                    return aVar;
                }
                try {
                    com.shield.android.r.f fVar = new com.shield.android.r.f(j.h(c0077b.f15469qf), c0077b.f15469qf);
                    aVar.f15435od.add(fVar);
                    try {
                        encoded = c.a(fVar.getPublicKey());
                    } catch (InvalidKeyException unused) {
                        encoded = fVar.getPublicKey().getEncoded();
                    }
                    if (!Arrays.equals(bArr3, encoded)) {
                        aVar.e(b.c.lZ, c.f(encoded), c.f(bArr3));
                        return aVar;
                    }
                    aVar.oB.add(new c.e.a.b(0, c0077b.qe));
                    return aVar;
                } catch (CertificateException e) {
                    aVar.e(b.c.lX, e);
                    return aVar;
                }
            } catch (InvalidAlgorithmParameterException e7) {
                e = e7;
                aVar.e(b.c.lV, hVarM, e);
                return aVar;
            } catch (InvalidKeyException e10) {
                e = e10;
                aVar.e(b.c.lV, hVarM, e);
                return aVar;
            } catch (SignatureException e11) {
                e = e11;
                aVar.e(b.c.lV, hVarM, e);
                return aVar;
            }
        } catch (Exception e12) {
            aVar.e(b.c.lW, e12);
            return aVar;
        }
    }
}
