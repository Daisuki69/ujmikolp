package T3;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5774k = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5775l = {1, 1, 1, 1, 1, 1};
    public static final int[][] m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final /* synthetic */ int i;
    public final Object j;

    public f(int i) {
        this.i = i;
        switch (i) {
            case 1:
                this.j = new int[4];
                break;
            case 2:
                this.j = new int[4];
                break;
            case 3:
                this.j = new f(0);
                break;
            default:
                this.j = new int[4];
                break;
        }
    }

    public static String q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    public static C3.j r(C3.j jVar) throws FormatException {
        String str = jVar.f719a;
        if (str.charAt(0) == '0') {
            return new C3.j(str.substring(1), null, jVar.c, C3.a.f696o);
        }
        throw FormatException.a();
    }

    @Override // T3.k, C3.i
    public C3.j a(A7.f fVar, EnumMap enumMap) {
        switch (this.i) {
            case 3:
                return r(((f) this.j).a(fVar, enumMap));
            default:
                return super.a(fVar, enumMap);
        }
    }

    @Override // T3.o, T3.k
    public C3.j b(int i, K3.a aVar, EnumMap enumMap) {
        switch (this.i) {
            case 3:
                return r(((f) this.j).b(i, aVar, enumMap));
            default:
                return super.b(i, aVar, enumMap);
        }
    }

    @Override // T3.o
    public boolean g(String str) {
        switch (this.i) {
            case 1:
                return o.h(q(str));
            default:
                return super.g(str);
        }
    }

    @Override // T3.o
    public int[] j(K3.a aVar, int i) {
        switch (this.i) {
            case 1:
                return o.m(aVar, i, true, f5775l, new int[6]);
            default:
                return super.j(aVar, i);
        }
    }

    @Override // T3.o
    public final int k(K3.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[][] iArr2;
        switch (this.i) {
            case 0:
                int[] iArr3 = (int[]) this.j;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i = aVar.f2588b;
                int i4 = iArr[1];
                int i6 = 0;
                for (int i10 = 0; i10 < 6 && i4 < i; i10++) {
                    int i11 = o.i(aVar, iArr3, i4, o.h);
                    sb2.append((char) ((i11 % 10) + 48));
                    for (int i12 : iArr3) {
                        i4 += i12;
                    }
                    if (i11 >= 10) {
                        i6 |= 1 << (5 - i10);
                    }
                }
                for (int i13 = 0; i13 < 10; i13++) {
                    if (i6 == f5774k[i13]) {
                        sb2.insert(0, (char) (i13 + 48));
                        int i14 = o.m(aVar, i4, true, o.e, new int[5])[1];
                        for (int i15 = 0; i15 < 6 && i14 < i; i15++) {
                            sb2.append((char) (o.i(aVar, iArr3, i14, o.f5792g) + 48));
                            for (int i16 : iArr3) {
                                i14 += i16;
                            }
                        }
                        return i14;
                    }
                }
                throw NotFoundException.c;
            case 1:
                int[] iArr4 = (int[]) this.j;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i17 = aVar.f2588b;
                int i18 = iArr[1];
                int i19 = 0;
                for (int i20 = 0; i20 < 6 && i18 < i17; i20++) {
                    int i21 = o.i(aVar, iArr4, i18, o.h);
                    sb2.append((char) ((i21 % 10) + 48));
                    for (int i22 : iArr4) {
                        i18 += i22;
                    }
                    if (i21 >= 10) {
                        i19 |= 1 << (5 - i20);
                    }
                }
                for (int i23 = 0; i23 <= 1; i23++) {
                    for (int i24 = 0; i24 < 10; i24++) {
                        if (i19 == m[i23][i24]) {
                            sb2.insert(0, (char) (i23 + 48));
                            sb2.append((char) (i24 + 48));
                            return i18;
                        }
                    }
                }
                throw NotFoundException.c;
            case 2:
                int[] iArr5 = (int[]) this.j;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i25 = aVar.f2588b;
                int i26 = iArr[1];
                int i27 = 0;
                while (true) {
                    iArr2 = o.f5792g;
                    if (i27 < 4 && i26 < i25) {
                        sb2.append((char) (o.i(aVar, iArr5, i26, iArr2) + 48));
                        for (int i28 : iArr5) {
                            i26 += i28;
                        }
                        i27++;
                    }
                }
                int i29 = o.m(aVar, i26, true, o.e, new int[5])[1];
                for (int i30 = 0; i30 < 4 && i29 < i25; i30++) {
                    sb2.append((char) (o.i(aVar, iArr5, i29, iArr2) + 48));
                    for (int i31 : iArr5) {
                        i29 += i31;
                    }
                }
                return i29;
            default:
                return ((f) this.j).k(aVar, iArr, sb2);
        }
    }

    @Override // T3.o
    public C3.j l(int i, K3.a aVar, int[] iArr, EnumMap enumMap) {
        switch (this.i) {
            case 3:
                return r(((f) this.j).l(i, aVar, iArr, enumMap));
            default:
                return super.l(i, aVar, iArr, enumMap);
        }
    }

    @Override // T3.o
    public final C3.a o() {
        switch (this.i) {
            case 0:
                return C3.a.h;
            case 1:
                return C3.a.f697p;
            case 2:
                return C3.a.f692g;
            default:
                return C3.a.f696o;
        }
    }
}
