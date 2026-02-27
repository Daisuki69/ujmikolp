package T3;

import M8.T2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5765b = {'T', 'N', '*', 'E'};
    public static final char[] c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f5766d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f5764a = cArr;
        f5766d = cArr[0];
    }

    @Override // M8.T2
    public final boolean[] n(String str) {
        int i;
        int length = str.length();
        char c10 = f5766d;
        if (length < 2) {
            str = c10 + str + c10;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f5764a;
            boolean zG = a.g(cArr, upperCase);
            boolean zG2 = a.g(cArr, upperCase2);
            char[] cArr2 = f5765b;
            boolean zG3 = a.g(cArr2, upperCase);
            boolean zG4 = a.g(cArr2, upperCase2);
            if (zG) {
                if (!zG2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zG3) {
                if (zG2 || zG4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c10 + str + c10;
            } else if (!zG4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i4 = 20;
        for (int i6 = 1; i6 < str.length() - 1; i6++) {
            if (Character.isDigit(str.charAt(i6)) || str.charAt(i6) == '-' || str.charAt(i6) == '$') {
                i4 += 9;
            } else {
                if (!a.g(c, str.charAt(i6))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i6) + '\'');
                }
                i4 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i4];
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i11));
            if (i11 == 0 || i11 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i12 = 0;
            while (true) {
                char[] cArr3 = a.f5761d;
                if (i12 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i12]) {
                    i = a.e[i12];
                    break;
                }
                i12++;
            }
            int i13 = 0;
            int i14 = 0;
            boolean z4 = true;
            while (i13 < 7) {
                zArr[i10] = z4;
                i10++;
                if (((i >> (6 - i13)) & 1) == 0 || i14 == 1) {
                    z4 = !z4;
                    i13++;
                    i14 = 0;
                } else {
                    i14++;
                }
            }
            if (i11 < str.length() - 1) {
                zArr[i10] = false;
                i10++;
            }
        }
        return zArr;
    }
}
