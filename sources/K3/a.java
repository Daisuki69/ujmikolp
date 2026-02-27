package K3;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f2587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2588b;

    public a() {
        this.f2588b = 0;
        this.f2587a = new int[1];
    }

    public final void a(boolean z4) {
        c(this.f2588b + 1);
        if (z4) {
            int[] iArr = this.f2587a;
            int i = this.f2588b;
            int i4 = i / 32;
            iArr[i4] = (1 << (i & 31)) | iArr[i4];
        }
        this.f2588b++;
    }

    public final void b(int i, int i4) {
        if (i4 < 0 || i4 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f2588b + i4);
        while (i4 > 0) {
            boolean z4 = true;
            if (((i >> (i4 - 1)) & 1) != 1) {
                z4 = false;
            }
            a(z4);
            i4--;
        }
    }

    public final void c(int i) {
        int[] iArr = this.f2587a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f2587a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f2587a.clone();
        int i = this.f2588b;
        a aVar = new a();
        aVar.f2587a = iArr;
        aVar.f2588b = i;
        return aVar;
    }

    public final boolean d(int i) {
        return ((1 << (i & 31)) & this.f2587a[i / 32]) != 0;
    }

    public final int e(int i) {
        int i4 = this.f2588b;
        if (i >= i4) {
            return i4;
        }
        int i6 = i / 32;
        int i10 = (~((1 << (i & 31)) - 1)) & this.f2587a[i6];
        while (i10 == 0) {
            i6++;
            int[] iArr = this.f2587a;
            if (i6 == iArr.length) {
                return this.f2588b;
            }
            i10 = iArr[i6];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + (i6 << 5);
        int i11 = this.f2588b;
        return iNumberOfTrailingZeros > i11 ? i11 : iNumberOfTrailingZeros;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2588b == aVar.f2588b && Arrays.equals(this.f2587a, aVar.f2587a);
    }

    public final int f(int i) {
        int i4 = this.f2588b;
        if (i >= i4) {
            return i4;
        }
        int i6 = i / 32;
        int i10 = (~((1 << (i & 31)) - 1)) & (~this.f2587a[i6]);
        while (i10 == 0) {
            i6++;
            int[] iArr = this.f2587a;
            if (i6 == iArr.length) {
                return this.f2588b;
            }
            i10 = ~iArr[i6];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + (i6 << 5);
        int i11 = this.f2588b;
        return iNumberOfTrailingZeros > i11 ? i11 : iNumberOfTrailingZeros;
    }

    public final int g() {
        return (this.f2588b + 7) / 8;
    }

    public final boolean h(int i, int i4) {
        if (i4 < i || i < 0 || i4 > this.f2588b) {
            throw new IllegalArgumentException();
        }
        if (i4 != i) {
            int i6 = i4 - 1;
            int i10 = i / 32;
            int i11 = i6 / 32;
            int i12 = i10;
            while (i12 <= i11) {
                if ((((2 << (i12 >= i11 ? 31 & i6 : 31)) - (1 << (i12 > i10 ? 0 : i & 31))) & this.f2587a[i12]) != 0) {
                    return false;
                }
                i12++;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2587a) + (this.f2588b * 31);
    }

    public final void i() {
        int[] iArr = new int[this.f2587a.length];
        int i = (this.f2588b - 1) / 32;
        int i4 = i + 1;
        for (int i6 = 0; i6 < i4; i6++) {
            long j = this.f2587a[i6];
            long j6 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j7 = ((j6 & 858993459) << 2) | ((j6 >> 2) & 858993459);
            long j9 = ((j7 & 252645135) << 4) | ((j7 >> 4) & 252645135);
            long j10 = ((j9 & 16711935) << 8) | ((j9 >> 8) & 16711935);
            iArr[i - i6] = (int) (((j10 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j10 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i10 = this.f2588b;
        int i11 = i4 << 5;
        if (i10 != i11) {
            int i12 = i11 - i10;
            int i13 = iArr[0] >>> i12;
            for (int i14 = 1; i14 < i4; i14++) {
                int i15 = iArr[i14];
                iArr[i14 - 1] = i13 | (i15 << (32 - i12));
                i13 = i15 >>> i12;
            }
            iArr[i] = i13;
        }
        this.f2587a = iArr;
    }

    public final void j(int i) {
        int[] iArr = this.f2587a;
        int i4 = i / 32;
        iArr[i4] = (1 << (i & 31)) | iArr[i4];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f2588b);
        for (int i = 0; i < this.f2588b; i++) {
            if ((i & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int i) {
        this.f2588b = i;
        this.f2587a = new int[(i + 31) / 32];
    }
}
