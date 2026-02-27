package com.shield.android.n;

import com.shield.android.h.b;
import com.shield.android.i.c;
import com.shield.android.j.c;
import com.shield.android.j.f;
import com.shield.android.j.h;
import com.shield.android.r.j;
import com.shield.android.u.c;
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
import java.util.OptionalInt;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private final c pJ;
    private final com.shield.android.u.b pK;
    private final c.b pL;
    private final c.e pM;
    private final Set<f> pN;
    private final int pO;
    private final int pP;
    private final int pQ;
    private final OptionalInt pR;
    private final boolean pS;
    private ByteBuffer pT;

    /* JADX INFO: renamed from: com.shield.android.n.a$a, reason: collision with other inner class name */
    public static class C0076a {
        private int jZ;

        /* JADX INFO: renamed from: nk, reason: collision with root package name */
        private int f15461nk;
        private com.shield.android.u.b pK;
        private c.b pL;
        private c.e pM;
        private Set<f> pN;
        private ByteBuffer pT;
        private com.shield.android.u.c pJ = com.shield.android.u.c.sl;
        private int pQ = -262969152;
        private boolean pS = true;
        private OptionalInt pR = OptionalInt.empty();

        public C0076a(com.shield.android.u.b bVar, c.b bVar2, int i, int i4) {
            this.pK = bVar;
            this.pL = bVar2;
            this.f15461nk = i;
            this.jZ = i4;
        }

        public final C0076a a(com.shield.android.u.c cVar) {
            this.pJ = cVar;
            return this;
        }

        public final a dO() {
            int i;
            int i4 = this.pQ;
            if (i4 == -262969152) {
                this.f15461nk = Math.max(this.f15461nk, 28);
                i = 3;
            } else {
                if (i4 != 462663009) {
                    throw new IllegalArgumentException(String.format("Unsupported APK Signature Scheme V3 block ID: 0x%08x", Integer.valueOf(this.pQ)));
                }
                this.f15461nk = this.jZ;
                i = 31;
            }
            if (this.pM == null) {
                this.pM = new c.e(i);
            }
            if (this.pN == null) {
                this.pN = new HashSet(1);
            }
            a aVar = new a(this.pJ, this.pK, this.pL, this.pN, this.pM, this.f15461nk, this.jZ, this.pQ, this.pR, this.pS, (byte) 0);
            ByteBuffer byteBuffer = this.pT;
            if (byteBuffer != null) {
                aVar.pT = byteBuffer;
            }
            return aVar;
        }

        public final C0076a o(int i) {
            this.pQ = i;
            return this;
        }

        public final C0076a p(int i) {
            this.pR = OptionalInt.of(i);
            return this;
        }
    }

    public /* synthetic */ a(com.shield.android.u.c cVar, com.shield.android.u.b bVar, c.b bVar2, Set set, c.e eVar, int i, int i4, int i6, OptionalInt optionalInt, boolean z4, byte b8) {
        this(cVar, bVar, bVar2, set, eVar, i, i4, i6, optionalInt, z4);
    }

    private c.e dN() throws NoSuchAlgorithmException, c.f, IOException {
        try {
            if (this.pT == null) {
                this.pT = com.shield.android.j.c.a(this.pK, this.pL, this.pQ).pv;
            }
            ByteBuffer byteBufferK = com.shield.android.j.c.k(this.pT);
            if (!byteBufferK.hasRemaining()) {
                this.pM.c(b.c.ln, new Object[0]);
                return this.pM;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                int i = 0;
                while (byteBufferK.hasRemaining()) {
                    int i4 = i + 1;
                    c.e.a aVar = new c.e.a();
                    aVar.ob = i;
                    this.pM.oy.add(aVar);
                    try {
                        a(com.shield.android.j.c.k(byteBufferK), certificateFactory, aVar);
                        i = i4;
                    } catch (com.shield.android.i.a | BufferUnderflowException unused) {
                        aVar.e(b.c.f15382lh, new Object[0]);
                        return this.pM;
                    }
                }
                return this.pM;
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e);
            }
        } catch (com.shield.android.i.a unused2) {
            this.pM.c(b.c.f15381lg, new Object[0]);
            return this.pM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n(int i) {
        return i == -1029262406;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        r15.pM.c(com.shield.android.h.b.c.lH, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.shield.android.j.c.e dM() throws com.shield.android.j.c.f, java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.n.a.dM():com.shield.android.j.c$e");
    }

    private a(com.shield.android.u.c cVar, com.shield.android.u.b bVar, c.b bVar2, Set<f> set, c.e eVar, int i, int i4, int i6, OptionalInt optionalInt, boolean z4) {
        this.pJ = cVar;
        this.pK = bVar;
        this.pL = bVar2;
        this.pN = set;
        this.pM = eVar;
        this.pO = i;
        this.pP = i4;
        this.pQ = i6;
        this.pR = optionalInt;
        this.pS = z4;
    }

    private void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, c.e.a aVar) throws NoSuchAlgorithmException, com.shield.android.i.a {
        byte[] encoded;
        ByteBuffer byteBufferK = com.shield.android.j.c.k(byteBuffer);
        byteBufferK.get(new byte[byteBufferK.remaining()]);
        byteBufferK.flip();
        int i = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        aVar.oG = i;
        aVar.oH = i4;
        if (i < 0 || i > i4) {
            aVar.e(b.c.lu, Integer.valueOf(i), Integer.valueOf(i4));
        }
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
                    aVar.f(b.c.lr, Integer.valueOf(i10));
                } else {
                    arrayList.add(new c.g(hVarM, bArrL2));
                }
            } catch (com.shield.android.i.a | BufferUnderflowException unused) {
                aVar.e(b.c.f15385lk, Integer.valueOf(i6));
                return;
            }
        }
        if (aVar.oD.isEmpty()) {
            aVar.e(b.c.lw, new Object[0]);
            return;
        }
        try {
            for (c.g gVar : com.shield.android.j.c.a(arrayList, aVar.oG, aVar.oH)) {
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
                            aVar.e(b.c.lv, hVar);
                            return;
                        } else {
                            aVar.oE.put(hVar, bArr);
                            this.pN.add(hVar.dG());
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        aVar.e(b.c.lt, hVar, e);
                        return;
                    } catch (InvalidKeyException e7) {
                        e = e7;
                        aVar.e(b.c.lt, hVar, e);
                        return;
                    } catch (SignatureException e10) {
                        e = e10;
                        aVar.e(b.c.lt, hVar, e);
                        return;
                    }
                } catch (Exception e11) {
                    aVar.e(b.c.f15383li, e11);
                    return;
                }
            }
            byteBufferK.position(0);
            ByteBuffer byteBufferK4 = com.shield.android.j.c.k(byteBufferK);
            ByteBuffer byteBufferK5 = com.shield.android.j.c.k(byteBufferK);
            int i11 = byteBufferK.getInt();
            if (i11 != i) {
                aVar.e(b.c.lz, Integer.valueOf(i), Integer.valueOf(i11));
            }
            int i12 = byteBufferK.getInt();
            if (i12 != i4) {
                aVar.e(b.c.lA, Integer.valueOf(i4), Integer.valueOf(i12));
            }
            ByteBuffer byteBufferK6 = com.shield.android.j.c.k(byteBufferK);
            int i13 = -1;
            while (byteBufferK5.hasRemaining()) {
                int i14 = i13 + 1;
                byte[] bArrL3 = com.shield.android.j.c.l(byteBufferK5);
                try {
                    aVar.f15435od.add(new com.shield.android.r.f(j.a(bArrL3, certificateFactory), bArrL3));
                    i13 = i14;
                } catch (CertificateException e12) {
                    aVar.e(b.c.f15384lj, Integer.valueOf(i14), Integer.valueOf(i13 + 2), e12);
                    return;
                }
            }
            if (aVar.f15435od.isEmpty()) {
                aVar.e(b.c.ly, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = aVar.f15435od.get(0);
            try {
                encoded = com.shield.android.j.c.a(x509Certificate.getPublicKey());
            } catch (InvalidKeyException unused2) {
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(bArrL, encoded)) {
                aVar.e(b.c.lB, com.shield.android.j.c.f(encoded), com.shield.android.j.c.f(bArrL));
                return;
            }
            int i15 = 0;
            while (byteBufferK4.hasRemaining()) {
                i15++;
                try {
                    ByteBuffer byteBufferK7 = com.shield.android.j.c.k(byteBufferK4);
                    aVar.oB.add(new c.e.a.b(byteBufferK7.getInt(), com.shield.android.j.c.l(byteBufferK7)));
                } catch (com.shield.android.i.a | BufferUnderflowException unused3) {
                    aVar.e(b.c.ll, Integer.valueOf(i15));
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
                aVar.e(b.c.lC, arrayList2, arrayList3);
                return;
            }
            int i16 = 0;
            boolean z4 = false;
            while (byteBufferK6.hasRemaining()) {
                i16++;
                try {
                    ByteBuffer byteBufferK8 = com.shield.android.j.c.k(byteBufferK6);
                    int i17 = byteBufferK8.getInt();
                    byte[] bArr2 = new byte[byteBufferK8.remaining()];
                    byteBufferK8.get(bArr2);
                    aVar.oF.add(new c.e.a.C0073a(i17, bArr2));
                    if (i17 == 1000370060) {
                        try {
                            com.shield.android.h.c cVarE = com.shield.android.h.c.e(bArr2);
                            aVar.ox = cVarE;
                            if (aVar.ox.cZ() != cVarE.a(aVar.f15435od.get(0)).cZ()) {
                                aVar.e(b.c.lG, new Object[0]);
                            }
                        } catch (IllegalArgumentException unused4) {
                            aVar.e(b.c.lG, new Object[0]);
                        } catch (SecurityException unused5) {
                            aVar.e(b.c.lE, new Object[0]);
                        } catch (Exception unused6) {
                            aVar.e(b.c.lF, new Object[0]);
                        }
                    } else if (i17 == 1436519170) {
                        if (this.pP >= 33 && this.pS) {
                            int i18 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                            if (this.pR.isPresent()) {
                                int asInt = this.pR.getAsInt();
                                if (i18 != asInt) {
                                    aVar.e(b.c.lL, Integer.valueOf(i18), Integer.valueOf(asInt));
                                }
                            } else {
                                aVar.e(b.c.lK, Integer.valueOf(i18));
                            }
                        }
                        z4 = true;
                    } else if (i17 == -1029262406) {
                        if (this.pQ != 462663009) {
                            aVar.f(b.c.lO, new Object[0]);
                        }
                    } else {
                        aVar.f(b.c.ls, Integer.valueOf(i17));
                    }
                } catch (com.shield.android.i.a | BufferUnderflowException unused7) {
                    aVar.e(b.c.lm, Integer.valueOf(i16));
                    return;
                }
            }
            if (this.pS && this.pR.isPresent() && !z4) {
                aVar.f(b.c.lM, Integer.valueOf(this.pR.getAsInt()));
            }
        } catch (c.d unused8) {
            aVar.e(b.c.lx, new Object[0]);
        }
    }
}
