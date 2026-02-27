package jf;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import of.C1976a;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of.n f17742b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17741a = new ArrayList();
    public a[] e = new a[8];
    public int f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17744g = 0;
    public int h = 0;
    public final int c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17743d = 4096;

    public b(p pVar) {
        Logger logger = of.k.f18829a;
        this.f17742b = new of.n(pVar);
    }

    public final int a(int i, int i4) {
        int i6 = i & i4;
        if (i6 < i4) {
            return i6;
        }
        int i10 = 0;
        while (true) {
            byte b8 = this.f17742b.readByte();
            int i11 = b8 & 255;
            if ((b8 & 128) == 0) {
                return i4 + (i11 << i10);
            }
            i4 += (b8 & 127) << i10;
            i10 += 7;
        }
    }

    public final void b(a aVar) {
        this.f17741a.add(aVar);
        int i = this.f17743d;
        int i4 = aVar.c;
        if (i4 > i) {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.f17744g = 0;
            this.h = 0;
            return;
        }
        c((this.h + i4) - i);
        int i6 = this.f17744g + 1;
        a[] aVarArr = this.e;
        if (i6 > aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
            this.f = this.e.length - 1;
            this.e = aVarArr2;
        }
        int i10 = this.f;
        this.f = i10 - 1;
        this.e[i10] = aVar;
        this.f17744g++;
        this.h += i4;
    }

    public final int c(int i) {
        int i4;
        int i6 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i4 = this.f;
                if (length < i4 || i <= 0) {
                    break;
                }
                int i10 = this.e[length].c;
                i -= i10;
                this.h -= i10;
                this.f17744g--;
                i6++;
            }
            a[] aVarArr = this.e;
            int i11 = i4 + 1;
            System.arraycopy(aVarArr, i11, aVarArr, i11 + i6, this.f17744g);
            this.f += i6;
        }
        return i6;
    }

    public final C1976a d() {
        int i;
        of.n nVar = this.f17742b;
        byte b8 = nVar.readByte();
        int i4 = b8 & 255;
        boolean z4 = (b8 & 128) == 128;
        int iA = a(i4, 127);
        if (!z4) {
            return nVar.c(iA);
        }
        v vVar = v.f17807d;
        long j = iA;
        if (!nVar.f(j)) {
            throw new EOFException();
        }
        byte[] bArrY = nVar.f18833a.y(j);
        vVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Ff.f fVar = vVar.f17808a;
        Ff.f fVar2 = fVar;
        int i6 = 0;
        int i10 = 0;
        for (byte b10 : bArrY) {
            i6 = (i6 << 8) | (b10 & 255);
            i10 += 8;
            while (i10 >= 8) {
                fVar2 = ((Ff.f[]) fVar2.f1582d)[(i6 >>> (i10 - 8)) & 255];
                if (((Ff.f[]) fVar2.f1582d) == null) {
                    byteArrayOutputStream.write(fVar2.f1581b);
                    i10 -= fVar2.c;
                    fVar2 = fVar;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            Ff.f fVar3 = ((Ff.f[]) fVar2.f1582d)[(i6 << (8 - i10)) & 255];
            if (((Ff.f[]) fVar3.f1582d) != null || (i = fVar3.c) > i10) {
                break;
            }
            byteArrayOutputStream.write(fVar3.f1581b);
            i10 -= i;
            fVar2 = fVar;
        }
        return C1976a.g(byteArrayOutputStream.toByteArray());
    }

    public final C1976a e(int i) throws IOException {
        if (i >= 0) {
            a[] aVarArr = c.f17745a;
            if (i <= aVarArr.length - 1) {
                return aVarArr[i].f17739a;
            }
        }
        int length = this.f + 1 + (i - c.f17745a.length);
        if (length >= 0) {
            a[] aVarArr2 = this.e;
            if (length < aVarArr2.length) {
                return aVarArr2[length].f17739a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }
}
