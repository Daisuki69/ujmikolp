package com.shield.android.j;

import We.s;
import io.flutter.embedding.android.KeyboardMap;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private int nA = 1;
    private String nB;
    private String nC;
    private int nD;
    private List<C0071a> nE;
    private ByteBuffer nF;
    private int nG;
    private final ByteBuffer nw;
    private d nx;
    private c ny;
    private int nz;

    /* JADX INFO: renamed from: com.shield.android.j.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public final int nH;
        public boolean nI;
        public final List<com.shield.android.j.b> nJ = new ArrayList();
        private final List<com.shield.android.p.a> nK = new ArrayList();
        private final List<com.shield.android.p.a> nL = new ArrayList();

        public AnonymousClass1(int i) {
            this.nH = i;
        }

        public boolean cP() {
            if (!this.nL.isEmpty()) {
                return true;
            }
            if (this.nJ.isEmpty()) {
                return false;
            }
            Iterator<com.shield.android.j.b> it = this.nJ.iterator();
            while (it.hasNext()) {
                if (it.next().cP()) {
                    return true;
                }
            }
            return false;
        }

        public boolean dl() {
            if (!this.nK.isEmpty()) {
                return true;
            }
            if (this.nJ.isEmpty()) {
                return false;
            }
            Iterator<com.shield.android.j.b> it = this.nJ.iterator();
            while (it.hasNext()) {
                if (it.next().dl()) {
                    return true;
                }
            }
            return false;
        }

        public List<? extends com.shield.android.p.a> dm() {
            return this.nL;
        }

        public List<? extends com.shield.android.p.a> dn() {
            return this.nK;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.j.a$a, reason: collision with other inner class name */
    public static class C0071a {
        private final long nM;
        private final int nN;
        private final int nO;
        private final d nP;
        private final c nQ;

        public /* synthetic */ C0071a(long j, long j6, int i, int i4, d dVar, c cVar, byte b8) {
            this(j, j6, i, i4, dVar, cVar);
        }

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public final int m181do() {
            c cVar = this.nQ;
            if (cVar != null) {
                return cVar.b(this.nM);
            }
            return 0;
        }

        public final int dp() {
            return this.nN;
        }

        public final int dq() throws e {
            int i = this.nN;
            if (i != 1) {
                switch (i) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        throw new e("Cannot coerce to int: value type " + this.nN);
                }
            }
            return this.nO;
        }

        public final String dr() throws e {
            int i = this.nN;
            if (i == 1) {
                return androidx.camera.core.impl.a.e(this.nO, new StringBuilder("@"));
            }
            if (i == 3) {
                return this.nP.c(((long) this.nO) & KeyboardMap.kValueMask);
            }
            switch (i) {
                case 16:
                    return Integer.toString(this.nO);
                case 17:
                    return androidx.camera.core.impl.a.e(this.nO, new StringBuilder("0x"));
                case 18:
                    return Boolean.toString(this.nO != 0);
                default:
                    throw new e("Cannot coerce to string: value type " + this.nN);
            }
        }

        private C0071a(long j, long j6, int i, int i4, d dVar, c cVar) {
            this.nM = j6;
            this.nN = i;
            this.nO = i4;
            this.nP = dVar;
            this.nQ = cVar;
        }
    }

    public static class b {
        private final int nR;
        private final ByteBuffer nS;
        private final ByteBuffer nT;

        private b(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.nR = i;
            this.nS = byteBuffer;
            this.nT = byteBuffer2;
        }

        public static b g(ByteBuffer byteBuffer) throws e {
            if (byteBuffer.remaining() < 8) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            int iPosition = byteBuffer.position();
            int iD = a.d(byteBuffer);
            int iD2 = a.d(byteBuffer);
            long jE = a.e(byteBuffer);
            if (jE - 8 > byteBuffer.remaining()) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            if (iD2 < 8) {
                throw new e(s.g(iD2, "Malformed chunk: header too short: ", " bytes"));
            }
            if (iD2 <= jE) {
                int i = iD2 + iPosition;
                long j = ((long) iPosition) + jE;
                b bVar = new b(iD, a.a(byteBuffer, iPosition, i), a.a(byteBuffer, i, j));
                byteBuffer.position((int) j);
                return bVar;
            }
            throw new e("Malformed chunk: header too long: " + iD2 + " bytes. Chunk size: " + jE + " bytes");
        }

        public final ByteBuffer ds() {
            ByteBuffer byteBufferSlice = this.nT.slice();
            byteBufferSlice.order(this.nT.order());
            return byteBufferSlice;
        }

        public final ByteBuffer dt() {
            ByteBuffer byteBufferSlice = this.nS.slice();
            byteBufferSlice.order(this.nS.order());
            return byteBufferSlice;
        }

        public final int du() {
            return this.nR;
        }
    }

    public static class c {
        private final ByteBuffer nU;
        private final int nV;

        public c(b bVar) throws e {
            ByteBuffer byteBufferSlice = bVar.ds().slice();
            this.nU = byteBufferSlice;
            byteBufferSlice.order(bVar.ds().order());
            this.nV = byteBufferSlice.remaining() / 4;
        }

        public final int b(long j) {
            if (j < 0 || j >= this.nV) {
                return 0;
            }
            return this.nU.getInt(((int) j) << 2);
        }
    }

    public static class d {
        private final ByteBuffer nW;
        private final ByteBuffer nX;
        private final int nY;
        private final boolean nZ;

        /* JADX INFO: renamed from: oa, reason: collision with root package name */
        private final Map<Integer, String> f15433oa = new HashMap();

        public d(b bVar) throws e {
            long j;
            int iRemaining;
            ByteBuffer byteBufferDt = bVar.dt();
            int iRemaining2 = byteBufferDt.remaining();
            byteBufferDt.position(8);
            if (byteBufferDt.remaining() < 20) {
                throw new e("XML chunk's header too short. Required at least 20 bytes. Available: " + byteBufferDt.remaining() + " bytes");
            }
            long jE = a.e(byteBufferDt);
            if (jE > 2147483647L) {
                throw new e(androidx.camera.core.impl.a.f(jE, "Too many strings: "));
            }
            int i = (int) jE;
            this.nY = i;
            long jE2 = a.e(byteBufferDt);
            if (jE2 > 2147483647L) {
                throw new e(androidx.camera.core.impl.a.f(jE2, "Too many styles: "));
            }
            long jE3 = a.e(byteBufferDt);
            long jE4 = a.e(byteBufferDt);
            long jE5 = a.e(byteBufferDt);
            ByteBuffer byteBufferDs = bVar.ds();
            if (i > 0) {
                long j6 = iRemaining2;
                j = 0;
                int i4 = (int) (jE4 - j6);
                if (jE2 <= 0) {
                    iRemaining = byteBufferDs.remaining();
                } else {
                    if (jE5 < jE4) {
                        throw new e(s.h(jE4, ")", androidx.camera.core.impl.a.s(jE5, "Styles offset (", ") < strings offset (")));
                    }
                    iRemaining = (int) (jE5 - j6);
                }
                this.nX = a.a(byteBufferDs, i4, iRemaining);
            } else {
                j = 0;
                this.nX = ByteBuffer.allocate(0);
            }
            this.nZ = (256 & jE3) != j;
            this.nW = byteBufferDs;
        }

        private static String h(ByteBuffer byteBuffer) throws e {
            byte[] bArrArray;
            int iPosition;
            int iD = a.d(byteBuffer);
            if ((32768 & iD) != 0) {
                iD = ((iD & 32767) << 16) | a.d(byteBuffer);
            }
            if (iD > 1073741823) {
                throw new e(s.g(iD, "String too long: ", " uint16s"));
            }
            int i = iD << 1;
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                byteBuffer.position(byteBuffer.position() + i);
            } else {
                bArrArray = new byte[i];
                byteBuffer.get(bArrArray);
                iPosition = 0;
            }
            int i4 = iPosition + i;
            if (bArrArray[i4] != 0 || bArrArray[i4 + 1] != 0) {
                throw new e("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iPosition, i, "UTF-16LE");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e);
            }
        }

        private static String i(ByteBuffer byteBuffer) throws e {
            byte[] bArrArray;
            int iPosition;
            if ((a.f(byteBuffer) & 128) != 0) {
                a.f(byteBuffer);
            }
            int iF = a.f(byteBuffer);
            if ((iF & 128) != 0) {
                iF = ((iF & 127) << 8) | a.f(byteBuffer);
            }
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                byteBuffer.position(byteBuffer.position() + iF);
            } else {
                bArrArray = new byte[iF];
                byteBuffer.get(bArrArray);
                iPosition = 0;
            }
            if (bArrArray[iPosition + iF] != 0) {
                throw new e("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iPosition, iF, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 character encoding not supported", e);
            }
        }

        public final String c(long j) throws e {
            if (j < 0) {
                throw new e(androidx.camera.core.impl.a.f(j, "Unsuported string index: "));
            }
            if (j >= this.nY) {
                throw new e(androidx.camera.core.impl.a.l(androidx.camera.core.impl.a.s(j, "Unsuported string index: ", ", max: "), this.nY, 1));
            }
            int i = (int) j;
            String str = this.f15433oa.get(Integer.valueOf(i));
            if (str != null) {
                return str;
            }
            long jA = a.a(this.nW, i << 2);
            if (jA < this.nX.capacity()) {
                this.nX.position((int) jA);
                String strI = this.nZ ? i(this.nX) : h(this.nX);
                this.f15433oa.put(Integer.valueOf(i), strI);
                return strI;
            }
            throw new e("Offset of string idx " + i + " out of bounds: " + jA + ", max: " + (this.nX.capacity() - 1));
        }
    }

    public static class e extends Exception {
        public e(String str) {
            super(str);
        }
    }

    public a(ByteBuffer byteBuffer) throws e {
        b bVarG;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (bVarG = b.g(byteBuffer)) != null) {
            if (bVarG.du() == 3) {
                break;
            }
        }
        bVarG = null;
        if (bVarG == null) {
            throw new e("No XML chunk in file");
        }
        this.nw = bVarG.ds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer a(ByteBuffer byteBuffer, long j, long j6) {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "start: "));
        }
        if (j6 < j) {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j6, "end < start: ", " < ");
            sbS.append(j);
            throw new IllegalArgumentException(sbS.toString());
        }
        int iCapacity = byteBuffer.capacity();
        if (j6 <= byteBuffer.capacity()) {
            return a(byteBuffer, (int) j, (int) j6);
        }
        throw new IllegalArgumentException("end > capacity: " + j6 + " > " + iCapacity);
    }

    public static /* synthetic */ int d(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    private void dk() {
        if (this.nE != null) {
            return;
        }
        this.nE = new ArrayList(this.nD);
        for (int i = 0; i < this.nD; i++) {
            int i4 = this.nG;
            int i6 = i * i4;
            ByteBuffer byteBufferA = a(this.nF, i6, i4 + i6);
            long j = ((long) byteBufferA.getInt()) & KeyboardMap.kValueMask;
            long j6 = ((long) byteBufferA.getInt()) & KeyboardMap.kValueMask;
            byteBufferA.position(byteBufferA.position() + 7);
            this.nE.add(new C0071a(j, j6, byteBufferA.get() & 255, (int) (((long) byteBufferA.getInt()) & KeyboardMap.kValueMask), this.nx, this.ny, (byte) 0));
        }
    }

    public static /* synthetic */ long e(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }

    public static /* synthetic */ int f(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    private C0071a l(int i) {
        if (this.nA != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (i >= this.nD) {
            throw new IndexOutOfBoundsException(s.o(new StringBuilder("index must be <= attr count ("), ")", this.nD));
        }
        dk();
        return this.nE.get(i);
    }

    public final int de() {
        return this.nz;
    }

    public final int df() {
        return this.nA;
    }

    public final String dg() {
        int i = this.nA;
        if (i == 3 || i == 4) {
            return this.nB;
        }
        return null;
    }

    public final String dh() {
        int i = this.nA;
        if (i == 3 || i == 4) {
            return this.nC;
        }
        return null;
    }

    public final int di() {
        if (this.nA != 3) {
            return -1;
        }
        return this.nD;
    }

    public final int dj() throws e {
        b bVarG;
        int i;
        int i4 = 1;
        if (this.nA == 4) {
            this.nz--;
        }
        while (this.nw.hasRemaining() && (bVarG = b.g(this.nw)) != null) {
            int iDu = bVarG.du();
            if (iDu == i4) {
                i = i4;
                if (this.nx != null) {
                    throw new e("Multiple string pools not supported");
                }
                this.nx = new d(bVarG);
            } else if (iDu != 384) {
                if (iDu == 258) {
                    if (this.nx == null) {
                        throw new e("Named element encountered before string pool");
                    }
                    ByteBuffer byteBufferDs = bVarG.ds();
                    if (byteBufferDs.remaining() < 20) {
                        throw new e("Start element chunk too short. Need at least 20 bytes. Available: " + byteBufferDs.remaining() + " bytes");
                    }
                    long j = ((long) byteBufferDs.getInt()) & KeyboardMap.kValueMask;
                    long j6 = ((long) byteBufferDs.getInt()) & KeyboardMap.kValueMask;
                    int i6 = byteBufferDs.getShort() & 65535;
                    int i10 = byteBufferDs.getShort() & 65535;
                    int i11 = 65535 & byteBufferDs.getShort();
                    long j7 = i6;
                    long j9 = (((long) i11) * ((long) i10)) + j7;
                    byteBufferDs.position(0);
                    if (i6 > byteBufferDs.remaining()) {
                        StringBuilder sbT = s.t(i6, "Attributes start offset out of bounds: ", ", max: ");
                        sbT.append(byteBufferDs.remaining());
                        throw new e(sbT.toString());
                    }
                    if (j9 > byteBufferDs.remaining()) {
                        StringBuilder sbS = androidx.camera.core.impl.a.s(j9, "Attributes end offset out of bounds: ", ", max: ");
                        sbS.append(byteBufferDs.remaining());
                        throw new e(sbS.toString());
                    }
                    this.nB = this.nx.c(j6);
                    this.nC = j == KeyboardMap.kValueMask ? "" : this.nx.c(j);
                    this.nD = i11;
                    this.nE = null;
                    this.nG = i10;
                    this.nF = a(byteBufferDs, j7, j9);
                    this.nz++;
                    this.nA = 3;
                    return 3;
                }
                if (iDu == 259) {
                    if (this.nx == null) {
                        throw new e("Named element encountered before string pool");
                    }
                    ByteBuffer byteBufferDs2 = bVarG.ds();
                    if (byteBufferDs2.remaining() < 8) {
                        throw new e("End element chunk too short. Need at least 8 bytes. Available: " + byteBufferDs2.remaining() + " bytes");
                    }
                    long j10 = ((long) byteBufferDs2.getInt()) & KeyboardMap.kValueMask;
                    this.nB = this.nx.c(((long) byteBufferDs2.getInt()) & KeyboardMap.kValueMask);
                    this.nC = j10 != KeyboardMap.kValueMask ? this.nx.c(j10) : "";
                    this.nA = 4;
                    this.nE = null;
                    this.nF = null;
                    return 4;
                }
                i = i4;
            } else {
                i = i4;
                if (this.ny != null) {
                    throw new e("Multiple resource maps not supported");
                }
                this.ny = new c(bVarG);
            }
            i4 = i;
        }
        this.nA = 2;
        return 2;
    }

    public final int h(int i) throws e {
        return l(i).m181do();
    }

    public final int i(int i) throws e {
        int iDp = l(i).dp();
        if (iDp == 1) {
            return 3;
        }
        if (iDp == 3) {
            return 1;
        }
        switch (iDp) {
            case 16:
            case 17:
                return 2;
            case 18:
                return 4;
            default:
                return 0;
        }
    }

    public final int j(int i) throws e {
        return l(i).dq();
    }

    public final String k(int i) throws e {
        return l(i).dr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer a(ByteBuffer byteBuffer, int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "start: "));
        }
        if (i4 >= i) {
            int iCapacity = byteBuffer.capacity();
            if (i4 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i4);
                    byteBuffer.position(i);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i4, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i4, i, "end < start: ", " < "));
    }

    public static /* synthetic */ long a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & KeyboardMap.kValueMask;
    }
}
