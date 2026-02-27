package R1;

import java.io.Serializable;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Serializable {
    public static final a c = new a(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5429b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f5428a = iArr;
        this.f5429b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i = aVar.f5429b;
            int i4 = this.f5429b;
            if (i4 == i) {
                for (int i6 = 0; i6 < i4; i6++) {
                    i.k(i6, i4);
                    int i10 = this.f5428a[i6];
                    i.k(i6, aVar.f5429b);
                    if (i10 == aVar.f5428a[i6]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f5429b; i4++) {
            i = (i * 31) + this.f5428a[i4];
        }
        return i;
    }

    public final String toString() {
        int i = this.f5429b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i * 5);
        sb2.append('[');
        int[] iArr = this.f5428a;
        sb2.append(iArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb2.append(", ");
            sb2.append(iArr[i4]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
