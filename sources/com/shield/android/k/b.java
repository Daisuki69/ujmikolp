package com.shield.android.k;

import com.shield.android.j.d;
import com.shield.android.j.e;
import com.shield.android.j.g;
import com.shield.android.j.h;
import com.shield.android.k.a;
import com.shield.android.r.f;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    public static void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, com.shield.android.j.b bVar, Map<Integer, byte[]> map, byte[] bArr, int i, int i4) throws NoSuchAlgorithmException, com.shield.android.i.a {
        int i6;
        X509Certificate x509CertificateA = a(byteBuffer, certificateFactory, bArr, bVar);
        if (bVar.dl() || bVar.cP()) {
            return;
        }
        ByteBuffer byteBufferK = d.k(byteBuffer);
        HashMap map2 = new HashMap();
        while (byteBufferK.hasRemaining()) {
            ByteBuffer byteBufferK2 = d.k(byteBufferK);
            int i10 = byteBufferK2.getInt();
            map2.put(Integer.valueOf(i10), d.k(byteBufferK2));
        }
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            if (entry.getKey().intValue() == 31) {
                i6 = i;
            } else {
                if (!map2.containsKey(entry.getKey())) {
                    bVar.a(17, new Object[0]);
                    return;
                }
                int i11 = i;
                int i12 = i4;
                com.shield.android.j.b bVar2 = bVar;
                a(entry.getValue(), i11, i12, x509CertificateA, (ByteBuffer) map2.get(entry.getKey()), bVar2);
                i6 = i11;
                X509Certificate x509Certificate = x509CertificateA;
                if (bVar2.dl() || bVar2.cP()) {
                    return;
                }
                i4 = i12;
                x509CertificateA = x509Certificate;
                bVar = bVar2;
            }
            i = i6;
        }
        X509Certificate x509Certificate2 = x509CertificateA;
        int i13 = i;
        com.shield.android.j.b bVar3 = bVar;
        int i14 = i4;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferK3 = d.k(byteBuffer);
            ByteBuffer byteBufferK4 = d.k(byteBuffer);
            byte[] bArr2 = new byte[byteBufferK3.remaining()];
            byteBufferK3.get(bArr2);
            byteBufferK3.flip();
            a(bArr2, i13, i14, x509Certificate2, byteBufferK4, bVar3);
            if (bVar3.cP() || bVar3.dl()) {
                return;
            }
            a(byteBufferK3, x509Certificate2, bVar3);
        }
    }

    private static X509Certificate a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, byte[] bArr, com.shield.android.j.b bVar) throws NoSuchAlgorithmException, com.shield.android.i.a {
        byte[] bArrL = d.l(byteBuffer);
        try {
            f fVar = new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrL)), bArrL);
            bVar.f15435od.add(fVar);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrL);
            byte[] bArrDigest = messageDigest.digest();
            if (Arrays.equals(bArr, bArrDigest)) {
                return fVar;
            }
            bVar.a(27, d.f(bArrDigest), d.f(bArr));
            return null;
        } catch (CertificateException e) {
            bVar.a(18, e);
            return null;
        }
    }

    private static void a(byte[] bArr, int i, int i4, X509Certificate x509Certificate, ByteBuffer byteBuffer, com.shield.android.j.b bVar) {
        ArrayList<e> arrayList = new ArrayList(1);
        int i6 = 0;
        while (byteBuffer.hasRemaining()) {
            i6++;
            try {
                ByteBuffer byteBufferK = d.k(byteBuffer);
                int i10 = byteBufferK.getInt();
                byte[] bArrL = d.l(byteBufferK);
                h hVarM = h.m(i10);
                if (hVarM == null) {
                    bVar.b(19, Integer.valueOf(i10));
                } else {
                    arrayList.add(new e(hVarM, bArrL));
                }
            } catch (com.shield.android.i.a | BufferUnderflowException unused) {
                bVar.a(20, Integer.valueOf(i6));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            bVar.a(17, new Object[0]);
            return;
        }
        try {
            for (e eVar : d.a(arrayList, i, i4, true)) {
                h hVar = eVar.oT;
                String strEt = hVar.dI().et();
                AlgorithmParameterSpec algorithmParameterSpecEu = hVar.dI().eu();
                PublicKey publicKey = x509Certificate.getPublicKey();
                try {
                    Signature signature = Signature.getInstance(strEt);
                    signature.initVerify(publicKey);
                    if (algorithmParameterSpecEu != null) {
                        signature.setParameter(algorithmParameterSpecEu);
                    }
                    signature.update(bArr);
                    if (!signature.verify(eVar.oU)) {
                        bVar.a(21, hVar);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException e) {
                    e = e;
                    bVar.a(22, hVar, e);
                    return;
                } catch (InvalidKeyException e7) {
                    e = e7;
                    bVar.a(22, hVar, e);
                    return;
                } catch (NoSuchAlgorithmException e10) {
                    e = e10;
                    bVar.a(22, hVar, e);
                    return;
                } catch (SignatureException e11) {
                    e = e11;
                    bVar.a(22, hVar, e);
                    return;
                }
            }
        } catch (g e12) {
            StringBuilder sb2 = new StringBuilder();
            for (e eVar2 : arrayList) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(eVar2.oT);
            }
            bVar.a(26, sb2.toString(), e12);
        }
    }

    private static void a(ByteBuffer byteBuffer, X509Certificate x509Certificate, com.shield.android.j.b bVar) throws com.shield.android.i.a {
        ByteBuffer byteBufferK = d.k(byteBuffer);
        int i = 0;
        while (byteBufferK.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferK2 = d.k(byteBufferK);
                int i4 = byteBufferK2.getInt();
                byte[] bArr = new byte[byteBufferK2.remaining()];
                byteBufferK2.get(bArr);
                if (i4 == -1654455305) {
                    try {
                        List<a.C0075a> listM = a.m(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
                        for (int i6 = 0; i6 < listM.size(); i6++) {
                            bVar.oe.add(listM.get(i6).pD);
                        }
                        List<X509Certificate> list = bVar.oe;
                        if (!x509Certificate.equals(list.get(list.size() - 1))) {
                            bVar.a(34, new Object[0]);
                        }
                    } catch (IllegalArgumentException unused) {
                        bVar.a(34, new Object[0]);
                    } catch (SecurityException unused2) {
                        bVar.a(35, new Object[0]);
                    } catch (Exception unused3) {
                        bVar.a(33, new Object[0]);
                    }
                } else if (i4 == -465807034) {
                    long j = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getLong();
                    if (j > 0) {
                        bVar.f15434oc = j;
                    } else {
                        bVar.a(38, Long.valueOf(j));
                    }
                } else {
                    bVar.b(32, Integer.valueOf(i4));
                }
            } catch (com.shield.android.i.a | BufferUnderflowException unused4) {
                bVar.a(31, Integer.valueOf(i));
                return;
            }
        }
    }
}
