package of;

import dOYHB6.tiZVw8.numX49;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends C1976a {
    public final transient byte[][] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f18841g;

    public q(e eVar, int i) {
        super(null);
        v.b(eVar.f18822b, 0L, i);
        o oVar = eVar.f18821a;
        int i4 = 0;
        int i6 = 0;
        int i10 = 0;
        while (i6 < i) {
            int i11 = oVar.c;
            int i12 = oVar.f18836b;
            if (i11 == i12) {
                throw new AssertionError(numX49.tnTj78("bQuP5"));
            }
            i6 += i11 - i12;
            i10++;
            oVar = oVar.f;
        }
        this.f = new byte[i10][];
        this.f18841g = new int[i10 * 2];
        o oVar2 = eVar.f18821a;
        int i13 = 0;
        while (i4 < i) {
            byte[][] bArr = this.f;
            bArr[i13] = oVar2.f18835a;
            int i14 = oVar2.c;
            int i15 = oVar2.f18836b;
            int i16 = (i14 - i15) + i4;
            i4 = i16 > i ? i : i16;
            int[] iArr = this.f18841g;
            iArr[i13] = i4;
            iArr[bArr.length + i13] = i15;
            oVar2.f18837d = true;
            i13++;
            oVar2 = oVar2.f;
        }
    }

    @Override // of.C1976a
    public final void b(e eVar) {
        byte[][] bArr = this.f;
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr = this.f18841g;
            int i6 = iArr[length + i];
            int i10 = iArr[i];
            o oVar = new o(bArr[i], i6, (i6 + i10) - i4);
            o oVar2 = eVar.f18821a;
            if (oVar2 == null) {
                oVar.f18838g = oVar;
                oVar.f = oVar;
                eVar.f18821a = oVar;
            } else {
                oVar2.f18838g.b(oVar);
            }
            i++;
            i4 = i10;
        }
        eVar.f18822b += (long) i4;
    }

    @Override // of.C1976a
    public final byte e(int i) {
        byte[][] bArr = this.f;
        int length = bArr.length - 1;
        int[] iArr = this.f18841g;
        v.b(iArr[length], i, 1L);
        int iN = n(i);
        return bArr[iN][(i - (iN == 0 ? 0 : iArr[iN - 1])) + iArr[bArr.length + iN]];
    }

    @Override // of.C1976a
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1976a)) {
            return false;
        }
        C1976a c1976a = (C1976a) obj;
        return c1976a.size() == size() && i(c1976a, size());
    }

    @Override // of.C1976a
    public final String f() {
        return o().f();
    }

    @Override // of.C1976a
    public final boolean h(int i, byte[] bArr, int i4, int i6) {
        if (i >= 0 && i <= size() - i6 && i4 >= 0 && i4 <= bArr.length - i6) {
            int iN = n(i);
            while (i6 > 0) {
                int[] iArr = this.f18841g;
                int i10 = iN == 0 ? 0 : iArr[iN - 1];
                int iMin = Math.min(i6, ((iArr[iN] - i10) + i10) - i);
                byte[][] bArr2 = this.f;
                int i11 = (i - i10) + iArr[bArr2.length + iN];
                byte[] bArr3 = bArr2[iN];
                Charset charset = v.f18845a;
                for (int i12 = 0; i12 < iMin; i12++) {
                    if (bArr3[i12 + i11] == bArr[i12 + i4]) {
                    }
                }
                i += iMin;
                i4 += iMin;
                i6 -= iMin;
                iN++;
            }
            return true;
        }
        return false;
    }

    @Override // of.C1976a
    public final int hashCode() {
        int i = this.f18815b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f;
        int length = bArr.length;
        int i4 = 0;
        int i6 = 1;
        int i10 = 0;
        while (i4 < length) {
            byte[] bArr2 = bArr[i4];
            int[] iArr = this.f18841g;
            int i11 = iArr[length + i4];
            int i12 = iArr[i4];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i6 = (i6 * 31) + bArr2[i11];
                i11++;
            }
            i4++;
            i10 = i12;
        }
        this.f18815b = i6;
        return i6;
    }

    @Override // of.C1976a
    public final boolean i(C1976a c1976a, int i) {
        if (size() - i >= 0) {
            int iN = n(0);
            int i4 = 0;
            int i6 = 0;
            while (i > 0) {
                int[] iArr = this.f18841g;
                int i10 = iN == 0 ? 0 : iArr[iN - 1];
                int iMin = Math.min(i, ((iArr[iN] - i10) + i10) - i6);
                byte[][] bArr = this.f;
                if (c1976a.h(i4, bArr[iN], (i6 - i10) + iArr[bArr.length + iN], iMin)) {
                    i6 += iMin;
                    i4 += iMin;
                    i -= iMin;
                    iN++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // of.C1976a
    public final C1976a j() {
        return o().j();
    }

    @Override // of.C1976a
    public final C1976a k() {
        return o().k();
    }

    @Override // of.C1976a
    public final String l() {
        return o().l();
    }

    public final int n(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f18841g, 0, this.f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public final C1976a o() {
        byte[][] bArr = this.f;
        int length = bArr.length - 1;
        int[] iArr = this.f18841g;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length2) {
            int i6 = iArr[length2 + i];
            int i10 = iArr[i];
            System.arraycopy(bArr[i], i6, bArr2, i4, i10 - i4);
            i++;
            i4 = i10;
        }
        return new C1976a(bArr2);
    }

    @Override // of.C1976a
    public final int size() {
        return this.f18841g[this.f.length - 1];
    }

    @Override // of.C1976a
    public final String toString() {
        return o().toString();
    }
}
