package G3;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final e e = new e(f.f1711b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1709b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1710d;

    public e(f fVar, int i, int i4, int i6) {
        this.f1709b = fVar;
        this.f1708a = i;
        this.c = i4;
        this.f1710d = i6;
    }

    public final e a(int i) {
        f dVar = this.f1709b;
        int i4 = this.f1708a;
        int i6 = this.f1710d;
        if (i4 == 4 || i4 == 2) {
            int[] iArr = c.c[i4];
            i4 = 0;
            int i10 = iArr[0];
            int i11 = 65535 & i10;
            int i12 = i10 >> 16;
            dVar.getClass();
            i6 += i12;
            dVar = new d(dVar, i11, i12);
        }
        int i13 = this.c;
        int i14 = (i13 == 0 || i13 == 31) ? 18 : i13 == 62 ? 9 : 8;
        int i15 = i13 + 1;
        e eVar = new e(dVar, i4, i15, i6 + i14);
        return i15 == 2078 ? eVar.b(i + 1) : eVar;
    }

    public final e b(int i) {
        int i4 = this.c;
        if (i4 == 0) {
            return this;
        }
        f fVar = this.f1709b;
        fVar.getClass();
        return new e(new a(fVar, i - i4, i4), this.f1708a, 0, this.f1710d);
    }

    public final boolean c(e eVar) {
        int i;
        int i4 = this.f1710d + (c.c[this.f1708a][eVar.f1708a] >> 16);
        int i6 = eVar.c;
        if (i6 > 0 && ((i = this.c) == 0 || i > i6)) {
            i4 += 10;
        }
        return i4 <= eVar.f1710d;
    }

    public final e d(int i, int i4) {
        int i6 = this.f1710d;
        f dVar = this.f1709b;
        int i10 = this.f1708a;
        if (i != i10) {
            int i11 = c.c[i10][i];
            int i12 = 65535 & i11;
            int i13 = i11 >> 16;
            dVar.getClass();
            i6 += i13;
            dVar = new d(dVar, i12, i13);
        }
        int i14 = i == 2 ? 4 : 5;
        dVar.getClass();
        return new e(new d(dVar, i4, i14), i, 0, i6 + i14);
    }

    public final e e(int i, int i4) {
        int i6 = this.f1708a;
        int i10 = i6 == 2 ? 4 : 5;
        int i11 = c.e[i6][i];
        f fVar = this.f1709b;
        fVar.getClass();
        return new e(new d(new d(fVar, i11, i10), i4, 5), i6, 0, this.f1710d + i10 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f1704b[this.f1708a], Integer.valueOf(this.f1710d), Integer.valueOf(this.c));
    }
}
