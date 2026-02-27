package of;

import dOYHB6.tiZVw8.numX49;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: of.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1976a implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f18813d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C1976a e = g(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f18815b;
    public transient String c;

    public C1976a(byte[] bArr) {
        this.f18814a = bArr;
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQuPV") + c);
    }

    public static C1976a c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPS").concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (a(str.charAt(i4 + 1)) + (a(str.charAt(i4)) << 4));
        }
        return g(bArr);
    }

    public static C1976a d(String str) {
        if (str == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPj"));
        }
        C1976a c1976a = new C1976a(str.getBytes(v.f18845a));
        c1976a.c = str;
        return c1976a;
    }

    public static C1976a g(byte... bArr) {
        if (bArr != null) {
            return new C1976a((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQuPd"));
    }

    public void b(e eVar) {
        byte[] bArr = this.f18814a;
        eVar.k(bArr.length, bArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1976a c1976a = (C1976a) obj;
        int size = size();
        int size2 = c1976a.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iE = e(i) & 255;
            int iE2 = c1976a.e(i) & 255;
            if (iE != iE2) {
                return iE < iE2 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public byte e(int i) {
        return this.f18814a[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1976a) {
            C1976a c1976a = (C1976a) obj;
            int size = c1976a.size();
            byte[] bArr = this.f18814a;
            if (size == bArr.length && c1976a.h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f18814a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b8 : bArr) {
            int i4 = i + 1;
            char[] cArr2 = f18813d;
            cArr[i] = cArr2[(b8 >> 4) & 15];
            i += 2;
            cArr[i4] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public boolean h(int i, byte[] bArr, int i4, int i6) {
        if (i >= 0) {
            byte[] bArr2 = this.f18814a;
            if (i <= bArr2.length - i6 && i4 >= 0 && i4 <= bArr.length - i6) {
                Charset charset = v.f18845a;
                for (int i10 = 0; i10 < i6; i10++) {
                    if (bArr2[i10 + i] == bArr[i10 + i4]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f18815b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f18814a);
        this.f18815b = iHashCode;
        return iHashCode;
    }

    public boolean i(C1976a c1976a, int i) {
        return c1976a.h(0, this.f18814a, 0, i);
    }

    public C1976a j() {
        byte[] bArr = this.f18814a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(We.s.o(new StringBuilder(numX49.tnTj78("bQuPi")), numX49.tnTj78("bQuPE"), bArr.length));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C1976a(bArr2);
    }

    public C1976a k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f18814a;
            if (i >= bArr.length) {
                return this;
            }
            byte b8 = bArr[i];
            if (b8 >= 65 && b8 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b8 + 32);
                for (int i4 = i + 1; i4 < bArr2.length; i4++) {
                    byte b10 = bArr2[i4];
                    if (b10 >= 65 && b10 <= 90) {
                        bArr2[i4] = (byte) (b10 + 32);
                    }
                }
                return new C1976a(bArr2);
            }
            i++;
        }
    }

    public String l() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f18814a, v.f18845a);
        this.c = str2;
        return str2;
    }

    public int size() {
        return this.f18814a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.C1976a.toString():java.lang.String");
    }
}
