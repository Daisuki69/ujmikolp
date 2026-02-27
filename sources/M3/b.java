package M3;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3058b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f3057a = aVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f3058b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f3058b = new int[]{0};
            return;
        }
        int i4 = length - i;
        int[] iArr2 = new int[i4];
        this.f3058b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i4);
    }

    public final b a(b bVar) {
        a aVar = bVar.f3057a;
        a aVar2 = this.f3057a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return bVar;
        }
        if (bVar.e()) {
            return this;
        }
        int[] iArr = this.f3058b;
        int length = iArr.length;
        int[] iArr2 = bVar.f3058b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i = length2; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length2] ^ iArr[i];
        }
        return new b(aVar2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.f3058b;
        if (i != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i4 = 1; i4 < length; i4++) {
                iC = this.f3057a.c(i, iC) ^ iArr[i4];
            }
            return iC;
        }
        int i6 = 0;
        for (int i10 : iArr) {
            a aVar = a.h;
            i6 ^= i10;
        }
        return i6;
    }

    public final int c(int i) {
        return this.f3058b[(r0.length - 1) - i];
    }

    public final int d() {
        return this.f3058b.length - 1;
    }

    public final boolean e() {
        return this.f3058b[0] == 0;
    }

    public final b f(int i) {
        a aVar = this.f3057a;
        if (i == 0) {
            return aVar.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.f3058b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = aVar.c(iArr[i4], i);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f3057a;
        a aVar2 = this.f3057a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || bVar.e()) {
            return aVar2.c;
        }
        int[] iArr = this.f3058b;
        int length = iArr.length;
        int[] iArr2 = bVar.f3058b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i4 = iArr[i];
            for (int i6 = 0; i6 < length2; i6++) {
                int i10 = i + i6;
                iArr3[i10] = iArr3[i10] ^ aVar2.c(i4, iArr2[i6]);
            }
        }
        return new b(aVar2, iArr3);
    }

    public final b h(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        a aVar = this.f3057a;
        if (i4 == 0) {
            return aVar.c;
        }
        int[] iArr = this.f3058b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr2[i6] = aVar.c(iArr[i6], i4);
        }
        return new b(aVar, iArr2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb2.append(" - ");
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    a aVar = this.f3057a;
                    if (iC == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i = aVar.f3054b[iC];
                    if (i == 0) {
                        sb2.append('1');
                    } else if (i == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iD);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
