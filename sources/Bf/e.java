package Bf;

import android.util.Log;
import com.dynatrace.android.agent.Global;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import yf.C2531a;
import yf.k;
import yf.l;
import yf.m;
import yf.n;
import yf.o;
import yf.p;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {
    public final byte[] e;
    public final Af.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f447g;
    public long h;
    public final long i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f449l;
    public HashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ff.b f453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ff.g f454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Cg.c f456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final byte[] f457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final char[] f442v = {'x', 'r', 'e', 'f'};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final char[] f443w = {'/', 'X', 'R', 'e', 'f'};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final char[] f444x = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f445y = {101, 110, 100, 115, 116, 114, 101, 97, 109};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f446z = {101, 110, 100, 111, 98, 106};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final char[] f438A = {'%', '%', 'E', 'O', 'F'};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final char[] f439B = {'o', 'b', 'j'};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final char[] f440C = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final char[] f441D = {'/', 'O', 'b', 'j', 'S', 't', 'm'};

    public e(Af.a aVar, Af.d dVar) throws IOException {
        super(new h(aVar));
        this.e = new byte[2048];
        this.f447g = "";
        this.j = true;
        this.f448k = false;
        this.f449l = false;
        this.m = null;
        this.f450n = null;
        this.f451o = null;
        this.f452p = null;
        this.f453q = null;
        this.f454r = null;
        this.f455s = 2048;
        this.f456t = new Cg.c(3);
        this.f457u = new byte[8192];
        this.f = aVar;
        this.f447g = "";
        aVar.b();
        this.i = aVar.f;
        String property = System.getProperty("com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange");
        if (property != null) {
            try {
                int i = Integer.parseInt(property);
                if (i > 15) {
                    this.f455s = i;
                }
            } catch (NumberFormatException unused) {
                Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + "'");
            }
        }
        this.c = new yf.e(dVar);
    }

    public static m A(m mVar, Long l6, m mVar2, Long l8) {
        return (mVar2 == null || (mVar2.f21271b != mVar.f21271b ? !(l8 == null || l6.longValue() <= l8.longValue()) : mVar2.c < mVar.c)) ? mVar : mVar2;
    }

    public static boolean D(yf.d dVar) {
        if (dVar.f21154a.containsKey(yf.j.f21201W0)) {
            return false;
        }
        if (dVar.f21154a.containsKey(yf.j.e)) {
            return false;
        }
        if (dVar.f21154a.containsKey(yf.j.f21212c0)) {
            return false;
        }
        if (dVar.f21154a.containsKey(yf.j.f21183K0)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21257v1)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21244q)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21250s1)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21172C0)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21198V)) {
            return true;
        }
        if (dVar.f21154a.containsKey(yf.j.f21216d1)) {
            return true;
        }
        return dVar.f21154a.containsKey(yf.j.f21196U);
    }

    public static int F(char[] cArr, byte[] bArr, int i) {
        int length = cArr.length - 1;
        char c = cArr[length];
        while (true) {
            int i4 = length;
            while (true) {
                i--;
                if (i < 0) {
                    return -1;
                }
                if (bArr[i] == c) {
                    i4--;
                    if (i4 < 0) {
                        return i;
                    }
                    c = cArr[i4];
                } else if (i4 < length) {
                    break;
                }
            }
            c = cArr[length];
        }
    }

    public static long V(ArrayList arrayList, long j) {
        int size = arrayList.size();
        Long lValueOf = null;
        int i = -1;
        for (int i4 = 0; i4 < size; i4++) {
            long jLongValue = j - ((Long) arrayList.get(i4)).longValue();
            if (lValueOf == null || Math.abs(lValueOf.longValue()) > Math.abs(jLongValue)) {
                lValueOf = Long.valueOf(jLongValue);
                i = i4;
            }
        }
        if (i > -1) {
            return ((Long) arrayList.get(i)).longValue();
        }
        return -1L;
    }

    public static void v(LinkedList linkedList, yf.b bVar, HashSet hashSet) {
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            if (hashSet.add(Long.valueOf((mVar.f21271b << 32) | ((long) mVar.c)))) {
                linkedList.add(bVar);
                return;
            }
            return;
        }
        if ((bVar instanceof yf.d) || (bVar instanceof C2531a)) {
            linkedList.add(bVar);
        }
    }

    public static int y(yf.d dVar, HashSet hashSet) {
        yf.b bVarQ = dVar.q(yf.j.f21174D0);
        int iY = 0;
        if (bVarQ instanceof C2531a) {
            C2531a c2531a = (C2531a) bVarQ;
            c2531a.getClass();
            for (yf.b bVar : new ArrayList(c2531a.f21151a)) {
                if (bVar instanceof m) {
                    m mVar = (m) bVar;
                    if (!hashSet.contains(mVar)) {
                        yf.b bVar2 = mVar.f21270a;
                        if (bVar2 == null || bVar2.equals(k.f21269a)) {
                            Log.w("PdfBox-Android", "Removed null object " + bVar + " from pages dictionary");
                            c2531a.q(bVar);
                        } else if (bVar2 instanceof yf.d) {
                            yf.d dVar2 = (yf.d) bVar2;
                            yf.j jVarK = dVar2.k(yf.j.f21262x1);
                            if (yf.j.f21199V0.equals(jVarK)) {
                                hashSet.add(mVar);
                                iY = y(dVar2, hashSet) + iY;
                            } else if (yf.j.f21197U0.equals(jVarK)) {
                                iY++;
                            }
                        }
                    }
                }
                c2531a.q(bVar);
            }
        }
        dVar.D(yf.j.f21194T, iY);
        return iY;
    }

    public final long B() throws IOException {
        Af.a aVar = this.f;
        try {
            long j = this.i;
            int i = this.f455s;
            if (j < i) {
                i = (int) j;
            }
            byte[] bArr = new byte[i];
            long j6 = j - ((long) i);
            aVar.g(j6);
            int i4 = 0;
            while (i4 < i) {
                int i6 = i - i4;
                int i10 = aVar.read(bArr, i4, i6);
                if (i10 < 1) {
                    throw new IOException("No more bytes to read for trailing buffer, but expected: " + i6);
                }
                i4 += i10;
            }
            aVar.g(0L);
            char[] cArr = f438A;
            int iF = F(cArr, bArr, i);
            if (iF >= 0) {
                i = iF;
            } else {
                if (!this.j) {
                    throw new IOException("Missing end of file marker '" + new String(cArr) + "'");
                }
                Log.d("PdfBox-Android", "Missing end of file marker '" + new String(cArr) + "'");
            }
            int iF2 = F(f444x, bArr, i);
            if (iF2 >= 0) {
                return j6 + ((long) iF2);
            }
            throw new IOException("Missing 'startxref' marker.");
        } catch (Throwable th2) {
            aVar.g(0L);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.C():void");
    }

    public final boolean E(char[] cArr) throws IOException {
        Af.a aVar = this.f;
        aVar.b();
        long j = aVar.f264d;
        int length = cArr.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z4 = true;
                break;
            }
            if (aVar.read() != cArr[i]) {
                break;
            }
            i++;
        }
        aVar.g(j);
        return z4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf.p G(yf.d r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.G(yf.d):yf.p");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:
    
        throw new java.io.IOException(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        if (r2.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01da, code lost:
    
        r5 = ((java.util.List) r2.remove(r2.firstKey())).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ec, code lost:
    
        if (r5.hasNext() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ee, code lost:
    
        r7 = (yf.m) r5.next();
        r9 = L(r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f9, code lost:
    
        if (r9 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fb, code lost:
    
        r7.f21270a = r9;
        v(r1, r9, r4);
        r3.add(java.lang.Long.valueOf((r7.f21271b << 32) | ((long) r7.c)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(yf.d r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.H(yf.d):void");
    }

    public final void I(m mVar) throws IOException {
        K(mVar.f21271b, mVar.c, true);
        yf.b bVar = mVar.f21270a;
        if (!(bVar instanceof yf.d)) {
            StringBuilder sb2 = new StringBuilder("Dictionary object expected at offset ");
            Af.a aVar = this.f;
            aVar.b();
            sb2.append(aVar.f264d);
            throw new IOException(sb2.toString());
        }
        for (yf.b bVar2 : ((yf.d) bVar).f21154a.values()) {
            if (bVar2 instanceof m) {
                m mVar2 = (m) bVar2;
                if (mVar2.f21270a == null) {
                    I(mVar2);
                }
            }
        }
    }

    public final boolean J(String str, String str2) throws IOException {
        String strO = o();
        if (!strO.contains(str)) {
            strO = o();
            while (!strO.contains(str) && (strO.length() <= 0 || !Character.isDigit(strO.charAt(0)))) {
                strO = o();
            }
        }
        boolean zContains = strO.contains(str);
        Af.a aVar = this.f;
        if (!zContains) {
            aVar.g(0L);
            return false;
        }
        int iIndexOf = strO.indexOf(str);
        if (iIndexOf > 0) {
            strO = strO.substring(iIndexOf);
        }
        if (strO.startsWith(str) && !strO.matches(str.concat("\\d.\\d"))) {
            if (strO.length() < str.length() + 3) {
                strO = str.concat(str2);
                Log.d("PdfBox-Android", "No version found, set to " + str2 + " as default.");
            } else {
                String str3 = strO.substring(str.length() + 3, strO.length()) + Global.NEWLINE;
                strO = strO.substring(0, str.length() + 3);
                aVar.f(str3.getBytes(Nf.a.c).length);
            }
        }
        float f = -1.0f;
        try {
            String[] strArrSplit = strO.split(Global.HYPHEN);
            if (strArrSplit.length == 2) {
                f = Float.parseFloat(strArrSplit[1]);
            }
        } catch (NumberFormatException e) {
            Log.d("PdfBox-Android", "Can't parse the header version.", e);
        }
        if (f < 0.0f && !this.j) {
            throw new IOException(AbstractC1414e.h("Error getting header version: ", strO));
        }
        this.c.getClass();
        aVar.g(0L);
        return true;
    }

    public final yf.b K(long j, int i, boolean z4) throws IOException {
        String str;
        yf.b bVar;
        p pVar;
        n nVar = new n(j, i);
        m mVarF = this.c.f(nVar);
        if (mVarF.f21270a == null) {
            Long l6 = (Long) this.c.f21156b.get(nVar);
            boolean z5 = this.j;
            if (l6 == null && z5) {
                x();
                l6 = (Long) this.m.get(nVar);
                if (l6 != null) {
                    Log.d("PdfBox-Android", "Set missing offset " + l6 + " for object " + nVar);
                    this.c.f21156b.put(nVar, l6);
                }
            }
            if (z4 && (l6 == null || l6.longValue() <= 0)) {
                throw new IOException("Object must be defined and must not be compressed object: " + j + Global.COLON + i);
            }
            if (mVarF.f21272d) {
                throw new IOException("Possible recursion detected when dereferencing object " + j + Global.BLANK + i);
            }
            mVarF.f21272d = true;
            if (l6 == null && z5 && this.m == null) {
                x();
                if (!this.m.isEmpty()) {
                    Log.d("PdfBox-Android", "Add all new read objects from brute force search to the xref table");
                    HashMap map = this.c.f21156b;
                    for (Map.Entry entry : this.m.entrySet()) {
                        n nVar2 = (n) entry.getKey();
                        if (!map.containsKey(nVar2)) {
                            map.put(nVar2, entry.getValue());
                        }
                    }
                    l6 = (Long) map.get(nVar);
                }
            }
            if (l6 == null) {
                mVarF.f21270a = k.f21269a;
            } else if (l6.longValue() > 0) {
                long jLongValue = l6.longValue();
                Af.a aVar = this.f;
                aVar.g(jLongValue);
                long jQ = q();
                int iN = n();
                m(f439B);
                long j6 = nVar.f21273a;
                int i4 = nVar.f21274b;
                if (jQ != j6 || iN != i4) {
                    StringBuilder sb2 = new StringBuilder("XREF for ");
                    sb2.append(j6);
                    sb2.append(Global.COLON);
                    sb2.append(i4);
                    androidx.media3.datasource.cache.c.z(sb2, " points to wrong object: ", jQ, Global.COLON);
                    sb2.append(iN);
                    sb2.append(" at offset ");
                    sb2.append(l6);
                    throw new IOException(sb2.toString());
                }
                t();
                yf.b bVarK = k();
                String strR = r();
                if (strR.equals("stream")) {
                    aVar.f(strR.getBytes(Nf.a.c).length);
                    if (!(bVarK instanceof yf.d)) {
                        throw new IOException("Stream not preceded by dictionary (offset: " + l6 + ").");
                    }
                    p pVarG = G((yf.d) bVarK);
                    Ff.g gVar = this.f454r;
                    if (gVar != null) {
                        gVar.c(pVarG, nVar.f21273a, i4);
                    }
                    t();
                    strR = o();
                    if (!strR.startsWith("endobj") && strR.startsWith("endstream")) {
                        strR = strR.substring(9).trim();
                        if (strR.length() == 0) {
                            strR = o();
                        }
                    }
                    str = "endobj";
                    pVar = pVarG;
                } else {
                    str = "endobj";
                    Ff.g gVar2 = this.f454r;
                    if (gVar2 != null) {
                        bVar = bVarK;
                        str = str;
                        gVar2.a(bVar, nVar.f21273a, i4);
                    } else {
                        bVar = bVarK;
                    }
                    pVar = bVar;
                }
                mVarF.f21270a = pVar;
                if (!strR.startsWith(str)) {
                    if (!z5) {
                        throw new IOException("Object (" + jQ + Global.COLON + iN + ") at offset " + l6 + " does not end with 'endobj' but with '" + strR + "'");
                    }
                    Log.w("PdfBox-Android", "Object (" + jQ + Global.COLON + iN + ") at offset " + l6 + " does not end with 'endobj' but with '" + strR + "'");
                }
            } else {
                M((int) (-l6.longValue()));
            }
            mVarF.f21272d = false;
        }
        return mVarF.f21270a;
    }

    public final yf.b L(m mVar, boolean z4) {
        return K(mVar.f21271b, mVar.c, z4);
    }

    public final void M(int i) throws IOException {
        boolean z4 = this.j;
        yf.b bVarK = K(i, 0, true);
        if (bVarK instanceof p) {
            try {
                d dVar = new d((p) bVarK, this.c);
                try {
                    dVar.v();
                    for (m mVar : dVar.e) {
                        n nVar = new n(mVar.f21271b, mVar.c);
                        j jVar = (j) this.f456t.f769d;
                        Long l6 = (Long) (jVar == null ? null : jVar.f464b).get(nVar);
                        if (l6 != null && l6.longValue() == (-i)) {
                            this.c.f(nVar).f21270a = mVar.f21270a;
                        }
                    }
                } catch (IOException e) {
                    if (!z4) {
                        throw e;
                    }
                    Log.d("PdfBox-Android", "Stop reading object stream " + i + " due to an exception", e);
                }
            } catch (IOException e7) {
                if (!z4) {
                    throw e7;
                }
                Log.e("PdfBox-Android", "object stream " + i + " could not be parsed due to an exception", e7);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:220|140|141|(2:222|142))|(2:144|(2:146|(1:148)(5:151|(2:154|152)|257|155|(1:163)(2:161|162))))|164|165|218|166|(2:168|(2:170|162)(1:171))(1:174)|175|(1:(1:162)(2:180|181))(1:177)) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x043f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0463, code lost:
    
        android.util.Log.d("PdfBox-Android", androidx.media3.datasource.cache.c.i(r10, "No valid object at given location ", " - ignoring"), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf.d N(long r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.N(long):yf.d");
    }

    public final long O(long j, boolean z4) throws IOException {
        i iVar;
        long jQ = q();
        yf.e eVar = this.c;
        eVar.h = Math.max(eVar.h, jQ);
        n();
        m(f439B);
        yf.d dVarH = h();
        p pVarG = G(dVarH);
        Cg.c cVar = this.f456t;
        if (z4) {
            cVar.p(2, j);
            j jVar = (j) cVar.c;
            if (jVar == null) {
                Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
            } else {
                jVar.f463a = pVarG;
            }
        }
        g gVar = new g(pVarG, this.c, cVar);
        int[] iArr = gVar.f;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (true) {
            iVar = gVar.f431b;
            if (iVar.v() || !gVar.f461g.hasNext()) {
                break;
            }
            iVar.read(bArr);
            long jLongValue = gVar.f461g.next().longValue();
            int i = iArr[0];
            int iW = i == 0 ? 1 : (int) g.w(0, i, bArr);
            if (iW != 0) {
                long jW = g.w(iArr[0], iArr[1], bArr);
                n nVar = new n(jLongValue, iW == 1 ? (int) g.w(iArr[0] + iArr[1], iArr[2], bArr) : 0);
                Cg.c cVar2 = gVar.e;
                if (iW == 1) {
                    cVar2.v(nVar, jW);
                } else {
                    cVar2.v(nVar, -jW);
                }
            }
        }
        if (iVar != null) {
            iVar.close();
        }
        gVar.c = null;
        pVarG.close();
        return dVarH.y(yf.j.f21213c1);
    }

    public final void P() throws IOException {
        if (this.f453q != null) {
            return;
        }
        yf.d dVar = this.c.f21157d;
        yf.j jVar = yf.j.f21227j0;
        yf.b bVarW = dVar.w(jVar);
        if (bVarW == null || (bVarW instanceof k)) {
            return;
        }
        if (bVarW instanceof m) {
            I((m) bVarW);
        }
        try {
            yf.b bVarQ = this.c.f21157d.q(jVar);
            Ff.b bVar = new Ff.b(bVarQ instanceof yf.d ? (yf.d) bVarQ : null);
            this.f453q = bVar;
            Ff.i iVar = new Ff.i(this.f447g);
            Ff.g gVarD = bVar.d();
            this.f454r = gVarD;
            gVarD.h(this.f453q, this.c.f21157d.i(yf.j.u0), iVar);
            Ff.a aVar = this.f454r.f1586g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e7) {
            throw new IOException("Error (" + e7.getClass().getSimpleName() + ") while creating security handler for decryption", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(Bf.b r14) throws java.io.IOException {
        /*
            r13 = this;
            byte[] r0 = Bf.e.f445y
            r1 = 0
            r3 = r0
            r2 = r1
        L5:
            int r4 = 2048 - r2
            Af.a r5 = r13.f
            byte[] r6 = r13.e
            int r4 = r5.read(r6, r2, r4)
            if (r4 <= 0) goto L70
            int r4 = r4 + r2
            int r7 = r4 + (-5)
            r8 = r3
            r3 = r2
        L16:
            if (r2 >= r4) goto L58
            int r9 = r2 + 5
            r10 = 1
            if (r3 != 0) goto L2b
            if (r9 >= r7) goto L2b
            r11 = r6[r9]
            r12 = 116(0x74, float:1.63E-43)
            if (r11 > r12) goto L29
            r12 = 97
            if (r11 >= r12) goto L2b
        L29:
            r2 = r9
            goto L56
        L2b:
            r9 = r6[r2]
            r11 = r8[r3]
            if (r9 != r11) goto L39
            int r3 = r3 + 1
            int r9 = r8.length
            if (r3 != r9) goto L56
            int r2 = r2 + 1
            goto L58
        L39:
            r8 = 3
            if (r3 != r8) goto L45
            byte[] r8 = Bf.e.f446z
            r11 = r8[r3]
            if (r9 != r11) goto L45
            int r3 = r3 + 1
            goto L56
        L45:
            r8 = 101(0x65, float:1.42E-43)
            if (r9 != r8) goto L4b
            r3 = r10
            goto L55
        L4b:
            r8 = 110(0x6e, float:1.54E-43)
            if (r9 != r8) goto L54
            r8 = 7
            if (r3 != r8) goto L54
            r3 = 2
            goto L55
        L54:
            r3 = r1
        L55:
            r8 = r0
        L56:
            int r2 = r2 + r10
            goto L16
        L58:
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 <= 0) goto L62
            r14.write(r6, r1, r2)
        L62:
            int r7 = r8.length
            if (r3 != r7) goto L6a
            int r4 = r4 - r2
            r5.f(r4)
            goto L70
        L6a:
            java.lang.System.arraycopy(r8, r1, r6, r1, r3)
            r2 = r3
            r3 = r8
            goto L5
        L70:
            r14.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.Q(Bf.b):void");
    }

    public final void R(o oVar, l lVar) throws IOException {
        long jK = lVar.k();
        while (jK > 0) {
            int i = jK > 8192 ? 8192 : (int) jK;
            Af.a aVar = this.f;
            byte[] bArr = this.f457u;
            int i4 = aVar.read(bArr, 0, i);
            if (i4 <= 0) {
                StringBuilder sb2 = new StringBuilder("read error at offset ");
                aVar.b();
                sb2.append(aVar.f264d);
                sb2.append(": expected ");
                sb2.append(i);
                throw new IOException(androidx.camera.core.impl.a.o(sb2, " bytes, but read() returns ", i4));
            }
            oVar.write(bArr, 0, i4);
            jK -= (long) i4;
        }
    }

    public final yf.d S(m mVar) throws IOException {
        n nVar = new n(mVar.f21271b, mVar.c);
        Long l6 = (Long) this.m.get(nVar);
        if (l6 == null) {
            return null;
        }
        Af.a aVar = this.f;
        aVar.b();
        long j = aVar.f264d;
        yf.d dVarT = T(nVar, l6.longValue());
        aVar.g(j);
        return dVarT;
    }

    public final yf.d T(n nVar, long j) throws IOException {
        if (j < 0) {
            m mVarF = this.c.f(nVar);
            if (mVarF.f21270a == null) {
                M((int) (-j));
            }
            yf.b bVar = mVarF.f21270a;
            if (bVar instanceof yf.d) {
                return (yf.d) bVar;
            }
            return null;
        }
        Af.a aVar = this.f;
        aVar.g(j);
        q();
        n();
        m(f439B);
        if (aVar.peek() != 60) {
            return null;
        }
        try {
            return h();
        } catch (IOException unused) {
            Log.d("PdfBox-Android", "Skipped object " + nVar + ", either it's corrupt or not a dictionary");
            return null;
        }
    }

    public final boolean U(yf.d dVar) throws IOException {
        m mVarF;
        m mVarA = null;
        m mVarA2 = null;
        Long l6 = null;
        Long l8 = null;
        for (Map.Entry entry : this.m.entrySet()) {
            yf.d dVarT = T((n) entry.getKey(), ((Long) entry.getValue()).longValue());
            if (dVarT != null) {
                if (yf.j.f21258w.equals(dVarT.k(yf.j.f21262x1))) {
                    m mVarF2 = this.c.f((n) entry.getKey());
                    mVarA = A(mVarF2, (Long) entry.getValue(), mVarA, l6);
                    if (mVarA == mVarF2) {
                        l6 = (Long) entry.getValue();
                    }
                } else if (D(dVarT) && (mVarA2 = A((mVarF = this.c.f((n) entry.getKey())), (Long) entry.getValue(), mVarA2, l8)) == mVarF) {
                    l8 = (Long) entry.getValue();
                }
            }
        }
        if (mVarA != null) {
            dVar.F(yf.j.f21226i1, mVarA);
        }
        if (mVarA2 != null) {
            dVar.F(yf.j.f21265z0, mVarA2);
        }
        return mVarA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.w():void");
    }

    public final void x() throws IOException {
        if (this.m == null) {
            Long l6 = this.f450n;
            long j = 6;
            Af.a aVar = this.f;
            if (l6 == null) {
                aVar.b();
                long j6 = aVar.f264d;
                aVar.g(6L);
                while (!aVar.v()) {
                    if (E(f438A)) {
                        aVar.b();
                        long j7 = aVar.f264d;
                        aVar.g(5 + j7);
                        try {
                            t();
                            if (!E(f442v)) {
                                q();
                                n();
                            }
                        } catch (IOException unused) {
                            this.f450n = Long.valueOf(j7);
                        }
                    }
                    aVar.read();
                }
                aVar.g(j6);
                if (this.f450n == null) {
                    this.f450n = Long.MAX_VALUE;
                }
            }
            this.m = new HashMap();
            aVar.b();
            long j9 = aVar.f264d;
            char[] charArray = "ndo".toCharArray();
            char[] charArray2 = "bj".toCharArray();
            long j10 = Long.MIN_VALUE;
            long length = 6;
            int i = Integer.MIN_VALUE;
            boolean z4 = false;
            long j11 = Long.MIN_VALUE;
            while (true) {
                aVar.g(length);
                long j12 = j;
                int i4 = aVar.read();
                long j13 = length + 1;
                if (a.g(i4) && E(f439B)) {
                    aVar.g((-1) + length);
                    int iPeek = aVar.peek();
                    if (a.d(iPeek)) {
                        int i6 = iPeek - 48;
                        long j14 = length - 2;
                        aVar.g(j14);
                        i iVar = this.f431b;
                        if (a.g(iVar.peek())) {
                            while (j14 > j12 && a.g(iVar.peek())) {
                                j14--;
                                aVar.g(j14);
                            }
                            boolean z5 = false;
                            while (j14 > j12 && c()) {
                                j14--;
                                aVar.g(j14);
                                z5 = true;
                            }
                            if (z5) {
                                aVar.read();
                                long jQ = q();
                                if (j11 > 0) {
                                    this.m.put(new n(j10, i), Long.valueOf(j11));
                                }
                                j11 = j14 + 1;
                                j13 += (long) 2;
                                i = i6;
                                j10 = jQ;
                                z4 = false;
                            }
                        }
                    }
                } else {
                    if (i4 == 101 && E(charArray)) {
                        length = j13 + ((long) charArray.length);
                        aVar.g(length);
                        if (aVar.v()) {
                            z4 = true;
                        } else if (E(charArray2)) {
                            length += (long) charArray2.length;
                            z4 = true;
                        }
                    }
                    if (length >= this.f450n.longValue() || aVar.v()) {
                        break;
                    } else {
                        j = j12;
                    }
                }
                length = j13;
                if (length >= this.f450n.longValue()) {
                    break;
                }
                break;
                break;
            }
            if ((this.f450n.longValue() < Long.MAX_VALUE || z4) && j11 > 0) {
                this.m.put(new n(j10, i), Long.valueOf(j11));
            }
            aVar.g(j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if ("XRef".equals(r3.z(yf.j.f21262x1)) != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long z(long r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.e.z(long):long");
    }
}
