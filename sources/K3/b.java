package K3;

import com.dynatrace.android.agent.Global;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2590b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2591d;

    public b(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f2589a = i;
        this.f2590b = i4;
        int i6 = (i + 31) / 32;
        this.c = i6;
        this.f2591d = new int[i6 * i4];
    }

    public final void a(int i, int i4) {
        int i6 = (i / 32) + (i4 * this.c);
        int[] iArr = this.f2591d;
        iArr[i6] = (1 << (i & 31)) ^ iArr[i6];
    }

    public final boolean b(int i, int i4) {
        return ((this.f2591d[(i / 32) + (i4 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    public final int[] c() {
        int[] iArr = this.f2591d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.c;
        int i4 = length / i;
        int i6 = (length % i) << 5;
        int i10 = iArr[length];
        int i11 = 31;
        while ((i10 >>> i11) == 0) {
            i11--;
        }
        return new int[]{i6 + i11, i4};
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f2591d.clone();
        return new b(this.f2589a, this.f2590b, this.c, iArr);
    }

    public final a d(a aVar, int i) {
        int i4 = aVar.f2588b;
        int i6 = this.f2589a;
        if (i4 < i6) {
            aVar = new a(i6);
        } else {
            int length = aVar.f2587a.length;
            for (int i10 = 0; i10 < length; i10++) {
                aVar.f2587a[i10] = 0;
            }
        }
        int i11 = this.c;
        int i12 = i * i11;
        for (int i13 = 0; i13 < i11; i13++) {
            aVar.f2587a[(i13 << 5) / 32] = this.f2591d[i12 + i13];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i = 0;
        int i4 = 0;
        while (true) {
            iArr = this.f2591d;
            if (i4 >= iArr.length || iArr[i4] != 0) {
                break;
            }
            i4++;
        }
        if (i4 == iArr.length) {
            return null;
        }
        int i6 = this.c;
        int i10 = i4 / i6;
        int i11 = (i4 % i6) << 5;
        while ((iArr[i4] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i11 + i, i10};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2589a == bVar.f2589a && this.f2590b == bVar.f2590b && this.c == bVar.c && Arrays.equals(this.f2591d, bVar.f2591d);
    }

    public final void f(int i, int i4) {
        int i6 = (i / 32) + (i4 * this.c);
        int[] iArr = this.f2591d;
        iArr[i6] = (1 << (i & 31)) | iArr[i6];
    }

    public final void g(int i, int i4, int i6, int i10) {
        if (i4 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i10 <= 0 || i6 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i11 = i6 + i;
        int i12 = i10 + i4;
        if (i12 > this.f2590b || i11 > this.f2589a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i4 < i12) {
            int i13 = this.c * i4;
            for (int i14 = i; i14 < i11; i14++) {
                int i15 = (i14 / 32) + i13;
                int[] iArr = this.f2591d;
                iArr[i15] = iArr[i15] | (1 << (i14 & 31));
            }
            i4++;
        }
    }

    public final int hashCode() {
        int i = this.f2589a;
        return Arrays.hashCode(this.f2591d) + (((((((i * 31) + i) * 31) + this.f2590b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i = this.f2589a;
        int i4 = this.f2590b;
        StringBuilder sb2 = new StringBuilder((i + 1) * i4);
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i10 = 0; i10 < i; i10++) {
                sb2.append(b(i10, i6) ? "X " : "  ");
            }
            sb2.append(Global.NEWLINE);
        }
        return sb2.toString();
    }

    public b(int i, int i4, int i6, int[] iArr) {
        this.f2589a = i;
        this.f2590b = i4;
        this.c = i6;
        this.f2591d = iArr;
    }
}
