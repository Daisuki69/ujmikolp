package Af;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Closeable, Cloneable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f263b;
    public byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f264d;
    public int e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f265g;
    public int h;

    public final void b() throws IOException {
        if (this.c == null) {
            throw new IOException("RandomAccessBuffer already closed");
        }
    }

    public final int c(int i, int i4, byte[] bArr) {
        int iMin = (int) Math.min(i4, this.f - this.f264d);
        int i6 = this.e;
        int i10 = this.f262a - i6;
        if (i10 == 0) {
            return 0;
        }
        if (iMin >= i10) {
            System.arraycopy(this.c, i6, bArr, i, i10);
            this.e += i10;
            this.f264d += (long) i10;
            return i10;
        }
        System.arraycopy(this.c, i6, bArr, i, iMin);
        this.e += iMin;
        this.f264d += (long) iMin;
        return iMin;
    }

    public final Object clone() {
        a aVar = new a();
        aVar.f262a = 1024;
        aVar.f263b = null;
        ArrayList arrayList = new ArrayList();
        aVar.f263b = arrayList;
        int i = this.f262a;
        aVar.f262a = i;
        byte[] bArr = new byte[i];
        aVar.c = bArr;
        arrayList.add(bArr);
        aVar.f264d = 0L;
        aVar.e = 0;
        aVar.f = 0L;
        aVar.f265g = 0;
        aVar.h = 0;
        aVar.f263b = new ArrayList(this.f263b.size());
        for (byte[] bArr2 : this.f263b) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            aVar.f263b.add(bArr3);
        }
        if (this.c != null) {
            aVar.c = (byte[]) androidx.camera.core.impl.a.b(1, aVar.f263b);
        } else {
            aVar.c = null;
        }
        aVar.f264d = this.f264d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.f265g = this.f265g;
        aVar.h = this.h;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = null;
        this.f263b.clear();
        this.f264d = 0L;
        this.e = 0;
        this.f = 0L;
        this.f265g = 0;
    }

    public final void f(int i) throws IOException {
        b();
        b();
        g(this.f264d - ((long) i));
    }

    public final void g(long j) throws IOException {
        b();
        if (j < 0) {
            throw new IOException(androidx.camera.core.impl.a.f(j, "Invalid position "));
        }
        this.f264d = j;
        long j6 = this.f;
        int i = this.f262a;
        if (j >= j6) {
            int i4 = this.h;
            this.f265g = i4;
            this.c = (byte[]) this.f263b.get(i4);
            this.e = (int) (this.f % ((long) i));
            return;
        }
        long j7 = i;
        int i6 = (int) (j / j7);
        this.f265g = i6;
        this.e = (int) (j % j7);
        this.c = (byte[]) this.f263b.get(i6);
    }

    public final int peek() throws IOException {
        int i = read();
        if (i != -1) {
            f(1);
        }
        return i;
    }

    public final int read() throws IOException {
        b();
        if (this.f264d >= this.f) {
            return -1;
        }
        if (this.e >= this.f262a) {
            int i = this.f265g;
            if (i >= this.h) {
                return -1;
            }
            ArrayList arrayList = this.f263b;
            int i4 = i + 1;
            this.f265g = i4;
            this.c = (byte[]) arrayList.get(i4);
            this.e = 0;
        }
        this.f264d++;
        byte[] bArr = this.c;
        int i6 = this.e;
        this.e = i6 + 1;
        return bArr[i6] & 255;
    }

    public final boolean v() throws IOException {
        b();
        return this.f264d >= this.f;
    }

    public final int read(byte[] bArr, int i, int i4) throws IOException {
        b();
        if (this.f264d >= this.f) {
            return -1;
        }
        int iC = c(i, i4, bArr);
        while (iC < i4) {
            b();
            long j = this.f;
            b();
            if (((int) Math.min(j - this.f264d, 2147483647L)) <= 0) {
                break;
            }
            iC += c(i + iC, i4 - iC, bArr);
            if (this.e == this.f262a) {
                int i6 = this.f265g;
                if (i6 != this.h) {
                    this.e = 0;
                    ArrayList arrayList = this.f263b;
                    int i10 = i6 + 1;
                    this.f265g = i10;
                    this.c = (byte[]) arrayList.get(i10);
                } else {
                    throw new IOException("No more chunks available, end of buffer reached");
                }
            }
        }
        return iC;
    }
}
