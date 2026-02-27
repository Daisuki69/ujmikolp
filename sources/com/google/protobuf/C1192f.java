package com.google.protobuf;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1192f implements Iterable, Serializable {
    public static final C1192f c = new C1192f(AbstractC1207v.f10125b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10091a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10092b;

    static {
        Class cls = AbstractC1189c.f10081a;
    }

    public C1192f(byte[] bArr) {
        bArr.getClass();
        this.f10092b = bArr;
    }

    public static int c(int i, int i4, int i6) {
        int i10 = i4 - i;
        if ((i | i4 | i10 | (i6 - i4)) >= 0) {
            return i10;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(We.s.g(i, "Beginning index: ", " < 0"));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.c(i, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.c(i4, i6, "End index: ", " >= "));
    }

    public byte a(int i) {
        return this.f10092b[i];
    }

    public int d() {
        return 0;
    }

    public byte e(int i) {
        return this.f10092b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1192f) || size() != ((C1192f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1192f)) {
            return obj.equals(this);
        }
        C1192f c1192f = (C1192f) obj;
        int i = this.f10091a;
        int i4 = c1192f.f10091a;
        if (i != 0 && i4 != 0 && i != i4) {
            return false;
        }
        int size = size();
        if (size > c1192f.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1192f.size()) {
            StringBuilder sbT = We.s.t(size, "Ran off end of other: 0, ", ", ");
            sbT.append(c1192f.size());
            throw new IllegalArgumentException(sbT.toString());
        }
        int iD = d() + size;
        int iD2 = d();
        int iD3 = c1192f.d();
        while (iD2 < iD) {
            if (this.f10092b[iD2] != c1192f.f10092b[iD3]) {
                return false;
            }
            iD2++;
            iD3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f10091a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iD = d();
        int i4 = size;
        for (int i6 = iD; i6 < iD + size; i6++) {
            i4 = (i4 * 31) + this.f10092b[i6];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f10091a = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1190d(this);
    }

    public int size() {
        return this.f10092b.length;
    }

    public final String toString() {
        C1192f c1191e;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = b0.b(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iC = c(0, 47, size());
            if (iC == 0) {
                c1191e = c;
            } else {
                c1191e = new C1191e(this.f10092b, d(), iC);
            }
            sb2.append(b0.b(c1191e));
            sb2.append("...");
            string = sb2.toString();
        }
        return We.s.p(androidx.camera.core.impl.a.r(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
