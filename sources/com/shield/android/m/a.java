package com.shield.android.m;

import com.shield.android.h.b;
import com.shield.android.i.c;
import com.shield.android.j.c;
import com.shield.android.j.f;
import com.shield.android.j.h;
import com.shield.android.j.i;
import com.shield.android.r.j;
import com.shield.android.u.b;
import java.io.IOException;
import java.nio.BufferUnderflowException;
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
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static c.e a(com.shield.android.u.c cVar, b bVar, c.b bVar2, Map<Integer, String> map, Set<Integer> set, int i, int i4) throws NoSuchAlgorithmException, c.f, IOException, com.shield.android.i.a {
        c.e eVar = new c.e(2);
        i iVarA = com.shield.android.j.c.a(bVar, bVar2, 1896449818);
        b bVarB = bVar.b(0L, iVarA.pw);
        long j = iVarA.px;
        b bVarB2 = bVar.b(j, iVarA.py - j);
        ByteBuffer byteBuffer = iVarA.pz;
        ByteBuffer byteBuffer2 = iVarA.pv;
        HashSet hashSet = new HashSet(1);
        a(byteBuffer2, hashSet, map, set, i, i4, eVar);
        if (!eVar.cP()) {
            com.shield.android.j.c.a(cVar, bVarB, bVarB2, byteBuffer, hashSet, eVar);
            if (!eVar.cP()) {
                eVar.nI = true;
            }
        }
        return eVar;
    }

    private static void a(ByteBuffer byteBuffer, Set<f> set, Map<Integer, String> map, Set<Integer> set2, int i, int i4, c.e eVar) throws NoSuchAlgorithmException {
        try {
            ByteBuffer byteBufferK = com.shield.android.j.c.k(byteBuffer);
            if (!byteBufferK.hasRemaining()) {
                eVar.c(b.c.kV, new Object[0]);
                return;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                int i6 = 0;
                while (byteBufferK.hasRemaining()) {
                    int i10 = i6 + 1;
                    c.e.a aVar = new c.e.a();
                    aVar.ob = i6;
                    eVar.oy.add(aVar);
                    try {
                        a(com.shield.android.j.c.k(byteBufferK), certificateFactory, aVar, set, map, set2, i, i4);
                        i6 = i10;
                    } catch (com.shield.android.i.a | BufferUnderflowException unused) {
                        aVar.e(b.c.kM, new Object[0]);
                        return;
                    }
                }
                if (i6 > 10) {
                    eVar.c(b.c.kU, 10, Integer.valueOf(i6));
                }
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e);
            }
        } catch (com.shield.android.i.a unused2) {
            eVar.c(b.c.kL, new Object[0]);
        }
    }

    private static void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, c.e.a aVar, Set<f> set, Map<Integer, String> map, Set<Integer> set2, int i, int i4) throws NoSuchAlgorithmException, com.shield.android.i.a {
        byte[] encoded;
        ByteBuffer byteBufferK = com.shield.android.j.c.k(byteBuffer);
        byteBufferK.get(new byte[byteBufferK.remaining()]);
        byteBufferK.flip();
        ByteBuffer byteBufferK2 = com.shield.android.j.c.k(byteBuffer);
        byte[] bArrL = com.shield.android.j.c.l(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i6 = 0;
        while (byteBufferK2.hasRemaining()) {
            i6++;
            try {
                ByteBuffer byteBufferK3 = com.shield.android.j.c.k(byteBufferK2);
                int i10 = byteBufferK3.getInt();
                byte[] bArrL2 = com.shield.android.j.c.l(byteBufferK3);
                aVar.oD.add(new c.e.a.C0074c(i10, bArrL2));
                h hVarM = h.m(i10);
                if (hVarM == null) {
                    aVar.f(b.c.kW, Integer.valueOf(i10));
                } else {
                    arrayList.add(new c.g(hVarM, bArrL2));
                }
            } catch (com.shield.android.i.a | BufferUnderflowException unused) {
                aVar.e(b.c.kP, Integer.valueOf(i6));
                return;
            }
        }
        if (aVar.oD.isEmpty()) {
            aVar.e(b.c.la, new Object[0]);
            return;
        }
        try {
            for (c.g gVar : com.shield.android.j.c.a(arrayList, i, i4)) {
                h hVar = gVar.oT;
                String strEt = hVar.dI().et();
                AlgorithmParameterSpec algorithmParameterSpecEu = hVar.dI().eu();
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(hVar.dH()).generatePublic(new X509EncodedKeySpec(bArrL));
                    try {
                        Signature signature = Signature.getInstance(strEt);
                        signature.initVerify(publicKeyGeneratePublic);
                        if (algorithmParameterSpecEu != null) {
                            signature.setParameter(algorithmParameterSpecEu);
                        }
                        byteBufferK.position(0);
                        signature.update(byteBufferK);
                        byte[] bArr = gVar.oU;
                        if (!signature.verify(bArr)) {
                            aVar.e(b.c.kZ, hVar);
                            return;
                        } else {
                            aVar.oE.put(hVar, bArr);
                            set.add(hVar.dG());
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        aVar.e(b.c.kY, hVar, e);
                        return;
                    } catch (InvalidKeyException e7) {
                        e = e7;
                        aVar.e(b.c.kY, hVar, e);
                        return;
                    } catch (SignatureException e10) {
                        e = e10;
                        aVar.e(b.c.kY, hVar, e);
                        return;
                    }
                } catch (Exception e11) {
                    aVar.e(b.c.kN, e11);
                    return;
                }
            }
            byteBufferK.position(0);
            ByteBuffer byteBufferK4 = com.shield.android.j.c.k(byteBufferK);
            ByteBuffer byteBufferK5 = com.shield.android.j.c.k(byteBufferK);
            ByteBuffer byteBufferK6 = com.shield.android.j.c.k(byteBufferK);
            int i11 = -1;
            while (byteBufferK5.hasRemaining()) {
                int i12 = i11 + 1;
                byte[] bArrL3 = com.shield.android.j.c.l(byteBufferK5);
                try {
                    aVar.f15435od.add(new com.shield.android.r.f(j.a(bArrL3, certificateFactory), bArrL3));
                    i11 = i12;
                } catch (CertificateException e12) {
                    aVar.e(b.c.kO, Integer.valueOf(i12), Integer.valueOf(i11 + 2), e12);
                    return;
                }
            }
            if (aVar.f15435od.isEmpty()) {
                aVar.e(b.c.f15378lc, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = aVar.f15435od.get(0);
            try {
                encoded = com.shield.android.j.c.a(x509Certificate.getPublicKey());
            } catch (InvalidKeyException unused2) {
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(bArrL, encoded)) {
                aVar.e(b.c.ld, com.shield.android.j.c.f(encoded), com.shield.android.j.c.f(bArrL));
                return;
            }
            int i13 = 0;
            while (byteBufferK4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferK7 = com.shield.android.j.c.k(byteBufferK4);
                    aVar.oB.add(new c.e.a.b(byteBufferK7.getInt(), com.shield.android.j.c.l(byteBufferK7)));
                } catch (com.shield.android.i.a | BufferUnderflowException unused3) {
                    aVar.e(b.c.kQ, Integer.valueOf(i13));
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList(aVar.oD.size());
            Iterator<c.e.a.C0074c> it = aVar.oD.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().dA()));
            }
            ArrayList arrayList3 = new ArrayList(aVar.oB.size());
            Iterator<c.e.a.b> it2 = aVar.oB.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(it2.next().dy()));
            }
            if (!arrayList2.equals(arrayList3)) {
                aVar.e(b.c.f15379le, arrayList2, arrayList3);
                return;
            }
            Set<Integer> setKeySet = map.keySet();
            HashSet<Integer> hashSet = new HashSet(1);
            int i14 = 0;
            while (byteBufferK6.hasRemaining()) {
                i14++;
                try {
                    ByteBuffer byteBufferK8 = com.shield.android.j.c.k(byteBufferK6);
                    int i15 = byteBufferK8.getInt();
                    byte[] bArr2 = new byte[byteBufferK8.remaining()];
                    byteBufferK8.get(bArr2);
                    aVar.oF.add(new c.e.a.C0073a(i15, bArr2));
                    if (i15 != -1091571699) {
                        aVar.f(b.c.kX, Integer.valueOf(i15));
                    } else {
                        int i16 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        if (setKeySet.contains(Integer.valueOf(i16))) {
                            hashSet.add(Integer.valueOf(i16));
                        } else {
                            aVar.f(b.c.kS, Integer.valueOf(aVar.ob), Integer.valueOf(i16));
                        }
                    }
                } catch (com.shield.android.i.a | BufferUnderflowException unused4) {
                    aVar.e(b.c.kR, Integer.valueOf(i14));
                    return;
                }
            }
            for (Integer num : hashSet) {
                num.intValue();
                if (!set2.contains(num)) {
                    aVar.e(b.c.kT, Integer.valueOf(aVar.ob), (String) map.get(num));
                }
            }
        } catch (c.d e13) {
            aVar.e(b.c.f15377lb, e13);
        }
    }
}
