package We;

import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import of.C1976a;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6351b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6352d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6353g;
    public Object h;

    public void a(int i) {
        int i4;
        if (i > 0) {
            int length = ((jf.a[]) this.h).length - 1;
            int i6 = 0;
            while (true) {
                i4 = this.f6352d;
                if (length < i4 || i <= 0) {
                    break;
                }
                int i10 = ((jf.a[]) this.h)[length].c;
                i -= i10;
                this.f -= i10;
                this.e--;
                i6++;
                length--;
            }
            jf.a[] aVarArr = (jf.a[]) this.h;
            int i11 = i4 + 1;
            System.arraycopy(aVarArr, i11, aVarArr, i11 + i6, this.e);
            jf.a[] aVarArr2 = (jf.a[]) this.h;
            int i12 = this.f6352d + 1;
            Arrays.fill(aVarArr2, i12, i12 + i6, (Object) null);
            this.f6352d += i6;
        }
    }

    public void b(int i, int i4, int i6) {
        of.e eVar = (of.e) this.f6353g;
        if (i < i4) {
            eVar.t(i | i6);
            return;
        }
        eVar.t(i6 | i4);
        int i10 = i - i4;
        while (i10 >= 128) {
            eVar.t(128 | (i10 & 127));
            i10 >>>= 7;
        }
        eVar.t(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: We.E.c(java.util.ArrayList):void");
    }

    public void d(jf.a aVar) {
        int i = this.c;
        int i4 = aVar.c;
        if (i4 > i) {
            Arrays.fill((jf.a[]) this.h, (Object) null);
            this.f6352d = ((jf.a[]) this.h).length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i4) - i);
        int i6 = this.e + 1;
        jf.a[] aVarArr = (jf.a[]) this.h;
        if (i6 > aVarArr.length) {
            jf.a[] aVarArr2 = new jf.a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
            this.f6352d = ((jf.a[]) this.h).length - 1;
            this.h = aVarArr2;
        }
        int i10 = this.f6352d;
        this.f6352d = i10 - 1;
        ((jf.a[]) this.h)[i10] = aVar;
        this.e++;
        this.f += i4;
    }

    public void e(C1976a c1976a) {
        jf.v.f17807d.getClass();
        long j = 0;
        long j6 = 0;
        for (int i = 0; i < c1976a.size(); i++) {
            j6 += (long) jf.v.c[c1976a.e(i) & 255];
        }
        int i4 = (int) ((j6 + 7) >> 3);
        int size = c1976a.size();
        of.e eVar = (of.e) this.f6353g;
        if (i4 >= size) {
            b(c1976a.size(), 127, 0);
            c1976a.b(eVar);
            return;
        }
        of.e eVar2 = new of.e();
        jf.v.f17807d.getClass();
        int i6 = 0;
        for (int i10 = 0; i10 < c1976a.size(); i10++) {
            int iE = c1976a.e(i10) & 255;
            int i11 = jf.v.f17806b[iE];
            byte b8 = jf.v.c[iE];
            j = (j << b8) | ((long) i11);
            i6 += b8;
            while (i6 >= 8) {
                i6 -= 8;
                eVar2.t((int) (j >> i6));
            }
        }
        if (i6 > 0) {
            eVar2.t((int) ((j << (8 - i6)) | ((long) (255 >>> i6))));
        }
        byte[] bArrX = eVar2.x();
        C1976a c1976a2 = new C1976a(bArrX);
        b(bArrX.length, 127, 128);
        c1976a2.b(eVar);
    }

    public void f(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRPy"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRP3"));
        }
        if (i4 == 0 && i == 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRPG"));
        }
        this.c = i;
        this.f6352d = i4;
    }
}
