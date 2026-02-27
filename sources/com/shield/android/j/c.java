package com.shield.android.j;

import com.shield.android.h.b;
import com.shield.android.i.c;
import com.shield.android.j.a;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: oi, reason: collision with root package name */
    private static final com.shield.android.j.f[] f15439oi = {com.shield.android.j.f.CHUNKED_SHA512, com.shield.android.j.f.VERITY_CHUNKED_SHA256, com.shield.android.j.f.CHUNKED_SHA256};

    public static class a implements Runnable {
        private final C0072c oj;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private final List<b> f15440ok;
        private final List<MessageDigest> ol;
        private final com.shield.android.u.a om;

        public /* synthetic */ a(C0072c c0072c, List list, byte b8) {
            this(c0072c, list);
        }

        @Override // java.lang.Runnable
        public final void run() {
            byte[] bArr = new byte[5];
            bArr[0] = -91;
            try {
                C0072c.a aVar = this.oj.get();
                while (aVar != null) {
                    int i = aVar.ow;
                    if (i > 1048576) {
                        throw new RuntimeException("Chunk size greater than expected: " + i);
                    }
                    c.a(i, bArr, 1);
                    this.om.a(bArr, 0, 5);
                    this.om.v(aVar.ov);
                    for (int i4 = 0; i4 < this.f15440ok.size(); i4++) {
                        b bVar = this.f15440ok.get(i4);
                        int iDigest = this.ol.get(i4).digest(bVar.op, b.a(bVar, aVar.ou), bVar.oo);
                        if (iDigest != bVar.oo) {
                            throw new RuntimeException("Unexpected output size of " + bVar.on + " digest: " + iDigest);
                        }
                    }
                    aVar = this.oj.get();
                }
            } catch (IOException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (DigestException e7) {
                e = e7;
                throw new RuntimeException(e);
            }
        }

        private a(C0072c c0072c, List<b> list) {
            this.oj = c0072c;
            this.f15440ok = list;
            this.ol = new ArrayList(list.size());
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                try {
                    this.ol.add(b.a(it.next()));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            this.om = new com.shield.android.r.g((MessageDigest[]) this.ol.toArray(new MessageDigest[0]));
        }
    }

    public static class b {
        private final com.shield.android.j.f on;
        private final int oo;
        private final byte[] op;

        public /* synthetic */ b(com.shield.android.j.f fVar, int i, byte b8) {
            this(fVar, i);
        }

        public static /* synthetic */ MessageDigest a(b bVar) throws NoSuchAlgorithmException {
            return MessageDigest.getInstance(bVar.on.dD());
        }

        private b(com.shield.android.j.f fVar, int i) {
            this.on = fVar;
            int iDE = fVar.dE();
            this.oo = iDE;
            byte[] bArr = new byte[(iDE * i) + 5];
            this.op = bArr;
            bArr[0] = 90;
            c.a(i, bArr, 1);
        }

        public static /* synthetic */ int a(b bVar, int i) {
            return (i * bVar.oo) + 5;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.j.c$c, reason: collision with other inner class name */
    public static class C0072c implements Supplier<a> {
        private final com.shield.android.u.b[] oq;
        private final int[] or;
        private final int os;
        private final AtomicInteger ot;

        /* JADX INFO: renamed from: com.shield.android.j.c$c$a */
        public static class a {
            private final int ou;
            private final ByteBuffer ov;
            private final int ow;

            public /* synthetic */ a(int i, ByteBuffer byteBuffer, int i4, byte b8) {
                this(i, byteBuffer, i4);
            }

            private a(int i, ByteBuffer byteBuffer, int i4) {
                this.ou = i;
                this.ov = byteBuffer;
                this.ow = i4;
            }
        }

        public /* synthetic */ C0072c(com.shield.android.u.b[] bVarArr, byte b8) {
            this(bVarArr);
        }

        @Override // java.util.function.Supplier
        /* JADX INFO: renamed from: dw, reason: merged with bridge method [inline-methods] */
        public final a get() {
            com.shield.android.u.b[] bVarArr;
            int andIncrement = this.ot.getAndIncrement();
            if (andIncrement < 0 || andIncrement >= this.os) {
                return null;
            }
            long j = andIncrement;
            byte b8 = 0;
            int i = 0;
            while (true) {
                bVarArr = this.oq;
                if (i >= bVarArr.length) {
                    break;
                }
                int i4 = this.or[i];
                if (j < i4) {
                    break;
                }
                j -= (long) i4;
                i++;
            }
            long j6 = j * 1048576;
            int iMin = (int) Math.min(bVarArr[i].es() - j6, 1048576L);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin);
            try {
                this.oq[i].a(j6, iMin, byteBufferAllocate);
                byteBufferAllocate.rewind();
                return new a(andIncrement, byteBufferAllocate, iMin, b8);
            } catch (IOException e) {
                throw new IllegalStateException("Failed to read chunk", e);
            }
        }

        private C0072c(com.shield.android.u.b[] bVarArr) {
            this.oq = bVarArr;
            this.or = new int[bVarArr.length];
            int i = 0;
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                long jA = c.a(bVarArr[i4].es(), 1048576L);
                if (jA > 2147483647L) {
                    throw new RuntimeException(String.format("Number of chunks in dataSource[%d] is greater than max int.", Integer.valueOf(i4)));
                }
                this.or[i4] = (int) jA;
                i = (int) (((long) i) + jA);
            }
            this.os = i;
            this.ot = new AtomicInteger(0);
        }
    }

    public static class d extends com.shield.android.j.g {
        public d(String str) {
            super(str);
        }
    }

    public static class e extends a.AnonymousClass1 {
        private final List<b.d> oA;
        public com.shield.android.h.c ox;
        public final List<a> oy;
        private final List<b.d> oz;

        public static class a extends com.shield.android.j.b {
            public int oG;
            public int oH;
            public com.shield.android.h.c ox;
            public List<b> oB = new ArrayList();
            public Map<com.shield.android.j.f, byte[]> oC = new HashMap();
            public List<C0074c> oD = new ArrayList();
            public Map<com.shield.android.j.h, byte[]> oE = new HashMap();
            public List<C0073a> oF = new ArrayList();
            private final List<b.d> oI = new ArrayList();
            private final List<b.d> oJ = new ArrayList();

            /* JADX INFO: renamed from: com.shield.android.j.c$e$a$a, reason: collision with other inner class name */
            public static class C0073a {
                private final int oK;

                public C0073a(int i, byte[] bArr) throws CloneNotSupportedException {
                    this.oK = i;
                    bArr.clone();
                }

                public final int dx() {
                    return this.oK;
                }
            }

            public static class b {
                private final int oL;
                private final byte[] oM;

                public b(int i, byte[] bArr) {
                    this.oL = i;
                    this.oM = bArr;
                }

                public final int dy() {
                    return this.oL;
                }

                public final byte[] dz() {
                    return this.oM;
                }
            }

            /* JADX INFO: renamed from: com.shield.android.j.c$e$a$c, reason: collision with other inner class name */
            public static class C0074c {
                private final int oN;

                public C0074c(int i, byte[] bArr) {
                    this.oN = i;
                }

                public final int dA() {
                    return this.oN;
                }
            }

            @Override // com.shield.android.j.b
            public final boolean cP() {
                return !this.oJ.isEmpty();
            }

            @Override // com.shield.android.j.b
            public final boolean dl() {
                return !this.oI.isEmpty();
            }

            @Override // com.shield.android.j.b
            public final List<b.d> dm() {
                return this.oJ;
            }

            @Override // com.shield.android.j.b
            public final List<b.d> dn() {
                return this.oI;
            }

            public final void e(b.c cVar, Object... objArr) {
                this.oJ.add(new b.d(cVar, objArr));
            }

            public final void f(b.c cVar, Object... objArr) {
                this.oI.add(new b.d(cVar, objArr));
            }
        }

        public e(int i) {
            super(i);
            this.ox = null;
            this.oy = new ArrayList();
            this.oz = new ArrayList();
            this.oA = new ArrayList();
        }

        public final void c(b.c cVar, Object... objArr) {
            this.oA.add(new b.d(cVar, objArr));
        }

        @Override // com.shield.android.j.a.AnonymousClass1
        public final boolean cP() {
            if (!this.oA.isEmpty()) {
                return true;
            }
            if (this.oy.isEmpty()) {
                return false;
            }
            Iterator<a> it = this.oy.iterator();
            while (it.hasNext()) {
                if (it.next().cP()) {
                    return true;
                }
            }
            return false;
        }

        public final void d(b.c cVar, Object... objArr) {
            this.oz.add(new b.d(cVar, objArr));
        }

        @Override // com.shield.android.j.a.AnonymousClass1
        public final boolean dl() {
            if (!this.oz.isEmpty()) {
                return true;
            }
            if (this.oy.isEmpty()) {
                return false;
            }
            Iterator<a> it = this.oy.iterator();
            while (it.hasNext()) {
                if (it.next().dl()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.shield.android.j.a.AnonymousClass1
        public final List<b.d> dm() {
            return this.oA;
        }

        @Override // com.shield.android.j.a.AnonymousClass1
        public final List<b.d> dn() {
            return this.oz;
        }
    }

    public static class f extends Exception {
        public f(String str) {
            super(str);
        }
    }

    public static class g extends com.shield.android.j.e {
        public g(com.shield.android.j.h hVar, byte[] bArr) {
            super(hVar, bArr);
        }
    }

    public static class h {
        public final com.shield.android.j.f oO;
        public final byte[] oP;
        public final byte[] oQ;

        public h(com.shield.android.j.f fVar, byte[] bArr, byte[] bArr2) {
            this.oO = fVar;
            this.oP = bArr;
            this.oQ = bArr2;
        }
    }

    public static h b(com.shield.android.u.b bVar) throws NoSuchAlgorithmException, IOException {
        com.shield.android.j.f fVar = com.shield.android.j.f.VERITY_CHUNKED_SHA256;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(fVar.dE());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        com.shield.android.r.i iVar = new com.shield.android.r.i(null);
        try {
            ByteBuffer byteBufferD = iVar.d(bVar);
            byteBufferAllocate.put(iVar.w(byteBufferD));
            h hVar = new h(fVar, byteBufferAllocate.array(), byteBufferD.array());
            iVar.close();
            return hVar;
        } catch (Throwable th2) {
            try {
                iVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String f(byte[] bArr) {
        return com.shield.android.j.d.f(bArr);
    }

    public static void j(ByteBuffer byteBuffer) {
        com.shield.android.j.d.j(byteBuffer);
    }

    public static ByteBuffer k(ByteBuffer byteBuffer) throws com.shield.android.i.a {
        return com.shield.android.j.d.k(byteBuffer);
    }

    public static byte[] l(ByteBuffer byteBuffer) throws com.shield.android.i.a {
        return com.shield.android.j.d.l(byteBuffer);
    }

    public static void a(com.shield.android.u.c cVar, com.shield.android.u.b bVar, com.shield.android.u.b bVar2, ByteBuffer byteBuffer, Set<com.shield.android.j.f> set, e eVar) throws NoSuchAlgorithmException, IOException {
        if (set.isEmpty()) {
            throw new RuntimeException("No content digests found");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        int iPosition = byteBuffer.position();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        byteBuffer.position(iPosition);
        com.shield.android.t.c.a(byteBufferAllocate, bVar.es());
        try {
            Map<com.shield.android.j.f, byte[]> mapA = a(cVar, set, bVar, bVar2, new com.shield.android.r.a(byteBufferAllocate));
            if (mapA.containsKey(com.shield.android.j.f.VERITY_CHUNKED_SHA256)) {
                if (bVar.es() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
                    throw new RuntimeException("APK Signing Block is not aligned on 4k boundary: " + bVar.es());
                }
                long jZ = com.shield.android.t.c.z(byteBuffer) - bVar.es();
                if (jZ % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
                    throw new RuntimeException("APK Signing Block size is not multiple of page size: " + jZ);
                }
            }
            if (!set.equals(mapA.keySet())) {
                throw new RuntimeException("Mismatch between sets of requested and computed content digests . Requested: " + set + ", computed: " + mapA.keySet());
            }
            for (e.a aVar : eVar.oy) {
                for (e.a.b bVar3 : aVar.oB) {
                    com.shield.android.j.h hVarM = com.shield.android.j.h.m(bVar3.dy());
                    if (hVarM != null) {
                        com.shield.android.j.f fVarDG = hVarM.dG();
                        if (set.contains(fVarDG)) {
                            byte[] bArrDz = bVar3.dz();
                            byte[] bArr = mapA.get(fVarDG);
                            if (Arrays.equals(bArrDz, bArr)) {
                                aVar.oC.put(fVarDG, bArr);
                            } else {
                                int i = eVar.nH;
                                if (i == 2) {
                                    aVar.e(b.c.f15380lf, fVarDG, com.shield.android.j.d.f(bArrDz), com.shield.android.j.d.f(bArr));
                                } else if (i == 3) {
                                    aVar.e(b.c.lD, fVarDG, com.shield.android.j.d.f(bArrDz), com.shield.android.j.d.f(bArr));
                                }
                            }
                        }
                    }
                }
            }
        } catch (DigestException e7) {
            throw new RuntimeException("Failed to compute content digests", e7);
        }
    }

    public static byte[] f(Map<com.shield.android.j.f, byte[]> map) {
        for (com.shield.android.j.f fVar : f15439oi) {
            if (map.containsKey(fVar)) {
                return map.get(fVar);
            }
        }
        return null;
    }

    private static Map<com.shield.android.j.f, byte[]> a(com.shield.android.u.c cVar, Set<com.shield.android.j.f> set, com.shield.android.u.b bVar, com.shield.android.u.b bVar2, com.shield.android.u.b bVar3) throws NoSuchAlgorithmException, DigestException, IOException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        for (com.shield.android.j.f fVar : set) {
            if (fVar == com.shield.android.j.f.CHUNKED_SHA256 || fVar == com.shield.android.j.f.CHUNKED_SHA512) {
                hashSet.add(fVar);
            }
        }
        a(cVar, hashSet, new com.shield.android.u.b[]{bVar, bVar2, bVar3}, map);
        com.shield.android.j.f fVar2 = com.shield.android.j.f.VERITY_CHUNKED_SHA256;
        if (!set.contains(fVar2)) {
            return map;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(fVar2.dE() + 8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        com.shield.android.r.i iVar = new com.shield.android.r.i(new byte[8]);
        try {
            if (bVar.es() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM == 0) {
                long jEs = bVar.es();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((int) bVar3.es());
                byteBufferAllocate2.order(byteOrder);
                bVar3.a(0L, (int) bVar3.es(), byteBufferAllocate2);
                byteBufferAllocate2.flip();
                com.shield.android.t.c.a(byteBufferAllocate2, jEs);
                byteBufferAllocate.put(iVar.w(iVar.d(new com.shield.android.r.c(bVar, bVar2, new com.shield.android.r.a(byteBufferAllocate2)))));
                byteBufferAllocate.putLong(bVar.es() + bVar2.es() + bVar3.es());
                map.put(fVar2, byteBufferAllocate.array());
                iVar.close();
                return map;
            }
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + bVar.es());
        } finally {
        }
    }

    private static void a(com.shield.android.u.c cVar, Set<com.shield.android.j.f> set, com.shield.android.u.b[] bVarArr, Map<com.shield.android.j.f, byte[]> map) throws NoSuchAlgorithmException, DigestException {
        long jEs = 0;
        byte b8 = 0;
        for (int i = 0; i < 3; i++) {
            jEs += (bVarArr[i].es() + 1048575) / 1048576;
        }
        if (jEs <= 2147483647L) {
            int i4 = (int) jEs;
            final ArrayList<b> arrayList = new ArrayList(set.size());
            Iterator<com.shield.android.j.f> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new b(it.next(), i4, b8));
            }
            final C0072c c0072c = new C0072c(bVarArr, b8);
            cVar.execute(new com.shield.android.u.d() { // from class: com.shield.android.j.k
                @Override // com.shield.android.u.d
                public final Runnable createRunnable() {
                    return c.a(c0072c, (List) arrayList);
                }
            });
            for (b bVar : arrayList) {
                map.put(bVar.on, b.a(bVar).digest(bVar.op));
            }
            return;
        }
        throw new DigestException(androidx.media3.datasource.cache.c.i(jEs, "Input too long: ", " chunks"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Runnable a(C0072c c0072c, List list) {
        return new a(c0072c, list, (byte) 0);
    }

    public static byte[] a(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] encoded = null;
        if ("X.509".equals(publicKey.getFormat())) {
            byte[] encoded2 = publicKey.getEncoded();
            String algorithm = publicKey.getAlgorithm();
            if ("RSA".equals(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
                try {
                    com.shield.android.s.c cVar = (com.shield.android.s.c) com.shield.android.p.a.a(ByteBuffer.wrap(encoded2), com.shield.android.s.c.class);
                    ByteBuffer byteBuffer = cVar.rP;
                    byte b8 = byteBuffer.get();
                    com.shield.android.s.b bVar = (com.shield.android.s.b) com.shield.android.p.a.a(byteBuffer, com.shield.android.s.b.class);
                    if (bVar.rO.compareTo(BigInteger.ZERO) < 0) {
                        byte[] byteArray = bVar.rO.toByteArray();
                        byte[] bArr = new byte[byteArray.length + 1];
                        bArr[0] = 0;
                        System.arraycopy(byteArray, 0, bArr, 1, byteArray.length);
                        bVar.rO = new BigInteger(bArr);
                        byte[] bArrA = com.shield.android.p.d.a(bVar);
                        byte[] bArr2 = new byte[bArrA.length + 1];
                        bArr2[0] = b8;
                        System.arraycopy(bArrA, 0, bArr2, 1, bArrA.length);
                        cVar.rP = ByteBuffer.wrap(bArr2);
                        encoded2 = com.shield.android.p.d.a(cVar);
                    }
                    encoded = encoded2;
                } catch (com.shield.android.p.c | com.shield.android.p.e unused) {
                }
            } else {
                encoded = encoded2;
            }
        }
        if (encoded == null) {
            try {
                encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            } catch (InvalidKeySpecException e7) {
                throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e7);
            }
        }
        if (encoded != null && encoded.length != 0) {
            return encoded;
        }
        throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
    }

    public static i a(com.shield.android.u.b bVar, c.b bVar2, int i) throws f, IOException {
        try {
            return com.shield.android.j.d.a(bVar, bVar2, i);
        } catch (j e7) {
            throw new f(e7.getMessage());
        }
    }

    public static <T extends com.shield.android.j.e> List<T> a(List<T> list, int i, int i4) throws d {
        return a((List) list, i, i4, false);
    }

    private static <T extends com.shield.android.j.e> List<T> a(List<T> list, int i, int i4, boolean z4) throws d {
        try {
            return com.shield.android.j.d.a(list, i, i4, false);
        } catch (com.shield.android.j.g e7) {
            throw new d(e7.getMessage());
        }
    }

    public static /* synthetic */ void a(int i, byte[] bArr, int i4) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >> 8);
        bArr[3] = (byte) (i >> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    public static /* synthetic */ long a(long j, long j6) {
        return (j + 1048575) / 1048576;
    }
}
