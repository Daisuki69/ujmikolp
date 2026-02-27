package T3;

import M8.T2;
import We.s;
import com.google.zxing.FormatException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5776a;

    public /* synthetic */ g(int i) {
        this.f5776a = i;
    }

    @Override // M8.T2, C3.n
    public final K3.b e(String str, C3.a aVar, int i, int i4, HashMap map) {
        switch (this.f5776a) {
            case 0:
                if (aVar == C3.a.h) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got " + aVar);
            case 1:
                if (aVar == C3.a.f692g) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got " + aVar);
            default:
                if (aVar == C3.a.f697p) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got " + aVar);
        }
    }

    @Override // M8.T2
    public final boolean[] n(String str) {
        switch (this.f5776a) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = str + o.p(str);
                    } catch (FormatException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    if (length != 13) {
                        throw new IllegalArgumentException(s.f(length, "Requested contents should be 12 or 13 digits long, but got "));
                    }
                    try {
                        if (!o.h(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int i = f.f5774k[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int iA = T2.a(zArr, 0, o.f5791d, true);
                for (int i4 = 1; i4 <= 6; i4++) {
                    int iDigit = Character.digit(str.charAt(i4), 10);
                    if (((i >> (6 - i4)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iA += T2.a(zArr, iA, o.h[iDigit], false);
                }
                int iA2 = T2.a(zArr, iA, o.e, false) + iA;
                for (int i6 = 7; i6 <= 12; i6++) {
                    iA2 += T2.a(zArr, iA2, o.f5792g[Character.digit(str.charAt(i6), 10)], true);
                }
                T2.a(zArr, iA2, o.f5791d, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = str + o.p(str);
                    } catch (FormatException e7) {
                        throw new IllegalArgumentException(e7);
                    }
                } else {
                    if (length2 != 8) {
                        throw new IllegalArgumentException(s.f(length2, "Requested contents should be 8 digits long, but got "));
                    }
                    try {
                        if (!o.h(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused2) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int iA3 = T2.a(zArr2, 0, o.f5791d, true);
                for (int i10 = 0; i10 <= 3; i10++) {
                    iA3 += T2.a(zArr2, iA3, o.f5792g[Character.digit(str.charAt(i10), 10)], false);
                }
                int iA4 = T2.a(zArr2, iA3, o.e, false) + iA3;
                for (int i11 = 4; i11 <= 7; i11++) {
                    iA4 += T2.a(zArr2, iA4, o.f5792g[Character.digit(str.charAt(i11), 10)], true);
                }
                T2.a(zArr2, iA4, o.f5791d, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = str + o.p(f.q(str));
                    } catch (FormatException e10) {
                        throw new IllegalArgumentException(e10);
                    }
                } else {
                    if (length3 != 8) {
                        throw new IllegalArgumentException(s.f(length3, "Requested contents should be 8 digits long, but got "));
                    }
                    try {
                        if (!o.h(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused3) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 != 0 && iDigit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i12 = f.m[iDigit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int iA5 = T2.a(zArr3, 0, o.f5791d, true);
                for (int i13 = 1; i13 <= 6; i13++) {
                    int iDigit3 = Character.digit(str.charAt(i13), 10);
                    if (((i12 >> (6 - i13)) & 1) == 1) {
                        iDigit3 += 10;
                    }
                    iA5 += T2.a(zArr3, iA5, o.h[iDigit3], false);
                }
                T2.a(zArr3, iA5, o.f, false);
                return zArr3;
        }
    }

    @Override // M8.T2
    public final int r() {
        return 9;
    }
}
